package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderShipment extends js.Object {
  /**
    * The carrier handling the shipment.  Acceptable values for US are:   -
    * &quot;gsx&quot;  - &quot;ups&quot;  - &quot;usps&quot;  -
    * &quot;fedex&quot;  - &quot;dhl&quot;  - &quot;ecourier&quot;  -
    * &quot;cxt&quot;  - &quot;google&quot;  - &quot;ontrac&quot;  -
    * &quot;emsy&quot;  - &quot;ont&quot;  - &quot;deliv&quot;  -
    * &quot;dynamex&quot;  - &quot;lasership&quot;  - &quot;mpx&quot;  -
    * &quot;uds&quot;    Acceptable values for FR are:   -
    * &quot;colissimo&quot;  - &quot;chronopost&quot;
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Date on which the shipment has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format.
    * Present only if status is delivered
    */
  var deliveryDate: js.UndefOr[String] = js.native
  /**
    * The ID of the shipment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The line items that are shipped.
    */
  var lineItems: js.UndefOr[js.Array[Schema$OrderShipmentLineItemShipment]] = js.native
  /**
    * The status of the shipment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}

object Schema$OrderShipment {
  @scala.inline
  def apply(
    carrier: String = null,
    creationDate: String = null,
    deliveryDate: String = null,
    id: String = null,
    lineItems: js.Array[Schema$OrderShipmentLineItemShipment] = null,
    status: String = null,
    trackingId: String = null
  ): Schema$OrderShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderShipment]
  }
}

