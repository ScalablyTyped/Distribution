package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, platformTypes: js.Array[PlatformType] = null): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes)
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
}

