package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  var trackingNumber: js.UndefOr[java.lang.String] = js.undefined
}

object ShipmentTrackingInfo {
  @scala.inline
  def apply(carrier: java.lang.String = null, trackingNumber: java.lang.String = null): ShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (trackingNumber != null) __obj.updateDynamic("trackingNumber")(trackingNumber)
    __obj.asInstanceOf[ShipmentTrackingInfo]
  }
}

