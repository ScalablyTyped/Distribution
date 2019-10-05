package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_WindowIdNumber
import typings.firefoxDashWebextDashBrowser.WebExtEvent
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
      js.UndefOr[
        WebExtEvent[js.Function2[/* tabId */ Double, /* selectInfo */ Anon_WindowIdNumber, Unit]]
      ]
    ]

