package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarGaugeLegendItem extends BaseLegendItem {
  /** The bar that the legend item represents. */
  var item: js.UndefOr[BarGaugeBarInfo] = js.undefined
}

object BarGaugeLegendItem {
  @scala.inline
  def apply(
    item: BarGaugeBarInfo = null,
    marker: AnonFill = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BarGaugeLegendItem = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarGaugeLegendItem]
  }
}

