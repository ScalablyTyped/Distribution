package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to assign a configuration to device.
  */
@js.native
trait Schema$CustomerApplyConfigurationRequest extends js.Object {
  /**
    * Required. The configuration applied to the device in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Required. The device the configuration is applied to.
    */
  var device: js.UndefOr[Schema$DeviceReference] = js.native
}

object Schema$CustomerApplyConfigurationRequest {
  @scala.inline
  def apply(configuration: String = null, device: Schema$DeviceReference = null): Schema$CustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerApplyConfigurationRequest]
  }
}

