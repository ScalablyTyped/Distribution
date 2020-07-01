package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedCharacterCount extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  var limitType: js.UndefOr[String] = js.native
  var remainingCharacterCount: js.UndefOr[Double] = js.native
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

