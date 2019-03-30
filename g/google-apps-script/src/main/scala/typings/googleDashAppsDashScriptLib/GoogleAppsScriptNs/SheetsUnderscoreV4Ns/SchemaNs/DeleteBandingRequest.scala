package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBandingRequest extends js.Object {
  var bandedRangeId: js.UndefOr[scala.Double] = js.undefined
}

object DeleteBandingRequest {
  @scala.inline
  def apply(bandedRangeId: scala.Int | scala.Double = null): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRangeId != null) __obj.updateDynamic("bandedRangeId")(bandedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBandingRequest]
  }
}

