package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRestSecurity
  extends StObject
     with BackboneElement {
  
  var _cors: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The easiest CORS headers to add are Access-Control-Allow-Origin: * & Access-Control-Request-Method: GET, POST, PUT, DELETE. All servers SHOULD support CORS.
    */
  var cors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * General description of how security works.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Types of security services that are supported/required by the system.
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object CapabilityStatementRestSecurity {
  
  inline def apply(): CapabilityStatementRestSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurity]
  }
  
  extension [Self <: CapabilityStatementRestSecurity](x: Self) {
    
    inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setService(value: js.Array[CodeableConcept]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: CodeableConcept*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def set_cors(value: Element): Self = StObject.set(x, "_cors", value.asInstanceOf[js.Any])
    
    inline def set_corsUndefined: Self = StObject.set(x, "_cors", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
