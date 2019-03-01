package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesHighlightSettingsBorder extends js.Object {
  /** Border color of the series/point on highlight.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Border width of the series/point on highlight.
    * @Default {2}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SeriesHighlightSettingsBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: java.lang.String = null): SeriesHighlightSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SeriesHighlightSettingsBorder]
  }
}

