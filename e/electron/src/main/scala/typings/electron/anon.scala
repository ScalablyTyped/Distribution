package typings.electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.BrowserView
import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.Common.Clipboard
import typings.electron.Electron.Common.CrashReporter
import typings.electron.Electron.Common.Shell
import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.electron.Electron.CrossProcessExports.App
import typings.electron.Electron.CrossProcessExports.AutoUpdater
import typings.electron.Electron.CrossProcessExports.ContentTracing
import typings.electron.Electron.CrossProcessExports.ContextBridge
import typings.electron.Electron.CrossProcessExports.DesktopCapturer
import typings.electron.Electron.CrossProcessExports.Dialog
import typings.electron.Electron.CrossProcessExports.GlobalShortcut
import typings.electron.Electron.CrossProcessExports.InAppPurchase
import typings.electron.Electron.CrossProcessExports.IpcMain
import typings.electron.Electron.CrossProcessExports.IpcRenderer
import typings.electron.Electron.CrossProcessExports.Menu
import typings.electron.Electron.CrossProcessExports.MenuItem
import typings.electron.Electron.CrossProcessExports.MessageChannelMain
import typings.electron.Electron.CrossProcessExports.NativeTheme
import typings.electron.Electron.CrossProcessExports.Net
import typings.electron.Electron.CrossProcessExports.NetLog
import typings.electron.Electron.CrossProcessExports.Notification
import typings.electron.Electron.CrossProcessExports.PowerMonitor
import typings.electron.Electron.CrossProcessExports.PowerSaveBlocker
import typings.electron.Electron.CrossProcessExports.Protocol
import typings.electron.Electron.CrossProcessExports.PushNotifications
import typings.electron.Electron.CrossProcessExports.SafeStorage
import typings.electron.Electron.CrossProcessExports.Screen
import typings.electron.Electron.CrossProcessExports.ShareMenu
import typings.electron.Electron.CrossProcessExports.SystemPreferences
import typings.electron.Electron.CrossProcessExports.TouchBar
import typings.electron.Electron.CrossProcessExports.Tray
import typings.electron.Electron.CrossProcessExports.WebFrame
import typings.electron.Electron.FromPartitionOptions
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.Session_
import typings.electron.Electron.Size
import typings.electron.Electron.WebContents_
import typings.electron.Electron.WebFrameMain_
import typings.electron.electronStrings.allow
import typings.electron.electronStrings.deny
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: deny
  }
  object Action {
    
    inline def apply(): Action = {
      val __obj = js.Dynamic.literal(action = "deny")
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: deny): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverrideBrowserWindowOptions extends StObject {
    
    var action: allow
    
    var overrideBrowserWindowOptions: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
  }
  object OverrideBrowserWindowOptions {
    
    inline def apply(): OverrideBrowserWindowOptions = {
      val __obj = js.Dynamic.literal(action = "allow")
      __obj.asInstanceOf[OverrideBrowserWindowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverrideBrowserWindowOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: allow): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setOverrideBrowserWindowOptions(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "overrideBrowserWindowOptions", value.asInstanceOf[js.Any])
      
      inline def setOverrideBrowserWindowOptionsUndefined: Self = StObject.set(x, "overrideBrowserWindowOptions", js.undefined)
    }
  }
  
  /* Inlined std.Partial<electron.Electron.Rectangle> */
  trait PartialRectangle extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialRectangle {
    
    inline def apply(): PartialRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRectangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRectangle] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait TypeofBrowserWindow extends StObject {
    
    /**
      * The window that owns the given `browserView`. If the given view is not attached
      * to any window, returns `null`.
      */
    /* static member */
    def fromBrowserView(browserView: BrowserView): BrowserWindow | Null
    
    /**
      * The window with the given `id`.
      */
    /* static member */
    def fromId(id: Double): BrowserWindow | Null
    
    /**
      * The window that owns the given `webContents` or `null` if the contents are not
      * owned by a window.
      */
    /* static member */
    def fromWebContents(webContents: WebContents_): BrowserWindow | Null
    
    /**
      * An array of all opened browser windows.
      */
    /* static member */
    def getAllWindows(): js.Array[BrowserWindow]
    
    /**
      * The window that is focused in this application, otherwise returns `null`.
      */
    /* static member */
    def getFocusedWindow(): BrowserWindow | Null
  }
  object TypeofBrowserWindow {
    
    inline def apply(
      fromBrowserView: BrowserView => BrowserWindow | Null,
      fromId: Double => BrowserWindow | Null,
      fromWebContents: WebContents_ => BrowserWindow | Null,
      getAllWindows: () => js.Array[BrowserWindow],
      getFocusedWindow: () => BrowserWindow | Null
    ): TypeofBrowserWindow = {
      val __obj = js.Dynamic.literal(fromBrowserView = js.Any.fromFunction1(fromBrowserView), fromId = js.Any.fromFunction1(fromId), fromWebContents = js.Any.fromFunction1(fromWebContents), getAllWindows = js.Any.fromFunction0(getAllWindows), getFocusedWindow = js.Any.fromFunction0(getFocusedWindow))
      __obj.asInstanceOf[TypeofBrowserWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofBrowserWindow] (val x: Self) extends AnyVal {
      
      inline def setFromBrowserView(value: BrowserView => BrowserWindow | Null): Self = StObject.set(x, "fromBrowserView", js.Any.fromFunction1(value))
      
      inline def setFromId(value: Double => BrowserWindow | Null): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      inline def setFromWebContents(value: WebContents_ => BrowserWindow | Null): Self = StObject.set(x, "fromWebContents", js.Any.fromFunction1(value))
      
      inline def setGetAllWindows(value: () => js.Array[BrowserWindow]): Self = StObject.set(x, "getAllWindows", js.Any.fromFunction0(value))
      
      inline def setGetFocusedWindow(value: () => BrowserWindow | Null): Self = StObject.set(x, "getFocusedWindow", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofCommon extends StObject {
    
    val clipboard: Clipboard
    
    val crashReporter: CrashReporter
    
    val shell: Shell
  }
  object TypeofCommon {
    
    inline def apply(clipboard: Clipboard, crashReporter: CrashReporter, shell: Shell): TypeofCommon = {
      val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCommon] (val x: Self) extends AnyVal {
      
      inline def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      inline def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofCrossProcessExports extends StObject {
    
    var BrowserView: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserView]
    
    var BrowserWindow: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserWindow]
    
    var Menu: Instantiable0[typings.electron.Electron.CrossProcessExports.Menu]
    
    var MenuItem: Instantiable0[typings.electron.Electron.CrossProcessExports.MenuItem]
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.CrossProcessExports.MessageChannelMain]
    
    var Notification: Instantiable0[typings.electron.Electron.CrossProcessExports.Notification]
    
    var ShareMenu: Instantiable0[typings.electron.Electron.CrossProcessExports.ShareMenu]
    
    var TouchBar: Instantiable0[typings.electron.Electron.CrossProcessExports.TouchBar]
    
    var Tray: Instantiable0[typings.electron.Electron.CrossProcessExports.Tray]
    
    val app: App
    
    val autoUpdater: AutoUpdater
    
    val clipboard: typings.electron.Electron.CrossProcessExports.Clipboard
    
    val contentTracing: ContentTracing
    
    val contextBridge: ContextBridge
    
    val crashReporter: typings.electron.Electron.CrossProcessExports.CrashReporter
    
    val desktopCapturer: DesktopCapturer
    
    val dialog: Dialog
    
    val globalShortcut: GlobalShortcut
    
    val inAppPurchase: InAppPurchase
    
    val ipcMain: IpcMain
    
    val ipcRenderer: IpcRenderer
    
    val nativeTheme: NativeTheme
    
    val net: Net
    
    val netLog: NetLog
    
    val powerMonitor: PowerMonitor
    
    val powerSaveBlocker: PowerSaveBlocker
    
    val protocol: Protocol
    
    val pushNotifications: PushNotifications
    
    val safeStorage: SafeStorage
    
    val screen: Screen
    
    val shell: typings.electron.Electron.CrossProcessExports.Shell
    
    val systemPreferences: SystemPreferences
    
    val webFrame: WebFrame
  }
  object TypeofCrossProcessExports {
    
    inline def apply(
      BrowserView: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserView],
      BrowserWindow: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserWindow],
      Menu: Instantiable0[Menu],
      MenuItem: Instantiable0[MenuItem],
      MessageChannelMain: Instantiable0[MessageChannelMain],
      Notification: Instantiable0[Notification],
      ShareMenu: Instantiable0[ShareMenu],
      TouchBar: Instantiable0[TouchBar],
      Tray: Instantiable0[Tray],
      app: App,
      autoUpdater: AutoUpdater,
      clipboard: typings.electron.Electron.CrossProcessExports.Clipboard,
      contentTracing: ContentTracing,
      contextBridge: ContextBridge,
      crashReporter: typings.electron.Electron.CrossProcessExports.CrashReporter,
      desktopCapturer: DesktopCapturer,
      dialog: Dialog,
      globalShortcut: GlobalShortcut,
      inAppPurchase: InAppPurchase,
      ipcMain: IpcMain,
      ipcRenderer: IpcRenderer,
      nativeTheme: NativeTheme,
      net: Net,
      netLog: NetLog,
      powerMonitor: PowerMonitor,
      powerSaveBlocker: PowerSaveBlocker,
      protocol: Protocol,
      pushNotifications: PushNotifications,
      safeStorage: SafeStorage,
      screen: Screen,
      shell: typings.electron.Electron.CrossProcessExports.Shell,
      systemPreferences: SystemPreferences,
      webFrame: WebFrame
    ): TypeofCrossProcessExports = {
      val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ShareMenu = ShareMenu.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], pushNotifications = pushNotifications.asInstanceOf[js.Any], safeStorage = safeStorage.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCrossProcessExports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCrossProcessExports] (val x: Self) extends AnyVal {
      
      inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      inline def setBrowserView(value: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindow(value: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserWindow]): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      inline def setClipboard(value: typings.electron.Electron.CrossProcessExports.Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      inline def setContextBridge(value: ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      inline def setCrashReporter(value: typings.electron.Electron.CrossProcessExports.CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      inline def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      inline def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      inline def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      inline def setIpcRenderer(value: IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Instantiable0[Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuItem(value: Instantiable0[MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      inline def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      inline def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      inline def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      inline def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: Instantiable0[Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      inline def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      inline def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPushNotifications(value: PushNotifications): Self = StObject.set(x, "pushNotifications", value.asInstanceOf[js.Any])
      
      inline def setSafeStorage(value: SafeStorage): Self = StObject.set(x, "safeStorage", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setShareMenu(value: Instantiable0[ShareMenu]): Self = StObject.set(x, "ShareMenu", value.asInstanceOf[js.Any])
      
      inline def setShell(value: typings.electron.Electron.CrossProcessExports.Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      inline def setTouchBar(value: Instantiable0[TouchBar]): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      inline def setTray(value: Instantiable0[Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
      
      inline def setWebFrame(value: WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofMain extends StObject {
    
    var BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView]
    
    var BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow]
    
    var Menu: Instantiable0[typings.electron.Electron.Main.Menu]
    
    var MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem]
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain]
    
    var Notification: Instantiable0[typings.electron.Electron.Main.Notification]
    
    var ShareMenu: Instantiable0[typings.electron.Electron.Main.ShareMenu]
    
    var TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar]
    
    var Tray: Instantiable0[typings.electron.Electron.Main.Tray]
    
    val app: typings.electron.Electron.Main.App
    
    val autoUpdater: typings.electron.Electron.Main.AutoUpdater
    
    val contentTracing: typings.electron.Electron.Main.ContentTracing
    
    val desktopCapturer: typings.electron.Electron.Main.DesktopCapturer
    
    val dialog: typings.electron.Electron.Main.Dialog
    
    val globalShortcut: typings.electron.Electron.Main.GlobalShortcut
    
    val inAppPurchase: typings.electron.Electron.Main.InAppPurchase
    
    val ipcMain: typings.electron.Electron.Main.IpcMain
    
    val nativeTheme: typings.electron.Electron.Main.NativeTheme
    
    val net: typings.electron.Electron.Main.Net
    
    val netLog: typings.electron.Electron.Main.NetLog
    
    val powerMonitor: typings.electron.Electron.Main.PowerMonitor
    
    val powerSaveBlocker: typings.electron.Electron.Main.PowerSaveBlocker
    
    val protocol: typings.electron.Electron.Main.Protocol
    
    val pushNotifications: typings.electron.Electron.Main.PushNotifications
    
    val safeStorage: typings.electron.Electron.Main.SafeStorage
    
    val screen: typings.electron.Electron.Main.Screen
    
    val systemPreferences: typings.electron.Electron.Main.SystemPreferences
  }
  object TypeofMain {
    
    inline def apply(
      BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView],
      BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow],
      Menu: Instantiable0[typings.electron.Electron.Main.Menu],
      MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem],
      MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain],
      Notification: Instantiable0[typings.electron.Electron.Main.Notification],
      ShareMenu: Instantiable0[typings.electron.Electron.Main.ShareMenu],
      TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar],
      Tray: Instantiable0[typings.electron.Electron.Main.Tray],
      app: typings.electron.Electron.Main.App,
      autoUpdater: typings.electron.Electron.Main.AutoUpdater,
      contentTracing: typings.electron.Electron.Main.ContentTracing,
      desktopCapturer: typings.electron.Electron.Main.DesktopCapturer,
      dialog: typings.electron.Electron.Main.Dialog,
      globalShortcut: typings.electron.Electron.Main.GlobalShortcut,
      inAppPurchase: typings.electron.Electron.Main.InAppPurchase,
      ipcMain: typings.electron.Electron.Main.IpcMain,
      nativeTheme: typings.electron.Electron.Main.NativeTheme,
      net: typings.electron.Electron.Main.Net,
      netLog: typings.electron.Electron.Main.NetLog,
      powerMonitor: typings.electron.Electron.Main.PowerMonitor,
      powerSaveBlocker: typings.electron.Electron.Main.PowerSaveBlocker,
      protocol: typings.electron.Electron.Main.Protocol,
      pushNotifications: typings.electron.Electron.Main.PushNotifications,
      safeStorage: typings.electron.Electron.Main.SafeStorage,
      screen: typings.electron.Electron.Main.Screen,
      systemPreferences: typings.electron.Electron.Main.SystemPreferences
    ): TypeofMain = {
      val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ShareMenu = ShareMenu.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], pushNotifications = pushNotifications.asInstanceOf[js.Any], safeStorage = safeStorage.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofMain] (val x: Self) extends AnyVal {
      
      inline def setApp(value: typings.electron.Electron.Main.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdater(value: typings.electron.Electron.Main.AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      inline def setBrowserView(value: Instantiable0[typings.electron.Electron.Main.BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindow(value: Instantiable0[typings.electron.Electron.Main.BrowserWindow]): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      inline def setContentTracing(value: typings.electron.Electron.Main.ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      inline def setDesktopCapturer(value: typings.electron.Electron.Main.DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: typings.electron.Electron.Main.Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setGlobalShortcut(value: typings.electron.Electron.Main.GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      inline def setInAppPurchase(value: typings.electron.Electron.Main.InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      inline def setIpcMain(value: typings.electron.Electron.Main.IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Instantiable0[typings.electron.Electron.Main.Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuItem(value: Instantiable0[typings.electron.Electron.Main.MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      inline def setMessageChannelMain(value: Instantiable0[typings.electron.Electron.Main.MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      inline def setNativeTheme(value: typings.electron.Electron.Main.NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      inline def setNet(value: typings.electron.Electron.Main.Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      inline def setNetLog(value: typings.electron.Electron.Main.NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: Instantiable0[typings.electron.Electron.Main.Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      inline def setPowerMonitor(value: typings.electron.Electron.Main.PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      inline def setPowerSaveBlocker(value: typings.electron.Electron.Main.PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: typings.electron.Electron.Main.Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPushNotifications(value: typings.electron.Electron.Main.PushNotifications): Self = StObject.set(x, "pushNotifications", value.asInstanceOf[js.Any])
      
      inline def setSafeStorage(value: typings.electron.Electron.Main.SafeStorage): Self = StObject.set(x, "safeStorage", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: typings.electron.Electron.Main.Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setShareMenu(value: Instantiable0[typings.electron.Electron.Main.ShareMenu]): Self = StObject.set(x, "ShareMenu", value.asInstanceOf[js.Any])
      
      inline def setSystemPreferences(value: typings.electron.Electron.Main.SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      inline def setTouchBar(value: Instantiable0[typings.electron.Electron.Main.TouchBar]): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      inline def setTray(value: Instantiable0[typings.electron.Electron.Main.Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMenu extends StObject {
    
    /**
      * Generally, the `template` is an array of `options` for constructing a MenuItem.
      * The usage can be referenced above.
      *
      * You can also attach other fields to the element of the `template` and they will
      * become properties of the constructed menu items.
      */
    /* static member */
    def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | typings.electron.Electron.MenuItem]): typings.electron.Electron.Menu = js.native
    
    /**
      * The application menu, if set, or `null`, if not set.
      *
      * **Note:** The returned `Menu` instance doesn't support dynamic addition or
      * removal of menu items. Instance properties can still be dynamically modified.
      */
    /* static member */
    def getApplicationMenu(): typings.electron.Electron.Menu | Null = js.native
    
    /**
      * Sends the `action` to the first responder of application. This is used for
      * emulating default macOS menu behaviors. Usually you would use the `role`
      * property of a `MenuItem`.
      *
      * See the macOS Cocoa Event Handling Guide for more information on macOS' native
      * actions.
      *
      * @platform darwin
      */
    /* static member */
    def sendActionToFirstResponder(action: String): Unit = js.native
    
    /**
      * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
      * will be set as each window's top menu.
      *
      * Also on Windows and Linux, you can use a `&` in the top-level item name to
      * indicate which letter should get a generated accelerator. For example, using
      * `&File` for the file menu would result in a generated `Alt-F` accelerator that
      * opens the associated menu. The indicated character in the button label then gets
      * an underline, and the `&` character is not displayed on the button label.
      *
      * In order to escape the `&` character in an item name, add a proceeding `&`. For
      * example, `&&File` would result in `&File` displayed on the button label.
      *
      * Passing `null` will suppress the default menu. On Windows and Linux, this has
      * the additional effect of removing the menu bar from the window.
      *
      * **Note:** The default menu will be created automatically if the app does not set
      * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
      * `Help`.
      */
    /* static member */
    def setApplicationMenu(): Unit = js.native
    def setApplicationMenu(menu: typings.electron.Electron.Menu): Unit = js.native
  }
  
  @js.native
  trait TypeofNativeImage extends StObject {
    
    // Docs: https://electronjs.org/docs/api/native-image
    /**
      * Creates an empty `NativeImage` instance.
      */
    /* static member */
    def createEmpty(): NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
      * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
      */
    /* static member */
    def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
      * JPEG first.
      */
    /* static member */
    def createFromBuffer(buffer: Buffer): NativeImage_ = js.native
    def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `dataURL`.
      */
    /* static member */
    def createFromDataURL(dataURL: String): NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from the NSImage that maps to the given
      * image name. See `System Icons` for a list of possible values.
      *
      * The `hslShift` is applied to the image with the following rules:
      *
      * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
      * and 360 on the hue color wheel (red).
      * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
      * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
      * saturate the image.
      * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
      * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
      * leave unchanged. 1 = full lightness (make all pixels white).
      *
      * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
      * 0]` will make the image completely black.
      *
      * In some cases, the `NSImageName` doesn't match its string representation; one
      * example of this is `NSFolderImageName`, whose string representation would
      * actually be `NSFolder`. Therefore, you'll need to determine the correct string
      * representation for your image before passing it in. This can be done with the
      * following:
      *
      * `echo -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME);
      * }' | clang -otest -x objective-c -framework Cocoa - && ./test`
      *
      * where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
      *
      * @platform darwin
      */
    /* static member */
    def createFromNamedImage(imageName: String): NativeImage_ = js.native
    def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from a file located at `path`. This method
      * returns an empty image if the `path` does not exist, cannot be read, or is not a
      * valid image.
      */
    /* static member */
    def createFromPath(path: String): NativeImage_ = js.native
    
    /**
      * fulfilled with the file's thumbnail preview image, which is a NativeImage.
      *
      * @platform darwin,win32
      */
    /* static member */
    def createThumbnailFromPath(path: String, maxSize: Size): js.Promise[NativeImage_] = js.native
  }
  
  trait TypeofNotification extends StObject {
    
    /**
      * Whether or not desktop notifications are supported on the current system
      */
    /* static member */
    def isSupported(): Boolean
  }
  object TypeofNotification {
    
    inline def apply(isSupported: () => Boolean): TypeofNotification = {
      val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction0(isSupported))
      __obj.asInstanceOf[TypeofNotification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofNotification] (val x: Self) extends AnyVal {
      
      inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofRenderer extends StObject {
    
    val contextBridge: typings.electron.Electron.Renderer.ContextBridge
    
    val ipcRenderer: typings.electron.Electron.Renderer.IpcRenderer
    
    val webFrame: typings.electron.Electron.Renderer.WebFrame
  }
  object TypeofRenderer {
    
    inline def apply(
      contextBridge: typings.electron.Electron.Renderer.ContextBridge,
      ipcRenderer: typings.electron.Electron.Renderer.IpcRenderer,
      webFrame: typings.electron.Electron.Renderer.WebFrame
    ): TypeofRenderer = {
      val __obj = js.Dynamic.literal(contextBridge = contextBridge.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofRenderer] (val x: Self) extends AnyVal {
      
      inline def setContextBridge(value: typings.electron.Electron.Renderer.ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      inline def setIpcRenderer(value: typings.electron.Electron.Renderer.IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      inline def setWebFrame(value: typings.electron.Electron.Renderer.WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofSession extends StObject {
    
    /**
      * A `Session` object, the default session object of the app.
      */
    /* static member */
    var defaultSession: Session_ = js.native
    
    // Docs: https://electronjs.org/docs/api/session
    /**
      * A session instance from `partition` string. When there is an existing `Session`
      * with the same `partition`, it will be returned; otherwise a new `Session`
      * instance will be created with `options`.
      *
      * If `partition` starts with `persist:`, the page will use a persistent session
      * available to all pages in the app with the same `partition`. if there is no
      * `persist:` prefix, the page will use an in-memory session. If the `partition` is
      * empty then default session of the app will be returned.
      *
      * To create a `Session` with `options`, you have to ensure the `Session` with the
      * `partition` has never been used before. There is no way to change the `options`
      * of an existing `Session` object.
      */
    /* static member */
    def fromPartition(partition: String): Session_ = js.native
    def fromPartition(partition: String, options: FromPartitionOptions): Session_ = js.native
  }
  
  trait TypeofTouchBar extends StObject
  
  trait TypeofWebContents extends StObject {
    
    // Docs: https://electronjs.org/docs/api/web-contents
    /**
      * | undefined - A WebContents instance with the given TargetID, or `undefined` if
      * there is no WebContents associated with the given TargetID.
      *
      * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
      * a WebContents instance based on its assigned TargetID.
      */
    /* static member */
    def fromDevToolsTargetId(targetId: String): WebContents_
    
    /**
      * | undefined - A WebContents instance with the given WebFrameMain, or `undefined`
      * if there is no WebContents associated with the given WebFrameMain.
      */
    /* static member */
    def fromFrame(frame: WebFrameMain_): WebContents_
    
    /**
      * | undefined - A WebContents instance with the given ID, or `undefined` if there
      * is no WebContents associated with the given ID.
      */
    /* static member */
    def fromId(id: Double): WebContents_
    
    /**
      * An array of all `WebContents` instances. This will contain web contents for all
      * windows, webviews, opened devtools, and devtools extension background pages.
      */
    /* static member */
    def getAllWebContents(): js.Array[WebContents_]
    
    /**
      * | null - The web contents that is focused in this application, otherwise returns
      * `null`.
      */
    /* static member */
    def getFocusedWebContents(): WebContents_
  }
  object TypeofWebContents {
    
    inline def apply(
      fromDevToolsTargetId: String => WebContents_,
      fromFrame: WebFrameMain_ => WebContents_,
      fromId: Double => WebContents_,
      getAllWebContents: () => js.Array[WebContents_],
      getFocusedWebContents: () => WebContents_
    ): TypeofWebContents = {
      val __obj = js.Dynamic.literal(fromDevToolsTargetId = js.Any.fromFunction1(fromDevToolsTargetId), fromFrame = js.Any.fromFunction1(fromFrame), fromId = js.Any.fromFunction1(fromId), getAllWebContents = js.Any.fromFunction0(getAllWebContents), getFocusedWebContents = js.Any.fromFunction0(getFocusedWebContents))
      __obj.asInstanceOf[TypeofWebContents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofWebContents] (val x: Self) extends AnyVal {
      
      inline def setFromDevToolsTargetId(value: String => WebContents_): Self = StObject.set(x, "fromDevToolsTargetId", js.Any.fromFunction1(value))
      
      inline def setFromFrame(value: WebFrameMain_ => WebContents_): Self = StObject.set(x, "fromFrame", js.Any.fromFunction1(value))
      
      inline def setFromId(value: Double => WebContents_): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      inline def setGetAllWebContents(value: () => js.Array[WebContents_]): Self = StObject.set(x, "getAllWebContents", js.Any.fromFunction0(value))
      
      inline def setGetFocusedWebContents(value: () => WebContents_): Self = StObject.set(x, "getFocusedWebContents", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeofWebFrameMain extends StObject {
    
    // Docs: https://electronjs.org/docs/api/web-frame-main
    /**
      * A frame with the given process and routing IDs, or `undefined` if there is no
      * WebFrameMain associated with the given IDs.
      */
    /* static member */
    def fromId(processId: Double, routingId: Double): js.UndefOr[WebFrameMain_]
  }
  object TypeofWebFrameMain {
    
    inline def apply(fromId: (Double, Double) => js.UndefOr[WebFrameMain_]): TypeofWebFrameMain = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction2(fromId))
      __obj.asInstanceOf[TypeofWebFrameMain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofWebFrameMain] (val x: Self) extends AnyVal {
      
      inline def setFromId(value: (Double, Double) => js.UndefOr[WebFrameMain_]): Self = StObject.set(x, "fromId", js.Any.fromFunction2(value))
    }
  }
}
