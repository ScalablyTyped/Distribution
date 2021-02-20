package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing errors
  */
@js.native
trait EligibilityResponseError extends BackboneElement {
  
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept = js.native
}
object EligibilityResponseError {
  
  @scala.inline
  def apply(code: CodeableConcept): EligibilityResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseError]
  }
  
  @scala.inline
  implicit class EligibilityResponseErrorMutableBuilder[Self <: EligibilityResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
