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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
  *
  * Manifest keys: `browser_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserAction {
  
  /**
    * Disables the browser action for a tab.
    * @param [tabId] The id of the tab for which you want to modify the browser action.
    */
  @JSGlobal("browser.browserAction.disable")
  @js.native
  def disable(): js.Promise[Unit] = js.native
  @JSGlobal("browser.browserAction.disable")
  @js.native
  def disable(tabId: Double): js.Promise[Unit] = js.native
  
  /**
    * Enables the browser action for a tab. By default, browser actions are enabled.
    * @param [tabId] The id of the tab for which you want to modify the browser action.
    */
  @JSGlobal("browser.browserAction.enable")
  @js.native
  def enable(): js.Promise[Unit] = js.native
  @JSGlobal("browser.browserAction.enable")
  @js.native
  def enable(tabId: Double): js.Promise[Unit] = js.native
  
  /** Gets the background color of the browser action badge. */
  @JSGlobal("browser.browserAction.getBadgeBackgroundColor")
  @js.native
  def getBadgeBackgroundColor(details: Details): js.Promise[ColorArray] = js.native
  
  /**
    * Gets the badge text of the browser action. If no tab nor window is specified is specified, the global badge text is returned.
    */
  @JSGlobal("browser.browserAction.getBadgeText")
  @js.native
  def getBadgeText(details: Details): js.Promise[String] = js.native
  
  /** Gets the text color of the browser action badge. */
  @JSGlobal("browser.browserAction.getBadgeTextColor")
  @js.native
  def getBadgeTextColor(details: Details): js.Promise[_] = js.native
  
  /** Gets the html document set as the popup for this browser action. */
  @JSGlobal("browser.browserAction.getPopup")
  @js.native
  def getPopup(details: Details): js.Promise[String] = js.native
  
  /** Gets the title of the browser action. */
  @JSGlobal("browser.browserAction.getTitle")
  @js.native
  def getTitle(details: Details): js.Promise[String] = js.native
  
  /** Checks whether the browser action is enabled. */
  @JSGlobal("browser.browserAction.isEnabled")
  @js.native
  def isEnabled(details: Details): js.Promise[_] = js.native
  
  /* browserAction events */
  /**
    * Fired when a browser action icon is clicked. This event will not fire if the browser action has a popup.
    */
  @JSGlobal("browser.browserAction.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  /** Opens the extension popup window in the active window. */
  @JSGlobal("browser.browserAction.openPopup")
  @js.native
  def openPopup(): js.Promise[Boolean] = js.native
  
  /**
    * Sets the background color for the badge.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setBadgeBackgroundColor")
  @js.native
  def setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails): js.Promise[Unit] = js.native
  
  /**
    * Sets the badge text for the browser action. The badge is displayed on top of the icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setBadgeText")
  @js.native
  def setBadgeText(details: SetBadgeTextDetails): js.Promise[Unit] = js.native
  
  /**
    * Sets the text color for the badge.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setBadgeTextColor")
  @js.native
  def setBadgeTextColor(details: SetBadgeTextColorDetails): js.Promise[_] = js.native
  
  /**
    * Sets the icon for the browser action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setIcon")
  @js.native
  def setIcon(details: SetIconDetails): js.Promise[Unit] = js.native
  
  /**
    * Sets the html document to be opened as a popup when the user clicks on the browser action's icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setPopup")
  @js.native
  def setPopup(details: SetPopupDetails): js.Promise[Unit] = js.native
  
  /* browserAction functions */
  /**
    * Sets the title of the browser action. This shows up in the tooltip.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  @JSGlobal("browser.browserAction.setTitle")
  @js.native
  def setTitle(details: SetTitleDetails): js.Promise[Unit] = js.native
}
