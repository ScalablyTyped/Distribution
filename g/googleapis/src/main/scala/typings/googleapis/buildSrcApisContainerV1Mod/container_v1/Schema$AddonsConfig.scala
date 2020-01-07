package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the addons that can be automatically spun up in the
  * cluster, enabling additional functionality.
  */
@js.native
trait Schema$AddonsConfig extends js.Object {
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases
    * or decreases the number of replica pods a replication controller has
    * based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[Schema$HorizontalPodAutoscaling] = js.native
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which
    * makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[Schema$HttpLoadBalancing] = js.native
  /**
    * Configuration for the Kubernetes Dashboard.
    */
  var kubernetesDashboard: js.UndefOr[Schema$KubernetesDashboard] = js.native
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon is
    * enabled or not on the Master, it does not track whether network policy is
    * enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[Schema$NetworkPolicyConfig] = js.native
}

object Schema$AddonsConfig {
  @scala.inline
  def apply(
    horizontalPodAutoscaling: Schema$HorizontalPodAutoscaling = null,
    httpLoadBalancing: Schema$HttpLoadBalancing = null,
    kubernetesDashboard: Schema$KubernetesDashboard = null,
    networkPolicyConfig: Schema$NetworkPolicyConfig = null
  ): Schema$AddonsConfig = {
    val __obj = js.Dynamic.literal()
    if (horizontalPodAutoscaling != null) __obj.updateDynamic("horizontalPodAutoscaling")(horizontalPodAutoscaling.asInstanceOf[js.Any])
    if (httpLoadBalancing != null) __obj.updateDynamic("httpLoadBalancing")(httpLoadBalancing.asInstanceOf[js.Any])
    if (kubernetesDashboard != null) __obj.updateDynamic("kubernetesDashboard")(kubernetesDashboard.asInstanceOf[js.Any])
    if (networkPolicyConfig != null) __obj.updateDynamic("networkPolicyConfig")(networkPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddonsConfig]
  }
}

