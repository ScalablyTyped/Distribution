package typings.electronUtil

import typings.electron.Electron.Accelerator
import typings.electron.Electron.KeyboardEvent
import typings.electron.Electron.Menu
import typings.electron.Electron.MenuItem
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.Rectangle
import typings.electron.Electron.Remote
import typings.electron.Electron.Size
import typings.electron.mod.BrowserWindow
import typings.electron.mod.Session_
import typings.electronUtil.electronUtilStrings.Advanced
import typings.electronUtil.electronUtilStrings.Captioning
import typings.electronUtil.electronUtilStrings.Dictation
import typings.electronUtil.electronUtilStrings.FDE
import typings.electronUtil.electronUtilStrings.Firewall
import typings.electronUtil.electronUtilStrings.General
import typings.electronUtil.electronUtilStrings.Hearing
import typings.electronUtil.electronUtilStrings.Internet
import typings.electronUtil.electronUtilStrings.Keyboard
import typings.electronUtil.electronUtilStrings.Media_Descriptions
import typings.electronUtil.electronUtilStrings.Mouse
import typings.electronUtil.electronUtilStrings.Privacy
import typings.electronUtil.electronUtilStrings.Privacy_Accessibility
import typings.electronUtil.electronUtilStrings.Privacy_Advertising
import typings.electronUtil.electronUtilStrings.Privacy_AllFiles
import typings.electronUtil.electronUtilStrings.Privacy_Assistive
import typings.electronUtil.electronUtilStrings.Privacy_Automation
import typings.electronUtil.electronUtilStrings.Privacy_Calendars
import typings.electronUtil.electronUtilStrings.Privacy_Camera
import typings.electronUtil.electronUtilStrings.Privacy_Contacts
import typings.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typings.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typings.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typings.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typings.electronUtil.electronUtilStrings.Privacy_LocationServices
import typings.electronUtil.electronUtilStrings.Privacy_Microphone
import typings.electronUtil.electronUtilStrings.Privacy_Photos
import typings.electronUtil.electronUtilStrings.Privacy_Reminders
import typings.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typings.electronUtil.electronUtilStrings.Seeing_Display
import typings.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typings.electronUtil.electronUtilStrings.Seeing_Zoom
import typings.electronUtil.electronUtilStrings.Services_ARDService
import typings.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typings.electronUtil.electronUtilStrings.Services_PersonalFileSharing
import typings.electronUtil.electronUtilStrings.Services_PrinterSharing
import typings.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typings.electronUtil.electronUtilStrings.Services_RemoteLogin
import typings.electronUtil.electronUtilStrings.Services_ScreenSharing
import typings.electronUtil.electronUtilStrings.SpeakableItems
import typings.electronUtil.electronUtilStrings.Switch
import typings.electronUtil.electronUtilStrings.TTS
import typings.electronUtil.electronUtilStrings.about
import typings.electronUtil.electronUtilStrings.appMenu
import typings.electronUtil.electronUtilStrings.checkbox
import typings.electronUtil.electronUtilStrings.clearRecentDocuments
import typings.electronUtil.electronUtilStrings.close
import typings.electronUtil.electronUtilStrings.copy
import typings.electronUtil.electronUtilStrings.cut
import typings.electronUtil.electronUtilStrings.delete
import typings.electronUtil.electronUtilStrings.editMenu
import typings.electronUtil.electronUtilStrings.fileMenu
import typings.electronUtil.electronUtilStrings.forceReload
import typings.electronUtil.electronUtilStrings.front
import typings.electronUtil.electronUtilStrings.help
import typings.electronUtil.electronUtilStrings.hide
import typings.electronUtil.electronUtilStrings.hideOthers
import typings.electronUtil.electronUtilStrings.linux
import typings.electronUtil.electronUtilStrings.macos
import typings.electronUtil.electronUtilStrings.mergeAllWindows
import typings.electronUtil.electronUtilStrings.minimize
import typings.electronUtil.electronUtilStrings.moveTabToNewWindow
import typings.electronUtil.electronUtilStrings.normal
import typings.electronUtil.electronUtilStrings.paste
import typings.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typings.electronUtil.electronUtilStrings.quit
import typings.electronUtil.electronUtilStrings.radio
import typings.electronUtil.electronUtilStrings.recentDocuments
import typings.electronUtil.electronUtilStrings.redo
import typings.electronUtil.electronUtilStrings.reload
import typings.electronUtil.electronUtilStrings.resetZoom
import typings.electronUtil.electronUtilStrings.security
import typings.electronUtil.electronUtilStrings.selectAll
import typings.electronUtil.electronUtilStrings.selectNextTab
import typings.electronUtil.electronUtilStrings.selectPreviousTab
import typings.electronUtil.electronUtilStrings.separator
import typings.electronUtil.electronUtilStrings.services
import typings.electronUtil.electronUtilStrings.sharing
import typings.electronUtil.electronUtilStrings.speech
import typings.electronUtil.electronUtilStrings.startSpeaking
import typings.electronUtil.electronUtilStrings.stopSpeaking
import typings.electronUtil.electronUtilStrings.submenu
import typings.electronUtil.electronUtilStrings.toggleDevTools
import typings.electronUtil.electronUtilStrings.toggleTabBar
import typings.electronUtil.electronUtilStrings.togglefullscreen
import typings.electronUtil.electronUtilStrings.undo
import typings.electronUtil.electronUtilStrings.unhide
import typings.electronUtil.electronUtilStrings.universalaccess
import typings.electronUtil.electronUtilStrings.viewMenu
import typings.electronUtil.electronUtilStrings.window
import typings.electronUtil.electronUtilStrings.windowMenu
import typings.electronUtil.electronUtilStrings.windows
import typings.electronUtil.electronUtilStrings.zoom
import typings.electronUtil.electronUtilStrings.zoomIn
import typings.electronUtil.electronUtilStrings.zoomOut
import typings.newGithubIssueUrl.mod.Options
import typings.typeFest.requireAtLeastOneMod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def aboutMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  @scala.inline
  def aboutMenuItem(options: AboutMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  @scala.inline
  def activeWindow(): BrowserWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("activeWindow")().asInstanceOf[BrowserWindow]
  
  @JSImport("electron-util", "api")
  @js.native
  val api: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllElectron */ js.Any) | Remote = js.native
  
  @JSImport("electron-util", "appLaunchTimestamp")
  @js.native
  val appLaunchTimestamp: Double = js.native
  
  @scala.inline
  def appMenu(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")().asInstanceOf[MenuItemConstructorOptions]
  @scala.inline
  def appMenu(menuItems: js.Array[MenuItemConstructorOptions]): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")(menuItems.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  @scala.inline
  def centerWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")().asInstanceOf[Unit]
  @scala.inline
  def centerWindow(options: CenterWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "chromeVersion")
  @js.native
  val chromeVersion: String = js.native
  
  @JSImport("electron-util", "darkMode")
  @js.native
  val darkMode: DarkMode_ = js.native
  
  @scala.inline
  def debugInfo(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugInfo")().asInstanceOf[String]
  
  @scala.inline
  def disableZoom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")().asInstanceOf[Unit]
  @scala.inline
  def disableZoom(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "electronVersion")
  @js.native
  val electronVersion: String = js.native
  
  @scala.inline
  def enforceMacOSAppLocation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceMacOSAppLocation")().asInstanceOf[Unit]
  
  @scala.inline
  def fixPathForAsarUnpack(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixPathForAsarUnpack")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getWindowBoundsCentered(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")().asInstanceOf[Rectangle]
  @scala.inline
  def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  
  object is {
    
    /**
    	Running in development, not in production.
    	*/
    @JSImport("electron-util", "is.development")
    @js.native
    val development: Boolean = js.native
    
    /**
    	Running on Linux.
    	*/
    @JSImport("electron-util", "is.linux")
    @js.native
    val linux: Boolean = js.native
    
    /**
    	The app is an Mac App Store build.
    	*/
    @JSImport("electron-util", "is.macAppStore")
    @js.native
    val macAppStore: Boolean = js.native
    
    /**
    	Running on macOS.
    	*/
    @JSImport("electron-util", "is.macos")
    @js.native
    val macos: Boolean = js.native
    
    /**
    	Running on the [main process](https://electronjs.org/docs/tutorial/quick-start/#main-process).
    	*/
    @JSImport("electron-util", "is.main")
    @js.native
    val main: Boolean = js.native
    
    /**
    	Running on the [renderer process](https://electronjs.org/docs/tutorial/quick-start/#renderer-process).
    	*/
    @JSImport("electron-util", "is.renderer")
    @js.native
    val renderer: Boolean = js.native
    
    /**
    	The app is using [ASAR](https://electronjs.org/docs/tutorial/application-packaging/).
    	*/
    @JSImport("electron-util", "is.usingAsar")
    @js.native
    val usingAsar: Boolean = js.native
    
    /**
    	Running on Windows.
    	*/
    @JSImport("electron-util", "is.windows")
    @js.native
    val windows: Boolean = js.native
    
    /**
    	The app is a Windows Store AppX build.
    	*/
    @JSImport("electron-util", "is.windowsStore")
    @js.native
    val windowsStore: Boolean = js.native
  }
  
  @scala.inline
  def isFirstAppLaunch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstAppLaunch")().asInstanceOf[Boolean]
  
  @scala.inline
  def menuBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("menuBarHeight")().asInstanceOf[Double]
  
  @scala.inline
  def openNewGitHubIssue(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openNewGitHubIssue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def openSystemPreferences(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openSystemPreferences(
    pane: Unit,
    section: Advanced | Captioning | Dictation | FDE | Firewall | General | Hearing | Internet | Keyboard | Media_Descriptions | Mouse | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing | SpeakableItems | Switch | TTS
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openSystemPreferences(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openSystemPreferences(
    pane: sharing,
    section: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openSystemPreferences(pane: speech, section: Dictation | TTS): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def openSystemPreferences(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openSystemPreferences_security(pane: security): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openSystemPreferences_sharing(pane: sharing): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openSystemPreferences_speech(pane: speech): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openSystemPreferences_universalaccess(pane: universalaccess): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openUrlMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  @scala.inline
  def openUrlMenuItem(options: OpenUrlMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  @scala.inline
  def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")(choices.asInstanceOf[js.Any]).asInstanceOf[Macos | Windows | Linux | Default]
  
  @scala.inline
  def runJS(code: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def runJS(code: String, window: BrowserWindow): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def setContentSecurityPolicy(policy: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setContentSecurityPolicy(policy: String, options: SetContentSecurityPolicyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def showAboutWindow(options: ShowAboutWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAboutWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AboutMenuItemOptions = ShowAboutWindowOptions
  
  trait CenterWindowOptions extends StObject {
    
    /**
    	Animate the change.
    	@default false
    	*/
    val animated: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.undefined
    
    /**
    	The window to center.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object CenterWindowOptions {
    
    @scala.inline
    def apply(): CenterWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterWindowOptions]
    }
    
    @scala.inline
    implicit class CenterWindowOptionsMutableBuilder[Self <: CenterWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[_Choices[Macos, Windows, Linux, Default], macos | windows | linux]
  
  trait DarkMode_ extends StObject {
    
    /**
    	Whether the macOS dark mode is enabled.
    	On Windows and Linux, it's `false`.
    	*/
    val isEnabled: Boolean
    
    /**
    	The `callback` function is called when the macOS dark mode is toggled.
    	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
    	*/
    def onChange(callback: js.Function0[Unit]): js.Function0[Unit]
  }
  object DarkMode_ {
    
    @scala.inline
    def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DarkMode_]
    }
    
    @scala.inline
    implicit class DarkMode_MutableBuilder[Self <: DarkMode_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
  
  trait GetWindowBoundsCenteredOptions extends StObject {
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.undefined
    
    /**
    	The window to get the bounds of.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object GetWindowBoundsCenteredOptions {
    
    @scala.inline
    def apply(): GetWindowBoundsCenteredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
    }
    
    @scala.inline
    implicit class GetWindowBoundsCenteredOptionsMutableBuilder[Self <: GetWindowBoundsCenteredOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  /* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
  trait OpenUrlMenuItemOptions extends StObject {
    
    val accelerator: js.UndefOr[Accelerator] = js.undefined
    
    val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    val after: js.UndefOr[js.Array[String]] = js.undefined
    
    val afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    val before: js.UndefOr[js.Array[String]] = js.undefined
    
    val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    val checked: js.UndefOr[Boolean] = js.undefined
    
    val click: js.UndefOr[
        js.Function3[
          /* menuItem */ MenuItem, 
          /* browserWindow */ js.UndefOr[typings.electron.Electron.BrowserWindow], 
          /* event */ KeyboardEvent, 
          Unit
        ]
      ] = js.undefined
    
    val enabled: js.UndefOr[Boolean] = js.undefined
    
    val icon: js.UndefOr[NativeImage_ | String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val label: js.UndefOr[String] = js.undefined
    
    val registerAccelerator: js.UndefOr[Boolean] = js.undefined
    
    val role: js.UndefOr[
        undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ] = js.undefined
    
    val sublabel: js.UndefOr[String] = js.undefined
    
    val submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.undefined
    
    val toolTip: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[
        normal | separator | typings.electronUtil.electronUtilStrings.submenu | checkbox | radio
      ] = js.undefined
    
    /**
    	URL to be opened when the menu item is clicked.
    	*/
    val url: String
    
    val visible: js.UndefOr[Boolean] = js.undefined
  }
  object OpenUrlMenuItemOptions {
    
    @scala.inline
    def apply(url: String): OpenUrlMenuItemOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlMenuItemOptions]
    }
    
    @scala.inline
    implicit class OpenUrlMenuItemOptionsMutableBuilder[Self <: OpenUrlMenuItemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
      
      @scala.inline
      def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
      
      @scala.inline
      def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value :_*))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
      
      @scala.inline
      def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value :_*))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClick(
        value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[typings.electron.Electron.BrowserWindow], /* event */ KeyboardEvent) => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
      
      @scala.inline
      def setRole(
        value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
      
      @scala.inline
      def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      @scala.inline
      def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value :_*))
      
      @scala.inline
      def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
      
      @scala.inline
      def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait OptionalRectangle extends StObject {
    
    /**
    	The height of the rectangle (must be an integer).
    	*/
    val height: js.UndefOr[Double] = js.undefined
    
    /**
    	The width of the rectangle (must be an integer).
    	*/
    val width: js.UndefOr[Double] = js.undefined
    
    /**
    	The x coordinate of the origin of the rectangle (must be an integer).
    	*/
    val x: js.UndefOr[Double] = js.undefined
    
    /**
    	The y coordinate of the origin of the rectangle (must be an integer).
    	*/
    val y: js.UndefOr[Double] = js.undefined
  }
  object OptionalRectangle {
    
    @scala.inline
    def apply(): OptionalRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalRectangle]
    }
    
    @scala.inline
    implicit class OptionalRectangleMutableBuilder[Self <: OptionalRectangle] (val x: Self) extends AnyVal {
      
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
  
  trait SetContentSecurityPolicyOptions extends StObject {
    
    /**
    	The session to apply the policy to.
    	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
    	*/
    val session: js.UndefOr[Session_] = js.undefined
  }
  object SetContentSecurityPolicyOptions {
    
    @scala.inline
    def apply(): SetContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetContentSecurityPolicyOptions]
    }
    
    @scala.inline
    implicit class SetContentSecurityPolicyOptionsMutableBuilder[Self <: SetContentSecurityPolicyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait ShowAboutWindowOptions extends StObject {
    
    /**
    	The copyright text.
    	*/
    val copyright: js.UndefOr[String] = js.undefined
    
    /**
    	An absolute path to the app icon.
    	Only used on Linux and Windows.
    	*/
    val icon: js.UndefOr[String] = js.undefined
    
    /**
    	Some additional text if needed.
    	Only used on Windows.
    	*/
    val text: js.UndefOr[String] = js.undefined
    
    /**
    	Customizable for localization. Used in the menu item label and window title (Windows-only).
    	The app name is automatically appended at runtime.
    	Only used on Linux and Windows.
    	@default 'About'
    	*/
    val title: js.UndefOr[String] = js.undefined
    
    /**
    	The URL to the app's website.
    	Only used on Linux.
    	*/
    val website: js.UndefOr[String] = js.undefined
  }
  object ShowAboutWindowOptions {
    
    @scala.inline
    def apply(): ShowAboutWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowAboutWindowOptions]
    }
    
    @scala.inline
    implicit class ShowAboutWindowOptionsMutableBuilder[Self <: ShowAboutWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait SystemPreferencesPanes extends StObject {
    
    var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
    
    var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
    
    var speech: Dictation | TTS
    
    var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  }
  object SystemPreferencesPanes {
    
    @scala.inline
    def apply(
      security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
      sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
      speech: Dictation | TTS,
      universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): SystemPreferencesPanes = {
      val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemPreferencesPanes]
    }
    
    @scala.inline
    implicit class SystemPreferencesPanesMutableBuilder[Self <: SystemPreferencesPanes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurity(
        value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharing(
        value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
      ): Self = StObject.set(x, "sharing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeech(value: Dictation | TTS): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversalaccess(
        value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
      ): Self = StObject.set(x, "universalaccess", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Choices[Macos, Windows, Linux, Default] extends StObject {
    
    val default: js.UndefOr[Default | js.Function0[Default]] = js.undefined
    
    val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.undefined
    
    val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.undefined
    
    val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.undefined
  }
  object _Choices {
    
    @scala.inline
    def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
    }
    
    @scala.inline
    implicit class _ChoicesMutableBuilder[Self <: _Choices[?, ?, ?, ?], Macos, Windows, Linux, Default] (val x: Self & (_Choices[Macos, Windows, Linux, Default])) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Default | js.Function0[Default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFunction0(value: () => Default): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setLinux(value: Linux | js.Function0[Linux]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinuxFunction0(value: () => Linux): Self = StObject.set(x, "linux", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      @scala.inline
      def setMacos(value: Macos | js.Function0[Macos]): Self = StObject.set(x, "macos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacosFunction0(value: () => Macos): Self = StObject.set(x, "macos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMacosUndefined: Self = StObject.set(x, "macos", js.undefined)
      
      @scala.inline
      def setWindows(value: Windows | js.Function0[Windows]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsFunction0(value: () => Windows): Self = StObject.set(x, "windows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
