package typings.ejWebAll.ej.datavisualization.Chart

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
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): CrosshairMarkerSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairMarkerSize]
  }
}

