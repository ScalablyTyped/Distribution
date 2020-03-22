package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegendItem extends js.Object {
  /** A legend item marker. */
  var marker: js.UndefOr[AnonFill] = js.undefined
  /** The text that the legend item displays. */
  var text: js.UndefOr[String] = js.undefined
  /** Indicates and specifies whether the legend item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BaseLegendItem {
  @scala.inline
  def apply(marker: AnonFill = null, text: String = null, visible: js.UndefOr[Boolean] = js.undefined): BaseLegendItem = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLegendItem]
  }
}

