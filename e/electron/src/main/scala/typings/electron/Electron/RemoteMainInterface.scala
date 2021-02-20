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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteMainInterface extends StObject {
  
  var BrowserView: Instantiable1[
    /* options */ js.UndefOr[BrowserViewConstructorOptions], 
    typings.electron.Electron.BrowserView
  ] = js.native
  
  var BrowserWindow: TypeofBrowserWindow with (Instantiable1[
    /* options */ js.UndefOr[BrowserWindowConstructorOptions], 
    typings.electron.Electron.BrowserWindow
  ]) = js.native
  
  var ClientRequest: Instantiable1[
    /* options */ ClientRequestConstructorOptions | String, 
    typings.electron.Electron.ClientRequest
  ] = js.native
  
  var CommandLine: Instantiable0[typings.electron.Electron.CommandLine] = js.native
  
  var Cookies: Instantiable0[typings.electron.Electron.Cookies] = js.native
  
  var Debugger: Instantiable0[typings.electron.Electron.Debugger] = js.native
  
  var Dock: Instantiable0[typings.electron.Electron.Dock] = js.native
  
  var DownloadItem: Instantiable0[typings.electron.Electron.DownloadItem] = js.native
  
  var IncomingMessage: Instantiable0[typings.electron.Electron.IncomingMessage] = js.native
  
  var Menu: TypeofMenu with Instantiable0[typings.electron.Electron.Menu] = js.native
  
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem] = js.native
  
  var MessageChannelMain: Instantiable0[typings.electron.Electron.MessageChannelMain] = js.native
  
  var MessagePortMain: Instantiable0[typings.electron.Electron.MessagePortMain] = js.native
  
  var Notification: TypeofNotification with (Instantiable1[
    /* options */ js.UndefOr[NotificationConstructorOptions], 
    typings.electron.Electron.Notification
  ]) = js.native
  
  var ServiceWorkers: Instantiable0[typings.electron.Electron.ServiceWorkers] = js.native
  
  var TouchBar: TypeofTouchBar with (Instantiable1[/* options */ TouchBarConstructorOptions, typings.electron.Electron.TouchBar]) = js.native
  
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.Electron.TouchBarButton
  ] = js.native
  
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.Electron.TouchBarColorPicker
  ] = js.native
  
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.Electron.TouchBarGroup
  ] = js.native
  
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.Electron.TouchBarLabel
  ] = js.native
  
  var TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.TouchBarOtherItemsProxy] = js.native
  
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.Electron.TouchBarPopover
  ] = js.native
  
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.Electron.TouchBarScrubber
  ] = js.native
  
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.Electron.TouchBarSlider
  ] = js.native
  
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.Electron.TouchBarSpacer
  ] = js.native
  
  var Tray: Instantiable2[
    /* image */ NativeImage_ | String, 
    /* guid */ js.UndefOr[String], 
    typings.electron.Electron.Tray
  ] = js.native
  
  var WebRequest: Instantiable0[typings.electron.Electron.WebRequest] = js.native
  
  var app: App = js.native
  
  var autoUpdater: AutoUpdater = js.native
  
  var clipboard: Clipboard = js.native
  
  var contentTracing: ContentTracing = js.native
  
  var crashReporter: CrashReporter = js.native
  
  var desktopCapturer: DesktopCapturer = js.native
  
  var dialog: Dialog = js.native
  
  var globalShortcut: GlobalShortcut = js.native
  
  var inAppPurchase: InAppPurchase = js.native
  
  var ipcMain: IpcMain = js.native
  
  var nativeImage: TypeofNativeImage with Instantiable0[NativeImage_] = js.native
  
  var nativeTheme: NativeTheme = js.native
  
  var net: Net = js.native
  
  var netLog: NetLog = js.native
  
  var powerMonitor: PowerMonitor = js.native
  
  var powerSaveBlocker: PowerSaveBlocker = js.native
  
  var protocol: Protocol = js.native
  
  var screen: Screen = js.native
  
  var session: TypeofSession with Instantiable0[Session_] = js.native
  
  var shell: Shell = js.native
  
  var systemPreferences: SystemPreferences = js.native
  
  var webContents: TypeofWebContents with Instantiable0[WebContents_] = js.native
}
object RemoteMainInterface {
  
  @scala.inline
  def apply(
    BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
    BrowserWindow: TypeofBrowserWindow with (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]),
    ClientRequest: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest],
    CommandLine: Instantiable0[CommandLine],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    Dock: Instantiable0[Dock],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu with Instantiable0[Menu],
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    MessageChannelMain: Instantiable0[MessageChannelMain],
    MessagePortMain: Instantiable0[MessagePortMain],
    Notification: TypeofNotification with (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]),
    ServiceWorkers: Instantiable0[ServiceWorkers],
    TouchBar: TypeofTouchBar with (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]),
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
    nativeImage: TypeofNativeImage with Instantiable0[NativeImage_],
    nativeTheme: NativeTheme,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: TypeofSession with Instantiable0[Session_],
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents with Instantiable0[WebContents_]
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
      value: TypeofBrowserWindow with (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow])
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
    def setMenu(value: TypeofMenu with Instantiable0[Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePortMain(value: Instantiable0[MessagePortMain]): Self = StObject.set(x, "MessagePortMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeImage(value: TypeofNativeImage with Instantiable0[NativeImage_]): Self = StObject.set(x, "nativeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(
      value: TypeofNotification with (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification])
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
    def setSession(value: TypeofSession with Instantiable0[Session_]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBar(value: TypeofTouchBar with (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar])): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
    
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
    def setWebContents(value: TypeofWebContents with Instantiable0[WebContents_]): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequest(value: Instantiable0[WebRequest]): Self = StObject.set(x, "WebRequest", value.asInstanceOf[js.Any])
  }
}
