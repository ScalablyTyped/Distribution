package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The managed configuration resources for the device.
  */
@js.native
trait SchemaManagedConfigurationsForDeviceListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsForDeviceListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A managed configuration for an app on a specific device.
    */
  var managedConfigurationForDevice: js.UndefOr[js.Array[SchemaManagedConfiguration]] = js.native
}

object SchemaManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(kind: String = null, managedConfigurationForDevice: js.Array[SchemaManagedConfiguration] = null): SchemaManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedConfigurationForDevice != null) __obj.updateDynamic("managedConfigurationForDevice")(managedConfigurationForDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedConfigurationsForDeviceListResponse]
  }
}

