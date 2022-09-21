package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeIndicationGuideline
  extends StObject
     with BackboneElement {
  
  /**
    * The guidelines for the dosage of the medication for the indication.
    */
  var dosingGuideline: js.UndefOr[js.Array[MedicationKnowledgeIndicationGuidelineDosingGuideline]] = js.undefined
  
  /**
    * Indication or reason for use of the medication that applies to the specific administration guideline.
    */
  var indication: js.UndefOr[js.Array[CodeableReference]] = js.undefined
}
object MedicationKnowledgeIndicationGuideline {
  
  inline def apply(): MedicationKnowledgeIndicationGuideline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeIndicationGuideline]
  }
  
  extension [Self <: MedicationKnowledgeIndicationGuideline](x: Self) {
    
    inline def setDosingGuideline(value: js.Array[MedicationKnowledgeIndicationGuidelineDosingGuideline]): Self = StObject.set(x, "dosingGuideline", value.asInstanceOf[js.Any])
    
    inline def setDosingGuidelineUndefined: Self = StObject.set(x, "dosingGuideline", js.undefined)
    
    inline def setDosingGuidelineVarargs(value: MedicationKnowledgeIndicationGuidelineDosingGuideline*): Self = StObject.set(x, "dosingGuideline", js.Array(value*))
    
    inline def setIndication(value: js.Array[CodeableReference]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableReference*): Self = StObject.set(x, "indication", js.Array(value*))
  }
}
