package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdsAltArchived
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: Anon_AltFields): Request[PlacementGroup]
  /** Inserts a new placement group. */
  def insert(request: Anon_AltFieldsKey): Request[PlacementGroup]
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdsAltArchived): Request[PlacementGroupsListResponse]
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[PlacementGroup]
  /** Updates an existing placement group. */
  def update(request: Anon_AltFieldsKey): Request[PlacementGroup]
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[PlacementGroup],
    insert: Anon_AltFieldsKey => Request[PlacementGroup],
    list: Anon_AdvertiserIdsAltArchived => Request[PlacementGroupsListResponse],
    patch: Anon_AltFields => Request[PlacementGroup],
    update: Anon_AltFieldsKey => Request[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementGroupsResource]
  }
}

