package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesEmptyPointSettingsStyle extends js.Object {
  /** Options for customizing border of the empty point in the series.
    */
  var border: js.UndefOr[SeriesEmptyPointSettingsStyleBorder] = js.undefined
  /** Color of the empty point.
    */
  var color: js.UndefOr[String] = js.undefined
}

object SeriesEmptyPointSettingsStyle {
  @scala.inline
  def apply(border: SeriesEmptyPointSettingsStyleBorder = null, color: String = null): SeriesEmptyPointSettingsStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[SeriesEmptyPointSettingsStyle]
  }
}

