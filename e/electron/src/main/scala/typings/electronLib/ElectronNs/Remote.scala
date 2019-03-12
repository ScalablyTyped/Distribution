package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends MainInterface {
  /**
    * The process object in the main process. This is the same as
    * remote.getGlobal('process') but is cached.
    */
  var process: js.UndefOr[js.Any] = js.undefined
  // Docs: http://electronjs.org/docs/api/remote
  def getCurrentWebContents(): WebContents
  /**
    * Note: Do not use removeAllListeners on BrowserWindow. Use of this can remove all
    * blur listeners, disable click events on touch bar buttons, and other unintended
    * consequences.
    */
  def getCurrentWindow(): BrowserWindow
  def getGlobal(name: java.lang.String): js.Any
  /**
    * e.g.
    */
  def require(module: java.lang.String): js.Any
}

object Remote {
  @scala.inline
  def apply(
    BrowserView: electronLib.Anon_FromId,
    BrowserWindow: electronLib.Anon_AddDevToolsExtension,
    ClientRequest: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
      ClientRequest
    ],
    Cookies: org.scalablytyped.runtime.Instantiable0[Cookies],
    Debugger: org.scalablytyped.runtime.Instantiable0[Debugger],
    DownloadItem: org.scalablytyped.runtime.Instantiable0[DownloadItem],
    IncomingMessage: org.scalablytyped.runtime.Instantiable0[IncomingMessage],
    Menu: electronLib.Anon_Action,
    MenuItem: org.scalablytyped.runtime.Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: electronLib.Anon_IsSupported,
    TouchBar: electronLib.Anon_Options,
    Tray: org.scalablytyped.runtime.Instantiable1[/* image */ NativeImage | java.lang.String, Tray],
    WebRequest: org.scalablytyped.runtime.Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    dialog: Dialog,
    getCurrentWebContents: () => WebContents,
    getCurrentWindow: () => BrowserWindow,
    getGlobal: java.lang.String => js.Any,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: electronLib.Anon_Buffer,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    require: java.lang.String => js.Any,
    screen: Screen,
    session: electronLib.Anon_DefaultSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: electronLib.Anon_FromIdGetAllWebContents,
    process: js.Any = null
  ): Remote = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView, BrowserWindow = BrowserWindow, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, Notification = Notification, TouchBar = TouchBar, Tray = Tray, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, dialog = dialog, getCurrentWebContents = js.Any.fromFunction0(getCurrentWebContents), getCurrentWindow = js.Any.fromFunction0(getCurrentWindow), getGlobal = js.Any.fromFunction1(getGlobal), globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, nativeImage = nativeImage, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, require = js.Any.fromFunction1(require), screen = screen, session = session, shell = shell, systemPreferences = systemPreferences, webContents = webContents)
    if (process != null) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[Remote]
  }
}

