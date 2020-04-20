package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonGroupNumber
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: AnonFields): Request_[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: AnonKey): Request_[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: AnonGroupNumber): Request_[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: AnonKey): Request_[CreativeGroup]
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[CreativeGroup],
    insert: AnonKey => Request_[CreativeGroup],
    list: AnonGroupNumber => Request_[CreativeGroupsListResponse],
    patch: AnonFields => Request_[CreativeGroup],
    update: AnonKey => Request_[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeGroupsResource]
  }
}

