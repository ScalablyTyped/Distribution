package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociation extends js.Object {
  var creativeId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object CampaignCreativeAssociation {
  @scala.inline
  def apply(creativeId: String = null, kind: String = null): CampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CampaignCreativeAssociation]
  }
}

