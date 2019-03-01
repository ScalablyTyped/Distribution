package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the current platform. */
trait PlatformInfo extends js.Object {
  /** The machine's processor architecture. */
  var arch: PlatformArch
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @deprecated Unsupported on Firefox at this time.
    */
  var nacl_arch: js.UndefOr[PlatformNaclArch] = js.undefined
  /** The operating system the browser is running on. */
  var os: PlatformOs
}

object PlatformInfo {
  @scala.inline
  def apply(arch: PlatformArch, os: PlatformOs, nacl_arch: PlatformNaclArch = null): PlatformInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch)
    __obj.updateDynamic("os")(os)
    if (nacl_arch != null) __obj.updateDynamic("nacl_arch")(nacl_arch)
    __obj.asInstanceOf[PlatformInfo]
  }
}

