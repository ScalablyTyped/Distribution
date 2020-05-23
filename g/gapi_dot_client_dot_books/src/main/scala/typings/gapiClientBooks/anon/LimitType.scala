package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitType extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  var limitType: js.UndefOr[String] = js.undefined
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object LimitType {
  @scala.inline
  def apply(
    allowedCharacterCount: js.UndefOr[Double] = js.undefined,
    limitType: String = null,
    remainingCharacterCount: js.UndefOr[Double] = js.undefined,
    updated: String = null
  ): LimitType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedCharacterCount)) __obj.updateDynamic("allowedCharacterCount")(allowedCharacterCount.get.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType.asInstanceOf[js.Any])
    if (!js.isUndefined(remainingCharacterCount)) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.get.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitType]
  }
}

