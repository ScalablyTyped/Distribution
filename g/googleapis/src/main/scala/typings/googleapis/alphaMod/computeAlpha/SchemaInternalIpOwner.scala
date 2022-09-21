package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalIpOwner extends StObject {
  
  /**
    * IP CIDR range being owned.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URLs of the IP owners of the IP CIDR range.
    */
  var owners: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether this IP CIDR range is reserved for system use.
    */
  var systemOwned: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInternalIpOwner {
  
  inline def apply(): SchemaInternalIpOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalIpOwner]
  }
  
  extension [Self <: SchemaInternalIpOwner](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setSystemOwned(value: Boolean): Self = StObject.set(x, "systemOwned", value.asInstanceOf[js.Any])
    
    inline def setSystemOwnedNull: Self = StObject.set(x, "systemOwned", null)
    
    inline def setSystemOwnedUndefined: Self = StObject.set(x, "systemOwned", js.undefined)
  }
}
