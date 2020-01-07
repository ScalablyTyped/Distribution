package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var trackingNumber: js.UndefOr[String] = js.native
}

object Schema$ShipmentTrackingInfo {
  @scala.inline
  def apply(carrier: String = null, trackingNumber: String = null): Schema$ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (trackingNumber != null) __obj.updateDynamic("trackingNumber")(trackingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShipmentTrackingInfo]
  }
}

