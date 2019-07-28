package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimMatchInfoTotalMatch extends js.Object {
  var referenceDurationSecs: js.UndefOr[String] = js.undefined
  var userVideoDurationSecs: js.UndefOr[String] = js.undefined
}

object ClaimMatchInfoTotalMatch {
  @scala.inline
  def apply(referenceDurationSecs: String = null, userVideoDurationSecs: String = null): ClaimMatchInfoTotalMatch = {
    val __obj = js.Dynamic.literal()
    if (referenceDurationSecs != null) __obj.updateDynamic("referenceDurationSecs")(referenceDurationSecs)
    if (userVideoDurationSecs != null) __obj.updateDynamic("userVideoDurationSecs")(userVideoDurationSecs)
    __obj.asInstanceOf[ClaimMatchInfoTotalMatch]
  }
}

