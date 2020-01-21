package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcommerceData extends js.Object {
  var actionType: js.UndefOr[String] = js.undefined
  var ecommerceType: js.UndefOr[String] = js.undefined
  var products: js.UndefOr[js.Array[ProductData]] = js.undefined
  var transaction: js.UndefOr[TransactionData] = js.undefined
}

object EcommerceData {
  @scala.inline
  def apply(
    actionType: String = null,
    ecommerceType: String = null,
    products: js.Array[ProductData] = null,
    transaction: TransactionData = null
  ): EcommerceData = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (ecommerceType != null) __obj.updateDynamic("ecommerceType")(ecommerceType.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcommerceData]
  }
}

