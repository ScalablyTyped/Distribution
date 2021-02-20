package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.sidebarAction.GetPanelDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.GetTitleDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.IsOpenDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetIconDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetPanelDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetTitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use sidebar actions to add a sidebar to Firefox.
  *
  * Manifest keys: `sidebar_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sidebarAction {
  
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  @JSGlobal("browser.sidebarAction.close")
  @js.native
  def close(): js.Promise[Unit] = js.native
  
  /** Gets the url to the html document set as the panel for this sidebar action. */
  @JSGlobal("browser.sidebarAction.getPanel")
  @js.native
  def getPanel(details: GetPanelDetails): js.Promise[String] = js.native
  
  /** Gets the title of the sidebar action. */
  @JSGlobal("browser.sidebarAction.getTitle")
  @js.native
  def getTitle(details: GetTitleDetails): js.Promise[String] = js.native
  
  /** Checks whether the sidebar action is open. */
  @JSGlobal("browser.sidebarAction.isOpen")
  @js.native
  def isOpen(details: IsOpenDetails): js.Promise[Boolean] = js.native
  
  /** Opens the extension sidebar in the active window. */
  @JSGlobal("browser.sidebarAction.open")
  @js.native
  def open(): js.Promise[Unit] = js.native
  
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    */
  @JSGlobal("browser.sidebarAction.setIcon")
  @js.native
  def setIcon(details: SetIconDetails): js.Promise[Unit] = js.native
  
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  @JSGlobal("browser.sidebarAction.setPanel")
  @js.native
  def setPanel(details: SetPanelDetails): js.Promise[Unit] = js.native
  
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  @JSGlobal("browser.sidebarAction.setTitle")
  @js.native
  def setTitle(details: SetTitleDetails): js.Promise[Unit] = js.native
  
  /** Toggles the extension sidebar in the active window. */
  @JSGlobal("browser.sidebarAction.toggle")
  @js.native
  def toggle(): js.Promise[Unit] = js.native
}
