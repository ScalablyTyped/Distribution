package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CampaignIds
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: Fields): Request[PlacementGroup]
  /** Inserts a new placement group. */
  def insert(request: Key): Request[PlacementGroup]
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: CampaignIds): Request[PlacementGroupsListResponse]
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: Fields): Request[PlacementGroup]
  /** Updates an existing placement group. */
  def update(request: Key): Request[PlacementGroup]
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[PlacementGroup],
    insert: Key => Request[PlacementGroup],
    list: CampaignIds => Request[PlacementGroupsListResponse],
    patch: Fields => Request[PlacementGroup],
    update: Key => Request[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementGroupsResource]
  }
}

