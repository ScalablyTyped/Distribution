package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEvent extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-event
  /**
    * whether an Alt key was used in an accelerator to trigger the Event
    */
  var altKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether the Control key was used in an accelerator to trigger the Event
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether a meta key was used in an accelerator to trigger the Event
    */
  var metaKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether a Shift key was used in an accelerator to trigger the Event
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether an accelerator was used to trigger the event as opposed to another user
    * gesture like mouse click
    */
  var triggeredByAccelerator: js.UndefOr[Boolean] = js.native
}
object KeyboardEvent {
  
  @scala.inline
  def apply(): KeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    
    @scala.inline
    def setTriggeredByAccelerator(value: Boolean): Self = this.set("triggeredByAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggeredByAccelerator: Self = this.set("triggeredByAccelerator", js.undefined)
  }
}
