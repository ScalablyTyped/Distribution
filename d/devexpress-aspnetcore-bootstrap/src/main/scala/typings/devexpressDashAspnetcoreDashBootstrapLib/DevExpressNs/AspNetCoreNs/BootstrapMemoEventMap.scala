package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMemoEventMap extends BootstrapClientEditEventMap {
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapMemoEventMap {
  @scala.inline
  def apply(
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
  ): BootstrapMemoEventMap = {
    val __obj = js.Dynamic.literal(gotFocus = gotFocus, init = init, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapMemoEventMap]
  }
}

