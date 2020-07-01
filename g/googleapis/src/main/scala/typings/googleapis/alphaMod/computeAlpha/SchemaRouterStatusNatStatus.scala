package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of a NAT contained in this router. Next tag: 9
  */
@js.native
trait SchemaRouterStatusNatStatus extends js.Object {
  /**
    * A list of IPs auto-allocated for NAT. Example: [&quot;1.1.1.1&quot;,
    * &quot;129.2.16.89&quot;]
    */
  var autoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs auto-allocated for NAT that are in drain mode. Example:
    * [&quot;1.1.1.1&quot;, ?179.12.26.133?].
    */
  var drainAutoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs user-allocated for NAT that are in drain mode. Example:
    * [&quot;1.1.1.1&quot;, ?179.12.26.133?].
    */
  var drainUserAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if
    * user-specified IPs are NOT enough to allow all configured VMs to use NAT.
    * This value is meaningful only when auto-allocation of NAT IPs is *not*
    * used.
    */
  var minExtraNatIpsNeeded: js.UndefOr[Double] = js.native
  /**
    * Unique name of this NAT.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of VM endpoints (i.e., Nics) that can use NAT.
    */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double] = js.native
  /**
    * A list of fully qualified URLs of reserved IP address resources.
    */
  var userAllocatedNatIpResources: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs user-allocated for NAT. They will be raw IP strings like
    * &quot;179.12.26.133&quot;.
    */
  var userAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRouterStatusNatStatus {
  @scala.inline
  def apply(
    autoAllocatedNatIps: js.Array[String] = null,
    drainAutoAllocatedNatIps: js.Array[String] = null,
    drainUserAllocatedNatIps: js.Array[String] = null,
    minExtraNatIpsNeeded: js.UndefOr[Double] = js.undefined,
    name: String = null,
    numVmEndpointsWithNatMappings: js.UndefOr[Double] = js.undefined,
    userAllocatedNatIpResources: js.Array[String] = null,
    userAllocatedNatIps: js.Array[String] = null
  ): SchemaRouterStatusNatStatus = {
    val __obj = js.Dynamic.literal()
    if (autoAllocatedNatIps != null) __obj.updateDynamic("autoAllocatedNatIps")(autoAllocatedNatIps.asInstanceOf[js.Any])
    if (drainAutoAllocatedNatIps != null) __obj.updateDynamic("drainAutoAllocatedNatIps")(drainAutoAllocatedNatIps.asInstanceOf[js.Any])
    if (drainUserAllocatedNatIps != null) __obj.updateDynamic("drainUserAllocatedNatIps")(drainUserAllocatedNatIps.asInstanceOf[js.Any])
    if (!js.isUndefined(minExtraNatIpsNeeded)) __obj.updateDynamic("minExtraNatIpsNeeded")(minExtraNatIpsNeeded.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numVmEndpointsWithNatMappings)) __obj.updateDynamic("numVmEndpointsWithNatMappings")(numVmEndpointsWithNatMappings.get.asInstanceOf[js.Any])
    if (userAllocatedNatIpResources != null) __obj.updateDynamic("userAllocatedNatIpResources")(userAllocatedNatIpResources.asInstanceOf[js.Any])
    if (userAllocatedNatIps != null) __obj.updateDynamic("userAllocatedNatIps")(userAllocatedNatIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouterStatusNatStatus]
  }
}

