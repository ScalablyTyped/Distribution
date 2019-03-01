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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonClick")(buttonClick)
    __obj.updateDynamic("closeUp")(closeUp)
    __obj.updateDynamic("dropDown")(dropDown)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("queryCloseUp")(queryCloseUp)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("userInput")(userInput)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapDropDownEditEventMap]
  }
}

