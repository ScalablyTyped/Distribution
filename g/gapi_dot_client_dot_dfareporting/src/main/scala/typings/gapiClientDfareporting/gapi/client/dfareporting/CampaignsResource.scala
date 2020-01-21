package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserGroupIdsAdvertiserIds
import typings.gapiClientDfareporting.AnonAltDefaultLandingPageName
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: AnonAltFields): Request_[Campaign]
  /** Inserts a new campaign. */
  def insert(request: AnonAltDefaultLandingPageName): Request_[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserGroupIdsAdvertiserIds): Request_[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Campaign]
  /** Updates an existing campaign. */
  def update(request: AnonAltFieldsKey): Request_[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Campaign],
    insert: AnonAltDefaultLandingPageName => Request_[Campaign],
    list: AnonAdvertiserGroupIdsAdvertiserIds => Request_[CampaignsListResponse],
    patch: AnonAltFields => Request_[Campaign],
    update: AnonAltFieldsKey => Request_[Campaign]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CampaignsResource]
  }
}

