package typings.electron.Electron

import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`medium-light`
import typings.electron.electronStrings.`ultra-dark`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.content
import typings.electron.electronStrings.customButtonsOnHover
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.default
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hidden
import typings.electron.electronStrings.hiddenInset
import typings.electron.electronStrings.hud
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
import scala.scalajs.js.annotation._

trait BrowserWindowConstructorOptions extends js.Object {
  /**
    * Whether the web view accepts a single mouse-down event that simultaneously
    * activates the window. Default is `false`.
    */
  var acceptFirstMouse: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window should always stay on top of other windows. Default is
    * `false`.
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Auto hide the menu bar unless the `Alt` key is pressed. Default is `false`.
    */
  var autoHideMenuBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's background color as a hexadecimal value, like `#66CD00` or `#FFF` or
    * `#80FFFFFF` (alpha in #AARRGGBB format is supported if `transparent` is set to
    * `true`). Default is `#FFF` (white).
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Show window in the center of the screen.
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether window is closable. This is not implemented on Linux. Default is `true`.
    */
  var closable: js.UndefOr[Boolean] = js.undefined
  /**
    * Forces using dark theme for the window, only works on some GTK+3 desktop
    * environments. Default is `false`.
    */
  var darkTheme: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to hide cursor when typing. Default is `false`.
    */
  var disableAutoHideCursor: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable the window to be resized larger than screen. Only relevant for macOS, as
    * other OSes allow larger-than-screen windows by default. Default is `false`.
    */
  var enableLargerThanScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window can be focused. Default is `true`. On Windows setting
    * `focusable: false` also implies setting `skipTaskbar: true`. On Linux setting
    * `focusable: false` makes the window stop interacting with wm, so the window will
    * always stay on top in all workspaces.
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify `false` to create a Frameless Window. Default is `true`.
    */
  var frame: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window should show in fullscreen. When explicitly set to `false` the
    * fullscreen button will be hidden or disabled on macOS. Default is `false`.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the title in the title bar in full screen mode on macOS for all
    * `titleBarStyle` options. Default is `false`.
    */
  var fullscreenWindowTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window can be put into fullscreen mode. On macOS, also whether the
    * maximize/zoom button should toggle full screen mode or maximize window. Default
    * is `true`.
    */
  var fullscreenable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether window should have a shadow. Default is `true`.
    */
  var hasShadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's height in pixels. Default is `600`.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The window icon. On Windows it is recommended to use `ICO` icons to get best
    * visual effects, you can also leave it undefined so the executable's icon will be
    * used.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  /**
    * The kiosk mode. Default is `false`.
    */
  var kiosk: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's maximum height. Default is no limit.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Window's maximum width. Default is no limit.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether window is maximizable. This is not implemented on Linux. Default is
    * `true`.
    */
  var maximizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's minimum height. Default is `0`.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * Window's minimum width. Default is `0`.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether window is minimizable. This is not implemented on Linux. Default is
    * `true`.
    */
  var minimizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this is a modal window. This only works when the window is a child
    * window. Default is `false`.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether window is movable. This is not implemented on Linux. Default is `true`.
    */
  var movable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
    * (fully opaque). This is only implemented on Windows and macOS.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Whether the renderer should be active when `show` is `false` and it has just
    * been created.  In order for `document.visibilityState` to work correctly on
    * first load with `show: false` you should set this to `false`.  Setting this to
    * `false` will cause the `ready-to-show` event to not fire.  Default is `true`.
    */
  var paintWhenInitiallyHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify parent window. Default is `null`.
    */
  var parent: js.UndefOr[BrowserWindow] = js.undefined
  /**
    * Whether window is resizable. Default is `true`.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether window should be shown when created. Default is `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Use pre-Lion fullscreen on macOS. Default is `false`.
    */
  var simpleFullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the window in taskbar. Default is `false`.
    */
  var skipTaskbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Tab group name, allows opening the window as a native tab on macOS 10.12+.
    * Windows with the same tabbing identifier will be grouped together. This also
    * adds a native new tab button to your window's tab bar and allows your `app` and
    * window to receive the `new-window-for-tab` event.
    */
  var tabbingIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Use `WS_THICKFRAME` style for frameless windows on Windows, which adds standard
    * window frame. Setting it to `false` will remove window shadow and window
    * animations. Default is `true`.
    */
  var thickFrame: js.UndefOr[Boolean] = js.undefined
  /**
    * Default window title. Default is `"Electron"`. If the HTML tag `<title>` is
    * defined in the HTML file loaded by `loadURL()`, this property will be ignored.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The style of window title bar. Default is `default`. Possible values are:
    */
  var titleBarStyle: js.UndefOr[default | hidden | hiddenInset | customButtonsOnHover] = js.undefined
  /**
    * Set a custom position for the traffic light buttons. Can only be used with
    * `titleBarStyle` set to `hidden`
    */
  var trafficLightPosition: js.UndefOr[Point] = js.undefined
  /**
    * Makes the window transparent. Default is `false`. On Windows, does not work
    * unless the window is frameless.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of window, default is normal window. See more about this below.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The `width` and `height` would be used as web page's size, which means the
    * actual window's size will include window frame's size and be slightly larger.
    * Default is `false`.
    */
  var useContentSize: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
  /**
    * Window's width in pixels. Default is `800`.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (**required** if y is used) Window's left offset from screen. Default is to
    * center the window.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (**required** if x is used) Window's top offset from screen. Default is to
    * center the window.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * Controls the behavior on macOS when option-clicking the green stoplight button
    * on the toolbar or by clicking the Window > Zoom menu item. If `true`, the window
    * will grow to the preferred width of the web page when zoomed, `false` will cause
    * it to zoom to the width of the screen. This will also affect the behavior when
    * calling `maximize()` directly. Default is `false`.
    */
  var zoomToPageWidth: js.UndefOr[Boolean] = js.undefined
}

