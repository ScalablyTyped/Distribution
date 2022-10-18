package typings.electron

import typings.electron.Electron.Accelerator
import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.electron.Electron.CrossProcessExports.App
import typings.electron.Electron.CrossProcessExports.AutoUpdater
import typings.electron.Electron.CrossProcessExports.Clipboard
import typings.electron.Electron.CrossProcessExports.ContentTracing
import typings.electron.Electron.CrossProcessExports.ContextBridge
import typings.electron.Electron.CrossProcessExports.CrashReporter
import typings.electron.Electron.CrossProcessExports.DesktopCapturer
import typings.electron.Electron.CrossProcessExports.Dialog
import typings.electron.Electron.CrossProcessExports.GlobalShortcut
import typings.electron.Electron.CrossProcessExports.InAppPurchase
import typings.electron.Electron.CrossProcessExports.IpcMain
import typings.electron.Electron.CrossProcessExports.IpcRenderer
import typings.electron.Electron.CrossProcessExports.NativeTheme
import typings.electron.Electron.CrossProcessExports.Net
import typings.electron.Electron.CrossProcessExports.NetLog
import typings.electron.Electron.CrossProcessExports.PowerMonitor
import typings.electron.Electron.CrossProcessExports.PowerSaveBlocker
import typings.electron.Electron.CrossProcessExports.Protocol
import typings.electron.Electron.CrossProcessExports.PushNotifications
import typings.electron.Electron.CrossProcessExports.SafeStorage
import typings.electron.Electron.CrossProcessExports.Screen
import typings.electron.Electron.CrossProcessExports.Shell
import typings.electron.Electron.CrossProcessExports.SystemPreferences
import typings.electron.Electron.CrossProcessExports.WebFrame
import typings.electron.Electron.FromPartitionOptions
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.Rectangle
import typings.electron.Electron.Session_
import typings.electron.Electron.SharingItem
import typings.electron.Electron.Size
import typings.electron.Electron.TouchBarButton
import typings.electron.Electron.TouchBarColorPicker
import typings.electron.Electron.TouchBarGroup
import typings.electron.Electron.TouchBarLabel
import typings.electron.Electron.TouchBarPopover
import typings.electron.Electron.TouchBarScrubber
import typings.electron.Electron.TouchBarSegmentedControl
import typings.electron.Electron.TouchBarSlider
import typings.electron.Electron.TouchBarSpacer
import typings.electron.Electron.WebContents_
import typings.electron.Electron.WebFrameMain_
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.submenu
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron", "BrowserView")
  @js.native
  open class BrowserView ()
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
    
    /**
      * Examples of valid `color` values:
      *
      * * Hex
      *   * #fff (RGB)
      *   * #ffff (ARGB)
      *   * #ffffff (RRGGBB)
      *   * #ffffffff (AARRGGBB)
      * * RGB
      *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
      *     * e.g. rgb(255, 255, 255)
      * * RGBA
      *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
      *     * e.g. rgba(255, 255, 255, 1.0)
      * * HSL
      *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
      *     * e.g. hsl(200, 20%, 50%)
      * * HSLA
      *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
      *     * e.g. hsla(200, 20%, 50%, 0.5)
      * * Color name
      *   * Options are listed in SkParseColor.cpp
      *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
      *     * e.g. `blueviolet` or `red`
      *
      * **Note:** Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBA` or
      * `RGA`.
      *
      * @experimental
      */
    /* CompleteClass */
    override def setBackgroundColor(color: String): Unit = js.native
    
    /**
      * Resizes and moves the view to the supplied bounds relative to the window.
      *
      * @experimental
      */
    /* CompleteClass */
    override def setBounds(bounds: Rectangle): Unit = js.native
    
    /**
      * A `WebContents` object owned by this view.
      *
      * @experimental
      */
    /* CompleteClass */
    var webContents: WebContents_ = js.native
  }
  
  @JSImport("electron", "BrowserWindow")
  @js.native
  open class BrowserWindow ()
    extends typings.electron.Electron.BrowserWindow
  
  @JSImport("electron", "Menu")
  @js.native
  open class Menu ()
    extends StObject
       with typings.electron.Electron.Menu
  
  @JSImport("electron", "MenuItem")
  @js.native
  open class MenuItem ()
    extends StObject
       with typings.electron.Electron.MenuItem {
    
    /**
      * A `boolean` indicating whether the item is checked, this property can be
      * dynamically changed.
      *
      * A `checkbox` menu item will toggle the `checked` property on and off when
      * selected.
      *
      * A `radio` menu item will turn on its `checked` property when clicked, and will
      * turn off that property for all adjacent items in the same menu.
      *
      * You can add a `click` function for additional behavior.
      */
    /* CompleteClass */
    var checked: Boolean = js.native
    
    /**
      * A `Function` that is fired when the MenuItem receives a click event. It can be
      * called with `menuItem.click(event, focusedWindow, focusedWebContents)`.
      *
      * * `event` KeyboardEvent
      * * `focusedWindow` BrowserWindow
      * * `focusedWebContents` WebContents
      */
    /* CompleteClass */
    var click: js.Function = js.native
    
    /**
      * A `number` indicating an item's sequential unique id.
      */
    /* CompleteClass */
    var commandId: Double = js.native
    
    /**
      * A `boolean` indicating whether the item is enabled, this property can be
      * dynamically changed.
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * A `string` indicating the item's unique id, this property can be dynamically
      * changed.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * A `string` indicating the item's visible label.
      */
    /* CompleteClass */
    var label: String = js.native
    
    /**
      * A `Menu` that the item is a part of.
      */
    /* CompleteClass */
    var menu: typings.electron.Electron.Menu = js.native
    
    /**
      * A `boolean` indicating if the accelerator should be registered with the system
      * or just displayed.
      *
      * This property can be dynamically changed.
      */
    /* CompleteClass */
    var registerAccelerator: Boolean = js.native
    
    /**
      * A `SharingItem` indicating the item to share when the `role` is `shareMenu`.
      *
      * This property can be dynamically changed.
      *
      * @platform darwin
      */
    /* CompleteClass */
    var sharingItem: SharingItem = js.native
    
    /**
      * A `string` indicating the item's sublabel.
      */
    /* CompleteClass */
    var sublabel: String = js.native
    
    /**
      * A `string` indicating the item's hover text.
      *
      * @platform darwin
      */
    /* CompleteClass */
    var toolTip: String = js.native
    
    /**
      * A `string` indicating the type of the item. Can be `normal`, `separator`,
      * `submenu`, `checkbox` or `radio`.
      */
    /* CompleteClass */
    var `type`: normal | separator | submenu | checkbox | radio = js.native
    
    /**
      * An `Accelerator | null` indicating the item's user-assigned accelerator for the
      * menu item.
      *
      * **Note:** This property is only initialized after the `MenuItem` has been added
      * to a `Menu`. Either via `Menu.buildFromTemplate` or via
      * `Menu.append()/insert()`.  Accessing before initialization will just return
      * `null`.
      *
      * @platform darwin
      */
    /* CompleteClass */
    override val userAccelerator: Accelerator | Null = js.native
    
    /**
      * A `boolean` indicating whether the item is visible, this property can be
      * dynamically changed.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSImport("electron", "MessageChannelMain")
  @js.native
  open class MessageChannelMain ()
    extends typings.electron.Electron.MessageChannelMain
  
  @JSImport("electron", "Notification")
  @js.native
  open class Notification ()
    extends typings.electron.Electron.Notification
  
  @JSImport("electron", "ShareMenu")
  @js.native
  open class ShareMenu ()
    extends typings.electron.Electron.ShareMenu
  
  @JSImport("electron", "TouchBar")
  @js.native
  open class TouchBar ()
    extends StObject
       with typings.electron.Electron.TouchBar {
    
    /**
      * A `TouchBarItem` that will replace the "esc" button on the touch bar when set.
      * Setting to `null` restores the default "esc" button. Changing this value
      * immediately updates the escape item in the touch bar.
      */
    /* CompleteClass */
    var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null = js.native
  }
  
  @JSImport("electron", "Tray")
  @js.native
  open class Tray ()
    extends typings.electron.Electron.Tray
  
  @JSImport("electron", "app")
  @js.native
  val app: App = js.native
  
  @JSImport("electron", "autoUpdater")
  @js.native
  val autoUpdater: AutoUpdater = js.native
  
  @JSImport("electron", "clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSImport("electron", "contentTracing")
  @js.native
  val contentTracing: ContentTracing = js.native
  
  @JSImport("electron", "contextBridge")
  @js.native
  val contextBridge: ContextBridge = js.native
  
  @JSImport("electron", "crashReporter")
  @js.native
  val crashReporter: CrashReporter = js.native
  
  @JSImport("electron", "desktopCapturer")
  @js.native
  val desktopCapturer: DesktopCapturer = js.native
  
  @JSImport("electron", "dialog")
  @js.native
  val dialog: Dialog = js.native
  
  @JSImport("electron", "globalShortcut")
  @js.native
  val globalShortcut: GlobalShortcut = js.native
  
  @JSImport("electron", "inAppPurchase")
  @js.native
  val inAppPurchase: InAppPurchase = js.native
  
  @JSImport("electron", "ipcMain")
  @js.native
  val ipcMain: IpcMain = js.native
  
  @JSImport("electron", "ipcRenderer")
  @js.native
  val ipcRenderer: IpcRenderer = js.native
  
  /* was `typeof NativeImage` */
  @JSImport("electron", "nativeImage")
  @js.native
  open class nativeImage ()
    extends StObject
       with NativeImage_
  /* was `typeof NativeImage` */
  object nativeImage {
    
    @JSImport("electron", "nativeImage")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/native-image
    /**
      * Creates an empty `NativeImage` instance.
      */
    /* static member */
    inline def createEmpty(): NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
      * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
      */
    /* static member */
    inline def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBitmap")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
      * JPEG first.
      */
    /* static member */
    inline def createFromBuffer(buffer: Buffer): NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[NativeImage_]
    inline def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `dataURL`.
      */
    /* static member */
    inline def createFromDataURL(dataURL: String): NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDataURL")(dataURL.asInstanceOf[js.Any]).asInstanceOf[NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from the NSImage that maps to the given
      * image name. See `System Icons` for a list of possible values.
      *
      * The `hslShift` is applied to the image with the following rules:
      *
      * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
      * and 360 on the hue color wheel (red).
      * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
      * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
      * saturate the image.
      * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
      * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
      * leave unchanged. 1 = full lightness (make all pixels white).
      *
      * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
      * 0]` will make the image completely black.
      *
      * In some cases, the `NSImageName` doesn't match its string representation; one
      * example of this is `NSFolderImageName`, whose string representation would
      * actually be `NSFolder`. Therefore, you'll need to determine the correct string
      * representation for your image before passing it in. This can be done with the
      * following:
      *
      * `echo -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME);
      * }' | clang -otest -x objective-c -framework Cocoa - && ./test`
      *
      * where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
      *
      * @platform darwin
      */
    /* static member */
    inline def createFromNamedImage(imageName: String): NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any]).asInstanceOf[NativeImage_]
    inline def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any], hslShift.asInstanceOf[js.Any])).asInstanceOf[NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from a file located at `path`. This method
      * returns an empty image if the `path` does not exist, cannot be read, or is not a
      * valid image.
      */
    /* static member */
    inline def createFromPath(path: String): NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NativeImage_]
    
    /**
      * fulfilled with the file's thumbnail preview image, which is a NativeImage.
      *
      * @platform darwin,win32
      */
    /* static member */
    inline def createThumbnailFromPath(path: String, maxSize: Size): js.Promise[NativeImage_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createThumbnailFromPath")(path.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NativeImage_]]
  }
  
  @JSImport("electron", "nativeTheme")
  @js.native
  val nativeTheme: NativeTheme = js.native
  
  @JSImport("electron", "net")
  @js.native
  val net: Net = js.native
  
  @JSImport("electron", "netLog")
  @js.native
  val netLog: NetLog = js.native
  
  @JSImport("electron", "powerMonitor")
  @js.native
  val powerMonitor: PowerMonitor = js.native
  
  @JSImport("electron", "powerSaveBlocker")
  @js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  
  @JSImport("electron", "protocol")
  @js.native
  val protocol: Protocol = js.native
  
  @JSImport("electron", "pushNotifications")
  @js.native
  val pushNotifications: PushNotifications = js.native
  
  @JSImport("electron", "safeStorage")
  @js.native
  val safeStorage: SafeStorage = js.native
  
  @JSImport("electron", "screen")
  @js.native
  val screen: Screen = js.native
  
  /* was `typeof Session` */
  @JSImport("electron", "session")
  @js.native
  open class session () extends Session_
  /* was `typeof Session` */
  object session {
    
    @JSImport("electron", "session")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A `Session` object, the default session object of the app.
      */
    /* static member */
    @JSImport("electron", "session.defaultSession")
    @js.native
    def defaultSession: Session_ = js.native
    inline def defaultSession_=(x: Session_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSession")(x.asInstanceOf[js.Any])
    
    // Docs: https://electronjs.org/docs/api/session
    /**
      * A session instance from `partition` string. When there is an existing `Session`
      * with the same `partition`, it will be returned; otherwise a new `Session`
      * instance will be created with `options`.
      *
      * If `partition` starts with `persist:`, the page will use a persistent session
      * available to all pages in the app with the same `partition`. if there is no
      * `persist:` prefix, the page will use an in-memory session. If the `partition` is
      * empty then default session of the app will be returned.
      *
      * To create a `Session` with `options`, you have to ensure the `Session` with the
      * `partition` has never been used before. There is no way to change the `options`
      * of an existing `Session` object.
      */
    /* static member */
    inline def fromPartition(partition: String): Session_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any]).asInstanceOf[Session_]
    inline def fromPartition(partition: String, options: FromPartitionOptions): Session_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Session_]
  }
  
  @JSImport("electron", "shell")
  @js.native
  val shell: Shell = js.native
  
  @JSImport("electron", "systemPreferences")
  @js.native
  val systemPreferences: SystemPreferences = js.native
  
  /* was `typeof WebContents` */
  @JSImport("electron", "webContents")
  @js.native
  open class webContents () extends WebContents_
  /* was `typeof WebContents` */
  object webContents {
    
    @JSImport("electron", "webContents")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/web-contents
    /**
      * | undefined - A WebContents instance with the given TargetID, or `undefined` if
      * there is no WebContents associated with the given TargetID.
      *
      * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
      * a WebContents instance based on its assigned TargetID.
      */
    /* static member */
    inline def fromDevToolsTargetId(targetId: String): WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDevToolsTargetId")(targetId.asInstanceOf[js.Any]).asInstanceOf[WebContents_]
    
    /**
      * | undefined - A WebContents instance with the given WebFrameMain, or `undefined`
      * if there is no WebContents associated with the given WebFrameMain.
      */
    /* static member */
    inline def fromFrame(frame: WebFrameMain_): WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[WebContents_]
    
    /**
      * | undefined - A WebContents instance with the given ID, or `undefined` if there
      * is no WebContents associated with the given ID.
      */
    /* static member */
    inline def fromId(id: Double): WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[WebContents_]
    
    /**
      * An array of all `WebContents` instances. This will contain web contents for all
      * windows, webviews, opened devtools, and devtools extension background pages.
      */
    /* static member */
    inline def getAllWebContents(): js.Array[WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWebContents")().asInstanceOf[js.Array[WebContents_]]
    
    /**
      * | null - The web contents that is focused in this application, otherwise returns
      * `null`.
      */
    /* static member */
    inline def getFocusedWebContents(): WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWebContents")().asInstanceOf[WebContents_]
  }
  
  @JSImport("electron", "webFrame")
  @js.native
  val webFrame: WebFrame = js.native
  
  /* was `typeof WebFrameMain` */
  @JSImport("electron", "webFrameMain")
  @js.native
  open class webFrameMain () extends WebFrameMain_
  /* was `typeof WebFrameMain` */
  object webFrameMain {
    
    @JSImport("electron", "webFrameMain")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/web-frame-main
    /**
      * A frame with the given process and routing IDs, or `undefined` if there is no
      * WebFrameMain associated with the given IDs.
      */
    /* static member */
    inline def fromId(processId: Double, routingId: Double): js.UndefOr[WebFrameMain_] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(processId.asInstanceOf[js.Any], routingId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WebFrameMain_]]
  }
}
