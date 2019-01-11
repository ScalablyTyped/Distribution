package typings
package firefoxDashWebextDashBrowserLib.browserNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.pageAction")
@js.native
object ^ extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, scala.Unit]
  ] = js.native
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: firefoxDashWebextDashBrowserLib.Anon_TabIdNumber): js.Promise[java.lang.String] = js.native
  /** Gets the title of the page action. */
  def getTitle(details: firefoxDashWebextDashBrowserLib.Anon_TabIdNumber): js.Promise[java.lang.String] = js.native
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: scala.Double): js.Promise[scala.Unit] = js.native
  /** Checks whether the page action is shown. */
  def isShown(details: firefoxDashWebextDashBrowserLib.Anon_TabIdNumber): js.Promise[scala.Boolean] = js.native
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[scala.Unit] = js.native
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: firefoxDashWebextDashBrowserLib.Anon_ImageDataKeyPath): js.Promise[scala.Unit] = js.native
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: firefoxDashWebextDashBrowserLib.Anon_PopupTabId): scala.Unit = js.native
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: firefoxDashWebextDashBrowserLib.Anon_TabIdTitleNull): scala.Unit = js.native
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: scala.Double): js.Promise[scala.Unit] = js.native
}

