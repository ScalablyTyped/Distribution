package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Choices[Macos, Windows, Linux, Default] extends js.Object {
  val default: js.UndefOr[Default | js.Function0[Default]] = js.undefined
  val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.undefined
  val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.undefined
  val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.undefined
}

object _Choices {
  @scala.inline
  def apply[Macos, Windows, Linux, Default](
    default: Default | js.Function0[Default] = null,
    linux: Linux | js.Function0[Linux] = null,
    macos: Macos | js.Function0[Macos] = null,
    windows: Windows | js.Function0[Windows] = null
  ): _Choices[Macos, Windows, Linux, Default] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (macos != null) __obj.updateDynamic("macos")(macos.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
  }
}

