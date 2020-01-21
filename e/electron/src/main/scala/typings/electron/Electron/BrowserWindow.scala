package typings.electron.Electron

import typings.electron.electronStrings.`always-on-top-changed`
import typings.electron.electronStrings.`app-command`
import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`enter-full-screen`
import typings.electron.electronStrings.`enter-html-full-screen`
import typings.electron.electronStrings.`leave-full-screen`
import typings.electron.electronStrings.`leave-html-full-screen`
import typings.electron.electronStrings.`main-menu`
import typings.electron.electronStrings.`medium-light`
import typings.electron.electronStrings.`modal-panel`
import typings.electron.electronStrings.`new-window-for-tab`
import typings.electron.electronStrings.`page-title-updated`
import typings.electron.electronStrings.`pop-up-menu`
import typings.electron.electronStrings.`ready-to-show`
import typings.electron.electronStrings.`screen-saver`
import typings.electron.electronStrings.`scroll-touch-begin`
import typings.electron.electronStrings.`scroll-touch-edge`
import typings.electron.electronStrings.`scroll-touch-end`
import typings.electron.electronStrings.`session-end`
import typings.electron.electronStrings.`sheet-begin`
import typings.electron.electronStrings.`sheet-end`
import typings.electron.electronStrings.`torn-off-menu`
import typings.electron.electronStrings.`ultra-dark`
import typings.electron.electronStrings.`will-move`
import typings.electron.electronStrings.`will-resize`
import typings.electron.electronStrings.blur
import typings.electron.electronStrings.close
import typings.electron.electronStrings.closed
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.floating
import typings.electron.electronStrings.focus
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.light
import typings.electron.electronStrings.maximize
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.minimize
import typings.electron.electronStrings.move
import typings.electron.electronStrings.moved
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.resize
import typings.electron.electronStrings.responsive
import typings.electron.electronStrings.restore
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.show
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.status
import typings.electron.electronStrings.swipe
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.unmaximize
import typings.electron.electronStrings.unresponsive
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.BrowserWindow")
@js.native
class BrowserWindow () extends EventEmitter {
  def this(options: BrowserWindowConstructorOptions) = this()
  var id: Double = js.native
  var webContents: WebContents_ = js.native
  /**
    * Replacement API for setBrowserView supporting work with multi browser views.
    */
  def addBrowserView(browserView: BrowserView): Unit = js.native
  @JSName("addListener")
  def addListener_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_appcommand(event: `app-command`, listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_blur(event: blur, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_closed(event: closed, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_enterfullscreen(event: `enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_focus(event: focus, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_hide(event: hide, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_leavefullscreen(event: `leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_maximize(event: maximize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_minimize(event: minimize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_move(event: move, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_moved(event: moved, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_readytoshow(event: `ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_resize(event: resize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_restore(event: restore, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_scrolltouchbegin(event: `scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_scrolltouchedge(event: `scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_scrolltouchend(event: `scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_sessionend(event: `session-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_sheetbegin(event: `sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_sheetend(event: `sheet-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: show, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_swipe(event: swipe, listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unmaximize(event: unmaximize, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_willmove(event: `will-move`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_willresize(event: `will-resize`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  /**
    * Adds a window as a tab on this window, after the tab for the window instance.
    */
  def addTabbedWindow(browserWindow: BrowserWindow): Unit = js.native
  /**
    * Removes focus from the window.
    */
  def blur(): Unit = js.native
  def blurWebView(): Unit = js.native
  /**
    * Captures a snapshot of the page within rect. Omitting rect will capture the
    * whole visible page.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  /**
    * Captures a snapshot of the page within rect. Upon completion callback will be
    * called with callback(image). The image is an instance of NativeImage that stores
    * data of the snapshot. Omitting rect will capture the whole visible page.
    * Deprecated Soon
    */
  def capturePage(callback: js.Function1[/* image */ NativeImage_, Unit]): Unit = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
  /**
    * Captures a snapshot of the page within rect. Upon completion callback will be
    * called with callback(image). The image is an instance of NativeImage that stores
    * data of the snapshot. Omitting rect will capture the whole visible page.
    * Deprecated Soon
    */
  def capturePage(rect: Rectangle, callback: js.Function1[/* image */ NativeImage_, Unit]): Unit = js.native
  /**
    * Moves window to the center of the screen.
    */
  def center(): Unit = js.native
  /**
    * Try to close the window. This has the same effect as a user manually clicking
    * the close button of the window. The web page may cancel the close though. See
    * the close event.
    */
  def close(): Unit = js.native
  /**
    * Closes the currently open Quick Look panel.
    */
  def closeFilePreview(): Unit = js.native
  /**
    * Force closing the window, the unload and beforeunload event won't be emitted for
    * the web page, and close event will also not be emitted for this window, but it
    * guarantees the closed event will be emitted.
    */
  def destroy(): Unit = js.native
  /**
    * Starts or stops flashing the window to attract user's attention.
    */
  def flashFrame(flag: Boolean): Unit = js.native
  /**
    * Focuses on the window.
    */
  def focus(): Unit = js.native
  def focusOnWebView(): Unit = js.native
  def getBounds(): Rectangle = js.native
  def getBrowserView(): BrowserView | Null = js.native
  /**
    * Returns array of BrowserView what was an attached with addBrowserView or
    * setBrowserView. Note: The BrowserView API is currently experimental and may
    * change or be removed in future Electron releases.
    */
  def getBrowserViews(): Unit = js.native
  def getChildWindows(): js.Array[BrowserWindow] = js.native
  def getContentBounds(): Rectangle = js.native
  def getContentSize(): js.Array[Double] = js.native
  def getMaximumSize(): js.Array[Double] = js.native
  def getMinimumSize(): js.Array[Double] = js.native
  /**
    * The native type of the handle is HWND on Windows, NSView* on macOS, and Window
    * (unsigned long) on Linux.
    */
  def getNativeWindowHandle(): Buffer = js.native
  /**
    * Note: whatever the current state of the window : maximized, minimized or in
    * fullscreen, this function always returns the position and size of the window in
    * normal state. In normal state, getBounds and getNormalBounds returns the same
    * Rectangle.
    */
  def getNormalBounds(): Rectangle = js.native
  def getOpacity(): Double = js.native
  def getParentWindow(): BrowserWindow = js.native
  def getPosition(): js.Array[Double] = js.native
  def getRepresentedFilename(): String = js.native
  def getSize(): js.Array[Double] = js.native
  /**
    * Note: The title of the web page can be different from the title of the native
    * window.
    */
  def getTitle(): String = js.native
  def hasShadow(): Boolean = js.native
  /**
    * Hides the window.
    */
  def hide(): Unit = js.native
  /**
    * Hooks a windows message. The callback is called when the message is received in
    * the WndProc.
    */
  def hookWindowMessage(message: Double, callback: js.Function): Unit = js.native
  def isAlwaysOnTop(): Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isClosable(): Boolean = js.native
  def isDestroyed(): Boolean = js.native
  def isDocumentEdited(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isFullScreen(): Boolean = js.native
  def isFullScreenable(): Boolean = js.native
  def isKiosk(): Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMaximizable(): Boolean = js.native
  def isMaximized(): Boolean = js.native
  def isMenuBarAutoHide(): Boolean = js.native
  def isMenuBarVisible(): Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMinimizable(): Boolean = js.native
  def isMinimized(): Boolean = js.native
  def isModal(): Boolean = js.native
  /**
    * On Linux always returns true.
    */
  def isMovable(): Boolean = js.native
  def isNormal(): Boolean = js.native
  def isResizable(): Boolean = js.native
  def isSimpleFullScreen(): Boolean = js.native
  def isVisible(): Boolean = js.native
  /**
    * Note: This API always returns false on Windows.
    */
  def isVisibleOnAllWorkspaces(): Boolean = js.native
  def isWindowMessageHooked(message: Double): Boolean = js.native
  /**
    * Same as webContents.loadFile, filePath should be a path to an HTML file relative
    * to the root of your application.  See the webContents docs for more information.
    */
  def loadFile(filePath: String): js.Promise[Unit] = js.native
  def loadFile(filePath: String, options: LoadFileOptions): js.Promise[Unit] = js.native
  /**
    * Same as webContents.loadURL(url[, options]). The url can be a remote address
    * (e.g. http://) or a path to a local HTML file using the file:// protocol. To
    * ensure that file URLs are properly formatted, it is recommended to use Node's
    * url.format method: You can load a URL using a POST request with URL-encoded data
    * by doing the following:
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  def loadURL(url: String, options: LoadURLOptions): js.Promise[Unit] = js.native
  /**
    * Maximizes the window. This will also show (but not focus) the window if it isn't
    * being displayed already.
    */
  def maximize(): Unit = js.native
  /**
    * Merges all windows into one window with multiple tabs when native tabs are
    * enabled and there is more than one open window.
    */
  def mergeAllWindows(): Unit = js.native
  /**
    * Minimizes the window. On some platforms the minimized window will be shown in
    * the Dock.
    */
  def minimize(): Unit = js.native
  /**
    * Moves the current tab into a new window if native tabs are enabled and there is
    * more than one tab in the current window.
    */
  def moveTabToNewWindow(): Unit = js.native
  /**
    * Moves window to top(z-order) regardless of focus
    */
  def moveTop(): Unit = js.native
  // Docs: http://electronjs.org/docs/api/browser-window
  /**
    * Emitted when the window is set or unset to show always on top of other windows.
    */
  @JSName("on")
  def on_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when an App Command is invoked. These are typically related to keyboard
    * media keys or browser commands, as well as the "Back" button built into some
    * mice on Windows. Commands are lowercased, underscores are replaced with hyphens,
    * and the APPCOMMAND_ prefix is stripped off. e.g. APPCOMMAND_BROWSER_BACKWARD is
    * emitted as browser-backward. The following app commands are explictly supported
    * on Linux:
    */
  @JSName("on")
  def on_appcommand(event: `app-command`, listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  /**
    * Emitted when the window loses focus.
    */
  @JSName("on")
  def on_blur(event: blur, listener: js.Function): this.type = js.native
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
  def on_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the window is closed. After you have received this event you should
    * remove the reference to the window and avoid using it any more.
    */
  @JSName("on")
  def on_closed(event: closed, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state.
    */
  @JSName("on")
  def on_enterfullscreen(event: `enter-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window gains focus.
    */
  @JSName("on")
  def on_focus(event: focus, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is hidden.
    */
  @JSName("on")
  def on_hide(event: hide, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state.
    */
  @JSName("on")
  def on_leavefullscreen(event: `leave-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when window is maximized.
    */
  @JSName("on")
  def on_maximize(event: maximize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is minimized.
    */
  @JSName("on")
  def on_minimize(event: minimize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is being moved to a new position. Note: On macOS this
    * event is an alias of moved.
    */
  @JSName("on")
  def on_move(event: move, listener: js.Function): this.type = js.native
  /**
    * Emitted once when the window is moved to a new position.
    */
  @JSName("on")
  def on_moved(event: moved, listener: js.Function): this.type = js.native
  /**
    * Emitted when the native new tab button is clicked.
    */
  @JSName("on")
  def on_newwindowfortab(event: `new-window-for-tab`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the document changed its title, calling event.preventDefault() will
    * prevent the native window's title from changing. explicitSet is false when title
    * is synthesized from file url.
    */
  @JSName("on")
  def on_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when the web page has been rendered (while not being shown) and window
    * can be displayed without a visual flash.
    */
  @JSName("on")
  def on_readytoshow(event: `ready-to-show`, listener: js.Function): this.type = js.native
  /**
    * Emitted after the window has been resized.
    */
  @JSName("on")
  def on_resize(event: resize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  def on_responsive(event: responsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is restored from a minimized state.
    */
  @JSName("on")
  def on_restore(event: restore, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has begun.
    */
  @JSName("on")
  def on_scrolltouchbegin(event: `scroll-touch-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase filed upon reaching the edge of element.
    */
  @JSName("on")
  def on_scrolltouchedge(event: `scroll-touch-edge`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has ended.
    */
  @JSName("on")
  def on_scrolltouchend(event: `scroll-touch-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when window session is going to end due to force shutdown or machine
    * restart or session log off.
    */
  @JSName("on")
  def on_sessionend(event: `session-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window opens a sheet.
    */
  @JSName("on")
  def on_sheetbegin(event: `sheet-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window has closed a sheet.
    */
  @JSName("on")
  def on_sheetend(event: `sheet-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is shown.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function): this.type = js.native
  /**
    * Emitted on 3-finger swipe. Possible directions are up, right, down, left.
    */
  @JSName("on")
  def on_swipe(event: swipe, listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  /**
    * Emitted when the window exits from a maximized state.
    */
  @JSName("on")
  def on_unmaximize(event: unmaximize, listener: js.Function): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  def on_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  /**
    * Emitted before the window is moved. Calling event.preventDefault() will prevent
    * the window from being moved. Note that this is only emitted when the window is
    * being resized manually. Resizing the window with setBounds/setSize will not emit
    * this event.
    */
  @JSName("on")
  def on_willmove(event: `will-move`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  /**
    * Emitted before the window is resized. Calling event.preventDefault() will
    * prevent the window from being resized. Note that this is only emitted when the
    * window is being resized manually. Resizing the window with setBounds/setSize
    * will not emit this event.
    */
  @JSName("on")
  def on_willresize(event: `will-resize`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("once")
  def once_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_appcommand(event: `app-command`, listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_blur(event: blur, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_closed(event: closed, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_enterfullscreen(event: `enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_focus(event: focus, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_hide(event: hide, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_leavefullscreen(event: `leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_maximize(event: maximize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_minimize(event: minimize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_move(event: move, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_moved(event: moved, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_newwindowfortab(event: `new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_readytoshow(event: `ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_restore(event: restore, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_scrolltouchbegin(event: `scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_scrolltouchedge(event: `scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_scrolltouchend(event: `scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_sessionend(event: `session-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_sheetbegin(event: `sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_sheetend(event: `sheet-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_show(event: show, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_swipe(event: swipe, listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_unmaximize(event: unmaximize, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_willmove(event: `will-move`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("once")
  def once_willresize(event: `will-resize`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  /**
    * Uses Quick Look to preview a file at a given path.
    */
  def previewFile(path: String): Unit = js.native
  def previewFile(path: String, displayName: String): Unit = js.native
  /**
    * Same as webContents.reload.
    */
  def reload(): Unit = js.native
  def removeBrowserView(browserView: BrowserView): Unit = js.native
  @JSName("removeListener")
  def removeListener_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_appcommand(event: `app-command`, listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_blur(event: blur, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_closed(event: closed, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_enterfullscreen(event: `enter-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_focus(event: focus, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_hide(event: hide, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_leavefullscreen(event: `leave-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_maximize(event: maximize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_minimize(event: minimize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_move(event: move, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_moved(event: moved, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_readytoshow(event: `ready-to-show`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_resize(event: resize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_restore(event: restore, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_scrolltouchbegin(event: `scroll-touch-begin`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_scrolltouchedge(event: `scroll-touch-edge`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_scrolltouchend(event: `scroll-touch-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_sessionend(event: `session-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_sheetbegin(event: `sheet-begin`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_sheetend(event: `sheet-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_swipe(event: swipe, listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unmaximize(event: unmaximize, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_willmove(event: `will-move`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_willresize(event: `will-resize`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  /**
    * Remove the window's menu bar.
    */
  def removeMenu(): Unit = js.native
  /**
    * Restores the window from minimized state to its previous state.
    */
  def restore(): Unit = js.native
  /**
    * Selects the next tab when native tabs are enabled and there are other tabs in
    * the window.
    */
  def selectNextTab(): Unit = js.native
  /**
    * Selects the previous tab when native tabs are enabled and there are other tabs
    * in the window.
    */
  def selectPreviousTab(): Unit = js.native
  /**
    * Sets whether the window should show always on top of other windows. After
    * setting this, the window is still a normal window, not a toolbox window which
    * can not be focused on.
    */
  def setAlwaysOnTop(flag: Boolean): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_floating(flag: Boolean, level: floating): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_floating(flag: Boolean, level: floating, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_mainmenu(flag: Boolean, level: `main-menu`): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_mainmenu(flag: Boolean, level: `main-menu`, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_modalpanel(flag: Boolean, level: `modal-panel`): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_modalpanel(flag: Boolean, level: `modal-panel`, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_normal(flag: Boolean, level: normal): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_normal(flag: Boolean, level: normal, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_popupmenu(flag: Boolean, level: `pop-up-menu`): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_popupmenu(flag: Boolean, level: `pop-up-menu`, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_screensaver(flag: Boolean, level: `screen-saver`): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_screensaver(flag: Boolean, level: `screen-saver`, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_status(flag: Boolean, level: status): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_status(flag: Boolean, level: status, relativeLevel: Double): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_tornoffmenu(flag: Boolean, level: `torn-off-menu`): Unit = js.native
  @JSName("setAlwaysOnTop")
  def setAlwaysOnTop_tornoffmenu(flag: Boolean, level: `torn-off-menu`, relativeLevel: Double): Unit = js.native
  /**
    * Sets the properties for the window's taskbar button. Note: relaunchCommand and
    * relaunchDisplayName must always be set together. If one of those properties is
    * not set, then neither will be used.
    */
  def setAppDetails(options: AppDetailsOptions): Unit = js.native
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
  def setAspectRatio(aspectRatio: Double, extraSize: Size): Unit = js.native
  /**
    * Controls whether to hide cursor when typing.
    */
  def setAutoHideCursor(autoHide: Boolean): Unit = js.native
  /**
    * Sets whether the window menu bar should hide itself automatically. Once set the
    * menu bar will only show when users press the single Alt key. If the menu bar is
    * already visible, calling setAutoHideMenuBar(true) won't hide it immediately.
    */
  def setAutoHideMenuBar(hide: Boolean): Unit = js.native
  /**
    * Sets the background color of the window. See Setting backgroundColor.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
    * Resizes and moves the window to the supplied bounds. Any properties that are not
    * supplied will default to their current values.
    */
  def setBounds(bounds: Rectangle): Unit = js.native
  def setBounds(bounds: Rectangle, animate: Boolean): Unit = js.native
  def setBrowserView(browserView: BrowserView): Unit = js.native
  /**
    * Sets whether the window can be manually closed by user. On Linux does nothing.
    */
  def setClosable(closable: Boolean): Unit = js.native
  /**
    * Resizes and moves the window's client area (e.g. the web page) to the supplied
    * bounds.
    */
  def setContentBounds(bounds: Rectangle): Unit = js.native
  def setContentBounds(bounds: Rectangle, animate: Boolean): Unit = js.native
  /**
    * Prevents the window contents from being captured by other apps. On macOS it sets
    * the NSWindow's sharingType to NSWindowSharingNone. On Windows it calls
    * SetWindowDisplayAffinity with WDA_MONITOR.
    */
  def setContentProtection(enable: Boolean): Unit = js.native
  /**
    * Resizes the window's client area (e.g. the web page) to width and height.
    */
  def setContentSize(width: Double, height: Double): Unit = js.native
  def setContentSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  /**
    * Specifies whether the window’s document has been edited, and the icon in title
    * bar will become gray when set to true.
    */
  def setDocumentEdited(edited: Boolean): Unit = js.native
  /**
    * Disable or enable the window.
    */
  def setEnabled(enable: Boolean): Unit = js.native
  /**
    * Changes whether the window can be focused.
    */
  def setFocusable(focusable: Boolean): Unit = js.native
  /**
    * Sets whether the window should be in fullscreen mode.
    */
  def setFullScreen(flag: Boolean): Unit = js.native
  /**
    * Sets whether the maximize/zoom window button toggles fullscreen mode or
    * maximizes the window.
    */
  def setFullScreenable(fullscreenable: Boolean): Unit = js.native
  /**
    * Sets whether the window should have a shadow.
    */
  def setHasShadow(hasShadow: Boolean): Unit = js.native
  /**
    * Changes window icon.
    */
  def setIcon(icon: NativeImage_): Unit = js.native
  /**
    * Makes the window ignore all mouse events. All mouse events happened in this
    * window will be passed to the window below this window, but if this window has
    * focus, it will still receive keyboard events.
    */
  def setIgnoreMouseEvents(ignore: Boolean): Unit = js.native
  def setIgnoreMouseEvents(ignore: Boolean, options: IgnoreMouseEventsOptions): Unit = js.native
  /**
    * Enters or leaves the kiosk mode.
    */
  def setKiosk(flag: Boolean): Unit = js.native
  /**
    * Sets whether the window can be manually maximized by user. On Linux does
    * nothing.
    */
  def setMaximizable(maximizable: Boolean): Unit = js.native
  /**
    * Sets the maximum size of window to width and height.
    */
  def setMaximumSize(width: Double, height: Double): Unit = js.native
  def setMenu(): Unit = js.native
  /**
    * Sets the menu as the window's menu bar.
    */
  def setMenu(menu: Menu): Unit = js.native
  /**
    * Sets whether the menu bar should be visible. If the menu bar is auto-hide, users
    * can still bring up the menu bar by pressing the single Alt key.
    */
  def setMenuBarVisibility(visible: Boolean): Unit = js.native
  /**
    * Sets whether the window can be manually minimized by user. On Linux does
    * nothing.
    */
  def setMinimizable(minimizable: Boolean): Unit = js.native
  /**
    * Sets the minimum size of window to width and height.
    */
  def setMinimumSize(width: Double, height: Double): Unit = js.native
  /**
    * Sets whether the window can be moved by user. On Linux does nothing.
    */
  def setMovable(movable: Boolean): Unit = js.native
  /**
    * Sets the opacity of the window. On Linux does nothing.
    */
  def setOpacity(opacity: Double): Unit = js.native
  def setOverlayIcon(overlay: Null, description: String): Unit = js.native
  /**
    * Sets a 16 x 16 pixel overlay onto the current taskbar icon, usually used to
    * convey some sort of application status or to passively notify the user.
    */
  def setOverlayIcon(overlay: NativeImage_, description: String): Unit = js.native
  /**
    * Sets parent as current window's parent window, passing null will turn current
    * window into a top-level window.
    */
  def setParentWindow(parent: BrowserWindow): Unit = js.native
  /**
    * Moves window to x and y.
    */
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, animate: Boolean): Unit = js.native
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
  def setProgressBar(progress: Double): Unit = js.native
  def setProgressBar(progress: Double, options: ProgressBarOptions): Unit = js.native
  /**
    * Sets the pathname of the file the window represents, and the icon of the file
    * will show in window's title bar.
    */
  def setRepresentedFilename(filename: String): Unit = js.native
  /**
    * Sets whether the window can be manually resized by user.
    */
  def setResizable(resizable: Boolean): Unit = js.native
  /**
    * Setting a window shape determines the area within the window where the system
    * permits drawing and user interaction. Outside of the given region, no pixels
    * will be drawn and no mouse events will be registered. Mouse events outside of
    * the region will not be received by that window, but will fall through to
    * whatever is behind the window.
    */
  def setShape(rects: js.Array[Rectangle]): Unit = js.native
  /**
    * Changes the attachment point for sheets on macOS. By default, sheets are
    * attached just below the window frame, but you may want to display them beneath a
    * HTML-rendered toolbar. For example:
    */
  def setSheetOffset(offsetY: Double): Unit = js.native
  def setSheetOffset(offsetY: Double, offsetX: Double): Unit = js.native
  /**
    * Enters or leaves simple fullscreen mode. Simple fullscreen mode emulates the
    * native fullscreen behavior found in versions of Mac OS X prior to Lion (10.7).
    */
  def setSimpleFullScreen(flag: Boolean): Unit = js.native
  /**
    * Resizes the window to width and height. If width or height are below any set
    * minimum size constraints the window will snap to its minimum size.
    */
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  /**
    * Makes the window not show in the taskbar.
    */
  def setSkipTaskbar(skip: Boolean): Unit = js.native
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
  def setThumbarButtons(buttons: js.Array[ThumbarButton]): Boolean = js.native
  /**
    * Sets the region of the window to show as the thumbnail image displayed when
    * hovering over the window in the taskbar. You can reset the thumbnail to be the
    * entire window by specifying an empty region: { x: 0, y: 0, width: 0, height: 0
    * }.
    */
  def setThumbnailClip(region: Rectangle): Unit = js.native
  /**
    * Sets the toolTip that is displayed when hovering over the window thumbnail in
    * the taskbar.
    */
  def setThumbnailToolTip(toolTip: String): Unit = js.native
  /**
    * Changes the title of native window to title.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Sets the touchBar layout for the current window. Specifying null or undefined
    * clears the touch bar. This method only has an effect if the machine has a touch
    * bar and is running on macOS 10.12.1+. Note: The TouchBar API is currently
    * experimental and may change or be removed in future Electron releases.
    */
  def setTouchBar(touchBar: TouchBar): Unit = js.native
  /**
    * Adds a vibrancy effect to the browser window. Passing null or an empty string
    * will remove the vibrancy effect on the window.
    */
  def setVibrancy(
    `type`: `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark`
  ): Unit = js.native
  /**
    * Sets whether the window should be visible on all workspaces. Note: This API does
    * nothing on Windows.
    */
  def setVisibleOnAllWorkspaces(visible: Boolean): Unit = js.native
  def setVisibleOnAllWorkspaces(visible: Boolean, options: VisibleOnAllWorkspacesOptions): Unit = js.native
  /**
    * Sets whether the window traffic light buttons should be visible. This cannot be
    * called when titleBarStyle is set to customButtonsOnHover.
    */
  def setWindowButtonVisibility(visible: Boolean): Unit = js.native
  /**
    * Shows and gives focus to the window.
    */
  def show(): Unit = js.native
  /**
    * Same as webContents.showDefinitionForSelection().
    */
  def showDefinitionForSelection(): Unit = js.native
  /**
    * Shows the window but doesn't focus on it.
    */
  def showInactive(): Unit = js.native
  /**
    * Toggles the visibility of the tab bar if native tabs are enabled and there is
    * only one tab in the current window.
    */
  def toggleTabBar(): Unit = js.native
  /**
    * Unhooks all of the window messages.
    */
  def unhookAllWindowMessages(): Unit = js.native
  /**
    * Unhook the window message.
    */
  def unhookWindowMessage(message: Double): Unit = js.native
  /**
    * Unmaximizes the window.
    */
  def unmaximize(): Unit = js.native
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
  def addDevToolsExtension(path: String): Unit = js.native
  /**
    * Adds Chrome extension located at path, and returns extension's name. The method
    * will also not return if the extension's manifest is missing or incomplete. Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def addExtension(path: String): Unit = js.native
  def fromBrowserView(browserView: BrowserView): BrowserWindow | Null = js.native
  def fromId(id: Double): BrowserWindow = js.native
  def fromWebContents(webContents: WebContents_): BrowserWindow = js.native
  def getAllWindows(): js.Array[BrowserWindow] = js.native
  /**
    * To check if a DevTools extension is installed you can run the following: Note:
    * This API cannot be called before the ready event of the app module is emitted.
    */
  def getDevToolsExtensions(): DevToolsExtensions = js.native
  /**
    * Note: This API cannot be called before the ready event of the app module is
    * emitted.
    */
  def getExtensions(): Extensions = js.native
  def getFocusedWindow(): BrowserWindow | Null = js.native
  /**
    * Remove a DevTools extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeDevToolsExtension(name: String): Unit = js.native
  /**
    * Remove a Chrome extension by name. Note: This API cannot be called before the
    * ready event of the app module is emitted.
    */
  def removeExtension(name: String): Unit = js.native
}

