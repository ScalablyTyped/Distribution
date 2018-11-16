package typings
package firefoxDashWebextDashBrowserLib.browserNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Session extends js.Object {
  /** The time when the window or tab was closed or modified, represented in milliseconds since the epoch. */
  var lastModified: scala.Double
  /** The `tabs.Tab`, if this entry describes a tab. Either this or `sessions.Session.window` will be set. */
  var tab: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab] = js.undefined
  /**
           * The `windows.Window`, if this entry describes a window. Either this or `sessions.Session.tab` will be set.
           */
  var window: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.Window] = js.undefined
}

