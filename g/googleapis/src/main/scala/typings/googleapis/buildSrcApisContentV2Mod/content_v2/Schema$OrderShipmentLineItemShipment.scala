package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderShipmentLineItemShipment extends js.Object {
  /**
    * The ID of the line item that is shipped. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to ship. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity that is shipped.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object Schema$OrderShipmentLineItemShipment {
  @scala.inline
  def apply(lineItemId: String = null, productId: String = null, quantity: Int | Double = null): Schema$OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderShipmentLineItemShipment]
  }
}

