package typings.editorconfig.mod

import typings.editorconfig.iniMod.ParseStringResult
import typings.editorconfig.iniMod.SectionBody
import typings.editorconfig.iniMod.SectionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConfig extends js.Object {
  
  var contents: ParseStringResult = js.native
  
  var name: String = js.native
}
object FileConfig {
  
  @scala.inline
  def apply(contents: ParseStringResult, name: String): FileConfig = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
  
  @scala.inline
  implicit class FileConfigOps[Self <: FileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentsVarargs(value: (js.Tuple2[SectionName, SectionBody])*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: ParseStringResult): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
