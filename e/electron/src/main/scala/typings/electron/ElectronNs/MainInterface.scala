package typings.electron.ElectronNs

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

trait MainInterface extends CommonInterface {
  var BrowserView: TypeofClassBrowserView
  var BrowserWindow: TypeofClassBrowserWindow
  var ClientRequest: Instantiable1[
    /* options */ method | url | typings.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect, 
    typings.electron.ElectronNs.ClientRequest
  ]
  var Cookies: Instantiable0[typings.electron.ElectronNs.Cookies]
  var Debugger: Instantiable0[typings.electron.ElectronNs.Debugger]
  var DownloadItem: Instantiable0[typings.electron.ElectronNs.DownloadItem]
  var IncomingMessage: Instantiable0[typings.electron.ElectronNs.IncomingMessage]
  var Menu: TypeofClassMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.ElectronNs.MenuItem]
  var Notification: TypeofClassNotification
  var TouchBar: TypeofClassTouchBar
  var Tray: Instantiable1[/* image */ NativeImage | String, typings.electron.ElectronNs.Tray]
  var WebRequest: Instantiable0[typings.electron.ElectronNs.WebRequest]
  var app: App
  var autoUpdater: AutoUpdater
  var contentTracing: ContentTracing
  var dialog: Dialog
  var globalShortcut: GlobalShortcut
  var inAppPurchase: InAppPurchase
  var ipcMain: IpcMain
  var net: Net
  var netLog: NetLog
  var powerMonitor: PowerMonitor
  var powerSaveBlocker: PowerSaveBlocker
  var protocol: Protocol
  var screen: Screen
  var session: TypeofClassSession
  var systemPreferences: SystemPreferences
  var webContents: TypeofClassWebContents
}

object MainInterface {
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
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: TypeofClassNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: TypeofClassSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofClassWebContents
  ): MainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView, BrowserWindow = BrowserWindow, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, Notification = Notification, TouchBar = TouchBar, Tray = Tray, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, dialog = dialog, globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, nativeImage = nativeImage, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, screen = screen, session = session, shell = shell, systemPreferences = systemPreferences, webContents = webContents)
  
    __obj.asInstanceOf[MainInterface]
  }
}

