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
  def apply(): SchemaStoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutClustersListResponse]
  }
  @scala.inline
  implicit class SchemaStoreLayoutClustersListResponseOps[Self <: SchemaStoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
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
    def setClusterVarargs(value: SchemaStoreCluster*): Self = this.set("cluster", js.Array(value :_*))
    @scala.inline
    def setCluster(value: js.Array[SchemaStoreCluster]): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

