package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetworkSecondaryRange extends StObject {
  
  /**
    * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
    */
  var rangeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the reserved internal range.
    */
  var reservedInternalRange: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubnetworkSecondaryRange {
  
  inline def apply(): SchemaSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworkSecondaryRange]
  }
  
  extension [Self <: SchemaSubnetworkSecondaryRange](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    inline def setRangeNameNull: Self = StObject.set(x, "rangeName", null)
    
    inline def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
    
    inline def setReservedInternalRange(value: String): Self = StObject.set(x, "reservedInternalRange", value.asInstanceOf[js.Any])
    
    inline def setReservedInternalRangeNull: Self = StObject.set(x, "reservedInternalRange", null)
    
    inline def setReservedInternalRangeUndefined: Self = StObject.set(x, "reservedInternalRange", js.undefined)
  }
}
