package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogAction extends js.Object {
  
  /** Once uploaded successfully, the dialog popup closes immediately.
    */
  var closeOnComplete: js.UndefOr[Boolean] = js.native
  
  /** Sets the content container option to the Uploadbox dialog popup.
    */
  var content: js.UndefOr[String] = js.native
  
  /** Enables the drag option to the dialog popup.
    */
  var drag: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the Uploadbox dialogâ€™s modal property to the dialog popup.
    */
  var modal: js.UndefOr[Boolean] = js.native
}
object DialogAction {
  
  @scala.inline
  def apply(): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit class DialogActionOps[Self <: DialogAction] (val x: Self) extends AnyVal {
    
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
    def setCloseOnComplete(value: Boolean): Self = this.set("closeOnComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnComplete: Self = this.set("closeOnComplete", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
  }
}
