package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserWindow")
@js.native
class BrowserWindow () extends EventEmitter {
  def this(options: BrowserWindowConstructorOptions) = this()
  var id: scala.Double = js.native
  var webContents: WebContents = js.native
  @JSName("addListener")
  def `addListener_always-on-top-changed`(
    event: electronLib.electronLibStrings.`always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_app-command`(
    event: electronLib.electronLibStrings.`app-command`,
    listener: js.Function2[/* event */ Event, /* command */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_blur(event: electronLib.electronLibStrings.blur, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: electronLib.electronLibStrings.close, listener: js.Function1[/* event */ Event, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_closed(event: electronLib.electronLibStrings.closed, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_enter-full-screen`(event: electronLib.electronLibStrings.`enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_enter-html-full-screen`(event: electronLib.electronLibStrings.`enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_focus(event: electronLib.electronLibStrings.focus, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_hide(event: electronLib.electronLibStrings.hide, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_leave-full-screen`(event: electronLib.electronLibStrings.`leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_leave-html-full-screen`(event: electronLib.electronLibStrings.`leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_maximize(event: electronLib.electronLibStrings.maximize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_minimize(event: electronLib.electronLibStrings.minimize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_move(event: electronLib.electronLibStrings.move, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_moved(event: electronLib.electronLibStrings.moved, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_new-window-for-tab`(event: electronLib.electronLibStrings.`new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_page-title-updated`(
    event: electronLib.electronLibStrings.`page-title-updated`,
    listener: js.Function2[/* event */ Event, /* title */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_ready-to-show`(event: electronLib.electronLibStrings.`ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_resize(event: electronLib.electronLibStrings.resize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_restore(event: electronLib.electronLibStrings.restore, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_scroll-touch-begin`(event: electronLib.electronLibStrings.`scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_scroll-touch-edge`(event: electronLib.electronLibStrings.`scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_scroll-touch-end`(event: electronLib.electronLibStrings.`scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_session-end`(event: electronLib.electronLibStrings.`session-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_sheet-begin`(event: electronLib.electronLibStrings.`sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_sheet-end`(event: electronLib.electronLibStrings.`sheet-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: electronLib.electronLibStrings.show, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_swipe(
    event: electronLib.electronLibStrings.swipe,
    listener: js.Function2[/* event */ Event, /* direction */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unmaximize(event: electronLib.electronLibStrings.unmaximize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_will-move`(
    event: electronLib.electronLibStrings.`will-move`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_will-resize`(
    event: electronLib.electronLibStrings.`will-resize`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Adds a window as a tab on this window, after the tab for the window instance.
    */
  def addTabbedWindow(browserWindow: BrowserWindow): scala.Unit = js.native
  /**
    * Removes focus from the window.
    */
  def blur(): scala.Unit = js.native
  def blurWebView(): scala.Unit = js.native
  /**
    * Same as webContents.capturePage([rect, ]callback).
    */
  def capturePage(callback: js.Function1[/* image */ NativeImage, scala.Unit]): scala.Unit = js.native
  /**
    * Same as webContents.capturePage([rect, ]callback).
    */
  def capturePage(rect: Rectangle, callback: js.Function1[/* image */ NativeImage, scala.Unit]): scala.Unit = js.native
  /**
    * Moves window to the center of the screen.
    */
  def center(): scala.Unit = js.native
  /**
    * Try to close the window. This has the same effect as a user manually clicking
    * the close button of the window. The web page may cancel the close though. See
    * the close event.
    */
  def close(): scala.Unit = js.native
  /**
    * Closes the currently open Quick Look panel.
    */
  def closeFilePreview(): scala.Unit = js.native
  /**
    * Force closing the window, the unload and beforeunload event won't be emitted for
    * the web page, and close event will also not be emitted for this window, but it
    * guarantees the closed event will be emitted.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Starts or stops flashing the window to attract user's attention.
    */
  def flashFrame(flag: scala.Boolean): scala.Unit = js.native
  /**
    * Focuses on the window.
    */
  def focus(): scala.Unit = js.native
  def focusOnWebView(): scala.Unit = js.native
  def getBounds(): Rectangle = js.native
  /**
    * Note: The BrowserView API is currently experimental and may change or be removed
    * in future Electron releases.
    */
  def getBrowserView(): BrowserView | scala.Null = js.native
  def getChildWindows(): js.Array[BrowserWindow] = js.native
  def getContentBounds(): Rectangle = js.native
  def getContentSize(): js.Array[scala.Double] = js.native
  def getMaximumSize(): js.Array[scala.Double] = js.native
  def getMinimumSize(): js.Array[scala.Double] = js.native
  /**
    * The native type of the handle is HWND on Windows, NSView* on macOS, and Window
    * (unsigned long) on Linux.
    */
  def getNativeWindowHandle(): nodeLib.Buffer = js.native
  /**
    * Note: whatever the current state of the window : maximized, minimized or in
    * fullscreen, this function always returns the position and size of the window in
    * normal state. In normal state, getBounds and getNormalBounds returns the same
    * Rectangle.
    */
  def getNormalBounds(): Rectangle = js.native
  def getOpacity(): scala.Double = js.native
  def getParentWindow(): BrowserWindow = js.native
  def getPosition(): js.Array[scala.Double] = js.native
  def getRepresentedFilename(): java.lang.String = js.native
  def getSize(): js.Array[scala.Double] = js.native
  /**
    * Note: The title of web page can be different from the title of the native
    * window.
    */
  def getTitle(): java.lang.String = js.native
  /**
    * On Windows and Linux always returns true.
    */
  def hasShadow(): scala.Boolean = js.native
  /**
    * Hides the window.
    */
  def hide(): scala.Unit = js.native
  /**
    * Hooks a windows message. The callback is called when the message is received in
    * the WndProc.
    */
  def hookWindowMessage(message: scala.Double, callback: js.Function): scala.Unit = js.native
  def isAlwaysOnTop(): scala.Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isClosable(): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isDocumentEdited(): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def isFullScreen(): scala.Boolean = js.native
  def isFullScreenable(): scala.Boolean = js.native
  def isKiosk(): scala.Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMaximizable(): scala.Boolean = js.native
  def isMaximized(): scala.Boolean = js.native
  def isMenuBarAutoHide(): scala.Boolean = js.native
  def isMenuBarVisible(): scala.Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMinimizable(): scala.Boolean = js.native
  def isMinimized(): scala.Boolean = js.native
  def isModal(): scala.Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMovable(): scala.Boolean = js.native
  def isNormal(): scala.Boolean = js.native
  def isResizable(): scala.Boolean = js.native
  def isSimpleFullScreen(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  /**
    * Note: This API always returns false on Windows.
    */
  def isVisibleOnAllWorkspaces(): scala.Boolean = js.native
  def isWindowMessageHooked(message: scala.Double): scala.Boolean = js.native
  /**
    * Same as webContents.loadFile, filePath should be a path to an HTML file relative
    * to the root of your application.  See the webContents docs for more information.
    */
  def loadFile(filePath: java.lang.String): scala.Unit = js.native
  def loadFile(filePath: java.lang.String, options: LoadFileOptions): scala.Unit = js.native
  /**
    * Same as webContents.loadURL(url[, options]). The url can be a remote address
    * (e.g. http://) or a path to a local HTML file using the file:// protocol. To
    * ensure that file URLs are properly formatted, it is recommended to use Node's
    * url.format method: You can load a URL using a POST request with URL-encoded data
    * by doing the following:
    */
  def loadURL(url: java.lang.String): scala.Unit = js.native
  def loadURL(url: java.lang.String, options: LoadURLOptions): scala.Unit = js.native
  /**
    * Maximizes the window. This will also show (but not focus) the window if it isn't
    * being displayed already.
    */
  def maximize(): scala.Unit = js.native
  /**
    * Merges all windows into one window with multiple tabs when native tabs are
    * enabled and there is more than one open window.
    */
  def mergeAllWindows(): scala.Unit = js.native
  /**
    * Minimizes the window. On some platforms the minimized window will be shown in
    * the Dock.
    */
  def minimize(): scala.Unit = js.native
  /**
    * Moves the current tab into a new window if native tabs are enabled and there is
    * more than one tab in the current window.
    */
  def moveTabToNewWindow(): scala.Unit = js.native
  /**
    * Moves window to top(z-order) regardless of focus
    */
  def moveTop(): scala.Unit = js.native
  // Docs: http://electronjs.org/docs/api/browser-window
  /**
    * Emitted when the window is set or unset to show always on top of other windows.
    */
  @JSName("on")
  def `on_always-on-top-changed`(
    event: electronLib.electronLibStrings.`always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when an App Command is invoked. These are typically related to keyboard
    * media keys or browser commands, as well as the "Back" button built into some
    * mice on Windows. Commands are lowercased, underscores are replaced with hyphens,
    * and the APPCOMMAND_ prefix is stripped off. e.g. APPCOMMAND_BROWSER_BACKWARD is
    * emitted as browser-backward.
    */
  @JSName("on")
  def `on_app-command`(
    event: electronLib.electronLibStrings.`app-command`,
    listener: js.Function2[/* event */ Event, /* command */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the window loses focus.
    */
  @JSName("on")
  def on_blur(event: electronLib.electronLibStrings.blur, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is going to be closed. It's emitted before the
    * beforeunload and unload event of the DOM. Calling event.preventDefault() will
    * cancel the close. Usually you would want to use the beforeunload handler to
    * decide whether the window should be closed, which will also be called when the
    * window is reloaded. In Electron, returning any value other than undefined would
    * cancel the close. For example: Note: There is a subtle difference between the
    * behaviors of window.onbeforeunload = handler and
    * window.addEventListener('beforeunload', handler). It is recommended to always
    * set the event.returnValue explicitly, instead of only returning a value, as the
    * former works more consistently within Electron.
    */
  @JSName("on")
  def on_close(event: electronLib.electronLibStrings.close, listener: js.Function1[/* event */ Event, scala.Unit]): this.type = js.native
  /**
    * Emitted when the window is closed. After you have received this event you should
    * remove the reference to the window and avoid using it any more.
    */
  @JSName("on")
  def on_closed(event: electronLib.electronLibStrings.closed, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state.
    */
  @JSName("on")
  def `on_enter-full-screen`(event: electronLib.electronLibStrings.`enter-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def `on_enter-html-full-screen`(event: electronLib.electronLibStrings.`enter-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window gains focus.
    */
  @JSName("on")
  def on_focus(event: electronLib.electronLibStrings.focus, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is hidden.
    */
  @JSName("on")
  def on_hide(event: electronLib.electronLibStrings.hide, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state.
    */
  @JSName("on")
  def `on_leave-full-screen`(event: electronLib.electronLibStrings.`leave-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def `on_leave-html-full-screen`(event: electronLib.electronLibStrings.`leave-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when window is maximized.
    */
  @JSName("on")
  def on_maximize(event: electronLib.electronLibStrings.maximize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is minimized.
    */
  @JSName("on")
  def on_minimize(event: electronLib.electronLibStrings.minimize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is being moved to a new position. Note: On macOS this
    * event is an alias of moved.
    */
  @JSName("on")
  def on_move(event: electronLib.electronLibStrings.move, listener: js.Function): this.type = js.native
  /**
    * Emitted once when the window is moved to a new position.
    */
  @JSName("on")
  def on_moved(event: electronLib.electronLibStrings.moved, listener: js.Function): this.type = js.native
  /**
    * Emitted when the native new tab button is clicked.
    */
  @JSName("on")
  def `on_new-window-for-tab`(event: electronLib.electronLibStrings.`new-window-for-tab`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the document changed its title, calling event.preventDefault() will
    * prevent the native window's title from changing.
    */
  @JSName("on")
  def `on_page-title-updated`(
    event: electronLib.electronLibStrings.`page-title-updated`,
    listener: js.Function2[/* event */ Event, /* title */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the web page has been rendered (while not being shown) and window
    * can be displayed without a visual flash.
    */
  @JSName("on")
  def `on_ready-to-show`(event: electronLib.electronLibStrings.`ready-to-show`, listener: js.Function): this.type = js.native
  /**
    * Emitted after the window has been resized.
    */
  @JSName("on")
  def on_resize(event: electronLib.electronLibStrings.resize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  def on_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is restored from a minimized state.
    */
  @JSName("on")
  def on_restore(event: electronLib.electronLibStrings.restore, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has begun.
    */
  @JSName("on")
  def `on_scroll-touch-begin`(event: electronLib.electronLibStrings.`scroll-touch-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase filed upon reaching the edge of element.
    */
  @JSName("on")
  def `on_scroll-touch-edge`(event: electronLib.electronLibStrings.`scroll-touch-edge`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has ended.
    */
  @JSName("on")
  def `on_scroll-touch-end`(event: electronLib.electronLibStrings.`scroll-touch-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when window session is going to end due to force shutdown or machine
    * restart or session log off.
    */
  @JSName("on")
  def `on_session-end`(event: electronLib.electronLibStrings.`session-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window opens a sheet.
    */
  @JSName("on")
  def `on_sheet-begin`(event: electronLib.electronLibStrings.`sheet-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window has closed a sheet.
    */
  @JSName("on")
  def `on_sheet-end`(event: electronLib.electronLibStrings.`sheet-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is shown.
    */
  @JSName("on")
  def on_show(event: electronLib.electronLibStrings.show, listener: js.Function): this.type = js.native
  /**
    * Emitted on 3-finger swipe. Possible directions are up, right, down, left.
    */
  @JSName("on")
  def on_swipe(
    event: electronLib.electronLibStrings.swipe,
    listener: js.Function2[/* event */ Event, /* direction */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the window exits from a maximized state.
    */
  @JSName("on")
  def on_unmaximize(event: electronLib.electronLibStrings.unmaximize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  def on_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  /**
    * Emitted before the window is moved. Calling event.preventDefault() will prevent
    * the window from being moved. Note that this is only emitted when the window is
    * being resized manually. Resizing the window with setBounds/setSize will not emit
    * this event.
    */
  @JSName("on")
  def `on_will-move`(
    event: electronLib.electronLibStrings.`will-move`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted before the window is resized. Calling event.preventDefault() will
    * prevent the window from being resized. Note that this is only emitted when the
    * window is being resized manually. Resizing the window with setBounds/setSize
    * will not emit this event.
    */
  @JSName("on")
  def `on_will-resize`(
    event: electronLib.electronLibStrings.`will-resize`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_always-on-top-changed`(
    event: electronLib.electronLibStrings.`always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_app-command`(
    event: electronLib.electronLibStrings.`app-command`,
    listener: js.Function2[/* event */ Event, /* command */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_blur(event: electronLib.electronLibStrings.blur, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: electronLib.electronLibStrings.close, listener: js.Function1[/* event */ Event, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_closed(event: electronLib.electronLibStrings.closed, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_enter-full-screen`(event: electronLib.electronLibStrings.`enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_enter-html-full-screen`(event: electronLib.electronLibStrings.`enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_focus(event: electronLib.electronLibStrings.focus, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_hide(event: electronLib.electronLibStrings.hide, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_leave-full-screen`(event: electronLib.electronLibStrings.`leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_leave-html-full-screen`(event: electronLib.electronLibStrings.`leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_maximize(event: electronLib.electronLibStrings.maximize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_minimize(event: electronLib.electronLibStrings.minimize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_move(event: electronLib.electronLibStrings.move, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_moved(event: electronLib.electronLibStrings.moved, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_new-window-for-tab`(event: electronLib.electronLibStrings.`new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_page-title-updated`(
    event: electronLib.electronLibStrings.`page-title-updated`,
    listener: js.Function2[/* event */ Event, /* title */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_ready-to-show`(event: electronLib.electronLibStrings.`ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_resize(event: electronLib.electronLibStrings.resize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_restore(event: electronLib.electronLibStrings.restore, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_scroll-touch-begin`(event: electronLib.electronLibStrings.`scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_scroll-touch-edge`(event: electronLib.electronLibStrings.`scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_scroll-touch-end`(event: electronLib.electronLibStrings.`scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_session-end`(event: electronLib.electronLibStrings.`session-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_sheet-begin`(event: electronLib.electronLibStrings.`sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_sheet-end`(event: electronLib.electronLibStrings.`sheet-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_show(event: electronLib.electronLibStrings.show, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_swipe(
    event: electronLib.electronLibStrings.swipe,
    listener: js.Function2[/* event */ Event, /* direction */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unmaximize(event: electronLib.electronLibStrings.unmaximize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_will-move`(
    event: electronLib.electronLibStrings.`will-move`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-resize`(
    event: electronLib.electronLibStrings.`will-resize`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Uses Quick Look to preview a file at a given path.
    */
  def previewFile(path: java.lang.String): scala.Unit = js.native
  def previewFile(path: java.lang.String, displayName: java.lang.String): scala.Unit = js.native
  /**
    * Same as webContents.reload.
    */
  def reload(): scala.Unit = js.native
  @JSName("removeListener")
  def `removeListener_always-on-top-changed`(
    event: electronLib.electronLibStrings.`always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_app-command`(
    event: electronLib.electronLibStrings.`app-command`,
    listener: js.Function2[/* event */ Event, /* command */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_blur(event: electronLib.electronLibStrings.blur, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: electronLib.electronLibStrings.close, listener: js.Function1[/* event */ Event, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_closed(event: electronLib.electronLibStrings.closed, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_enter-full-screen`(event: electronLib.electronLibStrings.`enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_enter-html-full-screen`(event: electronLib.electronLibStrings.`enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_focus(event: electronLib.electronLibStrings.focus, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_hide(event: electronLib.electronLibStrings.hide, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_leave-full-screen`(event: electronLib.electronLibStrings.`leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_leave-html-full-screen`(event: electronLib.electronLibStrings.`leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_maximize(event: electronLib.electronLibStrings.maximize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_minimize(event: electronLib.electronLibStrings.minimize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_move(event: electronLib.electronLibStrings.move, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_moved(event: electronLib.electronLibStrings.moved, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_new-window-for-tab`(event: electronLib.electronLibStrings.`new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_page-title-updated`(
    event: electronLib.electronLibStrings.`page-title-updated`,
    listener: js.Function2[/* event */ Event, /* title */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_ready-to-show`(event: electronLib.electronLibStrings.`ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_resize(event: electronLib.electronLibStrings.resize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_restore(event: electronLib.electronLibStrings.restore, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_scroll-touch-begin`(event: electronLib.electronLibStrings.`scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_scroll-touch-edge`(event: electronLib.electronLibStrings.`scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_scroll-touch-end`(event: electronLib.electronLibStrings.`scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_session-end`(event: electronLib.electronLibStrings.`session-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_sheet-begin`(event: electronLib.electronLibStrings.`sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_sheet-end`(event: electronLib.electronLibStrings.`sheet-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: electronLib.electronLibStrings.show, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_swipe(
    event: electronLib.electronLibStrings.swipe,
    listener: js.Function2[/* event */ Event, /* direction */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unmaximize(event: electronLib.electronLibStrings.unmaximize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-move`(
    event: electronLib.electronLibStrings.`will-move`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-resize`(
    event: electronLib.electronLibStrings.`will-resize`,
    listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Restores the window from minimized state to its previous state.
    */
  def restore(): scala.Unit = js.native
  /**
    * Selects the next tab when native tabs are enabled and there are other tabs in
    * the window.
    */
  def selectNextTab(): scala.Unit = js.native
  /**
    * Selects the previous tab when native tabs are enabled and there are other tabs
    * in the window.
    */
  def selectPreviousTab(): scala.Unit = js.native
  /**
    * Sets whether the window should show always on top of other windows. After
    * setting this, the window is still a normal window, not a toolbox window which
    * can not be focused on.
    */
  def setAlwaysOnTop(flag: scala.Boolean): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_floating(flag: scala.Boolean, level: electronLib.electronLibStrings.floating): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_floating(flag: scala.Boolean, level: electronLib.electronLibStrings.floating, relativeLevel: scala.Double): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_main-menu`(flag: scala.Boolean, level: electronLib.electronLibStrings.`main-menu`): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_main-menu`(
    flag: scala.Boolean,
    level: electronLib.electronLibStrings.`main-menu`,
    relativeLevel: scala.Double
  ): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_modal-panel`(flag: scala.Boolean, level: electronLib.electronLibStrings.`modal-panel`): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_modal-panel`(
    flag: scala.Boolean,
    level: electronLib.electronLibStrings.`modal-panel`,
    relativeLevel: scala.Double
  ): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_normal(flag: scala.Boolean, level: electronLib.electronLibStrings.normal): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_normal(flag: scala.Boolean, level: electronLib.electronLibStrings.normal, relativeLevel: scala.Double): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_pop-up-menu`(flag: scala.Boolean, level: electronLib.electronLibStrings.`pop-up-menu`): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_pop-up-menu`(
    flag: scala.Boolean,
    level: electronLib.electronLibStrings.`pop-up-menu`,
    relativeLevel: scala.Double
  ): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_screen-saver`(flag: scala.Boolean, level: electronLib.electronLibStrings.`screen-saver`): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_screen-saver`(
    flag: scala.Boolean,
    level: electronLib.electronLibStrings.`screen-saver`,
    relativeLevel: scala.Double
  ): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_status(flag: scala.Boolean, level: electronLib.electronLibStrings.status): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_status(flag: scala.Boolean, level: electronLib.electronLibStrings.status, relativeLevel: scala.Double): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_torn-off-menu`(flag: scala.Boolean, level: electronLib.electronLibStrings.`torn-off-menu`): scala.Unit = js.native
  @JSName("setAlwaysOnTop")
  def `setAlwaysOnTop_torn-off-menu`(
    flag: scala.Boolean,
    level: electronLib.electronLibStrings.`torn-off-menu`,
    relativeLevel: scala.Double
  ): scala.Unit = js.native
  /**
    * Sets the properties for the window's taskbar button. Note: relaunchCommand and
    * relaunchDisplayName must always be set together. If one of those properties is
    * not set, then neither will be used.
    */
  def setAppDetails(options: AppDetailsOptions): scala.Unit = js.native
  /**
    * This will make a window maintain an aspect ratio. The extra size allows a
    * developer to have space, specified in pixels, not included within the aspect
    * ratio calculations. This API already takes into account the difference between a
    * window's size and its content size. Consider a normal window with an HD video
    * player and associated controls. Perhaps there are 15 pixels of controls on the
    * left edge, 25 pixels of controls on the right edge and 50 pixels of controls
    * below the player. In order to maintain a 16:9 aspect ratio (standard aspect
    * ratio for HD @1920x1080) within the player itself we would call this function
    * with arguments of 16/9 and [ 40, 50 ]. The second argument doesn't care where
    * the extra width and height are within the content view--only that they exist.
    * Sum any extra width and height areas you have within the overall content view.
    * Calling this function with a value of 0 will remove any previously set aspect
    * ratios.
    */
  def setAspectRatio(aspectRatio: scala.Double, extraSize: Size): scala.Unit = js.native
  /**
    * Controls whether to hide cursor when typing.
    */
  def setAutoHideCursor(autoHide: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the window menu bar should hide itself automatically. Once set the
    * menu bar will only show when users press the single Alt key. If the menu bar is
    * already visible, calling setAutoHideMenuBar(true) won't hide it immediately.
    */
  def setAutoHideMenuBar(hide: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the background color of the window. See Setting backgroundColor.
    */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
    * Resizes and moves the window to the supplied bounds. Any properties that are not
    * supplied will default to their current values.
    */
  def setBounds(bounds: Rectangle): scala.Unit = js.native
  def setBounds(bounds: Rectangle, animate: scala.Boolean): scala.Unit = js.native
  def setBrowserView(browserView: BrowserView): scala.Unit = js.native
  /**
    * Sets whether the window can be manually closed by user. On Linux does nothing.
    */
  def setClosable(closable: scala.Boolean): scala.Unit = js.native
  /**
    * Resizes and moves the window's client area (e.g. the web page) to the supplied
    * bounds.
    */
  def setContentBounds(bounds: Rectangle): scala.Unit = js.native
  def setContentBounds(bounds: Rectangle, animate: scala.Boolean): scala.Unit = js.native
  /**
    * Prevents the window contents from being captured by other apps. On macOS it sets
    * the NSWindow's sharingType to NSWindowSharingNone. On Windows it calls
    * SetWindowDisplayAffinity with WDA_MONITOR.
    */
  def setContentProtection(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Resizes the window's client area (e.g. the web page) to width and height.
    */
  def setContentSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setContentSize(width: scala.Double, height: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies whether the window’s document has been edited, and the icon in title
    * bar will become gray when set to true.
    */
  def setDocumentEdited(edited: scala.Boolean): scala.Unit = js.native
  /**
    * Disable or enable the window.
    */
  def setEnabled(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Changes whether the window can be focused.
    */
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the window should be in fullscreen mode.
    */
  def setFullScreen(flag: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the maximize/zoom window button toggles fullscreen mode or
    * maximizes the window.
    */
  def setFullScreenable(fullscreenable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the window should have a shadow. On Windows and Linux does nothing.
    */
  def setHasShadow(hasShadow: scala.Boolean): scala.Unit = js.native
  /**
    * Changes window icon.
    */
  def setIcon(icon: NativeImage): scala.Unit = js.native
  /**
    * Makes the window ignore all mouse events. All mouse events happened in this
    * window will be passed to the window below this window, but if this window has
    * focus, it will still receive keyboard events.
    */
  def setIgnoreMouseEvents(ignore: scala.Boolean): scala.Unit = js.native
  def setIgnoreMouseEvents(ignore: scala.Boolean, options: IgnoreMouseEventsOptions): scala.Unit = js.native
  /**
    * Enters or leaves the kiosk mode.
    */
  def setKiosk(flag: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the window can be manually maximized by user. On Linux does
    * nothing.
    */
  def setMaximizable(maximizable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the maximum size of window to width and height.
    */
  def setMaximumSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setMenu(): scala.Unit = js.native
  /**
    * Sets the menu as the window's menu bar, setting it to null will remove the menu
    * bar.
    */
  def setMenu(menu: Menu): scala.Unit = js.native
  /**
    * Sets whether the menu bar should be visible. If the menu bar is auto-hide, users
    * can still bring up the menu bar by pressing the single Alt key.
    */
  def setMenuBarVisibility(visible: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether the window can be manually minimized by user. On Linux does
    * nothing.
    */
  def setMinimizable(minimizable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the minimum size of window to width and height.
    */
  def setMinimumSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Sets whether the window can be moved by user. On Linux does nothing.
    */
  def setMovable(movable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the opacity of the window. On Linux does nothing.
    */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
    * Sets a 16 x 16 pixel overlay onto the current taskbar icon, usually used to
    * convey some sort of application status or to passively notify the user.
    */
  def setOverlayIcon(overlay: NativeImage, description: java.lang.String): scala.Unit = js.native
  def setOverlayIcon(overlay: scala.Null, description: java.lang.String): scala.Unit = js.native
  /**
    * Sets parent as current window's parent window, passing null will turn current
    * window into a top-level window.
    */
  def setParentWindow(parent: BrowserWindow): scala.Unit = js.native
  /**
    * Moves window to x and y.
    */
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  /**
    * Sets progress value in progress bar. Valid range is [0, 1.0]. Remove progress
    * bar when progress < 0; Change to indeterminate mode when progress > 1. On Linux
    * platform, only supports Unity desktop environment, you need to specify the
    * *.desktop file name to desktopName field in package.json. By default, it will
    * assume app.getName().desktop. On Windows, a mode can be passed. Accepted values
    * are none, normal, indeterminate, error, and paused. If you call setProgressBar
    * without a mode set (but with a value within the valid range), normal will be
    * assumed.
    */
  def setProgressBar(progress: scala.Double): scala.Unit = js.native
  def setProgressBar(progress: scala.Double, options: ProgressBarOptions): scala.Unit = js.native
  /**
    * Sets the pathname of the file the window represents, and the icon of the file
    * will show in window's title bar.
    */
  def setRepresentedFilename(filename: java.lang.String): scala.Unit = js.native
  /**
    * Sets whether the window can be manually resized by user.
    */
  def setResizable(resizable: scala.Boolean): scala.Unit = js.native
  /**
    * Setting a window shape determines the area within the window where the system
    * permits drawing and user interaction. Outside of the given region, no pixels
    * will be drawn and no mouse events will be registered. Mouse events outside of
    * the region will not be received by that window, but will fall through to
    * whatever is behind the window.
    */
  def setShape(rects: js.Array[Rectangle]): scala.Unit = js.native
  /**
    * Changes the attachment point for sheets on macOS. By default, sheets are
    * attached just below the window frame, but you may want to display them beneath a
    * HTML-rendered toolbar. For example:
    */
  def setSheetOffset(offsetY: scala.Double): scala.Unit = js.native
  def setSheetOffset(offsetY: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  /**
    * Enters or leaves simple fullscreen mode. Simple fullscreen mode emulates the
    * native fullscreen behavior found in versions of Mac OS X prior to Lion (10.7).
    */
  def setSimpleFullScreen(flag: scala.Boolean): scala.Unit = js.native
  /**
    * Resizes the window to width and height. If width or height are below any set
    * minimum size constraints the window will snap to its minimum size.
    */
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  /**
    * Makes the window not show in the taskbar.
    */
  def setSkipTaskbar(skip: scala.Boolean): scala.Unit = js.native
  /**
    * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
    * of a window in a taskbar button layout. Returns a Boolean object indicates
    * whether the thumbnail has been added successfully. The number of buttons in
    * thumbnail toolbar should be no greater than 7 due to the limited room. Once you
    * setup the thumbnail toolbar, the toolbar cannot be removed due to the platform's
    * limitation. But you can call the API with an empty array to clean the buttons.
    * The buttons is an array of Button objects: The flags is an array that can
    * include following Strings:
    */
  def setThumbarButtons(buttons: js.Array[ThumbarButton]): scala.Boolean = js.native
  /**
    * Sets the region of the window to show as the thumbnail image displayed when
    * hovering over the window in the taskbar. You can reset the thumbnail to be the
    * entire window by specifying an empty region: { x: 0, y: 0, width: 0, height: 0
    * }.
    */
  def setThumbnailClip(region: Rectangle): scala.Unit = js.native
  /**
    * Sets the toolTip that is displayed when hovering over the window thumbnail in
    * the taskbar.
    */
  def setThumbnailToolTip(toolTip: java.lang.String): scala.Unit = js.native
  /**
    * Changes the title of native window to title.
    */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
    * Sets the touchBar layout for the current window. Specifying null or undefined
    * clears the touch bar. This method only has an effect if the machine has a touch
    * bar and is running on macOS 10.12.1+. Note: The TouchBar API is currently
    * experimental and may change or be removed in future Electron releases.
    */
  def setTouchBar(touchBar: TouchBar): scala.Unit = js.native
  /**
    * Adds a vibrancy effect to the browser window. Passing null or an empty string
    * will remove the vibrancy effect on the window.
    */
  def setVibrancy(
    `type`: electronLib.electronLibStrings.`appearance-based` | electronLib.electronLibStrings.light | electronLib.electronLibStrings.dark | electronLib.electronLibStrings.titlebar | electronLib.electronLibStrings.selection | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.popover | electronLib.electronLibStrings.sidebar | electronLib.electronLibStrings.`medium-light` | electronLib.electronLibStrings.`ultra-dark`
  ): scala.Unit = js.native
  /**
    * Sets whether the window should be visible on all workspaces. Note: This API does
    * nothing on Windows.
    */
  def setVisibleOnAllWorkspaces(visible: scala.Boolean): scala.Unit = js.native
  def setVisibleOnAllWorkspaces(visible: scala.Boolean, options: VisibleOnAllWorkspacesOptions): scala.Unit = js.native
  /**
    * Sets whether the window traffic light buttons should be visible. This cannot be
    * called when titleBarStyle is set to customButtonsOnHover.
    */
  def setWindowButtonVisibility(visible: scala.Boolean): scala.Unit = js.native
  /**
    * Shows and gives focus to the window.
    */
  def show(): scala.Unit = js.native
  /**
    * Same as webContents.showDefinitionForSelection().
    */
  def showDefinitionForSelection(): scala.Unit = js.native
  /**
    * Shows the window but doesn't focus on it.
    */
  def showInactive(): scala.Unit = js.native
  /**
    * Toggles the visibility of the tab bar if native tabs are enabled and there is
    * only one tab in the current window.
    */
  def toggleTabBar(): scala.Unit = js.native
  /**
    * Unhooks all of the window messages.
    */
  def unhookAllWindowMessages(): scala.Unit = js.native
  /**
    * Unhook the window message.
    */
  def unhookWindowMessage(message: scala.Double): scala.Unit = js.native
  /**
    * Unmaximizes the window.
    */
  def unmaximize(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Electron.BrowserWindow")
@js.native
object BrowserWindow extends js.Object {
  /**
    * Adds DevTools extension located at path, and returns extension's name. The
    * extension will be remembered so you only need to call this API once, this API is
    * not for programming use. If you try to add an extension that has already been
    * loaded, this method will not return and instead log a warning to the console.
    * The method will also not return if the extension's manifest is missing or
    * incomplete. Note: This API cannot be called before the ready event of the app
    * module is emitted.
    */
  def addDevToolsExtension(path: java.lang.String): scala.Unit = js.native
  /**
    * Adds Chrome extension located at path, and returns extension's name. The method
    * will also not return if the extension's manifest is missing or incomplete. Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def addExtension(path: java.lang.String): scala.Unit = js.native
  def fromBrowserView(browserView: electronLib.ElectronNs.BrowserView): electronLib.ElectronNs.BrowserWindow | scala.Null = js.native
  def fromId(id: scala.Double): electronLib.ElectronNs.BrowserWindow = js.native
  def fromWebContents(webContents: electronLib.ElectronNs.WebContents): electronLib.ElectronNs.BrowserWindow = js.native
  def getAllWindows(): js.Array[electronLib.ElectronNs.BrowserWindow] = js.native
  /**
    * To check if a DevTools extension is installed you can run the following: Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def getDevToolsExtensions(): electronLib.ElectronNs.DevToolsExtensions = js.native
  /**
    * Note: This API cannot be called before the ready event of the app module is
    * emitted.
    */
  def getExtensions(): electronLib.ElectronNs.Extensions = js.native
  def getFocusedWindow(): electronLib.ElectronNs.BrowserWindow | scala.Null = js.native
  /**
    * Remove a DevTools extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeDevToolsExtension(name: java.lang.String): scala.Unit = js.native
  /**
    * Remove a Chrome extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeExtension(name: java.lang.String): scala.Unit = js.native
}

