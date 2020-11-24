package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptions extends js.Object {
  
  var dereference: js.UndefOr[Boolean] = js.native
  
  var errorOnExist: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[CopyFilterSync | CopyFilterAsync] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var preserveTimestamps: js.UndefOr[Boolean] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsOps[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
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
    def setDereference(value: Boolean): Self = this.set("dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDereference: Self = this.set("dereference", js.undefined)
    
    @scala.inline
    def setErrorOnExist(value: Boolean): Self = this.set("errorOnExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnExist: Self = this.set("errorOnExist", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* src */ String, /* dest */ String) => Boolean | js.Promise[Boolean]): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setPreserveTimestamps(value: Boolean): Self = this.set("preserveTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveTimestamps: Self = this.set("preserveTimestamps", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
