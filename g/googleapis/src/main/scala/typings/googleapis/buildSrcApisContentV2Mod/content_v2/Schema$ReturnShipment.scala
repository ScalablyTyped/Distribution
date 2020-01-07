package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReturnShipment extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var deliveryDate: js.UndefOr[String] = js.native
  var returnMethodType: js.UndefOr[String] = js.native
  var shipmentId: js.UndefOr[String] = js.native
  var shipmentTrackingInfos: js.UndefOr[js.Array[Schema$ShipmentTrackingInfo]] = js.native
  var shippingDate: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object Schema$ReturnShipment {
  @scala.inline
  def apply(
    creationDate: String = null,
    deliveryDate: String = null,
    returnMethodType: String = null,
    shipmentId: String = null,
    shipmentTrackingInfos: js.Array[Schema$ShipmentTrackingInfo] = null,
    shippingDate: String = null,
    state: String = null
  ): Schema$ReturnShipment = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate.asInstanceOf[js.Any])
    if (returnMethodType != null) __obj.updateDynamic("returnMethodType")(returnMethodType.asInstanceOf[js.Any])
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId.asInstanceOf[js.Any])
    if (shipmentTrackingInfos != null) __obj.updateDynamic("shipmentTrackingInfos")(shipmentTrackingInfos.asInstanceOf[js.Any])
    if (shippingDate != null) __obj.updateDynamic("shippingDate")(shippingDate.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReturnShipment]
  }
}

