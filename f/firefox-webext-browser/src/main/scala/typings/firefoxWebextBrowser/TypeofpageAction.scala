package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpageAction extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]]
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: AnonTabIdNumber): js.Promise[String]
  /** Gets the title of the page action. */
  def getTitle(details: AnonTabIdNumber): js.Promise[String]
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: Double): js.Promise[Unit]
  /** Checks whether the page action is shown. */
  def isShown(details: AnonTabIdNumber): js.Promise[Boolean]
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[Unit]
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: AnonPath): js.Promise[Unit]
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: AnonPopupTabId): Unit
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: AnonTabIdTitle): Unit
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: Double): js.Promise[Unit]
}

object TypeofpageAction {
  @scala.inline
  def apply(
    getPopup: AnonTabIdNumber => js.Promise[String],
    getTitle: AnonTabIdNumber => js.Promise[String],
    hide: Double => js.Promise[Unit],
    isShown: AnonTabIdNumber => js.Promise[Boolean],
    onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]],
    openPopup: () => js.Promise[Unit],
    setIcon: AnonPath => js.Promise[Unit],
    setPopup: AnonPopupTabId => Unit,
    setTitle: AnonTabIdTitle => Unit,
    show: Double => js.Promise[Unit]
  ): TypeofpageAction = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction1(getPopup), getTitle = js.Any.fromFunction1(getTitle), hide = js.Any.fromFunction1(hide), isShown = js.Any.fromFunction1(isShown), onClicked = onClicked.asInstanceOf[js.Any], openPopup = js.Any.fromFunction0(openPopup), setIcon = js.Any.fromFunction1(setIcon), setPopup = js.Any.fromFunction1(setPopup), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[TypeofpageAction]
  }
}

