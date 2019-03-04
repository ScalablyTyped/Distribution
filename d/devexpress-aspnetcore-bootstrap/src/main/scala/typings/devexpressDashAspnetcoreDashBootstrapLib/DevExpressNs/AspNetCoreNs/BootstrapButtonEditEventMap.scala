package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapButtonEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapButtonEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapButtonEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick, gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapButtonEditEventMap]
  }
}

