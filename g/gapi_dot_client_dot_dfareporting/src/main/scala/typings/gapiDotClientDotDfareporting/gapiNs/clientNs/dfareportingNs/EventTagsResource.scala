package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdId
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one event tag by ID. */
  def get(request: Anon_AltFields): Request[EventTag]
  /** Inserts a new event tag. */
  def insert(request: Anon_AltFieldsKey): Request[EventTag]
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: Anon_AdId): Request[EventTagsListResponse]
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[EventTag]
  /** Updates an existing event tag. */
  def update(request: Anon_AltFieldsKey): Request[EventTag]
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[EventTag],
    insert: Anon_AltFieldsKey => Request[EventTag],
    list: Anon_AdId => Request[EventTagsListResponse],
    patch: Anon_AltFields => Request[EventTag],
    update: Anon_AltFieldsKey => Request[EventTag]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EventTagsResource]
  }
}

