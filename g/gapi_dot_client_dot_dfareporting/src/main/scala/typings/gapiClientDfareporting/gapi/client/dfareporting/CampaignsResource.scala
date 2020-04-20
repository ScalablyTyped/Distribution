package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIds
import typings.gapiClientDfareporting.AnonDefaultLandingPageName
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: AnonFields): Request_[Campaign]
  /** Inserts a new campaign. */
  def insert(request: AnonDefaultLandingPageName): Request_[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIds): Request_[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Campaign]
  /** Updates an existing campaign. */
  def update(request: AnonKey): Request_[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Campaign],
    insert: AnonDefaultLandingPageName => Request_[Campaign],
    list: AnonAdvertiserIds => Request_[CampaignsListResponse],
    patch: AnonFields => Request_[Campaign],
    update: AnonKey => Request_[Campaign]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CampaignsResource]
  }
}

