package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSource extends js.Object {
  var sourceType: js.UndefOr[String] = js.undefined
  var sourceValue: js.UndefOr[js.Array[String]] = js.undefined
}

object CampaignSource {
  @scala.inline
  def apply(sourceType: String = null, sourceValue: js.Array[String] = null): CampaignSource = {
    val __obj = js.Dynamic.literal()
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (sourceValue != null) __obj.updateDynamic("sourceValue")(sourceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignSource]
  }
}

