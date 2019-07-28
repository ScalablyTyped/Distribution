package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * A [cluster
    * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
    */
  var cluster: js.UndefOr[Cluster] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(cluster: Cluster = null): CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

