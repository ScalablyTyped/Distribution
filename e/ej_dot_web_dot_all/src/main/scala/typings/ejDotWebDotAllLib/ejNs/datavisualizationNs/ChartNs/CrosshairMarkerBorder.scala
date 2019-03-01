package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairMarkerBorder extends js.Object {
  /** Border width of the marker.
    * @Default {3}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CrosshairMarkerBorder {
  @scala.inline
  def apply(width: scala.Int | scala.Double = null): CrosshairMarkerBorder = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairMarkerBorder]
  }
}

