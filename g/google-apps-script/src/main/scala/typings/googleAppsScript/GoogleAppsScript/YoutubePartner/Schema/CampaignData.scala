package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignData extends js.Object {
  var campaignSource: js.UndefOr[CampaignSource] = js.native
  var expireTime: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var promotedContent: js.UndefOr[js.Array[PromotedContent]] = js.native
  var startTime: js.UndefOr[String] = js.native
}

object CampaignData {
  @scala.inline
  def apply(): CampaignData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignData]
  }
  @scala.inline
  implicit class CampaignDataOps[Self <: CampaignData] (val x: Self) extends AnyVal {
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
    def setCampaignSource(value: CampaignSource): Self = this.set("campaignSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignSource: Self = this.set("campaignSource", js.undefined)
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPromotedContentVarargs(value: PromotedContent*): Self = this.set("promotedContent", js.Array(value :_*))
    @scala.inline
    def setPromotedContent(value: js.Array[PromotedContent]): Self = this.set("promotedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotedContent: Self = this.set("promotedContent", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

