package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineEditValidationEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the current node element id
    */
  var id: js.UndefOr[js.Any] = js.native
  
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the new entered text for the node
    */
  var newText: js.UndefOr[String] = js.native
  
  /** returns the old node text
    */
  var oldText: js.UndefOr[String] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object InlineEditValidationEventArgs {
  
  @scala.inline
  def apply(): InlineEditValidationEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineEditValidationEventArgs]
  }
  
  @scala.inline
  implicit class InlineEditValidationEventArgsOps[Self <: InlineEditValidationEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewText: Self = this.set("newText", js.undefined)
    
    @scala.inline
    def setOldText(value: String): Self = this.set("oldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldText: Self = this.set("oldText", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
