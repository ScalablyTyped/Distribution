package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonKey
import typings.gapiClientAndroidenterprise.AnonPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: AnonPageId): Request_[Unit]
  /** Retrieves details of a store page. */
  def get(request: AnonPageId): Request_[StorePage]
  /** Inserts a new store page. */
  def insert(request: AnonKey): Request_[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: AnonKey): Request_[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: AnonPageId): Request_[StorePage]
  /** Updates the content of a store page. */
  def update(request: AnonPageId): Request_[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: AnonPageId => Request_[Unit],
    get: AnonPageId => Request_[StorePage],
    insert: AnonKey => Request_[StorePage],
    list: AnonKey => Request_[StoreLayoutPagesListResponse],
    patch: AnonPageId => Request_[StorePage],
    update: AnonPageId => Request_[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

