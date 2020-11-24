package typings.electron.mod

import typings.electron.Electron.MenuItemConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Menu")
@js.native
/**
  * Menu
  */
class Menu ()
  extends typings.electron.Electron.Menu
/* static members */
@JSImport("electron", "Menu")
@js.native
object Menu extends js.Object {
  
  /**
    * Generally, the `template` is an array of `options` for constructing a MenuItem.
    * The usage can be referenced above.
    *
    * You can also attach other fields to the element of the `template` and they will
    * become properties of the constructed menu items.
    */
  def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | typings.electron.Electron.MenuItem]): typings.electron.Electron.Menu = js.native
  
  /**
    * The application menu, if set, or `null`, if not set.
    *
    * **Note:** The returned `Menu` instance doesn't support dynamic addition or
    * removal of menu items. Instance properties can still be dynamically modified.
    */
  def getApplicationMenu(): typings.electron.Electron.Menu | Null = js.native
  
  /**
    * Sends the `action` to the first responder of application. This is used for
    * emulating default macOS menu behaviors. Usually you would use the `role`
    * property of a `MenuItem`.
    *
    * See the macOS Cocoa Event Handling Guide for more information on macOS' native
    * actions.
    *
    * @platform darwin
    */
  def sendActionToFirstResponder(action: String): Unit = js.native
  
  /**
    * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
    * will be set as each window's top menu.
    *
    * Also on Windows and Linux, you can use a `&` in the top-level item name to
    * indicate which letter should get a generated accelerator. For example, using
    * `&File` for the file menu would result in a generated `Alt-F` accelerator that
    * opens the associated menu. The indicated character in the button label gets an
    * underline. The `&` character is not displayed on the button label.
    *
    * Passing `null` will suppress the default menu. On Windows and Linux, this has
    * the additional effect of removing the menu bar from the window.
    *
    * **Note:** The default menu will be created automatically if the app does not set
    * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
    * `Help`.
    */
  def setApplicationMenu(): Unit = js.native
  def setApplicationMenu(menu: typings.electron.Electron.Menu): Unit = js.native
}
