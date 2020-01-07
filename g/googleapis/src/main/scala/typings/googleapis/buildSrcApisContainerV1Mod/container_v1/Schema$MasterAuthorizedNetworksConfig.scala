package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the master authorized networks feature. Enabled
  * master authorized networks will disallow all external traffic to access
  * Kubernetes master through HTTPS except traffic from the given CIDR blocks,
  * Google Compute Engine Public IPs and Google Prod IPs.
  */
@js.native
trait Schema$MasterAuthorizedNetworksConfig extends js.Object {
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[Schema$CidrBlock]] = js.native
  /**
    * Whether or not master authorized networks is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$MasterAuthorizedNetworksConfig {
  @scala.inline
  def apply(cidrBlocks: js.Array[Schema$CidrBlock] = null, enabled: js.UndefOr[Boolean] = js.undefined): Schema$MasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MasterAuthorizedNetworksConfig]
  }
}

