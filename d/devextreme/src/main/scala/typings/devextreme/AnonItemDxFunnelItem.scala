package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemDxFunnelItem extends js.Object {
  var item: js.UndefOr[dxFunnelItem] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonItemDxFunnelItem {
  @scala.inline
  def apply(item: dxFunnelItem = null, text: String = null): AnonItemDxFunnelItem = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemDxFunnelItem]
  }
}

