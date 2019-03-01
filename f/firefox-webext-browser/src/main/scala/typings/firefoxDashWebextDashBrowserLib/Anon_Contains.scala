package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains extends js.Object {
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
  ]
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
  ]
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

object Anon_Contains {
  @scala.inline
  def apply(
    contains: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions, 
      js.Promise[scala.Boolean]
    ],
    getAll: js.Function0[
      js.Promise[firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.AnyPermissions]
    ],
    remove: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
      js.Promise[scala.Unit]
    ],
    request: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.permissionsNs.Permissions, 
      js.Promise[scala.Boolean]
    ],
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
  ): Anon_Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("getAll")(getAll)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("request")(request)
    if (onAdded != null) __obj.updateDynamic("onAdded")(onAdded)
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(onRemoved)
    __obj.asInstanceOf[Anon_Contains]
  }
}

