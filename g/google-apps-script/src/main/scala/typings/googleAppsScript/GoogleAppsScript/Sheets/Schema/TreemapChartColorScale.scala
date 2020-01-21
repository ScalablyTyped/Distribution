package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapChartColorScale extends js.Object {
  var maxValueColor: js.UndefOr[Color] = js.undefined
  var midValueColor: js.UndefOr[Color] = js.undefined
  var minValueColor: js.UndefOr[Color] = js.undefined
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

