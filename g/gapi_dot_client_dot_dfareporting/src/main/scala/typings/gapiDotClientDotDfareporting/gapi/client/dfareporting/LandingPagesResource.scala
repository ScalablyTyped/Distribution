package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltCampaignId
import typings.gapiDotClientDotDfareporting.Anon_AltCampaignIdFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: Anon_AltCampaignIdFieldsId): Request[Unit]
  /** Gets one campaign landing page by ID. */
  def get(request: Anon_AltCampaignIdFieldsId): Request[LandingPage]
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: Anon_AltCampaignId): Request[LandingPage]
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: Anon_AltCampaignId): Request[LandingPagesListResponse]
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: Anon_AltCampaignIdFieldsId): Request[LandingPage]
  /** Updates an existing campaign landing page. */
  def update(request: Anon_AltCampaignId): Request[LandingPage]
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: Anon_AltCampaignIdFieldsId => Request[Unit],
    get: Anon_AltCampaignIdFieldsId => Request[LandingPage],
    insert: Anon_AltCampaignId => Request[LandingPage],
    list: Anon_AltCampaignId => Request[LandingPagesListResponse],
    patch: Anon_AltCampaignIdFieldsId => Request[LandingPage],
    update: Anon_AltCampaignId => Request[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LandingPagesResource]
  }
}

