package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateShipmentRequest extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var deliveryDate: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersUpdateShipmentRequest {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    deliveryDate: java.lang.String = null,
    operationId: java.lang.String = null,
    shipmentId: java.lang.String = null,
    status: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersUpdateShipmentRequest]
  }
}

