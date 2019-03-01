package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLineSettings extends js.Object {
  /** Color of the axis line.
    * @Default {'#111111'}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Dash array of the axis line.
    * @Default {1}
    */
  var dashArray: js.UndefOr[scala.Double] = js.undefined
  /** Controls the visibility of the axis.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the axis line.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AxisLineSettings {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashArray: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): AxisLineSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLineSettings]
  }
}

