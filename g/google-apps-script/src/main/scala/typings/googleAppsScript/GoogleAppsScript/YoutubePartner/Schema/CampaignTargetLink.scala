package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignTargetLink extends js.Object {
  var targetId: js.UndefOr[String] = js.undefined
  var targetType: js.UndefOr[String] = js.undefined
}

object CampaignTargetLink {
  @scala.inline
  def apply(targetId: String = null, targetType: String = null): CampaignTargetLink = {
    val __obj = js.Dynamic.literal()
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignTargetLink]
  }
}

