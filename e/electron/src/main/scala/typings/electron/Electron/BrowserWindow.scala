package typings.electron.Electron

import typings.electron.anon.PartialRectangle
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserWindow extends EventEmitter {
  
  /**
    * A `string` property that defines an alternative title provided only to
    * accessibility tools such as screen readers. This string is not directly visible
    * to users.
    */
  var accessibleTitle: String = js.native
  
  /**
    * Replacement API for setBrowserView supporting work with multi browser views.
    *
    * @experimental
    */
  def addBrowserView(browserView: BrowserView): Unit = js.native
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_unresponsive")
  def addListener(event: "unresponsive", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_focus")
  def addListener(event: "focus", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_scrolltouchedge")
  def addListener(event: "scroll-touch-edge", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_sheetend")
  def addListener(event: "sheet-end", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_move")
  def addListener(event: "move", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_show")
  def addListener(event: "show", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_responsive")
  def addListener(event: "responsive", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_enterhtmlfullscreen")
  def addListener(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_unmaximize")
  def addListener(event: "unmaximize", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_readytoshow")
  def addListener(event: "ready-to-show", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_resize")
  def addListener(event: "resize", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_maximize")
  def addListener(event: "maximize", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_blur")
  def addListener(event: "blur", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_enterfullscreen")
  def addListener(event: "enter-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_moved")
  def addListener(event: "moved", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_resized")
  def addListener(event: "resized", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_closed")
  def addListener(event: "closed", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_hide")
  def addListener(event: "hide", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_scrolltouchend")
  def addListener(event: "scroll-touch-end", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_sessionend")
  def addListener(event: "session-end", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_leavehtmlfullscreen")
  def addListener(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_restore")
  def addListener(event: "restore", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_scrolltouchbegin")
  def addListener(event: "scroll-touch-begin", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_minimize")
  def addListener(event: "minimize", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_newwindowfortab")
  def addListener(event: "new-window-for-tab", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_sheetbegin")
  def addListener(event: "sheet-begin", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_leavefullscreen")
  def addListener(event: "leave-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_appcommand")
  def addListener(event: "app-command", listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_swipe")
  def addListener(event: "swipe", listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_systemcontextmenu")
  def addListener(event: "system-context-menu", listener: js.Function2[/* event */ Event, /* point */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_willmove")
  def addListener(event: "will-move", listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_alwaysontopchanged")
  def addListener(
    event: "always-on-top-changed",
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_rotategesture")
  def addListener(event: "rotate-gesture", listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_willresize")
  def addListener(
    event: "will-resize",
    listener: js.Function3[/* event */ Event, /* newBounds */ Rectangle, /* details */ WillResizeDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pagetitleupdated")
  def addListener(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  
  /**
    * Adds a window as a tab on this window, after the tab for the window instance.
    *
    * @platform darwin
    */
  def addTabbedWindow(browserWindow: BrowserWindow): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window menu bar should hide
    * itself automatically. Once set, the menu bar will only show when users press the
    * single `Alt` key.
    *
    * If the menu bar is already visible, setting this property to `true` won't hide
    * it immediately.
    */
  var autoHideMenuBar: Boolean = js.native
  
  /**
    * Removes focus from the window.
    */
  def blur(): Unit = js.native
  
  def blurWebView(): Unit = js.native
  
  /**
    * Resolves with a NativeImage
    *
    * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
    * whole visible page. If the page is not visible, `rect` may be empty.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
  
  /**
    * Moves window to the center of the screen.
    */
  def center(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually closed
    * by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var closable: Boolean = js.native
  
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
    * A `boolean` property that specifies whether the window’s document has been
    * edited.
    *
    * The icon in title bar will become gray when set to `true`.
    *
    * @platform darwin
    */
  var documentEdited: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is excluded from the
    * application’s Windows menu. `false` by default.
    *
    * @platform darwin
    */
  var excludedFromShownWindowsMenu: Boolean = js.native
  
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
    * A `boolean` property that determines whether the window is focusable.
    *
    * @platform win32,darwin
    */
  var focusable: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is in fullscreen mode.
    */
  var fullScreen: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the maximize/zoom window button
    * toggles fullscreen mode or maximizes the window.
    */
  var fullScreenable: Boolean = js.native
  
  /**
    * Gets the background color of the window in Hex (`#RRGGBB`) format.
    *
    * See Setting `backgroundColor`.
    *
    * **Note:** The alpha value is _not_ returned alongside the red, green, and blue
    * values.
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
    * "window:1324:0".
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
    * The parent window or `null` if there is no parent.
    */
  def getParentWindow(): BrowserWindow | Null = js.native
  
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
    * The custom position for the traffic light buttons in frameless window.
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
  def hookWindowMessage(message: Double, callback: js.Function2[/* wParam */ Any, /* lParam */ Any, Unit]): Unit = js.native
  
  /**
    * A `Integer` property representing the unique ID of the window. Each ID is unique
    * among all `BrowserWindow` instances of the entire Electron application.
    *
    */
  val id: Double = js.native
  
  /**
    * Whether the window is always on top of other windows.
    */
  def isAlwaysOnTop(): Boolean = js.native
  
  /**
    * Whether the window can be manually closed by user.
    *
    * On Linux always returns `true`.
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
    * Returns whether the window can be focused.
    *
    * @platform darwin,win32
    */
  def isFocusable(): Unit = js.native
  
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
    * On Linux always returns `true`.
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
    *
    * @platform win32,linux
    */
  def isMenuBarAutoHide(): Boolean = js.native
  
  /**
    * Whether the menu bar is visible.
    *
    * @platform win32,linux
    */
  def isMenuBarVisible(): Boolean = js.native
  
  /**
    * Whether the window can be manually minimized by the user.
    *
    * On Linux always returns `true`.
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
    *
    * On Linux always returns `true`.
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
    * Whether the window is in Windows 10 tablet mode.
    *
    * Since Windows 10 users can use their PC as tablet, under this mode apps can
    * choose to optimize their UI for tablets, such as enlarging the titlebar and
    * hiding titlebar buttons.
    *
    * This API returns whether the window is in tablet mode, and the `resize` event
    * can be be used to listen to changes to tablet mode.
    *
    * @platform win32
    */
  def isTabletMode(): Boolean = js.native
  
  /**
    * Whether the window is visible to the user.
    */
  def isVisible(): Boolean = js.native
  
  /**
    * Whether the window is visible on all workspaces.
    *
    * **Note:** This API always returns false on Windows.
    *
    * @platform darwin,linux
    */
  def isVisibleOnAllWorkspaces(): Boolean = js.native
  
  /**
    * `true` or `false` depending on whether the message is hooked.
    *
    * @platform win32
    */
  def isWindowMessageHooked(message: Double): Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is in kiosk mode.
    */
  var kiosk: Boolean = js.native
  
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
    * A `boolean` property that determines whether the window can be manually
    * maximized by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var maximizable: Boolean = js.native
  
  /**
    * Maximizes the window. This will also show (but not focus) the window if it isn't
    * being displayed already.
    */
  def maximize(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the menu bar should be visible.
    *
    * **Note:** If the menu bar is auto-hide, users can still bring up the menu bar by
    * pressing the single `Alt` key.
    *
    * @platform win32,linux
    */
  var menuBarVisible: Boolean = js.native
  
  /**
    * Merges all windows into one window with multiple tabs when native tabs are
    * enabled and there is more than one open window.
    *
    * @platform darwin
    */
  def mergeAllWindows(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually
    * minimized by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var minimizable: Boolean = js.native
  
  /**
    * Minimizes the window. On some platforms the minimized window will be shown in
    * the Dock.
    */
  def minimize(): Unit = js.native
  
  /**
    * A `boolean` property that determines Whether the window can be moved by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var movable: Boolean = js.native
  
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
  
  /**
    * Emitted when window is maximized.
    */
  @JSName("on")
  @scala.annotation.targetName("on_maximize")
  def on(event: "maximize", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window opens a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_sheetbegin")
  def on(event: "sheet-begin", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window exits from a maximized state.
    */
  @JSName("on")
  @scala.annotation.targetName("on_unmaximize")
  def on(event: "unmaximize", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is restored from a minimized state.
    */
  @JSName("on")
  @scala.annotation.targetName("on_restore")
  def on(event: "restore", listener: js.Function): this.type = js.native
  /**
    * Emitted once when the window is moved to a new position.
    *
    * __Note__: On macOS this event is an alias of `move`.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_moved")
  def on(event: "moved", listener: js.Function): this.type = js.native
  /**
    * Emitted when window session is going to end due to force shutdown or machine
    * restart or session log off.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_sessionend")
  def on(event: "session-end", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state.
    */
  @JSName("on")
  @scala.annotation.targetName("on_enterfullscreen")
  def on(event: "enter-full-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is shown.
    */
  @JSName("on")
  @scala.annotation.targetName("on_show")
  def on(event: "show", listener: js.Function): this.type = js.native
  /**
    * Emitted when the native new tab button is clicked.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_newwindowfortab")
  def on(event: "new-window-for-tab", listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has begun.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_scrolltouchbegin")
  def on(event: "scroll-touch-begin", listener: js.Function): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  @scala.annotation.targetName("on_responsive")
  def on(event: "responsive", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state triggered by HTML API.
    */
  @JSName("on")
  @scala.annotation.targetName("on_enterhtmlfullscreen")
  def on(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase has ended.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_scrolltouchend")
  def on(event: "scroll-touch-end", listener: js.Function): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  @scala.annotation.targetName("on_unresponsive")
  def on(event: "unresponsive", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state.
    */
  @JSName("on")
  @scala.annotation.targetName("on_leavefullscreen")
  def on(event: "leave-full-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted after the window has been resized.
    */
  @JSName("on")
  @scala.annotation.targetName("on_resize")
  def on(event: "resize", listener: js.Function): this.type = js.native
  /**
    * Emitted once when the window has finished being resized.
    *
    * This is usually emitted when the window has been resized manually. On macOS,
    * resizing the window with `setBounds`/`setSize` and setting the `animate`
    * parameter to `true` will also emit this event once resizing has finished.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_resized")
  def on(event: "resized", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is closed. After you have received this event you should
    * remove the reference to the window and avoid using it any more.
    */
  @JSName("on")
  @scala.annotation.targetName("on_closed")
  def on(event: "closed", listener: js.Function): this.type = js.native
  /**
    * Emitted when scroll wheel event phase filed upon reaching the edge of element.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_scrolltouchedge")
  def on(event: "scroll-touch-edge", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  @scala.annotation.targetName("on_leavehtmlfullscreen")
  def on(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window loses focus.
    */
  @JSName("on")
  @scala.annotation.targetName("on_blur")
  def on(event: "blur", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window has closed a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_sheetend")
  def on(event: "sheet-end", listener: js.Function): this.type = js.native
  /**
    * Emitted when the web page has been rendered (while not being shown) and window
    * can be displayed without a visual flash.
    *
    * Please note that using this event implies that the renderer will be considered
    * "visible" and paint even though `show` is false.  This event will never fire if
    * you use `paintWhenInitiallyHidden: false`
    */
  @JSName("on")
  @scala.annotation.targetName("on_readytoshow")
  def on(event: "ready-to-show", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is minimized.
    */
  @JSName("on")
  @scala.annotation.targetName("on_minimize")
  def on(event: "minimize", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is being moved to a new position.
    */
  @JSName("on")
  @scala.annotation.targetName("on_move")
  def on(event: "move", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window is hidden.
    */
  @JSName("on")
  @scala.annotation.targetName("on_hide")
  def on(event: "hide", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window gains focus.
    */
  @JSName("on")
  @scala.annotation.targetName("on_focus")
  def on(event: "focus", listener: js.Function): this.type = js.native
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
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the system context menu is triggered on the window, this is
    * normally only triggered when the user right clicks on the non-client area of
    * your window.  This is the window titlebar or any area you have declared as
    * `-webkit-app-region: drag` in a frameless window.
    *
    * Calling `event.preventDefault()` will prevent the menu from being displayed.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_systemcontextmenu")
  def on(event: "system-context-menu", listener: js.Function2[/* event */ Event, /* point */ Point, Unit]): this.type = js.native
  /**
    * Emitted before the window is moved. On Windows, calling `event.preventDefault()`
    * will prevent the window from being moved.
    *
    * Note that this is only emitted when the window is being moved manually. Moving
    * the window with `setPosition`/`setBounds`/`center` will not emit this event.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_willmove")
  def on(event: "will-move", listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
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
  @scala.annotation.targetName("on_rotategesture")
  def on(event: "rotate-gesture", listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
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
  @scala.annotation.targetName("on_swipe")
  def on(event: "swipe", listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
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
    * * `browser-backward`
    * * `browser-forward`
    *
    * @platform win32,linux
    */
  @JSName("on")
  @scala.annotation.targetName("on_appcommand")
  def on(event: "app-command", listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  // Docs: https://electronjs.org/docs/api/browser-window
  /**
    * Emitted when the window is set or unset to show always on top of other windows.
    */
  @JSName("on")
  @scala.annotation.targetName("on_alwaysontopchanged")
  def on(
    event: "always-on-top-changed",
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted before the window is resized. Calling `event.preventDefault()` will
    * prevent the window from being resized.
    *
    * Note that this is only emitted when the window is being resized manually.
    * Resizing the window with `setBounds`/`setSize` will not emit this event.
    *
    * The possible values and behaviors of the `edge` option are platform dependent.
    * Possible values are:
    *
    * * On Windows, possible values are `bottom`, `top`, `left`, `right`, `top-left`,
    * `top-right`, `bottom-left`, `bottom-right`.
    * * On macOS, possible values are `bottom` and `right`.
    *   * The value `bottom` is used to denote vertical resizing.
    *   * The value `right` is used to denote horizontal resizing.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_willresize")
  def on(
    event: "will-resize",
    listener: js.Function3[/* event */ Event, /* newBounds */ Rectangle, /* details */ WillResizeDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when the document changed its title, calling `event.preventDefault()`
    * will prevent the native window's title from changing. `explicitSet` is false
    * when title is synthesized from file URL.
    */
  @JSName("on")
  @scala.annotation.targetName("on_pagetitleupdated")
  def on(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_focus")
  def once(event: "focus", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_moved")
  def once(event: "moved", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_sessionend")
  def once(event: "session-end", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_sheetend")
  def once(event: "sheet-end", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_newwindowfortab")
  def once(event: "new-window-for-tab", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_sheetbegin")
  def once(event: "sheet-begin", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_enterfullscreen")
  def once(event: "enter-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_blur")
  def once(event: "blur", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_scrolltouchend")
  def once(event: "scroll-touch-end", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_leavefullscreen")
  def once(event: "leave-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_show")
  def once(event: "show", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resize")
  def once(event: "resize", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_scrolltouchedge")
  def once(event: "scroll-touch-edge", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_maximize")
  def once(event: "maximize", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_scrolltouchbegin")
  def once(event: "scroll-touch-begin", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_hide")
  def once(event: "hide", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_move")
  def once(event: "move", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_leavehtmlfullscreen")
  def once(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unresponsive")
  def once(event: "unresponsive", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unmaximize")
  def once(event: "unmaximize", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resized")
  def once(event: "resized", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_closed")
  def once(event: "closed", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_minimize")
  def once(event: "minimize", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_responsive")
  def once(event: "responsive", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_restore")
  def once(event: "restore", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_readytoshow")
  def once(event: "ready-to-show", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_enterhtmlfullscreen")
  def once(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_alwaysontopchanged")
  def once(
    event: "always-on-top-changed",
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_swipe")
  def once(event: "swipe", listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_rotategesture")
  def once(event: "rotate-gesture", listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_willmove")
  def once(event: "will-move", listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_appcommand")
  def once(event: "app-command", listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_systemcontextmenu")
  def once(event: "system-context-menu", listener: js.Function2[/* event */ Event, /* point */ Point, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_pagetitleupdated")
  def once(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_willresize")
  def once(
    event: "will-resize",
    listener: js.Function3[/* event */ Event, /* newBounds */ Rectangle, /* details */ WillResizeDetails, Unit]
  ): this.type = js.native
  
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
  @scala.annotation.targetName("removeListener_enterfullscreen")
  def removeListener(event: "enter-full-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_sessionend")
  def removeListener(event: "session-end", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_focus")
  def removeListener(event: "focus", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_leavefullscreen")
  def removeListener(event: "leave-full-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_sheetend")
  def removeListener(event: "sheet-end", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_newwindowfortab")
  def removeListener(event: "new-window-for-tab", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_hide")
  def removeListener(event: "hide", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_restore")
  def removeListener(event: "restore", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_resize")
  def removeListener(event: "resize", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_unmaximize")
  def removeListener(event: "unmaximize", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_resized")
  def removeListener(event: "resized", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_scrolltouchend")
  def removeListener(event: "scroll-touch-end", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_unresponsive")
  def removeListener(event: "unresponsive", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_scrolltouchedge")
  def removeListener(event: "scroll-touch-edge", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_show")
  def removeListener(event: "show", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_readytoshow")
  def removeListener(event: "ready-to-show", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_move")
  def removeListener(event: "move", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_leavehtmlfullscreen")
  def removeListener(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_enterhtmlfullscreen")
  def removeListener(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_responsive")
  def removeListener(event: "responsive", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_moved")
  def removeListener(event: "moved", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_scrolltouchbegin")
  def removeListener(event: "scroll-touch-begin", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_closed")
  def removeListener(event: "closed", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_sheetbegin")
  def removeListener(event: "sheet-begin", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_blur")
  def removeListener(event: "blur", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_maximize")
  def removeListener(event: "maximize", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_minimize")
  def removeListener(event: "minimize", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_close")
  def removeListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_appcommand")
  def removeListener(event: "app-command", listener: js.Function2[/* event */ Event, /* command */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_rotategesture")
  def removeListener(event: "rotate-gesture", listener: js.Function2[/* event */ Event, /* rotation */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_swipe")
  def removeListener(event: "swipe", listener: js.Function2[/* event */ Event, /* direction */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_systemcontextmenu")
  def removeListener(event: "system-context-menu", listener: js.Function2[/* event */ Event, /* point */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_willmove")
  def removeListener(event: "will-move", listener: js.Function2[/* event */ Event, /* newBounds */ Rectangle, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_alwaysontopchanged")
  def removeListener(
    event: "always-on-top-changed",
    listener: js.Function2[/* event */ Event, /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_pagetitleupdated")
  def removeListener(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_willresize")
  def removeListener(
    event: "will-resize",
    listener: js.Function3[/* event */ Event, /* newBounds */ Rectangle, /* details */ WillResizeDetails, Unit]
  ): this.type = js.native
  
  /**
    * Remove the window's menu bar.
    *
    * @platform linux,win32
    */
  def removeMenu(): Unit = js.native
  
  /**
    * A `string` property that determines the pathname of the file the window
    * represents, and the icon of the file will show in window's title bar.
    *
    * @platform darwin
    */
  var representedFilename: String = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually resized
    * by user.
    */
  var resizable: Boolean = js.native
  
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
  @JSName("setAlwaysOnTop")
  @scala.annotation.targetName("setAlwaysOnTop_normal_floating_tornoffmenu_modalpanel_mainmenu_status_popupmenu_screensaver")
  def setAlwaysOnTop(
    flag: Boolean,
    level: "normal" | "floating" | "torn-off-menu" | "modal-panel" | "main-menu" | "status" | "pop-up-menu" | "screen-saver"
  ): Unit = js.native
  @JSName("setAlwaysOnTop")
  @scala.annotation.targetName("setAlwaysOnTop_normal_floating_tornoffmenu_modalpanel_mainmenu_status_popupmenu_screensaver")
  def setAlwaysOnTop(
    flag: Boolean,
    level: "normal" | "floating" | "torn-off-menu" | "modal-panel" | "main-menu" | "status" | "pop-up-menu" | "screen-saver",
    relativeLevel: Double
  ): Unit = js.native
  def setAlwaysOnTop(flag: Boolean, level: Unit, relativeLevel: Double): Unit = js.native
  
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
    * The aspect ratio is not respected when window is resized programmatically with
    * APIs like `win.setSize`.
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
    *
    * @platform win32,linux
    */
  def setAutoHideMenuBar(hide: Boolean): Unit = js.native
  
  /**
    * Examples of valid `backgroundColor` values:
    *
    * * Hex
    *   * #fff (shorthand RGB)
    *   * #ffff (shorthand ARGB)
    *   * #ffffff (RGB)
    *   * #ffffffff (ARGB)
    * * RGB
    *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
    *     * e.g. rgb(255, 255, 255)
    * * RGBA
    *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
    *     * e.g. rgba(255, 255, 255, 1.0)
    * * HSL
    *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
    *     * e.g. hsl(200, 20%, 50%)
    * * HSLA
    *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
    *     * e.g. hsla(200, 20%, 50%, 0.5)
    * * Color name
    *   * Options are listed in SkParseColor.cpp
    *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
    *     * e.g. `blueviolet` or `red`
    *
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
    * it calls SetWindowDisplayAffinity with `WDA_EXCLUDEFROMCAPTURE`. For Windows 10
    * version 2004 and up the window will be removed from capture entirely, older
    * Windows versions behave as if `WDA_MONITOR` is applied capturing a black window.
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
    * On macOS it does not remove the focus from the window.
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
    *
    * @platform darwin,win32
    */
  def setSkipTaskbar(skip: Boolean): Unit = js.native
  
  /**
    * Whether the buttons were added successfully
    *
    * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
    * of a window in a taskbar button layout. Returns a `boolean` object indicates
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
    *   * `tooltip` string (optional) - The text of the button's tooltip.
    *   * `flags` string[] (optional) - Control specific states and behaviors of the
    * button. By default, it is `['enabled']`.
    *
    * The `flags` is an array that can include following `string`s:
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
    * On a Window with Window Controls Overlay already enabled, this method updates
    * the style of the title bar overlay.
    *
    * @platform win32
    */
  def setTitleBarOverlay(options: TitleBarOverlayOptions): Unit = js.native
  
  /**
    * Raises `browserView` above other `BrowserView`s attached to `win`. Throws an
    * error if `browserView` is not attached to `win`.
    *
    * @experimental
    */
  def setTopBrowserView(browserView: BrowserView): Unit = js.native
  
  /**
    * Sets the touchBar layout for the current window. Specifying `null` or
    * `undefined` clears the touch bar. This method only has an effect if the machine
    * has a touch bar and is running on macOS 10.12.1+.
    *
    * **Note:** The TouchBar API is currently experimental and may change or be
    * removed in future Electron releases.
    *
    * @platform darwin
    */
  def setTouchBar(): Unit = js.native
  def setTouchBar(touchBar: TouchBar): Unit = js.native
  
  /**
    * Set a custom position for the traffic light buttons in frameless window.
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
  @scala.annotation.targetName("setVibrancy_appearancebased_light_dark_titlebar_selection_menu_popover_sidebar_mediumlight_ultradark_header_sheet_window_hud_fullscreenui_tooltip_content_underwindow_underpage")
  def setVibrancy(
    `type`: "appearance-based" | "light" | "dark" | "titlebar" | "selection" | "menu" | "popover" | "sidebar" | "medium-light" | "ultra-dark" | "header" | "sheet" | "window" | "hud" | "fullscreen-ui" | "tooltip" | "content" | "under-window" | "under-page"
  ): Unit = js.native
  
  /**
    * Sets whether the window should be visible on all workspaces.
    *
    * **Note:** This API does nothing on Windows.
    *
    * @platform darwin,linux
    */
  def setVisibleOnAllWorkspaces(visible: Boolean): Unit = js.native
  def setVisibleOnAllWorkspaces(visible: Boolean, options: VisibleOnAllWorkspacesOptions): Unit = js.native
  
  /**
    * Sets whether the window traffic light buttons should be visible.
    *
    * @platform darwin
    */
  def setWindowButtonVisibility(visible: Boolean): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window has a shadow.
    */
  var shadow: Boolean = js.native
  
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
    * A `boolean` property that determines whether the window is in simple (pre-Lion)
    * fullscreen mode.
    */
  var simpleFullScreen: Boolean = js.native
  
  /**
    * A `string` property that determines the title of the native window.
    *
    * **Note:** The title of the web page can be different from the title of the
    * native window.
    */
  var title: String = js.native
  
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
  
  /**
    * A `boolean` property that determines whether the window is visible on all
    * workspaces.
    *
    * **Note:** Always returns false on Windows.
    *
    * @platform darwin,linux
    */
  var visibleOnAllWorkspaces: Boolean = js.native
  
  /**
    * A `WebContents` object this window owns. All web page related events and
    * operations will be done via it.
    *
    * See the `webContents` documentation for its methods and events.
    *
    */
  val webContents: WebContents_ = js.native
}
