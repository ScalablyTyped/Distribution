package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alias IP range attached to an instance&#39;s network interface.
  */
@js.native
trait SchemaAliasIpRange extends StObject {
  
  /**
    * The IP CIDR range represented by this alias IP range. This IP CIDR range
    * must belong to the specified subnetwork and cannot contain IP addresses
    * reserved by system or used by other network interfaces. This range may be
    * a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24) or a CIDR
    * format string (e.g. 10.1.2.0/24).
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /**
    * Optional subnetwork secondary range name specifying the secondary range
    * from which to allocate the IP CIDR range for this alias IP range. If left
    * unspecified, the primary range of the subnetwork will be used.
    */
  var subnetworkRangeName: js.UndefOr[String] = js.native
}
object SchemaAliasIpRange {
  
  @scala.inline
  def apply(): SchemaAliasIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliasIpRange]
  }
  
  @scala.inline
  implicit class SchemaAliasIpRangeMutableBuilder[Self <: SchemaAliasIpRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setSubnetworkRangeName(value: String): Self = StObject.set(x, "subnetworkRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkRangeNameUndefined: Self = StObject.set(x, "subnetworkRangeName", js.undefined)
  }
}
