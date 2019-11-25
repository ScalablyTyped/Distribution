package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedConfigurationsForDeviceListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForDeviceListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** A managed configuration for an app on a specific device. */
  var managedConfigurationForDevice: js.UndefOr[js.Array[ManagedConfiguration]] = js.undefined
}

object ManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(kind: String = null, managedConfigurationForDevice: js.Array[ManagedConfiguration] = null): ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurationForDevice != null) __obj.updateDynamic("managedConfigurationForDevice")(managedConfigurationForDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedConfigurationsForDeviceListResponse]
  }
}

