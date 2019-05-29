package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductData extends js.Object {
  var itemRevenue: js.UndefOr[scala.Double] = js.undefined
  var productName: js.UndefOr[java.lang.String] = js.undefined
  var productQuantity: js.UndefOr[java.lang.String] = js.undefined
  var productSku: js.UndefOr[java.lang.String] = js.undefined
}

object ProductData {
  @scala.inline
  def apply(
    itemRevenue: scala.Int | scala.Double = null,
    productName: java.lang.String = null,
    productQuantity: java.lang.String = null,
    productSku: java.lang.String = null
  ): ProductData = {
    val __obj = js.Dynamic.literal()
    if (itemRevenue != null) __obj.updateDynamic("itemRevenue")(itemRevenue.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (productQuantity != null) __obj.updateDynamic("productQuantity")(productQuantity)
    if (productSku != null) __obj.updateDynamic("productSku")(productSku)
    __obj.asInstanceOf[ProductData]
  }
}

