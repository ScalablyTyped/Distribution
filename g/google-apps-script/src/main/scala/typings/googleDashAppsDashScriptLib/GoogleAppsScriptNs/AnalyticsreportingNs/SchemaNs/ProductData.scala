package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductData extends js.Object {
  var itemRevenue: js.UndefOr[stdLib.Number] = js.undefined
  var productName: js.UndefOr[java.lang.String] = js.undefined
  var productQuantity: js.UndefOr[java.lang.String] = js.undefined
  var productSku: js.UndefOr[java.lang.String] = js.undefined
}

object ProductData {
  @scala.inline
  def apply(
    itemRevenue: stdLib.Number = null,
    productName: java.lang.String = null,
    productQuantity: java.lang.String = null,
    productSku: java.lang.String = null
  ): ProductData = {
    val __obj = js.Dynamic.literal()
    if (itemRevenue != null) __obj.updateDynamic("itemRevenue")(itemRevenue)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (productQuantity != null) __obj.updateDynamic("productQuantity")(productQuantity)
    if (productSku != null) __obj.updateDynamic("productSku")(productSku)
    __obj.asInstanceOf[ProductData]
  }
}

