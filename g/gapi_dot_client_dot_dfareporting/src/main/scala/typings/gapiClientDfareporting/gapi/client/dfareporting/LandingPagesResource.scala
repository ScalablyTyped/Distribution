package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AltCampaignId
import typings.gapiClientDfareporting.anon.CampaignId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AltCampaignId): Request[Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: AltCampaignId): Request[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: CampaignId): Request[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: CampaignId): Request[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AltCampaignId): Request[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: CampaignId): Request[LandingPage]
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AltCampaignId => Request[Unit],
    get: AltCampaignId => Request[LandingPage],
    insert: CampaignId => Request[LandingPage],
    list: CampaignId => Request[LandingPagesListResponse],
    patch: AltCampaignId => Request[LandingPage],
    update: CampaignId => Request[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LandingPagesResource]
  }
}

