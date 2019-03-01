package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("customDisabledDate")(customDisabledDate)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.updateDynamic("visibleMonthChanged")(visibleMonthChanged)
    __obj.asInstanceOf[BootstrapCalendarEventMap]
  }
}

