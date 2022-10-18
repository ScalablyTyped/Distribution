package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestSecurity
  extends StObject
     with BackboneElement {
  
  var _cors: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Certificates associated with security profiles.
    */
  var certificate: js.UndefOr[js.Array[ConformanceRestSecurityCertificate]] = js.undefined
  
  /**
    * Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
    */
  var cors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * General description of how security works.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Types of security services are supported/required by the system.
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ConformanceRestSecurity {
  
  inline def apply(): ConformanceRestSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformanceRestSecurity]
  }
  
  extension [Self <: ConformanceRestSecurity](x: Self) {
    
    inline def setCertificate(value: js.Array[ConformanceRestSecurityCertificate]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setCertificateVarargs(value: ConformanceRestSecurityCertificate*): Self = StObject.set(x, "certificate", js.Array(value*))
    
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
