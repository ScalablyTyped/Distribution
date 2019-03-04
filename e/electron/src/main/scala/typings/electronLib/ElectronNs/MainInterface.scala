package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainInterface extends CommonInterface {
  var BrowserView: electronLib.Anon_FromId
  var BrowserWindow: electronLib.Anon_AddDevToolsExtension
  var ClientRequest: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
    ClientRequest
  ]
  var Cookies: org.scalablytyped.runtime.Instantiable0[Cookies]
  var Debugger: org.scalablytyped.runtime.Instantiable0[Debugger]
  var DownloadItem: org.scalablytyped.runtime.Instantiable0[DownloadItem]
  var IncomingMessage: org.scalablytyped.runtime.Instantiable0[IncomingMessage]
  var Menu: electronLib.Anon_Action
  var MenuItem: org.scalablytyped.runtime.Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]
  var Notification: electronLib.Anon_IsSupported
  var TouchBar: electronLib.Anon_Options
  var Tray: org.scalablytyped.runtime.Instantiable1[/* image */ NativeImage | java.lang.String, Tray]
  var WebRequest: org.scalablytyped.runtime.Instantiable0[WebRequest]
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
  var session: electronLib.Anon_DefaultSession
  var systemPreferences: SystemPreferences
  var webContents: electronLib.Anon_FromIdGetAllWebContents
}

object MainInterface {
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
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: electronLib.Anon_Buffer,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: electronLib.Anon_DefaultSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: electronLib.Anon_FromIdGetAllWebContents
  ): MainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView, BrowserWindow = BrowserWindow, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, Notification = Notification, TouchBar = TouchBar, Tray = Tray, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, dialog = dialog, globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, nativeImage = nativeImage, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, screen = screen, session = session, shell = shell, systemPreferences = systemPreferences, webContents = webContents)
  
    __obj.asInstanceOf[MainInterface]
  }
}

