package typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a found unused range.
  */
@js.native
trait Schema$Range extends js.Object {
  /**
    * CIDR range in &quot;10.x.x.x/y&quot; format that is within the allocated
    * ranges and currently unused.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * In the Shared VPC host project, the VPC network that&#39;s peered with
    * the consumer network. For example:
    * `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String] = js.native
}

object Schema$Range {
  @scala.inline
  def apply(ipCidrRange: String = null, network: String = null): Schema$Range = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Range]
  }
}

