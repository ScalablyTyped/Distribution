package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedContent extends js.Object {
  var link: js.UndefOr[js.Array[CampaignTargetLink]] = js.undefined
}

object PromotedContent {
  @scala.inline
  def apply(link: js.Array[CampaignTargetLink] = null): PromotedContent = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[PromotedContent]
  }
}

