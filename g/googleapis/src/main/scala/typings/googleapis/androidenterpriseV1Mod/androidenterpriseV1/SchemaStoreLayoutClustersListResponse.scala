package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The store page resources for the enterprise.
  */
@js.native
trait SchemaStoreLayoutClustersListResponse extends js.Object {
  /**
    * A store cluster of an enterprise.
    */
  var cluster: js.UndefOr[js.Array[SchemaStoreCluster]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutClustersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaStoreLayoutClustersListResponse {
  @scala.inline
  def apply(cluster: js.Array[SchemaStoreCluster] = null, kind: String = null): SchemaStoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStoreLayoutClustersListResponse]
  }
}

