package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerId extends StObject {
  
  var customerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerId {
  
  inline def apply(): SchemaCustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerId]
  }
  
  extension [Self <: SchemaCustomerId](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
