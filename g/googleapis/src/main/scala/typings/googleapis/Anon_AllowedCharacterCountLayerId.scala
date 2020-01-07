package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AllowedCharacterCountLayerId extends js.Object {
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  var layerId: js.UndefOr[String] = js.native
  var limitType: js.UndefOr[String] = js.native
  var remainingCharacterCount: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[String] = js.native
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
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType.asInstanceOf[js.Any])
    if (remainingCharacterCount != null) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedCharacterCountLayerId]
  }
}

