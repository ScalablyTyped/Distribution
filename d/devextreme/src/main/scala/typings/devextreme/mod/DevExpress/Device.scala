package typings.devextreme.mod.DevExpress

import typings.devextreme.devextremeStrings.A
import typings.devextreme.devextremeStrings.B
import typings.devextreme.devextremeStrings.C
import typings.devextreme.devextremeStrings.android
import typings.devextreme.devextremeStrings.desktop
import typings.devextreme.devextremeStrings.generic
import typings.devextreme.devextremeStrings.ios
import typings.devextreme.devextremeStrings.phone
import typings.devextreme.devextremeStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Indicates whether or not the device platform is Android. */
  var android: js.UndefOr[Boolean] = js.undefined
  /** Specifies the type of the device on which the application is running. */
  var deviceType: js.UndefOr[phone | tablet | desktop] = js.undefined
  /** Indicates whether or not the device platform is generic, which means that the application will look and behave according to a generic "light" or "dark" theme. */
  var generic: js.UndefOr[Boolean] = js.undefined
  /** Specifies a performance grade of the current device. */
  var grade: js.UndefOr[A | B | C] = js.undefined
  /** Indicates whether or not the device platform is iOS. */
  var ios: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether or not the device type is 'phone'. */
  var phone: js.UndefOr[Boolean] = js.undefined
  /** Specifies the platform of the device on which the application is running. */
  var platform: js.UndefOr[android | ios | generic] = js.undefined
  /** Indicates whether or not the device type is 'tablet'. */
  var tablet: js.UndefOr[Boolean] = js.undefined
  /** Specifies an array with the major and minor versions of the device platform. */
  var version: js.UndefOr[js.Array[Double]] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    android: js.UndefOr[Boolean] = js.undefined,
    deviceType: phone | tablet | desktop = null,
    generic: js.UndefOr[Boolean] = js.undefined,
    grade: A | B | C = null,
    ios: js.UndefOr[Boolean] = js.undefined,
    phone: js.UndefOr[Boolean] = js.undefined,
    platform: android | ios | generic = null,
    tablet: js.UndefOr[Boolean] = js.undefined,
    version: js.Array[Double] = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(android)) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (!js.isUndefined(generic)) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (!js.isUndefined(ios)) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(tablet)) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

