package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * An error code,from a specified code system, which details why the eligibility check could not be performed.
    */
  var code: CodeableConcept
}
object CoverageEligibilityResponseError {
  
  inline def apply(code: CodeableConcept): CoverageEligibilityResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityResponseError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityResponseError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
