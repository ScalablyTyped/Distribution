package typings.electron.Electron

import typings.electron.electronStrings.`menu-will-close`
import typings.electron.electronStrings.`menu-will-show`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends js.Object {
  
  @JSName("addListener")
  def addListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  /**
    * Appends the `menuItem` to the menu.
    */
  def append(menuItem: MenuItem): Unit = js.native
  
  /**
    * Closes the context menu in the `browserWindow`.
    */
  def closePopup(): Unit = js.native
  def closePopup(browserWindow: BrowserWindow): Unit = js.native
  
  /**
    * the item with the specified `id`
    */
  def getMenuItemById(id: String): MenuItem | Null = js.native
  
  /**
    * Inserts the `menuItem` to the `pos` position of the menu.
    */
  def insert(pos: Double, menuItem: MenuItem): Unit = js.native
  
  var items: js.Array[MenuItem] = js.native
  
  // Docs: https://electronjs.org/docs/api/menu
  /**
    * Emitted when a popup is closed either manually or with `menu.closePopup()`.
    */
  @JSName("on")
  def on_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when `menu.popup()` is called.
    */
  @JSName("on")
  def on_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("once")
  def once_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  /**
    * Pops up this menu as a context menu in the `BrowserWindow`.
    */
  def popup(): Unit = js.native
  def popup(options: PopupOptions): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
}
