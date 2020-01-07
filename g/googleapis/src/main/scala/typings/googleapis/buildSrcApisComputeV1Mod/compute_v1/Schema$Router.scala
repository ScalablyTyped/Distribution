package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Router resource.
  */
@js.native
trait Schema$Router extends js.Object {
  /**
    * BGP information specific to this router.
    */
  var bgp: js.UndefOr[Schema$RouterBgp] = js.native
  /**
    * BGP information that needs to be configured into the routing stack to
    * establish the BGP peering. It must specify peer ASN and either interface
    * name, IP, or peer IP. Please refer to RFC4273.
    */
  var bgpPeers: js.UndefOr[js.Array[Schema$RouterBgpPeer]] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Router interfaces. Each interface requires either one linked resource
    * (e.g. linkedVpnTunnel), or IP address and IP address range (e.g.
    * ipRange), or both.
    */
  var interfaces: js.UndefOr[js.Array[Schema$RouterInterface]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#router for routers.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of Nat services created in this router.
    */
  var nats: js.UndefOr[js.Array[Schema$RouterNat]] = js.native
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * [Output Only] URI of the region where the router resides. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Router {
  @scala.inline
  def apply(
    bgp: Schema$RouterBgp = null,
    bgpPeers: js.Array[Schema$RouterBgpPeer] = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    interfaces: js.Array[Schema$RouterInterface] = null,
    kind: String = null,
    name: String = null,
    nats: js.Array[Schema$RouterNat] = null,
    network: String = null,
    region: String = null,
    selfLink: String = null
  ): Schema$Router = {
    val __obj = js.Dynamic.literal()
    if (bgp != null) __obj.updateDynamic("bgp")(bgp.asInstanceOf[js.Any])
    if (bgpPeers != null) __obj.updateDynamic("bgpPeers")(bgpPeers.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nats != null) __obj.updateDynamic("nats")(nats.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Router]
  }
}

