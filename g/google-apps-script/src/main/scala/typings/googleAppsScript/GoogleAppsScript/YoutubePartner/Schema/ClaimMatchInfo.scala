package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimMatchInfo extends js.Object {
  var longestMatch: js.UndefOr[ClaimMatchInfoLongestMatch] = js.undefined
  var matchSegments: js.UndefOr[js.Array[MatchSegment]] = js.undefined
  var referenceId: js.UndefOr[String] = js.undefined
  var totalMatch: js.UndefOr[ClaimMatchInfoTotalMatch] = js.undefined
}

object ClaimMatchInfo {
  @scala.inline
  def apply(
    longestMatch: ClaimMatchInfoLongestMatch = null,
    matchSegments: js.Array[MatchSegment] = null,
    referenceId: String = null,
    totalMatch: ClaimMatchInfoTotalMatch = null
  ): ClaimMatchInfo = {
    val __obj = js.Dynamic.literal()
    if (longestMatch != null) __obj.updateDynamic("longestMatch")(longestMatch.asInstanceOf[js.Any])
    if (matchSegments != null) __obj.updateDynamic("matchSegments")(matchSegments.asInstanceOf[js.Any])
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    if (totalMatch != null) __obj.updateDynamic("totalMatch")(totalMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimMatchInfo]
  }
}

