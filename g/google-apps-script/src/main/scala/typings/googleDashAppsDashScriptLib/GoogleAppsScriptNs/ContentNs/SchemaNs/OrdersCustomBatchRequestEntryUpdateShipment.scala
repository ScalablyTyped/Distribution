package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var deliveryDate: js.UndefOr[java.lang.String] = js.undefined
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryUpdateShipment {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    deliveryDate: java.lang.String = null,
    shipmentId: java.lang.String = null,
    status: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrdersCustomBatchRequestEntryUpdateShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryUpdateShipment]
  }
}

