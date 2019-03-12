package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignId): gapiDotClientLib.gapiNs.clientNs.Request[CampaignCreativeAssociation]
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CampaignCreativeAssociationsListResponse]
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: gapiDotClientDotDfareportingLib.Anon_AltCampaignId => gapiDotClientLib.gapiNs.clientNs.Request[CampaignCreativeAssociation],
    list: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CampaignCreativeAssociationsListResponse]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
}

