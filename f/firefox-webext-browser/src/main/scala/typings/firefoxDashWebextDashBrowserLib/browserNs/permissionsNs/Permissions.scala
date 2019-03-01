package typings
package firefoxDashWebextDashBrowserLib.browserNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* permissions types */
trait Permissions extends js.Object {
  var origins: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  ] = js.undefined
  var permissions: js.UndefOr[
    js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.OptionalPermission
    ]
  ] = js.undefined
}

object Permissions {
  @scala.inline
  def apply(
    origins: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern] = null,
    permissions: js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.OptionalPermission
    ] = null
  ): Permissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Permissions]
  }
}

