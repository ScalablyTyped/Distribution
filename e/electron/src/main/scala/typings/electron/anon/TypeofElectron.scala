package typings.electron.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.electron.Electron.Accelerator
import typings.electron.Electron.App
import typings.electron.Electron.AutoUpdater
import typings.electron.Electron.BrowserWindowProxy
import typings.electron.Electron.ClientRequest
import typings.electron.Electron.ClientRequestConstructorOptions
import typings.electron.Electron.Clipboard
import typings.electron.Electron.CommandLine
import typings.electron.Electron.ContentTracing
import typings.electron.Electron.ContextBridge
import typings.electron.Electron.Cookies
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.Debugger
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Dialog
import typings.electron.Electron.Dock
import typings.electron.Electron.DownloadItem
import typings.electron.Electron.GlobalShortcut
import typings.electron.Electron.InAppPurchase
import typings.electron.Electron.IncomingMessage
import typings.electron.Electron.IpcMain
import typings.electron.Electron.IpcRenderer
import typings.electron.Electron.MenuItem
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.MessageChannelMain
import typings.electron.Electron.MessagePortMain
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.NativeTheme
import typings.electron.Electron.Net
import typings.electron.Electron.NetLog
import typings.electron.Electron.PowerMonitor
import typings.electron.Electron.PowerSaveBlocker
import typings.electron.Electron.Protocol
import typings.electron.Electron.Remote
import typings.electron.Electron.Screen
import typings.electron.Electron.ServiceWorkers
import typings.electron.Electron.Shell
import typings.electron.Electron.SystemPreferences
import typings.electron.Electron.TouchBarButton
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPicker
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarGroup
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabel
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarPopover
import typings.electron.Electron.TouchBarPopoverConstructorOptions
import typings.electron.Electron.TouchBarScrubber
import typings.electron.Electron.TouchBarScrubberConstructorOptions
import typings.electron.Electron.TouchBarSegmentedControl
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.Electron.TouchBarSlider
import typings.electron.Electron.TouchBarSliderConstructorOptions
import typings.electron.Electron.TouchBarSpacer
import typings.electron.Electron.TouchBarSpacerConstructorOptions
import typings.electron.Electron.Tray
import typings.electron.Electron.WebFrame
import typings.electron.Electron.WebRequest
import typings.electron.Electron.WebviewTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofElectron extends js.Object {
  var Accelerator: Instantiable0[typings.electron.Electron.Accelerator] = js.native
  var BrowserView: TypeofBrowserView = js.native
  var BrowserWindow: TypeofBrowserWindow = js.native
  var BrowserWindowProxy: Instantiable0[typings.electron.Electron.BrowserWindowProxy] = js.native
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
  var NativeImage: TypeofNativeImage = js.native
  var Notification: TypeofNotification = js.native
  var ServiceWorkers: Instantiable0[typings.electron.Electron.ServiceWorkers] = js.native
  var Session: TypeofSession = js.native
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
  var WebContents: TypeofWebContents = js.native
  var WebRequest: Instantiable0[typings.electron.Electron.WebRequest] = js.native
  val app: App = js.native
  val autoUpdater: AutoUpdater = js.native
  val clipboard: Clipboard = js.native
  val contentTracing: ContentTracing = js.native
  val contextBridge: ContextBridge = js.native
  val crashReporter: CrashReporter = js.native
  val desktopCapturer: DesktopCapturer = js.native
  val dialog: Dialog = js.native
  val globalShortcut: GlobalShortcut = js.native
  val inAppPurchase: InAppPurchase = js.native
  val ipcMain: IpcMain = js.native
  val ipcRenderer: IpcRenderer = js.native
  val nativeTheme: NativeTheme = js.native
  val net: Net = js.native
  val netLog: NetLog = js.native
  val powerMonitor: PowerMonitor = js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  val protocol: Protocol = js.native
  val remote: Remote = js.native
  val screen: Screen = js.native
  val shell: Shell = js.native
  val systemPreferences: SystemPreferences = js.native
  val webFrame: WebFrame = js.native
  val webviewTag: WebviewTag = js.native
}

object TypeofElectron {
  @scala.inline
  def apply(
    Accelerator: Instantiable0[Accelerator],
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
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
    NativeImage: TypeofNativeImage,
    Notification: TypeofNotification,
    ServiceWorkers: Instantiable0[ServiceWorkers],
    Session: TypeofSession,
    TouchBar: TypeofTouchBar,
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray],
    WebContents: TypeofWebContents,
    WebRequest: Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    contextBridge: ContextBridge,
    crashReporter: CrashReporter,
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
    remote: Remote,
    screen: Screen,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): TypeofElectron = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], NativeImage = NativeImage.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofElectron]
  }
  @scala.inline
  implicit class TypeofElectronOps[Self <: TypeofElectron] (val x: Self) extends AnyVal {
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
    def setAccelerator(value: Instantiable0[Accelerator]): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserView(value: TypeofBrowserView): Self = this.set("BrowserView", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserWindow(value: TypeofBrowserWindow): Self = this.set("BrowserWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = this.set("BrowserWindowProxy", value.asInstanceOf[js.Any])
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
    def setNativeImage(value: TypeofNativeImage): Self = this.set("NativeImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: TypeofNotification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorkers(value: Instantiable0[ServiceWorkers]): Self = this.set("ServiceWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: TypeofSession): Self = this.set("Session", value.asInstanceOf[js.Any])
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
    def setWebContents(value: TypeofWebContents): Self = this.set("WebContents", value.asInstanceOf[js.Any])
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
    def setContextBridge(value: ContextBridge): Self = this.set("contextBridge", value.asInstanceOf[js.Any])
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
    def setIpcRenderer(value: IpcRenderer): Self = this.set("ipcRenderer", value.asInstanceOf[js.Any])
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
    def setRemote(value: Remote): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: Screen): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: Shell): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemPreferences(value: SystemPreferences): Self = this.set("systemPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebFrame(value: WebFrame): Self = this.set("webFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebviewTag(value: WebviewTag): Self = this.set("webviewTag", value.asInstanceOf[js.Any])
  }
  
}

