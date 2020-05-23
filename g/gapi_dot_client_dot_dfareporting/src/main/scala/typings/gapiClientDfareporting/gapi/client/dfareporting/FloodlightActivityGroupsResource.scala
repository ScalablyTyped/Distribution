package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.FloodlightConfigurationId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: Fields): Request[FloodlightActivityGroup]
  /** Inserts a new floodlight activity group. */
  def insert(request: Key): Request[FloodlightActivityGroup]
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: FloodlightConfigurationId): Request[FloodlightActivityGroupsListResponse]
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightActivityGroup]
  /** Updates an existing floodlight activity group. */
  def update(request: Key): Request[FloodlightActivityGroup]
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[FloodlightActivityGroup],
    insert: Key => Request[FloodlightActivityGroup],
    list: FloodlightConfigurationId => Request[FloodlightActivityGroupsListResponse],
    patch: Fields => Request[FloodlightActivityGroup],
    update: Key => Request[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
}

