package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedCharacterCountLayerId extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  var layerId: js.UndefOr[String] = js.undefined
  var limitType: js.UndefOr[String] = js.undefined
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object Anon_AllowedCharacterCountLayerId {
  @scala.inline
  def apply(
    allowedCharacterCount: Int | Double = null,
    layerId: String = null,
    limitType: String = null,
    remainingCharacterCount: Int | Double = null,
    updated: String = null
  ): Anon_AllowedCharacterCountLayerId = {
    val __obj = js.Dynamic.literal()
    if (allowedCharacterCount != null) __obj.updateDynamic("allowedCharacterCount")(allowedCharacterCount.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (limitType != null) __obj.updateDynamic("limitType")(limitType)
    if (remainingCharacterCount != null) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Anon_AllowedCharacterCountLayerId]
  }
}

