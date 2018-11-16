package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managementNs {
  /** A reason the item is disabled. */
  type ExtensionDisabledReason = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.unknown | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.permissions_increase
  /**
       * How the extension was installed. One of
       * `development`: The extension was loaded unpacked in developer mode,
       * `normal`: The extension was installed normally via an .xpi file,
       * `sideload`: The extension was installed by other software on the machine,
       * `other`: The extension was installed by other means.
       */
  type ExtensionInstallType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.development | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.sideload | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.other
  /** The type of this extension, 'extension' or 'theme'. */
  type ExtensionType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.extension | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.theme
}
