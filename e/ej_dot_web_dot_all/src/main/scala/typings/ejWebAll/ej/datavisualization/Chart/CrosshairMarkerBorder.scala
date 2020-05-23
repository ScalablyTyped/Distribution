package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairMarkerBorder extends js.Object {
  /** Border width of the marker.
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CrosshairMarkerBorder {
  @scala.inline
  def apply(width: js.UndefOr[Double] = js.undefined): CrosshairMarkerBorder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairMarkerBorder]
  }
}

