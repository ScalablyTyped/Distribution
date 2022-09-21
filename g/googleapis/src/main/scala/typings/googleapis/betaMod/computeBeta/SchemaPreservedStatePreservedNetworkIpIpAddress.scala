package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreservedStatePreservedNetworkIpIpAddress extends StObject {
  
  /**
    * The URL of the reservation for this IP address.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An IPv4 internal network address to assign to the instance for this network interface.
    */
  var literal: js.UndefOr[String | Null] = js.undefined
}
object SchemaPreservedStatePreservedNetworkIpIpAddress {
  
  inline def apply(): SchemaPreservedStatePreservedNetworkIpIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedStatePreservedNetworkIpIpAddress]
  }
  
  extension [Self <: SchemaPreservedStatePreservedNetworkIpIpAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setLiteralNull: Self = StObject.set(x, "literal", null)
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
  }
}
