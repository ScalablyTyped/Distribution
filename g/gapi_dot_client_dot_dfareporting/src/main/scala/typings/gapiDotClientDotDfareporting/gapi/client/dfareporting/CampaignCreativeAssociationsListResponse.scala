package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsListResponse extends js.Object {
  /** Campaign creative association collection */
  var campaignCreativeAssociations: js.UndefOr[js.Array[CampaignCreativeAssociation]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignCreativeAssociationsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
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
    if (campaignCreativeAssociations != null) __obj.updateDynamic("campaignCreativeAssociations")(campaignCreativeAssociations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignCreativeAssociationsListResponse]
  }
}

