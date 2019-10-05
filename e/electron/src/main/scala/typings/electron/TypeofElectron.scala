package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.Accelerator
import typings.electron.Electron.App
import typings.electron.Electron.AutoUpdater
import typings.electron.Electron.BrowserWindowProxy
import typings.electron.Electron.ClientRequest
import typings.electron.Electron.Clipboard
import typings.electron.Electron.ContentTracing
import typings.electron.Electron.Cookies
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.Debugger
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Dialog
import typings.electron.Electron.DownloadItem
import typings.electron.Electron.EventEmitter
import typings.electron.Electron.GlobalShortcut
import typings.electron.Electron.InAppPurchase
import typings.electron.Electron.IncomingMessage
import typings.electron.Electron.IpcMain
import typings.electron.Electron.IpcRenderer
import typings.electron.Electron.MenuItem
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NativeImage
import typings.electron.Electron.Net
import typings.electron.Electron.NetLog
import typings.electron.Electron.PowerMonitor
import typings.electron.Electron.PowerSaveBlocker
import typings.electron.Electron.Protocol
import typings.electron.Electron.Remote
import typings.electron.Electron.Screen
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
  var Accelerator: Instantiable0[typings.electron.Electron.Accelerator]
  var BrowserView: TypeofClassBrowserView
  var BrowserWindow: TypeofClassBrowserWindow
  var BrowserWindowProxy: Instantiable0[typings.electron.Electron.BrowserWindowProxy]
  var ClientRequest: Instantiable1[
    /* options */ method | url | session | partition | typings.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typings.electron.Electron.ClientRequest
  ]
  var Cookies: Instantiable0[typings.electron.Electron.Cookies]
  var Debugger: Instantiable0[typings.electron.Electron.Debugger]
  var DownloadItem: Instantiable0[typings.electron.Electron.DownloadItem]
  // TODO: Replace this declaration with NodeJS.EventEmitter
  var EventEmitter: Instantiable0[typings.electron.Electron.EventEmitter]
  var IncomingMessage: Instantiable0[typings.electron.Electron.IncomingMessage]
  var Menu: TypeofClassMenu
  var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem]
  var NativeImage: TypeofClassNativeImage
  var Notification: TypeofClassNotification
  var Session: TypeofClassSession
  var TouchBar: TypeofClassTouchBar
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
  var Tray: Instantiable1[/* image */ NativeImage | String, typings.electron.Electron.Tray]
  var WebContents: TypeofClassWebContents
  var WebRequest: Instantiable0[typings.electron.Electron.WebRequest]
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

