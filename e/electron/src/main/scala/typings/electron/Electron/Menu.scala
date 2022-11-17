package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends StObject {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_menuwillshow")
  def addListener(event: "menu-will-show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_menuwillclose")
  def addListener(event: "menu-will-close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
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
  
  /**
    * A `MenuItem[]` array containing the menu's items.
    *
    * Each `Menu` consists of multiple `MenuItem`s and each `MenuItem` can have a
    * submenu.
    */
  var items: js.Array[MenuItem] = js.native
  
  /**
    * Emitted when `menu.popup()` is called.
    */
  @JSName("on")
  @scala.annotation.targetName("on_menuwillshow")
  def on(event: "menu-will-show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  // Docs: https://electronjs.org/docs/api/menu
  /**
    * Emitted when a popup is closed either manually or with `menu.closePopup()`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_menuwillclose")
  def on(event: "menu-will-close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_menuwillclose")
  def once(event: "menu-will-close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_menuwillshow")
  def once(event: "menu-will-show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  /**
    * Pops up this menu as a context menu in the `BrowserWindow`.
    */
  def popup(): Unit = js.native
  def popup(options: PopupOptions): Unit = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_menuwillclose")
  def removeListener(event: "menu-will-close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_menuwillshow")
  def removeListener(event: "menu-will-show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
}
