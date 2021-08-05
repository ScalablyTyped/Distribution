package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.management.ExtensionInfo
import typings.firefoxWebextBrowser.browser.management.InstallOptions
import typings.firefoxWebextBrowser.browser.management.InstallReturnResult
import typings.firefoxWebextBrowser.browser.management.UninstallSelfOptions
import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object management {
  
  @JSGlobal("browser.management")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns information about the installed extension that has the given ID.
    * @param id The ID from an item of `management.ExtensionInfo`.
    */
  inline def get(id: ExtensionID): js.Promise[ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExtensionInfo]]
  
  /* management functions */
  /** Returns a list of information about installed extensions. */
  inline def getAll(): js.Promise[js.Array[ExtensionInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[ExtensionInfo]]]
  
  /**
    * Returns information about the calling extension. Note: This function can be used without requesting the 'management' permission in the manifest.
    */
  inline def getSelf(): js.Promise[ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")().asInstanceOf[js.Promise[ExtensionInfo]]
  
  /** Installs and enables a theme extension from the given url. */
  inline def install(options: InstallOptions): js.Promise[InstallReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstallReturnResult]]
  
  /* management events */
  /** Fired when an addon has been disabled. */
  @JSGlobal("browser.management.onDisabled")
  @js.native
  val onDisabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been enabled. */
  @JSGlobal("browser.management.onEnabled")
  @js.native
  val onEnabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been installed. */
  @JSGlobal("browser.management.onInstalled")
  @js.native
  val onInstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been uninstalled. */
  @JSGlobal("browser.management.onUninstalled")
  @js.native
  val onUninstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /**
    * Enables or disables the given add-on.
    * @param id ID of the add-on to enable/disable.
    * @param enabled Whether to enable or disable the add-on.
    */
  inline def setEnabled(id: String, enabled: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(id.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission in the manifest.
    */
  inline def uninstallSelf(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")().asInstanceOf[js.Promise[Unit]]
  inline def uninstallSelf(options: UninstallSelfOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
