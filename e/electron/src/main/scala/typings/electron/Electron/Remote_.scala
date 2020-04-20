package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.NodeJS.Process
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

trait Remote_ extends CommonInterface {
  /**
    * A `NodeJS.Process` object.  The `process` object in the main process. This is
    * the same as `remote.getGlobal('process')` but is cached.
    *
    */
  val process: Process
  // Docs: http://electronjs.org/docs/api/remote
  /**
    * The web contents of this web page.
    */
  def getCurrentWebContents(): WebContents_
  /**
    * The window to which this web page belongs.
    *
    * **Note:** Do not use `removeAllListeners` on `BrowserWindow`. Use of this can
    * remove all `blur` listeners, disable click events on touch bar buttons, and
    * other unintended consequences.
    */
  def getCurrentWindow(): BrowserWindow
  /**
    * The global variable of `name` (e.g. `global[name]`) in the main process.
    */
  def getGlobal(name: String): js.Any
  /**
    * The object returned by `require(module)` in the main process. Modules specified
    * by their relative path will resolve relative to the entrypoint of the main
    * process.
  e.g.
    */
  def require(module: String): js.Any
}

object Remote_ {
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
    getCurrentWebContents: () => WebContents_,
    getCurrentWindow: () => BrowserWindow,
    getGlobal: String => js.Any,
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
    process: Process,
    protocol: Protocol_,
    remote: Remote_,
    require: String => js.Any,
    screen: Screen_,
    session: TypeofSession,
    shell: Shell_,
    systemPreferences: SystemPreferences_,
    webContents: TypeofWebContents,
    webFrame: WebFrame_,
    webviewTag: WebviewTag_
  ): Remote_ = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], getCurrentWebContents = js.Any.fromFunction0(getCurrentWebContents), getCurrentWindow = js.Any.fromFunction0(getCurrentWindow), getGlobal = js.Any.fromFunction1(getGlobal), globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote_]
  }
}

