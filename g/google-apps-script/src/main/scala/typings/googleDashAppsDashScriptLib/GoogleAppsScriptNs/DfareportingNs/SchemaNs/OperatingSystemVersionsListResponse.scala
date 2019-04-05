package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.undefined
}

object OperatingSystemVersionsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, operatingSystemVersions: js.Array[OperatingSystemVersion] = null): OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (operatingSystemVersions != null) __obj.updateDynamic("operatingSystemVersions")(operatingSystemVersions)
    __obj.asInstanceOf[OperatingSystemVersionsListResponse]
  }
}

