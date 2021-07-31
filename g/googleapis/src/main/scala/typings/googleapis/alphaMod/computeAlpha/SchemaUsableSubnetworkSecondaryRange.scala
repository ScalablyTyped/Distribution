package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Secondary IP range of a usable subnetwork.
  */
trait SchemaUsableSubnetworkSecondaryRange extends StObject {
  
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.undefined
}
object SchemaUsableSubnetworkSecondaryRange {
  
  @scala.inline
  def apply(): SchemaUsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetworkSecondaryRange]
  }
  
  @scala.inline
  implicit class SchemaUsableSubnetworkSecondaryRangeMutableBuilder[Self <: SchemaUsableSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
  }
}
