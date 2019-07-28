package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  /** BGP information specific to this router. */
  var bgp: js.UndefOr[RouterBgp] = js.undefined
  /**
    * BGP information that needs to be configured into the routing stack to establish the BGP peering. It must specify peer ASN and either interface name,
    * IP, or peer IP. Please refer to RFC4273.
    */
  var bgpPeers: js.UndefOr[js.Array[RouterBgpPeer]] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Router interfaces. Each interface requires either one linked resource (e.g. linkedVpnTunnel), or IP address and IP address range (e.g. ipRange), or
    * both.
    */
  var interfaces: js.UndefOr[js.Array[RouterInterface]] = js.undefined
  /** [Output Only] Type of resource. Always compute#router for routers. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[String] = js.undefined
  /** [Output Only] URI of the region where the router resides. */
  var region: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Router {
  @scala.inline
  def apply(
    bgp: RouterBgp = null,
    bgpPeers: js.Array[RouterBgpPeer] = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    interfaces: js.Array[RouterInterface] = null,
    kind: String = null,
    name: String = null,
    network: String = null,
    region: String = null,
    selfLink: String = null
  ): Router = {
    val __obj = js.Dynamic.literal()
    if (bgp != null) __obj.updateDynamic("bgp")(bgp)
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Router]
  }
}

