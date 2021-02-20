package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInternalIpAddress extends StObject {
  
  /**
    * IP CIDR address or range.
    */
  var cidr: js.UndefOr[String] = js.native
  
  /**
    * The owner of the internal IP address.
    */
  var owner: js.UndefOr[String] = js.native
  
  /**
    * The purpose of the internal IP address if applicable.
    */
  var purpose: js.UndefOr[String] = js.native
  
  /**
    * The region of the internal IP address if applicable.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The type of the internal IP address.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInternalIpAddress {
  
  @scala.inline
  def apply(): SchemaInternalIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpAddress]
  }
  
  @scala.inline
  implicit class SchemaInternalIpAddressMutableBuilder[Self <: SchemaInternalIpAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
