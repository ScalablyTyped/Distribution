package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroring extends StObject {
  
  /**
    * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
    */
  var collectorIlb: js.UndefOr[SchemaPacketMirroringForwardingRuleInfo] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
    */
  var enable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
    */
  var filter: js.UndefOr[SchemaPacketMirroringFilter] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#packetMirroring for packet mirrorings.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
    */
  var mirroredResources: js.UndefOr[SchemaPacketMirroringMirroredResourceInfo] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
    */
  var network: js.UndefOr[SchemaPacketMirroringNetworkInfo] = js.undefined
  
  /**
    * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] URI of the region where the packetMirroring resides.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketMirroring {
  
  inline def apply(): SchemaPacketMirroring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroring]
  }
  
  extension [Self <: SchemaPacketMirroring](x: Self) {
    
    inline def setCollectorIlb(value: SchemaPacketMirroringForwardingRuleInfo): Self = StObject.set(x, "collectorIlb", value.asInstanceOf[js.Any])
    
    inline def setCollectorIlbUndefined: Self = StObject.set(x, "collectorIlb", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnable(value: String): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableNull: Self = StObject.set(x, "enable", null)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setFilter(value: SchemaPacketMirroringFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMirroredResources(value: SchemaPacketMirroringMirroredResourceInfo): Self = StObject.set(x, "mirroredResources", value.asInstanceOf[js.Any])
    
    inline def setMirroredResourcesUndefined: Self = StObject.set(x, "mirroredResources", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: SchemaPacketMirroringNetworkInfo): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
