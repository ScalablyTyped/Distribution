package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventSuspectEntity
  extends StObject
     with BackboneElement {
  
  /**
    * Information on the possible cause of the event.
    */
  var causality: js.UndefOr[AdverseEventSuspectEntityCausality] = js.undefined
  
  /**
    * Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
    */
  var instanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
    */
  var instanceReference: js.UndefOr[Reference] = js.undefined
}
object AdverseEventSuspectEntity {
  
  inline def apply(): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
  
  extension [Self <: AdverseEventSuspectEntity](x: Self) {
    
    inline def setCausality(value: AdverseEventSuspectEntityCausality): Self = StObject.set(x, "causality", value.asInstanceOf[js.Any])
    
    inline def setCausalityUndefined: Self = StObject.set(x, "causality", js.undefined)
    
    inline def setInstanceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "instanceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setInstanceCodeableConceptUndefined: Self = StObject.set(x, "instanceCodeableConcept", js.undefined)
    
    inline def setInstanceReference(value: Reference): Self = StObject.set(x, "instanceReference", value.asInstanceOf[js.Any])
    
    inline def setInstanceReferenceUndefined: Self = StObject.set(x, "instanceReference", js.undefined)
  }
}
