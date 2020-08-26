package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons.
    * May be empty if the request matched no beacons.
    */
  var beacons: js.UndefOr[js.Array[BeaconInfo]] = js.native
}

object GetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(): GetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfoForObservedBeaconsResponse]
  }
  @scala.inline
  implicit class GetInfoForObservedBeaconsResponseOps[Self <: GetInfoForObservedBeaconsResponse] (val x: Self) extends AnyVal {
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
    def setBeaconsVarargs(value: BeaconInfo*): Self = this.set("beacons", js.Array(value :_*))
    @scala.inline
    def setBeacons(value: js.Array[BeaconInfo]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeacons: Self = this.set("beacons", js.undefined)
  }
  
}

