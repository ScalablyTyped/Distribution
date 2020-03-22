package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.TypeofBrowserView
import typings.electron.TypeofBrowserWindow
import typings.electron.TypeofMenu
import typings.electron.TypeofNativeImage
import typings.electron.TypeofNotification
import typings.electron.TypeofSession
import typings.electron.TypeofTouchBar
import typings.electron.TypeofWebContents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var BrowserView: TypeofBrowserView
  var BrowserWindow: TypeofBrowserWindow
  var BrowserWindowProxy: Instantiable0[typings.electron.Electron.BrowserWindowProxy]
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
  var Menu: TypeofMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem]
  var Notification: TypeofNotification
  var TouchBar: TypeofTouchBar
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
  var Tray: Instantiable1[/* image */ NativeImage_ | String, typings.electron.Electron.Tray]
  var WebRequest: Instantiable0[typings.electron.Electron.WebRequest]
  var app: App_
  var autoUpdater: AutoUpdater_
  var clipboard: Clipboard_
  var contentTracing: ContentTracing_
  var contextBridge: ContextBridge_
  var crashReporter: CrashReporter_
  var desktopCapturer: DesktopCapturer_
  var dialog: Dialog_
  var globalShortcut: GlobalShortcut_
  var inAppPurchase: InAppPurchase_
  var ipcMain: IpcMain_
  var ipcRenderer: IpcRenderer_
  var nativeImage: TypeofNativeImage
  var nativeTheme: NativeTheme_
  var net: Net_
  var netLog: NetLog_
  var powerMonitor: PowerMonitor_
  var powerSaveBlocker: PowerSaveBlocker_
  var protocol: Protocol_
  var remote: Remote_
  var screen: Screen_
  var session: TypeofSession
  var shell: Shell_
  var systemPreferences: SystemPreferences_
  var webContents: TypeofWebContents
  var webFrame: WebFrame_
  var webviewTag: WebviewTag_
}

object CommonInterface {
  @scala.inline
  def apply(
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
    Notification: TypeofNotification,
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
    Tray: Instantiable1[/* image */ NativeImage_ | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App_,
    autoUpdater: AutoUpdater_,
    clipboard: Clipboard_,
    contentTracing: ContentTracing_,
    contextBridge: ContextBridge_,
    crashReporter: CrashReporter_,
    desktopCapturer: DesktopCapturer_,
    dialog: Dialog_,
    globalShortcut: GlobalShortcut_,
    inAppPurchase: InAppPurchase_,
    ipcMain: IpcMain_,
    ipcRenderer: IpcRenderer_,
    nativeImage: TypeofNativeImage,
    nativeTheme: NativeTheme_,
    net: Net_,
    netLog: NetLog_,
    powerMonitor: PowerMonitor_,
    powerSaveBlocker: PowerSaveBlocker_,
    protocol: Protocol_,
    remote: Remote_,
    screen: Screen_,
    session: TypeofSession,
    shell: Shell_,
    systemPreferences: SystemPreferences_,
    webContents: TypeofWebContents,
    webFrame: WebFrame_,
    webviewTag: WebviewTag_
  ): CommonInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonInterface]
  }
}

