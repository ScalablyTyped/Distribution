package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: Fields): Request[Unit]
  /** Gets one content category by ID. */
  def get(request: Fields): Request[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: Key): Request[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: Fields): Request[ContentCategory]
  /** Updates an existing content category. */
  def update(request: Key): Request[ContentCategory]
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[ContentCategory],
    insert: Key => Request[ContentCategory],
    list: Oauthtoken => Request[ContentCategoriesListResponse],
    patch: Fields => Request[ContentCategory],
    update: Key => Request[ContentCategory]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ContentCategoriesResource]
  }
}

