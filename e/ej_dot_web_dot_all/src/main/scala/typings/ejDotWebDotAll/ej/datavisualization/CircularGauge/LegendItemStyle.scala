package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

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
  def apply(border: LegendItemStyleBorder = null, height: Int | Double = null, width: Int | Double = null): LegendItemStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemStyle]
  }
}

