package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var shipmentId: js.UndefOr[java.lang.String] = js.undefined
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    shipmentId: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (shipmentId != null) __obj.updateDynamic("shipmentId")(shipmentId)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
}

