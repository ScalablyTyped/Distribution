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

