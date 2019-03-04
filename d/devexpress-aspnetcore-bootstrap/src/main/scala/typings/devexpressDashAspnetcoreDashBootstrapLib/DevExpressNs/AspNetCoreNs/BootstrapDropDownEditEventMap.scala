package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapDropDownEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs
  var closeUp: EventArgs
  var dropDown: EventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var queryCloseUp: CancelEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapDropDownEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    closeUp: EventArgs,
    dropDown: EventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    queryCloseUp: CancelEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapDropDownEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick, closeUp = closeUp, dropDown = dropDown, gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, queryCloseUp = queryCloseUp, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapDropDownEditEventMap]
  }
}

