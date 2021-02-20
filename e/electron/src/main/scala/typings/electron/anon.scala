package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.electron.Electron.Accelerator
import typings.electron.Electron.App
import typings.electron.Electron.AutoUpdater
import typings.electron.Electron.BrowserView
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.BrowserWindowProxy
import typings.electron.Electron.ClientRequest
import typings.electron.Electron.ClientRequestConstructorOptions
import typings.electron.Electron.Clipboard
import typings.electron.Electron.CommandLine
import typings.electron.Electron.Common.NativeImage_
import typings.electron.Electron.ContentTracing
import typings.electron.Electron.ContextBridge
import typings.electron.Electron.Cookies
import typings.electron.Electron.CrashReporter
import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.electron.Electron.Debugger
import typings.electron.Electron.DesktopCapturer
import typings.electron.Electron.Dialog
import typings.electron.Electron.Dock
import typings.electron.Electron.DownloadItem
import typings.electron.Electron.ExtensionInfo
import typings.electron.Electron.FromPartitionOptions
import typings.electron.Electron.GlobalShortcut
import typings.electron.Electron.InAppPurchase
import typings.electron.Electron.IncomingMessage
import typings.electron.Electron.IpcMain
import typings.electron.Electron.IpcRenderer
import typings.electron.Electron.Menu
import typings.electron.Electron.MenuItem
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.MessageChannelMain
import typings.electron.Electron.MessagePortMain
import typings.electron.Electron.NativeTheme
import typings.electron.Electron.Net
import typings.electron.Electron.NetLog
import typings.electron.Electron.Notification
import typings.electron.Electron.NotificationConstructorOptions
import typings.electron.Electron.PowerMonitor
import typings.electron.Electron.PowerSaveBlocker
import typings.electron.Electron.Protocol
import typings.electron.Electron.Remote
import typings.electron.Electron.Screen
import typings.electron.Electron.ServiceWorkers
import typings.electron.Electron.Session_
import typings.electron.Electron.Shell
import typings.electron.Electron.Size
import typings.electron.Electron.SystemPreferences
import typings.electron.Electron.TouchBar
import typings.electron.Electron.TouchBarButton
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPicker
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarConstructorOptions
import typings.electron.Electron.TouchBarGroup
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabel
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarOtherItemsProxy
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
import typings.electron.Electron.WebContents_
import typings.electron.Electron.WebFrame
import typings.electron.Electron.WebRequest
import typings.electron.Electron.WebviewTag
import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<electron.Electron.Rectangle> */
  @js.native
  trait PartialRectangle extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object PartialRectangle {
    
    @scala.inline
    def apply(): PartialRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRectangle]
    }
    
    @scala.inline
    implicit class PartialRectangleMutableBuilder[Self <: PartialRectangle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBrowserWindow extends StObject {
    
    /**
      * Adds DevTools extension located at `path`, and returns extension's name.
      *
      * The extension will be remembered so you only need to call this API once, this
      * API is not for programming use. If you try to add an extension that has already
      * been loaded, this method will not return and instead log a warning to the
      * console.
      *
      * The method will also not return if the extension's manifest is missing or
      * incomplete.
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      * 
    **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
      *
      * @deprecated
      */
    /* static member */
    def addDevToolsExtension(path: String): Unit = js.native
    
    /**
      * Adds Chrome extension located at `path`, and returns extension's name.
      *
      * The method will also not return if the extension's manifest is missing or
      * incomplete.
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      * 
    **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
      *
      * @deprecated
      */
    /* static member */
    def addExtension(path: String): Unit = js.native
    
    /**
      * The window that owns the given `browserView`. If the given view is not attached
      * to any window, returns `null`.
      */
    /* static member */
    def fromBrowserView(browserView: BrowserView): BrowserWindow | Null = js.native
    
    /**
      * The window with the given `id`.
      */
    /* static member */
    def fromId(id: Double): BrowserWindow | Null = js.native
    
    /**
      * The window that owns the given `webContents` or `null` if the contents are not
      * owned by a window.
      */
    /* static member */
    def fromWebContents(webContents: WebContents_): BrowserWindow | Null = js.native
    
    /**
      * An array of all opened browser windows.
      */
    /* static member */
    def getAllWindows(): js.Array[BrowserWindow] = js.native
    
    /**
      * The keys are the extension names and each value is an Object containing `name`
      * and `version` properties.
      *
      * To check if a DevTools extension is installed you can run the following:
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      * 
    **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
      *
      * @deprecated
      */
    /* static member */
    def getDevToolsExtensions(): Record[String, ExtensionInfo] = js.native
    
    /**
      * The keys are the extension names and each value is an Object containing `name`
      * and `version` properties.
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      * 
    **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
      *
      * @deprecated
      */
    /* static member */
    def getExtensions(): Record[String, ExtensionInfo] = js.native
    
    /**
      * The window that is focused in this application, otherwise returns `null`.
      */
    /* static member */
    def getFocusedWindow(): BrowserWindow | Null = js.native
    
    /**
      * Remove a DevTools extension by name.
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      *
      * **Note:** This method is deprecated. Instead, use
      * `ses.removeExtension(extension_id)`.
      *
      * @deprecated
      */
    /* static member */
    def removeDevToolsExtension(name: String): Unit = js.native
    
    /**
      * Remove a Chrome extension by name.
      *
      * **Note:** This API cannot be called before the `ready` event of the `app` module
      * is emitted.
      *
      * **Note:** This method is deprecated. Instead, use
      * `ses.removeExtension(extension_id)`.
      *
      * @deprecated
      */
    /* static member */
    def removeExtension(name: String): Unit = js.native
  }
  object TypeofBrowserWindow {
    
    @scala.inline
    def apply(
      addDevToolsExtension: String => Unit,
      addExtension: String => Unit,
      fromBrowserView: BrowserView => BrowserWindow | Null,
      fromId: Double => BrowserWindow | Null,
      fromWebContents: WebContents_ => BrowserWindow | Null,
      getAllWindows: () => js.Array[BrowserWindow],
      getDevToolsExtensions: () => Record[String, ExtensionInfo],
      getExtensions: () => Record[String, ExtensionInfo],
      getFocusedWindow: () => BrowserWindow | Null,
      removeDevToolsExtension: String => Unit,
      removeExtension: String => Unit
    ): TypeofBrowserWindow = {
      val __obj = js.Dynamic.literal(addDevToolsExtension = js.Any.fromFunction1(addDevToolsExtension), addExtension = js.Any.fromFunction1(addExtension), fromBrowserView = js.Any.fromFunction1(fromBrowserView), fromId = js.Any.fromFunction1(fromId), fromWebContents = js.Any.fromFunction1(fromWebContents), getAllWindows = js.Any.fromFunction0(getAllWindows), getDevToolsExtensions = js.Any.fromFunction0(getDevToolsExtensions), getExtensions = js.Any.fromFunction0(getExtensions), getFocusedWindow = js.Any.fromFunction0(getFocusedWindow), removeDevToolsExtension = js.Any.fromFunction1(removeDevToolsExtension), removeExtension = js.Any.fromFunction1(removeExtension))
      __obj.asInstanceOf[TypeofBrowserWindow]
    }
    
    @scala.inline
    implicit class TypeofBrowserWindowMutableBuilder[Self <: TypeofBrowserWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDevToolsExtension(value: String => Unit): Self = StObject.set(x, "addDevToolsExtension", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddExtension(value: String => Unit): Self = StObject.set(x, "addExtension", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromBrowserView(value: BrowserView => BrowserWindow | Null): Self = StObject.set(x, "fromBrowserView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromId(value: Double => BrowserWindow | Null): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromWebContents(value: WebContents_ => BrowserWindow | Null): Self = StObject.set(x, "fromWebContents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAllWindows(value: () => js.Array[BrowserWindow]): Self = StObject.set(x, "getAllWindows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDevToolsExtensions(value: () => Record[String, ExtensionInfo]): Self = StObject.set(x, "getDevToolsExtensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExtensions(value: () => Record[String, ExtensionInfo]): Self = StObject.set(x, "getExtensions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedWindow(value: () => BrowserWindow | Null): Self = StObject.set(x, "getFocusedWindow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveDevToolsExtension(value: String => Unit): Self = StObject.set(x, "removeDevToolsExtension", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveExtension(value: String => Unit): Self = StObject.set(x, "removeExtension", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofCommon extends StObject {
    
    var NativeImage: Instantiable0[NativeImage_] = js.native
    
    val clipboard: Clipboard = js.native
    
    val crashReporter: CrashReporter = js.native
    
    val desktopCapturer: DesktopCapturer = js.native
    
    val shell: Shell = js.native
  }
  object TypeofCommon {
    
    @scala.inline
    def apply(
      NativeImage: Instantiable0[NativeImage_],
      clipboard: Clipboard,
      crashReporter: CrashReporter,
      desktopCapturer: DesktopCapturer,
      shell: Shell
    ): TypeofCommon = {
      val __obj = js.Dynamic.literal(NativeImage = NativeImage.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCommon]
    }
    
    @scala.inline
    implicit class TypeofCommonMutableBuilder[Self <: TypeofCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeImage(value: Instantiable0[NativeImage_]): Self = StObject.set(x, "NativeImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofElectron extends StObject {
    
    var Accelerator: Instantiable0[typings.electron.Electron.Accelerator] = js.native
    
    var BrowserView: Instantiable1[
        /* options */ js.UndefOr[BrowserViewConstructorOptions], 
        typings.electron.Electron.BrowserView
      ] = js.native
    
    var BrowserWindow: (Instantiable1[
        /* options */ js.UndefOr[BrowserWindowConstructorOptions], 
        typings.electron.Electron.BrowserWindow
      ]) with TypeofBrowserWindow = js.native
    
    var BrowserWindowProxy: Instantiable0[typings.electron.Electron.BrowserWindowProxy] = js.native
    
    var ClientRequest: Instantiable1[
        /* options */ ClientRequestConstructorOptions | String, 
        typings.electron.Electron.ClientRequest
      ] = js.native
    
    var CommandLine: Instantiable0[typings.electron.Electron.CommandLine] = js.native
    
    val Common: TypeofCommon = js.native
    
    var Cookies: Instantiable0[typings.electron.Electron.Cookies] = js.native
    
    var Debugger: Instantiable0[typings.electron.Electron.Debugger] = js.native
    
    var Dock: Instantiable0[typings.electron.Electron.Dock] = js.native
    
    var DownloadItem: Instantiable0[typings.electron.Electron.DownloadItem] = js.native
    
    var IncomingMessage: Instantiable0[typings.electron.Electron.IncomingMessage] = js.native
    
    val Main: TypeofMain = js.native
    
    var Menu: Instantiable0[typings.electron.Electron.Menu] with TypeofMenu = js.native
    
    var MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, typings.electron.Electron.MenuItem] = js.native
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.MessageChannelMain] = js.native
    
    var MessagePortMain: Instantiable0[typings.electron.Electron.MessagePortMain] = js.native
    
    var NativeImage: Instantiable0[typings.electron.Electron.NativeImage_] with TypeofNativeImage = js.native
    
    var Notification: (Instantiable1[
        /* options */ js.UndefOr[NotificationConstructorOptions], 
        typings.electron.Electron.Notification
      ]) with TypeofNotification = js.native
    
    val Renderer: TypeofRenderer = js.native
    
    var ServiceWorkers: Instantiable0[typings.electron.Electron.ServiceWorkers] = js.native
    
    var Session: Instantiable0[Session_] with TypeofSession = js.native
    
    var TouchBar: (Instantiable1[/* options */ TouchBarConstructorOptions, typings.electron.Electron.TouchBar]) with TypeofTouchBar = js.native
    
    var TouchBarButton: Instantiable1[
        /* options */ TouchBarButtonConstructorOptions, 
        typings.electron.Electron.TouchBarButton
      ] = js.native
    
    var TouchBarColorPicker: Instantiable1[
        /* options */ TouchBarColorPickerConstructorOptions, 
        typings.electron.Electron.TouchBarColorPicker
      ] = js.native
    
    var TouchBarGroup: Instantiable1[
        /* options */ TouchBarGroupConstructorOptions, 
        typings.electron.Electron.TouchBarGroup
      ] = js.native
    
    var TouchBarLabel: Instantiable1[
        /* options */ TouchBarLabelConstructorOptions, 
        typings.electron.Electron.TouchBarLabel
      ] = js.native
    
    var TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.TouchBarOtherItemsProxy] = js.native
    
    var TouchBarPopover: Instantiable1[
        /* options */ TouchBarPopoverConstructorOptions, 
        typings.electron.Electron.TouchBarPopover
      ] = js.native
    
    var TouchBarScrubber: Instantiable1[
        /* options */ TouchBarScrubberConstructorOptions, 
        typings.electron.Electron.TouchBarScrubber
      ] = js.native
    
    var TouchBarSegmentedControl: Instantiable1[
        /* options */ TouchBarSegmentedControlConstructorOptions, 
        typings.electron.Electron.TouchBarSegmentedControl
      ] = js.native
    
    var TouchBarSlider: Instantiable1[
        /* options */ TouchBarSliderConstructorOptions, 
        typings.electron.Electron.TouchBarSlider
      ] = js.native
    
    var TouchBarSpacer: Instantiable1[
        /* options */ TouchBarSpacerConstructorOptions, 
        typings.electron.Electron.TouchBarSpacer
      ] = js.native
    
    var Tray: Instantiable2[
        /* image */ typings.electron.Electron.NativeImage_ | String, 
        /* guid */ js.UndefOr[String], 
        typings.electron.Electron.Tray
      ] = js.native
    
    var WebContents: Instantiable0[WebContents_] with TypeofWebContents = js.native
    
    var WebRequest: Instantiable0[typings.electron.Electron.WebRequest] = js.native
    
    val app: App = js.native
    
    val autoUpdater: AutoUpdater = js.native
    
    val clipboard: Clipboard = js.native
    
    val contentTracing: ContentTracing = js.native
    
    val contextBridge: ContextBridge = js.native
    
    val crashReporter: CrashReporter = js.native
    
    val desktopCapturer: DesktopCapturer = js.native
    
    val dialog: Dialog = js.native
    
    val globalShortcut: GlobalShortcut = js.native
    
    val inAppPurchase: InAppPurchase = js.native
    
    val ipcMain: IpcMain = js.native
    
    val ipcRenderer: IpcRenderer = js.native
    
    val nativeTheme: NativeTheme = js.native
    
    val net: Net = js.native
    
    val netLog: NetLog = js.native
    
    val powerMonitor: PowerMonitor = js.native
    
    val powerSaveBlocker: PowerSaveBlocker = js.native
    
    val protocol: Protocol = js.native
    
    val remote: Remote = js.native
    
    val screen: Screen = js.native
    
    val shell: Shell = js.native
    
    val systemPreferences: SystemPreferences = js.native
    
    val webFrame: WebFrame = js.native
    
    val webviewTag: WebviewTag = js.native
  }
  object TypeofElectron {
    
    @scala.inline
    def apply(
      Accelerator: Instantiable0[Accelerator],
      BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
      BrowserWindow: (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]) with TypeofBrowserWindow,
      BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
      ClientRequest: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest],
      CommandLine: Instantiable0[CommandLine],
      Common: TypeofCommon,
      Cookies: Instantiable0[Cookies],
      Debugger: Instantiable0[Debugger],
      Dock: Instantiable0[Dock],
      DownloadItem: Instantiable0[DownloadItem],
      IncomingMessage: Instantiable0[IncomingMessage],
      Main: TypeofMain,
      Menu: Instantiable0[Menu] with TypeofMenu,
      MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
      MessageChannelMain: Instantiable0[MessageChannelMain],
      MessagePortMain: Instantiable0[MessagePortMain],
      NativeImage: Instantiable0[typings.electron.Electron.NativeImage_] with TypeofNativeImage,
      Notification: (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]) with TypeofNotification,
      Renderer: TypeofRenderer,
      ServiceWorkers: Instantiable0[ServiceWorkers],
      Session: Instantiable0[Session_] with TypeofSession,
      TouchBar: (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]) with TypeofTouchBar,
      TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
      TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
      TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
      TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
      TouchBarOtherItemsProxy: Instantiable0[TouchBarOtherItemsProxy],
      TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
      TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
      TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
      TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
      TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
      Tray: Instantiable2[
          /* image */ typings.electron.Electron.NativeImage_ | String, 
          /* guid */ js.UndefOr[String], 
          Tray
        ],
      WebContents: Instantiable0[WebContents_] with TypeofWebContents,
      WebRequest: Instantiable0[WebRequest],
      app: App,
      autoUpdater: AutoUpdater,
      clipboard: Clipboard,
      contentTracing: ContentTracing,
      contextBridge: ContextBridge,
      crashReporter: CrashReporter,
      desktopCapturer: DesktopCapturer,
      dialog: Dialog,
      globalShortcut: GlobalShortcut,
      inAppPurchase: InAppPurchase,
      ipcMain: IpcMain,
      ipcRenderer: IpcRenderer,
      nativeTheme: NativeTheme,
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
      val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Common = Common.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Main = Main.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], NativeImage = NativeImage.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Renderer = Renderer.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarOtherItemsProxy = TouchBarOtherItemsProxy.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofElectron]
    }
    
    @scala.inline
    implicit class TypeofElectronMutableBuilder[Self <: TypeofElectron] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Instantiable0[Accelerator]): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserView(value: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindow(
        value: (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]) with TypeofBrowserWindow
      ): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = StObject.set(x, "BrowserWindowProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequest(value: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest]): Self = StObject.set(x, "ClientRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandLine(value: Instantiable0[CommandLine]): Self = StObject.set(x, "CommandLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommon(value: TypeofCommon): Self = StObject.set(x, "Common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextBridge(value: ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookies(value: Instantiable0[Cookies]): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugger(value: Instantiable0[Debugger]): Self = StObject.set(x, "Debugger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDock(value: Instantiable0[Dock]): Self = StObject.set(x, "Dock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadItem(value: Instantiable0[DownloadItem]): Self = StObject.set(x, "DownloadItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingMessage(value: Instantiable0[IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcRenderer(value: IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: TypeofMain): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenu(value: Instantiable0[Menu] with TypeofMenu): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItem(value: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePortMain(value: Instantiable0[MessagePortMain]): Self = StObject.set(x, "MessagePortMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeImage(value: Instantiable0[typings.electron.Electron.NativeImage_] with TypeofNativeImage): Self = StObject.set(x, "NativeImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(
        value: (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]) with TypeofNotification
      ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: Remote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderer(value: TypeofRenderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceWorkers(value: Instantiable0[ServiceWorkers]): Self = StObject.set(x, "ServiceWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Instantiable0[Session_] with TypeofSession): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBar(value: (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]) with TypeofTouchBar): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarButton(value: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton]): Self = StObject.set(x, "TouchBarButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarColorPicker(value: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker]): Self = StObject.set(x, "TouchBarColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarGroup(value: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup]): Self = StObject.set(x, "TouchBarGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarLabel(value: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel]): Self = StObject.set(x, "TouchBarLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarOtherItemsProxy(value: Instantiable0[TouchBarOtherItemsProxy]): Self = StObject.set(x, "TouchBarOtherItemsProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarPopover(value: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover]): Self = StObject.set(x, "TouchBarPopover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarScrubber(value: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber]): Self = StObject.set(x, "TouchBarScrubber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSegmentedControl(
        value: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl]
      ): Self = StObject.set(x, "TouchBarSegmentedControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSlider(value: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider]): Self = StObject.set(x, "TouchBarSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSpacer(value: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer]): Self = StObject.set(x, "TouchBarSpacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTray(
        value: Instantiable2[
              /* image */ typings.electron.Electron.NativeImage_ | String, 
              /* guid */ js.UndefOr[String], 
              Tray
            ]
      ): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebContents(value: Instantiable0[WebContents_] with TypeofWebContents): Self = StObject.set(x, "WebContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebFrame(value: WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebRequest(value: Instantiable0[WebRequest]): Self = StObject.set(x, "WebRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebviewTag(value: WebviewTag): Self = StObject.set(x, "webviewTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMain extends StObject {
    
    var BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView] = js.native
    
    var BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow] = js.native
    
    var ClientRequest: Instantiable0[typings.electron.Electron.Main.ClientRequest] = js.native
    
    var CommandLine: Instantiable0[typings.electron.Electron.Main.CommandLine] = js.native
    
    var Cookies: Instantiable0[typings.electron.Electron.Main.Cookies] = js.native
    
    var Debugger: Instantiable0[typings.electron.Electron.Main.Debugger] = js.native
    
    var Dock: Instantiable0[typings.electron.Electron.Main.Dock] = js.native
    
    var DownloadItem: Instantiable0[typings.electron.Electron.Main.DownloadItem] = js.native
    
    var IncomingMessage: Instantiable0[typings.electron.Electron.Main.IncomingMessage] = js.native
    
    var Menu: Instantiable0[typings.electron.Electron.Main.Menu] = js.native
    
    var MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem] = js.native
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain] = js.native
    
    var MessagePortMain: Instantiable0[typings.electron.Electron.Main.MessagePortMain] = js.native
    
    var Notification: Instantiable0[typings.electron.Electron.Main.Notification] = js.native
    
    var ServiceWorkers: Instantiable0[typings.electron.Electron.Main.ServiceWorkers] = js.native
    
    var Session: Instantiable0[typings.electron.Electron.Main.Session_] = js.native
    
    var TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar] = js.native
    
    var TouchBarButton: Instantiable0[typings.electron.Electron.Main.TouchBarButton] = js.native
    
    var TouchBarColorPicker: Instantiable0[typings.electron.Electron.Main.TouchBarColorPicker] = js.native
    
    var TouchBarGroup: Instantiable0[typings.electron.Electron.Main.TouchBarGroup] = js.native
    
    var TouchBarLabel: Instantiable0[typings.electron.Electron.Main.TouchBarLabel] = js.native
    
    var TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.Main.TouchBarOtherItemsProxy] = js.native
    
    var TouchBarPopover: Instantiable0[typings.electron.Electron.Main.TouchBarPopover] = js.native
    
    var TouchBarScrubber: Instantiable0[typings.electron.Electron.Main.TouchBarScrubber] = js.native
    
    var TouchBarSegmentedControl: Instantiable0[typings.electron.Electron.Main.TouchBarSegmentedControl] = js.native
    
    var TouchBarSlider: Instantiable0[typings.electron.Electron.Main.TouchBarSlider] = js.native
    
    var TouchBarSpacer: Instantiable0[typings.electron.Electron.Main.TouchBarSpacer] = js.native
    
    var Tray: Instantiable0[typings.electron.Electron.Main.Tray] = js.native
    
    var WebContents: Instantiable0[typings.electron.Electron.Main.WebContents_] = js.native
    
    var WebRequest: Instantiable0[typings.electron.Electron.Main.WebRequest] = js.native
    
    val app: App = js.native
    
    val autoUpdater: AutoUpdater = js.native
    
    val contentTracing: ContentTracing = js.native
    
    val dialog: Dialog = js.native
    
    val globalShortcut: GlobalShortcut = js.native
    
    val inAppPurchase: InAppPurchase = js.native
    
    val ipcMain: IpcMain = js.native
    
    val nativeTheme: NativeTheme = js.native
    
    val net: Net = js.native
    
    val netLog: NetLog = js.native
    
    val powerMonitor: PowerMonitor = js.native
    
    val powerSaveBlocker: PowerSaveBlocker = js.native
    
    val protocol: Protocol = js.native
    
    val screen: Screen = js.native
    
    val systemPreferences: SystemPreferences = js.native
  }
  object TypeofMain {
    
    @scala.inline
    def apply(
      BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView],
      BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow],
      ClientRequest: Instantiable0[typings.electron.Electron.Main.ClientRequest],
      CommandLine: Instantiable0[typings.electron.Electron.Main.CommandLine],
      Cookies: Instantiable0[typings.electron.Electron.Main.Cookies],
      Debugger: Instantiable0[typings.electron.Electron.Main.Debugger],
      Dock: Instantiable0[typings.electron.Electron.Main.Dock],
      DownloadItem: Instantiable0[typings.electron.Electron.Main.DownloadItem],
      IncomingMessage: Instantiable0[typings.electron.Electron.Main.IncomingMessage],
      Menu: Instantiable0[typings.electron.Electron.Main.Menu],
      MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem],
      MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain],
      MessagePortMain: Instantiable0[typings.electron.Electron.Main.MessagePortMain],
      Notification: Instantiable0[typings.electron.Electron.Main.Notification],
      ServiceWorkers: Instantiable0[typings.electron.Electron.Main.ServiceWorkers],
      Session: Instantiable0[typings.electron.Electron.Main.Session_],
      TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar],
      TouchBarButton: Instantiable0[typings.electron.Electron.Main.TouchBarButton],
      TouchBarColorPicker: Instantiable0[typings.electron.Electron.Main.TouchBarColorPicker],
      TouchBarGroup: Instantiable0[typings.electron.Electron.Main.TouchBarGroup],
      TouchBarLabel: Instantiable0[typings.electron.Electron.Main.TouchBarLabel],
      TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.Main.TouchBarOtherItemsProxy],
      TouchBarPopover: Instantiable0[typings.electron.Electron.Main.TouchBarPopover],
      TouchBarScrubber: Instantiable0[typings.electron.Electron.Main.TouchBarScrubber],
      TouchBarSegmentedControl: Instantiable0[typings.electron.Electron.Main.TouchBarSegmentedControl],
      TouchBarSlider: Instantiable0[typings.electron.Electron.Main.TouchBarSlider],
      TouchBarSpacer: Instantiable0[typings.electron.Electron.Main.TouchBarSpacer],
      Tray: Instantiable0[typings.electron.Electron.Main.Tray],
      WebContents: Instantiable0[typings.electron.Electron.Main.WebContents_],
      WebRequest: Instantiable0[typings.electron.Electron.Main.WebRequest],
      app: App,
      autoUpdater: AutoUpdater,
      contentTracing: ContentTracing,
      dialog: Dialog,
      globalShortcut: GlobalShortcut,
      inAppPurchase: InAppPurchase,
      ipcMain: IpcMain,
      nativeTheme: NativeTheme,
      net: Net,
      netLog: NetLog,
      powerMonitor: PowerMonitor,
      powerSaveBlocker: PowerSaveBlocker,
      protocol: Protocol,
      screen: Screen,
      systemPreferences: SystemPreferences
    ): TypeofMain = {
      val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarOtherItemsProxy = TouchBarOtherItemsProxy.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMain]
    }
    
    @scala.inline
    implicit class TypeofMainMutableBuilder[Self <: TypeofMain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserView(value: Instantiable0[typings.electron.Electron.Main.BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindow(value: Instantiable0[typings.electron.Electron.Main.BrowserWindow]): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequest(value: Instantiable0[typings.electron.Electron.Main.ClientRequest]): Self = StObject.set(x, "ClientRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandLine(value: Instantiable0[typings.electron.Electron.Main.CommandLine]): Self = StObject.set(x, "CommandLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookies(value: Instantiable0[typings.electron.Electron.Main.Cookies]): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugger(value: Instantiable0[typings.electron.Electron.Main.Debugger]): Self = StObject.set(x, "Debugger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDock(value: Instantiable0[typings.electron.Electron.Main.Dock]): Self = StObject.set(x, "Dock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadItem(value: Instantiable0[typings.electron.Electron.Main.DownloadItem]): Self = StObject.set(x, "DownloadItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingMessage(value: Instantiable0[typings.electron.Electron.Main.IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenu(value: Instantiable0[typings.electron.Electron.Main.Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItem(value: Instantiable0[typings.electron.Electron.Main.MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageChannelMain(value: Instantiable0[typings.electron.Electron.Main.MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePortMain(value: Instantiable0[typings.electron.Electron.Main.MessagePortMain]): Self = StObject.set(x, "MessagePortMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: Instantiable0[typings.electron.Electron.Main.Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceWorkers(value: Instantiable0[typings.electron.Electron.Main.ServiceWorkers]): Self = StObject.set(x, "ServiceWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Instantiable0[typings.electron.Electron.Main.Session_]): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBar(value: Instantiable0[typings.electron.Electron.Main.TouchBar]): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarButton(value: Instantiable0[typings.electron.Electron.Main.TouchBarButton]): Self = StObject.set(x, "TouchBarButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarColorPicker(value: Instantiable0[typings.electron.Electron.Main.TouchBarColorPicker]): Self = StObject.set(x, "TouchBarColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarGroup(value: Instantiable0[typings.electron.Electron.Main.TouchBarGroup]): Self = StObject.set(x, "TouchBarGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarLabel(value: Instantiable0[typings.electron.Electron.Main.TouchBarLabel]): Self = StObject.set(x, "TouchBarLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarOtherItemsProxy(value: Instantiable0[typings.electron.Electron.Main.TouchBarOtherItemsProxy]): Self = StObject.set(x, "TouchBarOtherItemsProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarPopover(value: Instantiable0[typings.electron.Electron.Main.TouchBarPopover]): Self = StObject.set(x, "TouchBarPopover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarScrubber(value: Instantiable0[typings.electron.Electron.Main.TouchBarScrubber]): Self = StObject.set(x, "TouchBarScrubber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSegmentedControl(value: Instantiable0[typings.electron.Electron.Main.TouchBarSegmentedControl]): Self = StObject.set(x, "TouchBarSegmentedControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSlider(value: Instantiable0[typings.electron.Electron.Main.TouchBarSlider]): Self = StObject.set(x, "TouchBarSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchBarSpacer(value: Instantiable0[typings.electron.Electron.Main.TouchBarSpacer]): Self = StObject.set(x, "TouchBarSpacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTray(value: Instantiable0[typings.electron.Electron.Main.Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebContents(value: Instantiable0[typings.electron.Electron.Main.WebContents_]): Self = StObject.set(x, "WebContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebRequest(value: Instantiable0[typings.electron.Electron.Main.WebRequest]): Self = StObject.set(x, "WebRequest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMenu extends StObject {
    
    /**
      * Generally, the `template` is an array of `options` for constructing a MenuItem.
      * The usage can be referenced above.
      *
      * You can also attach other fields to the element of the `template` and they will
      * become properties of the constructed menu items.
      */
    /* static member */
    def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | MenuItem]): Menu = js.native
    
    /**
      * The application menu, if set, or `null`, if not set.
      *
      * **Note:** The returned `Menu` instance doesn't support dynamic addition or
      * removal of menu items. Instance properties can still be dynamically modified.
      */
    /* static member */
    def getApplicationMenu(): Menu | Null = js.native
    
    /**
      * Sends the `action` to the first responder of application. This is used for
      * emulating default macOS menu behaviors. Usually you would use the `role`
      * property of a `MenuItem`.
      *
      * See the macOS Cocoa Event Handling Guide for more information on macOS' native
      * actions.
      *
      * @platform darwin
      */
    /* static member */
    def sendActionToFirstResponder(action: String): Unit = js.native
    
    /**
      * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
      * will be set as each window's top menu.
      *
      * Also on Windows and Linux, you can use a `&` in the top-level item name to
      * indicate which letter should get a generated accelerator. For example, using
      * `&File` for the file menu would result in a generated `Alt-F` accelerator that
      * opens the associated menu. The indicated character in the button label gets an
      * underline. The `&` character is not displayed on the button label.
      *
      * Passing `null` will suppress the default menu. On Windows and Linux, this has
      * the additional effect of removing the menu bar from the window.
      *
      * **Note:** The default menu will be created automatically if the app does not set
      * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
      * `Help`.
      */
    /* static member */
    def setApplicationMenu(): Unit = js.native
    def setApplicationMenu(menu: Menu): Unit = js.native
  }
  
  @js.native
  trait TypeofNativeImage extends StObject {
    
    // Docs: https://electronjs.org/docs/api/native-image
    /**
      * Creates an empty `NativeImage` instance.
      */
    /* static member */
    def createEmpty(): typings.electron.Electron.NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
      * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
      */
    /* static member */
    def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): typings.electron.Electron.NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
      * JPEG first.
      */
    /* static member */
    def createFromBuffer(buffer: Buffer): typings.electron.Electron.NativeImage_ = js.native
    def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): typings.electron.Electron.NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from `dataURL`.
      */
    /* static member */
    def createFromDataURL(dataURL: String): typings.electron.Electron.NativeImage_ = js.native
    
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
    where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
      *
      * @platform darwin
      */
    /* static member */
    def createFromNamedImage(imageName: String): typings.electron.Electron.NativeImage_ = js.native
    def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typings.electron.Electron.NativeImage_ = js.native
    
    /**
      * Creates a new `NativeImage` instance from a file located at `path`. This method
      * returns an empty image if the `path` does not exist, cannot be read, or is not a
      * valid image.
      */
    /* static member */
    def createFromPath(path: String): typings.electron.Electron.NativeImage_ = js.native
    
    /**
      * fulfilled with the file's thumbnail preview image, which is a NativeImage.
      *
      * @platform darwin,win32
      */
    /* static member */
    def createThumbnailFromPath(path: String, maxSize: Size): js.Promise[typings.electron.Electron.NativeImage_] = js.native
  }
  
  @js.native
  trait TypeofNotification extends StObject {
    
    /**
      * Whether or not desktop notifications are supported on the current system
      */
    /* static member */
    def isSupported(): Boolean = js.native
  }
  object TypeofNotification {
    
    @scala.inline
    def apply(isSupported: () => Boolean): TypeofNotification = {
      val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction0(isSupported))
      __obj.asInstanceOf[TypeofNotification]
    }
    
    @scala.inline
    implicit class TypeofNotificationMutableBuilder[Self <: TypeofNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofRenderer extends StObject {
    
    var BrowserWindowProxy: Instantiable0[typings.electron.Electron.Renderer.BrowserWindowProxy] = js.native
    
    val contextBridge: ContextBridge = js.native
    
    val ipcRenderer: IpcRenderer = js.native
    
    val remote: Remote = js.native
    
    val webFrame: WebFrame = js.native
    
    val webviewTag: WebviewTag = js.native
  }
  object TypeofRenderer {
    
    @scala.inline
    def apply(
      BrowserWindowProxy: Instantiable0[typings.electron.Electron.Renderer.BrowserWindowProxy],
      contextBridge: ContextBridge,
      ipcRenderer: IpcRenderer,
      remote: Remote,
      webFrame: WebFrame,
      webviewTag: WebviewTag
    ): TypeofRenderer = {
      val __obj = js.Dynamic.literal(BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRenderer]
    }
    
    @scala.inline
    implicit class TypeofRendererMutableBuilder[Self <: TypeofRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserWindowProxy(value: Instantiable0[typings.electron.Electron.Renderer.BrowserWindowProxy]): Self = StObject.set(x, "BrowserWindowProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextBridge(value: ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcRenderer(value: IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: Remote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebFrame(value: WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebviewTag(value: WebviewTag): Self = StObject.set(x, "webviewTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofSession extends StObject {
    
    /**
      * A `Session` object, the default session object of the app.
      */
    /* static member */
    var defaultSession: Session_ = js.native
    
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
    def fromPartition(partition: String): Session_ = js.native
    def fromPartition(partition: String, options: FromPartitionOptions): Session_ = js.native
  }
  
  @js.native
  trait TypeofTouchBar extends StObject
  
  @js.native
  trait TypeofWebContents extends StObject {
    
    // Docs: https://electronjs.org/docs/api/web-contents
    /**
      * A WebContents instance with the given ID.
      */
    /* static member */
    def fromId(id: Double): WebContents_ = js.native
    
    /**
      * An array of all `WebContents` instances. This will contain web contents for all
      * windows, webviews, opened devtools, and devtools extension background pages.
      */
    /* static member */
    def getAllWebContents(): js.Array[WebContents_] = js.native
    
    /**
      * The web contents that is focused in this application, otherwise returns `null`.
      */
    /* static member */
    def getFocusedWebContents(): WebContents_ = js.native
  }
  object TypeofWebContents {
    
    @scala.inline
    def apply(
      fromId: Double => WebContents_,
      getAllWebContents: () => js.Array[WebContents_],
      getFocusedWebContents: () => WebContents_
    ): TypeofWebContents = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getAllWebContents = js.Any.fromFunction0(getAllWebContents), getFocusedWebContents = js.Any.fromFunction0(getFocusedWebContents))
      __obj.asInstanceOf[TypeofWebContents]
    }
    
    @scala.inline
    implicit class TypeofWebContentsMutableBuilder[Self <: TypeofWebContents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromId(value: Double => WebContents_): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAllWebContents(value: () => js.Array[WebContents_]): Self = StObject.set(x, "getAllWebContents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedWebContents(value: () => WebContents_): Self = StObject.set(x, "getFocusedWebContents", js.Any.fromFunction0(value))
    }
  }
}
