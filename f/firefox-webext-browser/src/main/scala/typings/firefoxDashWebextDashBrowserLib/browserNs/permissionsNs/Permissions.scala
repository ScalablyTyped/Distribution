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

