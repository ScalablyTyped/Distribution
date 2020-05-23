package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorMapLegendItem extends BaseLegendItem {
  /** @name VectorMapLegendItem.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name VectorMapLegendItem.end */
  var end: js.UndefOr[Double] = js.undefined
  /** @name VectorMapLegendItem.size */
  var size: js.UndefOr[Double] = js.undefined
  /** @name VectorMapLegendItem.start */
  var start: js.UndefOr[Double] = js.undefined
}

object VectorMapLegendItem {
  @scala.inline
  def apply(
    color: String = null,
    end: js.UndefOr[Double] = js.undefined,
    marker: Fill = null,
    size: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): VectorMapLegendItem = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorMapLegendItem]
  }
}

