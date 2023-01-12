package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-event
  /**
    * whether an Alt key was used in an accelerator to trigger the Event
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether the Control key was used in an accelerator to trigger the Event
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether a meta key was used in an accelerator to trigger the Event
    */
  var metaKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether a Shift key was used in an accelerator to trigger the Event
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether an accelerator was used to trigger the event as opposed to another user
    * gesture like mouse click
    */
  var triggeredByAccelerator: js.UndefOr[Boolean] = js.undefined
}
object KeyboardEvent {
  
  inline def apply(): KeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    inline def setTriggeredByAccelerator(value: Boolean): Self = StObject.set(x, "triggeredByAccelerator", value.asInstanceOf[js.Any])
    
    inline def setTriggeredByAcceleratorUndefined: Self = StObject.set(x, "triggeredByAccelerator", js.undefined)
  }
}
