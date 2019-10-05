package typings.firefoxDashWebextDashBrowser.browser.sessions

import typings.firefoxDashWebextDashBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /** The time when the window or tab was closed or modified, represented in milliseconds since the epoch. */
  var lastModified: Double
  /** The `tabs.Tab`, if this entry describes a tab. Either this or `sessions.Session.window` will be set. */
  var tab: js.UndefOr[Tab] = js.undefined
  /**
    * The `windows.Window`, if this entry describes a window. Either this or `sessions.Session.tab` will be set.
    */
  var window: js.UndefOr[typings.firefoxDashWebextDashBrowser.browser.windows.Window] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    lastModified: Double,
    tab: Tab = null,
    window: typings.firefoxDashWebextDashBrowser.browser.windows.Window = null
  ): Session = {
    val __obj = js.Dynamic.literal(lastModified = lastModified)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Session]
  }
}

