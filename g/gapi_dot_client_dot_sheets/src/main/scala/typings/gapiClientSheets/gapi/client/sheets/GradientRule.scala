package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientRule extends js.Object {
  /** The final interpolation point. */
  var maxpoint: js.UndefOr[InterpolationPoint] = js.undefined
  /** An optional midway interpolation point. */
  var midpoint: js.UndefOr[InterpolationPoint] = js.undefined
  /** The starting interpolation point. */
  var minpoint: js.UndefOr[InterpolationPoint] = js.undefined
}

object GradientRule {
  @scala.inline
  def apply(
    maxpoint: InterpolationPoint = null,
    midpoint: InterpolationPoint = null,
    minpoint: InterpolationPoint = null
  ): GradientRule = {
    val __obj = js.Dynamic.literal()
    if (maxpoint != null) __obj.updateDynamic("maxpoint")(maxpoint.asInstanceOf[js.Any])
    if (midpoint != null) __obj.updateDynamic("midpoint")(midpoint.asInstanceOf[js.Any])
    if (minpoint != null) __obj.updateDynamic("minpoint")(minpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientRule]
  }
}

