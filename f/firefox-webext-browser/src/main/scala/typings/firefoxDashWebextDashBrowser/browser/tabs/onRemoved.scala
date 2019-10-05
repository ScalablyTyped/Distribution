package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_IsWindowClosing
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is closed. */
@JSGlobal("browser.tabs.onRemoved")
@js.native
object onRemoved
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ Anon_IsWindowClosing, Unit]]
    ]

