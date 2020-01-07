package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkConfig reports the relative names of network &amp; subnetwork.
  */
@js.native
trait Schema$NetworkConfig extends js.Object {
  /**
    * Whether Intra-node visibility is enabled for this cluster. This makes
    * same node pod to pod traffic visible for VPC network.
    */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The relative name of the Google Compute Engine
    * network(/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. Example:
    * projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The relative name of the Google Compute Engine
    * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
    * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object Schema$NetworkConfig {
  @scala.inline
  def apply(
    enableIntraNodeVisibility: js.UndefOr[Boolean] = js.undefined,
    network: String = null,
    subnetwork: String = null
  ): Schema$NetworkConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableIntraNodeVisibility)) __obj.updateDynamic("enableIntraNodeVisibility")(enableIntraNodeVisibility.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkConfig]
  }
}

