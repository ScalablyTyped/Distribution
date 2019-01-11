package typings
package firefoxDashWebextDashBrowserLib.browserNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.permissions")
@js.native
object ^ extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ]
  ] = js.native
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ]
  ] = js.native
  /** Check if the extension has the given permissions. */
  def contains(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions): js.Promise[scala.Boolean] = js.native
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions] = js.native
  /** Relinquish the given permissions. */
  def remove(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions): js.Promise[scala.Unit] = js.native
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions): js.Promise[scala.Boolean] = js.native
}

