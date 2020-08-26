package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimMatchInfo extends js.Object {
  var longestMatch: js.UndefOr[ClaimMatchInfoLongestMatch] = js.native
  var matchSegments: js.UndefOr[js.Array[MatchSegment]] = js.native
  var referenceId: js.UndefOr[String] = js.native
  var totalMatch: js.UndefOr[ClaimMatchInfoTotalMatch] = js.native
}

object ClaimMatchInfo {
  @scala.inline
  def apply(): ClaimMatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimMatchInfo]
  }
  @scala.inline
  implicit class ClaimMatchInfoOps[Self <: ClaimMatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLongestMatch(value: ClaimMatchInfoLongestMatch): Self = this.set("longestMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongestMatch: Self = this.set("longestMatch", js.undefined)
    @scala.inline
    def setMatchSegmentsVarargs(value: MatchSegment*): Self = this.set("matchSegments", js.Array(value :_*))
    @scala.inline
    def setMatchSegments(value: js.Array[MatchSegment]): Self = this.set("matchSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchSegments: Self = this.set("matchSegments", js.undefined)
    @scala.inline
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
    @scala.inline
    def setTotalMatch(value: ClaimMatchInfoTotalMatch): Self = this.set("totalMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalMatch: Self = this.set("totalMatch", js.undefined)
  }
  
}

