package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaign extends js.Object {
  var campaignData: js.UndefOr[CampaignData] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var timeLastModified: js.UndefOr[String] = js.native
}

object Campaign {
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  @scala.inline
  implicit class CampaignOps[Self <: Campaign] (val x: Self) extends AnyVal {
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
    def setCampaignData(value: CampaignData): Self = this.set("campaignData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignData: Self = this.set("campaignData", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    @scala.inline
    def setTimeLastModified(value: String): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLastModified: Self = this.set("timeLastModified", js.undefined)
  }
  
}

