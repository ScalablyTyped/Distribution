package typings
package electronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accelerator extends js.Object {
  var Accelerator: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Accelerator]
  var BrowserView: Anon_FromId
  var BrowserWindow: Anon_AddDevToolsExtension
  var BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.BrowserWindowProxy]
  var ClientRequest: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
    electronLib.ElectronNs.ClientRequest
  ]
  var Cookies: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Cookies]
  var Debugger: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Debugger]
  var DownloadItem: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.DownloadItem]
  var EventEmitter: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.EventEmitter]
  var IncomingMessage: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.IncomingMessage]
  var Menu: Anon_Action
  var MenuItem: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.MenuItemConstructorOptions, 
    electronLib.ElectronNs.MenuItem
  ]
  var NativeImage: Anon_Buffer
  var Notification: Anon_IsSupported
  var Session: Anon_DefaultSession
  var TouchBar: Anon_Options
  var TouchBarButton: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarButtonConstructorOptions, 
    electronLib.ElectronNs.TouchBarButton
  ]
  var TouchBarColorPicker: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarColorPickerConstructorOptions, 
    electronLib.ElectronNs.TouchBarColorPicker
  ]
  var TouchBarGroup: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarGroupConstructorOptions, 
    electronLib.ElectronNs.TouchBarGroup
  ]
  var TouchBarLabel: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarLabelConstructorOptions, 
    electronLib.ElectronNs.TouchBarLabel
  ]
  var TouchBarPopover: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarPopoverConstructorOptions, 
    electronLib.ElectronNs.TouchBarPopover
  ]
  var TouchBarScrubber: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarScrubberConstructorOptions, 
    electronLib.ElectronNs.TouchBarScrubber
  ]
  var TouchBarSegmentedControl: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSegmentedControlConstructorOptions, 
    electronLib.ElectronNs.TouchBarSegmentedControl
  ]
  var TouchBarSlider: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSliderConstructorOptions, 
    electronLib.ElectronNs.TouchBarSlider
  ]
  var TouchBarSpacer: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSpacerConstructorOptions, 
    electronLib.ElectronNs.TouchBarSpacer
  ]
  var Tray: org.scalablytyped.runtime.Instantiable1[
    /* image */ electronLib.ElectronNs.NativeImage | java.lang.String, 
    electronLib.ElectronNs.Tray
  ]
  var WebContents: Anon_FromIdGetAllWebContents
  var WebRequest: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.WebRequest]
  val app: electronLib.ElectronNs.App
  val autoUpdater: electronLib.ElectronNs.AutoUpdater
  val clipboard: electronLib.ElectronNs.Clipboard
  val contentTracing: electronLib.ElectronNs.ContentTracing
  val crashReporter: electronLib.ElectronNs.CrashReporter
  val desktopCapturer: electronLib.ElectronNs.DesktopCapturer
  val dialog: electronLib.ElectronNs.Dialog
  val globalShortcut: electronLib.ElectronNs.GlobalShortcut
  val inAppPurchase: electronLib.ElectronNs.InAppPurchase
  val ipcMain: electronLib.ElectronNs.IpcMain
  val ipcRenderer: electronLib.ElectronNs.IpcRenderer
  val net: electronLib.ElectronNs.Net
  val netLog: electronLib.ElectronNs.NetLog
  val powerMonitor: electronLib.ElectronNs.PowerMonitor
  val powerSaveBlocker: electronLib.ElectronNs.PowerSaveBlocker
  val protocol: electronLib.ElectronNs.Protocol
  val remote: electronLib.ElectronNs.Remote
  val screen: electronLib.ElectronNs.Screen
  val shell: electronLib.ElectronNs.Shell
  val systemPreferences: electronLib.ElectronNs.SystemPreferences
  val webFrame: electronLib.ElectronNs.WebFrame
  val webviewTag: electronLib.ElectronNs.WebviewTag
}

