package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("customHighlighting")(customHighlighting)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("gotFocus")(gotFocus)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("itemDoubleClick")(itemDoubleClick)
    __obj.updateDynamic("itemFiltering")(itemFiltering)
    __obj.updateDynamic("keyDown")(keyDown)
    __obj.updateDynamic("keyPress")(keyPress)
    __obj.updateDynamic("keyUp")(keyUp)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.updateDynamic("selectedIndexChanged")(selectedIndexChanged)
    __obj.updateDynamic("validation")(validation)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[BootstrapListBoxEventMap]
  }
}

