package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EligibilityResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * An error code,from a specified code system, which details why the eligibility check could not be performed.
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
