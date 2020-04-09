package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunnelLegendItem extends BaseLegendItem {
  /** @name FunnelLegendItem.item */
  var item: js.UndefOr[dxFunnelItem] = js.undefined
}

object FunnelLegendItem {
  @scala.inline
  def apply(
    item: dxFunnelItem = null,
    marker: AnonFill = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FunnelLegendItem = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunnelLegendItem]
  }
}

