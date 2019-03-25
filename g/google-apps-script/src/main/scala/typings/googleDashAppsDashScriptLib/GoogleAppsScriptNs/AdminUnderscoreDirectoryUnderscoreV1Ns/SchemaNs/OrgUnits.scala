package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgUnits extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var organizationUnits: js.UndefOr[js.Array[OrgUnit]] = js.undefined
}

object OrgUnits {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    organizationUnits: js.Array[OrgUnit] = null
  ): OrgUnits = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (organizationUnits != null) __obj.updateDynamic("organizationUnits")(organizationUnits)
    __obj.asInstanceOf[OrgUnits]
  }
}

