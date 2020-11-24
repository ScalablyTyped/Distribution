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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteMainInterface extends js.Object {
  
  var BrowserView: Instantiable1[
    /* options */ js.UndefOr[BrowserViewConstructorOptions], 
    typings.electron.Electron.BrowserView
  ] = js.native
  
  var BrowserWindow: TypeofBrowserWindow = js.native
  
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
  
  var Menu: TypeofMenu = js.native
  
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem] = js.native
  
  var MessageChannelMain: Instantiable0[typings.electron.Electron.MessageChannelMain] = js.native
  
  var MessagePortMain: Instantiable0[typings.electron.Electron.MessagePortMain] = js.native
  
  var Notification: TypeofNotification = js.native
  
  var ServiceWorkers: Instantiable0[typings.electron.Electron.ServiceWorkers] = js.native
  
  var TouchBar: TypeofTouchBar = js.native
  
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
  
  var nativeImage: TypeofNativeImage = js.native
  
  var nativeTheme: NativeTheme = js.native
  
  var net: Net = js.native
  
  var netLog: NetLog = js.native
  
  var powerMonitor: PowerMonitor = js.native
  
  var powerSaveBlocker: PowerSaveBlocker = js.native
  
  var protocol: Protocol = js.native
  
  var screen: Screen = js.native
  
  var session: TypeofSession = js.native
  
  var shell: Shell = js.native
  
  var systemPreferences: SystemPreferences = js.native
  
  var webContents: TypeofWebContents = js.native
}
object RemoteMainInterface {
  
  @scala.inline
  def apply(
    BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
    BrowserWindow: TypeofBrowserWindow,
    ClientRequest: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest],
    CommandLine: Instantiable0[CommandLine],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    Dock: Instantiable0[Dock],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    MessageChannelMain: Instantiable0[MessageChannelMain],
    MessagePortMain: Instantiable0[MessagePortMain],
    Notification: TypeofNotification,
    ServiceWorkers: Instantiable0[ServiceWorkers],
    TouchBar: TypeofTouchBar,
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
    nativeImage: TypeofNativeImage,
    nativeTheme: NativeTheme,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: TypeofSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents
  ): RemoteMainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarOtherItemsProxy = TouchBarOtherItemsProxy.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMainInterface]
  }
  
  @scala.inline
  implicit class RemoteMainInterfaceOps[Self <: RemoteMainInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowserView(value: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView]): Self = this.set("BrowserView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserWindow(value: TypeofBrowserWindow): Self = this.set("BrowserWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequest(value: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest]): Self = this.set("ClientRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLine(value: Instantiable0[CommandLine]): Self = this.set("CommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: Instantiable0[Cookies]): Self = this.set("Cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugger(value: Instantiable0[Debugger]): Self = this.set("Debugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDock(value: Instantiable0[Dock]): Self = this.set("Dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadItem(value: Instantiable0[DownloadItem]): Self = this.set("DownloadItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingMessage(value: Instantiable0[IncomingMessage]): Self = this.set("IncomingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: TypeofMenu): Self = this.set("Menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = this.set("MenuItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = this.set("MessageChannelMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePortMain(value: Instantiable0[MessagePortMain]): Self = this.set("MessagePortMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: TypeofNotification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkers(value: Instantiable0[ServiceWorkers]): Self = this.set("ServiceWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBar(value: TypeofTouchBar): Self = this.set("TouchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarButton(value: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton]): Self = this.set("TouchBarButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarColorPicker(value: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker]): Self = this.set("TouchBarColorPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarGroup(value: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup]): Self = this.set("TouchBarGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarLabel(value: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel]): Self = this.set("TouchBarLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarOtherItemsProxy(value: Instantiable0[TouchBarOtherItemsProxy]): Self = this.set("TouchBarOtherItemsProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarPopover(value: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover]): Self = this.set("TouchBarPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarScrubber(value: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber]): Self = this.set("TouchBarScrubber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSegmentedControl(
      value: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl]
    ): Self = this.set("TouchBarSegmentedControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSlider(value: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider]): Self = this.set("TouchBarSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBarSpacer(value: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer]): Self = this.set("TouchBarSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray]): Self = this.set("Tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequest(value: Instantiable0[WebRequest]): Self = this.set("WebRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: App): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdater(value: AutoUpdater): Self = this.set("autoUpdater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboard(value: Clipboard): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTracing(value: ContentTracing): Self = this.set("contentTracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashReporter(value: CrashReporter): Self = this.set("crashReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopCapturer(value: DesktopCapturer): Self = this.set("desktopCapturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: Dialog): Self = this.set("dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalShortcut(value: GlobalShortcut): Self = this.set("globalShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppPurchase(value: InAppPurchase): Self = this.set("inAppPurchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcMain(value: IpcMain): Self = this.set("ipcMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeImage(value: TypeofNativeImage): Self = this.set("nativeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTheme(value: NativeTheme): Self = this.set("nativeTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: Net): Self = this.set("net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetLog(value: NetLog): Self = this.set("netLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerMonitor(value: PowerMonitor): Self = this.set("powerMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSaveBlocker(value: PowerSaveBlocker): Self = this.set("powerSaveBlocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: Screen): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: TypeofSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: Shell): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemPreferences(value: SystemPreferences): Self = this.set("systemPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContents(value: TypeofWebContents): Self = this.set("webContents", value.asInstanceOf[js.Any])
  }
}
