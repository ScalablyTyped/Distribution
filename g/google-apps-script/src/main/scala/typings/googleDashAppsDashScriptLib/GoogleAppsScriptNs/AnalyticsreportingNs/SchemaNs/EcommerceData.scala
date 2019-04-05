package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcommerceData extends js.Object {
  var actionType: js.UndefOr[java.lang.String] = js.undefined
  var ecommerceType: js.UndefOr[java.lang.String] = js.undefined
  var products: js.UndefOr[js.Array[ProductData]] = js.undefined
  var transaction: js.UndefOr[TransactionData] = js.undefined
}

object EcommerceData {
  @scala.inline
  def apply(
    actionType: java.lang.String = null,
    ecommerceType: java.lang.String = null,
    products: js.Array[ProductData] = null,
    transaction: TransactionData = null
  ): EcommerceData = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType)
    if (ecommerceType != null) __obj.updateDynamic("ecommerceType")(ecommerceType)
    if (products != null) __obj.updateDynamic("products")(products)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[EcommerceData]
  }
}

