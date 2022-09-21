package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsEvent extends StObject {
  
  /**
    * The hostname that was looked up.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The (possibly truncated) list of the IP addresses returned for DNS lookup (max 10 IPv4 or IPv6 addresses).
    */
  var ipAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The package name of the UID that performed the DNS lookup.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of IP addresses returned from the DNS lookup event. May be higher than the amount of ip_addresses if there were too many addresses to log.
    */
  var totalIpAddressesReturned: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsEvent {
  
  inline def apply(): SchemaDnsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsEvent]
  }
  
  extension [Self <: SchemaDnsEvent](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesNull: Self = StObject.set(x, "ipAddresses", null)
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setTotalIpAddressesReturned(value: String): Self = StObject.set(x, "totalIpAddressesReturned", value.asInstanceOf[js.Any])
    
    inline def setTotalIpAddressesReturnedNull: Self = StObject.set(x, "totalIpAddressesReturned", null)
    
    inline def setTotalIpAddressesReturnedUndefined: Self = StObject.set(x, "totalIpAddressesReturned", js.undefined)
  }
}
