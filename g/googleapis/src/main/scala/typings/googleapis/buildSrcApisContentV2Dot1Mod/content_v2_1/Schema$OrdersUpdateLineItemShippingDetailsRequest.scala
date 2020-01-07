package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersUpdateLineItemShippingDetailsRequest extends js.Object {
  /**
    * Updated delivery by date, in ISO 8601 format. If not specified only ship
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Updated ship by date, in ISO 8601 format. If not specified only deliver
    * by date is updated.  Provided date should be within 1 year timeframe and
    * can not be a date in the past.
    */
  var shipByDate: js.UndefOr[String] = js.native
}

object Schema$OrdersUpdateLineItemShippingDetailsRequest {
  @scala.inline
  def apply(
    deliverByDate: String = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    shipByDate: String = null
  ): Schema$OrdersUpdateLineItemShippingDetailsRequest = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersUpdateLineItemShippingDetailsRequest]
  }
}

