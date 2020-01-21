package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsIds
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one content category by ID. */
  def get(request: AnonAltFields): Request_[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: AnonAltFieldsKey): Request_[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIds): Request_[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[ContentCategory]
  /** Updates an existing content category. */
  def update(request: AnonAltFieldsKey): Request_[ContentCategory]
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[ContentCategory],
    insert: AnonAltFieldsKey => Request_[ContentCategory],
    list: AnonAltFieldsIds => Request_[ContentCategoriesListResponse],
    patch: AnonAltFields => Request_[ContentCategory],
    update: AnonAltFieldsKey => Request_[ContentCategory]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContentCategoriesResource]
  }
}

