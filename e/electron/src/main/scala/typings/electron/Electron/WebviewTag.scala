package typings.electron.Electron

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewTag
  extends StObject
     with HTMLElement {
  
  /**
    * Emitted when any frame navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didframenavigate")
  def addEventListener(event: "did-frame-navigate", listener: js.Function1[/* event */ DidFrameNavigateEvent, Unit]): this.type = js.native
  /**
    * Fired when the guest page attempts to open a new browser window.
    *
    * The following example code opens the new url in system's default browser.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_newwindow")
  def addEventListener(event: "new-window", listener: js.Function1[/* event */ NewWindowEvent, Unit]): this.type = js.native
  // Docs: https://electronjs.org/docs/api/webview-tag
  /**
    * Fired when a load has committed. This includes navigation within the current
    * document as well as subframe document-level loads, but does not include
    * asynchronous resource loads.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadcommit")
  def addEventListener(event: "load-commit", listener: js.Function1[/* event */ LoadCommitEvent, Unit]): this.type = js.native
  /**
    * Emitted when DevTools is focused / opened.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsfocused")
  def addEventListener(event: "devtools-focused", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when the guest page attempts to close itself.
    *
    * The following example code navigates the `webview` to `about:blank` when the
    * guest attempts to close itself.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_close")
  def addEventListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when page title is set during navigation. `explicitSet` is false when
    * title is synthesized from file url.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pagetitleupdated")
  def addEventListener(event: "page-title-updated", listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit]): this.type = js.native
  /**
    * Fired when the renderer process is crashed.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_crashed")
  def addEventListener(event: "crashed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when the WebContents is destroyed.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_destroyed")
  def addEventListener(event: "destroyed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when page receives favicon urls.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pagefaviconupdated")
  def addEventListener(event: "page-favicon-updated", listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit]): this.type = js.native
  /**
    * Fired when document in the given frame is loaded.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_domready")
  def addEventListener(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when a plugin process is crashed.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_plugincrashed")
  def addEventListener(event: "plugin-crashed", listener: js.Function1[/* event */ PluginCrashedEvent, Unit]): this.type = js.native
  /**
    * Fired when the guest window logs a console message.
    *
    * The following example code forwards all log messages to the embedder's console
    * without regard for log level or other properties.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_consolemessage")
  def addEventListener(event: "console-message", listener: js.Function1[/* event */ ConsoleMessageEvent, Unit]): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab stops spinning.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstoploading")
  def addEventListener(event: "did-stop-loading", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Corresponds to the points in time when the spinner of the tab starts spinning.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstartloading")
  def addEventListener(event: "did-start-loading", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when a frame has done navigation.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didframefinishload")
  def addEventListener(event: "did-frame-finish-load", listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit]): this.type = js.native
  /**
    * Emitted when a navigation is done.
    *
    * This event is not emitted for in-page navigations, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didnavigate")
  def addEventListener(event: "did-navigate", listener: js.Function1[/* event */ DidNavigateEvent, Unit]): this.type = js.native
  /**
    * Emitted when a page's theme color changes. This is usually due to encountering a
    * meta tag:
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didchangethemecolor")
  def addEventListener(
    event: "did-change-theme-color",
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit]
  ): this.type = js.native
  /**
    * Fired when page enters fullscreen triggered by HTML API.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enterhtmlfullscreen")
  def addEventListener(event: "enter-html-full-screen", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when there is a new context menu that needs to be handled.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_contextmenu")
  def addEventListener(event: "context-menu", listener: js.Function1[/* event */ ContextMenuEvent, Unit]): this.type = js.native
  /**
    * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_updatetargeturl")
  def addEventListener(event: "update-target-url", listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit]): this.type = js.native
  /**
    * Emitted when an in-page navigation happened.
    *
    * When in-page navigation happens, the page URL changes but does not cause
    * navigation outside of the page. Examples of this occurring are when anchor links
    * are clicked or when the DOM `hashchange` event is triggered.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didnavigateinpage")
  def addEventListener(event: "did-navigate-in-page", listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit]): this.type = js.native
  /**
    * Emitted when media is paused or done playing.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mediapaused")
  def addEventListener(event: "media-paused", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when attached to the embedder web contents.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didattach")
  def addEventListener(event: "did-attach", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when DevTools is opened.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsopened")
  def addEventListener(event: "devtools-opened", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * This event is like `did-finish-load`, but fired when the load failed or was
    * cancelled, e.g. `window.stop()` is invoked.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didfailload")
  def addEventListener(event: "did-fail-load", listener: js.Function1[/* event */ DidFailLoadEvent, Unit]): this.type = js.native
  /**
    * Emitted when DevTools is closed.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsclosed")
  def addEventListener(event: "devtools-closed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when a user or the page wants to start navigation. It can happen when
    * the `window.location` object is changed or a user clicks a link in the page.
    *
    * This event will not emit when the navigation is started programmatically with
    * APIs like `<webview>.loadURL` and `<webview>.back`.
    *
    * It is also not emitted during in-page navigation, such as clicking anchor links
    * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
    * this purpose.
    *
    * Calling `event.preventDefault()` does __NOT__ have any effect.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_willnavigate")
  def addEventListener(event: "will-navigate", listener: js.Function1[/* event */ WillNavigateEvent, Unit]): this.type = js.native
  /**
    * Fired when page leaves fullscreen triggered by HTML API.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_leavehtmlfullscreen")
  def addEventListener(event: "leave-html-full-screen", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when any frame (including main) starts navigating. `isInPlace` will be
    * `true` for in-page navigations.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstartnavigation")
  def addEventListener(event: "did-start-navigation", listener: js.Function1[/* event */ DidStartNavigationEvent, Unit]): this.type = js.native
  /**
    * Fired when the navigation is done, i.e. the spinner of the tab will stop
    * spinning, and the `onload` event is dispatched.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didfinishload")
  def addEventListener(event: "did-finish-load", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Fired when the guest page has sent an asynchronous message to embedder page.
    *
    * With `sendToHost` method and `ipc-message` event you can communicate between
    * guest page and embedder page:
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_ipcmessage")
  def addEventListener(event: "ipc-message", listener: js.Function1[/* event */ IpcMessageEvent, Unit]): this.type = js.native
  /**
    * Emitted when media starts playing.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mediastartedplaying")
  def addEventListener(event: "media-started-playing", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted after a server side redirect occurs during navigation. For example a 302
    * redirect.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didredirectnavigation")
  def addEventListener(
    event: "did-redirect-navigation",
    listener: js.Function1[/* event */ DidRedirectNavigationEvent, Unit]
  ): this.type = js.native
  /**
    * Fired when a result is available for `webview.findInPage` request.
    */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_foundinpage")
  def addEventListener(event: "found-in-page", listener: js.Function1[/* event */ FoundInPageEvent, Unit]): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pagefaviconupdated")
  def addEventListener(
    event: "page-favicon-updated",
    listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_plugincrashed")
  def addEventListener(
    event: "plugin-crashed",
    listener: js.Function1[/* event */ PluginCrashedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_crashed")
  def addEventListener(event: "crashed", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didchangethemecolor")
  def addEventListener(
    event: "did-change-theme-color",
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsclosed")
  def addEventListener(event: "devtools-closed", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_domready")
  def addEventListener(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_loadcommit")
  def addEventListener(
    event: "load-commit",
    listener: js.Function1[/* event */ LoadCommitEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didframenavigate")
  def addEventListener(
    event: "did-frame-navigate",
    listener: js.Function1[/* event */ DidFrameNavigateEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsfocused")
  def addEventListener(event: "devtools-focused", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didfinishload")
  def addEventListener(event: "did-finish-load", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didframefinishload")
  def addEventListener(
    event: "did-frame-finish-load",
    listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstoploading")
  def addEventListener(event: "did-stop-loading", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_enterhtmlfullscreen")
  def addEventListener(
    event: "enter-html-full-screen",
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didnavigateinpage")
  def addEventListener(
    event: "did-navigate-in-page",
    listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_leavehtmlfullscreen")
  def addEventListener(
    event: "leave-html-full-screen",
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mediapaused")
  def addEventListener(event: "media-paused", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_contextmenu")
  def addEventListener(
    event: "context-menu",
    listener: js.Function1[/* event */ ContextMenuEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_foundinpage")
  def addEventListener(
    event: "found-in-page",
    listener: js.Function1[/* event */ FoundInPageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstartnavigation")
  def addEventListener(
    event: "did-start-navigation",
    listener: js.Function1[/* event */ DidStartNavigationEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didfailload")
  def addEventListener(
    event: "did-fail-load",
    listener: js.Function1[/* event */ DidFailLoadEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_willnavigate")
  def addEventListener(
    event: "will-navigate",
    listener: js.Function1[/* event */ WillNavigateEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_destroyed")
  def addEventListener(event: "destroyed", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_newwindow")
  def addEventListener(event: "new-window", listener: js.Function1[/* event */ NewWindowEvent, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didredirectnavigation")
  def addEventListener(
    event: "did-redirect-navigation",
    listener: js.Function1[/* event */ DidRedirectNavigationEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didstartloading")
  def addEventListener(event: "did-start-loading", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_consolemessage")
  def addEventListener(
    event: "console-message",
    listener: js.Function1[/* event */ ConsoleMessageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_ipcmessage")
  def addEventListener(
    event: "ipc-message",
    listener: js.Function1[/* event */ IpcMessageEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didattach")
  def addEventListener(event: "did-attach", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devtoolsopened")
  def addEventListener(event: "devtools-opened", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_updatetargeturl")
  def addEventListener(
    event: "update-target-url",
    listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pagetitleupdated")
  def addEventListener(
    event: "page-title-updated",
    listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_didnavigate")
  def addEventListener(
    event: "did-navigate",
    listener: js.Function1[/* event */ DidNavigateEvent, Unit],
    useCapture: Boolean
  ): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_close")
  def addEventListener(event: "close", listener: js.Function1[/* event */ Event, Unit], useCapture: Boolean): this.type = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_mediastartedplaying")
  def addEventListener(
    event: "media-started-playing",
    listener: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): this.type = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * A `boolean`. When this attribute is present the guest page will be allowed to
    * open new windows. Popups are disabled by default.
    */
  var allowpopups: Boolean = js.native
  
  /**
    * Whether the guest page can go back.
    */
  def canGoBack(): Boolean = js.native
  
  /**
    * Whether the guest page can go forward.
    */
  def canGoForward(): Boolean = js.native
  
  /**
    * Whether the guest page can go to `offset`.
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
    * Closes the DevTools window of guest page.
    */
  def closeDevTools(): Unit = js.native
  
  /**
    * Executes editing command `copy` in page.
    */
  def copy(): Unit = js.native
  
  /**
    * Executes editing command `cut` in page.
    */
  def cut(): Unit = js.native
  
  /**
    * Executes editing command `delete` in page.
    */
  def delete(): Unit = js.native
  
  /**
    * A `string` which is a list of strings which specifies the blink features to be
    * disabled separated by `,`. The full list of supported feature strings can be
    * found in the RuntimeEnabledFeatures.json5 file.
    */
  var disableblinkfeatures: String = js.native
  
  /**
    * A `boolean`. When this attribute is present the guest page will have web
    * security disabled. Web security is enabled by default.
    */
  var disablewebsecurity: Boolean = js.native
  
  /**
    * Initiates a download of the resource at `url` without navigating.
    */
  def downloadURL(url: String): Unit = js.native
  
  /**
    * A `string` which is a list of strings which specifies the blink features to be
    * enabled separated by `,`. The full list of supported feature strings can be
    * found in the RuntimeEnabledFeatures.json5 file.
    */
  var enableblinkfeatures: String = js.native
  
  /**
    * A promise that resolves with the result of the executed code or is rejected if
    * the result of the code is a rejected promise.
    *
    * Evaluates `code` in page. If `userGesture` is set, it will create the user
    * gesture context in the page. HTML APIs like `requestFullScreen`, which require
    * user action, can take advantage of this option for automation.
    */
  def executeJavaScript(code: String): js.Promise[Any] = js.native
  def executeJavaScript(code: String, userGesture: Boolean): js.Promise[Any] = js.native
  
  /**
    * The request id used for the request.
    *
    * Starts a request to find all matches for the `text` in the web page. The result
    * of the request can be obtained by subscribing to `found-in-page` event.
    */
  def findInPage(text: String): Double = js.native
  def findInPage(text: String, options: FindInPageOptions): Double = js.native
  
  /**
    * The title of guest page.
    */
  def getTitle(): String = js.native
  
  /**
    * The URL of guest page.
    */
  def getURL(): String = js.native
  
  /**
    * The user agent for guest page.
    */
  def getUserAgent(): String = js.native
  
  /**
    * The WebContents ID of this `webview`.
    */
  def getWebContentsId(): Double = js.native
  
  /**
    * the current zoom factor.
    */
  def getZoomFactor(): Double = js.native
  
  /**
    * the current zoom level.
    */
  def getZoomLevel(): Double = js.native
  
  /**
    * Makes the guest page go back.
    */
  def goBack(): Unit = js.native
  
  /**
    * Makes the guest page go forward.
    */
  def goForward(): Unit = js.native
  
  /**
    * Navigates to the specified absolute index.
    */
  def goToIndex(index: Double): Unit = js.native
  
  /**
    * Navigates to the specified offset from the "current entry".
    */
  def goToOffset(offset: Double): Unit = js.native
  
  /**
    * A `string` that sets the referrer URL for the guest page.
    */
  var httpreferrer: String = js.native
  
  /**
    * A promise that resolves with a key for the inserted CSS that can later be used
    * to remove the CSS via `<webview>.removeInsertedCSS(key)`.
    *
    * Injects CSS into the current web page and returns a unique key for the inserted
    * stylesheet.
    */
  def insertCSS(css: String): js.Promise[String] = js.native
  
  /**
    * Inserts `text` to the focused element.
    */
  def insertText(text: String): js.Promise[Unit] = js.native
  
  /**
    * Starts inspecting element at position (`x`, `y`) of guest page.
    */
  def inspectElement(x: Double, y: Double): Unit = js.native
  
  /**
    * Opens the DevTools for the service worker context present in the guest page.
    */
  def inspectServiceWorker(): Unit = js.native
  
  /**
    * Opens the DevTools for the shared worker context present in the guest page.
    */
  def inspectSharedWorker(): Unit = js.native
  
  /**
    * Whether guest page has been muted.
    */
  def isAudioMuted(): Boolean = js.native
  
  /**
    * Whether the renderer process has crashed.
    */
  def isCrashed(): Boolean = js.native
  
  /**
    * Whether audio is currently playing.
    */
  def isCurrentlyAudible(): Boolean = js.native
  
  /**
    * Whether DevTools window of guest page is focused.
    */
  def isDevToolsFocused(): Boolean = js.native
  
  /**
    * Whether guest page has a DevTools window attached.
    */
  def isDevToolsOpened(): Boolean = js.native
  
  /**
    * Whether guest page is still loading resources.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Whether the main frame (and not just iframes or frames within it) is still
    * loading.
    */
  def isLoadingMainFrame(): Boolean = js.native
  
  /**
    * Whether the guest page is waiting for a first-response for the main resource of
    * the page.
    */
  def isWaitingForResponse(): Boolean = js.native
  
  /**
    * The promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Loads the `url` in the webview, the `url` must contain the protocol prefix, e.g.
    * the `http://` or `file://`.
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  def loadURL(url: String, options: LoadURLOptions): js.Promise[Unit] = js.native
  
  /**
    * A `boolean`. When this attribute is present the guest page in `webview` will
    * have node integration and can use node APIs like `require` and `process` to
    * access low level system resources. Node integration is disabled by default in
    * the guest page.
    */
  var nodeintegration: Boolean = js.native
  
  /**
    * A `boolean` for the experimental option for enabling NodeJS support in
    * sub-frames such as iframes inside the `webview`. All your preloads will load for
    * every iframe, you can use `process.isMainFrame` to determine if you are in the
    * main frame or not. This option is disabled by default in the guest page.
    */
  var nodeintegrationinsubframes: Boolean = js.native
  
  /**
    * Opens a DevTools window for guest page.
    */
  def openDevTools(): Unit = js.native
  
  /**
    * A `string` that sets the session used by the page. If `partition` starts with
    * `persist:`, the page will use a persistent session available to all pages in the
    * app with the same `partition`. if there is no `persist:` prefix, the page will
    * use an in-memory session. By assigning the same `partition`, multiple pages can
    * share the same session. If the `partition` is unset then default session of the
    * app will be used.
    *
    * This value can only be modified before the first navigation, since the session
    * of an active renderer process cannot change. Subsequent attempts to modify the
    * value will fail with a DOM exception.
    */
  var partition: String = js.native
  
  /**
    * Executes editing command `paste` in page.
    */
  def paste(): Unit = js.native
  
  /**
    * Executes editing command `pasteAndMatchStyle` in page.
    */
  def pasteAndMatchStyle(): Unit = js.native
  
  /**
    * A `boolean`. When this attribute is present the guest page in `webview` will be
    * able to use browser plugins. Plugins are disabled by default.
    */
  var plugins: Boolean = js.native
  
  /**
    * A `string` that specifies a script that will be loaded before other scripts run
    * in the guest page. The protocol of script's URL must be `file:` (even when using
    * `asar:` archives) because it will be loaded by Node's `require` under the hood,
    * which treats `asar:` archives as virtual directories.
    *
    * When the guest page doesn't have node integration this script will still have
    * access to all Node APIs, but global objects injected by Node will be deleted
    * after this script has finished executing.
    */
  var preload: String = js.native
  
  /**
    * Prints `webview`'s web page. Same as `webContents.print([options])`.
    */
  def print(): js.Promise[Unit] = js.native
  def print(options: WebviewTagPrintOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves with the generated PDF data.
    *
    * Prints `webview`'s web page as PDF, Same as `webContents.printToPDF(options)`.
    */
  def printToPDF(options: PrintToPDFOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Executes editing command `redo` in page.
    */
  def redo(): Unit = js.native
  
  /**
    * Reloads the guest page.
    */
  def reload(): Unit = js.native
  
  /**
    * Reloads the guest page and ignores cache.
    */
  def reloadIgnoringCache(): Unit = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didnavigateinpage")
  def removeEventListener(event: "did-navigate-in-page", listener: js.Function1[/* event */ DidNavigateInPageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devtoolsclosed")
  def removeEventListener(event: "devtools-closed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didstoploading")
  def removeEventListener(event: "did-stop-loading", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_newwindow")
  def removeEventListener(event: "new-window", listener: js.Function1[/* event */ NewWindowEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_consolemessage")
  def removeEventListener(event: "console-message", listener: js.Function1[/* event */ ConsoleMessageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didredirectnavigation")
  def removeEventListener(
    event: "did-redirect-navigation",
    listener: js.Function1[/* event */ DidRedirectNavigationEvent, Unit]
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_willnavigate")
  def removeEventListener(event: "will-navigate", listener: js.Function1[/* event */ WillNavigateEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didfinishload")
  def removeEventListener(event: "did-finish-load", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devtoolsopened")
  def removeEventListener(event: "devtools-opened", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_mediapaused")
  def removeEventListener(event: "media-paused", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_destroyed")
  def removeEventListener(event: "destroyed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devtoolsfocused")
  def removeEventListener(event: "devtools-focused", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didframenavigate")
  def removeEventListener(event: "did-frame-navigate", listener: js.Function1[/* event */ DidFrameNavigateEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pagefaviconupdated")
  def removeEventListener(event: "page-favicon-updated", listener: js.Function1[/* event */ PageFaviconUpdatedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_plugincrashed")
  def removeEventListener(event: "plugin-crashed", listener: js.Function1[/* event */ PluginCrashedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_loadcommit")
  def removeEventListener(event: "load-commit", listener: js.Function1[/* event */ LoadCommitEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_contextmenu")
  def removeEventListener(event: "context-menu", listener: js.Function1[/* event */ ContextMenuEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_mediastartedplaying")
  def removeEventListener(event: "media-started-playing", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_ipcmessage")
  def removeEventListener(event: "ipc-message", listener: js.Function1[/* event */ IpcMessageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didstartnavigation")
  def removeEventListener(event: "did-start-navigation", listener: js.Function1[/* event */ DidStartNavigationEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_leavehtmlfullscreen")
  def removeEventListener(event: "leave-html-full-screen", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didnavigate")
  def removeEventListener(event: "did-navigate", listener: js.Function1[/* event */ DidNavigateEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didstartloading")
  def removeEventListener(event: "did-start-loading", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_enterhtmlfullscreen")
  def removeEventListener(event: "enter-html-full-screen", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_updatetargeturl")
  def removeEventListener(event: "update-target-url", listener: js.Function1[/* event */ UpdateTargetUrlEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_domready")
  def removeEventListener(event: "dom-ready", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didframefinishload")
  def removeEventListener(event: "did-frame-finish-load", listener: js.Function1[/* event */ DidFrameFinishLoadEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didfailload")
  def removeEventListener(event: "did-fail-load", listener: js.Function1[/* event */ DidFailLoadEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_crashed")
  def removeEventListener(event: "crashed", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didchangethemecolor")
  def removeEventListener(
    event: "did-change-theme-color",
    listener: js.Function1[/* event */ DidChangeThemeColorEvent, Unit]
  ): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_didattach")
  def removeEventListener(event: "did-attach", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_foundinpage")
  def removeEventListener(event: "found-in-page", listener: js.Function1[/* event */ FoundInPageEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pagetitleupdated")
  def removeEventListener(event: "page-title-updated", listener: js.Function1[/* event */ PageTitleUpdatedEvent, Unit]): this.type = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_close")
  def removeEventListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * Resolves if the removal was successful.
    *
    * Removes the inserted CSS from the current web page. The stylesheet is identified
    * by its key, which is returned from `<webview>.insertCSS(css)`.
    */
  def removeInsertedCSS(key: String): js.Promise[Unit] = js.native
  
  /**
    * Executes editing command `replace` in page.
    */
  def replace(text: String): Unit = js.native
  
  /**
    * Executes editing command `replaceMisspelling` in page.
    */
  def replaceMisspelling(text: String): Unit = js.native
  
  /**
    * Executes editing command `selectAll` in page.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Send an asynchronous message to renderer process via `channel`, you can also
    * send arbitrary arguments. The renderer process can handle the message by
    * listening to the `channel` event with the `ipcRenderer` module.
    *
    * See webContents.send for examples.
    */
  def send(channel: String, args: Any*): js.Promise[Unit] = js.native
  
  def sendInputEvent(event: KeyboardInputEvent): js.Promise[Unit] = js.native
  /**
    * Sends an input `event` to the page.
    *
    * See webContents.sendInputEvent for detailed description of `event` object.
    */
  def sendInputEvent(event: MouseInputEvent): js.Promise[Unit] = js.native
  def sendInputEvent(event: MouseWheelInputEvent): js.Promise[Unit] = js.native
  
  /**
    * Send an asynchronous message to renderer process via `channel`, you can also
    * send arbitrary arguments. The renderer process can handle the message by
    * listening to the `channel` event with the `ipcRenderer` module.
    *
    * See webContents.sendToFrame for examples.
    */
  def sendToFrame(frameId: js.Tuple2[Double, Double], channel: String, args: Any*): js.Promise[Unit] = js.native
  
  /**
    * Set guest page muted.
    */
  def setAudioMuted(muted: Boolean): Unit = js.native
  
  /**
    * Overrides the user agent for the guest page.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  
  /**
    * Sets the maximum and minimum pinch-to-zoom level.
    */
  def setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): js.Promise[Unit] = js.native
  
  /**
    * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
    * divided by 100, so 300% = 3.0.
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
    * A `string` representing the visible URL. Writing to this attribute initiates
    * top-level navigation.
    *
    * Assigning `src` its own value will reload the current page.
    *
    * The `src` attribute can also accept data URLs, such as `data:text/plain,Hello,
    * world!`.
    */
  var src: String = js.native
  
  /**
    * Stops any pending navigation.
    */
  def stop(): Unit = js.native
  
  /**
    * Stops any `findInPage` request for the `webview` with the provided `action`.
    */
  @JSName("stopFindInPage")
  @scala.annotation.targetName("stopFindInPage_clearSelection_keepSelection_activateSelection")
  def stopFindInPage(action: "clearSelection" | "keepSelection" | "activateSelection"): Unit = js.native
  
  /**
    * Executes editing command `undo` in page.
    */
  def undo(): Unit = js.native
  
  /**
    * Executes editing command `unselect` in page.
    */
  def unselect(): Unit = js.native
  
  /**
    * A `string` that sets the user agent for the guest page before the page is
    * navigated to. Once the page is loaded, use the `setUserAgent` method to change
    * the user agent.
    */
  var useragent: String = js.native
  
  /**
    * A `string` which is a comma separated list of strings which specifies the web
    * preferences to be set on the webview. The full list of supported preference
    * strings can be found in BrowserWindow.
    *
    * The string follows the same format as the features string in `window.open`. A
    * name by itself is given a `true` boolean value. A preference can be set to
    * another value by including an `=`, followed by the value. Special values `yes`
    * and `1` are interpreted as `true`, while `no` and `0` are interpreted as
    * `false`.
    */
  var webpreferences: String = js.native
}
