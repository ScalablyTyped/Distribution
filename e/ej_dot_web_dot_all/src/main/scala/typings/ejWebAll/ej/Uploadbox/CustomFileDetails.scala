package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFileDetails extends js.Object {
  
  /** Enables the file upload interactions like remove/cancel in File details of the dialog popup.
    */
  var action: js.UndefOr[Boolean] = js.native
  
  /** Enables the name in the File details of the dialog popup.
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the File size details of the dialog popup.
    */
  var size: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the file uploading status visibility in the dialog file details content.
    */
  var status: js.UndefOr[Boolean] = js.native
  
  /** Enables the title in File details for the dialog popup.
    */
  var title: js.UndefOr[Boolean] = js.native
}
object CustomFileDetails {
  
  @scala.inline
  def apply(): CustomFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFileDetails]
  }
  
  @scala.inline
  implicit class CustomFileDetailsOps[Self <: CustomFileDetails] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Boolean): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
