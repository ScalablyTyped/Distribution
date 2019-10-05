package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_NewPosition
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is attached to a window, for example because it was moved between windows. */
@JSGlobal("browser.tabs.onAttached")
@js.native
object onAttached
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* attachInfo */ Anon_NewPosition, Unit]]
    ]

