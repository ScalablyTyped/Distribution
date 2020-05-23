package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Key
import typings.gapiClientAndroidenterprise.anon.PageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: PageId): Request[Unit]
  /** Retrieves details of a store page. */
  def get(request: PageId): Request[StorePage]
  /** Inserts a new store page. */
  def insert(request: Key): Request[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: Key): Request[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: PageId): Request[StorePage]
  /** Updates the content of a store page. */
  def update(request: PageId): Request[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: PageId => Request[Unit],
    get: PageId => Request[StorePage],
    insert: Key => Request[StorePage],
    list: Key => Request[StoreLayoutPagesListResponse],
    patch: PageId => Request[StorePage],
    update: PageId => Request[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

