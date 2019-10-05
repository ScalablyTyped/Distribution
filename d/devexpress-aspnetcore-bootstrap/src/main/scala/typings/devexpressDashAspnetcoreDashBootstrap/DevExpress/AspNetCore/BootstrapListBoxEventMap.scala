package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapListBoxEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var customHighlighting: ListEditCustomHighlightingEventArgs
  var endCallback: EndCallbackEventArgs
  var itemDoubleClick: EventArgs
  var itemFiltering: ListEditItemFilteringEventArgs
  var keyDown: EditKeyEventArgs
  var keyPress: EditKeyEventArgs
  var keyUp: EditKeyEventArgs
  var selectedIndexChanged: ProcessingModeEventArgs
}

object BootstrapListBoxEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    customHighlighting: ListEditCustomHighlightingEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    itemDoubleClick: EventArgs,
    itemFiltering: ListEditItemFilteringEventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    selectedIndexChanged: ProcessingModeEventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapListBoxEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, callbackError = callbackError, customHighlighting = customHighlighting, endCallback = endCallback, gotFocus = gotFocus, init = init, itemDoubleClick = itemDoubleClick, itemFiltering = itemFiltering, keyDown = keyDown, keyPress = keyPress, keyUp = keyUp, lostFocus = lostFocus, selectedIndexChanged = selectedIndexChanged, validation = validation, valueChanged = valueChanged)
  
    __obj.asInstanceOf[BootstrapListBoxEventMap]
  }
}

