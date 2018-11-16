package typings
package firefoxDashWebextDashBrowserLib.browserNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management")
@js.native
object managementNsMembers extends js.Object {
  /* management events */
  /** Fired when an addon has been disabled. */
  val onDisabled: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* info */ ExtensionInfo, scala.Unit]] = js.native
  /** Fired when an addon has been enabled. */
  val onEnabled: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* info */ ExtensionInfo, scala.Unit]] = js.native
  /** Fired when an addon has been installed. */
  val onInstalled: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* info */ ExtensionInfo, scala.Unit]] = js.native
  /** Fired when an addon has been uninstalled. */
  val onUninstalled: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* info */ ExtensionInfo, scala.Unit]] = js.native
  /**
       * Returns information about the installed extension that has the given ID.
       * @param id The ID from an item of `management.ExtensionInfo`.
       */
  def get(id: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID): stdLib.Promise[js.UndefOr[ExtensionInfo]] = js.native
  /* management functions */
  /** Returns a list of information about installed extensions. */
  def getAll(): stdLib.Promise[js.UndefOr[js.Array[ExtensionInfo]]] = js.native
  /**
       * Returns information about the calling extension. Note: This function can be used without requesting the
       * 'management' permission in the manifest.
       */
  def getSelf(): stdLib.Promise[js.UndefOr[ExtensionInfo]] = js.native
  /** Installs and enables a theme extension from the given url. */
  def install(options: firefoxDashWebextDashBrowserLib.Anon_UrlHash): stdLib.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Id]] = js.native
  /**
       * Enables or disables the given add-on.
       * @param id ID of the add-on to enable/disable.
       * @param enabled Whether to enable or disable the add-on.
       */
  def setEnabled(id: java.lang.String, enabled: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  /**
       * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission
       * in the manifest.
       */
  def uninstallSelf(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission
       * in the manifest.
       */
  def uninstallSelf(options: firefoxDashWebextDashBrowserLib.Anon_ShowConfirmDialog): stdLib.Promise[scala.Unit] = js.native
}

