package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsListResponse extends js.Object {
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CampaignsListResponse {
  @scala.inline
  def apply(campaigns: js.Array[Campaign] = null, kind: String = null, nextPageToken: String = null): CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CampaignsListResponse]
  }
}

