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
    close: js.Function0[js.Promise[scala.Unit]],
    getPanel: js.Function1[Anon_TabIdWindowId, js.Promise[java.lang.String]],
    getTitle: js.Function1[Anon_TabIdWindowId, js.Promise[java.lang.String]],
    isOpen: js.Function1[Anon_WindowId, js.Promise[scala.Boolean]],
    open: js.Function0[js.Promise[scala.Unit]],
    setIcon: js.Function1[Anon_ImageDataKeyPathTabId, js.Promise[scala.Unit]],
    setPanel: js.Function1[Anon_Panel, js.Promise[scala.Unit]],
    setTitle: js.Function1[Anon_TabIdTitle, js.Promise[scala.Unit]]
  ): Anon_Close = {
    val __obj = js.Dynamic.literal(close = close, getPanel = getPanel, getTitle = getTitle, isOpen = isOpen, open = open, setIcon = setIcon, setPanel = setPanel, setTitle = setTitle)
  
    __obj.asInstanceOf[Anon_Close]
  }
}

