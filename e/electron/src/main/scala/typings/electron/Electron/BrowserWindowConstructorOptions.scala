package typings.electron.Electron

import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`medium-light`
import typings.electron.electronStrings.`ultra-dark`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.active
import typings.electron.electronStrings.content
import typings.electron.electronStrings.customButtonsOnHover
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.default
import typings.electron.electronStrings.followWindow
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hidden
import typings.electron.electronStrings.hiddenInset
import typings.electron.electronStrings.hud
import typings.electron.electronStrings.inactive
import typings.electron.electronStrings.light
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.sheet
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.tooltip
import typings.electron.electronStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserWindowConstructorOptions extends js.Object {
  
  /**
    * Whether the web view accepts a single mouse-down event that simultaneously
    * activates the window. Default is `false`.
    */
  var acceptFirstMouse: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window should always stay on top of other windows. Default is
    * `false`.
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * Auto hide the menu bar unless the `Alt` key is pressed. Default is `false`.
    */
  var autoHideMenuBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Window's background color as a hexadecimal value, like `#66CD00` or `#FFF` or
    * `#80FFFFFF` (alpha in #AARRGGBB format is supported if `transparent` is set to
    * `true`). Default is `#FFF` (white).
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Show window in the center of the screen.
    */
  var center: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether window is closable. This is not implemented on Linux. Default is `true`.
    */
  var closable: js.UndefOr[Boolean] = js.native
  
  /**
    * Forces using dark theme for the window, only works on some GTK+3 desktop
    * environments. Default is `false`.
    */
  var darkTheme: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to hide cursor when typing. Default is `false`.
    */
  var disableAutoHideCursor: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the window to be resized larger than screen. Only relevant for macOS, as
    * other OSes allow larger-than-screen windows by default. Default is `false`.
    */
  var enableLargerThanScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window can be focused. Default is `true`. On Windows setting
    * `focusable: false` also implies setting `skipTaskbar: true`. On Linux setting
    * `focusable: false` makes the window stop interacting with wm, so the window will
    * always stay on top in all workspaces.
    */
  var focusable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify `false` to create a Frameless Window. Default is `true`.
    */
  var frame: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window should show in fullscreen. When explicitly set to `false` the
    * fullscreen button will be hidden or disabled on macOS. Default is `false`.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the title in the title bar in full screen mode on macOS for all
    * `titleBarStyle` options. Default is `false`.
    */
  var fullscreenWindowTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window can be put into fullscreen mode. On macOS, also whether the
    * maximize/zoom button should toggle full screen mode or maximize window. Default
    * is `true`.
    */
  var fullscreenable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether window should have a shadow. Default is `true`.
    */
  var hasShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * Window's height in pixels. Default is `600`.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The window icon. On Windows it is recommended to use `ICO` icons to get best
    * visual effects, you can also leave it undefined so the executable's icon will be
    * used.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Whether the window is in kiosk mode. Default is `false`.
    */
  var kiosk: js.UndefOr[Boolean] = js.native
  
  /**
    * Window's maximum height. Default is no limit.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Window's maximum width. Default is no limit.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether window is maximizable. This is not implemented on Linux. Default is
    * `true`.
    */
  var maximizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Window's minimum height. Default is `0`.
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * Window's minimum width. Default is `0`.
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether window is minimizable. This is not implemented on Linux. Default is
    * `true`.
    */
  var minimizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this is a modal window. This only works when the window is a child
    * window. Default is `false`.
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether window is movable. This is not implemented on Linux. Default is `true`.
    */
  var movable: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
    * (fully opaque). This is only implemented on Windows and macOS.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Whether the renderer should be active when `show` is `false` and it has just
    * been created.  In order for `document.visibilityState` to work correctly on
    * first load with `show: false` you should set this to `false`.  Setting this to
    * `false` will cause the `ready-to-show` event to not fire.  Default is `true`.
    */
  var paintWhenInitiallyHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify parent window. Default is `null`.
    */
  var parent: js.UndefOr[BrowserWindow] = js.native
  
  /**
    * Whether window is resizable. Default is `true`.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether window should be shown when created. Default is `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * Use pre-Lion fullscreen on macOS. Default is `false`.
    */
  var simpleFullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the window in taskbar. Default is `false`.
    */
  var skipTaskbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Tab group name, allows opening the window as a native tab on macOS 10.12+.
    * Windows with the same tabbing identifier will be grouped together. This also
    * adds a native new tab button to your window's tab bar and allows your `app` and
    * window to receive the `new-window-for-tab` event.
    */
  var tabbingIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Use `WS_THICKFRAME` style for frameless windows on Windows, which adds standard
    * window frame. Setting it to `false` will remove window shadow and window
    * animations. Default is `true`.
    */
  var thickFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * Default window title. Default is `"Electron"`. If the HTML tag `<title>` is
    * defined in the HTML file loaded by `loadURL()`, this property will be ignored.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The style of window title bar. Default is `default`. Possible values are:
    */
  var titleBarStyle: js.UndefOr[default | hidden | hiddenInset | customButtonsOnHover] = js.native
  
  /**
    * Set a custom position for the traffic light buttons. Can only be used with
    * `titleBarStyle` set to `hidden`
    */
  var trafficLightPosition: js.UndefOr[Point] = js.native
  
  /**
    * Makes the window transparent. Default is `false`. On Windows, does not work
    * unless the window is frameless.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of window, default is normal window. See more about this below.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The `width` and `height` would be used as web page's size, which means the
    * actual window's size will include window frame's size and be slightly larger.
    * Default is `false`.
    */
  var useContentSize: js.UndefOr[Boolean] = js.native
  
  /**
    * Add a type of vibrancy effect to the window, only on macOS. Can be
    * `appearance-based`, `light`, `dark`, `titlebar`, `selection`, `menu`, `popover`,
    * `sidebar`, `medium-light`, `ultra-dark`, `header`, `sheet`, `window`, `hud`,
    * `fullscreen-ui`, `tooltip`, `content`, `under-window`, or `under-page`.  Please
    * note that using `frame: false` in combination with a vibrancy value requires
    * that you use a non-default `titleBarStyle` as well. Also note that
    * `appearance-based`, `light`, `dark`, `medium-light`, and `ultra-dark` have been
    * deprecated and will be removed in an upcoming version of macOS.
    */
  var vibrancy: js.UndefOr[
    `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark` | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`
  ] = js.native
  
  /**
    * Specify how the material appearance should reflect window activity state on
    * macOS. Must be used with the `vibrancy` property. Possible values are:
    */
  var visualEffectState: js.UndefOr[followWindow | active | inactive] = js.native
  
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.native
  
  /**
    * Window's width in pixels. Default is `800`.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * (**required** if y is used) Window's left offset from screen. Default is to
    * center the window.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (**required** if x is used) Window's top offset from screen. Default is to
    * center the window.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * Controls the behavior on macOS when option-clicking the green stoplight button
    * on the toolbar or by clicking the Window > Zoom menu item. If `true`, the window
    * will grow to the preferred width of the web page when zoomed, `false` will cause
    * it to zoom to the width of the screen. This will also affect the behavior when
    * calling `maximize()` directly. Default is `false`.
    */
  var zoomToPageWidth: js.UndefOr[Boolean] = js.native
}
object BrowserWindowConstructorOptions {
  
  @scala.inline
  def apply(): BrowserWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserWindowConstructorOptions]
  }
  
  @scala.inline
  implicit class BrowserWindowConstructorOptionsOps[Self <: BrowserWindowConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setAcceptFirstMouse(value: Boolean): Self = this.set("acceptFirstMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptFirstMouse: Self = this.set("acceptFirstMouse", js.undefined)
    
    @scala.inline
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    
    @scala.inline
    def setAutoHideMenuBar(value: Boolean): Self = this.set("autoHideMenuBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideMenuBar: Self = this.set("autoHideMenuBar", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setDarkTheme(value: Boolean): Self = this.set("darkTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkTheme: Self = this.set("darkTheme", js.undefined)
    
    @scala.inline
    def setDisableAutoHideCursor(value: Boolean): Self = this.set("disableAutoHideCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoHideCursor: Self = this.set("disableAutoHideCursor", js.undefined)
    
    @scala.inline
    def setEnableLargerThanScreen(value: Boolean): Self = this.set("enableLargerThanScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLargerThanScreen: Self = this.set("enableLargerThanScreen", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setFullscreenWindowTitle(value: Boolean): Self = this.set("fullscreenWindowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenWindowTitle: Self = this.set("fullscreenWindowTitle", js.undefined)
    
    @scala.inline
    def setFullscreenable(value: Boolean): Self = this.set("fullscreenable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenable: Self = this.set("fullscreenable", js.undefined)
    
    @scala.inline
    def setHasShadow(value: Boolean): Self = this.set("hasShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasShadow: Self = this.set("hasShadow", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setKiosk(value: Boolean): Self = this.set("kiosk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKiosk: Self = this.set("kiosk", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMovable(value: Boolean): Self = this.set("movable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovable: Self = this.set("movable", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPaintWhenInitiallyHidden(value: Boolean): Self = this.set("paintWhenInitiallyHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintWhenInitiallyHidden: Self = this.set("paintWhenInitiallyHidden", js.undefined)
    
    @scala.inline
    def setParent(value: BrowserWindow): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSimpleFullscreen(value: Boolean): Self = this.set("simpleFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleFullscreen: Self = this.set("simpleFullscreen", js.undefined)
    
    @scala.inline
    def setSkipTaskbar(value: Boolean): Self = this.set("skipTaskbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTaskbar: Self = this.set("skipTaskbar", js.undefined)
    
    @scala.inline
    def setTabbingIdentifier(value: String): Self = this.set("tabbingIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabbingIdentifier: Self = this.set("tabbingIdentifier", js.undefined)
    
    @scala.inline
    def setThickFrame(value: Boolean): Self = this.set("thickFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickFrame: Self = this.set("thickFrame", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleBarStyle(value: default | hidden | hiddenInset | customButtonsOnHover): Self = this.set("titleBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBarStyle: Self = this.set("titleBarStyle", js.undefined)
    
    @scala.inline
    def setTrafficLightPosition(value: Point): Self = this.set("trafficLightPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficLightPosition: Self = this.set("trafficLightPosition", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseContentSize(value: Boolean): Self = this.set("useContentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContentSize: Self = this.set("useContentSize", js.undefined)
    
    @scala.inline
    def setVibrancy(
      value: `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark` | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`
    ): Self = this.set("vibrancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrancy: Self = this.set("vibrancy", js.undefined)
    
    @scala.inline
    def setVisualEffectState(value: followWindow | active | inactive): Self = this.set("visualEffectState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualEffectState: Self = this.set("visualEffectState", js.undefined)
    
    @scala.inline
    def setWebPreferences(value: WebPreferences): Self = this.set("webPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPreferences: Self = this.set("webPreferences", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZoomToPageWidth(value: Boolean): Self = this.set("zoomToPageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomToPageWidth: Self = this.set("zoomToPageWidth", js.undefined)
  }
}
