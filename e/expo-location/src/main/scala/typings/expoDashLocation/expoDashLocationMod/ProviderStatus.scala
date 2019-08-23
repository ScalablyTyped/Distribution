package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderStatus extends js.Object {
  var backgroundModeEnabled: Boolean
  var gpsAvailable: js.UndefOr[Boolean] = js.undefined
  var locationServicesEnabled: Boolean
  var networkAvailable: js.UndefOr[Boolean] = js.undefined
  var passiveAvailable: js.UndefOr[Boolean] = js.undefined
}

object ProviderStatus {
  @scala.inline
  def apply(
    backgroundModeEnabled: Boolean,
    locationServicesEnabled: Boolean,
    gpsAvailable: js.UndefOr[Boolean] = js.undefined,
    networkAvailable: js.UndefOr[Boolean] = js.undefined,
    passiveAvailable: js.UndefOr[Boolean] = js.undefined
  ): ProviderStatus = {
    val __obj = js.Dynamic.literal(backgroundModeEnabled = backgroundModeEnabled, locationServicesEnabled = locationServicesEnabled)
    if (!js.isUndefined(gpsAvailable)) __obj.updateDynamic("gpsAvailable")(gpsAvailable)
    if (!js.isUndefined(networkAvailable)) __obj.updateDynamic("networkAvailable")(networkAvailable)
    if (!js.isUndefined(passiveAvailable)) __obj.updateDynamic("passiveAvailable")(passiveAvailable)
    __obj.asInstanceOf[ProviderStatus]
  }
}

