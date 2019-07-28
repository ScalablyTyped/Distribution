package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairMarkerSize extends js.Object {
  /** Height of the marker.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Width of the marker.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CrosshairMarkerSize {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): CrosshairMarkerSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairMarkerSize]
  }
}

