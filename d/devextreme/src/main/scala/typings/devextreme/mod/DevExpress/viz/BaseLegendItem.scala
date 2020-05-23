package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegendItem extends js.Object {
  /** @name BaseLegendItem.marker */
  var marker: js.UndefOr[Fill] = js.undefined
  /** @name BaseLegendItem.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name BaseLegendItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BaseLegendItem {
  @scala.inline
  def apply(marker: Fill = null, text: String = null, visible: js.UndefOr[Boolean] = js.undefined): BaseLegendItem = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLegendItem]
  }
}

