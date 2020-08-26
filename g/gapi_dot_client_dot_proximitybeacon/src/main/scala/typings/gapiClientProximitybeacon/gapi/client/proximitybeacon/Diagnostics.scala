package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diagnostics extends js.Object {
  /** An unordered list of Alerts that the beacon has. */
  var alerts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource name of the beacon. For Eddystone-EID beacons, this may
    * be the beacon's current EID, or the beacon's "stable" Eddystone-UID.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The date when the battery is expected to be low. If the value is missing
    * then there is no estimate for when the battery will be low.
    * This value is only an estimate, not an exact date.
    */
  var estimatedLowBatteryDate: js.UndefOr[Date] = js.native
}

object Diagnostics {
  @scala.inline
  def apply(): Diagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostics]
  }
  @scala.inline
  implicit class DiagnosticsOps[Self <: Diagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlertsVarargs(value: String*): Self = this.set("alerts", js.Array(value :_*))
    @scala.inline
    def setAlerts(value: js.Array[String]): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlerts: Self = this.set("alerts", js.undefined)
    @scala.inline
    def setBeaconName(value: String): Self = this.set("beaconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconName: Self = this.set("beaconName", js.undefined)
    @scala.inline
    def setEstimatedLowBatteryDate(value: Date): Self = this.set("estimatedLowBatteryDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedLowBatteryDate: Self = this.set("estimatedLowBatteryDate", js.undefined)
  }
  
}

