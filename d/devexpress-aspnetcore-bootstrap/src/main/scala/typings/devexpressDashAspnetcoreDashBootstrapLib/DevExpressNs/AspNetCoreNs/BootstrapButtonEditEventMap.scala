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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonClick")(buttonClick)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("userInput")(userInput)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapButtonEditEventMap]
  }
}

