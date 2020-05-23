package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAreaBorder extends js.Object {
  /** Border color of the plot area.
    * @Default {Gray}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity of the plot area border.
    * @Default {0.3}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Border width of the plot area.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartAreaBorder {
  @scala.inline
  def apply(
    color: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ChartAreaBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAreaBorder]
  }
}