object BrowserWindowConstructorOptions {
  @scala.inline
  def apply(
    acceptFirstMouse: js.UndefOr[Boolean] = js.undefined,
    alwaysOnTop: js.UndefOr[Boolean] = js.undefined,
    autoHideMenuBar: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    darkTheme: js.UndefOr[Boolean] = js.undefined,
    disableAutoHideCursor: js.UndefOr[Boolean] = js.undefined,
    enableLargerThanScreen: js.UndefOr[Boolean] = js.undefined,
    focusable: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    fullscreenWindowTitle: js.UndefOr[Boolean] = js.undefined,
    fullscreenable: js.UndefOr[Boolean] = js.undefined,
    hasShadow: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    icon: NativeImage_ | String = null,
    kiosk: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    movable: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    paintWhenInitiallyHidden: js.UndefOr[Boolean] = js.undefined,
    parent: BrowserWindow = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    simpleFullscreen: js.UndefOr[Boolean] = js.undefined,
    skipTaskbar: js.UndefOr[Boolean] = js.undefined,
    tabbingIdentifier: String = null,
    thickFrame: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleBarStyle: default | hidden | hiddenInset | customButtonsOnHover = null,
    trafficLightPosition: Point = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    useContentSize: js.UndefOr[Boolean] = js.undefined,
    vibrancy: `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark` | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page` = null,
    webPreferences: WebPreferences = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zoomToPageWidth: js.UndefOr[Boolean] = js.undefined
  ): BrowserWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptFirstMouse)) __obj.updateDynamic("acceptFirstMouse")(acceptFirstMouse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideMenuBar)) __obj.updateDynamic("autoHideMenuBar")(autoHideMenuBar.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(darkTheme)) __obj.updateDynamic("darkTheme")(darkTheme.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoHideCursor)) __obj.updateDynamic("disableAutoHideCursor")(disableAutoHideCursor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLargerThanScreen)) __obj.updateDynamic("enableLargerThanScreen")(enableLargerThanScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenWindowTitle)) __obj.updateDynamic("fullscreenWindowTitle")(fullscreenWindowTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenable)) __obj.updateDynamic("fullscreenable")(fullscreenable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasShadow)) __obj.updateDynamic("hasShadow")(hasShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paintWhenInitiallyHidden)) __obj.updateDynamic("paintWhenInitiallyHidden")(paintWhenInitiallyHidden.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleFullscreen)) __obj.updateDynamic("simpleFullscreen")(simpleFullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTaskbar)) __obj.updateDynamic("skipTaskbar")(skipTaskbar.get.asInstanceOf[js.Any])
    if (tabbingIdentifier != null) __obj.updateDynamic("tabbingIdentifier")(tabbingIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(thickFrame)) __obj.updateDynamic("thickFrame")(thickFrame.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBarStyle != null) __obj.updateDynamic("titleBarStyle")(titleBarStyle.asInstanceOf[js.Any])
    if (trafficLightPosition != null) __obj.updateDynamic("trafficLightPosition")(trafficLightPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentSize)) __obj.updateDynamic("useContentSize")(useContentSize.get.asInstanceOf[js.Any])
    if (vibrancy != null) __obj.updateDynamic("vibrancy")(vibrancy.asInstanceOf[js.Any])
    if (webPreferences != null) __obj.updateDynamic("webPreferences")(webPreferences.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToPageWidth)) __obj.updateDynamic("zoomToPageWidth")(zoomToPageWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserWindowConstructorOptions]
  }
}

