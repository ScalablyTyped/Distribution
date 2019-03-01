package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisAxisLine extends js.Object {
  /** Color of axis line.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Pattern of dashes and gaps to be applied to the axis line.
    * @Default {null}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
    * @Default {null}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Show/hides the axis line.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of axis line.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PrimaryYAxisAxisLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashArray: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): PrimaryYAxisAxisLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisAxisLine]
  }
}

