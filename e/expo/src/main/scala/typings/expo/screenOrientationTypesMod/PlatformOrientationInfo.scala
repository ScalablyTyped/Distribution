package typings.expo.screenOrientationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformOrientationInfo extends js.Object {
  var screenOrientationArrayIOS: js.UndefOr[js.Array[Orientation]] = js.undefined
  var screenOrientationConstantAndroid: js.UndefOr[Double] = js.undefined
  var screenOrientationLockWeb: js.UndefOr[WebOrientationLock] = js.undefined
}

object PlatformOrientationInfo {
  @scala.inline
  def apply(
    screenOrientationArrayIOS: js.Array[Orientation] = null,
    screenOrientationConstantAndroid: js.UndefOr[Double] = js.undefined,
    screenOrientationLockWeb: WebOrientationLock = null
  ): PlatformOrientationInfo = {
    val __obj = js.Dynamic.literal()
    if (screenOrientationArrayIOS != null) __obj.updateDynamic("screenOrientationArrayIOS")(screenOrientationArrayIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(screenOrientationConstantAndroid)) __obj.updateDynamic("screenOrientationConstantAndroid")(screenOrientationConstantAndroid.get.asInstanceOf[js.Any])
    if (screenOrientationLockWeb != null) __obj.updateDynamic("screenOrientationLockWeb")(screenOrientationLockWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOrientationInfo]
  }
}

