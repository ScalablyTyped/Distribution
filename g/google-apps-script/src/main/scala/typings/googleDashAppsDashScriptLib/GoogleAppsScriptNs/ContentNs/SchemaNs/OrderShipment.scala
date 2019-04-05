package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipment extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  var deliveryDate: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var trackingId: js.UndefOr[java.lang.String] = js.undefined
}

object OrderShipment {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    creationDate: java.lang.String = null,
    deliveryDate: java.lang.String = null,
    id: java.lang.String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    status: java.lang.String = null,
    trackingId: java.lang.String = null
  ): OrderShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[OrderShipment]
  }
}

