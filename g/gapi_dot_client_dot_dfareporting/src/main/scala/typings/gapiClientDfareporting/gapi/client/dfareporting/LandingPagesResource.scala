package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltCampaignId
import typings.gapiClientDfareporting.AnonCampaignId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AnonAltCampaignId): Request_[Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: AnonAltCampaignId): Request_[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: AnonCampaignId): Request_[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: AnonCampaignId): Request_[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AnonAltCampaignId): Request_[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: AnonCampaignId): Request_[LandingPage]
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AnonAltCampaignId => Request_[Unit],
    get: AnonAltCampaignId => Request_[LandingPage],
    insert: AnonCampaignId => Request_[LandingPage],
    list: AnonCampaignId => Request_[LandingPagesListResponse],
    patch: AnonAltCampaignId => Request_[LandingPage],
    update: AnonCampaignId => Request_[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LandingPagesResource]
  }
}

