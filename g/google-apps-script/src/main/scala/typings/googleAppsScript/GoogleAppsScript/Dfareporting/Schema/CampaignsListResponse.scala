package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignsListResponse extends js.Object {
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object CampaignsListResponse {
  @scala.inline
  def apply(): CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignsListResponse]
  }
  @scala.inline
  implicit class CampaignsListResponseOps[Self <: CampaignsListResponse] (val x: Self) extends AnyVal {
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
    def setCampaignsVarargs(value: Campaign*): Self = this.set("campaigns", js.Array(value :_*))
    @scala.inline
    def setCampaigns(value: js.Array[Campaign]): Self = this.set("campaigns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaigns: Self = this.set("campaigns", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

