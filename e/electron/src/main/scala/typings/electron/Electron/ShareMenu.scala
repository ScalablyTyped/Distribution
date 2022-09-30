package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareMenu extends EventEmitter {
  
  /**
    * Closes the context menu in the `browserWindow`.
    */
  def closePopup(): Unit = js.native
  def closePopup(browserWindow: BrowserWindow): Unit = js.native
  
  /**
    * Pops up this menu as a context menu in the `BrowserWindow`.
    */
  def popup(): Unit = js.native
  def popup(options: PopupOptions): Unit = js.native
}
