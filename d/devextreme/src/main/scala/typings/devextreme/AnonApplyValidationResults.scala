package typings.devextreme

import typings.devextreme.mod._Global_.JQueryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyValidationResults extends js.Object {
  var applyValidationResults: js.UndefOr[js.Function] = js.undefined
  var bypass: js.UndefOr[js.Function] = js.undefined
  var focus: js.UndefOr[js.Function] = js.undefined
  var getValue: js.UndefOr[js.Function] = js.undefined
  var reset: js.UndefOr[js.Function] = js.undefined
  var validationRequestsCallbacks: js.UndefOr[js.Array[js.Function] | JQueryCallback] = js.undefined
}

object AnonApplyValidationResults {
  @scala.inline
  def apply(
    applyValidationResults: js.Function = null,
    bypass: js.Function = null,
    focus: js.Function = null,
    getValue: js.Function = null,
    reset: js.Function = null,
    validationRequestsCallbacks: js.Array[js.Function] | JQueryCallback = null
  ): AnonApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    if (applyValidationResults != null) __obj.updateDynamic("applyValidationResults")(applyValidationResults.asInstanceOf[js.Any])
    if (bypass != null) __obj.updateDynamic("bypass")(bypass.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(getValue.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (validationRequestsCallbacks != null) __obj.updateDynamic("validationRequestsCallbacks")(validationRequestsCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplyValidationResults]
  }
}

