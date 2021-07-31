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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
  *
  * Manifest keys: `page_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object pageAction {
  
  @JSGlobal("browser.pageAction")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the html document set as the popup for this page action. */
  @scala.inline
  def getPopup(details: GetPopupDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Gets the title of the page action. */
  @scala.inline
  def getTitle(details: GetTitleDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  @scala.inline
  def hide(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Checks whether the page action is shown. */
  @scala.inline
  def isShown(details: IsShownDetails): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isShown")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  @JSGlobal("browser.pageAction.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  /** Opens the extension page action in the active window. */
  @scala.inline
  def openPopup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    */
  @scala.inline
  def setIcon(details: SetIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  @scala.inline
  def setPopup(details: SetPopupDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  @scala.inline
  def setTitle(details: SetTitleDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  @scala.inline
  def show(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
