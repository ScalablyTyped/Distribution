package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new device is ready to be managed.
  */
@js.native
trait Schema$NewDeviceEvent extends js.Object {
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Policy app on the device.
    */
  var dpcPackageName: js.UndefOr[String] = js.native
  /**
    * Identifies the extent to which the device is controlled by an Android EMM
    * in various deployment configurations.  Possible values include:  -
    * &quot;managedDevice&quot;, a device where the DPC is set as device owner,
    * - &quot;managedProfile&quot;, a device where the DPC is set as profile
    * owner.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$NewDeviceEvent {
  @scala.inline
  def apply(
    deviceId: String = null,
    dpcPackageName: String = null,
    managementType: String = null,
    userId: String = null
  ): Schema$NewDeviceEvent = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (dpcPackageName != null) __obj.updateDynamic("dpcPackageName")(dpcPackageName.asInstanceOf[js.Any])
    if (managementType != null) __obj.updateDynamic("managementType")(managementType.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NewDeviceEvent]
  }
}

