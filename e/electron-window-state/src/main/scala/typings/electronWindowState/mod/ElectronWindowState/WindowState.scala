package typings.electronWindowState.mod.ElectronWindowState

import typings.electron.Electron.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowState extends js.Object {
  /*
  		 * The saved heigth of loaded state.
  		 * defaultHeight if the state has not been saved yet.
  		 */
  var height: Double
  /*
  		 * true if the window state was saved while the the window was in full screen
  		 * mode. undefined if the state has not been saved yet.
  		 */
  var isFullScreen: Boolean
  /*
  		 * true if the window state was saved while the the window was maximized.
  		 * undefined if the state has not been saved yet.
  		 */
  var isMaximized: Boolean
  /*
  		 * The saved width of loaded state.
  		 * defaultWidth if the state has not been saved yet.
  		 */
  var width: Double
  /*
  		 * The saved x coordinate of the loaded state.
  		 * undefined if the state has not been saved yet.
  		 */
  var x: Double
  /*
  		 * The saved y coordinate of the loaded state.
  		 * undefined if the state has not been saved yet.
  		 */
  var y: Double
  /*
  		 * Register listeners on the given BrowserWindow for events that are related
  		 * to size or position changes (resize, move).
  		 * It will also restore the window's maximized or full screen state.
  		 * When the window is closed we automatically remove the listeners and save the state.
  		 */
  def manage(win: BrowserWindow): Unit
  /*
  		 * Saves the current state of the given BrowserWindow.
  		 * This exists mostly for legacy purposes, and in most cases it's better to just use manage.
  		 */
  def saveState(win: BrowserWindow): Unit
}

object WindowState {
  @scala.inline
  def apply(
    height: Double,
    isFullScreen: Boolean,
    isMaximized: Boolean,
    manage: BrowserWindow => Unit,
    saveState: BrowserWindow => Unit,
    width: Double,
    x: Double,
    y: Double
  ): WindowState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isMaximized = isMaximized.asInstanceOf[js.Any], manage = js.Any.fromFunction1(manage), saveState = js.Any.fromFunction1(saveState), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowState]
  }
}

