package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  def apply(color: String = null, opacity: Int | Double = null, width: Int | Double = null): ChartAreaBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAreaBorder]
  }
}

