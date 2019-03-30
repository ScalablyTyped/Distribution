package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimMatchInfoLongestMatch extends js.Object {
  var durationSecs: js.UndefOr[java.lang.String] = js.undefined
  var referenceOffset: js.UndefOr[java.lang.String] = js.undefined
  var userVideoOffset: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimMatchInfoLongestMatch {
  @scala.inline
  def apply(
    durationSecs: java.lang.String = null,
    referenceOffset: java.lang.String = null,
    userVideoOffset: java.lang.String = null
  ): ClaimMatchInfoLongestMatch = {
    val __obj = js.Dynamic.literal()
    if (durationSecs != null) __obj.updateDynamic("durationSecs")(durationSecs)
    if (referenceOffset != null) __obj.updateDynamic("referenceOffset")(referenceOffset)
    if (userVideoOffset != null) __obj.updateDynamic("userVideoOffset")(userVideoOffset)
    __obj.asInstanceOf[ClaimMatchInfoLongestMatch]
  }
}

