package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderStatus extends js.Object {
  var backgroundModeEnabled: Boolean = js.native
  var gpsAvailable: js.UndefOr[Boolean] = js.native
  var locationServicesEnabled: Boolean = js.native
  var networkAvailable: js.UndefOr[Boolean] = js.native
  var passiveAvailable: js.UndefOr[Boolean] = js.native
}

object ProviderStatus {
  @scala.inline
  def apply(backgroundModeEnabled: Boolean, locationServicesEnabled: Boolean): ProviderStatus = {
    val __obj = js.Dynamic.literal(backgroundModeEnabled = backgroundModeEnabled.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderStatus]
  }
  @scala.inline
  implicit class ProviderStatusOps[Self <: ProviderStatus] (val x: Self) extends AnyVal {
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
    def setBackgroundModeEnabled(value: Boolean): Self = this.set("backgroundModeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationServicesEnabled(value: Boolean): Self = this.set("locationServicesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGpsAvailable(value: Boolean): Self = this.set("gpsAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGpsAvailable: Self = this.set("gpsAvailable", js.undefined)
    @scala.inline
    def setNetworkAvailable(value: Boolean): Self = this.set("networkAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkAvailable: Self = this.set("networkAvailable", js.undefined)
    @scala.inline
    def setPassiveAvailable(value: Boolean): Self = this.set("passiveAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassiveAvailable: Self = this.set("passiveAvailable", js.undefined)
  }
  
}

