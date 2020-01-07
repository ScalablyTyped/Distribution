package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.CreateCluster.
  */
@js.native
trait Schema$CreateClusterRequest extends js.Object {
  /**
    * The cluster to be created. Fields marked `OutputOnly` must be left blank.
    */
  var cluster: js.UndefOr[Schema$Cluster] = js.native
  /**
    * The ID to be used when referring to the new cluster within its instance,
    * e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The unique name of the instance in which to create the new cluster.
    * Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}

object Schema$CreateClusterRequest {
  @scala.inline
  def apply(cluster: Schema$Cluster = null, clusterId: String = null, parent: String = null): Schema$CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateClusterRequest]
  }
}

