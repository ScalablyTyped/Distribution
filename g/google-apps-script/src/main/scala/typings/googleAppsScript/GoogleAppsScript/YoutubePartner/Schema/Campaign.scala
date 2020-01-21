package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaign extends js.Object {
  var campaignData: js.UndefOr[CampaignData] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var timeLastModified: js.UndefOr[String] = js.undefined
}

object Campaign {
  @scala.inline
  def apply(
    campaignData: CampaignData = null,
    id: String = null,
    kind: String = null,
    status: String = null,
    timeCreated: String = null,
    timeLastModified: String = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (campaignData != null) __obj.updateDynamic("campaignData")(campaignData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (timeLastModified != null) __obj.updateDynamic("timeLastModified")(timeLastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Campaign]
  }
}

