package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * E-commerce details associated with the user activity.
  */
@js.native
trait Schema$EcommerceData extends js.Object {
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String] = js.native
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String] = js.native
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[Schema$ProductData]] = js.native
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[Schema$TransactionData] = js.native
}

object Schema$EcommerceData {
  @scala.inline
  def apply(
    actionType: String = null,
    ecommerceType: String = null,
    products: js.Array[Schema$ProductData] = null,
    transaction: Schema$TransactionData = null
  ): Schema$EcommerceData = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (ecommerceType != null) __obj.updateDynamic("ecommerceType")(ecommerceType.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EcommerceData]
  }
}

