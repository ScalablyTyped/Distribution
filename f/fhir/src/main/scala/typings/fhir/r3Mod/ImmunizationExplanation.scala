package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationExplanation
  extends StObject
     with BackboneElement {
  
  /**
    * Reasons why a vaccine was administered.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason why a vaccine was not administered.
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ImmunizationExplanation {
  
  inline def apply(): ImmunizationExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationExplanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationExplanation] (val x: Self) extends AnyVal {
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotGiven", value.asInstanceOf[js.Any])
    
    inline def setReasonNotGivenUndefined: Self = StObject.set(x, "reasonNotGiven", js.undefined)
    
    inline def setReasonNotGivenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotGiven", js.Array(value*))
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
  }
}
