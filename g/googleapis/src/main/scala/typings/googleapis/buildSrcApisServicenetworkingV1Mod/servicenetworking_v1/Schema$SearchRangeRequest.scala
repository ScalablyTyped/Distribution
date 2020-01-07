package typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for an unused range within allocated ranges.
  */
@js.native
trait Schema$SearchRangeRequest extends js.Object {
  /**
    * Required. The prefix length of the IP range. Use usual CIDR range
    * notation. For example, &#39;30&#39; to find unused x.x.x.x/30 CIDR range.
    * Actual range will be determined using allocated range for the consumer
    * peered network and returned in the result.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  /**
    * Network name in the consumer project.   This network must have been
    * already peered with a shared VPC network using CreateConnection method.
    * Must be in a form &#39;projects/{project}/global/networks/{network}&#39;.
    * {project} is a project number, as in &#39;12345&#39; {network} is network
    * name.
    */
  var network: js.UndefOr[String] = js.native
}

object Schema$SearchRangeRequest {
  @scala.inline
  def apply(ipPrefixLength: Int | Double = null, network: String = null): Schema$SearchRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (ipPrefixLength != null) __obj.updateDynamic("ipPrefixLength")(ipPrefixLength.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchRangeRequest]
  }
}

