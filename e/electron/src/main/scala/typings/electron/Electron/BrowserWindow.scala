package typings.electron.Electron

import typings.electron.anon.PartialRectangle
import typings.electron.electronStrings.`always-on-top-changed`
import typings.electron.electronStrings.`app-command`
import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`enter-full-screen`
import typings.electron.electronStrings.`enter-html-full-screen`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`leave-full-screen`
import typings.electron.electronStrings.`leave-html-full-screen`
import typings.electron.electronStrings.`main-menu`
import typings.electron.electronStrings.`medium-light`
import typings.electron.electronStrings.`modal-panel`
import typings.electron.electronStrings.`new-window-for-tab`
import typings.electron.electronStrings.`page-title-updated`
import typings.electron.electronStrings.`pop-up-menu`
import typings.electron.electronStrings.`ready-to-show`
import typings.electron.electronStrings.`rotate-gesture`
import typings.electron.electronStrings.`screen-saver`
import typings.electron.electronStrings.`scroll-touch-begin`
import typings.electron.electronStrings.`scroll-touch-edge`
import typings.electron.electronStrings.`scroll-touch-end`
import typings.electron.electronStrings.`session-end`
import typings.electron.electronStrings.`sheet-begin`
import typings.electron.electronStrings.`sheet-end`
import typings.electron.electronStrings.`torn-off-menu`
import typings.electron.electronStrings.`ultra-dark`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.`will-move`
import typings.electron.electronStrings.`will-resize`
import typings.electron.electronStrings.blur
import typings.electron.electronStrings.close
import typings.electron.electronStrings.closed
import typings.electron.electronStrings.content
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.floating
import typings.electron.electronStrings.focus
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.hud
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
import typings.electron.electronStrings.sheet
import typings.electron.electronStrings.show
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.status
import typings.electron.electronStrings.swipe
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.tooltip
import typings.electron.electronStrings.unmaximize
import typings.electron.electronStrings.unresponsive
import typings.electron.electronStrings.window
import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindow extends EventEmitter {
  var accessibleTitle: String = js.native
  var autoHideMenuBar: Boolean = js.native
  var closable: Boolean = js.native
  var documentEdited: Boolean = js.native
  var excludedFromShownWindowsMenu: Boolean = js.native
  var fullScreen: Boolean = js.native
  var fullScreenable: Boolean = js.native
  val id: Double = js.native
  var kiosk: Boolean = js.native
  var maximizable: Boolean = js.native
  var menuBarVisible: Boolean = js.native
  var minimizable: Boolean = js.native
  var movable: Boolean = js.native
  var representedFilename: String = js.native
  var resizable: Boolean = js.native
  var shadow: Boolean = js.native
  var simpleFullScreen: Boolean = js.native
  var title: String = js.native
  var visibleOnAllWorkspaces: Boolean = js.native
  val webContents: WebContents_ = js.native
  /**
    * Replacement API for setBrowserView supporting work with multi browser views.
    *
    * @experimental
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
  def addListener_rotategesture(event: `rotate-gesture`, listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
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
    *
    * @platform darwin
    */
  def addTabbedWindow(browserWindow: BrowserWindow): Unit = js.native
  /**
    * Removes focus from the window.
    */
  def blur(): Unit = js.native
  def blurWebView(): Unit = js.native
  /**
    * Resolves with a NativeImage
    *
    * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
    * whole visible page.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
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
    *
    * @platform darwin
    */
  def closeFilePreview(): Unit = js.native
  /**
    * Force closing the window, the `unload` and `beforeunload` event won't be emitted
    * for the web page, and `close` event will also not be emitted for this window,
    * but it guarantees the `closed` event will be emitted.
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
  /**
    * Gets the background color of the window. See Setting `backgroundColor`.
    */
  def getBackgroundColor(): String = js.native
  /**
    * The `bounds` of the window as `Object`.
    */
  def getBounds(): Rectangle = js.native
  /**
    * The `BrowserView` attached to `win`. Returns `null` if one is not attached.
    * Throws an error if multiple `BrowserView`s are attached.
    *
    * @experimental
    */
  def getBrowserView(): BrowserView | Null = js.native
  /**
    * an array of all BrowserViews that have been attached with `addBrowserView` or
    * `setBrowserView`.
    *
    * **Note:** The BrowserView API is currently experimental and may change or be
    * removed in future Electron releases.
    *
    * @experimental
    */
  def getBrowserViews(): js.Array[BrowserView] = js.native
  /**
    * All child windows.
    */
  def getChildWindows(): js.Array[BrowserWindow] = js.native
  /**
    * The `bounds` of the window's client area as `Object`.
    */
  def getContentBounds(): Rectangle = js.native
  /**
    * Contains the window's client area's width and height.
    */
  def getContentSize(): js.Array[Double] = js.native
  /**
    * Contains the window's maximum width and height.
    */
  def getMaximumSize(): js.Array[Double] = js.native
  /**
    * Window id in the format of DesktopCapturerSource's id. For example
    * "window:1234:0".
    *
    * More precisely the format is `window:id:other_id` where `id` is `HWND` on
    * Windows, `CGWindowID` (`uint64_t`) on macOS and `Window` (`unsigned long`) on
    * Linux. `other_id` is used to identify web contents (tabs) so within the same top
    * level window.
    */
  def getMediaSourceId(): String = js.native
  /**
    * Contains the window's minimum width and height.
    */
  def getMinimumSize(): js.Array[Double] = js.native
  /**
    * The platform-specific handle of the window.
    *
    * The native type of the handle is `HWND` on Windows, `NSView*` on macOS, and
    * `Window` (`unsigned long`) on Linux.
    */
  def getNativeWindowHandle(): Buffer = js.native
  /**
    * Contains the window bounds of the normal state
    *
    * **Note:** whatever the current state of the window : maximized, minimized or in
    * fullscreen, this function always returns the position and size of the window in
    * normal state. In normal state, getBounds and getNormalBounds returns the same
    * `Rectangle`.
    */
  def getNormalBounds(): Rectangle = js.native
  /**
    * between 0.0 (fully transparent) and 1.0 (fully opaque). On Linux, always returns
    * 1.
    */
  def getOpacity(): Double = js.native
  /**
    * The parent window.
    */
  def getParentWindow(): BrowserWindow = js.native
  /**
    * Contains the window's current position.
    */
  def getPosition(): js.Array[Double] = js.native
  /**
    * The pathname of the file the window represents.
    *
    * @platform darwin
    */
  def getRepresentedFilename(): String = js.native
  /**
    * Contains the window's width and height.
    */
  def getSize(): js.Array[Double] = js.native
  /**
    * The title of the native window.
    *
    * **Note:** The title of the web page can be different from the title of the
    * native window.
    */
  def getTitle(): String = js.native
  /**
    * The current position for the traffic light buttons. Can only be used with
    * `titleBarStyle` set to `hidden`.
    *
    * @platform darwin
    */
  def getTrafficLightPosition(): Point = js.native
  /**
    * Whether the window has a shadow.
    */
  def hasShadow(): Boolean = js.native
  /**
    * Hides the window.
    */
  def hide(): Unit = js.native
  /**
    * Hooks a windows message. The `callback` is called when the message is received
    * in the WndProc.
    *
    * @platform win32
    */
  def hookWindowMessage(message: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Whether the window is always on top of other windows.
    */
  def isAlwaysOnTop(): Boolean = js.native
  /**
    * Whether the window can be manually closed by user.
    * 
  On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isClosable(): Boolean = js.native
  /**
    * Whether the window is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  /**
    * Whether the window's document has been edited.
    *
    * @platform darwin
    */
  def isDocumentEdited(): Boolean = js.native
  /**
    * whether the window is enabled.
    */
  def isEnabled(): Boolean = js.native
  /**
    * Whether the window is focused.
    */
  def isFocused(): Boolean = js.native
  /**
    * Whether the window is in fullscreen mode.
    */
  def isFullScreen(): Boolean = js.native
  /**
    * Whether the maximize/zoom window button toggles fullscreen mode or maximizes the
    * window.
    */
  def isFullScreenable(): Boolean = js.native
  /**
    * Whether the window is in kiosk mode.
    */
  def isKiosk(): Boolean = js.native
  /**
    * Whether the window can be manually maximized by user.
    * 
  On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMaximizable(): Boolean = js.native
  /**
    * Whether the window is maximized.
    */
  def isMaximized(): Boolean = js.native
  /**
    * Whether menu bar automatically hides itself.
    */
  def isMenuBarAutoHide(): Boolean = js.native
  /**
    * Whether the menu bar is visible.
    */
  def isMenuBarVisible(): Boolean = js.native
  /**
    * Whether the window can be manually minimized by the user.
    * 
  On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMinimizable(): Boolean = js.native
  /**
    * Whether the window is minimized.
    */
  def isMinimized(): Boolean = js.native
  /**
    * Whether current window is a modal window.
    */
  def isModal(): Boolean = js.native
  /**
    * Whether the window can be moved by user.
  On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMovable(): Boolean = js.native
  /**
    * Whether the window is in normal state (not maximized, not minimized, not in
    * fullscreen mode).
    */
  def isNormal(): Boolean = js.native
  /**
    * Whether the window can be manually resized by the user.
    */
  def isResizable(): Boolean = js.native
  /**
    * Whether the window is in simple (pre-Lion) fullscreen mode.
    *
    * @platform darwin
    */
  def isSimpleFullScreen(): Boolean = js.native
  /**
    * Whether the window is visible to the user.
    */
  def isVisible(): Boolean = js.native
  /**
    * Whether the window is visible on all workspaces.
    * 
  **Note:** This API always returns false on Windows.
    */
  def isVisibleOnAllWorkspaces(): Boolean = js.native
  /**
    * `true` or `false` depending on whether the message is hooked.
    *
    * @platform win32
    */
  def isWindowMessageHooked(message: Double): Boolean = js.native
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Same as `webContents.loadFile`, `filePath` should be a path to an HTML file
    * relative to the root of your application.  See the `webContents` docs for more
    * information.
    */
  def loadFile(filePath: String): js.Promise[Unit] = js.native
  def loadFile(filePath: String, options: LoadFileOptions): js.Promise[Unit] = js.native
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Same as `webContents.loadURL(url[, options])`.
    *
    * The `url` can be a remote address (e.g. `http://`) or a path to a local HTML
    * file using the `file://` protocol.
    *
    * To ensure that file URLs are properly formatted, it is recommended to use Node's
    * `url.format` method:
    *
    * You can load a URL using a `POST` request with URL-encoded data by doing the
    * following:
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
    *
    * @platform darwin
    */
  def mergeAllWindows(): Unit = js.native
  /**
    * Minimizes the window. On some platforms the minimized window will be shown in
    * the Dock.
    */
  def minimize(): Unit = js.native
  /**
    * Moves window above the source window in the sense of z-order. If the
    * `mediaSourceId` is not of type window or if the window does not exist then this
    * method throws an error.
    */
  def moveAbove(mediaSourceId: String): Unit = js.native
  /**
    * Moves the current tab into a new window if native tabs are enabled and there is
    * more than one tab in the current window.
    *
    * @platform darwin
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
    * mice on Windows.
    *
    * Commands are lowercased, underscores are replaced with hyphens, and the
    * `APPCOMMAND_` prefix is stripped off. e.g. `APPCOMMAND_BROWSER_BACKWARD` is
    * emitted as `browser-backward`.
    *
    * The following app commands are explicitly supported on Linux:
    * 
  * `browser-backward`
  * `browser-forward`
    *
    * @platform win32,linux
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
    * `beforeunload` and `unload` event of the DOM. Calling `event.preventDefault()`
    * will cancel the close.
    *
    * Usually you would want to use the `beforeunload` handler to decide whether the
    * window should be closed, which will also be called when the window is reloaded.
    * In Electron, returning any value other than `undefined` would cancel the close.
    * For example:
    *
    * _**Note**: There is a subtle difference between the behaviors of
    * `window.onbeforeunload = handler` and `window.addEventListener('beforeunload',
    * handler)`. It is recommended to always set the `event.returnValue` explicitly,
    * instead of only returning a value, as the former works more consistently within
    * Electron._
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
    * Emitted when the window is being moved to a new position.
    * 
  __Note__: On macOS this event is an alias of `moved`.
    */
  @JSName("on")
  def on_move(event: move, listener: js.Function): this.type = js.native
  /**
    * Emitted once when the window is moved to a new position.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_moved(event: moved, listener: js.Function): this.type = js.native
  /**
    * Emitted when the native new tab button is clicked.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_newwindowfortab(event: `new-window-for-tab`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the document changed its title, calling `event.preventDefault()`
    * will prevent the native window's title from changing. `explicitSet` is false
    * when title is synthesized from file URL.
    */
  @JSName("on")
  def on_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when the web page has been rendered (while not being shown) and window
    * can be displayed without a visual flash.
    *
    * Please note that using this event implies that the renderer will be considered
    * "visible" and paint even though `show` is false.  This event will never fire if
    * you use `paintWhenInitiallyHidden: false`
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
    * Emitted on trackpad rotation gesture. Continually emitted until rotation gesture
    * is ended. The `rotation` value on each emission is the angle in degrees rotated
    * since the last emission. The last emitted event upon a rotation gesture will
    * always be of value `0`. Counter-clockwise rotation values are positive, while
    * clockwise ones are negative.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_rotategesture(event: `rotate-gesture`, listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has begun.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_scrolltouchbegin(event: `scroll-touch-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase filed upon reaching the edge of element.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_scrolltouchedge(event: `scroll-touch-edge`, listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has ended.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_scrolltouchend(event: `scroll-touch-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when window session is going to end due to force shutdown or machine
    * restart or session log off.
    *
    * @platform win32
    */
  @JSName("on")
  def on_sessionend(event: `session-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window opens a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_sheetbegin(event: `sheet-begin`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window has closed a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_sheetend(event: `sheet-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is shown.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function): this.type = js.native
  /**
    * Emitted on 3-finger swipe. Possible directions are `up`, `right`, `down`,
    * `left`.
    *
    * The method underlying this event is built to handle older macOS-style trackpad
    * swiping, where the content on the screen doesn't move with the swipe. Most macOS
    * trackpads are not configured to allow this kind of swiping anymore, so in order
    * for it to emit properly the 'Swipe between pages' preference in `System
    * Preferences > Trackpad > More Gestures` must be set to 'Swipe with two or three
    * fingers'.
    *
    * @platform darwin
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
    * Emitted before the window is moved. On Windows, calling `event.preventDefault()`
    * will prevent the window from being moved.
    *
    * Note that this is only emitted when the window is being resized manually.
    * Resizing the window with `setBounds`/`setSize` will not emit this event.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_willmove(event: `will-move`, listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  /**
    * Emitted before the window is resized. Calling `event.preventDefault()` will
    * prevent the window from being resized.
    *
    * Note that this is only emitted when the window is being resized manually.
    * Resizing the window with `setBounds`/`setSize` will not emit this event.
    *
    * @platform darwin,win32
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
  def once_rotategesture(event: `rotate-gesture`, listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
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
    *
    * @platform darwin
    */
  def previewFile(path: String): Unit = js.native
  def previewFile(path: String, displayName: String): Unit = js.native
  /**
    * Same as `webContents.reload`.
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
  def removeListener_rotategesture(event: `rotate-gesture`, listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
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
    *
    * @platform linux,win32
    */
  def removeMenu(): Unit = js.native
  /**
    * Restores the window from minimized state to its previous state.
    */
  def restore(): Unit = js.native
  /**
    * Selects the next tab when native tabs are enabled and there are other tabs in
    * the window.
    *
    * @platform darwin
    */
  def selectNextTab(): Unit = js.native
  /**
    * Selects the previous tab when native tabs are enabled and there are other tabs
    * in the window.
    *
    * @platform darwin
    */
  def selectPreviousTab(): Unit = js.native
  /**
    * Sets whether the window should show always on top of other windows. After
    * setting this, the window is still a normal window, not a toolbox window which
    * can not be focused on.
    */
  def setAlwaysOnTop(flag: Boolean): Unit = js.native
  def setAlwaysOnTop(flag: Boolean, level: js.UndefOr[scala.Nothing], relativeLevel: Double): Unit = js.native
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
    * Sets the properties for the window's taskbar button.
    *
    * **Note:** `relaunchCommand` and `relaunchDisplayName` must always be set
    * together. If one of those properties is not set, then neither will be used.
    *
    * @platform win32
    */
  def setAppDetails(options: AppDetailsOptions): Unit = js.native
  /**
    * This will make a window maintain an aspect ratio. The extra size allows a
    * developer to have space, specified in pixels, not included within the aspect
    * ratio calculations. This API already takes into account the difference between a
    * window's size and its content size.
    *
    * Consider a normal window with an HD video player and associated controls.
    * Perhaps there are 15 pixels of controls on the left edge, 25 pixels of controls
    * on the right edge and 50 pixels of controls below the player. In order to
    * maintain a 16:9 aspect ratio (standard aspect ratio for HD @1920x1080) within
    * the player itself we would call this function with arguments of 16/9 and {
    * width: 40, height: 50 }. The second argument doesn't care where the extra width
    * and height are within the content view--only that they exist. Sum any extra
    * width and height areas you have within the overall content view.
    *
    * @platform darwin,linux
    */
  def setAspectRatio(aspectRatio: Double): Unit = js.native
  def setAspectRatio(aspectRatio: Double, extraSize: Size): Unit = js.native
  /**
    * Controls whether to hide cursor when typing.
    *
    * @platform darwin
    */
  def setAutoHideCursor(autoHide: Boolean): Unit = js.native
  /**
    * Sets whether the window menu bar should hide itself automatically. Once set the
    * menu bar will only show when users press the single `Alt` key.
    *
    * If the menu bar is already visible, calling `setAutoHideMenuBar(true)` won't
    * hide it immediately.
    */
  def setAutoHideMenuBar(hide: Boolean): Unit = js.native
  /**
    * Sets the background color of the window. See Setting `backgroundColor`.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
    * Resizes and moves the window to the supplied bounds. Any properties that are not
    * supplied will default to their current values.
    */
  def setBounds(bounds: PartialRectangle): Unit = js.native
  def setBounds(bounds: PartialRectangle, animate: Boolean): Unit = js.native
  def setBrowserView(): Unit = js.native
  def setBrowserView(browserView: BrowserView): Unit = js.native
  /**
    * Sets whether the window can be manually closed by user. On Linux does nothing.
    *
    * @platform darwin,win32
    */
  def setClosable(closable: Boolean): Unit = js.native
  /**
    * Resizes and moves the window's client area (e.g. the web page) to the supplied
    * bounds.
    */
  def setContentBounds(bounds: Rectangle): Unit = js.native
  def setContentBounds(bounds: Rectangle, animate: Boolean): Unit = js.native
  /**
    * Prevents the window contents from being captured by other apps.
    *
    * On macOS it sets the NSWindow's sharingType to NSWindowSharingNone. On Windows
    * it calls SetWindowDisplayAffinity with `WDA_MONITOR`.
    *
    * @platform darwin,win32
    */
  def setContentProtection(enable: Boolean): Unit = js.native
  /**
    * Resizes the window's client area (e.g. the web page) to `width` and `height`.
    */
  def setContentSize(width: Double, height: Double): Unit = js.native
  def setContentSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  /**
    * Specifies whether the window’s document has been edited, and the icon in title
    * bar will become gray when set to `true`.
    *
    * @platform darwin
    */
  def setDocumentEdited(edited: Boolean): Unit = js.native
  /**
    * Disable or enable the window.
    */
  def setEnabled(enable: Boolean): Unit = js.native
  /**
    * Changes whether the window can be focused.
    * 
  On macOS it does not remove the focus from the window.
    *
    * @platform darwin,win32
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
  def setIcon(icon: String): Unit = js.native
  /**
    * Changes window icon.
    *
    * @platform win32,linux
    */
  def setIcon(icon: NativeImage_): Unit = js.native
  /**
    * Makes the window ignore all mouse events.
    *
    * All mouse events happened in this window will be passed to the window below this
    * window, but if this window has focus, it will still receive keyboard events.
    */
  def setIgnoreMouseEvents(ignore: Boolean): Unit = js.native
  def setIgnoreMouseEvents(ignore: Boolean, options: IgnoreMouseEventsOptions): Unit = js.native
  /**
    * Enters or leaves kiosk mode.
    */
  def setKiosk(flag: Boolean): Unit = js.native
  /**
    * Sets whether the window can be manually maximized by user. On Linux does
    * nothing.
    *
    * @platform darwin,win32
    */
  def setMaximizable(maximizable: Boolean): Unit = js.native
  /**
    * Sets the maximum size of window to `width` and `height`.
    */
  def setMaximumSize(width: Double, height: Double): Unit = js.native
  /**
    * Sets the `menu` as the window's menu bar.
    *
    * @platform linux,win32
    */
  def setMenu(): Unit = js.native
  def setMenu(menu: Menu): Unit = js.native
  /**
    * Sets whether the menu bar should be visible. If the menu bar is auto-hide, users
    * can still bring up the menu bar by pressing the single `Alt` key.
    *
    * @platform win32,linux
    */
  def setMenuBarVisibility(visible: Boolean): Unit = js.native
  /**
    * Sets whether the window can be manually minimized by user. On Linux does
    * nothing.
    *
    * @platform darwin,win32
    */
  def setMinimizable(minimizable: Boolean): Unit = js.native
  /**
    * Sets the minimum size of window to `width` and `height`.
    */
  def setMinimumSize(width: Double, height: Double): Unit = js.native
  /**
    * Sets whether the window can be moved by user. On Linux does nothing.
    *
    * @platform darwin,win32
    */
  def setMovable(movable: Boolean): Unit = js.native
  /**
    * Sets the opacity of the window. On Linux, does nothing. Out of bound number
    * values are clamped to the [0, 1] range.
    *
    * @platform win32,darwin
    */
  def setOpacity(opacity: Double): Unit = js.native
  def setOverlayIcon(overlay: Null, description: String): Unit = js.native
  /**
    * Sets a 16 x 16 pixel overlay onto the current taskbar icon, usually used to
    * convey some sort of application status or to passively notify the user.
    *
    * @platform win32
    */
  def setOverlayIcon(overlay: NativeImage_, description: String): Unit = js.native
  /**
    * Sets `parent` as current window's parent window, passing `null` will turn
    * current window into a top-level window.
    */
  def setParentWindow(): Unit = js.native
  def setParentWindow(parent: BrowserWindow): Unit = js.native
  /**
    * Moves window to `x` and `y`.
    */
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, animate: Boolean): Unit = js.native
  /**
    * Sets progress value in progress bar. Valid range is [0, 1.0].
    *
    * Remove progress bar when progress < 0; Change to indeterminate mode when
    * progress > 1.
    *
    * On Linux platform, only supports Unity desktop environment, you need to specify
    * the `*.desktop` file name to `desktopName` field in `package.json`. By default,
    * it will assume `{app.name}.desktop`.
    *
    * On Windows, a mode can be passed. Accepted values are `none`, `normal`,
    * `indeterminate`, `error`, and `paused`. If you call `setProgressBar` without a
    * mode set (but with a value within the valid range), `normal` will be assumed.
    */
  def setProgressBar(progress: Double): Unit = js.native
  def setProgressBar(progress: Double, options: ProgressBarOptions): Unit = js.native
  /**
    * Sets the pathname of the file the window represents, and the icon of the file
    * will show in window's title bar.
    *
    * @platform darwin
    */
  def setRepresentedFilename(filename: String): Unit = js.native
  /**
    * Sets whether the window can be manually resized by the user.
    */
  def setResizable(resizable: Boolean): Unit = js.native
  /**
    * Setting a window shape determines the area within the window where the system
    * permits drawing and user interaction. Outside of the given region, no pixels
    * will be drawn and no mouse events will be registered. Mouse events outside of
    * the region will not be received by that window, but will fall through to
    * whatever is behind the window.
    *
    * @experimental
    * @platform win32,linux
    */
  def setShape(rects: js.Array[Rectangle]): Unit = js.native
  /**
    * Changes the attachment point for sheets on macOS. By default, sheets are
    * attached just below the window frame, but you may want to display them beneath a
    * HTML-rendered toolbar. For example:
    *
    * @platform darwin
    */
  def setSheetOffset(offsetY: Double): Unit = js.native
  def setSheetOffset(offsetY: Double, offsetX: Double): Unit = js.native
  /**
    * Enters or leaves simple fullscreen mode.
    *
    * Simple fullscreen mode emulates the native fullscreen behavior found in versions
    * of macOS prior to Lion (10.7).
    *
    * @platform darwin
    */
  def setSimpleFullScreen(flag: Boolean): Unit = js.native
  /**
    * Resizes the window to `width` and `height`. If `width` or `height` are below any
    * set minimum size constraints the window will snap to its minimum size.
    */
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  /**
    * Makes the window not show in the taskbar.
    */
  def setSkipTaskbar(skip: Boolean): Unit = js.native
  /**
    * Whether the buttons were added successfully
    *
    * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
    * of a window in a taskbar button layout. Returns a `Boolean` object indicates
    * whether the thumbnail has been added successfully.
    *
    * The number of buttons in thumbnail toolbar should be no greater than 7 due to
    * the limited room. Once you setup the thumbnail toolbar, the toolbar cannot be
    * removed due to the platform's limitation. But you can call the API with an empty
    * array to clean the buttons.
    *
    * The `buttons` is an array of `Button` objects:
    *
    * * `Button` Object
    *   * `icon` NativeImage - The icon showing in thumbnail toolbar.
    *   * `click` Function
    *   * `tooltip` String (optional) - The text of the button's tooltip.
    *   * `flags` String[] (optional) - Control specific states and behaviors of the
    * button. By default, it is `['enabled']`.
    *
    * The `flags` is an array that can include following `String`s:
    *
    * * `enabled` - The button is active and available to the user.
    * * `disabled` - The button is disabled. It is present, but has a visual state
    * indicating it will not respond to user action.
    * * `dismissonclick` - When the button is clicked, the thumbnail window closes
    * immediately.
    * * `nobackground` - Do not draw a button border, use only the image.
    * * `hidden` - The button is not shown to the user.
    * * `noninteractive` - The button is enabled but not interactive; no pressed
    * button state is drawn. This value is intended for instances where the button is
    * used in a notification.
    *
    * @platform win32
    */
  def setThumbarButtons(buttons: js.Array[ThumbarButton]): Boolean = js.native
  /**
    * Sets the region of the window to show as the thumbnail image displayed when
    * hovering over the window in the taskbar. You can reset the thumbnail to be the
    * entire window by specifying an empty region: `{ x: 0, y: 0, width: 0, height: 0
    * }`.
    *
    * @platform win32
    */
  def setThumbnailClip(region: Rectangle): Unit = js.native
  /**
    * Sets the toolTip that is displayed when hovering over the window thumbnail in
    * the taskbar.
    *
    * @platform win32
    */
  def setThumbnailToolTip(toolTip: String): Unit = js.native
  /**
    * Changes the title of native window to `title`.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Sets the touchBar layout for the current window. Specifying `null` or
    * `undefined` clears the touch bar. This method only has an effect if the machine
    * has a touch bar and is running on macOS 10.12.1+.
    *
    * **Note:** The TouchBar API is currently experimental and may change or be
    * removed in future Electron releases.
    *
    * @experimental
    * @platform darwin
    */
  def setTouchBar(): Unit = js.native
  def setTouchBar(touchBar: TouchBar): Unit = js.native
  /**
    * Set a custom position for the traffic light buttons. Can only be used with
    * `titleBarStyle` set to `hidden`.
    *
    * @platform darwin
    */
  def setTrafficLightPosition(position: Point): Unit = js.native
  /**
    * Adds a vibrancy effect to the browser window. Passing `null` or an empty string
    * will remove the vibrancy effect on the window.
    *
    * Note that `appearance-based`, `light`, `dark`, `medium-light`, and `ultra-dark`
    * have been deprecated and will be removed in an upcoming version of macOS.
    *
    * @platform darwin
    */
  def setVibrancy(): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_appearancebased(`type`: `appearance-based`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_content(`type`: content): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_dark(`type`: dark): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_fullscreenui(`type`: `fullscreen-ui`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_header(`type`: header): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_hud(`type`: hud): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_light(`type`: light): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_mediumlight(`type`: `medium-light`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_menu(`type`: menu): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_popover(`type`: popover): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_selection(`type`: selection): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_sheet(`type`: sheet): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_sidebar(`type`: sidebar): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_titlebar(`type`: titlebar): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_tooltip(`type`: tooltip): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_ultradark(`type`: `ultra-dark`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_underpage(`type`: `under-page`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_underwindow(`type`: `under-window`): Unit = js.native
  @JSName("setVibrancy")
  def setVibrancy_window(`type`: window): Unit = js.native
  /**
    * Sets whether the window should be visible on all workspaces.
    * 
  **Note:** This API does nothing on Windows.
    */
  def setVisibleOnAllWorkspaces(visible: Boolean): Unit = js.native
  /**
    * Sets whether the window traffic light buttons should be visible.
    * 
  This cannot be called when `titleBarStyle` is set to `customButtonsOnHover`.
    *
    * @platform darwin
    */
  def setWindowButtonVisibility(visible: Boolean): Unit = js.native
  /**
    * Shows and gives focus to the window.
    */
  def show(): Unit = js.native
  /**
    * Same as `webContents.showDefinitionForSelection()`.
    *
    * @platform darwin
    */
  def showDefinitionForSelection(): Unit = js.native
  /**
    * Shows the window but doesn't focus on it.
    */
  def showInactive(): Unit = js.native
  /**
    * Toggles the visibility of the tab bar if native tabs are enabled and there is
    * only one tab in the current window.
    *
    * @platform darwin
    */
  def toggleTabBar(): Unit = js.native
  /**
    * Unhooks all of the window messages.
    *
    * @platform win32
    */
  def unhookAllWindowMessages(): Unit = js.native
  /**
    * Unhook the window message.
    *
    * @platform win32
    */
  def unhookWindowMessage(message: Double): Unit = js.native
  /**
    * Unmaximizes the window.
    */
  def unmaximize(): Unit = js.native
}

