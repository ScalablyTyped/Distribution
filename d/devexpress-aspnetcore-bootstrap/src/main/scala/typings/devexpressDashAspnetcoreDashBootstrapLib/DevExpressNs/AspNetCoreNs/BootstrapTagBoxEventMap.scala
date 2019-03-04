package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTagBoxEventMap extends BootstrapClientEditEventMap {
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
  var tagsChanged: EventArgs
  var textChanged: ProcessingModeEventArgs
  var userInput: EventArgs
}

object BootstrapTagBoxEventMap {
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
    tagsChanged: EventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapTagBoxEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, buttonClick = buttonClick, callbackError = callbackError, closeUp = closeUp, customHighlighting = customHighlighting, dropDown = dropDown, endCallback = endCallback, gotFocus = gotFocus, init = init, itemFiltering = itemFiltering, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, queryCloseUp = queryCloseUp, selectedIndexChanged = selectedIndexChanged, tagsChanged = tagsChanged, textChanged = textChanged, userInput = userInput, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapTagBoxEventMap]
  }
}

