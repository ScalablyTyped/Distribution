package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Percent extends js.Object {
  var item: js.UndefOr[dxFunnelItem] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var percentText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object Percent {
  @scala.inline
  def apply(
    item: dxFunnelItem = null,
    percent: js.UndefOr[Double] = js.undefined,
    percentText: String = null,
    value: js.UndefOr[Double] = js.undefined,
    valueText: String = null
  ): Percent = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (percentText != null) __obj.updateDynamic("percentText")(percentText.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percent]
  }
}

