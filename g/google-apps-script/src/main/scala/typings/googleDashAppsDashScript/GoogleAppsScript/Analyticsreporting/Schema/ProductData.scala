package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductData extends js.Object {
  var itemRevenue: js.UndefOr[Double] = js.undefined
  var productName: js.UndefOr[String] = js.undefined
  var productQuantity: js.UndefOr[String] = js.undefined
  var productSku: js.UndefOr[String] = js.undefined
}

object ProductData {
  @scala.inline
  def apply(
    itemRevenue: Int | Double = null,
    productName: String = null,
    productQuantity: String = null,
    productSku: String = null
  ): ProductData = {
    val __obj = js.Dynamic.literal()
    if (itemRevenue != null) __obj.updateDynamic("itemRevenue")(itemRevenue.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (productQuantity != null) __obj.updateDynamic("productQuantity")(productQuantity.asInstanceOf[js.Any])
    if (productSku != null) __obj.updateDynamic("productSku")(productSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductData]
  }
}

