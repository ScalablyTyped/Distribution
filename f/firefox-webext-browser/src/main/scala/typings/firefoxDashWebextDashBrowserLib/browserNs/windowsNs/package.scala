package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsNs {
  /**
       * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless
       * the '--enable-panels' flag is set.
       */
  type CreateType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.popup | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.panel | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.detached_panel
  /**
       * The state of this browser window. Under some circumstances a Window may not be assigned state property, for
       * example when querying closed windows from the `sessions` API.
       */
  type WindowState = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.minimized | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.maximized | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.fullscreen | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.docked
  /* windows types */
  /**
       * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for
       * example when querying closed windows from the `sessions` API.
       */
  type WindowType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.normal | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.popup | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.panel | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.app | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.devtools
}
