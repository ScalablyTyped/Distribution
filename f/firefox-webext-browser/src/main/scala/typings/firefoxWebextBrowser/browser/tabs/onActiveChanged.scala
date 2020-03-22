package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.Anon0
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the time this event
  * fired, but you can listen to `tabs.onUpdated` events to be notified when a URL is set.
  * @param tabId The ID of the tab that has become active.
  * @deprecated Please use `tabs.onActivated`.
  */
@JSGlobal("browser.tabs.onActiveChanged")
@js.native
object onActiveChanged
  extends TopLevel[
      js.UndefOr[WebExtEvent[js.Function2[/* tabId */ Double, /* selectInfo */ Anon0, Unit]]]
    ]

