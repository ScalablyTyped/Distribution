package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapDateEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs
  var calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs
  var closeUp: EventArgs
  var dateChanged: ProcessingModeEventArgs
  var dropDown: EventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var parseDate: ParseDateEventArgs
  var queryCloseUp: CancelEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapDateEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs,
    closeUp: EventArgs,
    dateChanged: ProcessingModeEventArgs,
    dropDown: EventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    parseDate: ParseDateEventArgs,
    queryCloseUp: CancelEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapDateEditEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonClick")(buttonClick)
    __obj.updateDynamic("calendarCustomDisabledDate")(calendarCustomDisabledDate)
    __obj.updateDynamic("closeUp")(closeUp)
    __obj.updateDynamic("dateChanged")(dateChanged)
    __obj.updateDynamic("dropDown")(dropDown)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("parseDate")(parseDate)
    __obj.updateDynamic("queryCloseUp")(queryCloseUp)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("userInput")(userInput)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapDateEditEventMap]
  }
}

