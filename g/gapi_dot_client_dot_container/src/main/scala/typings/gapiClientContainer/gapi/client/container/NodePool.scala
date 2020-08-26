package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePool extends js.Object {
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled
    * only if a valid configuration is present.
    */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  /** The node configuration of the pool. */
  var config: js.UndefOr[NodeConfig] = js.native
  /**
    * The initial node count for the pool. You must ensure that your
    * Compute Engine <a href="/compute/docs/resource-quotas">resource quota</a>
    * is sufficient for this number of instances. You must also have available
    * firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /** NodeManagement configuration for this NodePool. */
  var management: js.UndefOr[NodeManagement] = js.native
  /** The name of the node pool. */
  var name: js.UndefOr[String] = js.native
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** [Output only] The status of the nodes in this pool instance. */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /** [Output only] The version of the Kubernetes of this node. */
  var version: js.UndefOr[String] = js.native
}

object NodePool {
  @scala.inline
  def apply(): NodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePool]
  }
  @scala.inline
  implicit class NodePoolOps[Self <: NodePool] (val x: Self) extends AnyVal {
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
    def setAutoscaling(value: NodePoolAutoscaling): Self = this.set("autoscaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscaling: Self = this.set("autoscaling", js.undefined)
    @scala.inline
    def setConfig(value: NodeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setInitialNodeCount(value: Double): Self = this.set("initialNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialNodeCount: Self = this.set("initialNodeCount", js.undefined)
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = this.set("instanceGroupUrls", js.Array(value :_*))
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = this.set("instanceGroupUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupUrls: Self = this.set("instanceGroupUrls", js.undefined)
    @scala.inline
    def setManagement(value: NodeManagement): Self = this.set("management", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagement: Self = this.set("management", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

