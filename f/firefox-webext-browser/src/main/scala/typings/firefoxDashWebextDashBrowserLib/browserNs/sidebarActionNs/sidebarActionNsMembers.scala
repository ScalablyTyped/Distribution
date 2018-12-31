package typings
package firefoxDashWebextDashBrowserLib.browserNs.sidebarActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sidebarAction")
@js.native
object sidebarActionNsMembers extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[scala.Unit] = js.native
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: firefoxDashWebextDashBrowserLib.Anon_WindowIdTabId): js.Promise[java.lang.String] = js.native
  /** Gets the title of the sidebar action. */
  def getTitle(details: firefoxDashWebextDashBrowserLib.Anon_WindowIdTabId): js.Promise[java.lang.String] = js.native
  /** Checks whether the sidebar action is open. */
  def isOpen(details: firefoxDashWebextDashBrowserLib.Anon_WindowIdNumber): js.Promise[scala.Boolean] = js.native
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[scala.Unit] = js.native
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: firefoxDashWebextDashBrowserLib.Anon_WindowIdImageData): js.Promise[scala.Unit] = js.native
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: firefoxDashWebextDashBrowserLib.Anon_WindowIdPanel): js.Promise[scala.Unit] = js.native
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: firefoxDashWebextDashBrowserLib.Anon_WindowId): js.Promise[scala.Unit] = js.native
}

