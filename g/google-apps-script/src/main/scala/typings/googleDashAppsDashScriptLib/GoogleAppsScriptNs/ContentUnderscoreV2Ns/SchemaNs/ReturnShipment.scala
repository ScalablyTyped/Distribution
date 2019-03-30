package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnShipment extends js.Object {
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  var deliveryDate: js.UndefOr[java.lang.String] = js.undefined
  var returnMethodType: js.UndefOr[java.lang.String] = js.undefined
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentTrackingInfos: js.UndefOr[js.Array[ShipmentTrackingInfo]] = js.undefined
  var shippingDate: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ReturnShipment {
  @scala.inline
  def apply(
    creationDate: java.lang.String = null,
    deliveryDate: java.lang.String = null,
    returnMethodType: java.lang.String = null,
    shipmentId: java.lang.String = null,
    shipmentTrackingInfos: js.Array[ShipmentTrackingInfo] = null,
    shippingDate: java.lang.String = null,
    state: java.lang.String = null
  ): ReturnShipment = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate)
    if (returnMethodType != null) __obj.updateDynamic("returnMethodType")(returnMethodType)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (shipmentTrackingInfos != null) __obj.updateDynamic("shipmentTrackingInfos")(shipmentTrackingInfos)
    if (shippingDate != null) __obj.updateDynamic("shippingDate")(shippingDate)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ReturnShipment]
  }
}

