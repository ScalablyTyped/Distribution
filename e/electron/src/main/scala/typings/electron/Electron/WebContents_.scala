package typings.electron.Electron

import typings.electron.electronStrings.HTMLComplete
import typings.electron.electronStrings.HTMLOnly
import typings.electron.electronStrings.MHTML
import typings.electron.electronStrings.`background-tab`
import typings.electron.electronStrings.`before-input-event`
import typings.electron.electronStrings.`certificate-error`
import typings.electron.electronStrings.`console-message`
import typings.electron.electronStrings.`context-menu`
import typings.electron.electronStrings.`cursor-changed`
import typings.electron.electronStrings.`desktop-capturer-get-sources`
import typings.electron.electronStrings.`devtools-closed`
import typings.electron.electronStrings.`devtools-focused`
import typings.electron.electronStrings.`devtools-opened`
import typings.electron.electronStrings.`devtools-reload-page`
import typings.electron.electronStrings.`did-attach-webview`
import typings.electron.electronStrings.`did-change-theme-color`
import typings.electron.electronStrings.`did-fail-load`
import typings.electron.electronStrings.`did-fail-provisional-load`
import typings.electron.electronStrings.`did-finish-load`
import typings.electron.electronStrings.`did-frame-finish-load`
import typings.electron.electronStrings.`did-frame-navigate`
import typings.electron.electronStrings.`did-navigate-in-page`
import typings.electron.electronStrings.`did-navigate`
import typings.electron.electronStrings.`did-redirect-navigation`
import typings.electron.electronStrings.`did-start-loading`
import typings.electron.electronStrings.`did-start-navigation`
import typings.electron.electronStrings.`did-stop-loading`
import typings.electron.electronStrings.`dom-ready`
import typings.electron.electronStrings.`enter-html-full-screen`
import typings.electron.electronStrings.`foreground-tab`
import typings.electron.electronStrings.`found-in-page`
import typings.electron.electronStrings.`ipc-message-sync`
import typings.electron.electronStrings.`ipc-message`
import typings.electron.electronStrings.`leave-html-full-screen`
import typings.electron.electronStrings.`media-paused`
import typings.electron.electronStrings.`media-started-playing`
import typings.electron.electronStrings.`new-window`
import typings.electron.electronStrings.`page-favicon-updated`
import typings.electron.electronStrings.`page-title-updated`
import typings.electron.electronStrings.`plugin-crashed`
import typings.electron.electronStrings.`preload-error`
import typings.electron.electronStrings.`remote-get-builtin`
import typings.electron.electronStrings.`remote-get-current-web-contents`
import typings.electron.electronStrings.`remote-get-current-window`
import typings.electron.electronStrings.`remote-get-global`
import typings.electron.electronStrings.`remote-get-guest-web-contents`
import typings.electron.electronStrings.`remote-require`
import typings.electron.electronStrings.`save-to-disk`
import typings.electron.electronStrings.`select-bluetooth-device`
import typings.electron.electronStrings.`select-client-certificate`
import typings.electron.electronStrings.`update-target-url`
import typings.electron.electronStrings.`will-attach-webview`
import typings.electron.electronStrings.`will-navigate`
import typings.electron.electronStrings.`will-prevent-unload`
import typings.electron.electronStrings.`will-redirect`
import typings.electron.electronStrings.`zoom-changed`
import typings.electron.electronStrings.activateSelection
import typings.electron.electronStrings.backgroundPage
import typings.electron.electronStrings.browserView
import typings.electron.electronStrings.cancelled
import typings.electron.electronStrings.clearSelection
import typings.electron.electronStrings.crashed
import typings.electron.electronStrings.default
import typings.electron.electronStrings.default_public_and_private_interfaces
import typings.electron.electronStrings.default_public_interface_only
import typings.electron.electronStrings.destroyed
import typings.electron.electronStrings.disable_non_proxied_udp
import typings.electron.electronStrings.failed
import typings.electron.electronStrings.in
import typings.electron.electronStrings.keepSelection
import typings.electron.electronStrings.login
import typings.electron.electronStrings.offscreen
import typings.electron.electronStrings.other
import typings.electron.electronStrings.out
import typings.electron.electronStrings.paint
import typings.electron.electronStrings.responsive
import typings.electron.electronStrings.unresponsive
import typings.electron.electronStrings.webview
import typings.electron.electronStrings.window
import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.WebContents")
@js.native
class WebContents_ () extends EventEmitter {
  var audioMuted: Boolean = js.native
  val debugger: Debugger = js.native
  val devToolsWebContents: WebContents_ = js.native
  var frameRate: Double = js.native
  val hostWebContents: WebContents_ = js.native
  val id: Double = js.native
  val session: Session_ = js.native
  var userAgent: String = js.native
  var zoomFactor: Double = js.native
  var zoomLevel: Double = js.native
  def addListener(
    event: `new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other, 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      Unit
    ]
  ): this.type = js.native
  def addListener(
    event: `zoom-changed`,
    listener: js.Function2[/* event */ Event, /* zoomDirection */ in | out, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_beforeinputevent(event: `before-input-event`, listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_certificateerror(
    event: `certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_consolemessage(
    event: `console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ Double, 
      /* message */ String, 
      /* line */ Double, 
      /* sourceId */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_contextmenu(
    event: `context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_crashed(event: crashed, listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_cursorchanged(
    event: `cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ String, 
      /* image */ NativeImage_, 
      /* scale */ Double, 
      /* size */ Size, 
      /* hotspot */ Point, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_desktopcapturergetsources(event: `desktop-capturer-get-sources`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_destroyed(event: destroyed, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_devtoolsclosed(event: `devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_devtoolsfocused(event: `devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_devtoolsopened(event: `devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_devtoolsreloadpage(event: `devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_didattachwebview(
    event: `did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didfailload(
    event: `did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didfailprovisionalload(
    event: `did-fail-provisional-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didfinishload(event: `did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_didframefinishload(
    event: `did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didframenavigate(
    event: `did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didnavigate(
    event: `did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didnavigateinpage(
    event: `did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didredirectnavigation(
    event: `did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didstartloading(event: `did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_didstartnavigation(
    event: `did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didstoploading(event: `did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_foundinpage(event: `found-in-page`, listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ipcmessage(
    event: `ipc-message`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ipcmessagesync(
    event: `ipc-message-sync`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_login(
    event: login,
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_mediapaused(event: `media-paused`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_mediastartedplaying(event: `media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_pagefaviconupdated(
    event: `page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_paint(
    event: paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_plugincrashed(
    event: `plugin-crashed`,
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_preloaderror(
    event: `preload-error`,
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ Error, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetcurrentwebcontents(event: `remote-get-current-web-contents`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetcurrentwindow(event: `remote-get-current-window`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function2[/* event */ IpcMainEvent, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ IpcMainEvent, /* guestWebContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remoterequire(
    event: `remote-require`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_selectbluetoothdevice(
    event: `select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_updatetargeturl(event: `update-target-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_willattachwebview(
    event: `will-attach-webview`,
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willnavigate(event: `will-navigate`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_willpreventunload(event: `will-prevent-unload`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_willredirect(
    event: `will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Adds the specified path to DevTools workspace. Must be used after DevTools
    * creation:
    */
  def addWorkSpace(path: String): Unit = js.native
  /**
    * Begin subscribing for presentation events and captured frames, the `callback`
    * will be called with `callback(image, dirtyRect)` when there is a presentation
    * event.
    *
    * The `image` is an instance of NativeImage that stores the captured frame.
    *
    * The `dirtyRect` is an object with `x, y, width, height` properties that
    * describes which part of the page was repainted. If `onlyDirty` is set to `true`,
    * `image` will only contain the repainted area. `onlyDirty` defaults to `false`.
    */
  def beginFrameSubscription(callback: js.Function2[/* image */ NativeImage_, /* dirtyRect */ Rectangle, Unit]): Unit = js.native
  /**
    * Begin subscribing for presentation events and captured frames, the `callback`
    * will be called with `callback(image, dirtyRect)` when there is a presentation
    * event.
    *
    * The `image` is an instance of NativeImage that stores the captured frame.
    *
    * The `dirtyRect` is an object with `x, y, width, height` properties that
    * describes which part of the page was repainted. If `onlyDirty` is set to `true`,
    * `image` will only contain the repainted area. `onlyDirty` defaults to `false`.
    */
  def beginFrameSubscription(
    onlyDirty: Boolean,
    callback: js.Function2[/* image */ NativeImage_, /* dirtyRect */ Rectangle, Unit]
  ): Unit = js.native
  /**
    * Whether the browser can go back to previous web page.
    */
  def canGoBack(): Boolean = js.native
  /**
    * Whether the browser can go forward to next web page.
    */
  def canGoForward(): Boolean = js.native
  /**
    * Whether the web page can go to `offset`.
    */
  def canGoToOffset(offset: Double): Boolean = js.native
  /**
    * Resolves with a NativeImage
    *
    * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
    * whole visible page.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
  /**
    * Clears the navigation history.
    */
  def clearHistory(): Unit = js.native
  /**
    * Closes the devtools.
    */
  def closeDevTools(): Unit = js.native
  /**
    * Executes the editing command `copy` in web page.
    */
  def copy(): Unit = js.native
  /**
    * Copy the image at the given position to the clipboard.
    */
  def copyImageAt(x: Double, y: Double): Unit = js.native
  /**
    * Executes the editing command `cut` in web page.
    */
  def cut(): Unit = js.native
  /**
    * Decrease the capturer count by one. The page will be set to hidden or occluded
    * state when its browser window is hidden or occluded and the capturer count
    * reaches zero. If you want to decrease the hidden capturer count instead you
    * should set `stayHidden` to true.
    */
  def decrementCapturerCount(): Unit = js.native
  def decrementCapturerCount(stayHidden: Boolean): Unit = js.native
  /**
    * Executes the editing command `delete` in web page.
    */
  def delete(): Unit = js.native
  /**
    * Disable device emulation enabled by `webContents.enableDeviceEmulation`.
    */
  def disableDeviceEmulation(): Unit = js.native
  /**
    * Initiates a download of the resource at `url` without navigating. The
    * `will-download` event of `session` will be triggered.
    */
  def downloadURL(url: String): Unit = js.native
  /**
    * Enable device emulation with the given parameters.
    */
  def enableDeviceEmulation(parameters: Parameters): Unit = js.native
  /**
    * End subscribing for frame presentation events.
    */
  def endFrameSubscription(): Unit = js.native
  /**
    * A promise that resolves with the result of the executed code or is rejected if
    * the result of the code is a rejected promise.
    *
    * Evaluates `code` in page.
    *
    * In the browser window some HTML APIs like `requestFullScreen` can only be
    * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
    * this limitation.
  Code execution will be suspended until web page stop loading.
    */
  def executeJavaScript(code: String): js.Promise[_] = js.native
  def executeJavaScript(code: String, userGesture: Boolean): js.Promise[_] = js.native
  /**
    * A promise that resolves with the result of the executed code or is rejected if
    * the result of the code is a rejected promise.
    * 
  Works like `executeJavaScript` but evaluates `scripts` in an isolated context.
    */
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource]): js.Promise[_] = js.native
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource], userGesture: Boolean): js.Promise[_] = js.native
  /**
    * The request id used for the request.
    *
    * Starts a request to find all matches for the `text` in the web page. The result
    * of the request can be obtained by subscribing to `found-in-page` event.
    */
  def findInPage(text: String): Double = js.native
  def findInPage(text: String, options: FindInPageOptions): Double = js.native
  /**
    * Focuses the web page.
    */
  def focus(): Unit = js.native
  /**
    * Information about all Shared Workers.
    */
  def getAllSharedWorkers(): js.Array[SharedWorkerInfo] = js.native
  /**
    * If *offscreen rendering* is enabled returns the current frame rate.
    * 
  **Deprecated**
    */
  def getFrameRate(): Double = js.native
  /**
    * The operating system `pid` of the associated renderer process.
    */
  def getOSProcessId(): Double = js.native
  /**
    * Get the system printer list.
    */
  def getPrinters(): js.Array[PrinterInfo] = js.native
  /**
    * The Chromium internal `pid` of the associated renderer. Can be compared to the
    * `frameProcessId` passed by frame specific navigation events (e.g.
    * `did-frame-navigate`)
    */
  def getProcessId(): Double = js.native
  /**
    * The title of the current web page.
    */
  def getTitle(): String = js.native
  /**
    * the type of the webContent. Can be `backgroundPage`, `window`, `browserView`,
    * `remote`, `webview` or `offscreen`.
    */
  def getType(): backgroundPage | window | browserView | typings.electron.electronStrings.remote | webview | offscreen = js.native
  /**
    * The URL of the current web page.
    */
  def getURL(): String = js.native
  /**
    * The user agent for this web page.
  **Deprecated**
    */
  def getUserAgent(): String = js.native
  /**
    * Returns the WebRTC IP Handling Policy.
    */
  def getWebRTCIPHandlingPolicy(): String = js.native
  /**
    * the current zoom factor.
  **Deprecated**
    */
  def getZoomFactor(): Double = js.native
  /**
    * the current zoom level.
  **Deprecated**
    */
  def getZoomLevel(): Double = js.native
  /**
    * Makes the browser go back a web page.
    */
  def goBack(): Unit = js.native
  /**
    * Makes the browser go forward a web page.
    */
  def goForward(): Unit = js.native
  /**
    * Navigates browser to the specified absolute web page index.
    */
  def goToIndex(index: Double): Unit = js.native
  /**
    * Navigates to the specified offset from the "current entry".
    */
  def goToOffset(offset: Double): Unit = js.native
  /**
    * Increase the capturer count by one. The page is considered visible when its
    * browser window is hidden and the capturer count is non-zero. If you would like
    * the page to stay hidden, you should ensure that `stayHidden` is set to true.
    * 
  This also affects the Page Visibility API.
    */
  def incrementCapturerCount(): Unit = js.native
  def incrementCapturerCount(size: Size): Unit = js.native
  def incrementCapturerCount(size: Size, stayHidden: Boolean): Unit = js.native
  /**
    * A promise that resolves with a key for the inserted CSS that can later be used
    * to remove the CSS via `contents.removeInsertedCSS(key)`.
    *
    * Injects CSS into the current web page and returns a unique key for the inserted
    * stylesheet.
    */
  def insertCSS(css: String): js.Promise[String] = js.native
  def insertCSS(css: String, options: InsertCSSOptions): js.Promise[String] = js.native
  /**
    * Inserts `text` to the focused element.
    */
  def insertText(text: String): js.Promise[Unit] = js.native
  /**
    * Starts inspecting element at position (`x`, `y`).
    */
  def inspectElement(x: Double, y: Double): Unit = js.native
  /**
    * Opens the developer tools for the service worker context.
    */
  def inspectServiceWorker(): Unit = js.native
  /**
    * Opens the developer tools for the shared worker context.
    */
  def inspectSharedWorker(): Unit = js.native
  /**
    * Inspects the shared worker based on its ID.
    */
  def inspectSharedWorkerById(workerId: String): Unit = js.native
  /**
    * Schedules a full repaint of the window this web contents is in.
    *
    * If *offscreen rendering* is enabled invalidates the frame and generates a new
    * one through the `'paint'` event.
    */
  def invalidate(): Unit = js.native
  /**
    * Whether this page has been muted.
  **Deprecated**
    */
  def isAudioMuted(): Boolean = js.native
  /**
    * Whether this page is being captured. It returns true when the capturer count is
    * large then 0.
    */
  def isBeingCaptured(): Boolean = js.native
  /**
    * Whether the renderer process has crashed.
    */
  def isCrashed(): Boolean = js.native
  /**
    * Whether audio is currently playing.
    */
  def isCurrentlyAudible(): Boolean = js.native
  /**
    * Whether the web page is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  /**
    * Whether the devtools view is focused .
    */
  def isDevToolsFocused(): Boolean = js.native
  /**
    * Whether the devtools is opened.
    */
  def isDevToolsOpened(): Boolean = js.native
  /**
    * Whether the web page is focused.
    */
  def isFocused(): Boolean = js.native
  /**
    * Whether web page is still loading resources.
    */
  def isLoading(): Boolean = js.native
  /**
    * Whether the main frame (and not just iframes or frames within it) is still
    * loading.
    */
  def isLoadingMainFrame(): Boolean = js.native
  /**
    * Indicates whether *offscreen rendering* is enabled.
    */
  def isOffscreen(): Boolean = js.native
  /**
    * If *offscreen rendering* is enabled returns whether it is currently painting.
    */
  def isPainting(): Boolean = js.native
  /**
    * Whether the web page is waiting for a first-response from the main resource of
    * the page.
    */
  def isWaitingForResponse(): Boolean = js.native
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Loads the given file in the window, `filePath` should be a path to an HTML file
    * relative to the root of your application.  For instance an app structure like
    * this:
  Would require code like this
    */
  def loadFile(filePath: String): js.Promise[Unit] = js.native
  def loadFile(filePath: String, options: LoadFileOptions): js.Promise[Unit] = js.native
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    * A noop rejection handler is already attached, which avoids unhandled rejection
    * errors.
    *
    * Loads the `url` in the window. The `url` must contain the protocol prefix, e.g.
    * the `http://` or `file://`. If the load should bypass http cache then use the
    * `pragma` header to achieve it.
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  def loadURL(url: String, options: LoadURLOptions): js.Promise[Unit] = js.native
  /**
    * Emitted when the page requests to open a new window for a `url`. It could be
    * requested by `window.open` or an external link like `<a target='_blank'>`.
    *
    * By default a new `BrowserWindow` will be created for the `url`.
    *
    * Calling `event.preventDefault()` will prevent Electron from automatically
    * creating a new `BrowserWindow`. If you call `event.preventDefault()` and
    * manually create a new `BrowserWindow` then you must set `event.newGuest` to
    * reference the new `BrowserWindow` instance, failing to do so may result in
    * unexpected behavior. For example:
    */
  def on(
    event: `new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other, 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the user is requesting to change the zoom level using the mouse
    * wheel.
    */
  def on(
    event: `zoom-changed`,
    listener: js.Function2[/* event */ Event, /* zoomDirection */ in | out, Unit]
  ): this.type = js.native
  /**
    * Emitted before dispatching the `keydown` and `keyup` events in the page. Calling
    * `event.preventDefault` will prevent the page `keydown`/`keyup` events and the
    * menu shortcuts.
    * 
  To only prevent the menu shortcuts, use `setIgnoreMenuShortcuts`:
    */
  @JSName("on")
  def on_beforeinputevent(event: `before-input-event`, listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  /**
    * Emitted when failed to verify the `certificate` for `url`.
    * 
  The usage is the same with the `certificate-error` event of `app`.
    */
  @JSName("on")
  def on_certificateerror(
    event: `certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the associated window logs a console message.
    */
  @JSName("on")
  def on_consolemessage(
    event: `console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ Double, 
      /* message */ String, 
      /* line */ Double, 
      /* sourceId */ String, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when there is a new context menu that needs to be handled.
    */
  @JSName("on")
  def on_contextmenu(
    event: `context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process crashes or is killed.
    */
  @JSName("on")
  def on_crashed(event: crashed, listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  /**
    * Emitted when the cursor's type changes. The `type` parameter can be `default`,
    * `crosshair`, `pointer`, `text`, `wait`, `help`, `e-resize`, `n-resize`,
    * `ne-resize`, `nw-resize`, `s-resize`, `se-resize`, `sw-resize`, `w-resize`,
    * `ns-resize`, `ew-resize`, `nesw-resize`, `nwse-resize`, `col-resize`,
    * `row-resize`, `m-panning`, `e-panning`, `n-panning`, `ne-panning`, `nw-panning`,
    * `s-panning`, `se-panning`, `sw-panning`, `w-panning`, `move`, `vertical-text`,
    * `cell`, `context-menu`, `alias`, `progress`, `nodrop`, `copy`, `none`,
    * `not-allowed`, `zoom-in`, `zoom-out`, `grab`, `grabbing` or `custom`.
    *
    * If the `type` parameter is `custom`, the `image` parameter will hold the custom
    * cursor image in a `NativeImage`, and `scale`, `size` and `hotspot` will hold
    * additional information about the custom cursor.
    */
  @JSName("on")
  def on_cursorchanged(
    event: `cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ String, 
      /* image */ NativeImage_, 
      /* scale */ Double, 
      /* size */ Size, 
      /* hotspot */ Point, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when `desktopCapturer.getSources()` is called in the renderer process.
    * Calling `event.preventDefault()` will make it return empty sources.
    */
  @JSName("on")
  def on_desktopcapturergetsources(event: `desktop-capturer-get-sources`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when `webContents` is destroyed.
    */
  @JSName("on")
  def on_destroyed(event: destroyed, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is closed.
    */
  @JSName("on")
  def on_devtoolsclosed(event: `devtools-closed`, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is focused / opened.
    */
  @JSName("on")
  def on_devtoolsfocused(event: `devtools-focused`, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is opened.
    */
  @JSName("on")
  def on_devtoolsopened(event: `devtools-opened`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the devtools window instructs the webContents to reload
    */
  @JSName("on")
  def on_devtoolsreloadpage(event: `devtools-reload-page`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a `<webview>` has been attached to this web contents.
    */
  @JSName("on")
  def on_didattachwebview(
    event: `did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  /**
    * Emitted when a page's theme color changes. This is usually due to encountering a
    * meta tag:
    */
  @JSName("on")
  def on_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  /**
    * This event is like `did-finish-load` but emitted when the load failed. The full
    * list of error codes and their meaning is available here.
    */
  @JSName("on")
  def on_didfailload(
    event: `did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * This event is like `did-fail-load` but emitted when the load was cancelled (e.g.
    * `window.stop()` was invoked).
    */
  @JSName("on")
  def on_didfailprovisionalload(
    event: `did-fail-provisional-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the navigation is done, i.e. the spinner of the tab has stopped
    * spinning, and the `onload` event was dispatched.
    */
  @JSName("on")
  def on_didfinishload(event: `did-finish-load`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a frame has done navigation.
    */
  @JSName("on")
  def on_didframefinishload(
    event: `did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any frame navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("on")
  def on_didframenavigate(
    event: `did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a main frame navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("on")
  def on_didnavigate(
    event: `did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when an in-page navigation happened in any frame.
    *
    * When in-page navigation happens, the page URL changes but does not cause
    * navigation outside of the page. Examples of this occurring are when anchor links
    * are clicked or when the DOM `hashchange` event is triggered.
    */
  @JSName("on")
  def on_didnavigateinpage(
    event: `did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after a server side redirect occurs during navigation.  For example a
    * 302 redirect.
    *
    * This event can not be prevented, if you want to prevent redirects you should
    * checkout out the `will-redirect` event above.
    */
  @JSName("on")
  def on_didredirectnavigation(
    event: `did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab started spinning.
    */
  @JSName("on")
  def on_didstartloading(event: `did-start-loading`, listener: js.Function): this.type = js.native
  /**
    * Emitted when any frame (including main) starts navigating. `isInplace` will be
    * `true` for in-page navigations.
    */
  @JSName("on")
  def on_didstartnavigation(
    event: `did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab stopped spinning.
    */
  @JSName("on")
  def on_didstoploading(event: `did-stop-loading`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the document in the given frame is loaded.
    */
  @JSName("on")
  def on_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a result is available for [`webContents.findInPage`] request.
    */
  @JSName("on")
  def on_foundinpage(event: `found-in-page`, listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  /**
    * Emitted when the renderer process sends an asynchronous message via
    * `ipcRenderer.send()`.
    */
  @JSName("on")
  def on_ipcmessage(
    event: `ipc-message`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process sends a synchronous message via
    * `ipcRenderer.sendSync()`.
    */
  @JSName("on")
  def on_ipcmessagesync(
    event: `ipc-message-sync`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when `webContents` wants to do basic auth.
    * 
  The usage is the same with the `login` event of `app`.
    */
  @JSName("on")
  def on_login(
    event: login,
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when media is paused or done playing.
    */
  @JSName("on")
  def on_mediapaused(event: `media-paused`, listener: js.Function): this.type = js.native
  /**
    * Emitted when media starts playing.
    */
  @JSName("on")
  def on_mediastartedplaying(event: `media-started-playing`, listener: js.Function): this.type = js.native
  /**
    * Emitted when page receives favicon urls.
    */
  @JSName("on")
  def on_pagefaviconupdated(
    event: `page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  /**
    * Fired when page title is set during navigation. `explicitSet` is false when
    * title is synthesized from file url.
    */
  @JSName("on")
  def on_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when a new frame is generated. Only the dirty area is passed in the
    * buffer.
    */
  @JSName("on")
  def on_paint(
    event: paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  /**
    * Emitted when a plugin process has crashed.
    */
  @JSName("on")
  def on_plugincrashed(
    event: `plugin-crashed`,
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the preload script `preloadPath` throws an unhandled exception
    * `error`.
    */
  @JSName("on")
  def on_preloaderror(
    event: `preload-error`,
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ Error, Unit]
  ): this.type = js.native
  /**
    * Emitted when `remote.getBuiltin()` is called in the renderer process. Calling
    * `event.preventDefault()` will prevent the module from being returned. Custom
    * value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when `remote.getCurrentWebContents()` is called in the renderer process.
    * Calling `event.preventDefault()` will prevent the object from being returned.
    * Custom value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remotegetcurrentwebcontents(event: `remote-get-current-web-contents`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  /**
    * Emitted when `remote.getCurrentWindow()` is called in the renderer process.
    * Calling `event.preventDefault()` will prevent the object from being returned.
    * Custom value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remotegetcurrentwindow(event: `remote-get-current-window`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  /**
    * Emitted when `remote.getGlobal()` is called in the renderer process. Calling
    * `event.preventDefault()` will prevent the global from being returned. Custom
    * value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function2[/* event */ IpcMainEvent, /* globalName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when `<webview>.getWebContents()` is called in the renderer process.
    * Calling `event.preventDefault()` will prevent the object from being returned.
    * Custom value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ IpcMainEvent, /* guestWebContents */ this.type, Unit]
  ): this.type = js.native
  /**
    * Emitted when `remote.require()` is called in the renderer process. Calling
    * `event.preventDefault()` will prevent the module from being returned. Custom
    * value can be returned by setting `event.returnValue`.
    */
  @JSName("on")
  def on_remoterequire(
    event: `remote-require`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  def on_responsive(event: responsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when bluetooth device needs to be selected on call to
    * `navigator.bluetooth.requestDevice`. To use `navigator.bluetooth` api
    * `webBluetooth` should be enabled. If `event.preventDefault` is not called, first
    * available device will be selected. `callback` should be called with `deviceId`
    * to be selected, passing empty string to `callback` will cancel the request.
    */
  @JSName("on")
  def on_selectbluetoothdevice(
    event: `select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a client certificate is requested.
    * 
  The usage is the same with the `select-client-certificate` event of `app`.
    */
  @JSName("on")
  def on_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  def on_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
    */
  @JSName("on")
  def on_updatetargeturl(event: `update-target-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when a `<webview>`'s web contents is being attached to this web
    * contents. Calling `event.preventDefault()` will destroy the guest page.
    *
    * This event can be used to configure `webPreferences` for the `webContents` of a
    * `<webview>` before it's loaded, and provides the ability to set settings that
    * can't be set via `<webview>` attributes.
    *
    * **Note:** The specified `preload` script option will be appear as `preloadURL`
    * (not `preload`) in the `webPreferences` object emitted with this event.
    */
  @JSName("on")
  def on_willattachwebview(
    event: `will-attach-webview`,
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a user or the page wants to start navigation. It can happen when
    * the `window.location` object is changed or a user clicks a link in the page.
    *
    * This event will not emit when the navigation is started programmatically with
    * APIs like `webContents.loadURL` and `webContents.back`.
    *
    * It is also not emitted for in-page navigations, such as clicking anchor links or
    * updating the `window.location.hash`. Use `did-navigate-in-page` event for this
    * purpose.
  Calling `event.preventDefault()` will prevent the navigation.
    */
  @JSName("on")
  def on_willnavigate(event: `will-navigate`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when a `beforeunload` event handler is attempting to cancel a page
    * unload.
    *
    * Calling `event.preventDefault()` will ignore the `beforeunload` event handler
    * and allow the page to be unloaded.
    */
  @JSName("on")
  def on_willpreventunload(event: `will-prevent-unload`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted as a server side redirect occurs during navigation.  For example a 302
    * redirect.
    *
    * This event will be emitted after `did-start-navigation` and always before the
    * `did-redirect-navigation` event for the same navigation.
    *
    * Calling `event.preventDefault()` will prevent the navigation (not just the
    * redirect).
    */
  @JSName("on")
  def on_willredirect(
    event: `will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  def once(
    event: `new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other, 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      Unit
    ]
  ): this.type = js.native
  def once(
    event: `zoom-changed`,
    listener: js.Function2[/* event */ Event, /* zoomDirection */ in | out, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beforeinputevent(event: `before-input-event`, listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("once")
  def once_certificateerror(
    event: `certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_consolemessage(
    event: `console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ Double, 
      /* message */ String, 
      /* line */ Double, 
      /* sourceId */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    event: `context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_crashed(event: crashed, listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_cursorchanged(
    event: `cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ String, 
      /* image */ NativeImage_, 
      /* scale */ Double, 
      /* size */ Size, 
      /* hotspot */ Point, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_desktopcapturergetsources(event: `desktop-capturer-get-sources`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_destroyed(event: destroyed, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_devtoolsclosed(event: `devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_devtoolsfocused(event: `devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_devtoolsopened(event: `devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_devtoolsreloadpage(event: `devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_didattachwebview(
    event: `did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_didfailload(
    event: `did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didfailprovisionalload(
    event: `did-fail-provisional-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didfinishload(event: `did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_didframefinishload(
    event: `did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didframenavigate(
    event: `did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didnavigate(
    event: `did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didnavigateinpage(
    event: `did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didredirectnavigation(
    event: `did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didstartloading(event: `did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_didstartnavigation(
    event: `did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_didstoploading(event: `did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_foundinpage(event: `found-in-page`, listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("once")
  def once_ipcmessage(
    event: `ipc-message`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ipcmessagesync(
    event: `ipc-message-sync`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_login(
    event: login,
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_mediapaused(event: `media-paused`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_mediastartedplaying(event: `media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_pagefaviconupdated(
    event: `page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_paint(
    event: paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_plugincrashed(
    event: `plugin-crashed`,
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_preloaderror(
    event: `preload-error`,
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ Error, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetcurrentwebcontents(event: `remote-get-current-web-contents`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_remotegetcurrentwindow(event: `remote-get-current-window`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function2[/* event */ IpcMainEvent, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ IpcMainEvent, /* guestWebContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remoterequire(
    event: `remote-require`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_selectbluetoothdevice(
    event: `select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_updatetargeturl(event: `update-target-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_willattachwebview(
    event: `will-attach-webview`,
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_willnavigate(event: `will-navigate`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_willpreventunload(event: `will-prevent-unload`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_willredirect(
    event: `will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Opens the devtools.
    *
    * When `contents` is a `<webview>` tag, the `mode` would be `detach` by default,
    * explicitly passing an empty `mode` can force using last used dock state.
    */
  def openDevTools(): Unit = js.native
  def openDevTools(options: OpenDevToolsOptions): Unit = js.native
  /**
    * Executes the editing command `paste` in web page.
    */
  def paste(): Unit = js.native
  /**
    * Executes the editing command `pasteAndMatchStyle` in web page.
    */
  def pasteAndMatchStyle(): Unit = js.native
  /**
    * Prints window's web page. When `silent` is set to `true`, Electron will pick the
    * system's default printer if `deviceName` is empty and the default settings for
    * printing.
    *
    * Use `page-break-before: always;` CSS style to force to print to a new page.
    * 
  Example usage:
    */
  def print(): Unit = js.native
  def print(options: WebContentsPrintOptions): Unit = js.native
  def print(
    options: WebContentsPrintOptions,
    callback: js.Function2[/* success */ Boolean, /* failureReason */ cancelled | failed, Unit]
  ): Unit = js.native
  /**
    * Resolves with the generated PDF data.
    *
    * Prints window's web page as PDF with Chromium's preview printing custom
    * settings.
    *
    * The `landscape` will be ignored if `@page` CSS at-rule is used in the web page.
    *
    * By default, an empty `options` will be regarded as:
    *
    * Use `page-break-before: always;` CSS style to force to print to a new page.
    * 
  An example of `webContents.printToPDF`:
    */
  def printToPDF(options: PrintToPDFOptions): js.Promise[Buffer] = js.native
  /**
    * Executes the editing command `redo` in web page.
    */
  def redo(): Unit = js.native
  /**
    * Reloads the current web page.
    */
  def reload(): Unit = js.native
  /**
    * Reloads current page and ignores cache.
    */
  def reloadIgnoringCache(): Unit = js.native
  /**
    * Resolves if the removal was successful.
    *
    * Removes the inserted CSS from the current web page. The stylesheet is identified
    * by its key, which is returned from `contents.insertCSS(css)`.
    */
  def removeInsertedCSS(key: String): js.Promise[Unit] = js.native
  def removeListener(
    event: `new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other, 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      Unit
    ]
  ): this.type = js.native
  def removeListener(
    event: `zoom-changed`,
    listener: js.Function2[/* event */ Event, /* zoomDirection */ in | out, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforeinputevent(event: `before-input-event`, listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_certificateerror(
    event: `certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_consolemessage(
    event: `console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ Double, 
      /* message */ String, 
      /* line */ Double, 
      /* sourceId */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_contextmenu(
    event: `context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_crashed(event: crashed, listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_cursorchanged(
    event: `cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ String, 
      /* image */ NativeImage_, 
      /* scale */ Double, 
      /* size */ Size, 
      /* hotspot */ Point, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_desktopcapturergetsources(event: `desktop-capturer-get-sources`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_destroyed(event: destroyed, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_devtoolsclosed(event: `devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_devtoolsfocused(event: `devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_devtoolsopened(event: `devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_devtoolsreloadpage(event: `devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_didattachwebview(
    event: `did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didchangethemecolor(
    event: `did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didfailload(
    event: `did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didfailprovisionalload(
    event: `did-fail-provisional-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ Double, 
      /* errorDescription */ String, 
      /* validatedURL */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didfinishload(event: `did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_didframefinishload(
    event: `did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didframenavigate(
    event: `did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didnavigate(
    event: `did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didnavigateinpage(
    event: `did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ String, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didredirectnavigation(
    event: `did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didstartloading(event: `did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_didstartnavigation(
    event: `did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didstoploading(event: `did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_domready(event: `dom-ready`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_foundinpage(event: `found-in-page`, listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ipcmessage(
    event: `ipc-message`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_ipcmessagesync(
    event: `ipc-message-sync`,
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ js.Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_login(
    event: login,
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_mediapaused(event: `media-paused`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_mediastartedplaying(event: `media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_pagefaviconupdated(
    event: `page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_paint(
    event: paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_plugincrashed(
    event: `plugin-crashed`,
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_preloaderror(
    event: `preload-error`,
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ Error, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetcurrentwebcontents(event: `remote-get-current-web-contents`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetcurrentwindow(event: `remote-get-current-window`, listener: js.Function1[/* event */ IpcMainEvent, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function2[/* event */ IpcMainEvent, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ IpcMainEvent, /* guestWebContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remoterequire(
    event: `remote-require`,
    listener: js.Function2[/* event */ IpcMainEvent, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_responsive(event: responsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectbluetoothdevice(
    event: `select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unresponsive(event: unresponsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_updatetargeturl(event: `update-target-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_willattachwebview(
    event: `will-attach-webview`,
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willnavigate(event: `will-navigate`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_willpreventunload(event: `will-prevent-unload`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_willredirect(
    event: `will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* isInPlace */ Boolean, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Removes the specified path from DevTools workspace.
    */
  def removeWorkSpace(path: String): Unit = js.native
  /**
    * Executes the editing command `replace` in web page.
    */
  def replace(text: String): Unit = js.native
  /**
    * Executes the editing command `replaceMisspelling` in web page.
    */
  def replaceMisspelling(text: String): Unit = js.native
  @JSName("savePage")
  def savePage_HTMLComplete(fullPath: String, saveType: HTMLComplete): js.Promise[Unit] = js.native
  /**
    * resolves if the page is saved.
    */
  @JSName("savePage")
  def savePage_HTMLOnly(fullPath: String, saveType: HTMLOnly): js.Promise[Unit] = js.native
  @JSName("savePage")
  def savePage_MHTML(fullPath: String, saveType: MHTML): js.Promise[Unit] = js.native
  /**
    * Executes the editing command `selectAll` in web page.
    */
  def selectAll(): Unit = js.native
  /**
    * Send an asynchronous message to the renderer process via `channel`, along with
    * arguments. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `postMessage`, so prototype chains will not be included. Sending
    * Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The renderer process can handle the message by listening to `channel` with the
    * `ipcRenderer` module.
    * 
  An example of sending messages from the main process to the renderer process:
    */
  def send(channel: String, args: js.Any*): Unit = js.native
  def sendInputEvent(inputEvent: KeyboardInputEvent): Unit = js.native
  /**
    * Sends an input `event` to the page. **Note:** The `BrowserWindow` containing the
    * contents needs to be focused for `sendInputEvent()` to work.
    */
  def sendInputEvent(inputEvent: MouseInputEvent): Unit = js.native
  def sendInputEvent(inputEvent: MouseWheelInputEvent): Unit = js.native
  /**
    * Send an asynchronous message to a specific frame in a renderer process via
    * `channel`, along with arguments. Arguments will be serialized with the
    * Structured Clone Algorithm, just like `postMessage`, so prototype chains will
    * not be included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets
    * will throw an exception.
    *
    * > **NOTE**: Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects is deprecated, and will begin throwing an exception starting
    * with Electron 9.
    *
    * The renderer process can handle the message by listening to `channel` with the
    * `ipcRenderer` module.
    *
    * If you want to get the `frameId` of a given renderer context you should use the
    * `webFrame.routingId` value.  E.g.
    * 
  You can also read `frameId` from all incoming IPC messages in the main process.
    */
  def sendToFrame(frameId: Double, channel: String, args: js.Any*): Unit = js.native
  /**
    * Mute the audio on the current web page.
  **Deprecated**
    */
  def setAudioMuted(muted: Boolean): Unit = js.native
  /**
    * Controls whether or not this WebContents will throttle animations and timers
    * when the page becomes backgrounded. This also affects the Page Visibility API.
    */
  def setBackgroundThrottling(allowed: Boolean): Unit = js.native
  /**
    * Uses the `devToolsWebContents` as the target `WebContents` to show devtools.
    *
    * The `devToolsWebContents` must not have done any navigation, and it should not
    * be used for other purposes after the call.
    *
    * By default Electron manages the devtools by creating an internal `WebContents`
    * with native view, which developers have very limited control of. With the
    * `setDevToolsWebContents` method, developers can use any `WebContents` to show
    * the devtools in it, including `BrowserWindow`, `BrowserView` and `<webview>`
    * tag.
    *
    * Note that closing the devtools does not destroy the `devToolsWebContents`, it is
    * caller's responsibility to destroy `devToolsWebContents`.
    *
    * An example of showing devtools in a `<webview>` tag:
    * 
  An example of showing devtools in a `BrowserWindow`:
    */
  def setDevToolsWebContents(devToolsWebContents: WebContents_): Unit = js.native
  /**
    * If *offscreen rendering* is enabled sets the frame rate to the specified number.
    * Only values between 1 and 60 are accepted.
  **Deprecated**
    */
  def setFrameRate(fps: Double): Unit = js.native
  /**
    * Ignore application menu shortcuts while this web contents is focused.
    *
    * @experimental
    */
  def setIgnoreMenuShortcuts(ignore: Boolean): Unit = js.native
  /**
    * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
    * 
  **Deprecated:** This API is no longer supported by Chromium.
    *
    * @deprecated
    */
  def setLayoutZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): js.Promise[Unit] = js.native
  /**
    * Overrides the user agent for this web page.
  **Deprecated**
    */
  def setUserAgent(userAgent: String): Unit = js.native
  /**
    * Sets the maximum and minimum pinch-to-zoom level.
    *
    * > **NOTE**: Visual zoom is disabled by default in Electron. To re-enable it,
    * call:
    */
  def setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): js.Promise[Unit] = js.native
  /**
    * Setting the WebRTC IP handling policy allows you to control which IPs are
    * exposed via WebRTC. See BrowserLeaks for more details.
    */
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_default(policy: default): Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_defaultpublicandprivateinterfaces(policy: default_public_and_private_interfaces): Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_defaultpublicinterfaceonly(policy: default_public_interface_only): Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_disablenonproxiedudp(policy: disable_non_proxied_udp): Unit = js.native
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
  **Deprecated**
    */
  def setZoomFactor(factor: Double): Unit = js.native
  /**
    * Changes the zoom level to the specified level. The original size is 0 and each
    * increment above or below represents zooming 20% larger or smaller to default
    * limits of 300% and 50% of original size, respectively. The formula for this is
    * `scale := 1.2 ^ level`.
  **Deprecated**
    */
  def setZoomLevel(level: Double): Unit = js.native
  /**
    * Shows pop-up dictionary that searches the selected word on the page.
    *
    * @platform darwin
    */
  def showDefinitionForSelection(): Unit = js.native
  /**
    * Sets the `item` as dragging item for current drag-drop operation, `file` is the
    * absolute path of the file to be dragged, and `icon` is the image showing under
    * the cursor when dragging.
    */
  def startDrag(item: Item): Unit = js.native
  /**
    * If *offscreen rendering* is enabled and not painting, start painting.
    */
  def startPainting(): Unit = js.native
  /**
    * Stops any pending navigation.
    */
  def stop(): Unit = js.native
  @JSName("stopFindInPage")
  def stopFindInPage_activateSelection(action: activateSelection): Unit = js.native
  /**
    * Stops any `findInPage` request for the `webContents` with the provided `action`.
    */
  @JSName("stopFindInPage")
  def stopFindInPage_clearSelection(action: clearSelection): Unit = js.native
  @JSName("stopFindInPage")
  def stopFindInPage_keepSelection(action: keepSelection): Unit = js.native
  /**
    * If *offscreen rendering* is enabled and painting, stop painting.
    */
  def stopPainting(): Unit = js.native
  /**
    * Indicates whether the snapshot has been created successfully.
    * 
  Takes a V8 heap snapshot and saves it to `filePath`.
    */
  def takeHeapSnapshot(filePath: String): js.Promise[Unit] = js.native
  /**
    * Toggles the developer tools.
    */
  def toggleDevTools(): Unit = js.native
  /**
    * Executes the editing command `undo` in web page.
    */
  def undo(): Unit = js.native
  /**
    * Executes the editing command `unselect` in web page.
    */
  def unselect(): Unit = js.native
}

/* static members */
@JSGlobal("Electron.WebContents")
@js.native
object WebContents_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given ID.
    */
  def fromId(id: Double): WebContents_ = js.native
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  def getAllWebContents(): js.Array[WebContents_] = js.native
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  def getFocusedWebContents(): WebContents_ = js.native
}

