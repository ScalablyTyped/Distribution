package typings.fsJetpack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends js.Object {
  
  var directories: js.UndefOr[Boolean] = js.native
  
  var files: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var matching: js.UndefOr[String | js.Array[String]] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectories(value: Boolean): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setFiles(value: Boolean): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setMatchingVarargs(value: String*): Self = this.set("matching", js.Array(value :_*))
    
    @scala.inline
    def setMatching(value: String | js.Array[String]): Self = this.set("matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching: Self = this.set("matching", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
