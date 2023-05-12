package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifest
import typings.firefoxWebextBrowser.browser.runtime.BrowserInfo
import typings.firefoxWebextBrowser.browser.runtime.ConnectConnectInfo
import typings.firefoxWebextBrowser.browser.runtime.DirectoryEntry
import typings.firefoxWebextBrowser.browser.runtime.LastError
import typings.firefoxWebextBrowser.browser.runtime.MessageSender
import typings.firefoxWebextBrowser.browser.runtime.OnInstalledDetails
import typings.firefoxWebextBrowser.browser.runtime.OnRestartRequiredReason
import typings.firefoxWebextBrowser.browser.runtime.OnUpdateAvailableDetails
import typings.firefoxWebextBrowser.browser.runtime.PlatformInfo
import typings.firefoxWebextBrowser.browser.runtime.Port
import typings.firefoxWebextBrowser.browser.runtime.SendMessageOptions
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  */
object runtime {
  
  @JSGlobal("browser.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  inline def connect(): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Port]
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  inline def connect(connectInfo: ConnectConnectInfo): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectInfo.asInstanceOf[js.Any]).asInstanceOf[Port]
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging. Note that this does not connect to any listeners in a content script. Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @param extensionId The ID of the extension or app to connect to. If omitted, a connection will be attempted with your own extension. Required if sending messages from a web page for web messaging.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is fired if the extension/app does not exist.
    */
  inline def connect(extensionId: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String, connectInfo: ConnectConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  /**
    * Connects to a native application in the host machine.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the registered application to connect to.
    * @returns Port through which messages can be sent and received with the application
    */
  inline def connectNative(application: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNative")(application.asInstanceOf[js.Any]).asInstanceOf[Port]
  
  /* runtime functions */
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app. If the background page is an event page, the system will ensure it is loaded before calling the callback. If there is no background page, an error is set.
    */
  inline def getBackgroundPage(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")().asInstanceOf[js.Promise[Window]]
  
  /** Returns information about the current browser. */
  inline def getBrowserInfo(): js.Promise[BrowserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserInfo")().asInstanceOf[js.Promise[BrowserInfo]]
  
  /**
    * Get the frameId of any window global or frame element.
    * @param target A WindowProxy or a Browsing Context container element (IFrame, Frame, Embed, Object) for the target frame.
    * @returns The frameId of the target frame, or -1 if it doesn't exist.
    */
  inline def getFrameId(target: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameId")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns details about the app or extension from the manifest. The object returned is a serialization of the full manifest file.
    */
  inline def getManifest(): WebExtensionManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[WebExtensionManifest]
  
  /**
    * Returns a DirectoryEntry for the package directory.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def getPackageDirectoryEntry(): js.Promise[DirectoryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageDirectoryEntry")().asInstanceOf[js.Promise[DirectoryEntry]]
  
  /** Returns information about the current platform. */
  inline def getPlatformInfo(): js.Promise[PlatformInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformInfo")().asInstanceOf[js.Promise[PlatformInfo]]
  
  /**
    * Converts a relative path within an app/extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an app/extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** The ID of the extension/app. */
  @JSGlobal("browser.runtime.id")
  @js.native
  val id: String = js.native
  
  /* runtime properties */
  /** This will be defined during an API method callback if there was an error */
  @JSGlobal("browser.runtime.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  /**
    * Fired when an update for the browser is available, but isn't installed immediately because a browser restart is required.
    * @deprecated Please use `runtime.onRestartRequired`.
    */
  @JSGlobal("browser.runtime.onBrowserUpdateAvailable")
  @js.native
  val onBrowserUpdateAvailable: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  /** Fired when a connection is made from either an extension process or a content script. */
  @JSGlobal("browser.runtime.onConnect")
  @js.native
  val onConnect: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  /** Fired when a connection is made from another extension. */
  @JSGlobal("browser.runtime.onConnectExternal")
  @js.native
  val onConnectExternal: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  /**
    * Fired when the extension is first installed, when the extension is updated to a new version, and when the browser is updated to a new version.
    */
  @JSGlobal("browser.runtime.onInstalled")
  @js.native
  val onInstalled: WebExtEvent[js.Function1[/* details */ OnInstalledDetails, Unit]] = js.native
  
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may send a response. This function becomes invalid when the event listener returns, unless you return true from the event listener to indicate you wish to send a response asynchronously (this will keep the message channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener returns.
    */
  @JSGlobal("browser.runtime.onMessage")
  @js.native
  val onMessage: WebExtEvent[
    js.Function3[
      /* message */ Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
      Boolean | js.Promise[Any] | Unit
    ]
  ] = js.native
  
  /**
    * Fired when a message is sent from another extension/app. Cannot be used in a content script.
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may send a response. This function becomes invalid when the event listener returns, unless you return true from the event listener to indicate you wish to send a response asynchronously (this will keep the message channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener returns.
    */
  @JSGlobal("browser.runtime.onMessageExternal")
  @js.native
  val onMessageExternal: WebExtEvent[
    js.Function3[
      /* message */ Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
      Boolean | js.Promise[Any] | Unit
    ]
  ] = js.native
  
  /**
    * Fired when an app or the device that it runs on needs to be restarted. The app should close all its windows at its earliest convenient time to let the restart to happen. If the app does nothing, a restart will be enforced after a 24-hour grace period has passed. Currently, this event is only fired for Chrome OS kiosk apps.
    * @param reason The reason that the event is being dispatched.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.runtime.onRestartRequired")
  @js.native
  val onRestartRequired: js.UndefOr[WebExtEvent[js.Function1[/* reason */ OnRestartRequiredReason, Unit]]] = js.native
  
  /* runtime events */
  /**
    * Fired when a profile that has this extension installed first starts up. This event is not fired for incognito profiles.
    */
  @JSGlobal("browser.runtime.onStartup")
  @js.native
  val onStartup: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded.
    */
  @JSGlobal("browser.runtime.onSuspend")
  @js.native
  val onSuspend: WebExtEvent[js.Function0[Unit]] = js.native
  
  /** Sent after onSuspend to indicate that the app won't be unloaded after all. */
  @JSGlobal("browser.runtime.onSuspendCanceled")
  @js.native
  val onSuspendCanceled: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running. If you do nothing, the update will be installed the next time the background page gets unloaded, if you want it to be installed sooner you can explicitly call `runtime.reload`. If your extension is using a persistent background page, the background page of course never gets unloaded, so unless you call `runtime.reload` manually in response to this event the update will not get installed until the next time the browser itself restarts. If no handlers are listening for this event, and your extension has a persistent background page, it behaves as if `runtime.reload` is called in response to this event.
    * @param details The manifest details of the available update.
    */
  @JSGlobal("browser.runtime.onUpdateAvailable")
  @js.native
  val onUpdateAvailable: WebExtEvent[js.Function1[/* details */ OnUpdateAvailableDetails, Unit]] = js.native
  
  /**
    * Open your Extension's options page, if possible.
    *
    * The precise behavior may depend on your manifest's `options_ui` or `options_page` key, or what the browser happens to support at the time.
    *
    * If your Extension does not declare an options page, or the browser failed to create one for some other reason, the callback will set `lastError`.
    */
  inline def openOptionsPage(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openOptionsPage")().asInstanceOf[js.Promise[Unit]]
  
  /** Reloads the app or extension. */
  inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
  
  /**
    * Requests an update check for this app/extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def requestUpdateCheck(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateCheck")().asInstanceOf[js.Promise[js.Object]]
  
  /**
    * Restart the device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension. Note that extensions cannot send messages to content scripts using this method. To send messages to content scripts, use `tabs.sendMessage`.
    * @param extensionId The ID of the extension/app to send the message to. If omitted, the message will be sent to your own extension/app. Required if sending messages from a web page for web messaging.
    */
  inline def sendMessage(extensionId: String, message: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(extensionId: String, message: Any, options: SendMessageOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension. Note that extensions cannot send messages to content scripts using this method. To send messages to content scripts, use `tabs.sendMessage`.
    */
  inline def sendMessage(message: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(message: Any, options: SendMessageOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Send a single message to a native application.
    *
    * Not allowed in: Devtools pages
    * @param application The name of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    */
  inline def sendNativeMessage(application: String, message: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @param [url] URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    */
  inline def setUninstallURL(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")().asInstanceOf[js.Promise[Unit]]
  inline def setUninstallURL(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
