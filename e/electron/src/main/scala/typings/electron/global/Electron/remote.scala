package typings.electron.global.Electron

import org.scalablytyped.runtime.Shortcut
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.ClientRequestConstructorOptions
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NotificationConstructorOptions
import typings.electron.Electron.Remote
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarConstructorOptions
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarPopoverConstructorOptions
import typings.electron.Electron.TouchBarScrubberConstructorOptions
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.Electron.TouchBarSliderConstructorOptions
import typings.electron.Electron.TouchBarSpacerConstructorOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remote extends Shortcut {
  
  @JSGlobal("Electron.remote")
  @js.native
  val ^ : Remote = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.BrowserView")
  @js.native
  // Docs: https://electronjs.org/docs/api/browser-view
  /**
    * BrowserView
    */
  class BrowserViewCls ()
    extends typings.electron.Electron.BrowserView {
    def this(options: BrowserViewConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.BrowserWindow")
  @js.native
  /**
    * BrowserWindow
    */
  class BrowserWindowCls ()
    extends typings.electron.Electron.BrowserWindow {
    def this(options: BrowserWindowConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.ClientRequest")
  @js.native
  class ClientRequestCls protected ()
    extends typings.electron.Electron.ClientRequest {
    def this(options: String) = this()
    /**
      * ClientRequest
      */
    def this(options: ClientRequestConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.CommandLine")
  @js.native
  class CommandLineCls ()
    extends typings.electron.Electron.CommandLine
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Cookies")
  @js.native
  class CookiesCls ()
    extends typings.electron.Electron.Cookies
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Debugger")
  @js.native
  class DebuggerCls ()
    extends typings.electron.Electron.Debugger
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Dock")
  @js.native
  class DockCls ()
    extends typings.electron.Electron.Dock
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.DownloadItem")
  @js.native
  class DownloadItemCls ()
    extends typings.electron.Electron.DownloadItem
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.IncomingMessage")
  @js.native
  class IncomingMessageCls ()
    extends typings.electron.Electron.IncomingMessage
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Menu")
  @js.native
  /**
    * Menu
    */
  class MenuCls ()
    extends typings.electron.Electron.Menu
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MenuItem")
  @js.native
  class MenuItemCls protected ()
    extends typings.electron.Electron.MenuItem {
    // Docs: https://electronjs.org/docs/api/menu-item
    /**
      * MenuItem
      */
    def this(options: MenuItemConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MessageChannelMain")
  @js.native
  class MessageChannelMainCls ()
    extends typings.electron.Electron.MessageChannelMain
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.MessagePortMain")
  @js.native
  class MessagePortMainCls ()
    extends typings.electron.Electron.MessagePortMain
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Notification")
  @js.native
  /**
    * Notification
    */
  class NotificationCls ()
    extends typings.electron.Electron.Notification {
    def this(options: NotificationConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.ServiceWorkers")
  @js.native
  class ServiceWorkersCls ()
    extends typings.electron.Electron.ServiceWorkers
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarButton")
  @js.native
  class TouchBarButtonCls protected ()
    extends typings.electron.Electron.TouchBarButton {
    // Docs: https://electronjs.org/docs/api/touch-bar-button
    /**
      * TouchBarButton
      */
    def this(options: TouchBarButtonConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBar")
  @js.native
  class TouchBarCls protected ()
    extends typings.electron.Electron.TouchBar {
    // Docs: https://electronjs.org/docs/api/touch-bar
    /**
      * TouchBar
      */
    def this(options: TouchBarConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarColorPicker")
  @js.native
  class TouchBarColorPickerCls protected ()
    extends typings.electron.Electron.TouchBarColorPicker {
    // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
    /**
      * TouchBarColorPicker
      */
    def this(options: TouchBarColorPickerConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarGroup")
  @js.native
  class TouchBarGroupCls protected () extends EventEmitter {
    // Docs: https://electronjs.org/docs/api/touch-bar-group
    /**
      * TouchBarGroup
      */
    def this(options: TouchBarGroupConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarLabel")
  @js.native
  class TouchBarLabelCls protected ()
    extends typings.electron.Electron.TouchBarLabel {
    // Docs: https://electronjs.org/docs/api/touch-bar-label
    /**
      * TouchBarLabel
      */
    def this(options: TouchBarLabelConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarOtherItemsProxy")
  @js.native
  // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
  /**
    * TouchBarOtherItemsProxy
    */
  class TouchBarOtherItemsProxyCls () extends EventEmitter
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarPopover")
  @js.native
  class TouchBarPopoverCls protected ()
    extends typings.electron.Electron.TouchBarPopover {
    // Docs: https://electronjs.org/docs/api/touch-bar-popover
    /**
      * TouchBarPopover
      */
    def this(options: TouchBarPopoverConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarScrubber")
  @js.native
  class TouchBarScrubberCls protected ()
    extends typings.electron.Electron.TouchBarScrubber {
    // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
    /**
      * TouchBarScrubber
      */
    def this(options: TouchBarScrubberConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControlCls protected ()
    extends typings.electron.Electron.TouchBarSegmentedControl {
    // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
    /**
      * TouchBarSegmentedControl
      */
    def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSlider")
  @js.native
  class TouchBarSliderCls protected ()
    extends typings.electron.Electron.TouchBarSlider {
    // Docs: https://electronjs.org/docs/api/touch-bar-slider
    /**
      * TouchBarSlider
      */
    def this(options: TouchBarSliderConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.TouchBarSpacer")
  @js.native
  class TouchBarSpacerCls protected ()
    extends typings.electron.Electron.TouchBarSpacer {
    // Docs: https://electronjs.org/docs/api/touch-bar-spacer
    /**
      * TouchBarSpacer
      */
    def this(options: TouchBarSpacerConstructorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.Tray")
  @js.native
  class TrayCls protected ()
    extends typings.electron.Electron.Tray {
    def this(image: String) = this()
    /**
      * Tray
      */
    def this(image: typings.electron.Electron.NativeImage_) = this()
    def this(image: String, guid: String) = this()
    def this(image: typings.electron.Electron.NativeImage_, guid: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.WebRequest")
  @js.native
  class WebRequestCls ()
    extends typings.electron.Electron.WebRequest
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.nativeImage")
  @js.native
  class nativeImageCls ()
    extends typings.electron.Electron.NativeImage_
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.session")
  @js.native
  class sessionCls ()
    extends typings.electron.Electron.Session_
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Electron.remote.webContents")
  @js.native
  class webContentsCls ()
    extends typings.electron.Electron.WebContents_
  
  type _To = Remote
  
  /* This means you don't have to write `^`, but can instead just say `remote.foo` */
  override def _to: Remote = ^
}
