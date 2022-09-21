package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocatedConnection extends StObject {
  
  /**
    * Required. The ingress port of an allocated connection
    */
  var ingressPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The PSC uri of an allocated connection
    */
  var pscUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAllocatedConnection {
  
  inline def apply(): SchemaAllocatedConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocatedConnection]
  }
  
  extension [Self <: SchemaAllocatedConnection](x: Self) {
    
    inline def setIngressPort(value: Double): Self = StObject.set(x, "ingressPort", value.asInstanceOf[js.Any])
    
    inline def setIngressPortNull: Self = StObject.set(x, "ingressPort", null)
    
    inline def setIngressPortUndefined: Self = StObject.set(x, "ingressPort", js.undefined)
    
    inline def setPscUri(value: String): Self = StObject.set(x, "pscUri", value.asInstanceOf[js.Any])
    
    inline def setPscUriNull: Self = StObject.set(x, "pscUri", null)
    
    inline def setPscUriUndefined: Self = StObject.set(x, "pscUri", js.undefined)
  }
}
