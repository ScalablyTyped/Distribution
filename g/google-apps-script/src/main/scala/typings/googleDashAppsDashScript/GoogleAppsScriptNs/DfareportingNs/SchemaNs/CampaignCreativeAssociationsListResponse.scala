package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsListResponse extends js.Object {
  var campaignCreativeAssociations: js.UndefOr[js.Array[CampaignCreativeAssociation]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CampaignCreativeAssociationsListResponse {
  @scala.inline
  def apply(
    campaignCreativeAssociations: js.Array[CampaignCreativeAssociation] = null,
    kind: String = null,
    nextPageToken: String = null
  ): CampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (campaignCreativeAssociations != null) __obj.updateDynamic("campaignCreativeAssociations")(campaignCreativeAssociations)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CampaignCreativeAssociationsListResponse]
  }
}

