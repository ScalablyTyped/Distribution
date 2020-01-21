package typings.firefoxWebextBrowser.browser.sessions

import typings.firefoxWebextBrowser.browser.tabs.Tab
import typings.firefoxWebextBrowser.browser.windows.Window
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
  var window: js.UndefOr[Window] = js.undefined
}

object Session {
  @scala.inline
  def apply(lastModified: Double, tab: Tab = null, window: Window = null): Session = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

