package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(buttonClick = buttonClick, calendarCustomDisabledDate = calendarCustomDisabledDate, closeUp = closeUp, dateChanged = dateChanged, dropDown = dropDown, gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, parseDate = parseDate, queryCloseUp = queryCloseUp, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapDateEditEventMap]
  }
}

