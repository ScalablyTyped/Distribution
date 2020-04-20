package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonSearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one creative field by ID. */
  def get(request: AnonFields): Request_[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: AnonKey): Request_[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: AnonSearchString): Request_[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[CreativeField]
  /** Updates an existing creative field. */
  def update(request: AnonKey): Request_[CreativeField]
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[CreativeField],
    insert: AnonKey => Request_[CreativeField],
    list: AnonSearchString => Request_[CreativeFieldsListResponse],
    patch: AnonFields => Request_[CreativeField],
    update: AnonKey => Request_[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldsResource]
  }
}

