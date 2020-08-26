package typings.electronWindowState.mod.ElectronWindowState

import typings.electron.Electron.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowState extends js.Object {
  /*
    * The saved heigth of loaded state.
    * defaultHeight if the state has not been saved yet.
    */
  var height: Double = js.native
  /*
    * true if the window state was saved while the the window was in full screen
    * mode. undefined if the state has not been saved yet.
    */
  var isFullScreen: Boolean = js.native
  /*
    * true if the window state was saved while the the window was maximized.
    * undefined if the state has not been saved yet.
    */
  var isMaximized: Boolean = js.native
  /*
    * The saved width of loaded state.
    * defaultWidth if the state has not been saved yet.
    */
  var width: Double = js.native
  /*
    * The saved x coordinate of the loaded state.
    * undefined if the state has not been saved yet.
    */
  var x: Double = js.native
  /*
    * The saved y coordinate of the loaded state.
    * undefined if the state has not been saved yet.
    */
  var y: Double = js.native
  /*
    * Register listeners on the given BrowserWindow for events that are related
    * to size or position changes (resize, move).
    * It will also restore the window's maximized or full screen state.
    * When the window is closed we automatically remove the listeners and save the state.
    */
  def manage(win: BrowserWindow): Unit = js.native
  /*
    * Saves the current state of the given BrowserWindow.
    * This exists mostly for legacy purposes, and in most cases it's better to just use manage.
    */
  def saveState(win: BrowserWindow): Unit = js.native
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
  @scala.inline
  implicit class WindowStateOps[Self <: WindowState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("isFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMaximized(value: Boolean): Self = this.set("isMaximized", value.asInstanceOf[js.Any])
    @scala.inline
    def setManage(value: BrowserWindow => Unit): Self = this.set("manage", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveState(value: BrowserWindow => Unit): Self = this.set("saveState", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

