package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltClusterId
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: Anon_AltClusterId): Request[Unit]
  /** Retrieves details of a cluster. */
  def get(request: Anon_AltClusterId): Request[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId): Request[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: Anon_AltClusterId): Request[StoreCluster]
  /** Updates a cluster. */
  def update(request: Anon_AltClusterId): Request[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: Anon_AltClusterId => Request[Unit],
    get: Anon_AltClusterId => Request[StoreCluster],
    insert: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[StoreCluster],
    list: Anon_AltEnterpriseIdFieldsKeyOauthtokenPageId => Request[StoreLayoutClustersListResponse],
    patch: Anon_AltClusterId => Request[StoreCluster],
    update: Anon_AltClusterId => Request[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

