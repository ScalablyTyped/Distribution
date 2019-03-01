package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformsParameter[T] extends js.Object {
  var default: js.UndefOr[T | js.Function0[T]] = js.undefined
  var linux: js.UndefOr[T | js.Function0[T]] = js.undefined
  var macos: js.UndefOr[T | js.Function0[T]] = js.undefined
  var windows: js.UndefOr[T | js.Function0[T]] = js.undefined
}

object PlatformsParameter {
  @scala.inline
  def apply[T](
    default: T | js.Function0[T] = null,
    linux: T | js.Function0[T] = null,
    macos: T | js.Function0[T] = null,
    windows: T | js.Function0[T] = null
  ): PlatformsParameter[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (macos != null) __obj.updateDynamic("macos")(macos.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformsParameter[T]]
  }
}

