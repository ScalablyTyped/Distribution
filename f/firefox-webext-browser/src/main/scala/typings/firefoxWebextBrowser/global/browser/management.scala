package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.management.ExtensionInfo
import typings.firefoxWebextBrowser.browser.management.InstallOptions
import typings.firefoxWebextBrowser.browser.management.InstallReturnResult
import typings.firefoxWebextBrowser.browser.management.UninstallSelfOptions
import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.management")
@js.native
object management extends js.Object {
  
  /**
    * Returns information about the installed extension that has the given ID.
    * @param id The ID from an item of `management.ExtensionInfo`.
    */
  def get(id: ExtensionID): js.Promise[ExtensionInfo] = js.native
  
  /* management functions */
  /** Returns a list of information about installed extensions. */
  def getAll(): js.Promise[js.Array[ExtensionInfo]] = js.native
  
  /**
    * Returns information about the calling extension. Note: This function can be used without requesting the 'management' permission in the manifest.
    */
  def getSelf(): js.Promise[ExtensionInfo] = js.native
  
  /** Installs and enables a theme extension from the given url. */
  def install(options: InstallOptions): js.Promise[InstallReturnResult] = js.native
  
  /* management events */
  /** Fired when an addon has been disabled. */
  val onDisabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been enabled. */
  val onEnabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been installed. */
  val onInstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /** Fired when an addon has been uninstalled. */
  val onUninstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  /**
    * Enables or disables the given add-on.
    * @param id ID of the add-on to enable/disable.
    * @param enabled Whether to enable or disable the add-on.
    */
  def setEnabled(id: String, enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission in the manifest.
    */
  def uninstallSelf(): js.Promise[Unit] = js.native
  def uninstallSelf(options: UninstallSelfOptions): js.Promise[Unit] = js.native
}
