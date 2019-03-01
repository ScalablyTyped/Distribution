package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesMinorGridLines extends js.Object {
  /** Patterns of dashes and gaps used to stroke the minor grid lines.
    * @Default {null}
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Show/hides the minor grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the minorGridLines.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AxesMinorGridLines {
  @scala.inline
  def apply(
    dashArray: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): AxesMinorGridLines = {
    val __obj = js.Dynamic.literal()
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesMinorGridLines]
  }
}

