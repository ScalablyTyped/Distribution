package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforePasteEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** returns the key pressed key code value
    */
  var keyCode: js.UndefOr[Double] = js.native
  
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.native
  
  /** returns the target element, the given node to be pasted
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object BeforePasteEventArgs {
  
  @scala.inline
  def apply(): BeforePasteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforePasteEventArgs]
  }
  
  @scala.inline
  implicit class BeforePasteEventArgsOps[Self <: BeforePasteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNodeDetails(value: js.Any): Self = this.set("nodeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDetails: Self = this.set("nodeDetails", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
