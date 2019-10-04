package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.ElectronNs.Accelerator
import typings.electron.ElectronNs.App
import typings.electron.ElectronNs.AutoUpdater
import typings.electron.ElectronNs.BrowserWindowProxy
import typings.electron.ElectronNs.ClientRequest
import typings.electron.ElectronNs.Clipboard
import typings.electron.ElectronNs.ContentTracing
import typings.electron.ElectronNs.Cookies
import typings.electron.ElectronNs.CrashReporter
import typings.electron.ElectronNs.Debugger
import typings.electron.ElectronNs.DesktopCapturer
import typings.electron.ElectronNs.Dialog
import typings.electron.ElectronNs.DownloadItem
import typings.electron.ElectronNs.EventEmitter
import typings.electron.ElectronNs.GlobalShortcut
import typings.electron.ElectronNs.InAppPurchase
import typings.electron.ElectronNs.IncomingMessage
import typings.electron.ElectronNs.IpcMain
import typings.electron.ElectronNs.IpcRenderer
import typings.electron.ElectronNs.MenuItem
import typings.electron.ElectronNs.MenuItemConstructorOptions
import typings.electron.ElectronNs.NativeImage
import typings.electron.ElectronNs.Net
import typings.electron.ElectronNs.NetLog
import typings.electron.ElectronNs.PowerMonitor
import typings.electron.ElectronNs.PowerSaveBlocker
import typings.electron.ElectronNs.Protocol
import typings.electron.ElectronNs.Remote
import typings.electron.ElectronNs.Screen
import typings.electron.ElectronNs.Shell
import typings.electron.ElectronNs.SystemPreferences
import typings.electron.ElectronNs.TouchBarButton
import typings.electron.ElectronNs.TouchBarButtonConstructorOptions
import typings.electron.ElectronNs.TouchBarColorPicker
import typings.electron.ElectronNs.TouchBarColorPickerConstructorOptions
import typings.electron.ElectronNs.TouchBarGroup
import typings.electron.ElectronNs.TouchBarGroupConstructorOptions
import typings.electron.ElectronNs.TouchBarLabel
import typings.electron.ElectronNs.TouchBarLabelConstructorOptions
import typings.electron.ElectronNs.TouchBarPopover
import typings.electron.ElectronNs.TouchBarPopoverConstructorOptions
import typings.electron.ElectronNs.TouchBarScrubber
import typings.electron.ElectronNs.TouchBarScrubberConstructorOptions
import typings.electron.ElectronNs.TouchBarSegmentedControl
import typings.electron.ElectronNs.TouchBarSegmentedControlConstructorOptions
import typings.electron.ElectronNs.TouchBarSlider
import typings.electron.ElectronNs.TouchBarSliderConstructorOptions
import typings.electron.ElectronNs.TouchBarSpacer
import typings.electron.ElectronNs.TouchBarSpacerConstructorOptions
import typings.electron.ElectronNs.Tray
import typings.electron.ElectronNs.WebFrame
import typings.electron.ElectronNs.WebRequest
import typings.electron.ElectronNs.WebviewTag
import typings.electron.electronStrings.host
import typings.electron.electronStrings.hostname
import typings.electron.electronStrings.method
import typings.electron.electronStrings.partition
import typings.electron.electronStrings.path
import typings.electron.electronStrings.port
import typings.electron.electronStrings.protocol
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.session
import typings.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofElectron extends js.Object {
  var Accelerator: Instantiable0[typings.electron.ElectronNs.Accelerator]
  var BrowserView: TypeofClassBrowserView
  var BrowserWindow: TypeofClassBrowserWindow
  var BrowserWindowProxy: Instantiable0[typings.electron.ElectronNs.BrowserWindowProxy]
  var ClientRequest: Instantiable1[
    /* options */ method | url | session | partition | typings.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typings.electron.ElectronNs.ClientRequest
  ]
  var Cookies: Instantiable0[typings.electron.ElectronNs.Cookies]
  var Debugger: Instantiable0[typings.electron.ElectronNs.Debugger]
  var DownloadItem: Instantiable0[typings.electron.ElectronNs.DownloadItem]
  // TODO: Replace this declaration with NodeJS.EventEmitter
  var EventEmitter: Instantiable0[typings.electron.ElectronNs.EventEmitter]
  var IncomingMessage: Instantiable0[typings.electron.ElectronNs.IncomingMessage]
  var Menu: TypeofClassMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.ElectronNs.MenuItem]
  var NativeImage: TypeofClassNativeImage
  var Notification: TypeofClassNotification
  var Session: TypeofClassSession
  var TouchBar: TypeofClassTouchBar
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.ElectronNs.TouchBarButton
  ]
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.ElectronNs.TouchBarColorPicker
  ]
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.ElectronNs.TouchBarGroup
  ]
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.ElectronNs.TouchBarLabel
  ]
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.ElectronNs.TouchBarPopover
  ]
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.ElectronNs.TouchBarScrubber
  ]
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSegmentedControl
  ]
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSlider
  ]
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSpacer
  ]
  var Tray: Instantiable1[/* image */ NativeImage | String, typings.electron.ElectronNs.Tray]
  var WebContents: TypeofClassWebContents
  var WebRequest: Instantiable0[typings.electron.ElectronNs.WebRequest]
  val app: App
  val autoUpdater: AutoUpdater
  val clipboard: Clipboard
  val contentTracing: ContentTracing
  val crashReporter: CrashReporter
  val desktopCapturer: DesktopCapturer
  val dialog: Dialog
  val globalShortcut: GlobalShortcut
  val inAppPurchase: InAppPurchase
  val ipcMain: IpcMain
  val ipcRenderer: IpcRenderer
  val net: Net
  val netLog: NetLog
  val powerMonitor: PowerMonitor
  val powerSaveBlocker: PowerSaveBlocker
  val protocol: Protocol
  val remote: Remote
  val screen: Screen
  val shell: Shell
  val systemPreferences: SystemPreferences
  val webFrame: WebFrame
  val webviewTag: WebviewTag
}

