package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltCampaignId
import typings.gapiClientDfareporting.AnonAltCampaignIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: AnonAltCampaignId): Request_[CampaignCreativeAssociation]
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: AnonAltCampaignIdFields): Request_[CampaignCreativeAssociationsListResponse]
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: AnonAltCampaignId => Request_[CampaignCreativeAssociation],
    list: AnonAltCampaignIdFields => Request_[CampaignCreativeAssociationsListResponse]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
}

