package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    if (maxValueColor != null) __obj.updateDynamic("maxValueColor")(maxValueColor)
    if (midValueColor != null) __obj.updateDynamic("midValueColor")(midValueColor)
    if (minValueColor != null) __obj.updateDynamic("minValueColor")(minValueColor)
    if (noDataColor != null) __obj.updateDynamic("noDataColor")(noDataColor)
    __obj.asInstanceOf[TreemapChartColorScale]
  }
}

