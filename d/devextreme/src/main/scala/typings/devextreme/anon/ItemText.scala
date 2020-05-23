package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.BarGaugeBarInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemText extends js.Object {
  var item: js.UndefOr[BarGaugeBarInfo] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ItemText {
  @scala.inline
  def apply(item: BarGaugeBarInfo = null, text: String = null): ItemText = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemText]
  }
}

