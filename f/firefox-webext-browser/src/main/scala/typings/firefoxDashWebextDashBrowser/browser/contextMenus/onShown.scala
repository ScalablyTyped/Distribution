package typings.firefoxDashWebextDashBrowser.browser.contextMenus

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_Contexts
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a menu is shown. The extension can add, modify or remove menu items and call menus.refresh() to
  * update the menu.
  * @param info Information about the context of the menu action and the created menu items. For more information
  *     about each property, see OnClickData. The following properties are only set if the extension has host
  *     permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
  * @param tab The details of the tab where the menu was opened.
  */
@JSGlobal("browser.contextMenus.onShown")
@js.native
object onShown
  extends TopLevel[WebExtEvent[js.Function2[/* info */ Anon_Contexts, /* tab */ Tab, Unit]]]

