package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltCampaignId
import typings.gapiClientDfareporting.AnonAltCampaignIdFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AnonAltCampaignIdFieldsId): Request_[Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: AnonAltCampaignIdFieldsId): Request_[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: AnonAltCampaignId): Request_[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: AnonAltCampaignId): Request_[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AnonAltCampaignIdFieldsId): Request_[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: AnonAltCampaignId): Request_[LandingPage]
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AnonAltCampaignIdFieldsId => Request_[Unit],
    get: AnonAltCampaignIdFieldsId => Request_[LandingPage],
    insert: AnonAltCampaignId => Request_[LandingPage],
    list: AnonAltCampaignId => Request_[LandingPagesListResponse],
    patch: AnonAltCampaignIdFieldsId => Request_[LandingPage],
    update: AnonAltCampaignId => Request_[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LandingPagesResource]
  }
}

