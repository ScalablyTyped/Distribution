package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.Anon0
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the selected tab in a window changes.
  * @param tabId The ID of the tab that has become active.
  * @deprecated Please use `tabs.onActivated`.
  */
@JSGlobal("browser.tabs.onSelectionChanged")
@js.native
object onSelectionChanged
  extends TopLevel[
      js.UndefOr[WebExtEvent[js.Function2[/* tabId */ Double, /* selectInfo */ Anon0, Unit]]]
    ]

