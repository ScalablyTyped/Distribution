package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignData extends js.Object {
  var campaignSource: js.UndefOr[CampaignSource] = js.undefined
  var expireTime: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var promotedContent: js.UndefOr[js.Array[PromotedContent]] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object CampaignData {
  @scala.inline
  def apply(
    campaignSource: CampaignSource = null,
    expireTime: java.lang.String = null,
    name: java.lang.String = null,
    promotedContent: js.Array[PromotedContent] = null,
    startTime: java.lang.String = null
  ): CampaignData = {
    val __obj = js.Dynamic.literal()
    if (campaignSource != null) __obj.updateDynamic("campaignSource")(campaignSource)
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (promotedContent != null) __obj.updateDynamic("promotedContent")(promotedContent)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[CampaignData]
  }
}

