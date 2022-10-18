package typings.electronUtil

import typings.electron.Electron.Accelerator
import typings.electron.Electron.CrossProcessExports.MenuItemConstructorOptions
import typings.electron.Electron.CrossProcessExports.Rectangle
import typings.electron.Electron.CrossProcessExports.Session_
import typings.electron.Electron.CrossProcessExports.Size
import typings.electron.Electron.KeyboardEvent
import typings.electron.Electron.Menu
import typings.electron.Electron.MenuItem
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.SharingItem
import typings.electron.mod.BrowserWindow
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
import typings.electronUtil.electronUtilStrings.privacy_
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
import typings.electronUtil.electronUtilStrings.shareMenu
import typings.electronUtil.electronUtilStrings.sharing
import typings.electronUtil.electronUtilStrings.showSubstitutions
import typings.electronUtil.electronUtilStrings.speech
import typings.electronUtil.electronUtilStrings.startSpeaking
import typings.electronUtil.electronUtilStrings.stopSpeaking
import typings.electronUtil.electronUtilStrings.submenu
import typings.electronUtil.electronUtilStrings.toggleDevTools
import typings.electronUtil.electronUtilStrings.toggleSmartDashes
import typings.electronUtil.electronUtilStrings.toggleSmartQuotes
import typings.electronUtil.electronUtilStrings.toggleSpellChecker
import typings.electronUtil.electronUtilStrings.toggleTabBar
import typings.electronUtil.electronUtilStrings.toggleTextReplacement
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
import typings.typeFest.sourceRequireAtLeastOneMod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aboutMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  inline def aboutMenuItem(options: AboutMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def activeWindow(): BrowserWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("activeWindow")().asInstanceOf[BrowserWindow]
  
  @JSImport("electron-util", "api")
  @js.native
  val api: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllElectron */ Any = js.native
  
  @JSImport("electron-util", "appLaunchTimestamp")
  @js.native
  val appLaunchTimestamp: Double = js.native
  
  inline def appMenu(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")().asInstanceOf[MenuItemConstructorOptions]
  inline def appMenu(menuItems: js.Array[MenuItemConstructorOptions]): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")(menuItems.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def centerWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")().asInstanceOf[Unit]
  inline def centerWindow(options: CenterWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "chromeVersion")
  @js.native
  val chromeVersion: String = js.native
  
  @JSImport("electron-util", "darkMode")
  @js.native
  val darkMode: DarkMode_ = js.native
  
  inline def debugInfo(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugInfo")().asInstanceOf[String]
  
  inline def disableZoom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")().asInstanceOf[Unit]
  inline def disableZoom(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "electronVersion")
  @js.native
  val electronVersion: String = js.native
  
  inline def enforceMacOSAppLocation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceMacOSAppLocation")().asInstanceOf[Unit]
  
  inline def fixPathForAsarUnpack(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixPathForAsarUnpack")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWindowBoundsCentered(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")().asInstanceOf[Rectangle]
  inline def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  
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
  
  inline def isFirstAppLaunch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstAppLaunch")().asInstanceOf[Boolean]
  
  inline def menuBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("menuBarHeight")().asInstanceOf[Double]
  
  inline def openNewGitHubIssue(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openNewGitHubIssue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openSystemPreferences(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")().asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: Unit,
    section: Advanced | Captioning | Dictation | FDE | Firewall | General | Hearing | Internet | Keyboard | Media_Descriptions | Mouse | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing | SpeakableItems | Switch | TTS
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: sharing,
    section: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(pane: speech, section: Dictation | TTS): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(pane: SystemPreferencesWindowsPane): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_security(pane: security): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_sharing(pane: sharing): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_speech(pane: speech): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_universalaccess(pane: universalaccess): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openUrlMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  inline def openUrlMenuItem(options: OpenUrlMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")(choices.asInstanceOf[js.Any]).asInstanceOf[Macos | Windows | Linux | Default]
  
  inline def runJS(code: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def runJS(code: String, window: BrowserWindow): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setContentSecurityPolicy(policy: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setContentSecurityPolicy(policy: String, options: SetContentSecurityPolicyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showAboutWindow(options: ShowAboutWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAboutWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    	Use the full display size when calculating the position.
    	By default, only the workable screen area is used, which excludes the Windows taskbar and macOS dock.
    	@default false
    	*/
    val useFullBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The window to center.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object CenterWindowOptions {
    
    inline def apply(): CenterWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterWindowOptions]
    }
    
    extension [Self <: CenterWindowOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseFullBounds(value: Boolean): Self = StObject.set(x, "useFullBounds", value.asInstanceOf[js.Any])
      
      inline def setUseFullBoundsUndefined: Self = StObject.set(x, "useFullBounds", js.undefined)
      
      inline def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
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
    
    inline def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DarkMode_]
    }
    
    extension [Self <: DarkMode_](x: Self) {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
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
    	Use the full display size when calculating the position.
    	By default, only the workable screen area is used, which excludes the Windows taskbar and macOS dock.
    	@default false
    	*/
    val useFullBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The window to get the bounds of.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object GetWindowBoundsCenteredOptions {
    
    inline def apply(): GetWindowBoundsCenteredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
    }
    
    extension [Self <: GetWindowBoundsCenteredOptions](x: Self) {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseFullBounds(value: Boolean): Self = StObject.set(x, "useFullBounds", value.asInstanceOf[js.Any])
      
      inline def setUseFullBoundsUndefined: Self = StObject.set(x, "useFullBounds", js.undefined)
      
      inline def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
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
        undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ] = js.undefined
    
    val sharingItem: js.UndefOr[SharingItem] = js.undefined
    
    val sublabel: js.UndefOr[String] = js.undefined
    
    val submenu: js.UndefOr[js.Array[typings.electron.Electron.MenuItemConstructorOptions] | Menu] = js.undefined
    
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
    
    inline def apply(url: String): OpenUrlMenuItemOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlMenuItemOptions]
    }
    
    extension [Self <: OpenUrlMenuItemOptions](x: Self) {
      
      inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      inline def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
      
      inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
      
      inline def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
      
      inline def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClick(
        value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[typings.electron.Electron.BrowserWindow], /* event */ KeyboardEvent) => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction3(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
      
      inline def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
      
      inline def setRole(
        value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSharingItem(value: SharingItem): Self = StObject.set(x, "sharingItem", value.asInstanceOf[js.Any])
      
      inline def setSharingItemUndefined: Self = StObject.set(x, "sharingItem", js.undefined)
      
      inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
      
      inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
      
      inline def setSubmenu(value: js.Array[typings.electron.Electron.MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setSubmenuVarargs(value: typings.electron.Electron.MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value*))
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
      
      inline def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
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
    
    inline def apply(): OptionalRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalRectangle]
    }
    
    extension [Self <: OptionalRectangle](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
    
    inline def apply(): SetContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetContentSecurityPolicyOptions]
    }
    
    extension [Self <: SetContentSecurityPolicyOptions](x: Self) {
      
      inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
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
    	Some additional text if needed. Shown below copyright info.
    	*/
    val text: js.UndefOr[String] = js.undefined
    
    /**
    	Customizable for localization. Used in the menu item label.
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
    
    inline def apply(): ShowAboutWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowAboutWindowOptions]
    }
    
    extension [Self <: ShowAboutWindowOptions](x: Self) {
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait SystemPreferencesMacOsPanes extends StObject {
    
    var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
    
    var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
    
    var speech: Dictation | TTS
    
    var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  }
  object SystemPreferencesMacOsPanes {
    
    inline def apply(
      security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
      sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
      speech: Dictation | TTS,
      universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): SystemPreferencesMacOsPanes = {
      val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemPreferencesMacOsPanes]
    }
    
    extension [Self <: SystemPreferencesMacOsPanes](x: Self) {
      
      inline def setSecurity(
        value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSharing(
        value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
      ): Self = StObject.set(x, "sharing", value.asInstanceOf[js.Any])
      
      inline def setSpeech(value: Dictation | TTS): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      inline def setUniversalaccess(
        value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
      ): Self = StObject.set(x, "universalaccess", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronUtil.electronUtilStrings.display
    - typings.electronUtil.electronUtilStrings.sound
    - typings.electronUtil.electronUtilStrings.notifications
    - typings.electronUtil.electronUtilStrings.quiethours
    - typings.electronUtil.electronUtilStrings.powersleep
    - typings.electronUtil.electronUtilStrings.batterysaver
    - typings.electronUtil.electronUtilStrings.storagesense
    - typings.electronUtil.electronUtilStrings.tabletmode
    - typings.electronUtil.electronUtilStrings.multitasking
    - typings.electronUtil.electronUtilStrings.project
    - typings.electronUtil.electronUtilStrings.crossdevice
    - typings.electronUtil.electronUtilStrings.clipboard
    - typings.electronUtil.electronUtilStrings.remotedesktop
    - typings.electronUtil.electronUtilStrings.about
    - typings.electronUtil.electronUtilStrings.bluetooth
    - typings.electronUtil.electronUtilStrings.connecteddevices
    - typings.electronUtil.electronUtilStrings.printers
    - typings.electronUtil.electronUtilStrings.mousetouchpad
    - typings.electronUtil.electronUtilStrings.`devices-touchpad`
    - typings.electronUtil.electronUtilStrings.typing
    - typings.electronUtil.electronUtilStrings.wheel
    - typings.electronUtil.electronUtilStrings.pen
    - typings.electronUtil.electronUtilStrings.autoplay
    - typings.electronUtil.electronUtilStrings.usb
    - typings.electronUtil.electronUtilStrings.`mobile-devices`
    - typings.electronUtil.electronUtilStrings.network
    - typings.electronUtil.electronUtilStrings.`network-status`
    - typings.electronUtil.electronUtilStrings.`network-cellular`
    - typings.electronUtil.electronUtilStrings.`network-wifi`
    - typings.electronUtil.electronUtilStrings.`network-wificalling`
    - typings.electronUtil.electronUtilStrings.`network-ethernet`
    - typings.electronUtil.electronUtilStrings.`network-dialup`
    - typings.electronUtil.electronUtilStrings.`network-vpn`
    - typings.electronUtil.electronUtilStrings.`network-airplanemode`
    - typings.electronUtil.electronUtilStrings.`network-mobilehotspot`
    - typings.electronUtil.electronUtilStrings.nfctransactions
    - typings.electronUtil.electronUtilStrings.datausage
    - typings.electronUtil.electronUtilStrings.`network-proxy`
    - typings.electronUtil.electronUtilStrings.personalization
    - typings.electronUtil.electronUtilStrings.`personalization-background`
    - typings.electronUtil.electronUtilStrings.`personalization-colors`
    - typings.electronUtil.electronUtilStrings.lockscreen
    - typings.electronUtil.electronUtilStrings.themes
    - typings.electronUtil.electronUtilStrings.fonts
    - typings.electronUtil.electronUtilStrings.`personalization-start`
    - typings.electronUtil.electronUtilStrings.taskbar
    - typings.electronUtil.electronUtilStrings.appsfeatures
    - typings.electronUtil.electronUtilStrings.optionalfeatures
    - typings.electronUtil.electronUtilStrings.defaultapps
    - typings.electronUtil.electronUtilStrings.maps
    - typings.electronUtil.electronUtilStrings.appsforwebsites
    - typings.electronUtil.electronUtilStrings.videoplayback
    - typings.electronUtil.electronUtilStrings.startupapps
    - typings.electronUtil.electronUtilStrings.yourinfo
    - typings.electronUtil.electronUtilStrings.emailandaccounts
    - typings.electronUtil.electronUtilStrings.signinoptions
    - typings.electronUtil.electronUtilStrings.workplace
    - typings.electronUtil.electronUtilStrings.otherusers
    - typings.electronUtil.electronUtilStrings.sync
    - typings.electronUtil.electronUtilStrings.dateandtime
    - typings.electronUtil.electronUtilStrings.regionformatting
    - typings.electronUtil.electronUtilStrings.regionlanguage
    - typings.electronUtil.electronUtilStrings.speech
    - typings.electronUtil.electronUtilStrings.`gaming-gamebar`
    - typings.electronUtil.electronUtilStrings.`gaming-gamedvr`
    - typings.electronUtil.electronUtilStrings.`gaming-broadcasting`
    - typings.electronUtil.electronUtilStrings.`gaming-gamemode`
    - typings.electronUtil.electronUtilStrings.`gaming-xboxnetworking`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-display`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-cursor`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-magnifier`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-colorfilter`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-highcontrast`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-narrator`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-audio`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-keyboard`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-mouse`
    - typings.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol`
    - typings.electronUtil.electronUtilStrings.`search-permissions`
    - typings.electronUtil.electronUtilStrings.`cortana-windowssearch`
    - typings.electronUtil.electronUtilStrings.cortana
    - typings.electronUtil.electronUtilStrings.`cortana-talktocortana`
    - typings.electronUtil.electronUtilStrings.`cortana-permissions`
    - typings.electronUtil.electronUtilStrings.privacy_
    - typings.electronUtil.electronUtilStrings.`privacy-speech`
    - typings.electronUtil.electronUtilStrings.`privacy-speechtyping`
    - typings.electronUtil.electronUtilStrings.`privacy-feedback`
    - typings.electronUtil.electronUtilStrings.`privacy-activityhistory`
    - typings.electronUtil.electronUtilStrings.`privacy-location`
    - typings.electronUtil.electronUtilStrings.`privacy-webcam`
    - typings.electronUtil.electronUtilStrings.`privacy-microphone`
    - typings.electronUtil.electronUtilStrings.`privacy-voiceactivation`
    - typings.electronUtil.electronUtilStrings.`privacy-notifications`
    - typings.electronUtil.electronUtilStrings.`privacy-accountinfo`
    - typings.electronUtil.electronUtilStrings.`privacy-contacts`
    - typings.electronUtil.electronUtilStrings.`privacy-calendar`
    - typings.electronUtil.electronUtilStrings.`privacy-phonecalls`
    - typings.electronUtil.electronUtilStrings.`privacy-callhistory`
    - typings.electronUtil.electronUtilStrings.`privacy-email`
    - typings.electronUtil.electronUtilStrings.`privacy-eyetracker`
    - typings.electronUtil.electronUtilStrings.`privacy-tasks`
    - typings.electronUtil.electronUtilStrings.`privacy-messaging`
    - typings.electronUtil.electronUtilStrings.`privacy-radios`
    - typings.electronUtil.electronUtilStrings.`privacy-customdevices`
    - typings.electronUtil.electronUtilStrings.`privacy-backgroundapps`
    - typings.electronUtil.electronUtilStrings.`privacy-appdiagnostics`
    - typings.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads`
    - typings.electronUtil.electronUtilStrings.`privacy-documents`
    - typings.electronUtil.electronUtilStrings.`privacy-pictures`
    - typings.electronUtil.electronUtilStrings.`privacy-videos`
    - typings.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess`
    - typings.electronUtil.electronUtilStrings.windowsupdate
    - typings.electronUtil.electronUtilStrings.`delivery-optimization`
    - typings.electronUtil.electronUtilStrings.windowsdefender
    - typings.electronUtil.electronUtilStrings.backup
    - typings.electronUtil.electronUtilStrings.troubleshoot
    - typings.electronUtil.electronUtilStrings.recovery
    - typings.electronUtil.electronUtilStrings.activation
    - typings.electronUtil.electronUtilStrings.findmydevice
    - typings.electronUtil.electronUtilStrings.developers
    - typings.electronUtil.electronUtilStrings.windowsinsider
  */
  trait SystemPreferencesWindowsPane extends StObject
  object SystemPreferencesWindowsPane {
    
    inline def about: typings.electronUtil.electronUtilStrings.about = "about".asInstanceOf[typings.electronUtil.electronUtilStrings.about]
    
    inline def activation: typings.electronUtil.electronUtilStrings.activation = "activation".asInstanceOf[typings.electronUtil.electronUtilStrings.activation]
    
    inline def appsfeatures: typings.electronUtil.electronUtilStrings.appsfeatures = "appsfeatures".asInstanceOf[typings.electronUtil.electronUtilStrings.appsfeatures]
    
    inline def appsforwebsites: typings.electronUtil.electronUtilStrings.appsforwebsites = "appsforwebsites".asInstanceOf[typings.electronUtil.electronUtilStrings.appsforwebsites]
    
    inline def autoplay: typings.electronUtil.electronUtilStrings.autoplay = "autoplay".asInstanceOf[typings.electronUtil.electronUtilStrings.autoplay]
    
    inline def backup: typings.electronUtil.electronUtilStrings.backup = "backup".asInstanceOf[typings.electronUtil.electronUtilStrings.backup]
    
    inline def batterysaver: typings.electronUtil.electronUtilStrings.batterysaver = "batterysaver".asInstanceOf[typings.electronUtil.electronUtilStrings.batterysaver]
    
    inline def bluetooth: typings.electronUtil.electronUtilStrings.bluetooth = "bluetooth".asInstanceOf[typings.electronUtil.electronUtilStrings.bluetooth]
    
    inline def clipboard: typings.electronUtil.electronUtilStrings.clipboard = "clipboard".asInstanceOf[typings.electronUtil.electronUtilStrings.clipboard]
    
    inline def connecteddevices: typings.electronUtil.electronUtilStrings.connecteddevices = "connecteddevices".asInstanceOf[typings.electronUtil.electronUtilStrings.connecteddevices]
    
    inline def cortana: typings.electronUtil.electronUtilStrings.cortana = "cortana".asInstanceOf[typings.electronUtil.electronUtilStrings.cortana]
    
    inline def `cortana-permissions`: typings.electronUtil.electronUtilStrings.`cortana-permissions` = "cortana-permissions".asInstanceOf[typings.electronUtil.electronUtilStrings.`cortana-permissions`]
    
    inline def `cortana-talktocortana`: typings.electronUtil.electronUtilStrings.`cortana-talktocortana` = "cortana-talktocortana".asInstanceOf[typings.electronUtil.electronUtilStrings.`cortana-talktocortana`]
    
    inline def `cortana-windowssearch`: typings.electronUtil.electronUtilStrings.`cortana-windowssearch` = "cortana-windowssearch".asInstanceOf[typings.electronUtil.electronUtilStrings.`cortana-windowssearch`]
    
    inline def crossdevice: typings.electronUtil.electronUtilStrings.crossdevice = "crossdevice".asInstanceOf[typings.electronUtil.electronUtilStrings.crossdevice]
    
    inline def datausage: typings.electronUtil.electronUtilStrings.datausage = "datausage".asInstanceOf[typings.electronUtil.electronUtilStrings.datausage]
    
    inline def dateandtime: typings.electronUtil.electronUtilStrings.dateandtime = "dateandtime".asInstanceOf[typings.electronUtil.electronUtilStrings.dateandtime]
    
    inline def defaultapps: typings.electronUtil.electronUtilStrings.defaultapps = "defaultapps".asInstanceOf[typings.electronUtil.electronUtilStrings.defaultapps]
    
    inline def `delivery-optimization`: typings.electronUtil.electronUtilStrings.`delivery-optimization` = "delivery-optimization".asInstanceOf[typings.electronUtil.electronUtilStrings.`delivery-optimization`]
    
    inline def developers: typings.electronUtil.electronUtilStrings.developers = "developers".asInstanceOf[typings.electronUtil.electronUtilStrings.developers]
    
    inline def `devices-touchpad`: typings.electronUtil.electronUtilStrings.`devices-touchpad` = "devices-touchpad".asInstanceOf[typings.electronUtil.electronUtilStrings.`devices-touchpad`]
    
    inline def display: typings.electronUtil.electronUtilStrings.display = "display".asInstanceOf[typings.electronUtil.electronUtilStrings.display]
    
    inline def `easeofaccess-audio`: typings.electronUtil.electronUtilStrings.`easeofaccess-audio` = "easeofaccess-audio".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-audio`]
    
    inline def `easeofaccess-closedcaptioning`: typings.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning` = "easeofaccess-closedcaptioning".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning`]
    
    inline def `easeofaccess-colorfilter`: typings.electronUtil.electronUtilStrings.`easeofaccess-colorfilter` = "easeofaccess-colorfilter".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-colorfilter`]
    
    inline def `easeofaccess-cursor`: typings.electronUtil.electronUtilStrings.`easeofaccess-cursor` = "easeofaccess-cursor".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-cursor`]
    
    inline def `easeofaccess-cursorandpointersize`: typings.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize` = "easeofaccess-cursorandpointersize".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize`]
    
    inline def `easeofaccess-display`: typings.electronUtil.electronUtilStrings.`easeofaccess-display` = "easeofaccess-display".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-display`]
    
    inline def `easeofaccess-eyecontrol`: typings.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol` = "easeofaccess-eyecontrol".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol`]
    
    inline def `easeofaccess-highcontrast`: typings.electronUtil.electronUtilStrings.`easeofaccess-highcontrast` = "easeofaccess-highcontrast".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-highcontrast`]
    
    inline def `easeofaccess-keyboard`: typings.electronUtil.electronUtilStrings.`easeofaccess-keyboard` = "easeofaccess-keyboard".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-keyboard`]
    
    inline def `easeofaccess-magnifier`: typings.electronUtil.electronUtilStrings.`easeofaccess-magnifier` = "easeofaccess-magnifier".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-magnifier`]
    
    inline def `easeofaccess-mouse`: typings.electronUtil.electronUtilStrings.`easeofaccess-mouse` = "easeofaccess-mouse".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-mouse`]
    
    inline def `easeofaccess-narrator`: typings.electronUtil.electronUtilStrings.`easeofaccess-narrator` = "easeofaccess-narrator".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-narrator`]
    
    inline def `easeofaccess-speechrecognition`: typings.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition` = "easeofaccess-speechrecognition".asInstanceOf[typings.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition`]
    
    inline def emailandaccounts: typings.electronUtil.electronUtilStrings.emailandaccounts = "emailandaccounts".asInstanceOf[typings.electronUtil.electronUtilStrings.emailandaccounts]
    
    inline def findmydevice: typings.electronUtil.electronUtilStrings.findmydevice = "findmydevice".asInstanceOf[typings.electronUtil.electronUtilStrings.findmydevice]
    
    inline def fonts: typings.electronUtil.electronUtilStrings.fonts = "fonts".asInstanceOf[typings.electronUtil.electronUtilStrings.fonts]
    
    inline def `gaming-broadcasting`: typings.electronUtil.electronUtilStrings.`gaming-broadcasting` = "gaming-broadcasting".asInstanceOf[typings.electronUtil.electronUtilStrings.`gaming-broadcasting`]
    
    inline def `gaming-gamebar`: typings.electronUtil.electronUtilStrings.`gaming-gamebar` = "gaming-gamebar".asInstanceOf[typings.electronUtil.electronUtilStrings.`gaming-gamebar`]
    
    inline def `gaming-gamedvr`: typings.electronUtil.electronUtilStrings.`gaming-gamedvr` = "gaming-gamedvr".asInstanceOf[typings.electronUtil.electronUtilStrings.`gaming-gamedvr`]
    
    inline def `gaming-gamemode`: typings.electronUtil.electronUtilStrings.`gaming-gamemode` = "gaming-gamemode".asInstanceOf[typings.electronUtil.electronUtilStrings.`gaming-gamemode`]
    
    inline def `gaming-xboxnetworking`: typings.electronUtil.electronUtilStrings.`gaming-xboxnetworking` = "gaming-xboxnetworking".asInstanceOf[typings.electronUtil.electronUtilStrings.`gaming-xboxnetworking`]
    
    inline def lockscreen: typings.electronUtil.electronUtilStrings.lockscreen = "lockscreen".asInstanceOf[typings.electronUtil.electronUtilStrings.lockscreen]
    
    inline def maps: typings.electronUtil.electronUtilStrings.maps = "maps".asInstanceOf[typings.electronUtil.electronUtilStrings.maps]
    
    inline def `mobile-devices`: typings.electronUtil.electronUtilStrings.`mobile-devices` = "mobile-devices".asInstanceOf[typings.electronUtil.electronUtilStrings.`mobile-devices`]
    
    inline def mousetouchpad: typings.electronUtil.electronUtilStrings.mousetouchpad = "mousetouchpad".asInstanceOf[typings.electronUtil.electronUtilStrings.mousetouchpad]
    
    inline def multitasking: typings.electronUtil.electronUtilStrings.multitasking = "multitasking".asInstanceOf[typings.electronUtil.electronUtilStrings.multitasking]
    
    inline def network: typings.electronUtil.electronUtilStrings.network = "network".asInstanceOf[typings.electronUtil.electronUtilStrings.network]
    
    inline def `network-airplanemode`: typings.electronUtil.electronUtilStrings.`network-airplanemode` = "network-airplanemode".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-airplanemode`]
    
    inline def `network-cellular`: typings.electronUtil.electronUtilStrings.`network-cellular` = "network-cellular".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-cellular`]
    
    inline def `network-dialup`: typings.electronUtil.electronUtilStrings.`network-dialup` = "network-dialup".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-dialup`]
    
    inline def `network-ethernet`: typings.electronUtil.electronUtilStrings.`network-ethernet` = "network-ethernet".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-ethernet`]
    
    inline def `network-mobilehotspot`: typings.electronUtil.electronUtilStrings.`network-mobilehotspot` = "network-mobilehotspot".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-mobilehotspot`]
    
    inline def `network-proxy`: typings.electronUtil.electronUtilStrings.`network-proxy` = "network-proxy".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-proxy`]
    
    inline def `network-status`: typings.electronUtil.electronUtilStrings.`network-status` = "network-status".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-status`]
    
    inline def `network-vpn`: typings.electronUtil.electronUtilStrings.`network-vpn` = "network-vpn".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-vpn`]
    
    inline def `network-wifi`: typings.electronUtil.electronUtilStrings.`network-wifi` = "network-wifi".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-wifi`]
    
    inline def `network-wificalling`: typings.electronUtil.electronUtilStrings.`network-wificalling` = "network-wificalling".asInstanceOf[typings.electronUtil.electronUtilStrings.`network-wificalling`]
    
    inline def nfctransactions: typings.electronUtil.electronUtilStrings.nfctransactions = "nfctransactions".asInstanceOf[typings.electronUtil.electronUtilStrings.nfctransactions]
    
    inline def notifications: typings.electronUtil.electronUtilStrings.notifications = "notifications".asInstanceOf[typings.electronUtil.electronUtilStrings.notifications]
    
    inline def optionalfeatures: typings.electronUtil.electronUtilStrings.optionalfeatures = "optionalfeatures".asInstanceOf[typings.electronUtil.electronUtilStrings.optionalfeatures]
    
    inline def otherusers: typings.electronUtil.electronUtilStrings.otherusers = "otherusers".asInstanceOf[typings.electronUtil.electronUtilStrings.otherusers]
    
    inline def pen: typings.electronUtil.electronUtilStrings.pen = "pen".asInstanceOf[typings.electronUtil.electronUtilStrings.pen]
    
    inline def personalization: typings.electronUtil.electronUtilStrings.personalization = "personalization".asInstanceOf[typings.electronUtil.electronUtilStrings.personalization]
    
    inline def `personalization-background`: typings.electronUtil.electronUtilStrings.`personalization-background` = "personalization-background".asInstanceOf[typings.electronUtil.electronUtilStrings.`personalization-background`]
    
    inline def `personalization-colors`: typings.electronUtil.electronUtilStrings.`personalization-colors` = "personalization-colors".asInstanceOf[typings.electronUtil.electronUtilStrings.`personalization-colors`]
    
    inline def `personalization-start`: typings.electronUtil.electronUtilStrings.`personalization-start` = "personalization-start".asInstanceOf[typings.electronUtil.electronUtilStrings.`personalization-start`]
    
    inline def powersleep: typings.electronUtil.electronUtilStrings.powersleep = "powersleep".asInstanceOf[typings.electronUtil.electronUtilStrings.powersleep]
    
    inline def printers: typings.electronUtil.electronUtilStrings.printers = "printers".asInstanceOf[typings.electronUtil.electronUtilStrings.printers]
    
    inline def privacy: privacy_ = "privacy".asInstanceOf[privacy_]
    
    inline def `privacy-accountinfo`: typings.electronUtil.electronUtilStrings.`privacy-accountinfo` = "privacy-accountinfo".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-accountinfo`]
    
    inline def `privacy-activityhistory`: typings.electronUtil.electronUtilStrings.`privacy-activityhistory` = "privacy-activityhistory".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-activityhistory`]
    
    inline def `privacy-appdiagnostics`: typings.electronUtil.electronUtilStrings.`privacy-appdiagnostics` = "privacy-appdiagnostics".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-appdiagnostics`]
    
    inline def `privacy-automaticfiledownloads`: typings.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads` = "privacy-automaticfiledownloads".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads`]
    
    inline def `privacy-backgroundapps`: typings.electronUtil.electronUtilStrings.`privacy-backgroundapps` = "privacy-backgroundapps".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-backgroundapps`]
    
    inline def `privacy-broadfilesystemaccess`: typings.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess` = "privacy-broadfilesystemaccess".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess`]
    
    inline def `privacy-calendar`: typings.electronUtil.electronUtilStrings.`privacy-calendar` = "privacy-calendar".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-calendar`]
    
    inline def `privacy-callhistory`: typings.electronUtil.electronUtilStrings.`privacy-callhistory` = "privacy-callhistory".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-callhistory`]
    
    inline def `privacy-contacts`: typings.electronUtil.electronUtilStrings.`privacy-contacts` = "privacy-contacts".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-contacts`]
    
    inline def `privacy-customdevices`: typings.electronUtil.electronUtilStrings.`privacy-customdevices` = "privacy-customdevices".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-customdevices`]
    
    inline def `privacy-documents`: typings.electronUtil.electronUtilStrings.`privacy-documents` = "privacy-documents".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-documents`]
    
    inline def `privacy-email`: typings.electronUtil.electronUtilStrings.`privacy-email` = "privacy-email".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-email`]
    
    inline def `privacy-eyetracker`: typings.electronUtil.electronUtilStrings.`privacy-eyetracker` = "privacy-eyetracker".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-eyetracker`]
    
    inline def `privacy-feedback`: typings.electronUtil.electronUtilStrings.`privacy-feedback` = "privacy-feedback".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-feedback`]
    
    inline def `privacy-location`: typings.electronUtil.electronUtilStrings.`privacy-location` = "privacy-location".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-location`]
    
    inline def `privacy-messaging`: typings.electronUtil.electronUtilStrings.`privacy-messaging` = "privacy-messaging".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-messaging`]
    
    inline def `privacy-microphone`: typings.electronUtil.electronUtilStrings.`privacy-microphone` = "privacy-microphone".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-microphone`]
    
    inline def `privacy-notifications`: typings.electronUtil.electronUtilStrings.`privacy-notifications` = "privacy-notifications".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-notifications`]
    
    inline def `privacy-phonecalls`: typings.electronUtil.electronUtilStrings.`privacy-phonecalls` = "privacy-phonecalls".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-phonecalls`]
    
    inline def `privacy-pictures`: typings.electronUtil.electronUtilStrings.`privacy-pictures` = "privacy-pictures".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-pictures`]
    
    inline def `privacy-radios`: typings.electronUtil.electronUtilStrings.`privacy-radios` = "privacy-radios".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-radios`]
    
    inline def `privacy-speech`: typings.electronUtil.electronUtilStrings.`privacy-speech` = "privacy-speech".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-speech`]
    
    inline def `privacy-speechtyping`: typings.electronUtil.electronUtilStrings.`privacy-speechtyping` = "privacy-speechtyping".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-speechtyping`]
    
    inline def `privacy-tasks`: typings.electronUtil.electronUtilStrings.`privacy-tasks` = "privacy-tasks".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-tasks`]
    
    inline def `privacy-videos`: typings.electronUtil.electronUtilStrings.`privacy-videos` = "privacy-videos".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-videos`]
    
    inline def `privacy-voiceactivation`: typings.electronUtil.electronUtilStrings.`privacy-voiceactivation` = "privacy-voiceactivation".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-voiceactivation`]
    
    inline def `privacy-webcam`: typings.electronUtil.electronUtilStrings.`privacy-webcam` = "privacy-webcam".asInstanceOf[typings.electronUtil.electronUtilStrings.`privacy-webcam`]
    
    inline def project: typings.electronUtil.electronUtilStrings.project = "project".asInstanceOf[typings.electronUtil.electronUtilStrings.project]
    
    inline def quiethours: typings.electronUtil.electronUtilStrings.quiethours = "quiethours".asInstanceOf[typings.electronUtil.electronUtilStrings.quiethours]
    
    inline def recovery: typings.electronUtil.electronUtilStrings.recovery = "recovery".asInstanceOf[typings.electronUtil.electronUtilStrings.recovery]
    
    inline def regionformatting: typings.electronUtil.electronUtilStrings.regionformatting = "regionformatting".asInstanceOf[typings.electronUtil.electronUtilStrings.regionformatting]
    
    inline def regionlanguage: typings.electronUtil.electronUtilStrings.regionlanguage = "regionlanguage".asInstanceOf[typings.electronUtil.electronUtilStrings.regionlanguage]
    
    inline def remotedesktop: typings.electronUtil.electronUtilStrings.remotedesktop = "remotedesktop".asInstanceOf[typings.electronUtil.electronUtilStrings.remotedesktop]
    
    inline def `search-permissions`: typings.electronUtil.electronUtilStrings.`search-permissions` = "search-permissions".asInstanceOf[typings.electronUtil.electronUtilStrings.`search-permissions`]
    
    inline def signinoptions: typings.electronUtil.electronUtilStrings.signinoptions = "signinoptions".asInstanceOf[typings.electronUtil.electronUtilStrings.signinoptions]
    
    inline def sound: typings.electronUtil.electronUtilStrings.sound = "sound".asInstanceOf[typings.electronUtil.electronUtilStrings.sound]
    
    inline def speech: typings.electronUtil.electronUtilStrings.speech = "speech".asInstanceOf[typings.electronUtil.electronUtilStrings.speech]
    
    inline def startupapps: typings.electronUtil.electronUtilStrings.startupapps = "startupapps".asInstanceOf[typings.electronUtil.electronUtilStrings.startupapps]
    
    inline def storagesense: typings.electronUtil.electronUtilStrings.storagesense = "storagesense".asInstanceOf[typings.electronUtil.electronUtilStrings.storagesense]
    
    inline def sync: typings.electronUtil.electronUtilStrings.sync = "sync".asInstanceOf[typings.electronUtil.electronUtilStrings.sync]
    
    inline def tabletmode: typings.electronUtil.electronUtilStrings.tabletmode = "tabletmode".asInstanceOf[typings.electronUtil.electronUtilStrings.tabletmode]
    
    inline def taskbar: typings.electronUtil.electronUtilStrings.taskbar = "taskbar".asInstanceOf[typings.electronUtil.electronUtilStrings.taskbar]
    
    inline def themes: typings.electronUtil.electronUtilStrings.themes = "themes".asInstanceOf[typings.electronUtil.electronUtilStrings.themes]
    
    inline def troubleshoot: typings.electronUtil.electronUtilStrings.troubleshoot = "troubleshoot".asInstanceOf[typings.electronUtil.electronUtilStrings.troubleshoot]
    
    inline def typing: typings.electronUtil.electronUtilStrings.typing = "typing".asInstanceOf[typings.electronUtil.electronUtilStrings.typing]
    
    inline def usb: typings.electronUtil.electronUtilStrings.usb = "usb".asInstanceOf[typings.electronUtil.electronUtilStrings.usb]
    
    inline def videoplayback: typings.electronUtil.electronUtilStrings.videoplayback = "videoplayback".asInstanceOf[typings.electronUtil.electronUtilStrings.videoplayback]
    
    inline def wheel: typings.electronUtil.electronUtilStrings.wheel = "wheel".asInstanceOf[typings.electronUtil.electronUtilStrings.wheel]
    
    inline def windowsdefender: typings.electronUtil.electronUtilStrings.windowsdefender = "windowsdefender".asInstanceOf[typings.electronUtil.electronUtilStrings.windowsdefender]
    
    inline def windowsinsider: typings.electronUtil.electronUtilStrings.windowsinsider = "windowsinsider".asInstanceOf[typings.electronUtil.electronUtilStrings.windowsinsider]
    
    inline def windowsupdate: typings.electronUtil.electronUtilStrings.windowsupdate = "windowsupdate".asInstanceOf[typings.electronUtil.electronUtilStrings.windowsupdate]
    
    inline def workplace: typings.electronUtil.electronUtilStrings.workplace = "workplace".asInstanceOf[typings.electronUtil.electronUtilStrings.workplace]
    
    inline def yourinfo: typings.electronUtil.electronUtilStrings.yourinfo = "yourinfo".asInstanceOf[typings.electronUtil.electronUtilStrings.yourinfo]
  }
  
  trait _Choices[Macos, Windows, Linux, Default] extends StObject {
    
    val default: js.UndefOr[Default | js.Function0[Default]] = js.undefined
    
    val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.undefined
    
    val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.undefined
    
    val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.undefined
  }
  object _Choices {
    
    inline def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
    }
    
    extension [Self <: _Choices[?, ?, ?, ?], Macos, Windows, Linux, Default](x: Self & (_Choices[Macos, Windows, Linux, Default])) {
      
      inline def setDefault(value: Default | js.Function0[Default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction0(value: () => Default): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLinux(value: Linux | js.Function0[Linux]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setLinuxFunction0(value: () => Linux): Self = StObject.set(x, "linux", js.Any.fromFunction0(value))
      
      inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      inline def setMacos(value: Macos | js.Function0[Macos]): Self = StObject.set(x, "macos", value.asInstanceOf[js.Any])
      
      inline def setMacosFunction0(value: () => Macos): Self = StObject.set(x, "macos", js.Any.fromFunction0(value))
      
      inline def setMacosUndefined: Self = StObject.set(x, "macos", js.undefined)
      
      inline def setWindows(value: Windows | js.Function0[Windows]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsFunction0(value: () => Windows): Self = StObject.set(x, "windows", js.Any.fromFunction0(value))
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
