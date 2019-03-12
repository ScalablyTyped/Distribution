package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[scala.Unit]
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: Anon_TabIdWindowId): js.Promise[java.lang.String]
  /** Gets the title of the sidebar action. */
  def getTitle(details: Anon_TabIdWindowId): js.Promise[java.lang.String]
  /** Checks whether the sidebar action is open. */
  def isOpen(details: Anon_WindowId): js.Promise[scala.Boolean]
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[scala.Unit]
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: Anon_ImageDataKeyPathTabId): js.Promise[scala.Unit]
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: Anon_Panel): js.Promise[scala.Unit]
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: Anon_TabIdTitle): js.Promise[scala.Unit]
}

object Anon_Close {
  @scala.inline
  def apply(
    close: () => js.Promise[scala.Unit],
    getPanel: Anon_TabIdWindowId => js.Promise[java.lang.String],
    getTitle: Anon_TabIdWindowId => js.Promise[java.lang.String],
    isOpen: Anon_WindowId => js.Promise[scala.Boolean],
    open: () => js.Promise[scala.Unit],
    setIcon: Anon_ImageDataKeyPathTabId => js.Promise[scala.Unit],
    setPanel: Anon_Panel => js.Promise[scala.Unit],
    setTitle: Anon_TabIdTitle => js.Promise[scala.Unit]
  ): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPanel = js.Any.fromFunction1(getPanel), getTitle = js.Any.fromFunction1(getTitle), isOpen = js.Any.fromFunction1(isOpen), open = js.Any.fromFunction0(open), setIcon = js.Any.fromFunction1(setIcon), setPanel = js.Any.fromFunction1(setPanel), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[Anon_Close]
  }
}

