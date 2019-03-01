package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapComboBoxEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs
  var buttonClick: ButtonEditClickEventArgs
  var callbackError: CallbackErrorEventArgs
  var closeUp: EventArgs
  var customHighlighting: ListEditCustomHighlightingEventArgs
  var dropDown: EventArgs
  var endCallback: EndCallbackEventArgs
  var itemFiltering: ListEditItemFilteringEventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var queryCloseUp: CancelEventArgs
  var selectedIndexChanged: ProcessingModeEventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapComboBoxEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    buttonClick: ButtonEditClickEventArgs,
    callbackError: CallbackErrorEventArgs,
    closeUp: EventArgs,
    customHighlighting: ListEditCustomHighlightingEventArgs,
    dropDown: EventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    itemFiltering: ListEditItemFilteringEventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    queryCloseUp: CancelEventArgs,
    selectedIndexChanged: ProcessingModeEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapComboBoxEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("buttonClick")(buttonClick)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("closeUp")(closeUp)
    __obj.updateDynamic("customHighlighting")(customHighlighting)
    __obj.updateDynamic("dropDown")(dropDown)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("itemFiltering")(itemFiltering)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("queryCloseUp")(queryCloseUp)
    __obj.updateDynamic("selectedIndexChanged")(selectedIndexChanged)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("userInput")(userInput)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapComboBoxEventMap]
  }
}

