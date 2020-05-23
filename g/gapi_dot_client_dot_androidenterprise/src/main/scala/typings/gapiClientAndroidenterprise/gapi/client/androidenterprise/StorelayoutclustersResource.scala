package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.ClusterId
import typings.gapiClientAndroidenterprise.anon.PageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: ClusterId): Request[Unit]
  /** Retrieves details of a cluster. */
  def get(request: ClusterId): Request[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: PageId): Request[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: PageId): Request[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: ClusterId): Request[StoreCluster]
  /** Updates a cluster. */
  def update(request: ClusterId): Request[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: ClusterId => Request[Unit],
    get: ClusterId => Request[StoreCluster],
    insert: PageId => Request[StoreCluster],
    list: PageId => Request[StoreLayoutClustersListResponse],
    patch: ClusterId => Request[StoreCluster],
    update: ClusterId => Request[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

