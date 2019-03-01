package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves details of a cluster. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  /** Updates a cluster. */
  def update(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId): gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
    ],
    insert: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutClustersListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
    ]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

