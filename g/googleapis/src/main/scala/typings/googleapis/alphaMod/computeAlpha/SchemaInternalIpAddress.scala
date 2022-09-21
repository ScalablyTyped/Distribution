package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalIpAddress extends StObject {
  
  /**
    * IP CIDR address or range.
    */
  var cidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The owner of the internal IP address.
    */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The purpose of the internal IP address if applicable.
    */
  var purpose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The region of the internal IP address if applicable.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the internal IP address.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaInternalIpAddress {
  
  inline def apply(): SchemaInternalIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpAddress]
  }
  
  extension [Self <: SchemaInternalIpAddress](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrNull: Self = StObject.set(x, "cidr", null)
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
