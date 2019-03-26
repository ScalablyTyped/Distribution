package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.WebContents")
@js.native
class WebContents () extends EventEmitter {
  var debugger: Debugger = js.native
  var devToolsWebContents: WebContents = js.native
  var hostWebContents: WebContents = js.native
  var id: scala.Double = js.native
  var session: Session = js.native
  def addListener(
    event: electronLib.electronLibStrings.`new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* frameName */ java.lang.String, 
      /* disposition */ electronLib.electronLibStrings.default | electronLib.electronLibStrings.`foreground-tab` | electronLib.electronLibStrings.`background-tab` | electronLib.electronLibStrings.`new-window` | electronLib.electronLibStrings.`save-to-disk` | electronLib.electronLibStrings.other, 
      /* options */ js.Any, 
      /* additionalFeatures */ js.Array[java.lang.String], 
      /* referrer */ Referrer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_before-input-event`(
    event: electronLib.electronLibStrings.`before-input-event`,
    listener: js.Function2[/* event */ Event, /* input */ Input, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_certificate-error`(
    event: electronLib.electronLibStrings.`certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* error */ java.lang.String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_console-message`(
    event: electronLib.electronLibStrings.`console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ scala.Double, 
      /* message */ java.lang.String, 
      /* line */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_context-menu`(
    event: electronLib.electronLibStrings.`context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_crashed(
    event: electronLib.electronLibStrings.crashed,
    listener: js.Function2[/* event */ Event, /* killed */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_cursor-changed`(
    event: electronLib.electronLibStrings.`cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ java.lang.String, 
      /* image */ js.UndefOr[NativeImage], 
      /* scale */ js.UndefOr[scala.Double], 
      /* size */ js.UndefOr[Size], 
      /* hotspot */ js.UndefOr[Point], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_destroyed(event: electronLib.electronLibStrings.destroyed, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_devtools-closed`(event: electronLib.electronLibStrings.`devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_devtools-focused`(event: electronLib.electronLibStrings.`devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_devtools-opened`(event: electronLib.electronLibStrings.`devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_devtools-reload-page`(event: electronLib.electronLibStrings.`devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_did-attach-webview`(
    event: electronLib.electronLibStrings.`did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-change-theme-color`(
    event: electronLib.electronLibStrings.`did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-fail-load`(
    event: electronLib.electronLibStrings.`did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ scala.Double, 
      /* errorDescription */ java.lang.String, 
      /* validatedURL */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-finish-load`(event: electronLib.electronLibStrings.`did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_did-frame-finish-load`(
    event: electronLib.electronLibStrings.`did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-frame-navigate`(
    event: electronLib.electronLibStrings.`did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-navigate`(
    event: electronLib.electronLibStrings.`did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-navigate-in-page`(
    event: electronLib.electronLibStrings.`did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-redirect-navigation`(
    event: electronLib.electronLibStrings.`did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-start-loading`(event: electronLib.electronLibStrings.`did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_did-start-navigation`(
    event: electronLib.electronLibStrings.`did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_did-stop-loading`(event: electronLib.electronLibStrings.`did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_dom-ready`(
    event: electronLib.electronLibStrings.`dom-ready`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_found-in-page`(
    event: electronLib.electronLibStrings.`found-in-page`,
    listener: js.Function2[/* event */ Event, /* result */ Result, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function4[
      /* event */ Event, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_media-paused`(event: electronLib.electronLibStrings.`media-paused`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_media-started-playing`(event: electronLib.electronLibStrings.`media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_page-favicon-updated`(
    event: electronLib.electronLibStrings.`page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_paint(
    event: electronLib.electronLibStrings.paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_plugin-crashed`(
    event: electronLib.electronLibStrings.`plugin-crashed`,
    listener: js.Function3[
      /* event */ Event, 
      /* name */ java.lang.String, 
      /* version */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-get-builtin`(
    event: electronLib.electronLibStrings.`remote-get-builtin`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-get-current-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-current-web-contents`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-get-current-window`(
    event: electronLib.electronLibStrings.`remote-get-current-window`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-get-global`(
    event: electronLib.electronLibStrings.`remote-get-global`,
    listener: js.Function2[/* event */ Event, /* globalName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-get-guest-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ Event, /* guestWebContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_remote-require`(
    event: electronLib.electronLibStrings.`remote-require`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_select-bluetooth-device`(
    event: electronLib.electronLibStrings.`select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_select-client-certificate`(
    event: electronLib.electronLibStrings.`select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_update-target-url`(
    event: electronLib.electronLibStrings.`update-target-url`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_will-attach-webview`(
    event: electronLib.electronLibStrings.`will-attach-webview`,
    listener: js.Function3[/* event */ Event, /* webPreferences */ js.Any, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_will-navigate`(
    event: electronLib.electronLibStrings.`will-navigate`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_will-prevent-unload`(
    event: electronLib.electronLibStrings.`will-prevent-unload`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_will-redirect`(
    event: electronLib.electronLibStrings.`will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Adds the specified path to DevTools workspace. Must be used after DevTools
    * creation:
    */
  def addWorkSpace(path: java.lang.String): scala.Unit = js.native
  /**
    * Begin subscribing for presentation events and captured frames, the callback will
    * be called with callback(image, dirtyRect) when there is a presentation event.
    * The image is an instance of NativeImage that stores the captured frame. The
    * dirtyRect is an object with x, y, width, height properties that describes which
    * part of the page was repainted. If onlyDirty is set to true, image will only
    * contain the repainted area. onlyDirty defaults to false.
    */
  def beginFrameSubscription(callback: js.Function2[/* image */ NativeImage, /* dirtyRect */ Rectangle, scala.Unit]): scala.Unit = js.native
  /**
    * Begin subscribing for presentation events and captured frames, the callback will
    * be called with callback(image, dirtyRect) when there is a presentation event.
    * The image is an instance of NativeImage that stores the captured frame. The
    * dirtyRect is an object with x, y, width, height properties that describes which
    * part of the page was repainted. If onlyDirty is set to true, image will only
    * contain the repainted area. onlyDirty defaults to false.
    */
  def beginFrameSubscription(
    onlyDirty: scala.Boolean,
    callback: js.Function2[/* image */ NativeImage, /* dirtyRect */ Rectangle, scala.Unit]
  ): scala.Unit = js.native
  def canGoBack(): scala.Boolean = js.native
  def canGoForward(): scala.Boolean = js.native
  def canGoToOffset(offset: scala.Double): scala.Boolean = js.native
  /**
    * Captures a snapshot of the page within rect. Upon completion callback will be
    * called with callback(image). The image is an instance of NativeImage that stores
    * data of the snapshot. Omitting rect will capture the whole visible page.
    */
  def capturePage(callback: js.Function1[/* image */ NativeImage, scala.Unit]): scala.Unit = js.native
  /**
    * Captures a snapshot of the page within rect. Upon completion callback will be
    * called with callback(image). The image is an instance of NativeImage that stores
    * data of the snapshot. Omitting rect will capture the whole visible page.
    */
  def capturePage(rect: Rectangle, callback: js.Function1[/* image */ NativeImage, scala.Unit]): scala.Unit = js.native
  /**
    * Clears the navigation history.
    */
  def clearHistory(): scala.Unit = js.native
  /**
    * Closes the devtools.
    */
  def closeDevTools(): scala.Unit = js.native
  /**
    * Executes the editing command copy in web page.
    */
  def copy(): scala.Unit = js.native
  /**
    * Copy the image at the given position to the clipboard.
    */
  def copyImageAt(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Executes the editing command cut in web page.
    */
  def cut(): scala.Unit = js.native
  /**
    * Executes the editing command delete in web page.
    */
  def delete(): scala.Unit = js.native
  /**
    * Disable device emulation enabled by webContents.enableDeviceEmulation.
    */
  def disableDeviceEmulation(): scala.Unit = js.native
  /**
    * Initiates a download of the resource at url without navigating. The
    * will-download event of session will be triggered.
    */
  def downloadURL(url: java.lang.String): scala.Unit = js.native
  /**
    * Enable device emulation with the given parameters.
    */
  def enableDeviceEmulation(parameters: Parameters): scala.Unit = js.native
  /**
    * End subscribing for frame presentation events.
    */
  def endFrameSubscription(): scala.Unit = js.native
  /**
    * Evaluates code in page. In the browser window some HTML APIs like
    * requestFullScreen can only be invoked by a gesture from the user. Setting
    * userGesture to true will remove this limitation. If the result of the executed
    * code is a promise the callback result will be the resolved value of the promise.
    * We recommend that you use the returned Promise to handle code that results in a
    * Promise.
    */
  def executeJavaScript(code: java.lang.String): js.Promise[_] = js.native
  def executeJavaScript(code: java.lang.String, userGesture: scala.Boolean): js.Promise[_] = js.native
  def executeJavaScript(
    code: java.lang.String,
    userGesture: scala.Boolean,
    callback: js.Function1[/* result */ js.Any, scala.Unit]
  ): js.Promise[_] = js.native
  /**
    * Starts a request to find all matches for the text in the web page. The result of
    * the request can be obtained by subscribing to found-in-page event.
    */
  def findInPage(text: java.lang.String): scala.Double = js.native
  def findInPage(text: java.lang.String, options: FindInPageOptions): scala.Double = js.native
  /**
    * Focuses the web page.
    */
  def focus(): scala.Unit = js.native
  def getFrameRate(): scala.Double = js.native
  def getOSProcessId(): scala.Double = js.native
  /**
    * Get the system printer list.
    */
  def getPrinters(): js.Array[PrinterInfo] = js.native
  def getProcessId(): scala.Double = js.native
  def getTitle(): java.lang.String = js.native
  def getType(): electronLib.electronLibStrings.backgroundPage | electronLib.electronLibStrings.window | electronLib.electronLibStrings.browserView | electronLib.electronLibStrings.remote | electronLib.electronLibStrings.webview | electronLib.electronLibStrings.offscreen = js.native
  def getURL(): java.lang.String = js.native
  def getUserAgent(): java.lang.String = js.native
  def getWebRTCIPHandlingPolicy(): java.lang.String = js.native
  /**
    * Sends a request to get current zoom factor, the callback will be called with
    * callback(zoomFactor).
    */
  def getZoomFactor(callback: js.Function1[/* zoomFactor */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    * Sends a request to get current zoom level, the callback will be called with
    * callback(zoomLevel).
    */
  def getZoomLevel(callback: js.Function1[/* zoomLevel */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    * Makes the browser go back a web page.
    */
  def goBack(): scala.Unit = js.native
  /**
    * Makes the browser go forward a web page.
    */
  def goForward(): scala.Unit = js.native
  /**
    * Navigates browser to the specified absolute web page index.
    */
  def goToIndex(index: scala.Double): scala.Unit = js.native
  /**
    * Navigates to the specified offset from the "current entry".
    */
  def goToOffset(offset: scala.Double): scala.Unit = js.native
  /**
    * Checks if any ServiceWorker is registered and returns a boolean as response to
    * callback.
    */
  def hasServiceWorker(callback: js.Function1[/* hasWorker */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Injects CSS into the current web page.
    */
  def insertCSS(css: java.lang.String): scala.Unit = js.native
  /**
    * Inserts text to the focused element.
    */
  def insertText(text: java.lang.String): scala.Unit = js.native
  /**
    * Starts inspecting element at position (x, y).
    */
  def inspectElement(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Opens the developer tools for the service worker context.
    */
  def inspectServiceWorker(): scala.Unit = js.native
  /**
    * Schedules a full repaint of the window this web contents is in. If offscreen
    * rendering is enabled invalidates the frame and generates a new one through the
    * 'paint' event.
    */
  def invalidate(): scala.Unit = js.native
  def isAudioMuted(): scala.Boolean = js.native
  def isCrashed(): scala.Boolean = js.native
  def isCurrentlyAudible(): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isDevToolsFocused(): scala.Boolean = js.native
  def isDevToolsOpened(): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def isLoading(): scala.Boolean = js.native
  def isLoadingMainFrame(): scala.Boolean = js.native
  def isOffscreen(): scala.Boolean = js.native
  def isPainting(): scala.Boolean = js.native
  def isWaitingForResponse(): scala.Boolean = js.native
  /**
    * Loads the given file in the window, filePath should be a path to an HTML file
    * relative to the root of your application.  For instance an app structure like
    * this: Would require code like this
    */
  def loadFile(filePath: java.lang.String): scala.Unit = js.native
  def loadFile(filePath: java.lang.String, options: LoadFileOptions): scala.Unit = js.native
  /**
    * Loads the url in the window. The url must contain the protocol prefix, e.g. the
    * http:// or file://. If the load should bypass http cache then use the pragma
    * header to achieve it.
    */
  def loadURL(url: java.lang.String): scala.Unit = js.native
  def loadURL(url: java.lang.String, options: LoadURLOptions): scala.Unit = js.native
  /**
    * Emitted when the page requests to open a new window for a url. It could be
    * requested by window.open or an external link like <a target='_blank'>. By
    * default a new BrowserWindow will be created for the url. Calling
    * event.preventDefault() will prevent Electron from automatically creating a new
    * BrowserWindow. If you call event.preventDefault() and manually create a new
    * BrowserWindow then you must set event.newGuest to reference the new
    * BrowserWindow instance, failing to do so may result in unexpected behavior. For
    * example:
    */
  def on(
    event: electronLib.electronLibStrings.`new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* frameName */ java.lang.String, 
      /* disposition */ electronLib.electronLibStrings.default | electronLib.electronLibStrings.`foreground-tab` | electronLib.electronLibStrings.`background-tab` | electronLib.electronLibStrings.`new-window` | electronLib.electronLibStrings.`save-to-disk` | electronLib.electronLibStrings.other, 
      /* options */ js.Any, 
      /* additionalFeatures */ js.Array[java.lang.String], 
      /* referrer */ Referrer, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted before dispatching the keydown and keyup events in the page. Calling
    * event.preventDefault will prevent the page keydown/keyup events and the menu
    * shortcuts. To only prevent the menu shortcuts, use setIgnoreMenuShortcuts:
    */
  @JSName("on")
  def `on_before-input-event`(
    event: electronLib.electronLibStrings.`before-input-event`,
    listener: js.Function2[/* event */ Event, /* input */ Input, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when failed to verify the certificate for url. The usage is the same
    * with the certificate-error event of app.
    */
  @JSName("on")
  def `on_certificate-error`(
    event: electronLib.electronLibStrings.`certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* error */ java.lang.String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the associated window logs a console message. Will not be emitted
    * for windows with offscreen rendering enabled.
    */
  @JSName("on")
  def `on_console-message`(
    event: electronLib.electronLibStrings.`console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ scala.Double, 
      /* message */ java.lang.String, 
      /* line */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when there is a new context menu that needs to be handled.
    */
  @JSName("on")
  def `on_context-menu`(
    event: electronLib.electronLibStrings.`context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process crashes or is killed.
    */
  @JSName("on")
  def on_crashed(
    event: electronLib.electronLibStrings.crashed,
    listener: js.Function2[/* event */ Event, /* killed */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the cursor's type changes. The type parameter can be default,
    * crosshair, pointer, text, wait, help, e-resize, n-resize, ne-resize, nw-resize,
    * s-resize, se-resize, sw-resize, w-resize, ns-resize, ew-resize, nesw-resize,
    * nwse-resize, col-resize, row-resize, m-panning, e-panning, n-panning,
    * ne-panning, nw-panning, s-panning, se-panning, sw-panning, w-panning, move,
    * vertical-text, cell, context-menu, alias, progress, nodrop, copy, none,
    * not-allowed, zoom-in, zoom-out, grab, grabbing or custom. If the type parameter
    * is custom, the image parameter will hold the custom cursor image in a
    * NativeImage, and scale, size and hotspot will hold additional information about
    * the custom cursor.
    */
  @JSName("on")
  def `on_cursor-changed`(
    event: electronLib.electronLibStrings.`cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ java.lang.String, 
      /* image */ js.UndefOr[NativeImage], 
      /* scale */ js.UndefOr[scala.Double], 
      /* size */ js.UndefOr[Size], 
      /* hotspot */ js.UndefOr[Point], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when webContents is destroyed.
    */
  @JSName("on")
  def on_destroyed(event: electronLib.electronLibStrings.destroyed, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is closed.
    */
  @JSName("on")
  def `on_devtools-closed`(event: electronLib.electronLibStrings.`devtools-closed`, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is focused / opened.
    */
  @JSName("on")
  def `on_devtools-focused`(event: electronLib.electronLibStrings.`devtools-focused`, listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is opened.
    */
  @JSName("on")
  def `on_devtools-opened`(event: electronLib.electronLibStrings.`devtools-opened`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the devtools window instructs the webContents to reload
    */
  @JSName("on")
  def `on_devtools-reload-page`(event: electronLib.electronLibStrings.`devtools-reload-page`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a <webview> has been attached to this web contents.
    */
  @JSName("on")
  def `on_did-attach-webview`(
    event: electronLib.electronLibStrings.`did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a page's theme color changes. This is usually due to encountering a
    * meta tag:
    */
  @JSName("on")
  def `on_did-change-theme-color`(
    event: electronLib.electronLibStrings.`did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  /**
    * This event is like did-finish-load but emitted when the load failed or was
    * cancelled, e.g. window.stop() is invoked. The full list of error codes and their
    * meaning is available here.
    */
  @JSName("on")
  def `on_did-fail-load`(
    event: electronLib.electronLibStrings.`did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ scala.Double, 
      /* errorDescription */ java.lang.String, 
      /* validatedURL */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the navigation is done, i.e. the spinner of the tab has stopped
    * spinning, and the onload event was dispatched.
    */
  @JSName("on")
  def `on_did-finish-load`(event: electronLib.electronLibStrings.`did-finish-load`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a frame has done navigation.
    */
  @JSName("on")
  def `on_did-frame-finish-load`(
    event: electronLib.electronLibStrings.`did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any frame navigation is done. This event is not emitted for in-page
    * navigations, such as clicking anchor links or updating the window.location.hash.
    * Use did-navigate-in-page event for this purpose.
    */
  @JSName("on")
  def `on_did-frame-navigate`(
    event: electronLib.electronLibStrings.`did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a main frame navigation is done. This event is not emitted for
    * in-page navigations, such as clicking anchor links or updating the
    * window.location.hash. Use did-navigate-in-page event for this purpose.
    */
  @JSName("on")
  def `on_did-navigate`(
    event: electronLib.electronLibStrings.`did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when an in-page navigation happened in any frame. When in-page
    * navigation happens, the page URL changes but does not cause navigation outside
    * of the page. Examples of this occurring are when anchor links are clicked or
    * when the DOM hashchange event is triggered.
    */
  @JSName("on")
  def `on_did-navigate-in-page`(
    event: electronLib.electronLibStrings.`did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after a server side redirect occurs during navigation.  For example a
    * 302 redirect. This event can not be prevented, if you want to prevent redirects
    * you should checkout out the will-redirect event above.
    */
  @JSName("on")
  def `on_did-redirect-navigation`(
    event: electronLib.electronLibStrings.`did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab started spinning.
    */
  @JSName("on")
  def `on_did-start-loading`(event: electronLib.electronLibStrings.`did-start-loading`, listener: js.Function): this.type = js.native
  /**
    * Emitted when any frame (including main) starts navigating. isInplace will be
    * true for in-page navigations.
    */
  @JSName("on")
  def `on_did-start-navigation`(
    event: electronLib.electronLibStrings.`did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab stopped spinning.
    */
  @JSName("on")
  def `on_did-stop-loading`(event: electronLib.electronLibStrings.`did-stop-loading`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the document in the given frame is loaded.
    */
  @JSName("on")
  def `on_dom-ready`(
    event: electronLib.electronLibStrings.`dom-ready`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a result is available for [webContents.findInPage] request.
    */
  @JSName("on")
  def `on_found-in-page`(
    event: electronLib.electronLibStrings.`found-in-page`,
    listener: js.Function2[/* event */ Event, /* result */ Result, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when webContents wants to do basic auth. The usage is the same with the
    * login event of app.
    */
  @JSName("on")
  def on_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function4[
      /* event */ Event, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when media is paused or done playing.
    */
  @JSName("on")
  def `on_media-paused`(event: electronLib.electronLibStrings.`media-paused`, listener: js.Function): this.type = js.native
  /**
    * Emitted when media starts playing.
    */
  @JSName("on")
  def `on_media-started-playing`(event: electronLib.electronLibStrings.`media-started-playing`, listener: js.Function): this.type = js.native
  /**
    * Emitted when page receives favicon urls.
    */
  @JSName("on")
  def `on_page-favicon-updated`(
    event: electronLib.electronLibStrings.`page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a new frame is generated. Only the dirty area is passed in the
    * buffer.
    */
  @JSName("on")
  def on_paint(
    event: electronLib.electronLibStrings.paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a plugin process has crashed.
    */
  @JSName("on")
  def `on_plugin-crashed`(
    event: electronLib.electronLibStrings.`plugin-crashed`,
    listener: js.Function3[
      /* event */ Event, 
      /* name */ java.lang.String, 
      /* version */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when remote.getBuiltin() is called in the renderer process. Calling
    * event.preventDefault() will prevent the module from being returned. Custom value
    * can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-get-builtin`(
    event: electronLib.electronLibStrings.`remote-get-builtin`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getCurrentWebContents() is called in the renderer process.
    * Calling event.preventDefault() will prevent the object from being returned.
    * Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-get-current-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-current-web-contents`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getCurrentWindow() is called in the renderer process.
    * Calling event.preventDefault() will prevent the object from being returned.
    * Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-get-current-window`(
    event: electronLib.electronLibStrings.`remote-get-current-window`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getGlobal() is called in the renderer process. Calling
    * event.preventDefault() will prevent the global from being returned. Custom value
    * can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-get-global`(
    event: electronLib.electronLibStrings.`remote-get-global`,
    listener: js.Function2[/* event */ Event, /* globalName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when <webview>.getWebContents() is called in the renderer process.
    * Calling event.preventDefault() will prevent the object from being returned.
    * Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-get-guest-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ Event, /* guestWebContents */ this.type, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.require() is called in the renderer process. Calling
    * event.preventDefault() will prevent the module from being returned. Custom value
    * can be returned by setting event.returnValue.
    */
  @JSName("on")
  def `on_remote-require`(
    event: electronLib.electronLibStrings.`remote-require`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  def on_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when bluetooth device needs to be selected on call to
    * navigator.bluetooth.requestDevice. To use navigator.bluetooth api webBluetooth
    * should be enabled. If event.preventDefault is not called, first available device
    * will be selected. callback should be called with deviceId to be selected,
    * passing empty string to callback will cancel the request.
    */
  @JSName("on")
  def `on_select-bluetooth-device`(
    event: electronLib.electronLibStrings.`select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a client certificate is requested. The usage is the same with the
    * select-client-certificate event of app.
    */
  @JSName("on")
  def `on_select-client-certificate`(
    event: electronLib.electronLibStrings.`select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  def on_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  /**
    * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
    */
  @JSName("on")
  def `on_update-target-url`(
    event: electronLib.electronLibStrings.`update-target-url`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a <webview>'s web contents is being attached to this web contents.
    * Calling event.preventDefault() will destroy the guest page. This event can be
    * used to configure webPreferences for the webContents of a <webview> before it's
    * loaded, and provides the ability to set settings that can't be set via <webview>
    * attributes. Note: The specified preload script option will be appear as
    * preloadURL (not preload) in the webPreferences object emitted with this event.
    */
  @JSName("on")
  def `on_will-attach-webview`(
    event: electronLib.electronLibStrings.`will-attach-webview`,
    listener: js.Function3[/* event */ Event, /* webPreferences */ js.Any, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a user or the page wants to start navigation. It can happen when
    * the window.location object is changed or a user clicks a link in the page. This
    * event will not emit when the navigation is started programmatically with APIs
    * like webContents.loadURL and webContents.back. It is also not emitted for
    * in-page navigations, such as clicking anchor links or updating the
    * window.location.hash. Use did-navigate-in-page event for this purpose. Calling
    * event.preventDefault() will prevent the navigation.
    */
  @JSName("on")
  def `on_will-navigate`(
    event: electronLib.electronLibStrings.`will-navigate`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a beforeunload event handler is attempting to cancel a page unload.
    * Calling event.preventDefault() will ignore the beforeunload event handler and
    * allow the page to be unloaded.
    */
  @JSName("on")
  def `on_will-prevent-unload`(
    event: electronLib.electronLibStrings.`will-prevent-unload`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted as a server side redirect occurs during navigation.  For example a 302
    * redirect. This event will be emitted after did-start-navigation and always
    * before the did-redirect-navigation event for the same navigation. Calling
    * event.preventDefault() will prevent the navigation (not just the redirect).
    */
  @JSName("on")
  def `on_will-redirect`(
    event: electronLib.electronLibStrings.`will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.`new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* frameName */ java.lang.String, 
      /* disposition */ electronLib.electronLibStrings.default | electronLib.electronLibStrings.`foreground-tab` | electronLib.electronLibStrings.`background-tab` | electronLib.electronLibStrings.`new-window` | electronLib.electronLibStrings.`save-to-disk` | electronLib.electronLibStrings.other, 
      /* options */ js.Any, 
      /* additionalFeatures */ js.Array[java.lang.String], 
      /* referrer */ Referrer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_before-input-event`(
    event: electronLib.electronLibStrings.`before-input-event`,
    listener: js.Function2[/* event */ Event, /* input */ Input, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_certificate-error`(
    event: electronLib.electronLibStrings.`certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* error */ java.lang.String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_console-message`(
    event: electronLib.electronLibStrings.`console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ scala.Double, 
      /* message */ java.lang.String, 
      /* line */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_context-menu`(
    event: electronLib.electronLibStrings.`context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_crashed(
    event: electronLib.electronLibStrings.crashed,
    listener: js.Function2[/* event */ Event, /* killed */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_cursor-changed`(
    event: electronLib.electronLibStrings.`cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ java.lang.String, 
      /* image */ js.UndefOr[NativeImage], 
      /* scale */ js.UndefOr[scala.Double], 
      /* size */ js.UndefOr[Size], 
      /* hotspot */ js.UndefOr[Point], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_destroyed(event: electronLib.electronLibStrings.destroyed, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_devtools-closed`(event: electronLib.electronLibStrings.`devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_devtools-focused`(event: electronLib.electronLibStrings.`devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_devtools-opened`(event: electronLib.electronLibStrings.`devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_devtools-reload-page`(event: electronLib.electronLibStrings.`devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_did-attach-webview`(
    event: electronLib.electronLibStrings.`did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_did-change-theme-color`(
    event: electronLib.electronLibStrings.`did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_did-fail-load`(
    event: electronLib.electronLibStrings.`did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ scala.Double, 
      /* errorDescription */ java.lang.String, 
      /* validatedURL */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-finish-load`(event: electronLib.electronLibStrings.`did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_did-frame-finish-load`(
    event: electronLib.electronLibStrings.`did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-frame-navigate`(
    event: electronLib.electronLibStrings.`did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-navigate`(
    event: electronLib.electronLibStrings.`did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-navigate-in-page`(
    event: electronLib.electronLibStrings.`did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-redirect-navigation`(
    event: electronLib.electronLibStrings.`did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-start-loading`(event: electronLib.electronLibStrings.`did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_did-start-navigation`(
    event: electronLib.electronLibStrings.`did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_did-stop-loading`(event: electronLib.electronLibStrings.`did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_dom-ready`(
    event: electronLib.electronLibStrings.`dom-ready`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_found-in-page`(
    event: electronLib.electronLibStrings.`found-in-page`,
    listener: js.Function2[/* event */ Event, /* result */ Result, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function4[
      /* event */ Event, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_media-paused`(event: electronLib.electronLibStrings.`media-paused`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_media-started-playing`(event: electronLib.electronLibStrings.`media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_page-favicon-updated`(
    event: electronLib.electronLibStrings.`page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_paint(
    event: electronLib.electronLibStrings.paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_plugin-crashed`(
    event: electronLib.electronLibStrings.`plugin-crashed`,
    listener: js.Function3[
      /* event */ Event, 
      /* name */ java.lang.String, 
      /* version */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-get-builtin`(
    event: electronLib.electronLibStrings.`remote-get-builtin`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-get-current-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-current-web-contents`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-get-current-window`(
    event: electronLib.electronLibStrings.`remote-get-current-window`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-get-global`(
    event: electronLib.electronLibStrings.`remote-get-global`,
    listener: js.Function2[/* event */ Event, /* globalName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-get-guest-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ Event, /* guestWebContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_remote-require`(
    event: electronLib.electronLibStrings.`remote-require`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_select-bluetooth-device`(
    event: electronLib.electronLibStrings.`select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_select-client-certificate`(
    event: electronLib.electronLibStrings.`select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_update-target-url`(
    event: electronLib.electronLibStrings.`update-target-url`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-attach-webview`(
    event: electronLib.electronLibStrings.`will-attach-webview`,
    listener: js.Function3[/* event */ Event, /* webPreferences */ js.Any, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-navigate`(
    event: electronLib.electronLibStrings.`will-navigate`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-prevent-unload`(
    event: electronLib.electronLibStrings.`will-prevent-unload`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_will-redirect`(
    event: electronLib.electronLibStrings.`will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Opens the devtools. When contents is a <webview> tag, the mode would be detach
    * by default, explicitly passing an empty mode can force using last used dock
    * state.
    */
  def openDevTools(): scala.Unit = js.native
  def openDevTools(options: OpenDevToolsOptions): scala.Unit = js.native
  /**
    * Executes the editing command paste in web page.
    */
  def paste(): scala.Unit = js.native
  /**
    * Executes the editing command pasteAndMatchStyle in web page.
    */
  def pasteAndMatchStyle(): scala.Unit = js.native
  /**
    * Prints window's web page. When silent is set to true, Electron will pick the
    * system's default printer if deviceName is empty and the default settings for
    * printing. Calling window.print() in web page is equivalent to calling
    * webContents.print({ silent: false, printBackground: false, deviceName: '' }).
    * Use page-break-before: always; CSS style to force to print to a new page.
    */
  def print(): scala.Unit = js.native
  def print(options: PrintOptions): scala.Unit = js.native
  def print(options: PrintOptions, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Prints window's web page as PDF with Chromium's preview printing custom
    * settings. The callback will be called with callback(error, data) on completion.
    * The data is a Buffer that contains the generated PDF data. The landscape will be
    * ignored if @page CSS at-rule is used in the web page. By default, an empty
    * options will be regarded as: Use page-break-before: always; CSS style to force
    * to print to a new page. An example of webContents.printToPDF:
    */
  def printToPDF(
    options: PrintToPDFOptions,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Executes the editing command redo in web page.
    */
  def redo(): scala.Unit = js.native
  /**
    * Reloads the current web page.
    */
  def reload(): scala.Unit = js.native
  /**
    * Reloads current page and ignores cache.
    */
  def reloadIgnoringCache(): scala.Unit = js.native
  def removeListener(
    event: electronLib.electronLibStrings.`new-window`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* frameName */ java.lang.String, 
      /* disposition */ electronLib.electronLibStrings.default | electronLib.electronLibStrings.`foreground-tab` | electronLib.electronLibStrings.`background-tab` | electronLib.electronLibStrings.`new-window` | electronLib.electronLibStrings.`save-to-disk` | electronLib.electronLibStrings.other, 
      /* options */ js.Any, 
      /* additionalFeatures */ js.Array[java.lang.String], 
      /* referrer */ Referrer, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_before-input-event`(
    event: electronLib.electronLibStrings.`before-input-event`,
    listener: js.Function2[/* event */ Event, /* input */ Input, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_certificate-error`(
    event: electronLib.electronLibStrings.`certificate-error`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* error */ java.lang.String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_console-message`(
    event: electronLib.electronLibStrings.`console-message`,
    listener: js.Function5[
      /* event */ Event, 
      /* level */ scala.Double, 
      /* message */ java.lang.String, 
      /* line */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_context-menu`(
    event: electronLib.electronLibStrings.`context-menu`,
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_crashed(
    event: electronLib.electronLibStrings.crashed,
    listener: js.Function2[/* event */ Event, /* killed */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_cursor-changed`(
    event: electronLib.electronLibStrings.`cursor-changed`,
    listener: js.Function6[
      /* event */ Event, 
      /* type */ java.lang.String, 
      /* image */ js.UndefOr[NativeImage], 
      /* scale */ js.UndefOr[scala.Double], 
      /* size */ js.UndefOr[Size], 
      /* hotspot */ js.UndefOr[Point], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_destroyed(event: electronLib.electronLibStrings.destroyed, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_devtools-closed`(event: electronLib.electronLibStrings.`devtools-closed`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_devtools-focused`(event: electronLib.electronLibStrings.`devtools-focused`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_devtools-opened`(event: electronLib.electronLibStrings.`devtools-opened`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_devtools-reload-page`(event: electronLib.electronLibStrings.`devtools-reload-page`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-attach-webview`(
    event: electronLib.electronLibStrings.`did-attach-webview`,
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-change-theme-color`(
    event: electronLib.electronLibStrings.`did-change-theme-color`,
    listener: js.Function2[/* event */ Event, /* color */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-fail-load`(
    event: electronLib.electronLibStrings.`did-fail-load`,
    listener: js.Function7[
      /* event */ Event, 
      /* errorCode */ scala.Double, 
      /* errorDescription */ java.lang.String, 
      /* validatedURL */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-finish-load`(event: electronLib.electronLibStrings.`did-finish-load`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-frame-finish-load`(
    event: electronLib.electronLibStrings.`did-frame-finish-load`,
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-frame-navigate`(
    event: electronLib.electronLibStrings.`did-frame-navigate`,
    listener: js.Function7[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-navigate`(
    event: electronLib.electronLibStrings.`did-navigate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* httpResponseCode */ scala.Double, 
      /* httpStatusText */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-navigate-in-page`(
    event: electronLib.electronLibStrings.`did-navigate-in-page`,
    listener: js.Function5[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-redirect-navigation`(
    event: electronLib.electronLibStrings.`did-redirect-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-start-loading`(event: electronLib.electronLibStrings.`did-start-loading`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-start-navigation`(
    event: electronLib.electronLibStrings.`did-start-navigation`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_did-stop-loading`(event: electronLib.electronLibStrings.`did-stop-loading`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_dom-ready`(
    event: electronLib.electronLibStrings.`dom-ready`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_found-in-page`(
    event: electronLib.electronLibStrings.`found-in-page`,
    listener: js.Function2[/* event */ Event, /* result */ Result, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function4[
      /* event */ Event, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_media-paused`(event: electronLib.electronLibStrings.`media-paused`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_media-started-playing`(event: electronLib.electronLibStrings.`media-started-playing`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_page-favicon-updated`(
    event: electronLib.electronLibStrings.`page-favicon-updated`,
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_paint(
    event: electronLib.electronLibStrings.paint,
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_plugin-crashed`(
    event: electronLib.electronLibStrings.`plugin-crashed`,
    listener: js.Function3[
      /* event */ Event, 
      /* name */ java.lang.String, 
      /* version */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-get-builtin`(
    event: electronLib.electronLibStrings.`remote-get-builtin`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-get-current-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-current-web-contents`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-get-current-window`(
    event: electronLib.electronLibStrings.`remote-get-current-window`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-get-global`(
    event: electronLib.electronLibStrings.`remote-get-global`,
    listener: js.Function2[/* event */ Event, /* globalName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-get-guest-web-contents`(
    event: electronLib.electronLibStrings.`remote-get-guest-web-contents`,
    listener: js.Function2[/* event */ Event, /* guestWebContents */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_remote-require`(
    event: electronLib.electronLibStrings.`remote-require`,
    listener: js.Function2[/* event */ Event, /* moduleName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_responsive(event: electronLib.electronLibStrings.responsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_select-bluetooth-device`(
    event: electronLib.electronLibStrings.`select-bluetooth-device`,
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_select-client-certificate`(
    event: electronLib.electronLibStrings.`select-client-certificate`,
    listener: js.Function4[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unresponsive(event: electronLib.electronLibStrings.unresponsive, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_update-target-url`(
    event: electronLib.electronLibStrings.`update-target-url`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-attach-webview`(
    event: electronLib.electronLibStrings.`will-attach-webview`,
    listener: js.Function3[/* event */ Event, /* webPreferences */ js.Any, /* params */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-navigate`(
    event: electronLib.electronLibStrings.`will-navigate`,
    listener: js.Function2[/* event */ Event, /* url */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-prevent-unload`(
    event: electronLib.electronLibStrings.`will-prevent-unload`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_will-redirect`(
    event: electronLib.electronLibStrings.`will-redirect`,
    listener: js.Function6[
      /* event */ Event, 
      /* url */ java.lang.String, 
      /* isInPlace */ scala.Boolean, 
      /* isMainFrame */ scala.Boolean, 
      /* frameProcessId */ scala.Double, 
      /* frameRoutingId */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Removes the specified path from DevTools workspace.
    */
  def removeWorkSpace(path: java.lang.String): scala.Unit = js.native
  /**
    * Executes the editing command replace in web page.
    */
  def replace(text: java.lang.String): scala.Unit = js.native
  /**
    * Executes the editing command replaceMisspelling in web page.
    */
  def replaceMisspelling(text: java.lang.String): scala.Unit = js.native
  @JSName("savePage")
  def savePage_HTMLComplete(
    fullPath: java.lang.String,
    saveType: electronLib.electronLibStrings.HTMLComplete,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("savePage")
  def savePage_HTMLOnly(
    fullPath: java.lang.String,
    saveType: electronLib.electronLibStrings.HTMLOnly,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("savePage")
  def savePage_MHTML(
    fullPath: java.lang.String,
    saveType: electronLib.electronLibStrings.MHTML,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * Executes the editing command selectAll in web page.
    */
  def selectAll(): scala.Unit = js.native
  /**
    * Send an asynchronous message to renderer process via channel, you can also send
    * arbitrary arguments. Arguments will be serialized in JSON internally and hence
    * no functions or prototype chain will be included. The renderer process can
    * handle the message by listening to channel with the ipcRenderer module. An
    * example of sending messages from the main process to the renderer process:
    */
  def send(channel: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Sends an input event to the page. Note: The BrowserWindow containing the
    * contents needs to be focused for sendInputEvent() to work. For keyboard events,
    * the event object also have following properties: For mouse events, the event
    * object also have following properties: For the mouseWheel event, the event
    * object also have following properties:
    */
  def sendInputEvent(event: Event): scala.Unit = js.native
  /**
    * Mute the audio on the current web page.
    */
  def setAudioMuted(muted: scala.Boolean): scala.Unit = js.native
  /**
    * Controls whether or not this WebContents will throttle animations and timers
    * when the page becomes backgrounded. This also affects the Page Visibility API.
    */
  def setBackgroundThrottling(allowed: scala.Boolean): scala.Unit = js.native
  /**
    * Uses the devToolsWebContents as the target WebContents to show devtools. The
    * devToolsWebContents must not have done any navigation, and it should not be used
    * for other purposes after the call. By default Electron manages the devtools by
    * creating an internal WebContents with native view, which developers have very
    * limited control of. With the setDevToolsWebContents method, developers can use
    * any WebContents to show the devtools in it, including BrowserWindow, BrowserView
    * and <webview> tag. Note that closing the devtools does not destroy the
    * devToolsWebContents, it is caller's responsibility to destroy
    * devToolsWebContents. An example of showing devtools in a <webview> tag: An
    * example of showing devtools in a BrowserWindow:
    */
  def setDevToolsWebContents(devToolsWebContents: WebContents): scala.Unit = js.native
  /**
    * If offscreen rendering is enabled sets the frame rate to the specified number.
    * Only values between 1 and 60 are accepted.
    */
  def setFrameRate(fps: scala.Double): scala.Unit = js.native
  /**
    * Ignore application menu shortcuts while this web contents is focused.
    */
  def setIgnoreMenuShortcuts(ignore: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the maximum and minimum layout-based (i.e. non-visual) zoom level.
    */
  def setLayoutZoomLevelLimits(minimumLevel: scala.Double, maximumLevel: scala.Double): scala.Unit = js.native
  /**
    * Overrides the user agent for this web page.
    */
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
  /**
    * Sets the maximum and minimum pinch-to-zoom level.
    */
  def setVisualZoomLevelLimits(minimumLevel: scala.Double, maximumLevel: scala.Double): scala.Unit = js.native
  /**
    * Setting the WebRTC IP handling policy allows you to control which IPs are
    * exposed via WebRTC. See BrowserLeaks for more details.
    */
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_default(policy: electronLib.electronLibStrings.default): scala.Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_default_public_and_private_interfaces(policy: electronLib.electronLibStrings.default_public_and_private_interfaces): scala.Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_default_public_interface_only(policy: electronLib.electronLibStrings.default_public_interface_only): scala.Unit = js.native
  @JSName("setWebRTCIPHandlingPolicy")
  def setWebRTCIPHandlingPolicy_disable_non_proxied_udp(policy: electronLib.electronLibStrings.disable_non_proxied_udp): scala.Unit = js.native
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
    */
  def setZoomFactor(factor: scala.Double): scala.Unit = js.native
  /**
    * Changes the zoom level to the specified level. The original size is 0 and each
    * increment above or below represents zooming 20% larger or smaller to default
    * limits of 300% and 50% of original size, respectively. The formula for this is
    * scale := 1.2 ^ level.
    */
  def setZoomLevel(level: scala.Double): scala.Unit = js.native
  /**
    * Shows pop-up dictionary that searches the selected word on the page.
    */
  def showDefinitionForSelection(): scala.Unit = js.native
  /**
    * Sets the item as dragging item for current drag-drop operation, file is the
    * absolute path of the file to be dragged, and icon is the image showing under the
    * cursor when dragging.
    */
  def startDrag(item: Item): scala.Unit = js.native
  /**
    * If offscreen rendering is enabled and not painting, start painting.
    */
  def startPainting(): scala.Unit = js.native
  /**
    * Stops any pending navigation.
    */
  def stop(): scala.Unit = js.native
  @JSName("stopFindInPage")
  def stopFindInPage_activateSelection(action: electronLib.electronLibStrings.activateSelection): scala.Unit = js.native
  /**
    * Stops any findInPage request for the webContents with the provided action.
    */
  @JSName("stopFindInPage")
  def stopFindInPage_clearSelection(action: electronLib.electronLibStrings.clearSelection): scala.Unit = js.native
  @JSName("stopFindInPage")
  def stopFindInPage_keepSelection(action: electronLib.electronLibStrings.keepSelection): scala.Unit = js.native
  /**
    * If offscreen rendering is enabled and painting, stop painting.
    */
  def stopPainting(): scala.Unit = js.native
  /**
    * Takes a V8 heap snapshot and saves it to filePath.
    */
  def takeHeapSnapshot(filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Toggles the developer tools.
    */
  def toggleDevTools(): scala.Unit = js.native
  /**
    * Executes the editing command undo in web page.
    */
  def undo(): scala.Unit = js.native
  /**
    * Unregisters any ServiceWorker if present and returns a boolean as response to
    * callback when the JS promise is fulfilled or false when the JS promise is
    * rejected.
    */
  def unregisterServiceWorker(callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Executes the editing command unselect in web page.
    */
  def unselect(): scala.Unit = js.native
}

@JSGlobal("Electron.webContents")
@js.native
class webContentsCls () extends WebContents

/* static members */
@JSGlobal("Electron.WebContents")
@js.native
object WebContents extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: scala.Double): electronLib.ElectronNs.WebContents = js.native
  def getAllWebContents(): js.Array[electronLib.ElectronNs.WebContents] = js.native
  def getFocusedWebContents(): electronLib.ElectronNs.WebContents = js.native
}

