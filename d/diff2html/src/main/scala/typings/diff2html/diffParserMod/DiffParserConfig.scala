package typings.diff2html.diffParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffParserConfig extends js.Object {
  
  var dstPrefix: js.UndefOr[String] = js.native
  
  var srcPrefix: js.UndefOr[String] = js.native
}
object DiffParserConfig {
  
  @scala.inline
  def apply(): DiffParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffParserConfig]
  }
  
  @scala.inline
  implicit class DiffParserConfigOps[Self <: DiffParserConfig] (val x: Self) extends AnyVal {
    
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
    def setDstPrefix(value: String): Self = this.set("dstPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstPrefix: Self = this.set("dstPrefix", js.undefined)
    
    @scala.inline
    def setSrcPrefix(value: String): Self = this.set("srcPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcPrefix: Self = this.set("srcPrefix", js.undefined)
  }
}
