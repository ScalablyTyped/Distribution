package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedCharacterCountLayerId extends js.Object {
  var allowedCharacterCount: js.UndefOr[scala.Double] = js.undefined
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  var limitType: js.UndefOr[java.lang.String] = js.undefined
  var remainingCharacterCount: js.UndefOr[scala.Double] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllowedCharacterCountLayerId {
  @scala.inline
  def apply(
    allowedCharacterCount: scala.Int | scala.Double = null,
    layerId: java.lang.String = null,
    limitType: java.lang.String = null,
    remainingCharacterCount: scala.Int | scala.Double = null,
    updated: java.lang.String = null
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

