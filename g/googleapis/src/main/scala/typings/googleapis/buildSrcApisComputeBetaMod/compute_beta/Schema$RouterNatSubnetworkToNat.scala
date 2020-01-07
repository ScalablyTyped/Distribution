package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the IP ranges that want to use NAT for a subnetwork.
  */
@js.native
trait Schema$RouterNatSubnetworkToNat extends js.Object {
  /**
    * URL for the subnetwork resource to use NAT.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of the secondary ranges of the Subnetwork that are allowed to use
    * NAT. This can be populated only if
    * &quot;LIST_OF_SECONDARY_IP_RANGES&quot; is one of the values in
    * source_ip_ranges_to_nat.
    */
  var secondaryIpRangeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the options for NAT ranges in the Subnetwork. All usages of
    * single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only
    * valid option with multiple values is: [&quot;PRIMARY_IP_RANGE&quot;,
    * &quot;LIST_OF_SECONDARY_IP_RANGES&quot;] Default: [ALL_IP_RANGES]
    */
  var sourceIpRangesToNat: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RouterNatSubnetworkToNat {
  @scala.inline
  def apply(
    name: String = null,
    secondaryIpRangeNames: js.Array[String] = null,
    sourceIpRangesToNat: js.Array[String] = null
  ): Schema$RouterNatSubnetworkToNat = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (secondaryIpRangeNames != null) __obj.updateDynamic("secondaryIpRangeNames")(secondaryIpRangeNames.asInstanceOf[js.Any])
    if (sourceIpRangesToNat != null) __obj.updateDynamic("sourceIpRangesToNat")(sourceIpRangesToNat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterNatSubnetworkToNat]
  }
}

