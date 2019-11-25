package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterAuthorizedNetworksConfig extends js.Object {
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[CidrBlock]] = js.undefined
  /** Whether or not master authorized networks is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object MasterAuthorizedNetworksConfig {
  @scala.inline
  def apply(cidrBlocks: js.Array[CidrBlock] = null, enabled: js.UndefOr[Boolean] = js.undefined): MasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterAuthorizedNetworksConfig]
  }
}

