package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.ClusterId
import typings.gapiClientAndroidenterprise.anon.PageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: ClusterId): Request[Unit] = js.native
  /** Retrieves details of a cluster. */
  def get(request: ClusterId): Request[StoreCluster] = js.native
  /** Inserts a new cluster in a page. */
  def insert(request: PageId): Request[StoreCluster] = js.native
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: PageId): Request[StoreLayoutClustersListResponse] = js.native
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: ClusterId): Request[StoreCluster] = js.native
  /** Updates a cluster. */
  def update(request: ClusterId): Request[StoreCluster] = js.native
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
  @scala.inline
  implicit class StorelayoutclustersResourceOps[Self <: StorelayoutclustersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: ClusterId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ClusterId => Request[StoreCluster]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PageId => Request[StoreCluster]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PageId => Request[StoreLayoutClustersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ClusterId => Request[StoreCluster]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ClusterId => Request[StoreCluster]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

