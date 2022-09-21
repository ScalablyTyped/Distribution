package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachment extends StObject {
  
  /**
    * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
    */
  var adminEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: - BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s - BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5 Gbit/s - BPS_10G: 10 Gbit/s - BPS_20G: 20 Gbit/s - BPS_50G: 50 Gbit/s
    */
  var bandwidth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is not available.
    */
  var candidateIpv6Subnets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request will fail if all possible /29s are in use on Google's edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
    */
  var cloudRouterIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] IPv6 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
    */
  var cloudRouterIpv6Address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is not available.
    */
  var cloudRouterIpv6InterfaceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
    */
  var customerRouterIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] IPv6 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
    */
  var customerRouterIpv6Address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is not available.
    */
  var customerRouterIpv6InterfaceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Dataplane version for this InterconnectAttachment. This field is only present for Dataplane version 2 and higher. Absence of this field in the API output indicates that the Dataplane is version 1.
    */
  var dataplaneVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the user-supplied encryption option of this VLAN attachment (interconnectAttachment). Can only be specified at attachment creation for PARTNER or DEDICATED attachments. Possible values are: - NONE - This is the default value, which means that the VLAN attachment carries unencrypted traffic. VMs are able to send traffic to, or receive traffic from, such a VLAN attachment. - IPSEC - The VLAN attachment carries only encrypted traffic that is encrypted by an IPsec device, such as an HA VPN gateway or third-party IPsec VPN. VMs cannot directly send traffic to, or receive traffic from, such a VLAN attachment. To use *IPsec-encrypted Cloud Interconnect*, the VLAN attachment must be created with this option. Not currently available publicly.
    */
  var encryption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Google reference ID, to be used when raising support tickets with Google or otherwise to debug backend connectivity issues. [Deprecated] This field is not used.
    */
  var googleReferenceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the underlying Interconnect object that this attachment's traffic will traverse through.
    */
  var interconnect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of URLs of addresses that have been reserved for the VLAN attachment. Used only for the VLAN attachment that has the encryption option as IPSEC. The addresses must be regional internal IP address ranges. When creating an HA VPN gateway over the VLAN attachment, if the attachment is configured to use a regional internal IP address, then the VPN gateway's IP address is allocated from the IP address range specified here. For example, if the HA VPN gateway's interface 0 is paired to this VLAN attachment, then a regional internal IP address for the VPN gateway interface 0 will be allocated from the IP address specified for this VLAN attachment. If this field is not specified when creating the VLAN attachment, then later on when creating an HA VPN gateway on this VLAN attachment, the HA VPN gateway's IP address is allocated from the regional external IP address pool. Not currently available publicly.
    */
  var ipsecInternalAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#interconnectAttachment for interconnect attachments.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
    */
  var labelFingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Maximum Transmission Unit (MTU), in bytes, of packets passing through this interconnect attachment. Only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
    */
  var mtu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The current status of whether or not this interconnect attachment is functional, which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and is ready to use. - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
    */
  var operationalStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a selected partner. Of the form "XXXXX/region/domain"
    */
  var pairingKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available for DEDICATED.
    */
  var partnerAsn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
    */
  var partnerMetadata: js.UndefOr[SchemaInterconnectAttachmentPartnerMetadata] = js.undefined
  
  /**
    * [Output Only] Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached to is of type DEDICATED.
    */
  var privateInterconnectInfo: js.UndefOr[SchemaInterconnectAttachmentPrivateInfo] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional interconnect attachment resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect the Interconnect to the network & region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
    */
  var stackType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The current state of this attachment's functionality. Enum values ACTIVE and UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take one of the following values: - ACTIVE: The attachment has been turned up and is ready to use. - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete. - PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the Partner side. - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of provisioning after a PARTNER_PROVIDER attachment was created that references it. - PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to activate it. - DEFUNCT: The attachment was deleted externally and is no longer functional. This could be because the associated Interconnect was removed, or because the other side of a Partner attachment was deleted.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of interconnect attachment this is, which can take one of the following values: - DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time.
    */
  var vlanTag8021q: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInterconnectAttachment {
  
  inline def apply(): SchemaInterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachment]
  }
  
  extension [Self <: SchemaInterconnectAttachment](x: Self) {
    
    inline def setAdminEnabled(value: Boolean): Self = StObject.set(x, "adminEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdminEnabledNull: Self = StObject.set(x, "adminEnabled", null)
    
    inline def setAdminEnabledUndefined: Self = StObject.set(x, "adminEnabled", js.undefined)
    
    inline def setBandwidth(value: String): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthNull: Self = StObject.set(x, "bandwidth", null)
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCandidateIpv6Subnets(value: js.Array[String]): Self = StObject.set(x, "candidateIpv6Subnets", value.asInstanceOf[js.Any])
    
    inline def setCandidateIpv6SubnetsNull: Self = StObject.set(x, "candidateIpv6Subnets", null)
    
    inline def setCandidateIpv6SubnetsUndefined: Self = StObject.set(x, "candidateIpv6Subnets", js.undefined)
    
    inline def setCandidateIpv6SubnetsVarargs(value: String*): Self = StObject.set(x, "candidateIpv6Subnets", js.Array(value*))
    
    inline def setCandidateSubnets(value: js.Array[String]): Self = StObject.set(x, "candidateSubnets", value.asInstanceOf[js.Any])
    
    inline def setCandidateSubnetsNull: Self = StObject.set(x, "candidateSubnets", null)
    
    inline def setCandidateSubnetsUndefined: Self = StObject.set(x, "candidateSubnets", js.undefined)
    
    inline def setCandidateSubnetsVarargs(value: String*): Self = StObject.set(x, "candidateSubnets", js.Array(value*))
    
    inline def setCloudRouterIpAddress(value: String): Self = StObject.set(x, "cloudRouterIpAddress", value.asInstanceOf[js.Any])
    
    inline def setCloudRouterIpAddressNull: Self = StObject.set(x, "cloudRouterIpAddress", null)
    
    inline def setCloudRouterIpAddressUndefined: Self = StObject.set(x, "cloudRouterIpAddress", js.undefined)
    
    inline def setCloudRouterIpv6Address(value: String): Self = StObject.set(x, "cloudRouterIpv6Address", value.asInstanceOf[js.Any])
    
    inline def setCloudRouterIpv6AddressNull: Self = StObject.set(x, "cloudRouterIpv6Address", null)
    
    inline def setCloudRouterIpv6AddressUndefined: Self = StObject.set(x, "cloudRouterIpv6Address", js.undefined)
    
    inline def setCloudRouterIpv6InterfaceId(value: String): Self = StObject.set(x, "cloudRouterIpv6InterfaceId", value.asInstanceOf[js.Any])
    
    inline def setCloudRouterIpv6InterfaceIdNull: Self = StObject.set(x, "cloudRouterIpv6InterfaceId", null)
    
    inline def setCloudRouterIpv6InterfaceIdUndefined: Self = StObject.set(x, "cloudRouterIpv6InterfaceId", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomerRouterIpAddress(value: String): Self = StObject.set(x, "customerRouterIpAddress", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterIpAddressNull: Self = StObject.set(x, "customerRouterIpAddress", null)
    
    inline def setCustomerRouterIpAddressUndefined: Self = StObject.set(x, "customerRouterIpAddress", js.undefined)
    
    inline def setCustomerRouterIpv6Address(value: String): Self = StObject.set(x, "customerRouterIpv6Address", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterIpv6AddressNull: Self = StObject.set(x, "customerRouterIpv6Address", null)
    
    inline def setCustomerRouterIpv6AddressUndefined: Self = StObject.set(x, "customerRouterIpv6Address", js.undefined)
    
    inline def setCustomerRouterIpv6InterfaceId(value: String): Self = StObject.set(x, "customerRouterIpv6InterfaceId", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterIpv6InterfaceIdNull: Self = StObject.set(x, "customerRouterIpv6InterfaceId", null)
    
    inline def setCustomerRouterIpv6InterfaceIdUndefined: Self = StObject.set(x, "customerRouterIpv6InterfaceId", js.undefined)
    
    inline def setDataplaneVersion(value: Double): Self = StObject.set(x, "dataplaneVersion", value.asInstanceOf[js.Any])
    
    inline def setDataplaneVersionNull: Self = StObject.set(x, "dataplaneVersion", null)
    
    inline def setDataplaneVersionUndefined: Self = StObject.set(x, "dataplaneVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdgeAvailabilityDomain(value: String): Self = StObject.set(x, "edgeAvailabilityDomain", value.asInstanceOf[js.Any])
    
    inline def setEdgeAvailabilityDomainNull: Self = StObject.set(x, "edgeAvailabilityDomain", null)
    
    inline def setEdgeAvailabilityDomainUndefined: Self = StObject.set(x, "edgeAvailabilityDomain", js.undefined)
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionNull: Self = StObject.set(x, "encryption", null)
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setGoogleReferenceId(value: String): Self = StObject.set(x, "googleReferenceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleReferenceIdNull: Self = StObject.set(x, "googleReferenceId", null)
    
    inline def setGoogleReferenceIdUndefined: Self = StObject.set(x, "googleReferenceId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterconnect(value: String): Self = StObject.set(x, "interconnect", value.asInstanceOf[js.Any])
    
    inline def setInterconnectNull: Self = StObject.set(x, "interconnect", null)
    
    inline def setInterconnectUndefined: Self = StObject.set(x, "interconnect", js.undefined)
    
    inline def setIpsecInternalAddresses(value: js.Array[String]): Self = StObject.set(x, "ipsecInternalAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpsecInternalAddressesNull: Self = StObject.set(x, "ipsecInternalAddresses", null)
    
    inline def setIpsecInternalAddressesUndefined: Self = StObject.set(x, "ipsecInternalAddresses", js.undefined)
    
    inline def setIpsecInternalAddressesVarargs(value: String*): Self = StObject.set(x, "ipsecInternalAddresses", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintNull: Self = StObject.set(x, "labelFingerprint", null)
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMtu(value: Double): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuNull: Self = StObject.set(x, "mtu", null)
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationalStatus(value: String): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusNull: Self = StObject.set(x, "operationalStatus", null)
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setPairingKey(value: String): Self = StObject.set(x, "pairingKey", value.asInstanceOf[js.Any])
    
    inline def setPairingKeyNull: Self = StObject.set(x, "pairingKey", null)
    
    inline def setPairingKeyUndefined: Self = StObject.set(x, "pairingKey", js.undefined)
    
    inline def setPartnerAsn(value: String): Self = StObject.set(x, "partnerAsn", value.asInstanceOf[js.Any])
    
    inline def setPartnerAsnNull: Self = StObject.set(x, "partnerAsn", null)
    
    inline def setPartnerAsnUndefined: Self = StObject.set(x, "partnerAsn", js.undefined)
    
    inline def setPartnerMetadata(value: SchemaInterconnectAttachmentPartnerMetadata): Self = StObject.set(x, "partnerMetadata", value.asInstanceOf[js.Any])
    
    inline def setPartnerMetadataUndefined: Self = StObject.set(x, "partnerMetadata", js.undefined)
    
    inline def setPrivateInterconnectInfo(value: SchemaInterconnectAttachmentPrivateInfo): Self = StObject.set(x, "privateInterconnectInfo", value.asInstanceOf[js.Any])
    
    inline def setPrivateInterconnectInfoUndefined: Self = StObject.set(x, "privateInterconnectInfo", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterNull: Self = StObject.set(x, "router", null)
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStackType(value: String): Self = StObject.set(x, "stackType", value.asInstanceOf[js.Any])
    
    inline def setStackTypeNull: Self = StObject.set(x, "stackType", null)
    
    inline def setStackTypeUndefined: Self = StObject.set(x, "stackType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVlanTag8021q(value: Double): Self = StObject.set(x, "vlanTag8021q", value.asInstanceOf[js.Any])
    
    inline def setVlanTag8021qNull: Self = StObject.set(x, "vlanTag8021q", null)
    
    inline def setVlanTag8021qUndefined: Self = StObject.set(x, "vlanTag8021q", js.undefined)
  }
}
