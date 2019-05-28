package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- electronLib.ElectronNs.RendererInterface because var conflicts: clipboard, crashReporter, nativeImage, screen, shell. Inlined BrowserWindowProxy, desktopCapturer, ipcRenderer, remote, webFrame, webviewTag */ trait AllElectron extends MainInterface {
  var BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[BrowserWindowProxy]
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

object AllElectron {
  @scala.inline
  def apply(
    BrowserView: electronLib.TypeofClassBrowserView,
    BrowserWindow: electronLib.TypeofClassBrowserWindow,
    BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[BrowserWindowProxy],
    ClientRequest: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
      ClientRequest
    ],
    Cookies: org.scalablytyped.runtime.Instantiable0[Cookies],
    Debugger: org.scalablytyped.runtime.Instantiable0[Debugger],
    DownloadItem: org.scalablytyped.runtime.Instantiable0[DownloadItem],
    IncomingMessage: org.scalablytyped.runtime.Instantiable0[IncomingMessage],
    Menu: electronLib.TypeofClassMenu,
    MenuItem: org.scalablytyped.runtime.Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: electronLib.TypeofClassNotification,
    TouchBar: electronLib.TypeofClassTouchBar,
    Tray: org.scalablytyped.runtime.Instantiable1[/* image */ NativeImage | java.lang.String, Tray],
    WebRequest: org.scalablytyped.runtime.Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    dialog: Dialog,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    ipcRenderer: IpcRenderer,
    nativeImage: electronLib.TypeofClassNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    remote: Remote,
    screen: Screen,
    session: electronLib.TypeofClassSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: electronLib.TypeofClassWebContents,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): AllElectron = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView, BrowserWindow = BrowserWindow, BrowserWindowProxy = BrowserWindowProxy, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, Notification = Notification, TouchBar = TouchBar, Tray = Tray, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, desktopCapturer = desktopCapturer, dialog = dialog, globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, ipcRenderer = ipcRenderer, nativeImage = nativeImage, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, remote = remote, screen = screen, session = session, shell = shell, systemPreferences = systemPreferences, webContents = webContents, webFrame = webFrame, webviewTag = webviewTag)
  
    __obj.asInstanceOf[AllElectron]
  }
}

