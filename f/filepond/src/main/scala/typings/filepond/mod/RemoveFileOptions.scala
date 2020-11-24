package typings.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFileOptions extends js.Object {
  
  var remove: js.UndefOr[Boolean] = js.native
  
  var revert: js.UndefOr[Boolean] = js.native
}
object RemoveFileOptions {
  
  @scala.inline
  def apply(): RemoveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFileOptions]
  }
  
  @scala.inline
  implicit class RemoveFileOptionsOps[Self <: RemoveFileOptions] (val x: Self) extends AnyVal {
    
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
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
  }
}
