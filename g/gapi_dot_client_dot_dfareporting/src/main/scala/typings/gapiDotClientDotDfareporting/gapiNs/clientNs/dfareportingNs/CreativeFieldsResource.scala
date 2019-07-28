package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIds
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one creative field by ID. */
  def get(request: Anon_AltFields): Request[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: Anon_AltFieldsKey): Request[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIds): Request[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[CreativeField]
  /** Updates an existing creative field. */
  def update(request: Anon_AltFieldsKey): Request[CreativeField]
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[CreativeField],
    insert: Anon_AltFieldsKey => Request[CreativeField],
    list: Anon_AdvertiserIds => Request[CreativeFieldsListResponse],
    patch: Anon_AltFields => Request[CreativeField],
    update: Anon_AltFieldsKey => Request[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeFieldsResource]
  }
}

