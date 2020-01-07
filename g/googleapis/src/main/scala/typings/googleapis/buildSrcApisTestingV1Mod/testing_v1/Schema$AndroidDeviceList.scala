package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Android device configurations in which the test is to be
  * executed.
  */
@js.native
trait Schema$AndroidDeviceList extends js.Object {
  /**
    * Required. A list of Android devices.
    */
  var androidDevices: js.UndefOr[js.Array[Schema$AndroidDevice]] = js.native
}

object Schema$AndroidDeviceList {
  @scala.inline
  def apply(androidDevices: js.Array[Schema$AndroidDevice] = null): Schema$AndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    if (androidDevices != null) __obj.updateDynamic("androidDevices")(androidDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidDeviceList]
  }
}

