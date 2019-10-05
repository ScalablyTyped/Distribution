package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import typings.electron.electronStrings.`accessibility-support-changed`
import typings.electron.electronStrings.`activity-was-continued`
import typings.electron.electronStrings.`before-quit`
import typings.electron.electronStrings.`browser-window-blur`
import typings.electron.electronStrings.`browser-window-created`
import typings.electron.electronStrings.`browser-window-focus`
import typings.electron.electronStrings.`certificate-error`
import typings.electron.electronStrings.`continue-activity-error`
import typings.electron.electronStrings.`continue-activity`
import typings.electron.electronStrings.`desktop-capturer-get-sources`
import typings.electron.electronStrings.`gpu-process-crashed`
import typings.electron.electronStrings.`new-window-for-tab`
import typings.electron.electronStrings.`open-file`
import typings.electron.electronStrings.`open-url`
import typings.electron.electronStrings.`remote-get-builtin`
import typings.electron.electronStrings.`remote-get-current-web-contents`
import typings.electron.electronStrings.`remote-get-current-window`
import typings.electron.electronStrings.`remote-get-global`
import typings.electron.electronStrings.`remote-get-guest-web-contents`
import typings.electron.electronStrings.`remote-require`
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
import typings.electron.electronStrings.activate
import typings.electron.electronStrings.login
import typings.electron.electronStrings.quit
import typings.electron.electronStrings.ready
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends EventEmitter {
  /**
    * A Boolean property that's true if Chrome's accessibility support is enabled,
    * false otherwise. This property will be true if the use of assistive
    * technologies, such as screen readers, has been detected. Setting this property
    * to true manually enables Chrome's accessibility support, allowing developers to
    * expose accessibility switch to users in application settings. See Chromium's
    * accessibility docs for more details. Disabled by default. This API must be
    * called after the ready event is emitted. Note: Rendering accessibility tree can
    * significantly affect the performance of your app. It should not be enabled by
    * default.
    */
  var accessibilitySupportEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean which when true disables the overrides that Electron has in place to
    * ensure renderer processes are restarted on every navigation.  The current
    * default value for this property is false. The intention is for these overrides
    * to become disabled by default and then at some point in the future this property
    * will be removed.  This property impacts which native modules you can use in the
    * renderer process.  For more information on the direction Electron is going with
    * renderer process restarts and usage of native modules in the renderer process
    * please check out this Tracking Issue.
    */
  var allowRendererProcessReuse: js.UndefOr[Boolean] = js.native
  /**
    * A Menu property that return Menu if one has been set and null otherwise. Users
    * can pass a Menu to set this property.
    */
  var applicationMenu: js.UndefOr[Menu] = js.native
  var commandLine: CommandLine = js.native
  var dock: Dock = js.native
  /**
    * A Boolean property that returns  true if the app is packaged, false otherwise.
    * For many apps, this property can be used to distinguish development and
    * production environments.
    */
  var isPackaged: js.UndefOr[Boolean] = js.native
  /**
    * A String which is the user agent string Electron will use as a global fallback.
    * This is the user agent that will be used when no user agent is set at the
    * webContents or session level.  Useful for ensuring your entire app has the same
    * user agent.  Set to a custom value as early as possible in your apps
    * initialization to ensure that your overridden value is used.
    */
  var userAgentFallback: js.UndefOr[String] = js.native
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
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
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
    listener: js.Function6[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_continueactivity(
    event: `continue-activity`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_desktopcapturergetsources(
    event: `desktop-capturer-get-sources`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
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
      /* webContents */ WebContents, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ String, /* password */ String, Unit], 
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
  def addListener_ready(event: ready, listener: js.Function1[/* launchInfo */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetcurrentwebcontents(
    event: `remote-get-current-web-contents`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetcurrentwindow(
    event: `remote-get-current-window`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* guestWebContents */ WebContents, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_remoterequire(
    event: `remote-require`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secondinstance(
    event: `second-instance`,
    listener: js.Function3[/* event */ Event, /* argv */ js.Array[String], /* workingDirectory */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
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
    * Adds path to the recent documents list. This list is managed by the OS. On
    * Windows, you can visit the list from the task bar, and on macOS, you can visit
    * it from dock menu.
    */
  def addRecentDocument(path: String): Unit = js.native
  /**
    * Clears the recent documents list.
    */
  def clearRecentDocuments(): Unit = js.native
  /**
    * By default, Chromium disables 3D APIs (e.g. WebGL) until restart on a per domain
    * basis if the GPU processes crashes too frequently. This function disables that
    * behaviour. This method can only be called before app is ready.
    */
  def disableDomainBlockingFor3DAPIs(): Unit = js.native
  /**
    * Disables hardware acceleration for current app. This method can only be called
    * before app is ready.
    */
  def disableHardwareAcceleration(): Unit = js.native
  /**
    * Enables full sandbox mode on the app. This method can only be called before app
    * is ready.
    */
  def enableSandbox(): Unit = js.native
  /**
    * Exits immediately with exitCode. exitCode defaults to 0. All windows will be
    * closed immediately without asking the user, and the before-quit and will-quit
    * events will not be emitted.
    */
  def exit(): Unit = js.native
  def exit(exitCode: Double): Unit = js.native
  /**
    * On Linux, focuses on the first visible window. On macOS, makes the application
    * the active app. On Windows, focuses on the application's first window.
    */
  def focus(): Unit = js.native
  def getAppMetrics(): js.Array[ProcessMetric] = js.native
  def getAppPath(): String = js.native
  def getBadgeCount(): Double = js.native
  def getCurrentActivityType(): String = js.native
  /**
    * Fetches a path's associated icon. On Windows, there a 2 kinds of icons: On Linux
    * and macOS, icons depend on the application associated with file mime type.
    */
  def getFileIcon(path: String): js.Promise[NativeImage] = js.native
  /**
    * Fetches a path's associated icon. On Windows, there are 2 kinds of icons: On
    * Linux and macOS, icons depend on the application associated with file mime type.
    * Deprecated Soon
    */
  def getFileIcon(path: String, callback: js.Function2[/* error */ Error, /* icon */ NativeImage, Unit]): Unit = js.native
  def getFileIcon(path: String, options: FileIconOptions): js.Promise[NativeImage] = js.native
  /**
    * Fetches a path's associated icon. On Windows, there are 2 kinds of icons: On
    * Linux and macOS, icons depend on the application associated with file mime type.
    * Deprecated Soon
    */
  def getFileIcon(
    path: String,
    options: FileIconOptions,
    callback: js.Function2[/* error */ Error, /* icon */ NativeImage, Unit]
  ): Unit = js.native
  def getGPUFeatureStatus(): GPUFeatureStatus = js.native
  /**
    * For infoType equal to complete: Promise is fulfilled with Object containing all
    * the GPU Information as in chromium's GPUInfo object. This includes the version
    * and driver information that's shown on chrome://gpu page. For infoType equal to
    * basic: Promise is fulfilled with Object containing fewer attributes than when
    * requested with complete. Here's an example of basic response: Using basic should
    * be preferred if only basic information like vendorId or driverId is needed.
    */
  def getGPUInfo(infoType: String): js.Promise[_] = js.native
  def getJumpListSettings(): JumpListSettings = js.native
  /**
    * To set the locale, you'll want to use a command line switch at app startup,
    * which may be found here. Note: When distributing your packaged app, you have to
    * also ship the locales folder. Note: On Windows, you have to call it after the
    * ready events gets emitted.
    */
  def getLocale(): String = js.native
  /**
    * Note: When unable to detect locale country code, it returns empty string.
    */
  def getLocaleCountryCode(): String = js.native
  /**
    * If you provided path and args options to app.setLoginItemSettings, then you need
    * to pass the same arguments here for openAtLogin to be set correctly.
    */
  def getLoginItemSettings(): LoginItemSettings = js.native
  def getLoginItemSettings(options: LoginItemSettingsOptions): LoginItemSettings = js.native
  /**
    * Usually the name field of package.json is a short lowercased name, according to
    * the npm modules spec. You should usually also specify a productName field, which
    * is your application's full capitalized name, and which will be preferred over
    * name by Electron.
    */
  def getName(): String = js.native
  /**
    * You can request the following paths by the name:
    */
  def getPath(name: String): String = js.native
  def getVersion(): String = js.native
  /**
    * This method returns whether or not this instance of your app is currently
    * holding the single instance lock.  You can request the lock with
    * app.requestSingleInstanceLock() and release with app.releaseSingleInstanceLock()
    */
  def hasSingleInstanceLock(): Boolean = js.native
  /**
    * Hides all application windows without minimizing them.
    */
  def hide(): Unit = js.native
  /**
    * Imports the certificate in pkcs12 format into the platform certificate store.
    * callback is called with the result of import operation, a value of 0 indicates
    * success while any other value indicates failure according to Chromium
    * net_error_list.
    */
  def importCertificate(options: ImportCertificateOptions, callback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  /**
    * Invalidates the current Handoff user activity.
    */
  def invalidateCurrentActivity(`type`: String): Unit = js.native
  /**
    * Deprecated Soon
    */
  def isAccessibilitySupportEnabled(): Boolean = js.native
  /**
    * This method checks if the current executable is the default handler for a
    * protocol (aka URI scheme). If so, it will return true. Otherwise, it will return
    * false. Note: On macOS, you can use this method to check if the app has been
    * registered as the default protocol handler for a protocol. You can also verify
    * this by checking ~/Library/Preferences/com.apple.LaunchServices.plist on the
    * macOS machine. Please refer to Apple's documentation for details. The API uses
    * the Windows Registry and LSCopyDefaultHandlerForURLScheme internally.
    */
  def isDefaultProtocolClient(protocol: String): Boolean = js.native
  def isDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def isDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
  def isEmojiPanelSupported(): Boolean = js.native
  def isInApplicationsFolder(): Boolean = js.native
  def isReady(): Boolean = js.native
  def isUnityRunning(): Boolean = js.native
  /**
    * No confirmation dialog will be presented by default. If you wish to allow the
    * user to confirm the operation, you may do so using the dialog API. NOTE: This
    * method throws errors if anything other than the user causes the move to fail.
    * For instance if the user cancels the authorization dialog, this method returns
    * false. If we fail to perform the copy, then this method will throw an error. The
    * message in the error should be informative and tell you exactly what went wrong
    */
  def moveToApplicationsFolder(): Boolean = js.native
  // Docs: http://electronjs.org/docs/api/app
  /**
    * Emitted when Chrome's accessibility support changes. This event fires when
    * assistive technologies, such as screen readers, are enabled or disabled. See
    * https://www.chromium.org/developers/design-documents/accessibility for more
    * details.
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
    */
  @JSName("on")
  def on_activate(event: activate, listener: js.Function2[/* event */ Event, /* hasVisibleWindows */ Boolean, Unit]): this.type = js.native
  /**
    * Emitted during Handoff after an activity from this device was successfully
    * resumed on another one.
    */
  @JSName("on")
  def on_activitywascontinued(
    event: `activity-was-continued`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Emitted before the application starts closing its windows. Calling
    * event.preventDefault() will prevent the default behavior, which is terminating
    * the application. Note: If application quit was initiated by
    * autoUpdater.quitAndInstall(), then before-quit is emitted after emitting close
    * event on all windows and closing them. Note: On Windows, this event will not be
    * emitted if the app is closed due to a shutdown/restart of the system or a user
    * logout.
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
    * Emitted when failed to verify the certificate for url, to trust the certificate
    * you should prevent the default behavior with event.preventDefault() and call
    * callback(true).
    */
  @JSName("on")
  def on_certificateerror(
    event: `certificate-error`,
    listener: js.Function6[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted during Handoff when an activity from a different device wants to be
    * resumed. You should call event.preventDefault() if you want to handle this
    * event. A user activity can be continued only in an app that has the same
    * developer Team ID as the activity's source app and that supports the activity's
    * type. Supported activity types are specified in the app's Info.plist under the
    * NSUserActivityTypes key.
    */
  @JSName("on")
  def on_continueactivity(
    event: `continue-activity`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Emitted during Handoff when an activity from a different device fails to be
    * resumed.
    */
  @JSName("on")
  def on_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when desktopCapturer.getSources() is called in the renderer process of
    * webContents. Calling event.preventDefault() will make it return empty sources.
    */
  @JSName("on")
  def on_desktopcapturergetsources(
    event: `desktop-capturer-get-sources`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  /**
    * Emitted when the gpu process crashes or is killed.
    */
  @JSName("on")
  def on_gpuprocesscrashed(
    event: `gpu-process-crashed`,
    listener: js.Function2[/* event */ Event, /* killed */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when webContents wants to do basic auth. The default behavior is to
    * cancel all authentications. To override this you should prevent the default
    * behavior with event.preventDefault() and call callback(username, password) with
    * the credentials.
    */
  @JSName("on")
  def on_login(
    event: login,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ String, /* password */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the user clicks the native macOS new tab button. The new tab button
    * is only visible if the current BrowserWindow has a tabbingIdentifier
    */
  @JSName("on")
  def on_newwindowfortab(event: `new-window-for-tab`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the user wants to open a file with the application. The open-file
    * event is usually emitted when the application is already open and the OS wants
    * to reuse the application to open the file. open-file is also emitted when a file
    * is dropped onto the dock and the application is not yet running. Make sure to
    * listen for the open-file event very early in your application startup to handle
    * this case (even before the ready event is emitted). You should call
    * event.preventDefault() if you want to handle this event. On Windows, you have to
    * parse process.argv (in the main process) to get the filepath.
    */
  @JSName("on")
  def on_openfile(event: `open-file`, listener: js.Function2[/* event */ Event, /* path */ String, Unit]): this.type = js.native
  /**
    * Emitted when the user wants to open a URL with the application. Your
    * application's Info.plist file must define the url scheme within the
    * CFBundleURLTypes key, and set NSPrincipalClass to AtomApplication. You should
    * call event.preventDefault() if you want to handle this event.
    */
  @JSName("on")
  def on_openurl(event: `open-url`, listener: js.Function2[/* event */ Event, /* url */ String, Unit]): this.type = js.native
  /**
    * Emitted when the application is quitting. Note: On Windows, this event will not
    * be emitted if the app is closed due to a shutdown/restart of the system or a
    * user logout.
    */
  @JSName("on")
  def on_quit(event: quit, listener: js.Function2[/* event */ Event, /* exitCode */ Double, Unit]): this.type = js.native
  /**
    * Emitted when Electron has finished initializing. On macOS, launchInfo holds the
    * userInfo of the NSUserNotification that was used to open the application, if it
    * was launched from Notification Center. You can call app.isReady() to check if
    * this event has already fired.
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function1[/* launchInfo */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted when remote.getBuiltin() is called in the renderer process of
    * webContents. Calling event.preventDefault() will prevent the module from being
    * returned. Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getCurrentWebContents() is called in the renderer process of
    * webContents. Calling event.preventDefault() will prevent the object from being
    * returned. Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remotegetcurrentwebcontents(
    event: `remote-get-current-web-contents`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getCurrentWindow() is called in the renderer process of
    * webContents. Calling event.preventDefault() will prevent the object from being
    * returned. Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remotegetcurrentwindow(
    event: `remote-get-current-window`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  /**
    * Emitted when remote.getGlobal() is called in the renderer process of
    * webContents. Calling event.preventDefault() will prevent the global from being
    * returned. Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* globalName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when <webview>.getWebContents() is called in the renderer process of
    * webContents. Calling event.preventDefault() will prevent the object from being
    * returned. Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* guestWebContents */ WebContents, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when remote.require() is called in the renderer process of webContents.
    * Calling event.preventDefault() will prevent the module from being returned.
    * Custom value can be returned by setting event.returnValue.
    */
  @JSName("on")
  def on_remoterequire(
    event: `remote-require`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the renderer process of webContents crashes or is killed.
    */
  @JSName("on")
  def on_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* killed */ Boolean, Unit]
  ): this.type = js.native
  /**
    * This event will be emitted inside the primary instance of your application when
    * a second instance has been executed and calls app.requestSingleInstanceLock().
    * argv is an Array of the second instance's command line arguments, and
    * workingDirectory is its current working directory. Usually applications respond
    * to this by making their primary window focused and non-minimized. This event is
    * guaranteed to be emitted after the ready event of app gets emitted. Note: Extra
    * command line arguments might be added by Chromium, such as
    * --original-process-start-time.
    */
  @JSName("on")
  def on_secondinstance(
    event: `second-instance`,
    listener: js.Function3[/* event */ Event, /* argv */ js.Array[String], /* workingDirectory */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a client certificate is requested. The url corresponds to the
    * navigation entry requesting the client certificate and callback can be called
    * with an entry filtered from the list. Using event.preventDefault() prevents the
    * application from using the first certificate from the store.
    */
  @JSName("on")
  def on_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when Electron has created a new session.
    */
  @JSName("on")
  def on_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session, Unit]): this.type = js.native
  /**
    * Emitted when Handoff is about to be resumed on another device. If you need to
    * update the state to be transferred, you should call event.preventDefault()
    * immediately, construct a new userInfo dictionary and call
    * app.updateCurrentActiviy() in a timely manner. Otherwise, the operation will
    * fail and continue-activity-error will be called.
    */
  @JSName("on")
  def on_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Emitted when a new webContents is created.
    */
  @JSName("on")
  def on_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  /**
    * Emitted during Handoff before an activity from a different device wants to be
    * resumed. You should call event.preventDefault() if you want to handle this
    * event.
    */
  @JSName("on")
  def on_willcontinueactivity(
    event: `will-continue-activity`,
    listener: js.Function2[/* event */ Event, /* type */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the application has finished basic startup. On Windows and Linux,
    * the will-finish-launching event is the same as the ready event; on macOS, this
    * event represents the applicationWillFinishLaunching notification of
    * NSApplication. You would usually set up listeners for the open-file and open-url
    * events here, and start the crash reporter and auto updater. In most cases, you
    * should do everything in the ready event handler.
    */
  @JSName("on")
  def on_willfinishlaunching(event: `will-finish-launching`, listener: js.Function): this.type = js.native
  /**
    * Emitted when all windows have been closed and the application will quit. Calling
    * event.preventDefault() will prevent the default behaviour, which is terminating
    * the application. See the description of the window-all-closed event for the
    * differences between the will-quit and window-all-closed events. Note: On
    * Windows, this event will not be emitted if the app is closed due to a
    * shutdown/restart of the system or a user logout.
    */
  @JSName("on")
  def on_willquit(event: `will-quit`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when all windows have been closed. If you do not subscribe to this event
    * and all windows are closed, the default behavior is to quit the app; however, if
    * you subscribe, you control whether the app quits or not. If the user pressed Cmd
    * + Q, or the developer called app.quit(), Electron will first try to close all
    * the windows and then emit the will-quit event, and in this case the
    * window-all-closed event would not be emitted.
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
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
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
    listener: js.Function6[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_continueactivity(
    event: `continue-activity`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_desktopcapturergetsources(
    event: `desktop-capturer-get-sources`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
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
      /* webContents */ WebContents, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ String, /* password */ String, Unit], 
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
  def once_ready(event: ready, listener: js.Function1[/* launchInfo */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetcurrentwebcontents(
    event: `remote-get-current-web-contents`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetcurrentwindow(
    event: `remote-get-current-window`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* guestWebContents */ WebContents, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_remoterequire(
    event: `remote-require`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_secondinstance(
    event: `second-instance`,
    listener: js.Function3[/* event */ Event, /* argv */ js.Array[String], /* workingDirectory */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session, Unit]): this.type = js.native
  @JSName("once")
  def once_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
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
    * Try to close all windows. The before-quit event will be emitted first. If all
    * windows are successfully closed, the will-quit event will be emitted and by
    * default the application will terminate. This method guarantees that all
    * beforeunload and unload event handlers are correctly executed. It is possible
    * that a window cancels the quitting by returning false in the beforeunload event
    * handler.
    */
  def quit(): Unit = js.native
  /**
    * Relaunches the app when current instance exits. By default, the new instance
    * will use the same working directory and command line arguments with current
    * instance. When args is specified, the args will be passed as command line
    * arguments instead. When execPath is specified, the execPath will be executed for
    * relaunch instead of current app. Note that this method does not quit the app
    * when executed, you have to call app.quit or app.exit after calling app.relaunch
    * to make the app restart. When app.relaunch is called for multiple times,
    * multiple instances will be started after current instance exited. An example of
    * restarting current instance immediately and adding a new command line argument
    * to the new instance:
    */
  def relaunch(): Unit = js.native
  def relaunch(options: RelaunchOptions): Unit = js.native
  /**
    * Releases all locks that were created by requestSingleInstanceLock. This will
    * allow multiple instances of the application to once again run side by side.
    */
  def releaseSingleInstanceLock(): Unit = js.native
  /**
    * This method checks if the current executable as the default handler for a
    * protocol (aka URI scheme). If so, it will remove the app as the default handler.
    */
  def removeAsDefaultProtocolClient(protocol: String): Boolean = js.native
  def removeAsDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def removeAsDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
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
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
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
    listener: js.Function6[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* error */ String, 
      /* certificate */ Certificate, 
      /* callback */ js.Function1[/* isTrusted */ Boolean, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_continueactivity(
    event: `continue-activity`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_continueactivityerror(
    event: `continue-activity-error`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* error */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_desktopcapturergetsources(
    event: `desktop-capturer-get-sources`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
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
      /* webContents */ WebContents, 
      /* request */ Request, 
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ String, /* password */ String, Unit], 
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
  def removeListener_ready(event: ready, listener: js.Function1[/* launchInfo */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetbuiltin(
    event: `remote-get-builtin`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetcurrentwebcontents(
    event: `remote-get-current-web-contents`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetcurrentwindow(
    event: `remote-get-current-window`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetglobal(
    event: `remote-get-global`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* globalName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remotegetguestwebcontents(
    event: `remote-get-guest-web-contents`,
    listener: js.Function3[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* guestWebContents */ WebContents, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_remoterequire(
    event: `remote-require`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* moduleName */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_rendererprocesscrashed(
    event: `renderer-process-crashed`,
    listener: js.Function3[/* event */ Event, /* webContents */ WebContents, /* killed */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_secondinstance(
    event: `second-instance`,
    listener: js.Function3[/* event */ Event, /* argv */ js.Array[String], /* workingDirectory */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectclientcertificate(
    event: `select-client-certificate`,
    listener: js.Function5[
      /* event */ Event, 
      /* webContents */ WebContents, 
      /* url */ String, 
      /* certificateList */ js.Array[Certificate], 
      /* callback */ js.Function1[/* certificate */ js.UndefOr[Certificate], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_sessioncreated(event: `session-created`, listener: js.Function1[/* session */ Session, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_updateactivitystate(
    event: `update-activity-state`,
    listener: js.Function3[/* event */ Event, /* type */ String, /* userInfo */ js.Any, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_webcontentscreated(
    event: `web-contents-created`,
    listener: js.Function2[/* event */ Event, /* webContents */ WebContents, Unit]
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
    * the lock and exit immediately. I.e. This method returns true if your process is
    * the primary instance of your application and your app should continue loading.
    * It returns false if your process should immediately quit as it has sent its
    * parameters to another instance that has already acquired the lock. On macOS, the
    * system enforces single instance automatically when users try to open a second
    * instance of your app in Finder, and the open-file and open-url events will be
    * emitted for that. However when users start your app in command line, the
    * system's single instance mechanism will be bypassed, and you have to use this
    * method to ensure single instance. An example of activating the window of primary
    * instance when a second instance starts:
    */
  def requestSingleInstanceLock(): Boolean = js.native
  /**
    * Set the about panel options. This will override the values defined in the app's
    * .plist file on MacOS. See the Apple docs for more details. On Linux, values must
    * be set in order to be shown; there are no defaults.
    */
  def setAboutPanelOptions(options: AboutPanelOptionsOptions): Unit = js.native
  /**
    * Manually enables Chrome's accessibility support, allowing to expose
    * accessibility switch to users in application settings. See Chromium's
    * accessibility docs for more details. Disabled by default. This API must be
    * called after the ready event is emitted. Note: Rendering accessibility tree can
    * significantly affect the performance of your app. It should not be enabled by
    * default. Deprecated Soon
    */
  def setAccessibilitySupportEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets or creates a directory your app's logs which can then be manipulated with
    * app.getPath() or app.setPath(pathName, newPath). Calling app.setAppLogsPath()
    * without a path parameter will result in this directory being set to
    * /Library/Logs/YourAppName on macOS, and inside the userData directory on Linux
    * and Windows.
    */
  def setAppLogsPath(): Unit = js.native
  def setAppLogsPath(path: String): Unit = js.native
  /**
    * Changes the Application User Model ID to id.
    */
  def setAppUserModelId(id: String): Unit = js.native
  /**
    * This method sets the current executable as the default handler for a protocol
    * (aka URI scheme). It allows you to integrate your app deeper into the operating
    * system. Once registered, all links with your-protocol:// will be opened with the
    * current executable. The whole link, including protocol, will be passed to your
    * application as a parameter. On Windows, you can provide optional parameters
    * path, the path to your executable, and args, an array of arguments to be passed
    * to your executable when it launches. Note: On macOS, you can only register
    * protocols that have been added to your app's info.plist, which can not be
    * modified at runtime. You can however change the file with a simple text editor
    * or script during build time. Please refer to Apple's documentation for details.
    * Note: In a Windows Store environment (when packaged as an appx) this API will
    * return true for all calls but the registry key it sets won't be accessible by
    * other applications.  In order to register your Windows Store application as a
    * default protocol handler you must declare the protocol in your manifest. The API
    * uses the Windows Registry and LSSetDefaultHandlerForURLScheme internally.
    */
  def setAsDefaultProtocolClient(protocol: String): Boolean = js.native
  def setAsDefaultProtocolClient(protocol: String, path: String): Boolean = js.native
  def setAsDefaultProtocolClient(protocol: String, path: String, args: js.Array[String]): Boolean = js.native
  /**
    * Sets the counter badge for current app. Setting the count to 0 will hide the
    * badge. On macOS, it shows on the dock icon. On Linux, it only works for Unity
    * launcher. Note: Unity launcher requires the existence of a .desktop file to
    * work, for more information please read Desktop Environment Integration.
    */
  def setBadgeCount(count: Double): Boolean = js.native
  /**
    * Sets or removes a custom Jump List for the application, and returns one of the
    * following strings: If categories is null the previously set custom Jump List (if
    * any) will be replaced by the standard Jump List for the app (managed by
    * Windows). Note: If a JumpListCategory object has neither the type nor the name
    * property set then its type is assumed to be tasks. If the name property is set
    * but the type property is omitted then the type is assumed to be custom. Note:
    * Users can remove items from custom categories, and Windows will not allow a
    * removed item to be added back into a custom category until after the next
    * successful call to app.setJumpList(categories). Any attempt to re-add a removed
    * item to a custom category earlier than that will result in the entire custom
    * category being omitted from the Jump List. The list of removed items can be
    * obtained using app.getJumpListSettings(). Here's a very simple example of
    * creating a custom Jump List:
    */
  def setJumpList(categories: js.Array[JumpListCategory]): Unit = js.native
  /**
    * Set the app's login item settings. To work with Electron's autoUpdater on
    * Windows, which uses Squirrel, you'll want to set the launch path to Update.exe,
    * and pass arguments that specify your application name. For example:
    */
  def setLoginItemSettings(settings: Settings): Unit = js.native
  /**
    * Overrides the current application's name.
    */
  def setName(name: String): Unit = js.native
  /**
    * Overrides the path to a special directory or file associated with name. If the
    * path specifies a directory that does not exist, an Error is thrown. In that
    * case, the directory should be created with fs.mkdirSync or similar. You can only
    * override paths of a name defined in app.getPath. By default, web pages' cookies
    * and caches will be stored under the userData directory. If you want to change
    * this location, you have to override the userData path before the ready event of
    * the app module is emitted.
    */
  def setPath(name: String, path: String): Unit = js.native
  /**
    * Creates an NSUserActivity and sets it as the current activity. The activity is
    * eligible for Handoff to another device afterward.
    */
  def setUserActivity(`type`: String, userInfo: js.Any): Unit = js.native
  def setUserActivity(`type`: String, userInfo: js.Any, webpageURL: String): Unit = js.native
  /**
    * Adds tasks to the Tasks category of the JumpList on Windows. tasks is an array
    * of Task objects. Note: If you'd like to customize the Jump List even more use
    * app.setJumpList(categories) instead.
    */
  def setUserTasks(tasks: js.Array[Task]): Boolean = js.native
  /**
    * Shows application windows after they were hidden. Does not automatically focus
    * them.
    */
  def show(): Unit = js.native
  /**
    * Show the app's about panel options. These options can be overridden with
    * app.setAboutPanelOptions(options).
    */
  def showAboutPanel(): Unit = js.native
  /**
    * Show the platform's native emoji picker.
    */
  def showEmojiPanel(): Unit = js.native
  /**
    * Start accessing a security scoped resource. With this method Electron
    * applications that are packaged for the Mac App Store may reach outside their
    * sandbox to access files chosen by the user. See Apple's documentation for a
    * description of how this system works.
    */
  def startAccessingSecurityScopedResource(bookmarkData: String): js.Function = js.native
  /**
    * Updates the current activity if its type matches type, merging the entries from
    * userInfo into its current userInfo dictionary.
    */
  def updateCurrentActivity(`type`: String, userInfo: js.Any): Unit = js.native
  def whenReady(): js.Promise[Unit] = js.native
}

@JSGlobal("Electron.app")
@js.native
object app extends TopLevel[App]

