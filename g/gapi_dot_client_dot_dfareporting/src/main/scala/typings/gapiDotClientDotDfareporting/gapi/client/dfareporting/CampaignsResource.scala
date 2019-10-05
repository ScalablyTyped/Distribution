package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserGroupIdsAdvertiserIds
import typings.gapiDotClientDotDfareporting.Anon_AltDefaultLandingPageName
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: Anon_AltFields): Request[Campaign]
  /** Inserts a new campaign. */
  def insert(request: Anon_AltDefaultLandingPageName): Request[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserGroupIdsAdvertiserIds): Request[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Campaign]
  /** Updates an existing campaign. */
  def update(request: Anon_AltFieldsKey): Request[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Campaign],
    insert: Anon_AltDefaultLandingPageName => Request[Campaign],
    list: Anon_AdvertiserGroupIdsAdvertiserIds => Request[CampaignsListResponse],
    patch: Anon_AltFields => Request[Campaign],
    update: Anon_AltFieldsKey => Request[Campaign]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CampaignsResource]
  }
}

