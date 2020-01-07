package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device information collected from the job seeker, candidate, or other
  * entity conducting the job search. Providing this information improves the
  * quality of the search results across devices.
  */
@js.native
trait Schema$DeviceInfo extends js.Object {
  /**
    * Optional.  Type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Optional.  A device-specific ID. The ID must be a unique identifier that
    * distinguishes the device from other devices.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$DeviceInfo {
  @scala.inline
  def apply(deviceType: String = null, id: String = null): Schema$DeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceInfo]
  }
}

