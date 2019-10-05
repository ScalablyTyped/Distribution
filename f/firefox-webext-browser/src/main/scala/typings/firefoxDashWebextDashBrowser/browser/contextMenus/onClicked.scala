package typings.firefoxDashWebextDashBrowser.browser.contextMenus

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextMenus events */
/**
  * Fired when a context menu item is clicked.
  * @param info Information about the item clicked and the context where the click happened.
  * @param [tab] The details of the tab where the click took place. If the click did not take place in a tab, this
  *     parameter will be missing.
  */
@JSGlobal("browser.contextMenus.onClicked")
@js.native
object onClicked
  extends TopLevel[
      WebExtEvent[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]]
    ]

