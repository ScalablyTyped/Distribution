package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.
    *
    * Acceptable values are:
    * - "gsx"
    * - "ups"
    * - "united parcel service"
    * - "usps"
    * - "united states postal service"
    * - "fedex"
    * - "dhl"
    * - "ecourier"
    * - "cxt"
    * - "google"
    * - "on trac"
    * - "ontrac"
    * - "on-trac"
    * - "on_trac"
    * - "delvic"
    * - "dynamex"
    * - "lasership"
    * - "smartpost"
    * - "fedex smartpost"
    * - "mpx"
    * - "uds"
    * - "united delivery service"
    */
  var carrier: js.UndefOr[String] = js.undefined
  /** Date on which the shipment has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  /** Date on which the shipment has been delivered, in ISO 8601 format. Present only if status is delievered */
  var deliveryDate: js.UndefOr[String] = js.undefined
  /** The id of the shipment. */
  var id: js.UndefOr[String] = js.undefined
  /** The line items that are shipped. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  /** The status of the shipment. */
  var status: js.UndefOr[String] = js.undefined
  /** The tracking id for the shipment. */
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrderShipment {
  @scala.inline
  def apply(
    carrier: String = null,
    creationDate: String = null,
    deliveryDate: String = null,
    id: String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    status: String = null,
    trackingId: String = null
  ): OrderShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderShipment]
  }
}

