package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.windows.GetInfo
import typings.firefoxWebextBrowser.browser.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwindows extends js.Object {
  /** The windowId value that represents the current window. */
  val WINDOW_ID_CURRENT: Double = js.native
  /* windows properties */
  /** The windowId value that represents the absence of a browser window. */
  val WINDOW_ID_NONE: Double = js.native
  /* windows events */
  /**
    * Fired when a window is created.
    * @param window Details of the window that was created.
    */
  val onCreated: WebExtEvent[js.Function1[/* window */ this.type, Unit]] = js.native
  /**
    * Fired when the currently focused window changes. Will be `windows.WINDOW_ID_NONE` if all browser windows have
    * lost focus. Note: On some Linux window managers, WINDOW_ID_NONE will always be sent immediately preceding a
    * switch from one browser window to another.
    * @param windowId ID of the newly focused window.
    */
  val onFocusChanged: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  /**
    * Fired when a window is removed (closed).
    * @param windowId ID of the removed window.
    */
  val onRemoved: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  /** Creates (opens) a new browser with any optional sizing, position or default URL provided. */
  def create(): js.Promise[Window] = js.native
  def create(createData: AllowScriptsToClose): js.Promise[Window] = js.native
  /* windows functions */
  /** Gets details about a window. */
  def get(windowId: Double): js.Promise[Window] = js.native
  def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = js.native
  /**
    * Gets all windows.
    * @param [getInfo] Specifies properties used to filter the `windows.Window` returned and to determine whether they
    *     should contain a list of the `tabs.Tab` objects.
    */
  def getAll(): js.Promise[js.Array[Window]] = js.native
  def getAll(getInfo: WindowTypes): js.Promise[js.Array[Window]] = js.native
  /** Gets the current window. */
  def getCurrent(): js.Promise[Window] = js.native
  def getCurrent(getInfo: GetInfo): js.Promise[Window] = js.native
  /** Gets the window that was most recently focused — typically the window 'on top'. */
  def getLastFocused(): js.Promise[Window] = js.native
  def getLastFocused(getInfo: GetInfo): js.Promise[Window] = js.native
  /** Removes (closes) a window, and all the tabs inside it. */
  def remove(windowId: Double): js.Promise[Unit] = js.native
  /**
    * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties
    * will be left unchanged.
    */
  def update(windowId: Double, updateInfo: DrawAttention): js.Promise[Window] = js.native
}

