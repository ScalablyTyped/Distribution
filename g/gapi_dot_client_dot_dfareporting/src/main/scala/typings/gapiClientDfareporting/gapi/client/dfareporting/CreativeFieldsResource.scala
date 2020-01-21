package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIds
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one creative field by ID. */
  def get(request: AnonAltFields): Request_[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: AnonAltFieldsKey): Request_[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIds): Request_[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[CreativeField]
  /** Updates an existing creative field. */
  def update(request: AnonAltFieldsKey): Request_[CreativeField]
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[CreativeField],
    insert: AnonAltFieldsKey => Request_[CreativeField],
    list: AnonAdvertiserIds => Request_[CreativeFieldsListResponse],
    patch: AnonAltFields => Request_[CreativeField],
    update: AnonAltFieldsKey => Request_[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CreativeFieldsResource]
  }
}

