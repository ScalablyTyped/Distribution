package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeMonograph
  extends StObject
     with BackboneElement {
  
  /**
    * Associated documentation about the medication.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * The category of documentation about the medication. (e.g. professional monograph, patient education monograph).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationKnowledgeMonograph {
  
  inline def apply(): MedicationKnowledgeMonograph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeMonograph]
  }
  
  extension [Self <: MedicationKnowledgeMonograph](x: Self) {
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
