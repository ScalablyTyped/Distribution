package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroup extends StObject {
  
  /**
    * Metadata defined as annotations on the network endpoint group.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
    */
  var appEngine: js.UndefOr[SchemaNetworkEndpointGroupAppEngine] = js.undefined
  
  /**
    * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
    */
  var cloudFunction: js.UndefOr[SchemaNetworkEndpointGroupCloudFunction] = js.undefined
  
  /**
    * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
    */
  var cloudRun: js.UndefOr[SchemaNetworkEndpointGroupCloudRun] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default port used if the port number is not specified in the network endpoint.
    */
  var defaultPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is only valid when the network endpoint group is used for load balancing. [Deprecated] This field is deprecated.
    */
  var loadBalancer: js.UndefOr[SchemaNetworkEndpointGroupLbNetworkEndpointGroup] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP, GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
    */
  var networkEndpointType: js.UndefOr[String | Null] = js.undefined
  
  var pscData: js.UndefOr[SchemaNetworkEndpointGroupPscData] = js.undefined
  
  /**
    * The target service url used to set up private service connection to a Google API or a PSC Producer Service Attachment. An example value is: "asia-northeast3-cloudkms.googleapis.com"
    */
  var pscTargetService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the region where the network endpoint group is located.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
    */
  var serverlessDeployment: js.UndefOr[SchemaNetworkEndpointGroupServerlessDeployment] = js.undefined
  
  /**
    * [Output only] Number of network endpoints in the network endpoint group.
    */
  var size: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the network endpoint group is located.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkEndpointGroup {
  
  inline def apply(): SchemaNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroup]
  }
  
  extension [Self <: SchemaNetworkEndpointGroup](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAppEngine(value: SchemaNetworkEndpointGroupAppEngine): Self = StObject.set(x, "appEngine", value.asInstanceOf[js.Any])
    
    inline def setAppEngineUndefined: Self = StObject.set(x, "appEngine", js.undefined)
    
    inline def setCloudFunction(value: SchemaNetworkEndpointGroupCloudFunction): Self = StObject.set(x, "cloudFunction", value.asInstanceOf[js.Any])
    
    inline def setCloudFunctionUndefined: Self = StObject.set(x, "cloudFunction", js.undefined)
    
    inline def setCloudRun(value: SchemaNetworkEndpointGroupCloudRun): Self = StObject.set(x, "cloudRun", value.asInstanceOf[js.Any])
    
    inline def setCloudRunUndefined: Self = StObject.set(x, "cloudRun", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDefaultPort(value: Double): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
    
    inline def setDefaultPortNull: Self = StObject.set(x, "defaultPort", null)
    
    inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoadBalancer(value: SchemaNetworkEndpointGroupLbNetworkEndpointGroup): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointType(value: String): Self = StObject.set(x, "networkEndpointType", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointTypeNull: Self = StObject.set(x, "networkEndpointType", null)
    
    inline def setNetworkEndpointTypeUndefined: Self = StObject.set(x, "networkEndpointType", js.undefined)
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPscData(value: SchemaNetworkEndpointGroupPscData): Self = StObject.set(x, "pscData", value.asInstanceOf[js.Any])
    
    inline def setPscDataUndefined: Self = StObject.set(x, "pscData", js.undefined)
    
    inline def setPscTargetService(value: String): Self = StObject.set(x, "pscTargetService", value.asInstanceOf[js.Any])
    
    inline def setPscTargetServiceNull: Self = StObject.set(x, "pscTargetService", null)
    
    inline def setPscTargetServiceUndefined: Self = StObject.set(x, "pscTargetService", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServerlessDeployment(value: SchemaNetworkEndpointGroupServerlessDeployment): Self = StObject.set(x, "serverlessDeployment", value.asInstanceOf[js.Any])
    
    inline def setServerlessDeploymentUndefined: Self = StObject.set(x, "serverlessDeployment", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
