package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbideOptions extends js.Object {
  var error_labels: js.UndefOr[Boolean] = js.undefined
  var focus_on_invalid: js.UndefOr[Boolean] = js.undefined
  var live_validate: js.UndefOr[Boolean] = js.undefined
  var patterns: js.UndefOr[AbidePatterns] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var validate_on_blur: js.UndefOr[Boolean] = js.undefined
  var validators: js.UndefOr[js.Object] = js.undefined
}

object AbideOptions {
  @scala.inline
  def apply(
    error_labels: js.UndefOr[Boolean] = js.undefined,
    focus_on_invalid: js.UndefOr[Boolean] = js.undefined,
    live_validate: js.UndefOr[Boolean] = js.undefined,
    patterns: AbidePatterns = null,
    timeout: Int | Double = null,
    validate_on_blur: js.UndefOr[Boolean] = js.undefined,
    validators: js.Object = null
  ): AbideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_labels)) __obj.updateDynamic("error_labels")(error_labels)
    if (!js.isUndefined(focus_on_invalid)) __obj.updateDynamic("focus_on_invalid")(focus_on_invalid)
    if (!js.isUndefined(live_validate)) __obj.updateDynamic("live_validate")(live_validate)
    if (patterns != null) __obj.updateDynamic("patterns")(patterns)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(validate_on_blur)) __obj.updateDynamic("validate_on_blur")(validate_on_blur)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[AbideOptions]
  }
}

