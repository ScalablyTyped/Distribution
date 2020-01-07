package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for private clusters.
  */
@js.native
trait Schema$PrivateClusterConfig extends js.Object {
  /**
    * Whether the master&#39;s internal IP address is used as the cluster
    * endpoint.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes have internal IP addresses only. If enabled, all nodes are
    * given only RFC 1918 private addresses and communicate with the master via
    * private networking.
    */
  var enablePrivateNodes: js.UndefOr[Boolean] = js.native
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range will be used for assigning internal IP addresses to the master or
    * set of masters, as well as the ILB VIP. This range must not overlap with
    * any other ranges in use within the cluster&#39;s network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Output only. The internal IP address of this cluster&#39;s master
    * endpoint.
    */
  var privateEndpoint: js.UndefOr[String] = js.native
  /**
    * Output only. The external IP address of this cluster&#39;s master
    * endpoint.
    */
  var publicEndpoint: js.UndefOr[String] = js.native
}

object Schema$PrivateClusterConfig {
  @scala.inline
  def apply(
    enablePrivateEndpoint: js.UndefOr[Boolean] = js.undefined,
    enablePrivateNodes: js.UndefOr[Boolean] = js.undefined,
    masterIpv4CidrBlock: String = null,
    privateEndpoint: String = null,
    publicEndpoint: String = null
  ): Schema$PrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePrivateEndpoint)) __obj.updateDynamic("enablePrivateEndpoint")(enablePrivateEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePrivateNodes)) __obj.updateDynamic("enablePrivateNodes")(enablePrivateNodes.asInstanceOf[js.Any])
    if (masterIpv4CidrBlock != null) __obj.updateDynamic("masterIpv4CidrBlock")(masterIpv4CidrBlock.asInstanceOf[js.Any])
    if (privateEndpoint != null) __obj.updateDynamic("privateEndpoint")(privateEndpoint.asInstanceOf[js.Any])
    if (publicEndpoint != null) __obj.updateDynamic("publicEndpoint")(publicEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PrivateClusterConfig]
  }
}

