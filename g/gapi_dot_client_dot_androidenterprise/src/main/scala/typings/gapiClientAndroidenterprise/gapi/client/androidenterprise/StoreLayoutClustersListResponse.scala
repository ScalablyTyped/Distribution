package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreLayoutClustersListResponse extends js.Object {
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutClustersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object StoreLayoutClustersListResponse {
  @scala.inline
  def apply(cluster: js.Array[StoreCluster] = null, kind: String = null): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
}

