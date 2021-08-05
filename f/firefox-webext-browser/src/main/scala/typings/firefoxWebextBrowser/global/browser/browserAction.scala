package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.browserAction.ColorArray
import typings.firefoxWebextBrowser.browser.browserAction.Details
import typings.firefoxWebextBrowser.browser.browserAction.OnClickData
import typings.firefoxWebextBrowser.browser.browserAction.SetBadgeBackgroundColorDetails
import typings.firefoxWebextBrowser.browser.browserAction.SetBadgeTextColorDetails
import typings.firefoxWebextBrowser.browser.browserAction.SetBadgeTextDetails
import typings.firefoxWebextBrowser.browser.browserAction.SetIconDetails
import typings.firefoxWebextBrowser.browser.browserAction.SetPopupDetails
import typings.firefoxWebextBrowser.browser.browserAction.SetTitleDetails
import typings.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
  *
  * Manifest keys: `browser_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserAction {
  
  @JSGlobal("browser.browserAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Disables the browser action for a tab.
    * @param [tabId] The id of the tab for which you want to modify the browser action.
    */
  inline def disable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Unit]]
  inline def disable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Enables the browser action for a tab. By default, browser actions are enabled.
    * @param [tabId] The id of the tab for which you want to modify the browser action.
    */
  inline def enable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Unit]]
  inline def enable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Gets the background color of the browser action badge. */
  inline def getBadgeBackgroundColor(details: Details): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  
  /**
    * Gets the badge text of the browser action. If no tab nor window is specified is specified, the global badge text is returned.
    */
  inline def getBadgeText(details: Details): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Gets the text color of the browser action badge. */
  inline def getBadgeTextColor(details: Details): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeTextColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /** Gets the html document set as the popup for this browser action. */
  inline def getPopup(details: Details): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Gets the title of the browser action. */
  inline def getTitle(details: Details): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Checks whether the browser action is enabled. */
  inline def isEnabled(details: Details): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /* browserAction events */
  /**
    * Fired when a browser action icon is clicked. This event will not fire if the browser action has a popup.
    */
  @JSGlobal("browser.browserAction.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  /** Opens the extension popup window in the active window. */
  inline def openPopup(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")().asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Sets the background color for the badge.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the badge text for the browser action. The badge is displayed on top of the icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setBadgeText(details: SetBadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the text color for the badge.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setBadgeTextColor(details: SetBadgeTextColorDetails): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeTextColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sets the icon for the browser action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setIcon(details: SetIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the html document to be opened as a popup when the user clicks on the browser action's icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setPopup(details: SetPopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* browserAction functions */
  /**
    * Sets the title of the browser action. This shows up in the tooltip.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  inline def setTitle(details: SetTitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
