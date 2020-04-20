package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one content category by ID. */
  def get(request: AnonFields): Request_[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: AnonKey): Request_[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[ContentCategory]
  /** Updates an existing content category. */
  def update(request: AnonKey): Request_[ContentCategory]
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[ContentCategory],
    insert: AnonKey => Request_[ContentCategory],
    list: AnonOauthtoken => Request_[ContentCategoriesListResponse],
    patch: AnonFields => Request_[ContentCategory],
    update: AnonKey => Request_[ContentCategory]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ContentCategoriesResource]
  }
}

