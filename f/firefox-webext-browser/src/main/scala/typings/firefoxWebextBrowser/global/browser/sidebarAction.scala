package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.sidebarAction.GetPanelDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.GetTitleDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.IsOpenDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetIconDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetPanelDetails
import typings.firefoxWebextBrowser.browser.sidebarAction.SetTitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use sidebar actions to add a sidebar to Firefox.
  *
  * Manifest keys: `sidebar_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sidebarAction {
  
  @JSGlobal("browser.sidebarAction")
  @js.native
  val ^ : js.Any = js.native
  
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  inline def close(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Unit]]
  
  /** Gets the url to the html document set as the panel for this sidebar action. */
  inline def getPanel(details: GetPanelDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPanel")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Gets the title of the sidebar action. */
  inline def getTitle(details: GetTitleDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** Checks whether the sidebar action is open. */
  inline def isOpen(details: IsOpenDetails): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /** Opens the extension sidebar in the active window. */
  inline def open(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData** property must be specified.
    */
  inline def setIcon(details: SetIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  inline def setPanel(details: SetPanelDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPanel")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  inline def setTitle(details: SetTitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Toggles the extension sidebar in the active window. */
  inline def toggle(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[js.Promise[Unit]]
}
