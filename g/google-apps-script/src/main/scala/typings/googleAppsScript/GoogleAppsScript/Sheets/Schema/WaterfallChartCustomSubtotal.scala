package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartCustomSubtotal extends js.Object {
  var dataIsSubtotal: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var subtotalIndex: js.UndefOr[Double] = js.undefined
}

object WaterfallChartCustomSubtotal {
  @scala.inline
  def apply(
    dataIsSubtotal: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    subtotalIndex: Int | Double = null
  ): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataIsSubtotal)) __obj.updateDynamic("dataIsSubtotal")(dataIsSubtotal.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (subtotalIndex != null) __obj.updateDynamic("subtotalIndex")(subtotalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
}

