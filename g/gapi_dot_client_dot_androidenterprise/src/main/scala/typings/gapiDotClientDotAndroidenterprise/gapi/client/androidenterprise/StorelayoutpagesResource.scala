package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFields
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[Unit]
  /** Retrieves details of a store page. */
  def get(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[StorePage]
  /** Inserts a new store page. */
  def insert(request: Anon_AltEnterpriseIdFields): Request[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: Anon_AltEnterpriseIdFields): Request[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[StorePage]
  /** Updates the content of a store page. */
  def update(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[Unit],
    get: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[StorePage],
    insert: Anon_AltEnterpriseIdFields => Request[StorePage],
    list: Anon_AltEnterpriseIdFields => Request[StoreLayoutPagesListResponse],
    patch: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[StorePage],
    update: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

