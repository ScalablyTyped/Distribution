package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.BrowserInfo
import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.MessageSender
import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.OnRestartRequiredReason
import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.PlatformInfo
import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.Port
import typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs.WebExtensionManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofruntime extends js.Object {
  /** The ID of the extension/app. */
  val id: String = js.native
  /* runtime properties */
  /** This will be defined during an API method callback if there was an error */
  val lastError: js.UndefOr[Anon_MessageString] = js.native
  /**
    * Fired when an update for the browser is available, but isn't installed immediately because a browser restart is
    * required.
    * @deprecated Please use `runtime.onRestartRequired`.
    */
  val onBrowserUpdateAvailable: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  /** Fired when a connection is made from either an extension process or a content script. */
  val onConnect: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  /** Fired when a connection is made from another extension. */
  val onConnectExternal: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  /**
    * Fired when the extension is first installed, when the extension is updated to a new version, and when the
    * browser is updated to a new version.
    */
  val onInstalled: WebExtEvent[js.Function1[/* details */ Anon_IdPreviousVersion, Unit]] = js.native
  /**
    * Fired when a message is sent from either an extension process or a content script.
    *
    * Allowed in: Proxy scripts
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any
    *     JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may
    *     send a response. This function becomes invalid when the event listener returns, unless you return true from
    *     the event listener to indicate you wish to send a response asynchronously (this will keep the message
    *     channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener
    *     returns.
    */
  val onMessage: WebExtEvent[
    js.Function3[
      /* message */ _, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[_], Unit], 
      Boolean | js.Promise[_] | Unit
    ]
  ] = js.native
  /**
    * Fired when a message is sent from another extension/app. Cannot be used in a content script.
    * @param message The message sent by the calling script.
    * @param sendResponse Function to call (at most once) when you have a response. The argument should be any
    *     JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may
    *     send a response. This function becomes invalid when the event listener returns, unless you return true from
    *     the event listener to indicate you wish to send a response asynchronously (this will keep the message
    *     channel open to the other end until `sendResponse` is called).
    * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener
    *     returns.
    */
  val onMessageExternal: WebExtEvent[
    js.Function3[
      /* message */ _, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[_], Unit], 
      Boolean | js.Promise[_] | Unit
    ]
  ] = js.native
  /**
    * Fired when an app or the device that it runs on needs to be restarted. The app should close all its windows at
    * its earliest convenient time to let the restart to happen. If the app does nothing, a restart will be enforced
    * after a 24-hour grace period has passed. Currently, this event is only fired for Chrome OS kiosk apps.
    * @param reason The reason that the event is being dispatched.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRestartRequired: js.UndefOr[WebExtEvent[js.Function1[/* reason */ OnRestartRequiredReason, Unit]]] = js.native
  /* runtime events */
  /**
    * Fired when a profile that has this extension installed first starts up. This event is not fired for incognito
    * profiles.
    */
  val onStartup: WebExtEvent[js.Function0[Unit]] = js.native
  /**
    * Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up.
    * Note that since the page is unloading, any asynchronous operations started while handling this event are not
    * guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled
    * event will be sent and the page won't be unloaded.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onSuspend: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  /**
    * Sent after onSuspend to indicate that the app won't be unloaded after all.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onSuspendCanceled: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running. If you
    * do nothing, the update will be installed the next time the background page gets unloaded, if you want it to be
    * installed sooner you can explicitly call `runtime.reload`. If your extension is using a persistent background
    * page, the background page of course never gets unloaded, so unless you call `runtime.reload` manually in
    * response to this event the update will not get installed until the next time the browser itself restarts. If no
    * handlers are listening for this event, and your extension has a persistent background page, it behaves as if
    * `runtime.reload` is called in response to this event.
    * @param details The manifest details of the available update.
    */
  val onUpdateAvailable: WebExtEvent[js.Function1[/* details */ Anon_Version, Unit]] = js.native
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other
    * extensions/apps. This is useful for content scripts connecting to their extension processes, inter-app/extension
    * communication, and web messaging. Note that this does not connect to any listeners in a content script.
    * Extensions may connect to content scripts embedded in tabs via `tabs.connect`.
    * @param [extensionId] The ID of the extension or app to connect to. If omitted, a connection will be attempted
    *     with your own extension. Required if sending messages from a web page for web messaging.
    * @returns Port through which messages can be sent and received. The port's `runtime.Port onDisconnect` event is
    *     fired if the extension/app does not exist.
    */
  def connect(): Port = js.native
  def connect(extensionId: String): Port = js.native
  def connect(extensionId: String, connectInfo: Anon_IncludeTlsChannelId): Port = js.native
  /**
    * Connects to a native application in the host machine.
    * @param application The name of the registered application to connect to.
    * @returns Port through which messages can be sent and received with the application
    */
  def connectNative(application: String): Port = js.native
  /* runtime functions */
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app. If
    * the background page is an event page, the system will ensure it is loaded before calling the callback. If there
    * is no background page, an error is set.
    */
  def getBackgroundPage(): js.Promise[Window] = js.native
  /** Returns information about the current browser. */
  def getBrowserInfo(): js.Promise[BrowserInfo] = js.native
  /**
    * Returns details about the app or extension from the manifest. The object returned is a serialization of the full
    * manifest file.
    */
  def getManifest(): WebExtensionManifest = js.native
  /**
    * Returns a DirectoryEntry for the package directory.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getPackageDirectoryEntry(): js.Promise[js.Object] = js.native
  /** Returns information about the current platform. */
  def getPlatformInfo(): js.Promise[PlatformInfo] = js.native
  /**
    * Converts a relative path within an app/extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an app/extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  def getURL(path: String): String = js.native
  /**
    * Open your Extension's options page, if possible.
    *
    * The precise behavior may depend on your manifest's `options_ui` or `options_page` key, or what the browser
    * happens to support at the time.
    *
    * If your Extension does not declare an options page, or the browser failed to create one for some other reason,
    * the callback will set `lastError`.
    */
  def openOptionsPage(): js.Promise[Unit] = js.native
  /** Reloads the app or extension. */
  def reload(): Unit = js.native
  /**
    * Requests an update check for this app/extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  def requestUpdateCheck(): js.Promise[js.Object] = js.native
  /**
    * Restart the device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @deprecated Unsupported on Firefox at this time.
    */
  def restart(): Unit = js.native
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to
    * `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the
    * `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method. To send messages to content
    * scripts, use `tabs.sendMessage`.
    *
    * Allowed in: Proxy scripts
    * @param extensionId The ID of the extension/app to send the message to. If omitted, the message will be sent to
    *     your own extension/app. Required if sending messages from a web page for web messaging.
    */
  def sendMessage(extensionId: String, message: js.Any): js.Promise[_] = js.native
  def sendMessage(extensionId: String, message: js.Any, options: Anon_IncludeTlsChannelIdToProxyScript): js.Promise[_] = js.native
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app. Similar to
    * `runtime.connect` but only sends a single message, with an optional response. If sending to your extension, the
    * `runtime.onMessage` event will be fired in each page, or `runtime.onMessageExternal`, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method. To send messages to content
    * scripts, use `tabs.sendMessage`.
    *
    * Allowed in: Proxy scripts
    */
  def sendMessage(message: js.Any): js.Promise[_] = js.native
  def sendMessage(message: js.Any, options: Anon_IncludeTlsChannelIdToProxyScript): js.Promise[_] = js.native
  /**
    * Send a single message to a native application.
    * @param application The name of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    */
  def sendNativeMessage(application: String, message: js.Any): js.Promise[_] = js.native
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and
    * implement surveys. Maximum 255 characters.
    * @param [url] URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme.
    *     Set an empty string to not open a new tab upon uninstallation.
    */
  def setUninstallURL(): js.Promise[Unit] = js.native
  def setUninstallURL(url: String): js.Promise[Unit] = js.native
}

