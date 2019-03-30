package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaign extends js.Object {
  var campaignData: js.UndefOr[CampaignData] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
  var timeLastModified: js.UndefOr[java.lang.String] = js.undefined
}

object Campaign {
  @scala.inline
  def apply(
    campaignData: CampaignData = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    status: java.lang.String = null,
    timeCreated: java.lang.String = null,
    timeLastModified: java.lang.String = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (campaignData != null) __obj.updateDynamic("campaignData")(campaignData)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (timeLastModified != null) __obj.updateDynamic("timeLastModified")(timeLastModified)
    __obj.asInstanceOf[Campaign]
  }
}

