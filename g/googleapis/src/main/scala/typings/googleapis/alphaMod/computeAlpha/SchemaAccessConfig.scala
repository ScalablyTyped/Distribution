package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessConfig extends StObject {
  
  /**
    * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
    */
  var externalIpv6: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The prefix length of the external IPv6 range.
    */
  var externalIpv6PrefixLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
    */
  var natIP: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
    */
  var networkTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The public DNS domain name for the instance.
    */
  var publicDnsName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
    */
  var publicPtrDomainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether a public DNS 'A' record should be created for the external IP address of this access configuration.
    */
  var setPublicDns: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
    */
  var setPublicPtr: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessConfig {
  
  inline def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  
  extension [Self <: SchemaAccessConfig](x: Self) {
    
    inline def setExternalIpv6(value: String): Self = StObject.set(x, "externalIpv6", value.asInstanceOf[js.Any])
    
    inline def setExternalIpv6Null: Self = StObject.set(x, "externalIpv6", null)
    
    inline def setExternalIpv6PrefixLength(value: Double): Self = StObject.set(x, "externalIpv6PrefixLength", value.asInstanceOf[js.Any])
    
    inline def setExternalIpv6PrefixLengthNull: Self = StObject.set(x, "externalIpv6PrefixLength", null)
    
    inline def setExternalIpv6PrefixLengthUndefined: Self = StObject.set(x, "externalIpv6PrefixLength", js.undefined)
    
    inline def setExternalIpv6Undefined: Self = StObject.set(x, "externalIpv6", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatIP(value: String): Self = StObject.set(x, "natIP", value.asInstanceOf[js.Any])
    
    inline def setNatIPNull: Self = StObject.set(x, "natIP", null)
    
    inline def setNatIPUndefined: Self = StObject.set(x, "natIP", js.undefined)
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierNull: Self = StObject.set(x, "networkTier", null)
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
    
    inline def setPublicDnsName(value: String): Self = StObject.set(x, "publicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsNameNull: Self = StObject.set(x, "publicDnsName", null)
    
    inline def setPublicDnsNameUndefined: Self = StObject.set(x, "publicDnsName", js.undefined)
    
    inline def setPublicPtrDomainName(value: String): Self = StObject.set(x, "publicPtrDomainName", value.asInstanceOf[js.Any])
    
    inline def setPublicPtrDomainNameNull: Self = StObject.set(x, "publicPtrDomainName", null)
    
    inline def setPublicPtrDomainNameUndefined: Self = StObject.set(x, "publicPtrDomainName", js.undefined)
    
    inline def setSetPublicDns(value: Boolean): Self = StObject.set(x, "setPublicDns", value.asInstanceOf[js.Any])
    
    inline def setSetPublicDnsNull: Self = StObject.set(x, "setPublicDns", null)
    
    inline def setSetPublicDnsUndefined: Self = StObject.set(x, "setPublicDns", js.undefined)
    
    inline def setSetPublicPtr(value: Boolean): Self = StObject.set(x, "setPublicPtr", value.asInstanceOf[js.Any])
    
    inline def setSetPublicPtrNull: Self = StObject.set(x, "setPublicPtr", null)
    
    inline def setSetPublicPtrUndefined: Self = StObject.set(x, "setPublicPtr", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
