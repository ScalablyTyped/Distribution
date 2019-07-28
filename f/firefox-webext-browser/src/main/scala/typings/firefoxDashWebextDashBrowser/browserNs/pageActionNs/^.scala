package typings.firefoxDashWebextDashBrowser.browserNs.pageActionNs

import typings.firefoxDashWebextDashBrowser.Anon_ImageDataKey
import typings.firefoxDashWebextDashBrowser.Anon_PopupTabId
import typings.firefoxDashWebextDashBrowser.Anon_TabIdNumber
import typings.firefoxDashWebextDashBrowser.Anon_TabIdTitleNull
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browserNs.tabsNs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.pageAction")
@js.native
object ^ extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: Anon_TabIdNumber): js.Promise[String] = js.native
  /** Gets the title of the page action. */
  def getTitle(details: Anon_TabIdNumber): js.Promise[String] = js.native
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: Double): js.Promise[Unit] = js.native
  /** Checks whether the page action is shown. */
  def isShown(details: Anon_TabIdNumber): js.Promise[Boolean] = js.native
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: Anon_ImageDataKey): js.Promise[Unit] = js.native
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: Anon_PopupTabId): Unit = js.native
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: Anon_TabIdTitleNull): Unit = js.native
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: Double): js.Promise[Unit] = js.native
}

