package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemStyle extends js.Object {
  /** Options for customizing the border of legend items.
    */
  var border: js.UndefOr[LegendItemStyleBorder] = js.undefined
  /** Height of the shape in legend items.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Width of the shape in legend items.
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

