package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerSize extends js.Object {
  /** Height of the marker.
    * @Default {6}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Width of the marker.
    * @Default {6}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CommonSeriesOptionsMarkerSize {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): CommonSeriesOptionsMarkerSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsMarkerSize]
  }
}

