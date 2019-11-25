package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignData extends js.Object {
  var campaignSource: js.UndefOr[CampaignSource] = js.undefined
  var expireTime: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var promotedContent: js.UndefOr[js.Array[PromotedContent]] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
}

object CampaignData {
  @scala.inline
  def apply(
    campaignSource: CampaignSource = null,
    expireTime: String = null,
    name: String = null,
    promotedContent: js.Array[PromotedContent] = null,
    startTime: String = null
  ): CampaignData = {
    val __obj = js.Dynamic.literal()
    if (campaignSource != null) __obj.updateDynamic("campaignSource")(campaignSource.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (promotedContent != null) __obj.updateDynamic("promotedContent")(promotedContent.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignData]
  }
}

