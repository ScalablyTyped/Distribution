package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProtectedRangeRequest extends js.Object {
  var protectedRangeId: js.UndefOr[scala.Double] = js.undefined
}

object DeleteProtectedRangeRequest {
  @scala.inline
  def apply(protectedRangeId: scala.Int | scala.Double = null): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
}

