package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.electron.anon.TypeofBrowserWindow
import typings.electron.anon.TypeofMenu
import typings.electron.anon.TypeofNativeImage
import typings.electron.anon.TypeofNotification
import typings.electron.anon.TypeofSession
import typings.electron.anon.TypeofTouchBar
import typings.electron.anon.TypeofWebContents
import typings.electron.anon.TypeofWebFrameMain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteMainInterface extends StObject {
  
  var BrowserView: Instantiable1[
    /* options */ js.UndefOr[BrowserViewConstructorOptions], 
    typings.electron.Electron.BrowserView
  ]
  
  var BrowserWindow: TypeofBrowserWindow & (Instantiable1[
    /* options */ js.UndefOr[BrowserWindowConstructorOptions], 
    typings.electron.Electron.BrowserWindow
  ])
  
  var Menu: TypeofMenu & Instantiable0[typings.electron.Electron.Menu]
  
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem]
  
  var MessageChannelMain: Instantiable0[typings.electron.Electron.MessageChannelMain]
  
  var Notification: TypeofNotification & (Instantiable1[
    /* options */ js.UndefOr[NotificationConstructorOptions], 
    typings.electron.Electron.Notification
  ])
  
  var ShareMenu: Instantiable1[/* sharingItem */ SharingItem, typings.electron.Electron.ShareMenu]
  
  var TouchBar: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, typings.electron.Electron.TouchBar])
  
  var Tray: Instantiable2[
    /* image */ NativeImage_ | String, 
    /* guid */ js.UndefOr[String], 
    typings.electron.Electron.Tray
  ]
  
  var app: App
  
  var autoUpdater: AutoUpdater
  
  var clipboard: Clipboard
  
  var contentTracing: ContentTracing
  
  var crashReporter: CrashReporter
  
  var desktopCapturer: DesktopCapturer
  
  var dialog: Dialog
  
  var globalShortcut: GlobalShortcut
  
  var inAppPurchase: InAppPurchase
  
  var ipcMain: IpcMain
  
  var nativeImage: TypeofNativeImage & Instantiable0[NativeImage_]
  
  var nativeTheme: NativeTheme
  
  var net: Net
  
  var netLog: NetLog
  
  var powerMonitor: PowerMonitor
  
  var powerSaveBlocker: PowerSaveBlocker
  
  var protocol: Protocol
  
  var pushNotifications: PushNotifications
  
  var safeStorage: SafeStorage
  
  var screen: Screen
  
  var session: TypeofSession & Instantiable0[Session_]
  
  var shell: Shell
  
  var systemPreferences: SystemPreferences
  
  var webContents: TypeofWebContents & Instantiable0[WebContents_]
  
  var webFrameMain: TypeofWebFrameMain & Instantiable0[WebFrameMain_]
}
object RemoteMainInterface {
  
  inline def apply(
    BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
    BrowserWindow: TypeofBrowserWindow & (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]),
    Menu: TypeofMenu & Instantiable0[Menu],
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    MessageChannelMain: Instantiable0[MessageChannelMain],
    Notification: TypeofNotification & (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]),
    ShareMenu: Instantiable1[/* sharingItem */ SharingItem, ShareMenu],
    TouchBar: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]),
    Tray: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray],
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
    nativeImage: TypeofNativeImage & Instantiable0[NativeImage_],
    nativeTheme: NativeTheme,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    pushNotifications: PushNotifications,
    safeStorage: SafeStorage,
    screen: Screen,
    session: TypeofSession & Instantiable0[Session_],
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents & Instantiable0[WebContents_],
    webFrameMain: TypeofWebFrameMain & Instantiable0[WebFrameMain_]
  ): RemoteMainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ShareMenu = ShareMenu.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], pushNotifications = pushNotifications.asInstanceOf[js.Any], safeStorage = safeStorage.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrameMain = webFrameMain.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMainInterface]
  }
  
  extension [Self <: RemoteMainInterface](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
    
    inline def setBrowserView(value: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
    
    inline def setBrowserWindow(
      value: TypeofBrowserWindow & (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow])
    ): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
    
    inline def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
    
    inline def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
    
    inline def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
    
    inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
    
    inline def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: TypeofMenu & Instantiable0[Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
    
    inline def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
    
    inline def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
    
    inline def setNativeImage(value: TypeofNativeImage & Instantiable0[NativeImage_]): Self = StObject.set(x, "nativeImage", value.asInstanceOf[js.Any])
    
    inline def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
    
    inline def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
    
    inline def setNotification(
      value: TypeofNotification & (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification])
    ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
    
    inline def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setPushNotifications(value: PushNotifications): Self = StObject.set(x, "pushNotifications", value.asInstanceOf[js.Any])
    
    inline def setSafeStorage(value: SafeStorage): Self = StObject.set(x, "safeStorage", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setSession(value: TypeofSession & Instantiable0[Session_]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setShareMenu(value: Instantiable1[/* sharingItem */ SharingItem, ShareMenu]): Self = StObject.set(x, "ShareMenu", value.asInstanceOf[js.Any])
    
    inline def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
    
    inline def setTouchBar(value: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar])): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
    
    inline def setTray(value: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
    
    inline def setWebContents(value: TypeofWebContents & Instantiable0[WebContents_]): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
    
    inline def setWebFrameMain(value: TypeofWebFrameMain & Instantiable0[WebFrameMain_]): Self = StObject.set(x, "webFrameMain", value.asInstanceOf[js.Any])
  }
}
