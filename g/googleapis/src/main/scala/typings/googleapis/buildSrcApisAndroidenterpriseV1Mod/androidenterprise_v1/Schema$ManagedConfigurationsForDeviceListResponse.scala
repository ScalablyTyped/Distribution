package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configuration resources for the device.
  */
@js.native
trait Schema$ManagedConfigurationsForDeviceListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForDeviceListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configuration for an app on a specific device.
    */
  var managedConfigurationForDevice: js.UndefOr[js.Array[Schema$ManagedConfiguration]] = js.native
}

object Schema$ManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(kind: String = null, managedConfigurationForDevice: js.Array[Schema$ManagedConfiguration] = null): Schema$ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurationForDevice != null) __obj.updateDynamic("managedConfigurationForDevice")(managedConfigurationForDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedConfigurationsForDeviceListResponse]
  }
}

