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
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[BootstrapMemoEventMap]
  }
}

