package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a store page. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Inserts a new store page. */
  def insert(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Retrieves the details of all pages in the store. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields): gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutPagesListResponse]
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  /** Updates the content of a store page. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[StorePage],
    insert: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields => gapiDotClientLib.gapiNs.clientNs.Request[StorePage],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields => gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutPagesListResponse],
    patch: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[StorePage],
    update: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

