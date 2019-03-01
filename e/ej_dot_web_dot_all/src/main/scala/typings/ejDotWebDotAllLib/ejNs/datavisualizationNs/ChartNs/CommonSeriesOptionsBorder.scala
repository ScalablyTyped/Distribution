package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsBorder extends js.Object {
  /** Border color of all series.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** DashArray for border of the series.
    * @Default {null}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Border width of all series.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashArray: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): CommonSeriesOptionsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsBorder]
  }
}

