package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsConnectorLine extends js.Object {
  /** Color of the connector line.
    * @Default {#565656}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** DashArray of the connector line.
    * @Default {null}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** DashArray of the connector line.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of the connector line.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsConnectorLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashArray: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): CommonSeriesOptionsConnectorLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsConnectorLine]
  }
}

