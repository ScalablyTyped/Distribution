package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerId extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  var layerId: js.UndefOr[String] = js.undefined
  var limitType: js.UndefOr[String] = js.undefined
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object LayerId {
  @scala.inline
  def apply(
    allowedCharacterCount: js.UndefOr[Double] = js.undefined,
    layerId: String = null,
    limitType: String = null,
    remainingCharacterCount: js.UndefOr[Double] = js.undefined,
    updated: String = null
  ): LayerId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedCharacterCount)) __obj.updateDynamic("allowedCharacterCount")(allowedCharacterCount.get.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType.asInstanceOf[js.Any])
    if (!js.isUndefined(remainingCharacterCount)) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.get.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerId]
  }
}

