package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.pageAction.GetPopupDetails
import typings.firefoxWebextBrowser.browser.pageAction.GetTitleDetails
import typings.firefoxWebextBrowser.browser.pageAction.IsShownDetails
import typings.firefoxWebextBrowser.browser.pageAction.OnClickData
import typings.firefoxWebextBrowser.browser.pageAction.SetIconDetails
import typings.firefoxWebextBrowser.browser.pageAction.SetPopupDetails
import typings.firefoxWebextBrowser.browser.pageAction.SetTitleDetails
import typings.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
  *
  * Manifest keys: `page_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object pageAction {
  
  /** Gets the html document set as the popup for this page action. */
  @JSGlobal("browser.pageAction.getPopup")
  @js.native
  def getPopup(details: GetPopupDetails): js.Promise[String] = js.native
  
  /** Gets the title of the page action. */
  @JSGlobal("browser.pageAction.getTitle")
  @js.native
  def getTitle(details: GetTitleDetails): js.Promise[String] = js.native
  
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  @JSGlobal("browser.pageAction.hide")
  @js.native
  def hide(tabId: Double): js.Promise[Unit] = js.native
  
  /** Checks whether the page action is shown. */
  @JSGlobal("browser.pageAction.isShown")
  @js.native
  def isShown(details: IsShownDetails): js.Promise[Boolean] = js.native
  
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  @JSGlobal("browser.pageAction.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  /** Opens the extension page action in the active window. */
  @JSGlobal("browser.pageAction.openPopup")
  @js.native
  def openPopup(): js.Promise[Unit] = js.native
  
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    */
  @JSGlobal("browser.pageAction.setIcon")
  @js.native
  def setIcon(details: SetIconDetails): js.Promise[Unit] = js.native
  
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  @JSGlobal("browser.pageAction.setPopup")
  @js.native
  def setPopup(details: SetPopupDetails): Unit = js.native
  
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  @JSGlobal("browser.pageAction.setTitle")
  @js.native
  def setTitle(details: SetTitleDetails): Unit = js.native
  
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  @JSGlobal("browser.pageAction.show")
  @js.native
  def show(tabId: Double): js.Promise[Unit] = js.native
}
