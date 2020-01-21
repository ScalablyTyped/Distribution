package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdsAlt
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: AnonAltFields): Request_[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: AnonAltFieldsKey): Request_[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdsAlt): Request_[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: AnonAltFieldsKey): Request_[CreativeGroup]
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[CreativeGroup],
    insert: AnonAltFieldsKey => Request_[CreativeGroup],
    list: AnonAdvertiserIdsAlt => Request_[CreativeGroupsListResponse],
    patch: AnonAltFields => Request_[CreativeGroup],
    update: AnonAltFieldsKey => Request_[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeGroupsResource]
  }
}

