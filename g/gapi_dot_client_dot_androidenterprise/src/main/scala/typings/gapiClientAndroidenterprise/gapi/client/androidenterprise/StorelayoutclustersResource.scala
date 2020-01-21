package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAltClusterId
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: AnonAltClusterId): Request_[Unit]
  /** Retrieves details of a cluster. */
  def get(request: AnonAltClusterId): Request_[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId): Request_[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: AnonAltClusterId): Request_[StoreCluster]
  /** Updates a cluster. */
  def update(request: AnonAltClusterId): Request_[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: AnonAltClusterId => Request_[Unit],
    get: AnonAltClusterId => Request_[StoreCluster],
    insert: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[StoreCluster],
    list: AnonAltEnterpriseIdFieldsKeyOauthtokenPageId => Request_[StoreLayoutClustersListResponse],
    patch: AnonAltClusterId => Request_[StoreCluster],
    update: AnonAltClusterId => Request_[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

