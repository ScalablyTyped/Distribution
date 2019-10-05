package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIds
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one content category by ID. */
  def get(request: Anon_AltFields): Request[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: Anon_AltFieldsKey): Request[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIds): Request[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[ContentCategory]
  /** Updates an existing content category. */
  def update(request: Anon_AltFieldsKey): Request[ContentCategory]
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[ContentCategory],
    insert: Anon_AltFieldsKey => Request[ContentCategory],
    list: Anon_AltFieldsIds => Request[ContentCategoriesListResponse],
    patch: Anon_AltFields => Request[ContentCategory],
    update: Anon_AltFieldsKey => Request[ContentCategory]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContentCategoriesResource]
  }
}

