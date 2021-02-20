package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a secondary IP range of a subnetwork.
  */
@js.native
trait SchemaSubnetworkSecondaryRange extends StObject {
  
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    * Provide this property when you create the subnetwork. Ranges must be
    * unique and non-overlapping with all primary and secondary IP ranges
    * within a network. Only IPv4 is supported.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
  
  /**
    * The type of IP CIDR range to associate with this subnetwork secondary
    * range. The default is RFC_1918. When creating a subnetwork in non-RFC
    * 1918 range, this field must be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
}
object SchemaSubnetworkSecondaryRange {
  
  @scala.inline
  def apply(): SchemaSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworkSecondaryRange]
  }
  
  @scala.inline
  implicit class SchemaSubnetworkSecondaryRangeMutableBuilder[Self <: SchemaSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
    
    @scala.inline
    def setRangeType(value: String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
  }
}
