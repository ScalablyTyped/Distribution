package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesAlternateGridBandEven extends js.Object {
  /** Fill color for the even grid bands.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Opacity of the even grid band.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object AxesAlternateGridBandEven {
  @scala.inline
  def apply(fill: String = null, opacity: js.UndefOr[Double] = js.undefined): AxesAlternateGridBandEven = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesAlternateGridBandEven]
  }
}

