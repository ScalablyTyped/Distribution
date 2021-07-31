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
  
  var ClientRequest: Instantiable1[
    /* options */ ClientRequestConstructorOptions | String, 
    typings.electron.Electron.ClientRequest
  ]
  
  var CommandLine: Instantiable0[typings.electron.Electron.CommandLine]
  
  var Cookies: Instantiable0[typings.electron.Electron.Cookies]
  
  var Debugger: Instantiable0[typings.electron.Electron.Debugger]
  
  var Dock: Instantiable0[typings.electron.Electron.Dock]
  
  var DownloadItem: Instantiable0[typings.electron.Electron.DownloadItem]
  
  var IncomingMessage: Instantiable0[typings.electron.Electron.IncomingMessage]
  
  var Menu: TypeofMenu & Instantiable0[typings.electron.Electron.Menu]
  
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem]
  
  var MessageChannelMain: Instantiable0[typings.electron.Electron.MessageChannelMain]
  
  var MessagePortMain: Instantiable0[typings.electron.Electron.MessagePortMain]
  
  var Notification: TypeofNotification & (Instantiable1[
    /* options */ js.UndefOr[NotificationConstructorOptions], 
    typings.electron.Electron.Notification
  ])
  
  var ServiceWorkers: Instantiable0[typings.electron.Electron.ServiceWorkers]
  
  var TouchBar: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, typings.electron.Electron.TouchBar])
  
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.Electron.TouchBarButton
  ]
  
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.Electron.TouchBarColorPicker
  ]
  
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.Electron.TouchBarGroup
  ]
  
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.Electron.TouchBarLabel
  ]
  
  var TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.TouchBarOtherItemsProxy]
  
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.Electron.TouchBarPopover
  ]
  
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.Electron.TouchBarScrubber
  ]
  
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.Electron.TouchBarSegmentedControl
  ]
  
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.Electron.TouchBarSlider
  ]
  
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.Electron.TouchBarSpacer
  ]
  
  var Tray: Instantiable2[
    /* image */ NativeImage_ | String, 
    /* guid */ js.UndefOr[String], 
    typings.electron.Electron.Tray
  ]
  
  var WebRequest: Instantiable0[typings.electron.Electron.WebRequest]
  
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
  
  var screen: Screen
  
  var session: TypeofSession & Instantiable0[Session_]
  
  var shell: Shell
  
  var systemPreferences: SystemPreferences
  
  var webContents: TypeofWebContents & Instantiable0[WebContents_]
}
object RemoteMainInterface {
  
  @scala.inline
  def apply(
    BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
    BrowserWindow: TypeofBrowserWindow & (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]),
    ClientRequest: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest],
    CommandLine: Instantiable0[CommandLine],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    Dock: Instantiable0[Dock],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu & Instantiable0[Menu],
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    MessageChannelMain: Instantiable0[MessageChannelMain],
    MessagePortMain: Instantiable0[MessagePortMain],
    Notification: TypeofNotification & (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]),
    ServiceWorkers: Instantiable0[ServiceWorkers],
    TouchBar: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]),
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarOtherItemsProxy: Instantiable0[TouchBarOtherItemsProxy],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray],
    WebRequest: Instantiable0[WebRequest],
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
    screen: Screen,
    session: TypeofSession & Instantiable0[Session_],
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents & Instantiable0[WebContents_]
  ): RemoteMainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarOtherItemsProxy = TouchBarOtherItemsProxy.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMainInterface]
  }
  
  @scala.inline
  implicit class RemoteMainInterfaceMutableBuilder[Self <: RemoteMainInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserView(value: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserWindow(
      value: TypeofBrowserWindow & (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow])
    ): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequest(value: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest]): Self = StObject.set(x, "ClientRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLine(value: Instantiable0[CommandLine]): Self = StObject.set(x, "CommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: Instantiable0[Cookies]): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugger(value: Instantiable0[Debugger]): Self = StObject.set(x, "Debugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDock(value: Instantiable0[Dock]): Self = StObject.set(x, "Dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadItem(value: Instantiable0[DownloadItem]): Self = StObject.set(x, "DownloadItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingMessage(value: Instantiable0[IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: TypeofMenu & Instantiable0[Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePortMain(value: Instantiable0[MessagePortMain]): Self = StObject.set(x, "MessagePortMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeImage(value: TypeofNativeImage & Instantiable0[NativeImage_]): Self = StObject.set(x, "nativeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(
      value: TypeofNotification & (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification])
    ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkers(value: Instantiable0[ServiceWorkers]): Self = StObject.set(x, "ServiceWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: TypeofSession & Instantiable0[Session_]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBar(value: TypeofTouchBar & (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar])): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarButton(value: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton]): Self = StObject.set(x, "TouchBarButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarColorPicker(value: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker]): Self = StObject.set(x, "TouchBarColorPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarGroup(value: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup]): Self = StObject.set(x, "TouchBarGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarLabel(value: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel]): Self = StObject.set(x, "TouchBarLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarOtherItemsProxy(value: Instantiable0[TouchBarOtherItemsProxy]): Self = StObject.set(x, "TouchBarOtherItemsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarPopover(value: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover]): Self = StObject.set(x, "TouchBarPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarScrubber(value: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber]): Self = StObject.set(x, "TouchBarScrubber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSegmentedControl(
      value: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl]
    ): Self = StObject.set(x, "TouchBarSegmentedControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSlider(value: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider]): Self = StObject.set(x, "TouchBarSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSpacer(value: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer]): Self = StObject.set(x, "TouchBarSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContents(value: TypeofWebContents & Instantiable0[WebContents_]): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequest(value: Instantiable0[WebRequest]): Self = StObject.set(x, "WebRequest", value.asInstanceOf[js.Any])
  }
}
