package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapCalendarEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var customDisabledDate: CalendarCustomDisabledDateEventArgs
  var endCallback: EndCallbackEventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var selectionChanged: ProcessingModeEventArgs
  var visibleMonthChanged: ProcessingModeEventArgs
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
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, callbackError = callbackError, customDisabledDate = customDisabledDate, endCallback = endCallback, gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, selectionChanged = selectionChanged, validation = validation, valueChanged = valueChanged, visibleMonthChanged = visibleMonthChanged)
  
    __obj.asInstanceOf[BootstrapCalendarEventMap]
  }
}

