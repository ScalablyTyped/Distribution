package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorMapLegendItem extends BaseLegendItem {
  /** The color of the legend item's marker. */
  var color: js.UndefOr[String] = js.undefined
  /** The end value of the group that the legend item indicates. */
  var end: js.UndefOr[Double] = js.undefined
  /** The diameter of the legend item's marker in pixels. */
  var size: js.UndefOr[Double] = js.undefined
  /** The start value of the group that the legend item indicates. */
  var start: js.UndefOr[Double] = js.undefined
}

object VectorMapLegendItem {
  @scala.inline
  def apply(
    color: String = null,
    end: Int | Double = null,
    marker: AnonFill = null,
    size: Int | Double = null,
    start: Int | Double = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): VectorMapLegendItem = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorMapLegendItem]
  }
}

