package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Menu")
@js.native
class Menu ()
  extends electronLib.ElectronNs.Menu

@JSImport("electron", "Menu")
@js.native
object Menu extends js.Object {
  /**
       * Generally, the template is an array of options for constructing a MenuItem. The
       * usage can be referenced above. You can also attach other fields to the element
       * of the template and they will become properties of the constructed menu items.
       */
  def buildFromTemplate(template: js.Array[electronLib.ElectronNs.MenuItemConstructorOptions]): electronLib.ElectronNs.Menu = js.native
  /**
       * Note: The returned Menu instance doesn't support dynamic addition or removal of
       * menu items. Instance properties can still be dynamically modified.
       */
  def getApplicationMenu(): electronLib.ElectronNs.Menu | scala.Null = js.native
  /**
       * Sends the action to the first responder of application. This is used for
       * emulating default macOS menu behaviors. Usually you would use the role property
       * of a MenuItem. See the macOS Cocoa Event Handling Guide for more information on
       * macOS' native actions.
       */
  def sendActionToFirstResponder(action: java.lang.String): scala.Unit = js.native
  /**
       * Sets menu as the application menu on macOS. On Windows and Linux, the menu will
       * be set as each window's top menu. Passing null will remove the menu bar on
       * Windows and Linux but has no effect on macOS. Note: This API has to be called
       * after the ready event of app module.
       */
  def setApplicationMenu(): scala.Unit = js.native
  /**
       * Sets menu as the application menu on macOS. On Windows and Linux, the menu will
       * be set as each window's top menu. Passing null will remove the menu bar on
       * Windows and Linux but has no effect on macOS. Note: This API has to be called
       * after the ready event of app module.
       */
  def setApplicationMenu(menu: electronLib.ElectronNs.Menu): scala.Unit = js.native
}

