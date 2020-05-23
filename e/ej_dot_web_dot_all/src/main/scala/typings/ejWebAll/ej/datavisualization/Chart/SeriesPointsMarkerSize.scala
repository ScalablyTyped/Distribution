package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarkerSize extends js.Object {
  /** Height of the marker.
    * @Default {6}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Width of the marker.
    * @Default {6}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesPointsMarkerSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SeriesPointsMarkerSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsMarkerSize]
  }
}

