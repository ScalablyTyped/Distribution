package typings.electron.global.Electron

import typings.electron.Electron.App
import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.AutoUpdater
import typings.electron.Electron.ContentTracing
import typings.electron.Electron.Dialog
import typings.electron.Electron.GlobalShortcut
import typings.electron.Electron.InAppPurchase
import typings.electron.Electron.IpcMain
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

object Main {
  
  @JSGlobal("Electron.Main.BrowserView")
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
  
  @JSGlobal("Electron.Main.BrowserWindow")
  @js.native
  class BrowserWindow ()
    extends typings.electron.Electron.BrowserWindow
  
  @JSGlobal("Electron.Main.ClientRequest")
  @js.native
  class ClientRequest ()
    extends typings.electron.Electron.ClientRequest
  
  @JSGlobal("Electron.Main.CommandLine")
  @js.native
  class CommandLine ()
    extends StObject
       with typings.electron.Electron.CommandLine
  
  @JSGlobal("Electron.Main.Cookies")
  @js.native
  class Cookies ()
    extends typings.electron.Electron.Cookies
  
  @JSGlobal("Electron.Main.Debugger")
  @js.native
  class Debugger ()
    extends typings.electron.Electron.Debugger
  
  @JSGlobal("Electron.Main.Dock")
  @js.native
  class Dock ()
    extends StObject
       with typings.electron.Electron.Dock
  
  @JSGlobal("Electron.Main.DownloadItem")
  @js.native
  class DownloadItem ()
    extends typings.electron.Electron.DownloadItem
  
  @JSGlobal("Electron.Main.IncomingMessage")
  @js.native
  class IncomingMessage ()
    extends typings.electron.Electron.IncomingMessage
  
  @JSGlobal("Electron.Main.Menu")
  @js.native
  class Menu ()
    extends StObject
       with typings.electron.Electron.Menu
  
  @JSGlobal("Electron.Main.MenuItem")
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
  
  @JSGlobal("Electron.Main.MessageChannelMain")
  @js.native
  class MessageChannelMain ()
    extends typings.electron.Electron.MessageChannelMain
  
  @JSGlobal("Electron.Main.MessagePortMain")
  @js.native
  class MessagePortMain ()
    extends typings.electron.Electron.MessagePortMain
  
  @JSGlobal("Electron.Main.Notification")
  @js.native
  class Notification ()
    extends typings.electron.Electron.Notification
  
  @JSGlobal("Electron.Main.ServiceWorkers")
  @js.native
  class ServiceWorkers ()
    extends typings.electron.Electron.ServiceWorkers
  
  @JSGlobal("Electron.Main.Session")
  @js.native
  class Session_ ()
    extends typings.electron.Electron.Session_
  
  @JSGlobal("Electron.Main.TouchBar")
  @js.native
  class TouchBar ()
    extends StObject
       with typings.electron.Electron.TouchBar {
    
    /* CompleteClass */
    var escapeItem: typings.electron.Electron.TouchBarButton | typings.electron.Electron.TouchBarColorPicker | typings.electron.Electron.TouchBarGroup | typings.electron.Electron.TouchBarLabel | typings.electron.Electron.TouchBarPopover | typings.electron.Electron.TouchBarScrubber | typings.electron.Electron.TouchBarSegmentedControl | typings.electron.Electron.TouchBarSlider | typings.electron.Electron.TouchBarSpacer | Null = js.native
  }
  
  @JSGlobal("Electron.Main.TouchBarButton")
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
    var icon: typings.electron.Electron.NativeImage_ = js.native
    
    /* CompleteClass */
    var iconPosition: left | right | overlay = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSGlobal("Electron.Main.TouchBarColorPicker")
  @js.native
  class TouchBarColorPicker ()
    extends typings.electron.Electron.TouchBarColorPicker
  
  @JSGlobal("Electron.Main.TouchBarGroup")
  @js.native
  class TouchBarGroup () extends EventEmitter
  
  @JSGlobal("Electron.Main.TouchBarLabel")
  @js.native
  class TouchBarLabel ()
    extends typings.electron.Electron.TouchBarLabel
  
  @JSGlobal("Electron.Main.TouchBarOtherItemsProxy")
  @js.native
  class TouchBarOtherItemsProxy () extends EventEmitter
  
  @JSGlobal("Electron.Main.TouchBarPopover")
  @js.native
  class TouchBarPopover ()
    extends typings.electron.Electron.TouchBarPopover
  
  @JSGlobal("Electron.Main.TouchBarScrubber")
  @js.native
  class TouchBarScrubber ()
    extends typings.electron.Electron.TouchBarScrubber
  
  @JSGlobal("Electron.Main.TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControl ()
    extends typings.electron.Electron.TouchBarSegmentedControl
  
  @JSGlobal("Electron.Main.TouchBarSlider")
  @js.native
  class TouchBarSlider ()
    extends typings.electron.Electron.TouchBarSlider
  
  @JSGlobal("Electron.Main.TouchBarSpacer")
  @js.native
  class TouchBarSpacer ()
    extends typings.electron.Electron.TouchBarSpacer
  
  @JSGlobal("Electron.Main.Tray")
  @js.native
  class Tray ()
    extends typings.electron.Electron.Tray
  
  @JSGlobal("Electron.Main.WebContents")
  @js.native
  class WebContents_ ()
    extends typings.electron.Electron.WebContents_
  
  @JSGlobal("Electron.Main.WebRequest")
  @js.native
  class WebRequest ()
    extends StObject
       with typings.electron.Electron.WebRequest
  
  @JSGlobal("Electron.Main.app")
  @js.native
  val app: App = js.native
  
  @JSGlobal("Electron.Main.autoUpdater")
  @js.native
  val autoUpdater: AutoUpdater = js.native
  
  @JSGlobal("Electron.Main.contentTracing")
  @js.native
  val contentTracing: ContentTracing = js.native
  
  @JSGlobal("Electron.Main.dialog")
  @js.native
  val dialog: Dialog = js.native
  
  @JSGlobal("Electron.Main.globalShortcut")
  @js.native
  val globalShortcut: GlobalShortcut = js.native
  
  @JSGlobal("Electron.Main.inAppPurchase")
  @js.native
  val inAppPurchase: InAppPurchase = js.native
  
  @JSGlobal("Electron.Main.ipcMain")
  @js.native
  val ipcMain: IpcMain = js.native
  
  @JSGlobal("Electron.Main.nativeTheme")
  @js.native
  val nativeTheme: NativeTheme = js.native
  
  @JSGlobal("Electron.Main.net")
  @js.native
  val net: Net = js.native
  
  @JSGlobal("Electron.Main.netLog")
  @js.native
  val netLog: NetLog = js.native
  
  @JSGlobal("Electron.Main.powerMonitor")
  @js.native
  val powerMonitor: PowerMonitor = js.native
  
  @JSGlobal("Electron.Main.powerSaveBlocker")
  @js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  
  @JSGlobal("Electron.Main.protocol")
  @js.native
  val protocol: Protocol = js.native
  
  @JSGlobal("Electron.Main.screen")
  @js.native
  val screen: Screen = js.native
  
  /* was `typeof Session` */
  @JSGlobal("Electron.Main.session")
  @js.native
  class session ()
    extends typings.electron.Electron.Session_
  
  @JSGlobal("Electron.Main.systemPreferences")
  @js.native
  val systemPreferences: SystemPreferences = js.native
  
  /* was `typeof WebContents` */
  @JSGlobal("Electron.Main.webContents")
  @js.native
  class webContents ()
    extends typings.electron.Electron.WebContents_
}