object Anon_Accelerator {
  @scala.inline
  def apply(
    Accelerator: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Accelerator],
    BrowserView: Anon_FromId,
    BrowserWindow: Anon_AddDevToolsExtension,
    BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.BrowserWindowProxy],
    ClientRequest: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
      electronLib.ElectronNs.ClientRequest
    ],
    Cookies: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Cookies],
    Debugger: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.Debugger],
    DownloadItem: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.DownloadItem],
    EventEmitter: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.EventEmitter],
    IncomingMessage: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.IncomingMessage],
    Menu: Anon_Action,
    MenuItem: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.MenuItemConstructorOptions, 
      electronLib.ElectronNs.MenuItem
    ],
    NativeImage: Anon_Buffer,
    Notification: Anon_IsSupported,
    Session: Anon_DefaultSession,
    TouchBar: Anon_Options,
    TouchBarButton: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarButtonConstructorOptions, 
      electronLib.ElectronNs.TouchBarButton
    ],
    TouchBarColorPicker: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarColorPickerConstructorOptions, 
      electronLib.ElectronNs.TouchBarColorPicker
    ],
    TouchBarGroup: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarGroupConstructorOptions, 
      electronLib.ElectronNs.TouchBarGroup
    ],
    TouchBarLabel: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarLabelConstructorOptions, 
      electronLib.ElectronNs.TouchBarLabel
    ],
    TouchBarPopover: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarPopoverConstructorOptions, 
      electronLib.ElectronNs.TouchBarPopover
    ],
    TouchBarScrubber: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarScrubberConstructorOptions, 
      electronLib.ElectronNs.TouchBarScrubber
    ],
    TouchBarSegmentedControl: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarSegmentedControlConstructorOptions, 
      electronLib.ElectronNs.TouchBarSegmentedControl
    ],
    TouchBarSlider: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarSliderConstructorOptions, 
      electronLib.ElectronNs.TouchBarSlider
    ],
    TouchBarSpacer: org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.TouchBarSpacerConstructorOptions, 
      electronLib.ElectronNs.TouchBarSpacer
    ],
    Tray: org.scalablytyped.runtime.Instantiable1[
      /* image */ electronLib.ElectronNs.NativeImage | java.lang.String, 
      electronLib.ElectronNs.Tray
    ],
    WebContents: Anon_FromIdGetAllWebContents,
    WebRequest: org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.WebRequest],
    app: electronLib.ElectronNs.App,
    autoUpdater: electronLib.ElectronNs.AutoUpdater,
    clipboard: electronLib.ElectronNs.Clipboard,
    contentTracing: electronLib.ElectronNs.ContentTracing,
    crashReporter: electronLib.ElectronNs.CrashReporter,
    desktopCapturer: electronLib.ElectronNs.DesktopCapturer,
    dialog: electronLib.ElectronNs.Dialog,
    globalShortcut: electronLib.ElectronNs.GlobalShortcut,
    inAppPurchase: electronLib.ElectronNs.InAppPurchase,
    ipcMain: electronLib.ElectronNs.IpcMain,
    ipcRenderer: electronLib.ElectronNs.IpcRenderer,
    net: electronLib.ElectronNs.Net,
    netLog: electronLib.ElectronNs.NetLog,
    powerMonitor: electronLib.ElectronNs.PowerMonitor,
    powerSaveBlocker: electronLib.ElectronNs.PowerSaveBlocker,
    protocol: electronLib.ElectronNs.Protocol,
    remote: electronLib.ElectronNs.Remote,
    screen: electronLib.ElectronNs.Screen,
    shell: electronLib.ElectronNs.Shell,
    systemPreferences: electronLib.ElectronNs.SystemPreferences,
    webFrame: electronLib.ElectronNs.WebFrame,
    webviewTag: electronLib.ElectronNs.WebviewTag
  ): Anon_Accelerator = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator, BrowserView = BrowserView, BrowserWindow = BrowserWindow, BrowserWindowProxy = BrowserWindowProxy, ClientRequest = ClientRequest, Cookies = Cookies, Debugger = Debugger, DownloadItem = DownloadItem, EventEmitter = EventEmitter, IncomingMessage = IncomingMessage, Menu = Menu, MenuItem = MenuItem, NativeImage = NativeImage, Notification = Notification, Session = Session, TouchBar = TouchBar, TouchBarButton = TouchBarButton, TouchBarColorPicker = TouchBarColorPicker, TouchBarGroup = TouchBarGroup, TouchBarLabel = TouchBarLabel, TouchBarPopover = TouchBarPopover, TouchBarScrubber = TouchBarScrubber, TouchBarSegmentedControl = TouchBarSegmentedControl, TouchBarSlider = TouchBarSlider, TouchBarSpacer = TouchBarSpacer, Tray = Tray, WebContents = WebContents, WebRequest = WebRequest, app = app, autoUpdater = autoUpdater, clipboard = clipboard, contentTracing = contentTracing, crashReporter = crashReporter, desktopCapturer = desktopCapturer, dialog = dialog, globalShortcut = globalShortcut, inAppPurchase = inAppPurchase, ipcMain = ipcMain, ipcRenderer = ipcRenderer, net = net, netLog = netLog, powerMonitor = powerMonitor, powerSaveBlocker = powerSaveBlocker, protocol = protocol, remote = remote, screen = screen, shell = shell, systemPreferences = systemPreferences, webFrame = webFrame, webviewTag = webviewTag)
  
    __obj.asInstanceOf[Anon_Accelerator]
  }
}

