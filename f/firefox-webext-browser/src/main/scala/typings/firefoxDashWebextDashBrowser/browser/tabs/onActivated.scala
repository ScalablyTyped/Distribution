package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_PreviousTabId
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event
  * fired, but you can listen to onUpdated events to be notified when a URL is set.
  */
@JSGlobal("browser.tabs.onActivated")
@js.native
object onActivated
  extends TopLevel[WebExtEvent[js.Function1[/* activeInfo */ Anon_PreviousTabId, Unit]]]

