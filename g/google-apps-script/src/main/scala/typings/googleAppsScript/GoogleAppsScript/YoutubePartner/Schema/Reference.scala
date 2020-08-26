package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var assetId: js.UndefOr[String] = js.native
  var audioswapEnabled: js.UndefOr[Boolean] = js.native
  var claimId: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var duplicateLeader: js.UndefOr[String] = js.native
  var excludedIntervals: js.UndefOr[js.Array[ExcludedInterval]] = js.native
  var fpDirect: js.UndefOr[Boolean] = js.native
  @JSName("hashCode")
  var hashCode_FReference: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreFpMatch: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var length: js.UndefOr[Double] = js.native
  var origination: js.UndefOr[Origination] = js.native
  var status: js.UndefOr[String] = js.native
  var statusReason: js.UndefOr[String] = js.native
  var urgent: js.UndefOr[Boolean] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object Reference {
  @scala.inline
  def apply(): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setAudioswapEnabled(value: Boolean): Self = this.set("audioswapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioswapEnabled: Self = this.set("audioswapEnabled", js.undefined)
    @scala.inline
    def setClaimId(value: String): Self = this.set("claimId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimId: Self = this.set("claimId", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setDuplicateLeader(value: String): Self = this.set("duplicateLeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateLeader: Self = this.set("duplicateLeader", js.undefined)
    @scala.inline
    def setExcludedIntervalsVarargs(value: ExcludedInterval*): Self = this.set("excludedIntervals", js.Array(value :_*))
    @scala.inline
    def setExcludedIntervals(value: js.Array[ExcludedInterval]): Self = this.set("excludedIntervals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedIntervals: Self = this.set("excludedIntervals", js.undefined)
    @scala.inline
    def setFpDirect(value: Boolean): Self = this.set("fpDirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpDirect: Self = this.set("fpDirect", js.undefined)
    @scala.inline
    def setHashCode(value: String): Self = this.set("hashCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashCode: Self = this.set("hashCode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIgnoreFpMatch(value: Boolean): Self = this.set("ignoreFpMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFpMatch: Self = this.set("ignoreFpMatch", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOrigination(value: Origination): Self = this.set("origination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigination: Self = this.set("origination", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setUrgent(value: Boolean): Self = this.set("urgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrgent: Self = this.set("urgent", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

