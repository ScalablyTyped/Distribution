package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdId
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: Fields): Request[Unit]
  /** Gets one event tag by ID. */
  def get(request: Fields): Request[EventTag]
  /** Inserts a new event tag. */
  def insert(request: Key): Request[EventTag]
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: AdId): Request[EventTagsListResponse]
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: Fields): Request[EventTag]
  /** Updates an existing event tag. */
  def update(request: Key): Request[EventTag]
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[EventTag],
    insert: Key => Request[EventTag],
    list: AdId => Request[EventTagsListResponse],
    patch: Fields => Request[EventTag],
    update: Key => Request[EventTag]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventTagsResource]
  }
}