object TypeofElectron {
  @scala.inline
  def apply(
    Accelerator: Instantiable0[Accelerator],
    BrowserView: TypeofClassBrowserView,
    BrowserWindow: TypeofClassBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    ClientRequest: Instantiable1[
      /* options */ method | url | session | partition | protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    EventEmitter: Instantiable0[EventEmitter],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofClassMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    NativeImage: TypeofClassNativeImage,
    Notification: TypeofClassNotification,
    Session: TypeofClassSession,
    TouchBar: TypeofClassTouchBar,
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable1[/* image */ NativeImage | String, Tray],
    WebContents: TypeofClassWebContents,
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
    ipcRenderer: IpcRenderer,
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
    val __obj = js.Dynamic.literal(Accelerator = Accelerator, BrowserView = BrowserView, BrowserWindow = BrowserWindow, BrowserWindowProxy = BrowserWindowProxy, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, EventEmitter = EventEmitter, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, NativeImage = NativeImage, Notification = Notification, Session = Session, TouchBar = TouchBar, TouchBarButton = TouchBarButton, TouchBarColorPicker = TouchBarColorPicker, TouchBarGroup = TouchBarGroup, TouchBarLabel = TouchBarLabel, TouchBarPopover = TouchBarPopover, TouchBarScrubber = TouchBarScrubber, TouchBarSegmentedControl = TouchBarSegmentedControl, TouchBarSlider = TouchBarSlider, TouchBarSpacer = TouchBarSpacer, Tray = Tray, WebContents = WebContents, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, desktopCapturer = desktopCapturer, dialog = dialog, globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, ipcRenderer = ipcRenderer, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, remote = remote, screen = screen, shell = shell, systemPreferences = systemPreferences, webFrame = webFrame, webviewTag = webviewTag)
  
    __obj.asInstanceOf[TypeofElectron]
  }
}

