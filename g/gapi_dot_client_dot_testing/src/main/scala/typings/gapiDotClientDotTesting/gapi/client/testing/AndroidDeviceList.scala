package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidDeviceList extends js.Object {
  /**
    * A list of Android devices
    * Required
    */
  var androidDevices: js.UndefOr[js.Array[AndroidDevice]] = js.undefined
}

object AndroidDeviceList {
  @scala.inline
  def apply(androidDevices: js.Array[AndroidDevice] = null): AndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    if (androidDevices != null) __obj.updateDynamic("androidDevices")(androidDevices)
    __obj.asInstanceOf[AndroidDeviceList]
  }
}

