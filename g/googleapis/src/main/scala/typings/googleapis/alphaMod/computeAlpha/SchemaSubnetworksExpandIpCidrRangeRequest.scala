package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetworksExpandIpCidrRangeRequest extends StObject {
  
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal
    * on this Subnetwork. This range should be disjoint from other subnetworks
    * within this network. This range can only be larger than (i.e. a superset
    * of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When expanding to a non-RFC 1918 range, this field must be
    * be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.undefined
}
object SchemaSubnetworksExpandIpCidrRangeRequest {
  
  @scala.inline
  def apply(): SchemaSubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksExpandIpCidrRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaSubnetworksExpandIpCidrRangeRequestMutableBuilder[Self <: SchemaSubnetworksExpandIpCidrRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeType(value: String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
  }
}
