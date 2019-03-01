package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerBorder extends js.Object {
  /** Border color of the marker shape.
    * @Default {white}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Border width of the marker shape.
    * @Default {3}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsMarkerBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): CommonSeriesOptionsMarkerBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerBorder]
  }
}

