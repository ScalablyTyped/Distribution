package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreLayoutClustersListResponse extends js.Object {
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutClustersListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object StoreLayoutClustersListResponse {
  @scala.inline
  def apply(): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
  @scala.inline
  implicit class StoreLayoutClustersListResponseOps[Self <: StoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
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
    def setClusterVarargs(value: StoreCluster*): Self = this.set("cluster", js.Array(value :_*))
    @scala.inline
    def setCluster(value: js.Array[StoreCluster]): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

