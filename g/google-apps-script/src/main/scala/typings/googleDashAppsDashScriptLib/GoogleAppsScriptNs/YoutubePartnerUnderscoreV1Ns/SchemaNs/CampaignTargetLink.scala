package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignTargetLink extends js.Object {
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  var targetType: js.UndefOr[java.lang.String] = js.undefined
}

object CampaignTargetLink {
  @scala.inline
  def apply(targetId: java.lang.String = null, targetType: java.lang.String = null): CampaignTargetLink = {
    val __obj = js.Dynamic.literal()
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType)
    __obj.asInstanceOf[CampaignTargetLink]
  }
}

