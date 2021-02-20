package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.windows.CreateCreateData
import typings.firefoxWebextBrowser.browser.windows.GetAllGetInfo
import typings.firefoxWebextBrowser.browser.windows.GetInfo
import typings.firefoxWebextBrowser.browser.windows.UpdateUpdateInfo
import typings.firefoxWebextBrowser.browser.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object windows {
  
  /** The windowId value that represents the current window. */
  @JSGlobal("browser.windows.WINDOW_ID_CURRENT")
  @js.native
  val WINDOW_ID_CURRENT: Double = js.native
  
  /* windows properties */
  /** The windowId value that represents the absence of a browser window. */
  @JSGlobal("browser.windows.WINDOW_ID_NONE")
  @js.native
  val WINDOW_ID_NONE: Double = js.native
  
  /** Creates (opens) a new browser with any optional sizing, position or default URL provided. */
  @JSGlobal("browser.windows.create")
  @js.native
  def create(): js.Promise[Window] = js.native
  @JSGlobal("browser.windows.create")
  @js.native
  def create(createData: CreateCreateData): js.Promise[Window] = js.native
  
  /* windows functions */
  /** Gets details about a window. */
  @JSGlobal("browser.windows.get")
  @js.native
  def get(windowId: Double): js.Promise[Window] = js.native
  @JSGlobal("browser.windows.get")
  @js.native
  def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = js.native
  
  /**
    * Gets all windows.
    * @param [getInfo] Specifies properties used to filter the `windows.Window` returned and to determine whether they should contain a list of the `tabs.Tab` objects.
    */
  @JSGlobal("browser.windows.getAll")
  @js.native
  def getAll(): js.Promise[js.Array[Window]] = js.native
  @JSGlobal("browser.windows.getAll")
  @js.native
  def getAll(getInfo: GetAllGetInfo): js.Promise[js.Array[Window]] = js.native
  
  /** Gets the current window. */
  @JSGlobal("browser.windows.getCurrent")
  @js.native
  def getCurrent(): js.Promise[Window] = js.native
  @JSGlobal("browser.windows.getCurrent")
  @js.native
  def getCurrent(getInfo: GetInfo): js.Promise[Window] = js.native
  
  /** Gets the window that was most recently focused — typically the window 'on top'. */
  @JSGlobal("browser.windows.getLastFocused")
  @js.native
  def getLastFocused(): js.Promise[Window] = js.native
  @JSGlobal("browser.windows.getLastFocused")
  @js.native
  def getLastFocused(getInfo: GetInfo): js.Promise[Window] = js.native
  
  /* windows events */
  /**
    * Fired when a window is created.
    * @param window Details of the window that was created.
    */
  @JSGlobal("browser.windows.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* window */ Window, Unit]] = js.native
  
  /**
    * Fired when the currently focused window changes. Will be `windows.WINDOW_ID_NONE` if all browser windows have lost focus. Note: On some Linux window managers, WINDOW_ID_NONE will always be sent immediately preceding a switch from one browser window to another.
    * @param windowId ID of the newly focused window.
    */
  @JSGlobal("browser.windows.onFocusChanged")
  @js.native
  val onFocusChanged: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  /**
    * Fired when a window is removed (closed).
    * @param windowId ID of the removed window.
    */
  @JSGlobal("browser.windows.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  /** Removes (closes) a window, and all the tabs inside it. */
  @JSGlobal("browser.windows.remove")
  @js.native
  def remove(windowId: Double): js.Promise[Unit] = js.native
  
  /**
    * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties will be left unchanged.
    */
  @JSGlobal("browser.windows.update")
  @js.native
  def update(windowId: Double, updateInfo: UpdateUpdateInfo): js.Promise[Window] = js.native
}
