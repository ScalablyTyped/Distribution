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
    delete: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
    ],
    insert: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutPagesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StorePage]
    ]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
}

