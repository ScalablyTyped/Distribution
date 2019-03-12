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
    delete: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId => gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster],
    insert: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[StoreLayoutClustersListResponse],
    patch: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId => gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster],
    update: gapiDotClientDotAndroidenterpriseLib.Anon_AltClusterId => gapiDotClientLib.gapiNs.clientNs.Request[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

