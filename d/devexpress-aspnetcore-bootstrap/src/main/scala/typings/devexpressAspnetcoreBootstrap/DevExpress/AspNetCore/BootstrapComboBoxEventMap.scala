package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], buttonClick = buttonClick.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], customHighlighting = customHighlighting.asInstanceOf[js.Any], dropDown = dropDown.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemFiltering = itemFiltering.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], queryCloseUp = queryCloseUp.asInstanceOf[js.Any], selectedIndexChanged = selectedIndexChanged.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapComboBoxEventMap]
  }
}

