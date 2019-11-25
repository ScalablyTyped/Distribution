package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimMatchInfoLongestMatch extends js.Object {
  var durationSecs: js.UndefOr[String] = js.undefined
  var referenceOffset: js.UndefOr[String] = js.undefined
  var userVideoOffset: js.UndefOr[String] = js.undefined
}

object ClaimMatchInfoLongestMatch {
  @scala.inline
  def apply(durationSecs: String = null, referenceOffset: String = null, userVideoOffset: String = null): ClaimMatchInfoLongestMatch = {
    val __obj = js.Dynamic.literal()
    if (durationSecs != null) __obj.updateDynamic("durationSecs")(durationSecs.asInstanceOf[js.Any])
    if (referenceOffset != null) __obj.updateDynamic("referenceOffset")(referenceOffset.asInstanceOf[js.Any])
    if (userVideoOffset != null) __obj.updateDynamic("userVideoOffset")(userVideoOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimMatchInfoLongestMatch]
  }
}

