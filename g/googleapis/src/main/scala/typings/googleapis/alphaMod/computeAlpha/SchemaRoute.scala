package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Route resource. A route specifies how certain packets should
  * be handled by the network. Routes are associated with instances by tags and
  * the set of routes for a particular instance is called its routing table.
  * For each packet leaving an instance, the system searches that
  * instance&#39;s routing table for a single best matching route. Routes match
  * packets by destination IP address, preferring smaller or more specific
  * ranges over larger ones. If there is a tie, the system selects the route
  * with the smallest priority value. If there is still a tie, it uses the
  * layer three and four packet headers to select just one of the remaining
  * matching routes. The packet is then forwarded as specified by the nextHop
  * field of the winning route - either to another instance destination, an
  * instance gateway, or a Google Compute Engine-operated gateway.  Packets
  * that do not match any route in the sending instance&#39;s routing table are
  * dropped. (== resource_for beta.routes ==) (== resource_for v1.routes ==)
  */
trait SchemaRoute extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The destination range of outgoing packets that this route applies to.
    * Only IPv4 is supported.
    */
  var destRange: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of this resource. Always compute#routes for Route
    * resources.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Fully-qualified URL of the network that this route applies to.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to a gateway that should handle matching packets. You can only
    * specify the internet gateway using a full or partial valid URL:
    * projects/&lt;project-id&gt;/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that
    * should handle matching packets. You can only specify the forwarding rule
    * as a partial or full URL. For example, the following are all valid URLs:
    * -
    * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
    * - regions/region/forwardingRules/forwardingRule  Note that this can only
    * be used when the destination_range is a public (non-RFC 1918) IP CIDR
    * range.
    */
  var nextHopIlb: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to an instance that should handle matching packets. You can
    * specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.undefined
  
  /**
    * The network IP address of an instance that should handle matching
    * packets. Only IPv4 is supported.
    */
  var nextHopIp: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the local network if it should handle matching packets.
    */
  var nextHopNetwork: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The network peering name that should handle matching
    * packets, which should conform to RFC1035.
    */
  var nextHopPeering: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to a VpnTunnel that should handle matching packets.
    */
  var nextHopVpnTunnel: js.UndefOr[String] = js.undefined
  
  /**
    * The priority of this route. Priority is used to break ties in cases where
    * there is more than one matching route of equal prefix length. In the case
    * of two routes with equal prefix length, the one with the lowest-numbered
    * priority value wins. Default value is 1000. Valid range is 0 through
    * 65535.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of instance tags to which this route applies.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Output Only] If potential misconfigurations are detected for this route,
    * this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.undefined
}
object SchemaRoute {
  
  @scala.inline
  def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  
  @scala.inline
  implicit class SchemaRouteMutableBuilder[Self <: SchemaRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNextHopGateway(value: String): Self = StObject.set(x, "nextHopGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopGatewayUndefined: Self = StObject.set(x, "nextHopGateway", js.undefined)
    
    @scala.inline
    def setNextHopIlb(value: String): Self = StObject.set(x, "nextHopIlb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopIlbUndefined: Self = StObject.set(x, "nextHopIlb", js.undefined)
    
    @scala.inline
    def setNextHopInstance(value: String): Self = StObject.set(x, "nextHopInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopInstanceUndefined: Self = StObject.set(x, "nextHopInstance", js.undefined)
    
    @scala.inline
    def setNextHopIp(value: String): Self = StObject.set(x, "nextHopIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopIpUndefined: Self = StObject.set(x, "nextHopIp", js.undefined)
    
    @scala.inline
    def setNextHopNetwork(value: String): Self = StObject.set(x, "nextHopNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopNetworkUndefined: Self = StObject.set(x, "nextHopNetwork", js.undefined)
    
    @scala.inline
    def setNextHopPeering(value: String): Self = StObject.set(x, "nextHopPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopPeeringUndefined: Self = StObject.set(x, "nextHopPeering", js.undefined)
    
    @scala.inline
    def setNextHopVpnTunnel(value: String): Self = StObject.set(x, "nextHopVpnTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHopVpnTunnelUndefined: Self = StObject.set(x, "nextHopVpnTunnel", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
