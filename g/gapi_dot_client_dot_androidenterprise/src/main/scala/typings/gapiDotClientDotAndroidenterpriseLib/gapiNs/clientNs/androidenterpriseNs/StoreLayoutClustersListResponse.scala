package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreLayoutClustersListResponse extends js.Object {
  /** A store cluster of an enterprise. */
  var cluster: js.UndefOr[js.Array[StoreCluster]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeLayoutClustersListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object StoreLayoutClustersListResponse {
  @scala.inline
  def apply(cluster: js.Array[StoreCluster] = null, kind: java.lang.String = null): StoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[StoreLayoutClustersListResponse]
  }
}

