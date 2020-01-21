package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdsAltArchived
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: AnonAltFields): Request_[PlacementGroup]
  /** Inserts a new placement group. */
  def insert(request: AnonAltFieldsKey): Request_[PlacementGroup]
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdsAltArchived): Request_[PlacementGroupsListResponse]
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[PlacementGroup]
  /** Updates an existing placement group. */
  def update(request: AnonAltFieldsKey): Request_[PlacementGroup]
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[PlacementGroup],
    insert: AnonAltFieldsKey => Request_[PlacementGroup],
    list: AnonAdvertiserIdsAltArchived => Request_[PlacementGroupsListResponse],
    patch: AnonAltFields => Request_[PlacementGroup],
    update: AnonAltFieldsKey => Request_[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementGroupsResource]
  }
}

