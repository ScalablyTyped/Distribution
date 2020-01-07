package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that applies a gradient color scale format, based on the
  * interpolation points listed. The format of a cell will vary based on its
  * contents as compared to the values of the interpolation points.
  */
@js.native
trait Schema$GradientRule extends js.Object {
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[Schema$InterpolationPoint] = js.native
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[Schema$InterpolationPoint] = js.native
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[Schema$InterpolationPoint] = js.native
}

object Schema$GradientRule {
  @scala.inline
  def apply(
    maxpoint: Schema$InterpolationPoint = null,
    midpoint: Schema$InterpolationPoint = null,
    minpoint: Schema$InterpolationPoint = null
  ): Schema$GradientRule = {
    val __obj = js.Dynamic.literal()
    if (maxpoint != null) __obj.updateDynamic("maxpoint")(maxpoint.asInstanceOf[js.Any])
    if (midpoint != null) __obj.updateDynamic("midpoint")(midpoint.asInstanceOf[js.Any])
    if (minpoint != null) __obj.updateDynamic("minpoint")(minpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GradientRule]
  }
}

