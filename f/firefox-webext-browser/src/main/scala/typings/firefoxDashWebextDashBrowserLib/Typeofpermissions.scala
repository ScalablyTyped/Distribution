package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[
    WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[
    WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  /** Check if the extension has the given permissions. */
  def contains(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions): js.Promise[scala.Boolean]
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions]
  /** Relinquish the given permissions. */
  def remove(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions): js.Promise[scala.Unit]
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions): js.Promise[scala.Boolean]
}

object Typeofpermissions {
  @scala.inline
  def apply(
    contains: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions => js.Promise[scala.Boolean],
    getAll: () => js.Promise[firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions],
    remove: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions => js.Promise[scala.Unit],
    request: firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions => js.Promise[scala.Boolean],
    onAdded: WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ] = null,
    onRemoved: WebExtEvent[
      js.Function1[
        /* permissions */ firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
        scala.Unit
      ]
    ] = null
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAll = js.Any.fromFunction0(getAll), remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request))
    if (onAdded != null) __obj.updateDynamic("onAdded")(onAdded)
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(onRemoved)
    __obj.asInstanceOf[Typeofpermissions]
  }
}

