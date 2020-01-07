package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of iOS device configurations in which the test is to be executed.
  */
@js.native
trait Schema$IosDeviceList extends js.Object {
  /**
    * Required. A list of iOS devices.
    */
  var iosDevices: js.UndefOr[js.Array[Schema$IosDevice]] = js.native
}

object Schema$IosDeviceList {
  @scala.inline
  def apply(iosDevices: js.Array[Schema$IosDevice] = null): Schema$IosDeviceList = {
    val __obj = js.Dynamic.literal()
    if (iosDevices != null) __obj.updateDynamic("iosDevices")(iosDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IosDeviceList]
  }
}

