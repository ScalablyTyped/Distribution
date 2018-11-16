package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Network extends js.Object {
  /**
               * The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client
               * when the network is created.
               */
  var IPv4Range: js.UndefOr[java.lang.String] = js.undefined
  /**
               * When set to true, the network is created in "auto subnet mode". When set to false, the network is in "custom subnet mode".
               *
               * In "auto subnet mode", a newly created network is assigned the default CIDR of 10.128.0.0/9 and it automatically creates one subnetwork per region.
               */
  var autoCreateSubnetworks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A gateway address for default routing to other networks. This value is read only and is selected by the Google Compute Engine, typically as the first
               * usable address in the IPv4Range.
               */
  var gatewayIPv4: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#network for networks. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] List of network peerings for the resource. */
  var peerings: js.UndefOr[js.Array[NetworkPeering]] = js.undefined
  /** The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce. */
  var routingConfig: js.UndefOr[NetworkRoutingConfig] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URLs for all subnetworks in this network. */
  var subnetworks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

