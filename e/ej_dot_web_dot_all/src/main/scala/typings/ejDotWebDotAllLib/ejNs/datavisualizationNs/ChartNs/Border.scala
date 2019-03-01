package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** Border color of the chart.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the chart border.
    * @Default {0.3}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of the Chart border.
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

