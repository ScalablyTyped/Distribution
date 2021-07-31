package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of network endpoints.
  */
trait SchemaNetworkEndpointGroup extends StObject {
  
  /**
    * Metadata defined as annotations on the network endpoint group.
    */
  var annotations: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The default port used if the port number is not specified in the network
    * endpoint.
    */
  var defaultPort: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#networkEndpointGroup
    * for network endpoint group.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * This field is only valid when the network endpoint group is used for load
    * balancing. [Deprecated] This field is deprecated.
    */
  var loadBalancer: js.UndefOr[SchemaNetworkEndpointGroupLbNetworkEndpointGroup] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the network to which all network endpoints in the NEG belong.
    * Uses &quot;default&quot; project network if unspecified.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Type of network endpoints in this network endpoint group. Currently the
    * only supported value is GCE_VM_IP_PORT.
    */
  var networkEndpointType: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] Number of network endpoints in the network endpoint group.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG
    * belong.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the type of this network endpoint group. Only LOAD_BALANCING is
    * valid for now.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the network endpoint group is
    * located.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaNetworkEndpointGroup {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroup]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupMutableBuilder[Self <: SchemaNetworkEndpointGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultPort(value: Double): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLoadBalancer(value: SchemaNetworkEndpointGroupLbNetworkEndpointGroup): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointType(value: String): Self = StObject.set(x, "networkEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointTypeUndefined: Self = StObject.set(x, "networkEndpointType", js.undefined)
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
