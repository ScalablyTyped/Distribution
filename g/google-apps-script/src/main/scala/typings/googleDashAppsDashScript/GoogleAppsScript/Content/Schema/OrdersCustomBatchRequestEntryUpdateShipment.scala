package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryUpdateShipment extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  var deliveryDate: js.UndefOr[String] = js.undefined
  var shipmentId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryUpdateShipment {
  @scala.inline
  def apply(
    carrier: String = null,
    deliveryDate: String = null,
    shipmentId: String = null,
    status: String = null,
    trackingId: String = null
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

