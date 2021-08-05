package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing errors
  */
trait EligibilityResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept
}
object EligibilityResponseError {
  
  inline def apply(code: CodeableConcept): EligibilityResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseError]
  }
  
  extension [Self <: EligibilityResponseError](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
