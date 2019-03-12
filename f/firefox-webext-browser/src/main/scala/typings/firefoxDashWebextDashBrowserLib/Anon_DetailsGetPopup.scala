package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailsGetPopup extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[
    js.Function1[/* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, scala.Unit]
  ]
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: Anon_TabIdNumber): js.Promise[java.lang.String]
  /** Gets the title of the page action. */
  def getTitle(details: Anon_TabIdNumber): js.Promise[java.lang.String]
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: scala.Double): js.Promise[scala.Unit]
  /** Checks whether the page action is shown. */
  def isShown(details: Anon_TabIdNumber): js.Promise[scala.Boolean]
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[scala.Unit]
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: Anon_ImageDataKeyPath): js.Promise[scala.Unit]
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: Anon_PopupTabId): scala.Unit
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: Anon_TabIdTitleNull): scala.Unit
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: scala.Double): js.Promise[scala.Unit]
}

object Anon_DetailsGetPopup {
  @scala.inline
  def apply(
    getPopup: Anon_TabIdNumber => js.Promise[java.lang.String],
    getTitle: Anon_TabIdNumber => js.Promise[java.lang.String],
    hide: scala.Double => js.Promise[scala.Unit],
    isShown: Anon_TabIdNumber => js.Promise[scala.Boolean],
    onClicked: WebExtEvent[
      js.Function1[/* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, scala.Unit]
    ],
    openPopup: () => js.Promise[scala.Unit],
    setIcon: Anon_ImageDataKeyPath => js.Promise[scala.Unit],
    setPopup: Anon_PopupTabId => scala.Unit,
    setTitle: Anon_TabIdTitleNull => scala.Unit,
    show: scala.Double => js.Promise[scala.Unit]
  ): Anon_DetailsGetPopup = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction1(getPopup), getTitle = js.Any.fromFunction1(getTitle), hide = js.Any.fromFunction1(hide), isShown = js.Any.fromFunction1(isShown), onClicked = onClicked, openPopup = js.Any.fromFunction0(openPopup), setIcon = js.Any.fromFunction1(setIcon), setPopup = js.Any.fromFunction1(setPopup), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[Anon_DetailsGetPopup]
  }
}

