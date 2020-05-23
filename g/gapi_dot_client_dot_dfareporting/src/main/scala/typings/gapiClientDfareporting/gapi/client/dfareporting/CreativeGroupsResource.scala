package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.GroupNumber
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: Fields): Request[CreativeGroup]
  /** Inserts a new creative group. */
  def insert(request: Key): Request[CreativeGroup]
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: GroupNumber): Request[CreativeGroupsListResponse]
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeGroup]
  /** Updates an existing creative group. */
  def update(request: Key): Request[CreativeGroup]
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[CreativeGroup],
    insert: Key => Request[CreativeGroup],
    list: GroupNumber => Request[CreativeGroupsListResponse],
    patch: Fields => Request[CreativeGroup],
    update: Key => Request[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeGroupsResource]
  }
}

