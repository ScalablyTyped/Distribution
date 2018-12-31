package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  /** The reason that this event is being dispatched. */
  type OnInstalledReason = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.install | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.update | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.browser_update
  /**
    * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the
    * application is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS
    * is updated to a newer version. 'periodic' is used when the system runs for more than the permitted uptime set in
    * the enterprise policy.
    */
  type OnRestartRequiredReason = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.app_update | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.os_update | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.periodic
  /** The machine's processor architecture. */
  type PlatformArch = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.arm | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`x86-32` | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.`x86-64`
  type PlatformNaclArch = js.Any
  /** The operating system the browser is running on. */
  type PlatformOs = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.mac | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.win | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.android | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.cros | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.linux | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.openbsd
  /** Result of the update check. */
  type RequestUpdateCheckStatus = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.throttled | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.no_update | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.update_available
}
