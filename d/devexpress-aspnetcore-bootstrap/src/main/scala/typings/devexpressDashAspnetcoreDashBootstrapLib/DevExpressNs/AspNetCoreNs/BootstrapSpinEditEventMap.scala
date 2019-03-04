package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSpinEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var numberChanged: ProcessingModeEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapSpinEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    numberChanged: ProcessingModeEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapSpinEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick, gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, numberChanged = numberChanged, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapSpinEditEventMap]
  }
}

