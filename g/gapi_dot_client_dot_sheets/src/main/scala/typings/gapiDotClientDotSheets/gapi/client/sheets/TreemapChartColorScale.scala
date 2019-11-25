package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not
    * specified.
    */
  var maxValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and
    * maxValue. Defaults to #efe6dc if not
    * specified.
    */
  var midValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not
    * specified.
    */
  var minValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[Color] = js.undefined
}

object TreemapChartColorScale {
  @scala.inline
  def apply(
    maxValueColor: Color = null,
    midValueColor: Color = null,
    minValueColor: Color = null,
    noDataColor: Color = null
  ): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    if (maxValueColor != null) __obj.updateDynamic("maxValueColor")(maxValueColor.asInstanceOf[js.Any])
    if (midValueColor != null) __obj.updateDynamic("midValueColor")(midValueColor.asInstanceOf[js.Any])
    if (minValueColor != null) __obj.updateDynamic("minValueColor")(minValueColor.asInstanceOf[js.Any])
    if (noDataColor != null) __obj.updateDynamic("noDataColor")(noDataColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapChartColorScale]
  }
}

