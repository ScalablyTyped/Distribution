package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltCampaignId
import typings.gapiDotClientDotDfareporting.Anon_AltCampaignIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: Anon_AltCampaignId): Request[CampaignCreativeAssociation]
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: Anon_AltCampaignIdFields): Request[CampaignCreativeAssociationsListResponse]
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: Anon_AltCampaignId => Request[CampaignCreativeAssociation],
    list: Anon_AltCampaignIdFields => Request[CampaignCreativeAssociationsListResponse]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
}

