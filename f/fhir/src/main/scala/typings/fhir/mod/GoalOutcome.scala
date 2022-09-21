package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoalOutcome
  extends StObject
     with BackboneElement {
  
  /**
    * Details of what's changed (or not changed).
    */
  var resultCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Details of what's changed (or not changed).
    */
  var resultReference: js.UndefOr[Reference] = js.undefined
}
object GoalOutcome {
  
  inline def apply(): GoalOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalOutcome]
  }
  
  extension [Self <: GoalOutcome](x: Self) {
    
    inline def setResultCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "resultCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setResultCodeableConceptUndefined: Self = StObject.set(x, "resultCodeableConcept", js.undefined)
    
    inline def setResultReference(value: Reference): Self = StObject.set(x, "resultReference", value.asInstanceOf[js.Any])
    
    inline def setResultReferenceUndefined: Self = StObject.set(x, "resultReference", js.undefined)
  }
}
