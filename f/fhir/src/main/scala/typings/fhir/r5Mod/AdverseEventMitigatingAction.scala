package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventMitigatingAction
  extends StObject
     with BackboneElement {
  
  /**
    * The ameliorating action taken after the adverse event occured in order to reduce the extent of harm.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The ameliorating action taken after the adverse event occured in order to reduce the extent of harm.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object AdverseEventMitigatingAction {
  
  inline def apply(): AdverseEventMitigatingAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventMitigatingAction]
  }
  
  extension [Self <: AdverseEventMitigatingAction](x: Self) {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
