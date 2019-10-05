package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgUnits extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var organizationUnits: js.UndefOr[js.Array[OrgUnit]] = js.undefined
}

object OrgUnits {
  @scala.inline
  def apply(etag: String = null, kind: String = null, organizationUnits: js.Array[OrgUnit] = null): OrgUnits = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (organizationUnits != null) __obj.updateDynamic("organizationUnits")(organizationUnits)
    __obj.asInstanceOf[OrgUnits]
  }
}

