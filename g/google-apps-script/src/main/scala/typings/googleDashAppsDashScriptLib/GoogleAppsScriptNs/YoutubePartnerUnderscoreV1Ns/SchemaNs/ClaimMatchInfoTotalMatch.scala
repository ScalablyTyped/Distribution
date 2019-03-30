package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimMatchInfoTotalMatch extends js.Object {
  var referenceDurationSecs: js.UndefOr[java.lang.String] = js.undefined
  var userVideoDurationSecs: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimMatchInfoTotalMatch {
  @scala.inline
  def apply(referenceDurationSecs: java.lang.String = null, userVideoDurationSecs: java.lang.String = null): ClaimMatchInfoTotalMatch = {
    val __obj = js.Dynamic.literal()
    if (referenceDurationSecs != null) __obj.updateDynamic("referenceDurationSecs")(referenceDurationSecs)
    if (userVideoDurationSecs != null) __obj.updateDynamic("userVideoDurationSecs")(userVideoDurationSecs)
    __obj.asInstanceOf[ClaimMatchInfoTotalMatch]
  }
}

