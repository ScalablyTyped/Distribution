package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the products in an e-commerce transaction.
  */
@js.native
trait Schema$ProductData extends js.Object {
  /**
    * The total revenue from purchased product items.
    */
  var itemRevenue: js.UndefOr[Double] = js.native
  /**
    * The product name, supplied by the e-commerce tracking application, for
    * the purchased items.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * Total number of this product units in the transaction.
    */
  var productQuantity: js.UndefOr[String] = js.native
  /**
    * Unique code that represents the product.
    */
  var productSku: js.UndefOr[String] = js.native
}

object Schema$ProductData {
  @scala.inline
  def apply(
    itemRevenue: Int | Double = null,
    productName: String = null,
    productQuantity: String = null,
    productSku: String = null
  ): Schema$ProductData = {
    val __obj = js.Dynamic.literal()
    if (itemRevenue != null) __obj.updateDynamic("itemRevenue")(itemRevenue.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (productQuantity != null) __obj.updateDynamic("productQuantity")(productQuantity.asInstanceOf[js.Any])
    if (productSku != null) __obj.updateDynamic("productSku")(productSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductData]
  }
}

