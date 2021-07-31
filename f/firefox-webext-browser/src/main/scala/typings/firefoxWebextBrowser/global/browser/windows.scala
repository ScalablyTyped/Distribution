package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.windows.CreateCreateData
import typings.firefoxWebextBrowser.browser.windows.GetAllGetInfo
import typings.firefoxWebextBrowser.browser.windows.GetInfo
import typings.firefoxWebextBrowser.browser.windows.UpdateUpdateInfo
import typings.firefoxWebextBrowser.browser.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object windows {
  
  @JSGlobal("browser.windows")
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def create(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[Window]]
  @scala.inline
  def create(createData: CreateCreateData): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  /* windows functions */
  /** Gets details about a window. */
  @scala.inline
  def get(windowId: Double): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  @scala.inline
  def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowId.asInstanceOf[js.Any], getInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
  
  /**
    * Gets all windows.
    * @param [getInfo] Specifies properties used to filter the `windows.Window` returned and to determine whether they should contain a list of the `tabs.Tab` objects.
    */
  @scala.inline
  def getAll(): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Window]]]
  @scala.inline
  def getAll(getInfo: GetAllGetInfo): js.Promise[js.Array[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Window]]]
  
  /** Gets the current window. */
  @scala.inline
  def getCurrent(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[Window]]
  @scala.inline
  def getCurrent(getInfo: GetInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  /** Gets the window that was most recently focused — typically the window 'on top'. */
  @scala.inline
  def getLastFocused(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")().asInstanceOf[js.Promise[Window]]
  @scala.inline
  def getLastFocused(getInfo: GetInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocused")(getInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
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
  @scala.inline
  def remove(windowId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties will be left unchanged.
    */
  @scala.inline
  def update(windowId: Double, updateInfo: UpdateUpdateInfo): js.Promise[Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], updateInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Window]]
}
