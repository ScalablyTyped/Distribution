package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonClusterId
import typings.gapiClientAndroidenterprise.AnonPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: AnonClusterId): Request_[Unit]
  /** Retrieves details of a cluster. */
  def get(request: AnonClusterId): Request_[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: AnonPageId): Request_[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: AnonPageId): Request_[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: AnonClusterId): Request_[StoreCluster]
  /** Updates a cluster. */
  def update(request: AnonClusterId): Request_[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: AnonClusterId => Request_[Unit],
    get: AnonClusterId => Request_[StoreCluster],
    insert: AnonPageId => Request_[StoreCluster],
    list: AnonPageId => Request_[StoreLayoutClustersListResponse],
    patch: AnonClusterId => Request_[StoreCluster],
    update: AnonClusterId => Request_[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

