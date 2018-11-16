package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

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
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Router interfaces. Each interface requires either one linked resource (e.g. linkedVpnTunnel), or IP address and IP address range (e.g. ipRange), or
               * both.
               */
  var interfaces: js.UndefOr[js.Array[RouterInterface]] = js.undefined
  /** [Output Only] Type of resource. Always compute#router for routers. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URI of the region where the router resides. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

