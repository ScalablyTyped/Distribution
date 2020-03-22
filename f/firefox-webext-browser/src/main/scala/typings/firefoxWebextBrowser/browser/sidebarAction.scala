package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.AnonImageDataPath
import typings.firefoxWebextBrowser.AnonPanel
import typings.firefoxWebextBrowser.AnonTabIdWindowId
import typings.firefoxWebextBrowser.AnonWindowId
import typings.firefoxWebextBrowser.AnonWindowIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use sidebar actions to add a sidebar to Firefox.
  *
  * Manifest keys: `sidebar_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.sidebarAction")
@js.native
object sidebarAction extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[Unit] = js.native
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: AnonTabIdWindowId): js.Promise[String] = js.native
  /** Gets the title of the sidebar action. */
  def getTitle(details: AnonTabIdWindowId): js.Promise[String] = js.native
  /** Checks whether the sidebar action is open. */
  def isOpen(details: AnonWindowIdNumber): js.Promise[Boolean] = js.native
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: AnonImageDataPath): js.Promise[Unit] = js.native
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: AnonPanel): js.Promise[Unit] = js.native
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: AnonWindowId): js.Promise[Unit] = js.native
  /* sidebarAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = js.Object
}

