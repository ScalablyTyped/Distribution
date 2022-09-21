package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAttachment extends StObject {
  
  /**
    * [Output Only] An array of connections for all the consumers connected to this service attachment.
    */
  var connectedEndpoints: js.UndefOr[js.Array[SchemaServiceAttachmentConnectedEndpoint]] = js.undefined
  
  /**
    * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
    */
  var connectionPreference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Projects that are allowed to connect to this service attachment.
    */
  var consumerAcceptLists: js.UndefOr[js.Array[SchemaServiceAttachmentConsumerProjectLimit]] = js.undefined
  
  /**
    * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
    */
  var consumerRejectLists: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
    */
  var domainNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
    */
  var enableProxyProtocol: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource type. The server generates this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
    */
  var natSubnets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
    */
  var producerForwardingRule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An 128-bit global unique ID of the PSC service attachment.
    */
  var pscServiceAttachmentId: js.UndefOr[SchemaUint128] = js.undefined
  
  /**
    * [Output Only] URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of a service serving the endpoint identified by this service attachment.
    */
  var targetService: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAttachment {
  
  inline def apply(): SchemaServiceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAttachment]
  }
  
  extension [Self <: SchemaServiceAttachment](x: Self) {
    
    inline def setConnectedEndpoints(value: js.Array[SchemaServiceAttachmentConnectedEndpoint]): Self = StObject.set(x, "connectedEndpoints", value.asInstanceOf[js.Any])
    
    inline def setConnectedEndpointsUndefined: Self = StObject.set(x, "connectedEndpoints", js.undefined)
    
    inline def setConnectedEndpointsVarargs(value: SchemaServiceAttachmentConnectedEndpoint*): Self = StObject.set(x, "connectedEndpoints", js.Array(value*))
    
    inline def setConnectionPreference(value: String): Self = StObject.set(x, "connectionPreference", value.asInstanceOf[js.Any])
    
    inline def setConnectionPreferenceNull: Self = StObject.set(x, "connectionPreference", null)
    
    inline def setConnectionPreferenceUndefined: Self = StObject.set(x, "connectionPreference", js.undefined)
    
    inline def setConsumerAcceptLists(value: js.Array[SchemaServiceAttachmentConsumerProjectLimit]): Self = StObject.set(x, "consumerAcceptLists", value.asInstanceOf[js.Any])
    
    inline def setConsumerAcceptListsUndefined: Self = StObject.set(x, "consumerAcceptLists", js.undefined)
    
    inline def setConsumerAcceptListsVarargs(value: SchemaServiceAttachmentConsumerProjectLimit*): Self = StObject.set(x, "consumerAcceptLists", js.Array(value*))
    
    inline def setConsumerRejectLists(value: js.Array[String]): Self = StObject.set(x, "consumerRejectLists", value.asInstanceOf[js.Any])
    
    inline def setConsumerRejectListsNull: Self = StObject.set(x, "consumerRejectLists", null)
    
    inline def setConsumerRejectListsUndefined: Self = StObject.set(x, "consumerRejectLists", js.undefined)
    
    inline def setConsumerRejectListsVarargs(value: String*): Self = StObject.set(x, "consumerRejectLists", js.Array(value*))
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainNames(value: js.Array[String]): Self = StObject.set(x, "domainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesNull: Self = StObject.set(x, "domainNames", null)
    
    inline def setDomainNamesUndefined: Self = StObject.set(x, "domainNames", js.undefined)
    
    inline def setDomainNamesVarargs(value: String*): Self = StObject.set(x, "domainNames", js.Array(value*))
    
    inline def setEnableProxyProtocol(value: Boolean): Self = StObject.set(x, "enableProxyProtocol", value.asInstanceOf[js.Any])
    
    inline def setEnableProxyProtocolNull: Self = StObject.set(x, "enableProxyProtocol", null)
    
    inline def setEnableProxyProtocolUndefined: Self = StObject.set(x, "enableProxyProtocol", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatSubnets(value: js.Array[String]): Self = StObject.set(x, "natSubnets", value.asInstanceOf[js.Any])
    
    inline def setNatSubnetsNull: Self = StObject.set(x, "natSubnets", null)
    
    inline def setNatSubnetsUndefined: Self = StObject.set(x, "natSubnets", js.undefined)
    
    inline def setNatSubnetsVarargs(value: String*): Self = StObject.set(x, "natSubnets", js.Array(value*))
    
    inline def setProducerForwardingRule(value: String): Self = StObject.set(x, "producerForwardingRule", value.asInstanceOf[js.Any])
    
    inline def setProducerForwardingRuleNull: Self = StObject.set(x, "producerForwardingRule", null)
    
    inline def setProducerForwardingRuleUndefined: Self = StObject.set(x, "producerForwardingRule", js.undefined)
    
    inline def setPscServiceAttachmentId(value: SchemaUint128): Self = StObject.set(x, "pscServiceAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setPscServiceAttachmentIdUndefined: Self = StObject.set(x, "pscServiceAttachmentId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTargetService(value: String): Self = StObject.set(x, "targetService", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceNull: Self = StObject.set(x, "targetService", null)
    
    inline def setTargetServiceUndefined: Self = StObject.set(x, "targetService", js.undefined)
  }
}
