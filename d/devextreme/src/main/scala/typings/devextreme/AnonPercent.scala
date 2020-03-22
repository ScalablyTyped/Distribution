package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPercent extends js.Object {
  var item: js.UndefOr[dxFunnelItem] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var percentText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonPercent {
  @scala.inline
  def apply(
    item: dxFunnelItem = null,
    percent: Int | Double = null,
    percentText: String = null,
    value: Int | Double = null,
    valueText: String = null
  ): AnonPercent = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (percentText != null) __obj.updateDynamic("percentText")(percentText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPercent]
  }
}

