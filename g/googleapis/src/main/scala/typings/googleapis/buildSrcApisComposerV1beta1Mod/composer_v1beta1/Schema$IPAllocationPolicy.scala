package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for controlling how IPs are allocated in the GKE cluster.
  */
@js.native
trait Schema$IPAllocationPolicy extends js.Object {
  /**
    * Optional. The IP address range used to allocate IP addresses to pods in
    * the cluster.  This field is applicable only when `use_ip_aliases` is
    * true.  Set to blank to have GKE choose a range with the default size. Set
    * to /netmask (e.g. `/14`) to have GKE choose a range with a specific
    * netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use. Specify `cluster_secondary_range_name` or
    * `cluster_ipv4_cidr_block` but not both.
    */
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the cluster&#39;s secondary range used to allocate
    * IP addresses to pods. Specify either `cluster_secondary_range_name` or
    * `cluster_ipv4_cidr_block` but not both.  This field is applicable only
    * when `use_ip_aliases` is true.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.native
  /**
    * Optional. The IP address range of the services IP addresses in this
    * cluster.  This field is applicable only when `use_ip_aliases` is true.
    * Set to blank to have GKE choose a range with the default size.  Set to
    * /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
    * Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use. Specify `services_secondary_range_name` or
    * `services_ipv4_cidr_block` but not both.
    */
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the services&#39; secondary range used to allocate
    * IP addresses to the cluster. Specify either
    * `services_secondary_range_name` or `services_ipv4_cidr_block` but not
    * both.  This field is applicable only when `use_ip_aliases` is true.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.native
  /**
    * Optional. Whether or not to enable Alias IPs in the GKE cluster. If
    * `true`, a VPC-native cluster is created.
    */
  var useIpAliases: js.UndefOr[Boolean] = js.native
}

object Schema$IPAllocationPolicy {
  @scala.inline
  def apply(
    clusterIpv4CidrBlock: String = null,
    clusterSecondaryRangeName: String = null,
    servicesIpv4CidrBlock: String = null,
    servicesSecondaryRangeName: String = null,
    useIpAliases: js.UndefOr[Boolean] = js.undefined
  ): Schema$IPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    if (clusterIpv4CidrBlock != null) __obj.updateDynamic("clusterIpv4CidrBlock")(clusterIpv4CidrBlock.asInstanceOf[js.Any])
    if (clusterSecondaryRangeName != null) __obj.updateDynamic("clusterSecondaryRangeName")(clusterSecondaryRangeName.asInstanceOf[js.Any])
    if (servicesIpv4CidrBlock != null) __obj.updateDynamic("servicesIpv4CidrBlock")(servicesIpv4CidrBlock.asInstanceOf[js.Any])
    if (servicesSecondaryRangeName != null) __obj.updateDynamic("servicesSecondaryRangeName")(servicesSecondaryRangeName.asInstanceOf[js.Any])
    if (!js.isUndefined(useIpAliases)) __obj.updateDynamic("useIpAliases")(useIpAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IPAllocationPolicy]
  }
}

