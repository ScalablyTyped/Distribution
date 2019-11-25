package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  var trackingNumber: js.UndefOr[String] = js.undefined
}

object ShipmentTrackingInfo {
  @scala.inline
  def apply(carrier: String = null, trackingNumber: String = null): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (trackingNumber != null) __obj.updateDynamic("trackingNumber")(trackingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
}

