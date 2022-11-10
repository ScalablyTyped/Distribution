package typings.electron.Electron

import typings.electron.electronStrings.`accessibility-support-changed`
import typings.electron.electronStrings.`activity-was-continued`
import typings.electron.electronStrings.`before-quit`
import typings.electron.electronStrings.`browser-window-blur`
import typings.electron.electronStrings.`browser-window-created`
import typings.electron.electronStrings.`browser-window-focus`
import typings.electron.electronStrings.`certificate-error`
import typings.electron.electronStrings.`child-process-gone`
import typings.electron.electronStrings.`continue-activity-error`
import typings.electron.electronStrings.`continue-activity`
import typings.electron.electronStrings.`did-become-active`
import typings.electron.electronStrings.`gpu-info-update`
import typings.electron.electronStrings.`gpu-process-crashed`
import typings.electron.electronStrings.`new-window-for-tab`
import typings.electron.electronStrings.`open-file`
import typings.electron.electronStrings.`open-url`
import typings.electron.electronStrings.`render-process-gone`
import typings.electron.electronStrings.`renderer-process-crashed`
import typings.electron.electronStrings.`second-instance`
import typings.electron.electronStrings.`select-client-certificate`
import typings.electron.electronStrings.`session-created`
import typings.electron.electronStrings.`update-activity-state`
import typings.electron.electronStrings.`web-contents-created`
import typings.electron.electronStrings.`will-continue-activity`
import typings.electron.electronStrings.`will-finish-launching`
import typings.electron.electronStrings.`will-quit`
import typings.electron.electronStrings.`window-all-closed`
import typings.electron.electronStrings.accessory
import typings.electron.electronStrings.activate
import typings.electron.electronStrings.appData
import typings.electron.electronStrings.basic
import typings.electron.electronStrings.complete
import typings.electron.electronStrings.crashDumps
import typings.electron.electronStrings.customCategoryAccessDeniedError
import typings.electron.electronStrings.desktop
import typings.electron.electronStrings.documents
import typings.electron.electronStrings.downloads
import typings.electron.electronStrings.error
import typings.electron.electronStrings.exe
import typings.electron.electronStrings.fileTypeRegistrationError
import typings.electron.electronStrings.home
import typings.electron.electronStrings.invalidSeparatorError
import typings.electron.electronStrings.login
import typings.electron.electronStrings.logs
import typings.electron.electronStrings.module
import typings.electron.electronStrings.music
import typings.electron.electronStrings.ok
import typings.electron.electronStrings.pictures
import typings.electron.electronStrings.prohibited
import typings.electron.electronStrings.quit
import typings.electron.electronStrings.ready
import typings.electron.electronStrings.recent
import typings.electron.electronStrings.regular
import typings.electron.electronStrings.sessionData
import typings.electron.electronStrings.temp
import typings.electron.electronStrings.userData
import typings.electron.electronStrings.videos
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App
  extends StObject
     with EventEmitter {
  
  /**
    * A `boolean` property that's `true` if Chrome's accessibility support is enabled,
    * `false` otherwise. This property will be `true` if the use of assistive
    * technologies, such as screen readers, has been detected. Setting this property
    * to `true` manually enables Chrome's accessibility support, allowing developers
    * to expose accessibility switch to users in application settings.
    *
    * See Chromium's accessibility docs for more details. Disabled by default.
    *
    * This API must be called after the `ready` event is emitted.
    *
    * **Note:** Rendering accessibility tree can significantly affect the performance
    * of your app. It should not be enabled by default.
    *
    * @platform darwin,win32
    */
  var accessibilitySupportEnabled: Boolean = js.native
  
  @JSName("addListener")
  def addListener_accessibilitysupportchanged(
    event: `accessibility-support-changed`,
    listener: js.Function2[/* event */ Event, /* accessibilitySupportEnabled */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_activate(event: activate, listener: js.Function2[/* event */ Event, /* hasVisibleWindows */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_activitywascontinued(
    event: `activity-was-continued`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_beforequit(event: `before-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_browserwindowblur(
    event: `browser-window-blur`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_browserwindowcreated(
    event: `browser-window-created`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_browserwindowfocus(
    event: `browser-window-focus`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_certificateerror(
    event: `certificate-error`,
    listener: js.Function7[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_childprocessgone(
    event: `child-process-gone`,
    listener: js.Function2[/* event */ Event, /* details */ Details, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_continueactivity(
    event: `continue-activity`,
    listener: js.Function4[
      /* event */ Event, 
      /* type */ String, 
      /* userInfo */ Any, 
      /* details */ ContinueActivityDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_didbecomeactive(event: `did-become-active`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_gpuinfoupdate(event: `gpu-info-update`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_gpuprocesscrashed(
    event: `gpu-process-crashed`,
    listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_login(
    event: login,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_openfile(event: `open-file`, listener: js.Function2[/* event */ Event, /* path */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_openurl(event: `open-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_quit(event: quit, listener: js.Function2[/* event */ Event, /* exitCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ready(
    event: ready,
    listener: js.Function2[
      /* event */ Event, 
      /* launchInfo */ (Record[String, Any]) | NotificationResponse, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents_, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_renderprocessgone(
    event: `render-process-gone`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* details */ RenderProcessGoneDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secondinstance(
    event: `second-instance`,
    listener: js.Function4[
      /* event */ Event, 
      /* argv */ js.Array[String], 
      /* workingDirectory */ String, 
      /* additionalData */ Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session_, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willcontinueactivity(
    event: `will-continue-activity`,
    listener: js.Function2[/* event */ Event, /* type */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willfinishlaunching(event: `will-finish-launching`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_willquit(event: `will-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_windowallclosed(event: `window-all-closed`, listener: js.Function): this.type = js.native
  
  /**
    * Adds `path` to the recent documents list.
    *
    * This list is managed by the OS. On Windows, you can visit the list from the task
    * bar, and on macOS, you can visit it from dock menu.
    *
    * @platform darwin,win32
    */
  def addRecentDocument(path: String): Unit = js.native
  
  /**
    * A `Menu | null` property that returns `Menu` if one has been set and `null`
    * otherwise. Users can pass a Menu to set this property.
    */
  var applicationMenu: Menu | Null = js.native
  
  /**
    * An `Integer` property that returns the badge count for current app. Setting the
    * count to `0` will hide the badge.
    *
    * On macOS, setting this with any nonzero integer shows on the dock icon. On
    * Linux, this property only works for Unity launcher.
    *
    * **Note:** Unity launcher requires a `.desktop` file to work. For more
    * information, please read the Unity integration documentation.
    *
    * **Note:** On macOS, you need to ensure that your application has the permission
    * to display notifications for this property to take effect.
    *
    * @platform linux,darwin
    */
  var badgeCount: Double = js.native
  
  /**
    * Clears the recent documents list.
    *
    * @platform darwin,win32
    */
  def clearRecentDocuments(): Unit = js.native
  
  /**
    * A `CommandLine` object that allows you to read and manipulate the command line
    * arguments that Chromium uses.
    *
    */
  val commandLine: CommandLine = js.native
  
  /**
    * Configures host resolution (DNS and DNS-over-HTTPS). By default, the following
    * resolvers will be used, in order:
    *
    * * DNS-over-HTTPS, if the DNS provider supports it, then
    * * the built-in resolver (enabled on macOS only by default), then
    * * the system's resolver (e.g. `getaddrinfo`).
    *
    * This can be configured to either restrict usage of non-encrypted DNS
    * (`secureDnsMode: "secure"`), or disable DNS-over-HTTPS (`secureDnsMode: "off"`).
    * It is also possible to enable or disable the built-in resolver.
    *
    * To disable insecure DNS, you can specify a `secureDnsMode` of `"secure"`. If you
    * do so, you should make sure to provide a list of DNS-over-HTTPS servers to use,
    * in case the user's DNS configuration does not include a provider that supports
    * DoH.
    *
    * This API must be called after the `ready` event is emitted.
    */
  def configureHostResolver(options: ConfigureHostResolverOptions): Unit = js.native
  
  /**
    * By default, Chromium disables 3D APIs (e.g. WebGL) until restart on a per domain
    * basis if the GPU processes crashes too frequently. This function disables that
    * behavior.
    *
    * This method can only be called before app is ready.
    */
  def disableDomainBlockingFor3DAPIs(): Unit = js.native
  
  /**
    * Disables hardware acceleration for current app.
    *
    * This method can only be called before app is ready.
    */
  def disableHardwareAcceleration(): Unit = js.native
  
  /**
    * A `Dock` `| undefined` object that allows you to perform actions on your app
    * icon in the user's dock on macOS.
    *
    * @platform darwin
    */
  val dock: Dock = js.native
  
  /**
    * Enables full sandbox mode on the app. This means that all renderers will be
    * launched sandboxed, regardless of the value of the `sandbox` flag in
    * WebPreferences.
    *
    * This method can only be called before app is ready.
    */
  def enableSandbox(): Unit = js.native
  
  /**
    * Exits immediately with `exitCode`. `exitCode` defaults to 0.
    *
    * All windows will be closed immediately without asking the user, and the
    * `before-quit` and `will-quit` events will not be emitted.
    */
  def exit(): Unit = js.native
  def exit(exitCode: Double): Unit = js.native
  
  /**
    * On Linux, focuses on the first visible window. On macOS, makes the application
    * the active app. On Windows, focuses on the application's first window.
    *
    * You should seek to use the `steal` option as sparingly as possible.
    */
  def focus(): Unit = js.native
  def focus(options: FocusOptions): Unit = js.native
  
  /**
    * Array of `ProcessMetric` objects that correspond to memory and CPU usage
    * statistics of all the processes associated with the app.
    */
  def getAppMetrics(): js.Array[ProcessMetric] = js.native
  
  /**
    * The current application directory.
    */
  def getAppPath(): String = js.native
  
  /**
    * Resolve with an object containing the following:
    *
    * * `icon` NativeImage - the display icon of the app handling the protocol.
    * * `path` string  - installation path of the app handling the protocol.
    * * `name` string - display name of the app handling the protocol.
    *
    * This method returns a promise that contains the application name, icon and path
    * of the default handler for the protocol (aka URI scheme) of a URL.
    *
    * @platform darwin,win32
    */
  def getApplicationInfoForProtocol(url: String): js.Promise[ApplicationInfoForProtocolReturnValue] = js.native
  
  /**
    * Name of the application handling the protocol, or an empty string if there is no
    * handler. For instance, if Electron is the default handler of the URL, this could
    * be `Electron` on Windows and Mac. However, don't rely on the precise format
    * which is not guaranteed to remain unchanged. Expect a different format on Linux,
    * possibly with a `.desktop` suffix.
    *
    * This method returns the application name of the default handler for the protocol
    * (aka URI scheme) of a URL.
    */
  def getApplicationNameForProtocol(url: String): String = js.native
  
  /**
    * The current value displayed in the counter badge.
    *
    * @platform linux,darwin
    */
  def getBadgeCount(): Double = js.native
  
  /**
    * The type of the currently running activity.
    *
    * @platform darwin
    */
  def getCurrentActivityType(): String = js.native
  
  /**
    * fulfilled with the app's icon, which is a NativeImage.
    *
    * Fetches a path's associated icon.
    *
    * On _Windows_, there a 2 kinds of icons:
    *
    * * Icons associated with certain file extensions, like `.mp3`, `.png`, etc.
    * * Icons inside the file itself, like `.exe`, `.dll`, `.ico`.
    *
    * On _Linux_ and _macOS_, icons depend on the application associated with file
    * mime type.
    */
  def getFileIcon(path: String): js.Promise[NativeImage_] = js.native
  def getFileIcon(path: String, options: FileIconOptions): js.Promise[NativeImage_] = js.native
  
  /**
    * The Graphics Feature Status from `chrome://gpu/`.
    *
    * **Note:** This information is only usable after the `gpu-info-update` event is
    * emitted.
    */
  def getGPUFeatureStatus(): GPUFeatureStatus = js.native
  
  /**
    * For `infoType` equal to `complete`: Promise is fulfilled with `Object`
    * containing all the GPU Information as in chromium's GPUInfo object. This
    * includes the version and driver information that's shown on `chrome://gpu` page.
    *
    * For `infoType` equal to `basic`: Promise is fulfilled with `Object` containing
    * fewer attributes than when requested with `complete`. Here's an example of basic
    * response:
    *
    * Using `basic` should be preferred if only basic information like `vendorId` or
    * `deviceId` is needed.
    */
  def getGPUInfo(infoType: basic | complete): js.Promise[Any] = js.native
  
  /**
    * * `minItems` Integer - The minimum number of items that will be shown in the
    * Jump List (for a more detailed description of this value see the MSDN docs).
    * * `removedItems` JumpListItem[] - Array of `JumpListItem` objects that
    * correspond to items that the user has explicitly removed from custom categories
    * in the Jump List. These items must not be re-added to the Jump List in the
    * **next** call to `app.setJumpList()`, Windows will not display any custom
    * category that contains any of the removed items.
    *
    * @platform win32
    */
  def getJumpListSettings(): JumpListSettings = js.native
  
  /**
    * The current application locale, fetched using Chromium's `l10n_util` library.
    * Possible return values are documented here.
    *
    * To set the locale, you'll want to use a command line switch at app startup,
    * which may be found here.
    *
    * **Note:** When distributing your packaged app, you have to also ship the
    * `locales` folder.
    *
    * **Note:** This API must be called after the `ready` event is emitted.
    */
  def getLocale(): String = js.native
  
  /**
    * User operating system's locale two-letter ISO 3166 country code. The value is
    * taken from native OS APIs.
    *
    * **Note:** When unable to detect locale country code, it returns empty string.
    */
  def getLocaleCountryCode(): String = js.native
  
  /**
    * If you provided `path` and `args` options to `app.setLoginItemSettings`, then
    * you need to pass the same arguments here for `openAtLogin` to be set correctly.
    *
    *
    * * `openAtLogin` boolean - `true` if the app is set to open at login.
    * * `openAsHidden` boolean _macOS_ - `true` if the app is set to open as hidden at
    * login. This setting is not available on MAS builds.
    * * `wasOpenedAtLogin` boolean _macOS_ - `true` if the app was opened at login
    * automatically. This setting is not available on MAS builds.
    * * `wasOpenedAsHidden` boolean _macOS_ - `true` if the app was opened as a hidden
    * login item. This indicates that the app should not open any windows at startup.
    * This setting is not available on MAS builds.
    * * `restoreState` boolean _macOS_ - `true` if the app was opened as a login item
    * that should restore the state from the previous session. This indicates that the
    * app should restore the windows that were open the last time the app was closed.
    * This setting is not available on MAS builds.
    * * `executableWillLaunchAtLogin` boolean _Windows_ - `true` if app is set to open
    * at login and its run key is not deactivated. This differs from `openAtLogin` as
    * it ignores the `args` option, this property will be true if the given executable
    * would be launched at login with **any** arguments.
    * * `launchItems` Object[] _Windows_
    *   * `name` string _Windows_ - name value of a registry entry.
    *   * `path` string _Windows_ - The executable to an app that corresponds to a
    * registry entry.
    *   * `args` string[] _Windows_ - the command-line arguments to pass to the
    * executable.
    *   * `scope` string _Windows_ - one of `user` or `machine`. Indicates whether the
    * registry entry is under `HKEY_CURRENT USER` or `HKEY_LOCAL_MACHINE`.
    *   * `enabled` boolean _Windows_ - `true` if the app registry key is startup
    * approved and therefore shows as `enabled` in Task Manager and Windows settings.
    *
    * @platform darwin,win32
    */
  def getLoginItemSettings(): LoginItemSettings = js.native
  def getLoginItemSettings(options: LoginItemSettingsOptions): LoginItemSettings = js.native
  
  /**
    * The current application's name, which is the name in the application's
    * `package.json` file.
    *
    * Usually the `name` field of `package.json` is a short lowercase name, according
    * to the npm modules spec. You should usually also specify a `productName` field,
    * which is your application's full capitalized name, and which will be preferred
    * over `name` by Electron.
    */
  def getName(): String = js.native
  
  /**
    * A path to a special directory or file associated with `name`. On failure, an
    * `Error` is thrown.
    *
    * If `app.getPath('logs')` is called without called `app.setAppLogsPath()` being
    * called first, a default log directory will be created equivalent to calling
    * `app.setAppLogsPath()` without a `path` parameter.
    */
  def getPath(
    name: home | appData | userData | sessionData | temp | exe | module | desktop | documents | downloads | music | pictures | videos | recent | logs | crashDumps
  ): String = js.native
  
  /**
    * The current system locale. On Windows and Linux, it is fetched using Chromium's
    * `i18n` library. On macOS, the `NSLocale` object is used instead.
    *
    * **Note:** This API must be called after the `ready` event is emitted.
    */
  def getSystemLocale(): String = js.native
  
  /**
    * The version of the loaded application. If no version is found in the
    * application's `package.json` file, the version of the current bundle or
    * executable is returned.
    */
  def getVersion(): String = js.native
  
  /**
    * This method returns whether or not this instance of your app is currently
    * holding the single instance lock.  You can request the lock with
    * `app.requestSingleInstanceLock()` and release with
    * `app.releaseSingleInstanceLock()`
    */
  def hasSingleInstanceLock(): Boolean = js.native
  
  /**
    * Hides all application windows without minimizing them.
    *
    * @platform darwin
    */
  def hide(): Unit = js.native
  
  /**
    * Imports the certificate in pkcs12 format into the platform certificate store.
    * `callback` is called with the `result` of import operation, a value of `0`
    * indicates success while any other value indicates failure according to Chromium
    * net_error_list.
    *
    * @platform linux
    */
  def importCertificate(options: ImportCertificateOptions, callback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  
  /**
    * Invalidates the current Handoff user activity.
    *
    * @platform darwin
    */
  def invalidateCurrentActivity(): Unit = js.native
  
  /**
    * `true` if Chrome's accessibility support is enabled, `false` otherwise. This API
    * will return `true` if the use of assistive technologies, such as screen readers,
    * has been detected. See
    * https://www.chromium.org/developers/design-documents/accessibility for more
    * details.
    *
    * @platform darwin,win32
    */
  def isAccessibilitySupportEnabled(): Boolean = js.native
  
  /**
    * Whether the current executable is the default handler for a protocol (aka URI
    * scheme).
    *
    * **Note:** On macOS, you can use this method to check if the app has been
    * registered as the default protocol handler for a protocol. You can also verify
    * this by checking `~/Library/Preferences/com.apple.LaunchServices.plist` on the
    * macOS machine. Please refer to Apple's documentation for details.
    *
    * The API uses the Windows Registry and `LSCopyDefaultHandlerForURLScheme`
    * internally.
    */
  def isDefaultProtocolClient(protocol: String): Boolean = js.native
  def isDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def isDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
  def isDefaultProtocolClient(protocol: String, path: Unit, args: js.Array[String]): Boolean = js.native
  
  /**
    * whether or not the current OS version allows for native emoji pickers.
    */
  def isEmojiPanelSupported(): Boolean = js.native
  
  /**
    * `true` if the application—including all of its windows—is hidden (e.g. with
    * `Command-H`), `false` otherwise.
    *
    * @platform darwin
    */
  def isHidden(): Boolean = js.native
  
  /**
    * Whether the application is currently running from the systems Application
    * folder. Use in combination with `app.moveToApplicationsFolder()`
    *
    * @platform darwin
    */
  def isInApplicationsFolder(): Boolean = js.native
  
  /**
    * A `boolean` property that returns  `true` if the app is packaged, `false`
    * otherwise. For many apps, this property can be used to distinguish development
    * and production environments.
    *
    */
  val isPackaged: Boolean = js.native
  
  /**
    * `true` if Electron has finished initializing, `false` otherwise. See also
    * `app.whenReady()`.
    */
  def isReady(): Boolean = js.native
  
  /**
    * whether `Secure Keyboard Entry` is enabled.
    *
    * By default this API will return `false`.
    *
    * @platform darwin
    */
  def isSecureKeyboardEntryEnabled(): Boolean = js.native
  
  /**
    * Whether the current desktop environment is Unity launcher.
    *
    * @platform linux
    */
  def isUnityRunning(): Boolean = js.native
  
  /**
    * Whether the move was successful. Please note that if the move is successful,
    * your application will quit and relaunch.
    *
    * No confirmation dialog will be presented by default. If you wish to allow the
    * user to confirm the operation, you may do so using the `dialog` API.
    *
    * **NOTE:** This method throws errors if anything other than the user causes the
    * move to fail. For instance if the user cancels the authorization dialog, this
    * method returns false. If we fail to perform the copy, then this method will
    * throw an error. The message in the error should be informative and tell you
    * exactly what went wrong.
    *
    * By default, if an app of the same name as the one being moved exists in the
    * Applications directory and is _not_ running, the existing app will be trashed
    * and the active app moved into its place. If it _is_ running, the preexisting
    * running app will assume focus and the previously active app will quit itself.
    * This behavior can be changed by providing the optional conflict handler, where
    * the boolean returned by the handler determines whether or not the move conflict
    * is resolved with default behavior.  i.e. returning `false` will ensure no
    * further action is taken, returning `true` will result in the default behavior
    * and the method continuing.
    *
    * For example:
    *
    * Would mean that if an app already exists in the user directory, if the user
    * chooses to 'Continue Move' then the function would continue with its default
    * behavior and the existing app will be trashed and the active app moved into its
    * place.
    *
    * @platform darwin
    */
  def moveToApplicationsFolder(): Boolean = js.native
  def moveToApplicationsFolder(options: MoveToApplicationsFolderOptions): Boolean = js.native
  
  /**
    * A `string` property that indicates the current application's name, which is the
    * name in the application's `package.json` file.
    *
    * Usually the `name` field of `package.json` is a short lowercase name, according
    * to the npm modules spec. You should usually also specify a `productName` field,
    * which is your application's full capitalized name, and which will be preferred
    * over `name` by Electron.
    */
  var name: String = js.native
  
  // Docs: https://electronjs.org/docs/api/app
  /**
    * Emitted when Chrome's accessibility support changes. This event fires when
    * assistive technologies, such as screen readers, are enabled or disabled. See
    * https://www.chromium.org/developers/design-documents/accessibility for more
    * details.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_accessibilitysupportchanged(
    event: `accessibility-support-changed`,
    listener: js.Function2[/* event */ Event, /* accessibilitySupportEnabled */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when the application is activated. Various actions can trigger this
    * event, such as launching the application for the first time, attempting to
    * re-launch the application when it's already running, or clicking on the
    * application's dock or taskbar icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_activate(event: activate, listener: js.Function2[/* event */ Event, /* hasVisibleWindows */ Boolean, Unit]): this.type = js.native
  /**
    * Emitted during Handoff after an activity from this device was successfully
    * resumed on another one.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_activitywascontinued(
    event: `activity-was-continued`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  /**
    * Emitted before the application starts closing its windows. Calling
    * `event.preventDefault()` will prevent the default behavior, which is terminating
    * the application.
    *
    * **Note:** If application quit was initiated by `autoUpdater.quitAndInstall()`,
    * then `before-quit` is emitted *after* emitting `close` event on all windows and
    * closing them.
    *
    * **Note:** On Windows, this event will not be emitted if the app is closed due to
    * a shutdown/restart of the system or a user logout.
    */
  @JSName("on")
  def on_beforequit(event: `before-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when a browserWindow gets blurred.
    */
  @JSName("on")
  def on_browserwindowblur(
    event: `browser-window-blur`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  /**
    * Emitted when a new browserWindow is created.
    */
  @JSName("on")
  def on_browserwindowcreated(
    event: `browser-window-created`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  /**
    * Emitted when a browserWindow gets focused.
    */
  @JSName("on")
  def on_browserwindowfocus(
    event: `browser-window-focus`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  /**
    * Emitted when failed to verify the `certificate` for `url`, to trust the
    * certificate you should prevent the default behavior with
    * `event.preventDefault()` and call `callback(true)`.
    */
  @JSName("on")
  def on_certificateerror(
    event: `certificate-error`,
    listener: js.Function7[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the child process unexpectedly disappears. This is normally because
    * it was crashed or killed. It does not include renderer processes.
    */
  @JSName("on")
  def on_childprocessgone(
    event: `child-process-gone`,
    listener: js.Function2[/* event */ Event, /* details */ Details, Unit]
  ): this.type = js.native
  /**
    * Emitted during Handoff when an activity from a different device wants to be
    * resumed. You should call `event.preventDefault()` if you want to handle this
    * event.
    *
    * A user activity can be continued only in an app that has the same developer Team
    * ID as the activity's source app and that supports the activity's type. Supported
    * activity types are specified in the app's `Info.plist` under the
    * `NSUserActivityTypes` key.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_continueactivity(
    event: `continue-activity`,
    listener: js.Function4[
      /* event */ Event, 
      /* type */ String, 
      /* userInfo */ Any, 
      /* details */ ContinueActivityDetails, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted during Handoff when an activity from a different device fails to be
    * resumed.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when mac application become active. Difference from `activate` event is
    * that `did-become-active` is emitted every time the app becomes active, not only
    * when Dock icon is clicked or application is re-launched.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_didbecomeactive(event: `did-become-active`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted whenever there is a GPU info update.
    */
  @JSName("on")
  def on_gpuinfoupdate(event: `gpu-info-update`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the GPU process crashes or is killed.
    *
    * **Deprecated:** This event is superceded by the `child-process-gone` event which
    * contains more information about why the child process disappeared. It isn't
    * always because it crashed. The `killed` boolean can be replaced by checking
    * `reason === 'killed'` when you switch to that event.
    *
    * @deprecated
    */
  @JSName("on")
  def on_gpuprocesscrashed(
    event: `gpu-process-crashed`,
    listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when `webContents` wants to do basic auth.
    *
    * The default behavior is to cancel all authentications. To override this you
    * should prevent the default behavior with `event.preventDefault()` and call
    * `callback(username, password)` with the credentials.
    *
    * If `callback` is called without a username or password, the authentication
    * request will be cancelled and the authentication error will be returned to the
    * page.
    */
  @JSName("on")
  def on_login(
    event: login,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the user clicks the native macOS new tab button. The new tab button
    * is only visible if the current `BrowserWindow` has a `tabbingIdentifier`
    *
    * @platform darwin
    */
  @JSName("on")
  def on_newwindowfortab(event: `new-window-for-tab`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the user wants to open a file with the application. The `open-file`
    * event is usually emitted when the application is already open and the OS wants
    * to reuse the application to open the file. `open-file` is also emitted when a
    * file is dropped onto the dock and the application is not yet running. Make sure
    * to listen for the `open-file` event very early in your application startup to
    * handle this case (even before the `ready` event is emitted).
    *
    * You should call `event.preventDefault()` if you want to handle this event.
    *
    * On Windows, you have to parse `process.argv` (in the main process) to get the
    * filepath.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_openfile(event: `open-file`, listener: js.Function2[/* event */ Event, /* path */ String, Unit]): this.type = js.native
  /**
    * Emitted when the user wants to open a URL with the application. Your
    * application's `Info.plist` file must define the URL scheme within the
    * `CFBundleURLTypes` key, and set `NSPrincipalClass` to `AtomApplication`.
    *
    * You should call `event.preventDefault()` if you want to handle this event.
    *
    * As with the `open-file` event, be sure to register a listener for the `open-url`
    * event early in your application startup to detect if the the application being
    * is being opened to handle a URL. If you register the listener in response to a
    * `ready` event, you'll miss URLs that trigger the launch of your application.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_openurl(event: `open-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when the application is quitting.
    *
    * **Note:** On Windows, this event will not be emitted if the app is closed due to
    * a shutdown/restart of the system or a user logout.
    */
  @JSName("on")
  def on_quit(event: quit, listener: js.Function2[/* event */ Event, /* exitCode */ Double, Unit]): this.type = js.native
  /**
    * Emitted once, when Electron has finished initializing. On macOS, `launchInfo`
    * holds the `userInfo` of the `NSUserNotification` or information from
    * `UNNotificationResponse` that was used to open the application, if it was
    * launched from Notification Center. You can also call `app.isReady()` to check if
    * this event has already fired and `app.whenReady()` to get a Promise that is
    * fulfilled when Electron is initialized.
    */
  @JSName("on")
  def on_ready(
    event: ready,
    listener: js.Function2[
      /* event */ Event, 
      /* launchInfo */ (Record[String, Any]) | NotificationResponse, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the renderer process of `webContents` crashes or is killed.
    *
    * **Deprecated:** This event is superceded by the `render-process-gone` event
    * which contains more information about why the render process disappeared. It
    * isn't always because it crashed.  The `killed` boolean can be replaced by
    * checking `reason === 'killed'` when you switch to that event.
    *
    * @deprecated
    */
  @JSName("on")
  def on_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents_, /* killed */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process unexpectedly disappears.  This is normally
    * because it was crashed or killed.
    */
  @JSName("on")
  def on_renderprocessgone(
    event: `render-process-gone`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* details */ RenderProcessGoneDetails, 
      Unit
    ]
  ): this.type = js.native
  /**
    * This event will be emitted inside the primary instance of your application when
    * a second instance has been executed and calls `app.requestSingleInstanceLock()`.
    *
    * `argv` is an Array of the second instance's command line arguments, and
    * `workingDirectory` is its current working directory. Usually applications
    * respond to this by making their primary window focused and non-minimized.
    *
    * **Note:** If the second instance is started by a different user than the first,
    * the `argv` array will not include the arguments.
    *
    * This event is guaranteed to be emitted after the `ready` event of `app` gets
    * emitted.
    *
    * **Note:** Extra command line arguments might be added by Chromium, such as
    * `--original-process-start-time`.
    */
  @JSName("on")
  def on_secondinstance(
    event: `second-instance`,
    listener: js.Function4[
      /* event */ Event, 
      /* argv */ js.Array[String], 
      /* workingDirectory */ String, 
      /* additionalData */ Any, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a client certificate is requested.
    *
    * The `url` corresponds to the navigation entry requesting the client certificate
    * and `callback` can be called with an entry filtered from the list. Using
    * `event.preventDefault()` prevents the application from using the first
    * certificate from the store.
    */
  @JSName("on")
  def on_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when Electron has created a new `session`.
    */
  @JSName("on")
  def on_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session_, Unit]): this.type = js.native
  /**
    * Emitted when Handoff is about to be resumed on another device. If you need to
    * update the state to be transferred, you should call `event.preventDefault()`
    * immediately, construct a new `userInfo` dictionary and call
    * `app.updateCurrentActivity()` in a timely manner. Otherwise, the operation will
    * fail and `continue-activity-error` will be called.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when a new webContents is created.
    */
  @JSName("on")
  def on_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  /**
    * Emitted during Handoff before an activity from a different device wants to be
    * resumed. You should call `event.preventDefault()` if you want to handle this
    * event.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_willcontinueactivity(
    event: `will-continue-activity`,
    listener: js.Function2[/* event */ Event, /* type */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the application has finished basic startup. On Windows and Linux,
    * the `will-finish-launching` event is the same as the `ready` event; on macOS,
    * this event represents the `applicationWillFinishLaunching` notification of
    * `NSApplication`. You would usually set up listeners for the `open-file` and
    * `open-url` events here, and start the crash reporter and auto updater.
    *
    * In most cases, you should do everything in the `ready` event handler.
    */
  @JSName("on")
  def on_willfinishlaunching(event: `will-finish-launching`, listener: js.Function): this.type = js.native
  /**
    * Emitted when all windows have been closed and the application will quit. Calling
    * `event.preventDefault()` will prevent the default behavior, which is terminating
    * the application.
    *
    * See the description of the `window-all-closed` event for the differences between
    * the `will-quit` and `window-all-closed` events.
    *
    * **Note:** On Windows, this event will not be emitted if the app is closed due to
    * a shutdown/restart of the system or a user logout.
    */
  @JSName("on")
  def on_willquit(event: `will-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when all windows have been closed.
    *
    * If you do not subscribe to this event and all windows are closed, the default
    * behavior is to quit the app; however, if you subscribe, you control whether the
    * app quits or not. If the user pressed `Cmd + Q`, or the developer called
    * `app.quit()`, Electron will first try to close all the windows and then emit the
    * `will-quit` event, and in this case the `window-all-closed` event would not be
    * emitted.
    */
  @JSName("on")
  def on_windowallclosed(event: `window-all-closed`, listener: js.Function): this.type = js.native
  
  @JSName("once")
  def once_accessibilitysupportchanged(
    event: `accessibility-support-changed`,
    listener: js.Function2[/* event */ Event, /* accessibilitySupportEnabled */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activate(event: activate, listener: js.Function2[/* event */ Event, /* hasVisibleWindows */ Boolean, Unit]): this.type = js.native
  @JSName("once")
  def once_activitywascontinued(
    event: `activity-was-continued`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beforequit(event: `before-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_browserwindowblur(
    event: `browser-window-blur`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_browserwindowcreated(
    event: `browser-window-created`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_browserwindowfocus(
    event: `browser-window-focus`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_certificateerror(
    event: `certificate-error`,
    listener: js.Function7[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_childprocessgone(
    event: `child-process-gone`,
    listener: js.Function2[/* event */ Event, /* details */ Details, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_continueactivity(
    event: `continue-activity`,
    listener: js.Function4[
      /* event */ Event, 
      /* type */ String, 
      /* userInfo */ Any, 
      /* details */ ContinueActivityDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_didbecomeactive(event: `did-become-active`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_gpuinfoupdate(event: `gpu-info-update`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_gpuprocesscrashed(
    event: `gpu-process-crashed`,
    listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_login(
    event: login,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_newwindowfortab(event: `new-window-for-tab`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_openfile(event: `open-file`, listener: js.Function2[/* event */ Event, /* path */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_openurl(event: `open-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_quit(event: quit, listener: js.Function2[/* event */ Event, /* exitCode */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(
    event: ready,
    listener: js.Function2[
      /* event */ Event, 
      /* launchInfo */ (Record[String, Any]) | NotificationResponse, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents_, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_renderprocessgone(
    event: `render-process-gone`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* details */ RenderProcessGoneDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_secondinstance(
    event: `second-instance`,
    listener: js.Function4[
      /* event */ Event, 
      /* argv */ js.Array[String], 
      /* workingDirectory */ String, 
      /* additionalData */ Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session_, Unit]): this.type = js.native
  @JSName("once")
  def once_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willcontinueactivity(
    event: `will-continue-activity`,
    listener: js.Function2[/* event */ Event, /* type */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willfinishlaunching(event: `will-finish-launching`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_willquit(event: `will-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_windowallclosed(event: `window-all-closed`, listener: js.Function): this.type = js.native
  
  /**
    * Try to close all windows. The `before-quit` event will be emitted first. If all
    * windows are successfully closed, the `will-quit` event will be emitted and by
    * default the application will terminate.
    *
    * This method guarantees that all `beforeunload` and `unload` event handlers are
    * correctly executed. It is possible that a window cancels the quitting by
    * returning `false` in the `beforeunload` event handler.
    */
  def quit(): Unit = js.native
  
  /**
    * Relaunches the app when current instance exits.
    *
    * By default, the new instance will use the same working directory and command
    * line arguments with current instance. When `args` is specified, the `args` will
    * be passed as command line arguments instead. When `execPath` is specified, the
    * `execPath` will be executed for relaunch instead of current app.
    *
    * Note that this method does not quit the app when executed, you have to call
    * `app.quit` or `app.exit` after calling `app.relaunch` to make the app restart.
    *
    * When `app.relaunch` is called for multiple times, multiple instances will be
    * started after current instance exited.
    *
    * An example of restarting current instance immediately and adding a new command
    * line argument to the new instance:
    */
  def relaunch(): Unit = js.native
  def relaunch(options: RelaunchOptions): Unit = js.native
  
  /**
    * Releases all locks that were created by `requestSingleInstanceLock`. This will
    * allow multiple instances of the application to once again run side by side.
    */
  def releaseSingleInstanceLock(): Unit = js.native
  
  /**
    * Whether the call succeeded.
    *
    * This method checks if the current executable as the default handler for a
    * protocol (aka URI scheme). If so, it will remove the app as the default handler.
    *
    * @platform darwin,win32
    */
  def removeAsDefaultProtocolClient(protocol: String): Boolean = js.native
  def removeAsDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def removeAsDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
  def removeAsDefaultProtocolClient(protocol: String, path: Unit, args: js.Array[String]): Boolean = js.native
  
  @JSName("removeListener")
  def removeListener_accessibilitysupportchanged(
    event: `accessibility-support-changed`,
    listener: js.Function2[/* event */ Event, /* accessibilitySupportEnabled */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_activate(event: activate, listener: js.Function2[/* event */ Event, /* hasVisibleWindows */ Boolean, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_activitywascontinued(
    event: `activity-was-continued`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforequit(event: `before-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_browserwindowblur(
    event: `browser-window-blur`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_browserwindowcreated(
    event: `browser-window-created`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_browserwindowfocus(
    event: `browser-window-focus`,
    listener: js.Function2[/* event */ Event, /* window */ BrowserWindow, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_certificateerror(
    event: `certificate-error`,
    listener: js.Function7[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      /* isMainFrame */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_childprocessgone(
    event: `child-process-gone`,
    listener: js.Function2[/* event */ Event, /* details */ Details, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_continueactivity(
    event: `continue-activity`,
    listener: js.Function4[
      /* event */ Event, 
      /* type */ String, 
      /* userInfo */ Any, 
      /* details */ ContinueActivityDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_didbecomeactive(event: `did-become-active`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_gpuinfoupdate(event: `gpu-info-update`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_gpuprocesscrashed(
    event: `gpu-process-crashed`,
    listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_login(
    event: login,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* authenticationResponseDetails */ AuthenticationResponseDetails, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_openfile(event: `open-file`, listener: js.Function2[/* event */ Event, /* path */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_openurl(event: `open-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_quit(event: quit, listener: js.Function2[/* event */ Event, /* exitCode */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ready(
    event: ready,
    listener: js.Function2[
      /* event */ Event, 
      /* launchInfo */ (Record[String, Any]) | NotificationResponse, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents_, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_renderprocessgone(
    event: `render-process-gone`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* details */ RenderProcessGoneDetails, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_secondinstance(
    event: `second-instance`,
    listener: js.Function4[
      /* event */ Event, 
      /* argv */ js.Array[String], 
      /* workingDirectory */ String, 
      /* additionalData */ Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents_, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session_, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents_, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willcontinueactivity(
    event: `will-continue-activity`,
    listener: js.Function2[/* event */ Event, /* type */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willfinishlaunching(event: `will-finish-launching`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_willquit(event: `will-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_windowallclosed(event: `window-all-closed`, listener: js.Function): this.type = js.native
  
  /**
    * The return value of this method indicates whether or not this instance of your
    * application successfully obtained the lock.  If it failed to obtain the lock,
    * you can assume that another instance of your application is already running with
    * the lock and exit immediately.
    *
    * I.e. This method returns `true` if your process is the primary instance of your
    * application and your app should continue loading.  It returns `false` if your
    * process should immediately quit as it has sent its parameters to another
    * instance that has already acquired the lock.
    *
    * On macOS, the system enforces single instance automatically when users try to
    * open a second instance of your app in Finder, and the `open-file` and `open-url`
    * events will be emitted for that. However when users start your app in command
    * line, the system's single instance mechanism will be bypassed, and you have to
    * use this method to ensure single instance.
    *
    * An example of activating the window of primary instance when a second instance
    * starts:
    */
  def requestSingleInstanceLock(): Boolean = js.native
  def requestSingleInstanceLock(additionalData: Record[Any, Any]): Boolean = js.native
  
  /**
    * Marks the current Handoff user activity as inactive without invalidating it.
    *
    * @platform darwin
    */
  def resignCurrentActivity(): Unit = js.native
  
  /**
    * A `boolean` which when `true` indicates that the app is currently running under
    * an ARM64 translator (like the macOS Rosetta Translator Environment or Windows
    * WOW).
    *
    * You can use this property to prompt users to download the arm64 version of your
    * application when they are running the x64 version under Rosetta incorrectly.
    *
    * @platform darwin,win32
    */
  val runningUnderARM64Translation: Boolean = js.native
  
  /**
    * A `boolean` which when `true` indicates that the app is currently running under
    * the Rosetta Translator Environment.
    *
    * You can use this property to prompt users to download the arm64 version of your
    * application when they are running the x64 version under Rosetta incorrectly.
    *
    * **Deprecated:** This property is superceded by the
    * `runningUnderARM64Translation` property which detects when the app is being
    * translated to ARM64 in both macOS and Windows.
    *
    * @deprecated
    * @platform darwin
    */
  val runningUnderRosettaTranslation: Boolean = js.native
  
  /**
    * Set the about panel options. This will override the values defined in the app's
    * `.plist` file on macOS. See the Apple docs for more details. On Linux, values
    * must be set in order to be shown; there are no defaults.
    *
    * If you do not set `credits` but still wish to surface them in your app, AppKit
    * will look for a file named "Credits.html", "Credits.rtf", and "Credits.rtfd", in
    * that order, in the bundle returned by the NSBundle class method main. The first
    * file found is used, and if none is found, the info area is left blank. See Apple
    * documentation for more information.
    */
  def setAboutPanelOptions(options: AboutPanelOptionsOptions): Unit = js.native
  
  /**
    * Manually enables Chrome's accessibility support, allowing to expose
    * accessibility switch to users in application settings. See Chromium's
    * accessibility docs for more details. Disabled by default.
    *
    * This API must be called after the `ready` event is emitted.
    *
    * **Note:** Rendering accessibility tree can significantly affect the performance
    * of your app. It should not be enabled by default.
    *
    * @platform darwin,win32
    */
  def setAccessibilitySupportEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the activation policy for a given app.
    *
    * Activation policy types:
    *
    * * 'regular' - The application is an ordinary app that appears in the Dock and
    * may have a user interface.
    * * 'accessory' - The application doesn’t appear in the Dock and doesn’t have a
    * menu bar, but it may be activated programmatically or by clicking on one of its
    * windows.
    * * 'prohibited' - The application doesn’t appear in the Dock and may not create
    * windows or be activated.
    *
    * @platform darwin
    */
  def setActivationPolicy(policy: regular | accessory | prohibited): Unit = js.native
  
  /**
    * Sets or creates a directory your app's logs which can then be manipulated with
    * `app.getPath()` or `app.setPath(pathName, newPath)`.
    *
    * Calling `app.setAppLogsPath()` without a `path` parameter will result in this
    * directory being set to `~/Library/Logs/YourAppName` on _macOS_, and inside the
    * `userData` directory on _Linux_ and _Windows_.
    */
  def setAppLogsPath(): Unit = js.native
  def setAppLogsPath(path: String): Unit = js.native
  
  /**
    * Changes the Application User Model ID to `id`.
    *
    * @platform win32
    */
  def setAppUserModelId(id: String): Unit = js.native
  
  /**
    * Whether the call succeeded.
    *
    * Sets the current executable as the default handler for a protocol (aka URI
    * scheme). It allows you to integrate your app deeper into the operating system.
    * Once registered, all links with `your-protocol://` will be opened with the
    * current executable. The whole link, including protocol, will be passed to your
    * application as a parameter.
    *
    * **Note:** On macOS, you can only register protocols that have been added to your
    * app's `info.plist`, which cannot be modified at runtime. However, you can change
    * the file during build time via Electron Forge, Electron Packager, or by editing
    * `info.plist` with a text editor. Please refer to Apple's documentation for
    * details.
    *
    * **Note:** In a Windows Store environment (when packaged as an `appx`) this API
    * will return `true` for all calls but the registry key it sets won't be
    * accessible by other applications.  In order to register your Windows Store
    * application as a default protocol handler you must declare the protocol in your
    * manifest.
    *
    * The API uses the Windows Registry and `LSSetDefaultHandlerForURLScheme`
    * internally.
    */
  def setAsDefaultProtocolClient(protocol: String): Boolean = js.native
  def setAsDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def setAsDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
  def setAsDefaultProtocolClient(protocol: String, path: Unit, args: js.Array[String]): Boolean = js.native
  
  /**
    * Whether the call succeeded.
    *
    * Sets the counter badge for current app. Setting the count to `0` will hide the
    * badge.
    *
    * On macOS, it shows on the dock icon. On Linux, it only works for Unity launcher.
    *
    * **Note:** Unity launcher requires a `.desktop` file to work. For more
    * information, please read the Unity integration documentation.
    *
    * @platform linux,darwin
    */
  def setBadgeCount(): Boolean = js.native
  def setBadgeCount(count: Double): Boolean = js.native
  
  /**
    * Sets or removes a custom Jump List for the application, and returns one of the
    * following strings:
    *
    * * `ok` - Nothing went wrong.
    * * `error` - One or more errors occurred, enable runtime logging to figure out
    * the likely cause.
    * * `invalidSeparatorError` - An attempt was made to add a separator to a custom
    * category in the Jump List. Separators are only allowed in the standard `Tasks`
    * category.
    * * `fileTypeRegistrationError` - An attempt was made to add a file link to the
    * Jump List for a file type the app isn't registered to handle.
    * * `customCategoryAccessDeniedError` - Custom categories can't be added to the
    * Jump List due to user privacy or group policy settings.
    *
    * If `categories` is `null` the previously set custom Jump List (if any) will be
    * replaced by the standard Jump List for the app (managed by Windows).
    *
    * **Note:** If a `JumpListCategory` object has neither the `type` nor the `name`
    * property set then its `type` is assumed to be `tasks`. If the `name` property is
    * set but the `type` property is omitted then the `type` is assumed to be
    * `custom`.
    *
    * **Note:** Users can remove items from custom categories, and Windows will not
    * allow a removed item to be added back into a custom category until **after** the
    * next successful call to `app.setJumpList(categories)`. Any attempt to re-add a
    * removed item to a custom category earlier than that will result in the entire
    * custom category being omitted from the Jump List. The list of removed items can
    * be obtained using `app.getJumpListSettings()`.
    *
    * **Note:** The maximum length of a Jump List item's `description` property is 260
    * characters. Beyond this limit, the item will not be added to the Jump List, nor
    * will it be displayed.
    *
    * Here's a very simple example of creating a custom Jump List:
    *
    * @platform win32
    */
  def setJumpList(): ok | error | invalidSeparatorError | fileTypeRegistrationError | customCategoryAccessDeniedError = js.native
  def setJumpList(categories: js.Array[JumpListCategory]): ok | error | invalidSeparatorError | fileTypeRegistrationError | customCategoryAccessDeniedError = js.native
  
  /**
    * To work with Electron's `autoUpdater` on Windows, which uses Squirrel, you'll
    * want to set the launch path to Update.exe, and pass arguments that specify your
    * application name. For example:
    *
    * @platform darwin,win32
    */
  def setLoginItemSettings(settings: Settings): Unit = js.native
  
  /**
    * Overrides the current application's name.
    *
    * **Note:** This function overrides the name used internally by Electron; it does
    * not affect the name that the OS uses.
    */
  def setName(name: String): Unit = js.native
  
  /**
    * Overrides the `path` to a special directory or file associated with `name`. If
    * the path specifies a directory that does not exist, an `Error` is thrown. In
    * that case, the directory should be created with `fs.mkdirSync` or similar.
    *
    * You can only override paths of a `name` defined in `app.getPath`.
    *
    * By default, web pages' cookies and caches will be stored under the `sessionData`
    * directory. If you want to change this location, you have to override the
    * `sessionData` path before the `ready` event of the `app` module is emitted.
    */
  def setPath(name: String, path: String): Unit = js.native
  
  /**
    * Set the `Secure Keyboard Entry` is enabled in your application.
    *
    * By using this API, important information such as password and other sensitive
    * information can be prevented from being intercepted by other processes.
    *
    * See Apple's documentation for more details.
    *
    * **Note:** Enable `Secure Keyboard Entry` only when it is needed and disable it
    * when it is no longer needed.
    *
    * @platform darwin
    */
  def setSecureKeyboardEntryEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Creates an `NSUserActivity` and sets it as the current activity. The activity is
    * eligible for Handoff to another device afterward.
    *
    * @platform darwin
    */
  def setUserActivity(`type`: String, userInfo: Any): Unit = js.native
  def setUserActivity(`type`: String, userInfo: Any, webpageURL: String): Unit = js.native
  
  /**
    * Adds `tasks` to the Tasks category of the Jump List on Windows.
    *
    * `tasks` is an array of `Task` objects.
    *
    * Whether the call succeeded.
    *
    * **Note:** If you'd like to customize the Jump List even more use
    * `app.setJumpList(categories)` instead.
    *
    * @platform win32
    */
  def setUserTasks(tasks: js.Array[Task]): Boolean = js.native
  
  /**
    * Shows application windows after they were hidden. Does not automatically focus
    * them.
    *
    * @platform darwin
    */
  def show(): Unit = js.native
  
  /**
    * Show the app's about panel options. These options can be overridden with
    * `app.setAboutPanelOptions(options)`.
    */
  def showAboutPanel(): Unit = js.native
  
  /**
    * Show the platform's native emoji picker.
    *
    * @platform darwin,win32
    */
  def showEmojiPanel(): Unit = js.native
  
  /**
    * This function **must** be called once you have finished accessing the security
    * scoped file. If you do not remember to stop accessing the bookmark, kernel
    * resources will be leaked and your app will lose its ability to reach outside the
    * sandbox completely, until your app is restarted.
    *
    * Start accessing a security scoped resource. With this method Electron
    * applications that are packaged for the Mac App Store may reach outside their
    * sandbox to access files chosen by the user. See Apple's documentation for a
    * description of how this system works.
    *
    * @platform mas
    */
  def startAccessingSecurityScopedResource(bookmarkData: String): js.Function = js.native
  
  /**
    * Updates the current activity if its type matches `type`, merging the entries
    * from `userInfo` into its current `userInfo` dictionary.
    *
    * @platform darwin
    */
  def updateCurrentActivity(`type`: String, userInfo: Any): Unit = js.native
  
  /**
    * A `string` which is the user agent string Electron will use as a global
    * fallback.
    *
    * This is the user agent that will be used when no user agent is set at the
    * `webContents` or `session` level.  It is useful for ensuring that your entire
    * app has the same user agent.  Set to a custom value as early as possible in your
    * app's initialization to ensure that your overridden value is used.
    */
  var userAgentFallback: String = js.native
  
  /**
    * fulfilled when Electron is initialized. May be used as a convenient alternative
    * to checking `app.isReady()` and subscribing to the `ready` event if the app is
    * not ready yet.
    */
  def whenReady(): js.Promise[Unit] = js.native
}
