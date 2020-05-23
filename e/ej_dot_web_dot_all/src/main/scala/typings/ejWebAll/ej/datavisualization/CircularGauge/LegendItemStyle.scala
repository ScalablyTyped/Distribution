package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemStyle extends js.Object {
  /** Options for customizing the border of legend items.
    */
  var border: js.UndefOr[LegendItemStyleBorder] = js.undefined
  /** Specifies the height of the  legend item shapes.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the  legend item shapes.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LegendItemStyle {
  @scala.inline
  def apply(
    border: LegendItemStyleBorder = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): LegendItemStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemStyle]
  }
}

