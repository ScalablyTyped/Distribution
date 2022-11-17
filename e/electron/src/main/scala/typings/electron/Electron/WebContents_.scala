package typings.electron.Electron

import typings.electron.anon.Action
import typings.electron.anon.OverrideBrowserWindowOptions
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebContents_ extends EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_unresponsive")
  def addListener(event: "unresponsive", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_focus")
  def addListener(event: "focus", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_responsive")
  def addListener(event: "responsive", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_enterhtmlfullscreen")
  def addListener(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didstoploading")
  def addListener(event: "did-stop-loading", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mediapaused")
  def addListener(event: "media-paused", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mediastartedplaying")
  def addListener(event: "media-started-playing", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_blur")
  def addListener(event: "blur", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_destroyed")
  def addListener(event: "destroyed", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didfinishload")
  def addListener(event: "did-finish-load", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_leavehtmlfullscreen")
  def addListener(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_devtoolsclosed")
  def addListener(event: "devtools-closed", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_devtoolsopened")
  def addListener(event: "devtools-opened", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_devtoolsfocused")
  def addListener(event: "devtools-focused", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_devtoolsreloadpage")
  def addListener(event: "devtools-reload-page", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didstartloading")
  def addListener(event: "did-start-loading", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_willpreventunload")
  def addListener(event: "will-prevent-unload", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_domready")
  def addListener(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_zoomchanged_in_out")
  def addListener(
    event: "zoom-changed",
    listener: js.Function2[/* event */ Event, /* zoomDirection */ "in" | "out", Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_renderprocessgone")
  def addListener(
    event: "render-process-gone",
    listener: js.Function2[/* event */ Event, /* details */ RenderProcessGoneDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_contextmenu")
  def addListener(
    event: "context-menu",
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_beforeinputevent")
  def addListener(event: "before-input-event", listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_crashed")
  def addListener(event: "crashed", listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didcreatewindow")
  def addListener(
    event: "did-create-window",
    listener: js.Function2[/* window */ BrowserWindow, /* details */ DidCreateWindowDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didattachwebview")
  def addListener(
    event: "did-attach-webview",
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_updatetargeturl")
  def addListener(event: "update-target-url", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didchangethemecolor")
  def addListener(
    event: "did-change-theme-color",
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_willnavigate")
  def addListener(event: "will-navigate", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_preferredsizechanged")
  def addListener(
    event: "preferred-size-changed",
    listener: js.Function2[/* event */ Event, /* preferredSize */ Size, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pagefaviconupdated")
  def addListener(
    event: "page-favicon-updated",
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_foundinpage")
  def addListener(event: "found-in-page", listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_framecreated")
  def addListener(
    event: "frame-created",
    listener: js.Function2[/* event */ Event, /* details */ FrameCreatedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_selectbluetoothdevice")
  def addListener(
    event: "select-bluetooth-device",
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ipcmessage")
  def addListener(
    event: "ipc-message",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_plugincrashed")
  def addListener(
    event: "plugin-crashed",
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ipcmessagesync")
  def addListener(
    event: "ipc-message-sync",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_preloaderror")
  def addListener(
    event: "preload-error",
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ js.Error, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_paint")
  def addListener(
    event: "paint",
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pagetitleupdated")
  def addListener(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_willattachwebview")
  def addListener(
    event: "will-attach-webview",
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_login")
  def addListener(
    event: "login",
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didframefinishload")
  def addListener(
    event: "did-frame-finish-load",
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didnavigate")
  def addListener(
    event: "did-navigate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_selectclientcertificate")
  def addListener(
    event: "select-client-certificate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didnavigateinpage")
  def addListener(
    event: "did-navigate-in-page",
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
  @scala.annotation.targetName("addListener_consolemessage")
  def addListener(
    event: "console-message",
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
  @scala.annotation.targetName("addListener_didredirectnavigation")
  def addListener(
    event: "did-redirect-navigation",
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
  @scala.annotation.targetName("addListener_willredirect")
  def addListener(
    event: "will-redirect",
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
  @scala.annotation.targetName("addListener_didstartnavigation")
  def addListener(
    event: "did-start-navigation",
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
  @scala.annotation.targetName("addListener_cursorchanged")
  def addListener(
    event: "cursor-changed",
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
  @scala.annotation.targetName("addListener_certificateerror")
  def addListener(
    event: "certificate-error",
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_didfailload")
  def addListener(
    event: "did-fail-load",
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
  @scala.annotation.targetName("addListener_didframenavigate")
  def addListener(
    event: "did-frame-navigate",
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
  @scala.annotation.targetName("addListener_didfailprovisionalload")
  def addListener(
    event: "did-fail-provisional-load",
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
  @scala.annotation.targetName("addListener_newwindow_default_foregroundtab_backgroundtab_newwindow_savetodisk_other")
  def addListener(
    event: "new-window",
    listener: js.Function8[
      /* event */ NewWindowWebContentsEvent, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ "default" | "foreground-tab" | "background-tab" | "new-window" | "save-to-disk" | "other", 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      /* postBody */ PostBody, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Adds the specified path to DevTools workspace. Must be used after DevTools
    * creation:
    */
  def addWorkSpace(path: String): Unit = js.native
  
  /**
    * A `boolean` property that determines whether this page is muted.
    */
  var audioMuted: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether or not this WebContents will
    * throttle animations and timers when the page becomes backgrounded. This also
    * affects the Page Visibility API.
    */
  var backgroundThrottling: Boolean = js.native
  
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
    * A `Debugger` instance for this webContents.
    *
    */
  val debugger: Debugger = js.native
  
  /**
    * Decrease the capturer count by one. The page will be set to hidden or occluded
    * state when its browser window is hidden or occluded and the capturer count
    * reaches zero. If you want to decrease the hidden capturer count instead you
    * should set `stayHidden` to true.
    */
  def decrementCapturerCount(): Unit = js.native
  def decrementCapturerCount(stayHidden: Boolean): Unit = js.native
  def decrementCapturerCount(stayHidden: Boolean, stayAwake: Boolean): Unit = js.native
  def decrementCapturerCount(stayHidden: Unit, stayAwake: Boolean): Unit = js.native
  
  /**
    * Executes the editing command `delete` in web page.
    */
  def delete(): Unit = js.native
  
  /**
    * A `WebContents | null` property that represents the of DevTools `WebContents`
    * associated with a given `WebContents`.
    *
    * **Note:** Users should never store this object because it may become `null` when
    * the DevTools has been closed.
    *
    */
  val devToolsWebContents: WebContents_ | Null = js.native
  
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
    *
    * Code execution will be suspended until web page stop loading.
    */
  def executeJavaScript(code: String): js.Promise[Any] = js.native
  def executeJavaScript(code: String, userGesture: Boolean): js.Promise[Any] = js.native
  
  /**
    * A promise that resolves with the result of the executed code or is rejected if
    * the result of the code is a rejected promise.
    *
    * Works like `executeJavaScript` but evaluates `scripts` in an isolated context.
    */
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource]): js.Promise[Any] = js.native
  def executeJavaScriptInIsolatedWorld(worldId: Double, scripts: js.Array[WebSource], userGesture: Boolean): js.Promise[Any] = js.native
  
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
    * Forcefully terminates the renderer process that is currently hosting this
    * `webContents`. This will cause the `render-process-gone` event to be emitted
    * with the `reason=killed || reason=crashed`. Please note that some webContents
    * share renderer processes and therefore calling this method may also crash the
    * host process for other webContents as well.
    *
    * Calling `reload()` immediately after calling this method will force the reload
    * to occur in a new process. This should be used when this process is unstable or
    * unusable, for instance in order to recover from the `unresponsive` event.
    */
  def forcefullyCrashRenderer(): Unit = js.native
  
  /**
    * An `Integer` property that sets the frame rate of the web contents to the
    * specified number. Only values between 1 and 240 are accepted.
    *
    * Only applicable if *offscreen rendering* is enabled.
    */
  var frameRate: Double = js.native
  
  /**
    * Information about all Shared Workers.
    */
  def getAllSharedWorkers(): js.Array[SharedWorkerInfo] = js.native
  
  /**
    * whether or not this WebContents will throttle animations and timers when the
    * page becomes backgrounded. This also affects the Page Visibility API.
    */
  def getBackgroundThrottling(): Boolean = js.native
  
  /**
    * If *offscreen rendering* is enabled returns the current frame rate.
    */
  def getFrameRate(): Double = js.native
  
  /**
    * The identifier of a WebContents stream. This identifier can be used with
    * `navigator.mediaDevices.getUserMedia` using a `chromeMediaSource` of `tab`. The
    * identifier is restricted to the web contents that it is registered to and is
    * only valid for 10 seconds.
    */
  def getMediaSourceId(requestWebContents: WebContents_): String = js.native
  
  /**
    * The operating system `pid` of the associated renderer process.
    */
  def getOSProcessId(): Double = js.native
  
  /**
    * Get the system printer list.
    *
    *
    * **Deprecated:** Should use the new `contents.getPrintersAsync` API.
    *
    * @deprecated
    */
  def getPrinters(): js.Array[PrinterInfo] = js.native
  
  /**
    * Get the system printer list.
    *
    * Resolves with a `PrinterInfo[]`
    */
  def getPrintersAsync(): js.Promise[js.Array[PrinterInfo]] = js.native
  
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
  def getType(): "backgroundPage" | "window" | "browserView" | "remote" | "webview" | "offscreen" = js.native
  
  /**
    * The URL of the current web page.
    */
  def getURL(): String = js.native
  
  /**
    * The user agent for this web page.
    */
  def getUserAgent(): String = js.native
  
  /**
    * Returns the WebRTC IP Handling Policy.
    */
  def getWebRTCIPHandlingPolicy(): String = js.native
  
  /**
    * the current zoom factor.
    */
  def getZoomFactor(): Double = js.native
  
  /**
    * the current zoom level.
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
    * A `WebContents` instance that might own this `WebContents`.
    *
    */
  val hostWebContents: WebContents_ = js.native
  
  /**
    * A `Integer` representing the unique ID of this WebContents. Each ID is unique
    * among all `WebContents` instances of the entire Electron application.
    *
    */
  val id: Double = js.native
  
  /**
    * Increase the capturer count by one. The page is considered visible when its
    * browser window is hidden and the capturer count is non-zero. If you would like
    * the page to stay hidden, you should ensure that `stayHidden` is set to true.
    *
    * This also affects the Page Visibility API.
    */
  def incrementCapturerCount(): Unit = js.native
  def incrementCapturerCount(size: Unit, stayHidden: Boolean): Unit = js.native
  def incrementCapturerCount(size: Unit, stayHidden: Boolean, stayAwake: Boolean): Unit = js.native
  def incrementCapturerCount(size: Unit, stayHidden: Unit, stayAwake: Boolean): Unit = js.native
  def incrementCapturerCount(size: Size): Unit = js.native
  def incrementCapturerCount(size: Size, stayHidden: Boolean): Unit = js.native
  def incrementCapturerCount(size: Size, stayHidden: Boolean, stayAwake: Boolean): Unit = js.native
  def incrementCapturerCount(size: Size, stayHidden: Unit, stayAwake: Boolean): Unit = js.native
  
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
    * An `IpcMain` scoped to just IPC messages sent from this WebContents.
    *
    * IPC messages sent with `ipcRenderer.send`, `ipcRenderer.sendSync` or
    * `ipcRenderer.postMessage` will be delivered in the following order:
    *
    * * `contents.on('ipc-message')`
    * * `contents.mainFrame.on(channel)`
    * * `contents.ipc.on(channel)`
    * * `ipcMain.on(channel)`
    *
    * Handlers registered with `invoke` will be checked in the following order. The
    * first one that is defined will be called, the rest will be ignored.
    *
    * * `contents.mainFrame.handle(channel)`
    * * `contents.handle(channel)`
    * * `ipcMain.handle(channel)`
    *
    * A handler or event listener registered on the WebContents will receive IPC
    * messages sent from any frame, including child frames. In most cases, only the
    * main frame can send IPC messages. However, if the `nodeIntegrationInSubFrames`
    * option is enabled, it is possible for child frames to send IPC messages also. In
    * that case, handlers should check the `senderFrame` property of the IPC event to
    * ensure that the message is coming from the expected frame. Alternatively,
    * register handlers on the appropriate frame directly using the `WebFrameMain.ipc`
    * interface.
    *
    */
  val ipc: IpcMain = js.native
  
  /**
    * Whether this page has been muted.
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
    *
    * Would require code like this
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
    * A `WebFrameMain` property that represents the top frame of the page's frame
    * hierarchy.
    *
    */
  val mainFrame: WebFrameMain_ = js.native
  
  /**
    * Emitted when media is paused or done playing.
    */
  @JSName("on")
  @scala.annotation.targetName("on_mediapaused")
  def on(event: "media-paused", listener: js.Function): this.type = js.native
  /**
    * Emitted when the devtools window instructs the webContents to reload
    */
  @JSName("on")
  @scala.annotation.targetName("on_devtoolsreloadpage")
  def on(event: "devtools-reload-page", listener: js.Function): this.type = js.native
  /**
    * Emitted when `webContents` is destroyed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_destroyed")
  def on(event: "destroyed", listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is closed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_devtoolsclosed")
  def on(event: "devtools-closed", listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is focused / opened.
    */
  @JSName("on")
  @scala.annotation.targetName("on_devtoolsfocused")
  def on(event: "devtools-focused", listener: js.Function): this.type = js.native
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
    * Emitted when media starts playing.
    */
  @JSName("on")
  @scala.annotation.targetName("on_mediastartedplaying")
  def on(event: "media-started-playing", listener: js.Function): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  @scala.annotation.targetName("on_unresponsive")
  def on(event: "unresponsive", listener: js.Function): this.type = js.native
  /**
    * Emitted when the navigation is done, i.e. the spinner of the tab has stopped
    * spinning, and the `onload` event was dispatched.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didfinishload")
  def on(event: "did-finish-load", listener: js.Function): this.type = js.native
  /**
    * Emitted when DevTools is opened.
    */
  @JSName("on")
  @scala.annotation.targetName("on_devtoolsopened")
  def on(event: "devtools-opened", listener: js.Function): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  @scala.annotation.targetName("on_leavehtmlfullscreen")
  def on(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when the `WebContents` loses focus.
    */
  @JSName("on")
  @scala.annotation.targetName("on_blur")
  def on(event: "blur", listener: js.Function): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab stopped spinning.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didstoploading")
  def on(event: "did-stop-loading", listener: js.Function): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab started spinning.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didstartloading")
  def on(event: "did-start-loading", listener: js.Function): this.type = js.native
  /**
    * Emitted when the `WebContents` gains focus.
    *
    * Note that on macOS, having focus means the `WebContents` is the first responder
    * of window, so switching focus between windows would not trigger the `focus` and
    * `blur` events of `WebContents`, as the first responder of each window is not
    * changed.
    *
    * The `focus` and `blur` events of `WebContents` should only be used to detect
    * focus change between different `WebContents` and `BrowserView` in the same
    * window.
    */
  @JSName("on")
  @scala.annotation.targetName("on_focus")
  def on(event: "focus", listener: js.Function): this.type = js.native
  /**
    * Emitted when the document in the top-level frame is loaded.
    */
  @JSName("on")
  @scala.annotation.targetName("on_domready")
  def on(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when a `beforeunload` event handler is attempting to cancel a page
    * unload.
    *
    * Calling `event.preventDefault()` will ignore the `beforeunload` event handler
    * and allow the page to be unloaded.
    *
    * **Note:** This will be emitted for `BrowserViews` but will _not_ be respected -
    * this is because we have chosen not to tie the `BrowserView` lifecycle to its
    * owning BrowserWindow should one exist per the specification.
    */
  @JSName("on")
  @scala.annotation.targetName("on_willpreventunload")
  def on(event: "will-prevent-unload", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the renderer process crashes or is killed.
    *
    * **Deprecated:** This event is superceded by the `render-process-gone` event
    * which contains more information about why the render process disappeared. It
    * isn't always because it crashed.  The `killed` boolean can be replaced by
    * checking `reason === 'killed'` when you switch to that event.
    *
    * @deprecated
    */
  @JSName("on")
  @scala.annotation.targetName("on_crashed")
  def on(event: "crashed", listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  /**
    * Emitted when page receives favicon urls.
    */
  @JSName("on")
  @scala.annotation.targetName("on_pagefaviconupdated")
  def on(
    event: "page-favicon-updated",
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  /**
    * Emitted when the mainFrame, an `<iframe>`, or a nested `<iframe>` is loaded
    * within the page.
    */
  @JSName("on")
  @scala.annotation.targetName("on_framecreated")
  def on(
    event: "frame-created",
    listener: js.Function2[/* event */ Event, /* details */ FrameCreatedDetails, Unit]
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
    *
    * Calling `event.preventDefault()` will prevent the navigation.
    */
  @JSName("on")
  @scala.annotation.targetName("on_willnavigate")
  def on(event: "will-navigate", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when a result is available for [`webContents.findInPage`] request.
    */
  @JSName("on")
  @scala.annotation.targetName("on_foundinpage")
  def on(event: "found-in-page", listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  /**
    * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
    */
  @JSName("on")
  @scala.annotation.targetName("on_updatetargeturl")
  def on(event: "update-target-url", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when there is a new context menu that needs to be handled.
    */
  @JSName("on")
  @scala.annotation.targetName("on_contextmenu")
  def on(
    event: "context-menu",
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  /**
    * Emitted before dispatching the `keydown` and `keyup` events in the page. Calling
    * `event.preventDefault` will prevent the page `keydown`/`keyup` events and the
    * menu shortcuts.
    *
    * To only prevent the menu shortcuts, use `setIgnoreMenuShortcuts`:
    */
  @JSName("on")
  @scala.annotation.targetName("on_beforeinputevent")
  def on(event: "before-input-event", listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  /**
    * Emitted when the `WebContents` preferred size has changed.
    *
    * This event will only be emitted when `enablePreferredSizeMode` is set to `true`
    * in `webPreferences`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_preferredsizechanged")
  def on(
    event: "preferred-size-changed",
    listener: js.Function2[/* event */ Event, /* preferredSize */ Size, Unit]
  ): this.type = js.native
  /**
    * Emitted when a `<webview>` has been attached to this web contents.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didattachwebview")
  def on(
    event: "did-attach-webview",
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  /**
    * Emitted when the user is requesting to change the zoom level using the mouse
    * wheel.
    */
  @JSName("on")
  @scala.annotation.targetName("on_zoomchanged_in_out")
  def on(
    event: "zoom-changed",
    listener: js.Function2[/* event */ Event, /* zoomDirection */ "in" | "out", Unit]
  ): this.type = js.native
  /**
    * Emitted _after_ successful creation of a window via `window.open` in the
    * renderer. Not emitted if the creation of the window is canceled from
    * `webContents.setWindowOpenHandler`.
    *
    * See `window.open()` for more details and how to use this in conjunction with
    * `webContents.setWindowOpenHandler`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didcreatewindow")
  def on(
    event: "did-create-window",
    listener: js.Function2[/* window */ BrowserWindow, /* details */ DidCreateWindowDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a page's theme color changes. This is usually due to encountering a
    * meta tag:
    */
  @JSName("on")
  @scala.annotation.targetName("on_didchangethemecolor")
  def on(
    event: "did-change-theme-color",
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process unexpectedly disappears.  This is normally
    * because it was crashed or killed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_renderprocessgone")
  def on(
    event: "render-process-gone",
    listener: js.Function2[/* event */ Event, /* details */ RenderProcessGoneDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when bluetooth device needs to be selected on call to
    * `navigator.bluetooth.requestDevice`. To use `navigator.bluetooth` api
    * `webBluetooth` should be enabled. If `event.preventDefault` is not called, first
    * available device will be selected. `callback` should be called with `deviceId`
    * to be selected, passing empty string to `callback` will cancel the request.
    *
    * If no event listener is added for this event, all bluetooth requests will be
    * cancelled.
    */
  @JSName("on")
  @scala.annotation.targetName("on_selectbluetoothdevice")
  def on(
    event: "select-bluetooth-device",
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the renderer process sends a synchronous message via
    * `ipcRenderer.sendSync()`.
    *
    * See also `webContents.ipc`, which provides an `IpcMain`-like interface for
    * responding to IPC messages specifically from this WebContents.
    */
  @JSName("on")
  @scala.annotation.targetName("on_ipcmessagesync")
  def on(
    event: "ipc-message-sync",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process sends an asynchronous message via
    * `ipcRenderer.send()`.
    *
    * See also `webContents.ipc`, which provides an `IpcMain`-like interface for
    * responding to IPC messages specifically from this WebContents.
    */
  @JSName("on")
  @scala.annotation.targetName("on_ipcmessage")
  def on(
    event: "ipc-message",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when a plugin process has crashed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_plugincrashed")
  def on(
    event: "plugin-crashed",
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the preload script `preloadPath` throws an unhandled exception
    * `error`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_preloaderror")
  def on(
    event: "preload-error",
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ js.Error, Unit]
  ): this.type = js.native
  /**
    * Fired when page title is set during navigation. `explicitSet` is false when
    * title is synthesized from file url.
    */
  @JSName("on")
  @scala.annotation.targetName("on_pagetitleupdated")
  def on(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when a `<webview>`'s web contents is being attached to this web
    * contents. Calling `event.preventDefault()` will destroy the guest page.
    *
    * This event can be used to configure `webPreferences` for the `webContents` of a
    * `<webview>` before it's loaded, and provides the ability to set settings that
    * can't be set via `<webview>` attributes.
    */
  @JSName("on")
  @scala.annotation.targetName("on_willattachwebview")
  def on(
    event: "will-attach-webview",
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a new frame is generated. Only the dirty area is passed in the
    * buffer.
    */
  @JSName("on")
  @scala.annotation.targetName("on_paint")
  def on(
    event: "paint",
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  /**
    * Emitted when a frame has done navigation.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didframefinishload")
  def on(
    event: "did-frame-finish-load",
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when `webContents` wants to do basic auth.
    *
    * The usage is the same with the `login` event of `app`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_login")
  def on(
    event: "login",
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
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
  @scala.annotation.targetName("on_didnavigate")
  def on(
    event: "did-navigate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a client certificate is requested.
    *
    * The usage is the same with the `select-client-certificate` event of `app`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_selectclientcertificate")
  def on(
    event: "select-client-certificate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
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
  @scala.annotation.targetName("on_didnavigateinpage")
  def on(
    event: "did-navigate-in-page",
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
    * Emitted when the associated window logs a console message.
    */
  @JSName("on")
  @scala.annotation.targetName("on_consolemessage")
  def on(
    event: "console-message",
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
    * Emitted after a server side redirect occurs during navigation.  For example a
    * 302 redirect.
    *
    * This event cannot be prevented, if you want to prevent redirects you should
    * checkout out the `will-redirect` event above.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didredirectnavigation")
  def on(
    event: "did-redirect-navigation",
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
  @scala.annotation.targetName("on_cursorchanged")
  def on(
    event: "cursor-changed",
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
    * Emitted when any frame (including main) starts navigating. `isInPlace` will be
    * `true` for in-page navigations.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didstartnavigation")
  def on(
    event: "did-start-navigation",
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
    * Emitted when a server side redirect occurs during navigation.  For example a 302
    * redirect.
    *
    * This event will be emitted after `did-start-navigation` and always before the
    * `did-redirect-navigation` event for the same navigation.
    *
    * Calling `event.preventDefault()` will prevent the navigation (not just the
    * redirect).
    */
  @JSName("on")
  @scala.annotation.targetName("on_willredirect")
  def on(
    event: "will-redirect",
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
    * Emitted when failed to verify the `certificate` for `url`.
    *
    * The usage is the same with the `certificate-error` event of `app`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_certificateerror")
  def on(
    event: "certificate-error",
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * This event is like `did-fail-load` but emitted when the load was cancelled (e.g.
    * `window.stop()` was invoked).
    */
  @JSName("on")
  @scala.annotation.targetName("on_didfailprovisionalload")
  def on(
    event: "did-fail-provisional-load",
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
    * This event is like `did-finish-load` but emitted when the load failed. The full
    * list of error codes and their meaning is available here.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didfailload")
  def on(
    event: "did-fail-load",
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
    * Emitted when any frame navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("on")
  @scala.annotation.targetName("on_didframenavigate")
  def on(
    event: "did-frame-navigate",
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
    * Deprecated in favor of `webContents.setWindowOpenHandler`.
    *
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
    *
    * @deprecated
    */
  @JSName("on")
  @scala.annotation.targetName("on_newwindow_default_foregroundtab_backgroundtab_newwindow_savetodisk_other")
  def on(
    event: "new-window",
    listener: js.Function8[
      /* event */ NewWindowWebContentsEvent, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ "default" | "foreground-tab" | "background-tab" | "new-window" | "save-to-disk" | "other", 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      /* postBody */ PostBody, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_focus")
  def once(event: "focus", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didfinishload")
  def once(event: "did-finish-load", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didstoploading")
  def once(event: "did-stop-loading", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mediapaused")
  def once(event: "media-paused", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didstartloading")
  def once(event: "did-start-loading", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_devtoolsreloadpage")
  def once(event: "devtools-reload-page", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_devtoolsopened")
  def once(event: "devtools-opened", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_blur")
  def once(event: "blur", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mediastartedplaying")
  def once(event: "media-started-playing", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_devtoolsclosed")
  def once(event: "devtools-closed", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_leavehtmlfullscreen")
  def once(event: "leave-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unresponsive")
  def once(event: "unresponsive", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_destroyed")
  def once(event: "destroyed", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_responsive")
  def once(event: "responsive", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_devtoolsfocused")
  def once(event: "devtools-focused", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_enterhtmlfullscreen")
  def once(event: "enter-html-full-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_domready")
  def once(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_willpreventunload")
  def once(event: "will-prevent-unload", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_preferredsizechanged")
  def once(
    event: "preferred-size-changed",
    listener: js.Function2[/* event */ Event, /* preferredSize */ Size, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_willnavigate")
  def once(event: "will-navigate", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_foundinpage")
  def once(event: "found-in-page", listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_framecreated")
  def once(
    event: "frame-created",
    listener: js.Function2[/* event */ Event, /* details */ FrameCreatedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_beforeinputevent")
  def once(event: "before-input-event", listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_crashed")
  def once(event: "crashed", listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_pagefaviconupdated")
  def once(
    event: "page-favicon-updated",
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didchangethemecolor")
  def once(
    event: "did-change-theme-color",
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didcreatewindow")
  def once(
    event: "did-create-window",
    listener: js.Function2[/* window */ BrowserWindow, /* details */ DidCreateWindowDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didattachwebview")
  def once(
    event: "did-attach-webview",
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_contextmenu")
  def once(
    event: "context-menu",
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_updatetargeturl")
  def once(event: "update-target-url", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_zoomchanged_in_out")
  def once(
    event: "zoom-changed",
    listener: js.Function2[/* event */ Event, /* zoomDirection */ "in" | "out", Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_renderprocessgone")
  def once(
    event: "render-process-gone",
    listener: js.Function2[/* event */ Event, /* details */ RenderProcessGoneDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_pagetitleupdated")
  def once(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ipcmessage")
  def once(
    event: "ipc-message",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_preloaderror")
  def once(
    event: "preload-error",
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ js.Error, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_selectbluetoothdevice")
  def once(
    event: "select-bluetooth-device",
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ipcmessagesync")
  def once(
    event: "ipc-message-sync",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_plugincrashed")
  def once(
    event: "plugin-crashed",
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_willattachwebview")
  def once(
    event: "will-attach-webview",
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_paint")
  def once(
    event: "paint",
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didnavigate")
  def once(
    event: "did-navigate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_login")
  def once(
    event: "login",
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_selectclientcertificate")
  def once(
    event: "select-client-certificate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didframefinishload")
  def once(
    event: "did-frame-finish-load",
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_consolemessage")
  def once(
    event: "console-message",
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
  @scala.annotation.targetName("once_didnavigateinpage")
  def once(
    event: "did-navigate-in-page",
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
  @scala.annotation.targetName("once_cursorchanged")
  def once(
    event: "cursor-changed",
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
  @scala.annotation.targetName("once_certificateerror")
  def once(
    event: "certificate-error",
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_didstartnavigation")
  def once(
    event: "did-start-navigation",
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
  @scala.annotation.targetName("once_didredirectnavigation")
  def once(
    event: "did-redirect-navigation",
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
  @scala.annotation.targetName("once_willredirect")
  def once(
    event: "will-redirect",
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
  @scala.annotation.targetName("once_didfailload")
  def once(
    event: "did-fail-load",
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
  @scala.annotation.targetName("once_didframenavigate")
  def once(
    event: "did-frame-navigate",
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
  @scala.annotation.targetName("once_didfailprovisionalload")
  def once(
    event: "did-fail-provisional-load",
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
  @scala.annotation.targetName("once_newwindow_default_foregroundtab_backgroundtab_newwindow_savetodisk_other")
  def once(
    event: "new-window",
    listener: js.Function8[
      /* event */ NewWindowWebContentsEvent, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ "default" | "foreground-tab" | "background-tab" | "new-window" | "save-to-disk" | "other", 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      /* postBody */ PostBody, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Opens the devtools.
    *
    * When `contents` is a `<webview>` tag, the `mode` would be `detach` by default,
    * explicitly passing an empty `mode` can force using last used dock state.
    *
    * On Windows, if Windows Control Overlay is enabled, Devtools will be opened with
    * `mode: 'detach'`.
    */
  def openDevTools(): Unit = js.native
  def openDevTools(options: OpenDevToolsOptions): Unit = js.native
  
  /**
    * A `WebFrameMain` property that represents the frame that opened this
    * WebContents, either with open(), or by navigating a link with a target
    * attribute.
    *
    */
  val opener: WebFrameMain_ = js.native
  
  /**
    * Executes the editing command `paste` in web page.
    */
  def paste(): Unit = js.native
  
  /**
    * Executes the editing command `pasteAndMatchStyle` in web page.
    */
  def pasteAndMatchStyle(): Unit = js.native
  
  /**
    * Send a message to the renderer process, optionally transferring ownership of
    * zero or more [`MessagePortMain`][] objects.
    *
    * The transferred `MessagePortMain` objects will be available in the renderer
    * process by accessing the `ports` property of the emitted event. When they arrive
    * in the renderer, they will be native DOM `MessagePort` objects.
    *
    * For example:
    */
  def postMessage(channel: String, message: Any): Unit = js.native
  def postMessage(channel: String, message: Any, transfer: js.Array[MessagePortMain]): Unit = js.native
  
  /**
    * When a custom `pageSize` is passed, Chromium attempts to validate platform
    * specific minimum values for `width_microns` and `height_microns`. Width and
    * height must both be minimum 353 microns but may be higher on some operating
    * systems.
    *
    * Prints window's web page. When `silent` is set to `true`, Electron will pick the
    * system's default printer if `deviceName` is empty and the default settings for
    * printing.
    *
    * Use `page-break-before: always;` CSS style to force to print to a new page.
    *
    * Example usage:
    */
  def print(): Unit = js.native
  def print(options: Unit, callback: js.Function2[/* success */ Boolean, /* failureReason */ String, Unit]): Unit = js.native
  def print(options: WebContentsPrintOptions): Unit = js.native
  def print(
    options: WebContentsPrintOptions,
    callback: js.Function2[/* success */ Boolean, /* failureReason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Resolves with the generated PDF data.
    *
    * Prints the window's web page as PDF.
    *
    * The `landscape` will be ignored if `@page` CSS at-rule is used in the web page.
    *
    * An example of `webContents.printToPDF`:
    *
    * See Page.printToPdf for more information.
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
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_devtoolsreloadpage")
  def removeListener(event: "devtools-reload-page", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_focus")
  def removeListener(event: "focus", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didstartloading")
  def removeListener(event: "did-start-loading", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_devtoolsfocused")
  def removeListener(event: "devtools-focused", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_devtoolsclosed")
  def removeListener(event: "devtools-closed", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mediapaused")
  def removeListener(event: "media-paused", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_unresponsive")
  def removeListener(event: "unresponsive", listener: js.Function): this.type = js.native
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
  @scala.annotation.targetName("removeListener_didfinishload")
  def removeListener(event: "did-finish-load", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_destroyed")
  def removeListener(event: "destroyed", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_blur")
  def removeListener(event: "blur", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_devtoolsopened")
  def removeListener(event: "devtools-opened", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mediastartedplaying")
  def removeListener(event: "media-started-playing", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didstoploading")
  def removeListener(event: "did-stop-loading", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_willpreventunload")
  def removeListener(event: "will-prevent-unload", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_domready")
  def removeListener(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didchangethemecolor")
  def removeListener(
    event: "did-change-theme-color",
    listener: js.Function2[/* event */ Event, /* color */ String | Null, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_contextmenu")
  def removeListener(
    event: "context-menu",
    listener: js.Function2[/* event */ Event, /* params */ ContextMenuParams, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_foundinpage")
  def removeListener(event: "found-in-page", listener: js.Function2[/* event */ Event, /* result */ Result, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_willnavigate")
  def removeListener(event: "will-navigate", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_updatetargeturl")
  def removeListener(event: "update-target-url", listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_beforeinputevent")
  def removeListener(event: "before-input-event", listener: js.Function2[/* event */ Event, /* input */ Input, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_crashed")
  def removeListener(event: "crashed", listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_preferredsizechanged")
  def removeListener(
    event: "preferred-size-changed",
    listener: js.Function2[/* event */ Event, /* preferredSize */ Size, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_renderprocessgone")
  def removeListener(
    event: "render-process-gone",
    listener: js.Function2[/* event */ Event, /* details */ RenderProcessGoneDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_framecreated")
  def removeListener(
    event: "frame-created",
    listener: js.Function2[/* event */ Event, /* details */ FrameCreatedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didcreatewindow")
  def removeListener(
    event: "did-create-window",
    listener: js.Function2[/* window */ BrowserWindow, /* details */ DidCreateWindowDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didattachwebview")
  def removeListener(
    event: "did-attach-webview",
    listener: js.Function2[/* event */ Event, /* webContents */ this.type, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_zoomchanged_in_out")
  def removeListener(
    event: "zoom-changed",
    listener: js.Function2[/* event */ Event, /* zoomDirection */ "in" | "out", Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_pagefaviconupdated")
  def removeListener(
    event: "page-favicon-updated",
    listener: js.Function2[/* event */ Event, /* favicons */ js.Array[String], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_willattachwebview")
  def removeListener(
    event: "will-attach-webview",
    listener: js.Function3[
      /* event */ Event, 
      /* webPreferences */ WebPreferences, 
      /* params */ Record[String, String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_preloaderror")
  def removeListener(
    event: "preload-error",
    listener: js.Function3[/* event */ Event, /* preloadPath */ String, /* error */ js.Error, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_ipcmessagesync")
  def removeListener(
    event: "ipc-message-sync",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_pagetitleupdated")
  def removeListener(
    event: "page-title-updated",
    listener: js.Function3[/* event */ Event, /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_plugincrashed")
  def removeListener(
    event: "plugin-crashed",
    listener: js.Function3[/* event */ Event, /* name */ String, /* version */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_ipcmessage")
  def removeListener(
    event: "ipc-message",
    listener: js.Function3[/* event */ Event, /* channel */ String, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_selectbluetoothdevice")
  def removeListener(
    event: "select-bluetooth-device",
    listener: js.Function3[
      /* event */ Event, 
      /* devices */ js.Array[BluetoothDevice], 
      /* callback */ js.Function1[/* deviceId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_paint")
  def removeListener(
    event: "paint",
    listener: js.Function3[/* event */ Event, /* dirtyRect */ Rectangle, /* image */ NativeImage_, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didframefinishload")
  def removeListener(
    event: "did-frame-finish-load",
    listener: js.Function4[
      /* event */ Event, 
      /* isMainFrame */ Boolean, 
      /* frameProcessId */ Double, 
      /* frameRoutingId */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_selectclientcertificate")
  def removeListener(
    event: "select-client-certificate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ Certificate, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_login")
  def removeListener(
    event: "login",
    listener: js.Function4[
      /* event */ Event, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didnavigate")
  def removeListener(
    event: "did-navigate",
    listener: js.Function4[
      /* event */ Event, 
      /* url */ String, 
      /* httpResponseCode */ Double, 
      /* httpStatusText */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_didnavigateinpage")
  def removeListener(
    event: "did-navigate-in-page",
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
  @scala.annotation.targetName("removeListener_consolemessage")
  def removeListener(
    event: "console-message",
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
  @scala.annotation.targetName("removeListener_willredirect")
  def removeListener(
    event: "will-redirect",
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
  @scala.annotation.targetName("removeListener_certificateerror")
  def removeListener(
    event: "certificate-error",
    listener: js.Function6[
      /* event */ Event, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_cursorchanged")
  def removeListener(
    event: "cursor-changed",
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
  @scala.annotation.targetName("removeListener_didstartnavigation")
  def removeListener(
    event: "did-start-navigation",
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
  @scala.annotation.targetName("removeListener_didredirectnavigation")
  def removeListener(
    event: "did-redirect-navigation",
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
  @scala.annotation.targetName("removeListener_didfailprovisionalload")
  def removeListener(
    event: "did-fail-provisional-load",
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
  @scala.annotation.targetName("removeListener_didfailload")
  def removeListener(
    event: "did-fail-load",
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
  @scala.annotation.targetName("removeListener_didframenavigate")
  def removeListener(
    event: "did-frame-navigate",
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
  @scala.annotation.targetName("removeListener_newwindow_default_foregroundtab_backgroundtab_newwindow_savetodisk_other")
  def removeListener(
    event: "new-window",
    listener: js.Function8[
      /* event */ NewWindowWebContentsEvent, 
      /* url */ String, 
      /* frameName */ String, 
      /* disposition */ "default" | "foreground-tab" | "background-tab" | "new-window" | "save-to-disk" | "other", 
      /* options */ BrowserWindowConstructorOptions, 
      /* additionalFeatures */ js.Array[String], 
      /* referrer */ Referrer, 
      /* postBody */ PostBody, 
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
  
  /**
    * resolves if the page is saved.
    */
  @JSName("savePage")
  @scala.annotation.targetName("savePage_HTMLOnly_HTMLComplete_MHTML")
  def savePage(fullPath: String, saveType: "HTMLOnly" | "HTMLComplete" | "MHTML"): js.Promise[Unit] = js.native
  
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
    * Electron objects will throw an exception.
    *
    * The renderer process can handle the message by listening to `channel` with the
    * `ipcRenderer` module.
    *
    * An example of sending messages from the main process to the renderer process:
    */
  def send(channel: String, args: Any*): Unit = js.native
  
  def sendInputEvent(inputEvent: KeyboardInputEvent): Unit = js.native
  /**
    * Sends an input `event` to the page. **Note:** The `BrowserWindow` containing the
    * contents needs to be focused for `sendInputEvent()` to work.
    */
  def sendInputEvent(inputEvent: MouseInputEvent): Unit = js.native
  def sendInputEvent(inputEvent: MouseWheelInputEvent): Unit = js.native
  
  def sendToFrame(frameId: js.Tuple2[Double, Double], channel: String, args: Any*): Unit = js.native
  /**
    * Send an asynchronous message to a specific frame in a renderer process via
    * `channel`, along with arguments. Arguments will be serialized with the
    * Structured Clone Algorithm, just like `postMessage`, so prototype chains will
    * not be included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets
    * will throw an exception.
    *
    * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects will throw an exception.
    *
    * The renderer process can handle the message by listening to `channel` with the
    * `ipcRenderer` module.
    *
    * If you want to get the `frameId` of a given renderer context you should use the
    * `webFrame.routingId` value.  E.g.
    *
    * You can also read `frameId` from all incoming IPC messages in the main process.
    */
  def sendToFrame(frameId: Double, channel: String, args: Any*): Unit = js.native
  
  /**
    * A `Session` used by this webContents.
    *
    */
  val session: Session_ = js.native
  
  /**
    * Mute the audio on the current web page.
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
    * An example of showing devtools in a `BrowserWindow`:
    */
  def setDevToolsWebContents(devToolsWebContents: WebContents_): Unit = js.native
  
  /**
    * If *offscreen rendering* is enabled sets the frame rate to the specified number.
    * Only values between 1 and 240 are accepted.
    */
  def setFrameRate(fps: Double): Unit = js.native
  
  /**
    * Ignore application menu shortcuts while this web contents is focused.
    */
  def setIgnoreMenuShortcuts(ignore: Boolean): Unit = js.native
  
  /**
    * Sets the image animation policy for this webContents.  The policy only affects
    * _new_ images, existing images that are currently being animated are unaffected.
    * This is a known limitation in Chromium, you can force image animation to be
    * recalculated with `img.src = img.src` which will result in no network traffic
    * but will update the animation policy.
    *
    * This corresponds to the animationPolicy accessibility feature in Chromium.
    */
  @JSName("setImageAnimationPolicy")
  @scala.annotation.targetName("setImageAnimationPolicy_animate_animateOnce_noAnimation")
  def setImageAnimationPolicy(policy: "animate" | "animateOnce" | "noAnimation"): Unit = js.native
  
  /**
    * Overrides the user agent for this web page.
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
  @scala.annotation.targetName("setWebRTCIPHandlingPolicy_default_default_public_interface_only_default_public_and_private_interfaces_disable_non_proxied_udp")
  def setWebRTCIPHandlingPolicy(
    policy: "default" | "default_public_interface_only" | "default_public_and_private_interfaces" | "disable_non_proxied_udp"
  ): Unit = js.native
  
  /**
    * Called before creating a window a new window is requested by the renderer, e.g.
    * by `window.open()`, a link with `target="_blank"`, shift+clicking on a link, or
    * submitting a form with `<form target="_blank">`. See `window.open()` for more
    * details and how to use this in conjunction with `did-create-window`.
    */
  def setWindowOpenHandler(handler: js.Function1[/* details */ HandlerDetails, Action | OverrideBrowserWindowOptions]): Unit = js.native
  
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
    *
    * The factor must be greater than 0.0.
    */
  def setZoomFactor(factor: Double): Unit = js.native
  
  /**
    * Changes the zoom level to the specified level. The original size is 0 and each
    * increment above or below represents zooming 20% larger or smaller to default
    * limits of 300% and 50% of original size, respectively. The formula for this is
    * `scale := 1.2 ^ level`.
    *
    * > **NOTE**: The zoom policy at the Chromium level is same-origin, meaning that
    * the zoom level for a specific domain propagates across all instances of windows
    * with the same domain. Differentiating the window URLs will make zoom work
    * per-window.
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
  
  /**
    * Stops any `findInPage` request for the `webContents` with the provided `action`.
    */
  @JSName("stopFindInPage")
  @scala.annotation.targetName("stopFindInPage_clearSelection_keepSelection_activateSelection")
  def stopFindInPage(action: "clearSelection" | "keepSelection" | "activateSelection"): Unit = js.native
  
  /**
    * If *offscreen rendering* is enabled and painting, stop painting.
    */
  def stopPainting(): Unit = js.native
  
  /**
    * Indicates whether the snapshot has been created successfully.
    *
    * Takes a V8 heap snapshot and saves it to `filePath`.
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
  
  /**
    * A `string` property that determines the user agent for this web page.
    */
  var userAgent: String = js.native
  
  /**
    * A `number` property that determines the zoom factor for this web contents.
    *
    * The zoom factor is the zoom percent divided by 100, so 300% = 3.0.
    */
  var zoomFactor: Double = js.native
  
  /**
    * A `number` property that determines the zoom level for this web contents.
    *
    * The original size is 0 and each increment above or below represents zooming 20%
    * larger or smaller to default limits of 300% and 50% of original size,
    * respectively. The formula for this is `scale := 1.2 ^ level`.
    */
  var zoomLevel: Double = js.native
}
