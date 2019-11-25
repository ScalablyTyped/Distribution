package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[AndroidDeviceList] = js.undefined
  /** A matrix of Android devices. */
  var androidMatrix: js.UndefOr[AndroidMatrix] = js.undefined
}

object EnvironmentMatrix {
  @scala.inline
  def apply(androidDeviceList: AndroidDeviceList = null, androidMatrix: AndroidMatrix = null): EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceList != null) __obj.updateDynamic("androidDeviceList")(androidDeviceList.asInstanceOf[js.Any])
    if (androidMatrix != null) __obj.updateDynamic("androidMatrix")(androidMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentMatrix]
  }
}

