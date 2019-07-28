package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.undefined
}

object OperatingSystemsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystems: js.Array[OperatingSystem] = null): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (operatingSystems != null) __obj.updateDynamic("operatingSystems")(operatingSystems)
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
}

