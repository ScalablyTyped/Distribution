package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesRangesBorder extends js.Object {
  /** Specify border color for ranges of circular gauge
    * @Default {#32b3c6}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify border width for ranges of circular gauge
    * @Default {1.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesRangesBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): ScalesRangesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesRangesBorder]
  }
}

