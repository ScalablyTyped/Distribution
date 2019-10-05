package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  var shipmentId: js.UndefOr[String] = js.undefined
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(carrier: String = null, shipmentId: String = null, trackingId: String = null): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
}

