package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCalendarEventMap extends BootstrapClientEditEventMap {
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var customDisabledDate: CalendarCustomDisabledDateEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var keyDown: EditKeyEventArgs = js.native
  
  var keyPress: EditKeyEventArgs = js.native
  
  var keyUp: EditKeyEventArgs = js.native
  
  var selectionChanged: ProcessingModeEventArgs = js.native
  
  var visibleMonthChanged: ProcessingModeEventArgs = js.native
}
object BootstrapCalendarEventMap {
  
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    customDisabledDate: CalendarCustomDisabledDateEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    selectionChanged: ProcessingModeEventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs,
    visibleMonthChanged: ProcessingModeEventArgs
  ): BootstrapCalendarEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], customDisabledDate = customDisabledDate.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visibleMonthChanged = visibleMonthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCalendarEventMap]
  }
  
  @scala.inline
  implicit class BootstrapCalendarEventMapMutableBuilder[Self <: BootstrapCalendarEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDisabledDate(value: CalendarCustomDisabledDateEventArgs): Self = StObject.set(x, "customDisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleMonthChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "visibleMonthChanged", value.asInstanceOf[js.Any])
  }
}
