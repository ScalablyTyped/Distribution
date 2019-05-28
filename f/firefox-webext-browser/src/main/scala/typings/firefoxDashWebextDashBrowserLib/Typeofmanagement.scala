package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmanagement extends js.Object {
  /* management events */
  /** Fired when an addon has been disabled. */
  val onDisabled: WebExtEvent[
    js.Function1[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when an addon has been enabled. */
  val onEnabled: WebExtEvent[
    js.Function1[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when an addon has been installed. */
  val onInstalled: WebExtEvent[
    js.Function1[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when an addon has been uninstalled. */
  val onUninstalled: WebExtEvent[
    js.Function1[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Returns information about the installed extension that has the given ID.
    * @param id The ID from an item of `management.ExtensionInfo`.
    */
  def get(id: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ExtensionID): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo]] = js.native
  /* management functions */
  /** Returns a list of information about installed extensions. */
  def getAll(): js.Promise[
    js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo]]
  ] = js.native
  /**
    * Returns information about the calling extension. Note: This function can be used without requesting the
    * 'management' permission in the manifest.
    */
  def getSelf(): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.managementNs.ExtensionInfo]] = js.native
  /** Installs and enables a theme extension from the given url. */
  def install(options: Anon_Hash): js.Promise[js.UndefOr[Anon_Id]] = js.native
  /**
    * Enables or disables the given add-on.
    * @param id ID of the add-on to enable/disable.
    * @param enabled Whether to enable or disable the add-on.
    */
  def setEnabled(id: java.lang.String, enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
    * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission
    * in the manifest.
    */
  def uninstallSelf(): js.Promise[scala.Unit] = js.native
  def uninstallSelf(options: Anon_DialogMessage): js.Promise[scala.Unit] = js.native
}

