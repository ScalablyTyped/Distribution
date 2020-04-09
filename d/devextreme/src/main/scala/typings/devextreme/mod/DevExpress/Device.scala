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
  /** @name Device.android */
  var android: js.UndefOr[Boolean] = js.undefined
  /** @name Device.deviceType */
  var deviceType: js.UndefOr[phone | tablet | desktop] = js.undefined
  /** @name Device.generic */
  var generic: js.UndefOr[Boolean] = js.undefined
  /** @name Device.grade */
  var grade: js.UndefOr[A | B | C] = js.undefined
  /** @name Device.ios */
  var ios: js.UndefOr[Boolean] = js.undefined
  /** @name Device.phone */
  var phone: js.UndefOr[Boolean] = js.undefined
  /** @name Device.platform */
  var platform: js.UndefOr[android | ios | generic] = js.undefined
  /** @name Device.tablet */
  var tablet: js.UndefOr[Boolean] = js.undefined
  /** @name Device.version */
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

