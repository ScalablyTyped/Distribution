package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.TypeofClassBrowserView
import typings.electron.TypeofClassBrowserWindow
import typings.electron.TypeofClassMenu
import typings.electron.TypeofClassNativeImage
import typings.electron.TypeofClassNotification
import typings.electron.TypeofClassSession
import typings.electron.TypeofClassTouchBar
import typings.electron.TypeofClassWebContents
import typings.electron.electronStrings.host
import typings.electron.electronStrings.hostname
import typings.electron.electronStrings.method
import typings.electron.electronStrings.partition
import typings.electron.electronStrings.path
import typings.electron.electronStrings.port
import typings.electron.electronStrings.protocol
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.url
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
  def getGlobal(name: String): js.Any
  /**
    * e.g.
    */
  def require(module: String): js.Any
}

object Remote {
  @scala.inline
  def apply(
    BrowserView: TypeofClassBrowserView,
    BrowserWindow: TypeofClassBrowserWindow,
    ClientRequest: Instantiable1[
      /* options */ method | url | typings.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofClassMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: TypeofClassNotification,
    TouchBar: TypeofClassTouchBar,
    Tray: Instantiable1[/* image */ NativeImage | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    dialog: Dialog,
    getCurrentWebContents: () => WebContents,
    getCurrentWindow: () => BrowserWindow,
    getGlobal: String => js.Any,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: TypeofClassNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    require: String => js.Any,
    screen: Screen,
    session: TypeofClassSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofClassWebContents,
    process: js.Any = null
  ): Remote = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView, BrowserWindow = BrowserWindow, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, Notification = Notification, TouchBar = TouchBar, Tray = Tray, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, dialog = dialog, getCurrentWebContents = js.Any.fromFunction0(getCurrentWebContents), getCurrentWindow = js.Any.fromFunction0(getCurrentWindow), getGlobal = js.Any.fromFunction1(getGlobal), globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, nativeImage = nativeImage, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, require = js.Any.fromFunction1(require), screen = screen, session = session, shell = shell, systemPreferences = systemPreferences, webContents = webContents)
    if (process != null) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[Remote]
  }
}

