package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to assign a configuration to device.
  */
@js.native
trait SchemaCustomerApplyConfigurationRequest extends js.Object {
  /**
    * Required. The configuration applied to the device in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Required. The device the configuration is applied to.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerApplyConfigurationRequest {
  @scala.inline
  def apply(configuration: String = null, device: SchemaDeviceReference = null): SchemaCustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerApplyConfigurationRequest]
  }
}

