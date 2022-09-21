package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterBgp extends StObject {
  
  /**
    * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
    */
  var advertiseMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.undefined
  
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
    */
  var asn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The interval in seconds between BGP keepalive messages that are sent to the peer. Hold time is three times the interval at which keepalive messages are sent, and the hold time is the maximum number of seconds allowed to elapse between successive keepalive messages that BGP receives from a peer. BGP will use the smaller of either the local hold time value or the peer's hold time value as the hold time for the BGP connection between the two peers. If set, this value must be between 20 and 60. The default is 20.
    */
  var keepaliveInterval: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRouterBgp {
  
  inline def apply(): SchemaRouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgp]
  }
  
  extension [Self <: SchemaRouterBgp](x: Self) {
    
    inline def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    inline def setAdvertiseModeNull: Self = StObject.set(x, "advertiseMode", null)
    
    inline def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    inline def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedGroupsNull: Self = StObject.set(x, "advertisedGroups", null)
    
    inline def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    inline def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value*))
    
    inline def setAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    inline def setAdvertisedIpRangesVarargs(value: SchemaRouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value*))
    
    inline def setAsn(value: Double): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAsnNull: Self = StObject.set(x, "asn", null)
    
    inline def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    inline def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveIntervalNull: Self = StObject.set(x, "keepaliveInterval", null)
    
    inline def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
  }
}
