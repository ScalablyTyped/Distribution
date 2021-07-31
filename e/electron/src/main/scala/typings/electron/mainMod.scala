package typings.electron

import typings.electron.Electron.App
import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.AutoUpdater
import typings.electron.Electron.ContentTracing
import typings.electron.Electron.Dialog
import typings.electron.Electron.GlobalShortcut
import typings.electron.Electron.InAppPurchase
import typings.electron.Electron.IpcMain
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.NativeTheme
import typings.electron.Electron.Net
import typings.electron.Electron.NetLog
import typings.electron.Electron.PowerMonitor
import typings.electron.Electron.PowerSaveBlocker
import typings.electron.Electron.Protocol
import typings.electron.Electron.Rectangle
import typings.electron.Electron.Screen
import typings.electron.Electron.SystemPreferences
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.left
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.right
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.submenu
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("electron/main", "BrowserView")
  @js.native
  class BrowserView ()
    extends StObject
       with typings.electron.Electron.BrowserView {
    
    /**
      * The `bounds` of this BrowserView instance as `Object`.
      *
      * @experimental
      */
    /* CompleteClass */
    override def getBounds(): Rectangle = js.native
    
    /* CompleteClass */
    override def setAutoResize(options: AutoResizeOptions): Unit = js.native
    
    /* CompleteClass */
    override def setBackgroundColor(color: String): Unit = js.native
    
    /**
      * Resizes and moves the view to the supplied bounds relative to the window.
      *
      * @experimental
      */
    /* CompleteClass */
    override def setBounds(bounds: Rectangle): Unit = js.native
    
    /* CompleteClass */
    var webContents: typings.electron.Electron.WebContents_ = js.native
  }
  
  @JSImport("electron/main", "BrowserWindow")
  @js.native
  class BrowserWindow ()
    extends typings.electron.Electron.BrowserWindow
  
  @JSImport("electron/main", "ClientRequest")
  @js.native
  class ClientRequest ()
    extends typings.electron.Electron.ClientRequest
  
  @JSImport("electron/main", "CommandLine")
  @js.native
  class CommandLine ()
    extends StObject
       with typings.electron.Electron.CommandLine
  
  @JSImport("electron/main", "Cookies")
  @js.native
  class Cookies ()
    extends typings.electron.Electron.Cookies
  
  @JSImport("electron/main", "Debugger")
  @js.native
  class Debugger ()
    extends typings.electron.Electron.Debugger
  
  @JSImport("electron/main", "Dock")
  @js.native
  class Dock ()
    extends StObject
       with typings.electron.Electron.Dock
  
  @JSImport("electron/main", "DownloadItem")
  @js.native
  class DownloadItem ()
    extends typings.electron.Electron.DownloadItem
  
  @JSImport("electron/main", "IncomingMessage")
  @js.native
  class IncomingMessage ()
    extends typings.electron.Electron.IncomingMessage
  
  @JSImport("electron/main", "Menu")
  @js.native
  class Menu ()
    extends StObject
       with typings.electron.Electron.Menu
  
  @JSImport("electron/main", "MenuItem")
  @js.native
  class MenuItem ()
    extends StObject
       with typings.electron.Electron.MenuItem {
    
    /* CompleteClass */
    var checked: Boolean = js.native
    
    /* CompleteClass */
    var click: js.Function = js.native
    
    /* CompleteClass */
    var commandId: Double = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var menu: typings.electron.Electron.Menu = js.native
    
    /* CompleteClass */
    var registerAccelerator: Boolean = js.native
    
    /* CompleteClass */
    var sublabel: String = js.native
    
    /* CompleteClass */
    var toolTip: String = js.native
    
    /* CompleteClass */
    var `type`: normal | separator | submenu | checkbox | radio = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSImport("electron/main", "MessageChannelMain")
  @js.native
  class MessageChannelMain ()
    extends typings.electron.Electron.MessageChannelMain
  
  @JSImport("electron/main", "MessagePortMain")
  @js.native
  class MessagePortMain ()
    extends typings.electron.Electron.MessagePortMain
  
  @JSImport("electron/main", "Notification")
  @js.native
  class Notification ()
    extends typings.electron.Electron.Notification
  
  @JSImport("electron/main", "ServiceWorkers")
  @js.native
  class ServiceWorkers ()
    extends typings.electron.Electron.ServiceWorkers
  
  @JSImport("electron/main", "Session")
  @js.native
  class Session_ ()
    extends typings.electron.Electron.Session_
  
  @JSImport("electron/main", "TouchBar")
  @js.native
  class TouchBar ()
    extends StObject
       with typings.electron.Electron.TouchBar {
    
    /* CompleteClass */
    var escapeItem: typings.electron.Electron.TouchBarButton | typings.electron.Electron.TouchBarColorPicker | typings.electron.Electron.TouchBarGroup | typings.electron.Electron.TouchBarLabel | typings.electron.Electron.TouchBarPopover | typings.electron.Electron.TouchBarScrubber | typings.electron.Electron.TouchBarSegmentedControl | typings.electron.Electron.TouchBarSlider | typings.electron.Electron.TouchBarSpacer | Null = js.native
  }
  
  @JSImport("electron/main", "TouchBarButton")
  @js.native
  class TouchBarButton ()
    extends StObject
       with typings.electron.Electron.TouchBarButton {
    
    /* CompleteClass */
    var accessibilityLabel: String = js.native
    
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var icon: NativeImage_ = js.native
    
    /* CompleteClass */
    var iconPosition: left | right | overlay = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSImport("electron/main", "TouchBarColorPicker")
  @js.native
  class TouchBarColorPicker ()
    extends typings.electron.Electron.TouchBarColorPicker
  
  @JSImport("electron/main", "TouchBarGroup")
  @js.native
  class TouchBarGroup () extends EventEmitter
  
  @JSImport("electron/main", "TouchBarLabel")
  @js.native
  class TouchBarLabel ()
    extends typings.electron.Electron.TouchBarLabel
  
  @JSImport("electron/main", "TouchBarOtherItemsProxy")
  @js.native
  class TouchBarOtherItemsProxy () extends EventEmitter
  
  @JSImport("electron/main", "TouchBarPopover")
  @js.native
  class TouchBarPopover ()
    extends typings.electron.Electron.TouchBarPopover
  
  @JSImport("electron/main", "TouchBarScrubber")
  @js.native
  class TouchBarScrubber ()
    extends typings.electron.Electron.TouchBarScrubber
  
  @JSImport("electron/main", "TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControl ()
    extends typings.electron.Electron.TouchBarSegmentedControl
  
  @JSImport("electron/main", "TouchBarSlider")
  @js.native
  class TouchBarSlider ()
    extends typings.electron.Electron.TouchBarSlider
  
  @JSImport("electron/main", "TouchBarSpacer")
  @js.native
  class TouchBarSpacer ()
    extends typings.electron.Electron.TouchBarSpacer
  
  @JSImport("electron/main", "Tray")
  @js.native
  class Tray ()
    extends typings.electron.Electron.Tray
  
  @JSImport("electron/main", "WebContents")
  @js.native
  class WebContents_ ()
    extends typings.electron.Electron.WebContents_
  
  @JSImport("electron/main", "WebRequest")
  @js.native
  class WebRequest ()
    extends StObject
       with typings.electron.Electron.WebRequest
  
  @JSImport("electron/main", "app")
  @js.native
  val app: App = js.native
  
  @JSImport("electron/main", "autoUpdater")
  @js.native
  val autoUpdater: AutoUpdater = js.native
  
  @JSImport("electron/main", "contentTracing")
  @js.native
  val contentTracing: ContentTracing = js.native
  
  @JSImport("electron/main", "dialog")
  @js.native
  val dialog: Dialog = js.native
  
  @JSImport("electron/main", "globalShortcut")
  @js.native
  val globalShortcut: GlobalShortcut = js.native
  
  @JSImport("electron/main", "inAppPurchase")
  @js.native
  val inAppPurchase: InAppPurchase = js.native
  
  @JSImport("electron/main", "ipcMain")
  @js.native
  val ipcMain: IpcMain = js.native
  
  @JSImport("electron/main", "nativeTheme")
  @js.native
  val nativeTheme: NativeTheme = js.native
  
  @JSImport("electron/main", "net")
  @js.native
  val net: Net = js.native
  
  @JSImport("electron/main", "netLog")
  @js.native
  val netLog: NetLog = js.native
  
  @JSImport("electron/main", "powerMonitor")
  @js.native
  val powerMonitor: PowerMonitor = js.native
  
  @JSImport("electron/main", "powerSaveBlocker")
  @js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  
  @JSImport("electron/main", "protocol")
  @js.native
  val protocol: Protocol = js.native
  
  @JSImport("electron/main", "screen")
  @js.native
  val screen: Screen = js.native
  
  /* was `typeof Session` */
  @JSImport("electron/main", "session")
  @js.native
  class session ()
    extends typings.electron.Electron.Session_
  
  @JSImport("electron/main", "systemPreferences")
  @js.native
  val systemPreferences: SystemPreferences = js.native
  
  /* was `typeof WebContents` */
  @JSImport("electron/main", "webContents")
  @js.native
  class webContents ()
    extends typings.electron.Electron.WebContents_
}
