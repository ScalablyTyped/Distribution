package typings
package electronDashWindowDashStateLib.electronDashWindowDashStateMod.ElectronWindowStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowState extends js.Object {
  /*
  		 * The saved heigth of loaded state.
  		 * defaultHeight if the state has not been saved yet.
  		 */
  var height: scala.Double
  /*
  		 * true if the window state was saved while the the window was in full screen
  		 * mode. undefined if the state has not been saved yet.
  		 */
  var isFullScreen: scala.Boolean
  /*
  		 * true if the window state was saved while the the window was maximized.
  		 * undefined if the state has not been saved yet.
  		 */
  var isMaximized: scala.Boolean
  /*
  		 * The saved width of loaded state.
  		 * defaultWidth if the state has not been saved yet.
  		 */
  var width: scala.Double
  /*
  		 * The saved x coordinate of the loaded state.
  		 * undefined if the state has not been saved yet.
  		 */
  var x: scala.Double
  /*
  		 * The saved y coordinate of the loaded state.
  		 * undefined if the state has not been saved yet.
  		 */
  var y: scala.Double
  /*
  		 * Register listeners on the given BrowserWindow for events that are related
  		 * to size or position changes (resize, move).
  		 * It will also restore the window's maximized or full screen state.
  		 * When the window is closed we automatically remove the listeners and save the state.
  		 */
  def manage(win: electronLib.ElectronNs.BrowserWindow): scala.Unit
  /*
  		 * Saves the current state of the given BrowserWindow.
  		 * This exists mostly for legacy purposes, and in most cases it's better to just use manage.
  		 */
  def saveState(win: electronLib.ElectronNs.BrowserWindow): scala.Unit
}

object WindowState {
  @scala.inline
  def apply(
    height: scala.Double,
    isFullScreen: scala.Boolean,
    isMaximized: scala.Boolean,
    manage: js.Function1[electronLib.ElectronNs.BrowserWindow, scala.Unit],
    saveState: js.Function1[electronLib.ElectronNs.BrowserWindow, scala.Unit],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): WindowState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isFullScreen")(isFullScreen)
    __obj.updateDynamic("isMaximized")(isMaximized)
    __obj.updateDynamic("manage")(manage)
    __obj.updateDynamic("saveState")(saveState)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[WindowState]
  }
}

