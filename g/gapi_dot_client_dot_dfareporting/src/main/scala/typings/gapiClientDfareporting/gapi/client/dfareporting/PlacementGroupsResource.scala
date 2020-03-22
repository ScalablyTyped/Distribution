package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonCampaignIds
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: AnonFields): Request_[PlacementGroup]
  /** Inserts a new placement group. */
  def insert(request: AnonKey): Request_[PlacementGroup]
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: AnonCampaignIds): Request_[PlacementGroupsListResponse]
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementGroup]
  /** Updates an existing placement group. */
  def update(request: AnonKey): Request_[PlacementGroup]
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[PlacementGroup],
    insert: AnonKey => Request_[PlacementGroup],
    list: AnonCampaignIds => Request_[PlacementGroupsListResponse],
    patch: AnonFields => Request_[PlacementGroup],
    update: AnonKey => Request_[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementGroupsResource]
  }
}

