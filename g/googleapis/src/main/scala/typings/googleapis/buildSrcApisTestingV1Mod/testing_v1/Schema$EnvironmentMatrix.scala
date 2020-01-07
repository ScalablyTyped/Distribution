package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matrix of environments in which the test is to be executed.
  */
@js.native
trait Schema$EnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[Schema$AndroidDeviceList] = js.native
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[Schema$AndroidMatrix] = js.native
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[Schema$IosDeviceList] = js.native
}

object Schema$EnvironmentMatrix {
  @scala.inline
  def apply(
    androidDeviceList: Schema$AndroidDeviceList = null,
    androidMatrix: Schema$AndroidMatrix = null,
    iosDeviceList: Schema$IosDeviceList = null
  ): Schema$EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceList != null) __obj.updateDynamic("androidDeviceList")(androidDeviceList.asInstanceOf[js.Any])
    if (androidMatrix != null) __obj.updateDynamic("androidMatrix")(androidMatrix.asInstanceOf[js.Any])
    if (iosDeviceList != null) __obj.updateDynamic("iosDeviceList")(iosDeviceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnvironmentMatrix]
  }
}

