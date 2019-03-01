package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorsLowerLine extends js.Object {
  /** Color of lower line.
    * @Default {#008000}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the lower line.
    * @Default {2}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IndicatorsLowerLine {
  @scala.inline
  def apply(fill: java.lang.String = null, width: scala.Int | scala.Double = null): IndicatorsLowerLine = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsLowerLine]
  }
}

