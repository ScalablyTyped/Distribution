package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowedCharacterCount extends js.Object {
  /** Maximum allowed characters on this layer, especially for the "copy" layer. */
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  /** Type of limitation on this layer. "limited" or "unlimited" for the "copy" layer. */
  var limitType: js.UndefOr[String] = js.undefined
  /** Remaining allowed characters on this layer, especially for the "copy" layer. */
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
}

object AllowedCharacterCount {
  @scala.inline
  def apply(
    allowedCharacterCount: js.UndefOr[Double] = js.undefined,
    limitType: String = null,
    remainingCharacterCount: js.UndefOr[Double] = js.undefined
  ): AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedCharacterCount)) __obj.updateDynamic("allowedCharacterCount")(allowedCharacterCount.get.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType.asInstanceOf[js.Any])
    if (!js.isUndefined(remainingCharacterCount)) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCharacterCount]
  }
}

