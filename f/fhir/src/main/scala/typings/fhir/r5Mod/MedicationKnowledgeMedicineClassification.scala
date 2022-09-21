package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeMedicineClassification
  extends StObject
     with BackboneElement {
  
  var _sourceString: js.UndefOr[Element] = js.undefined
  
  var _sourceUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive, antibiotic, etc.).
    */
  var classification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Either a textual source of the classification or a reference to an online source.
    */
  var sourceString: js.UndefOr[String] = js.undefined
  
  /**
    * Either a textual source of the classification or a reference to an online source.
    */
  var sourceUri: js.UndefOr[String] = js.undefined
  
  /**
    * The type of category for the medication (for example, therapeutic classification, therapeutic sub-classification).
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeMedicineClassification {
  
  inline def apply(`type`: CodeableConcept): MedicationKnowledgeMedicineClassification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeMedicineClassification]
  }
  
  extension [Self <: MedicationKnowledgeMedicineClassification](x: Self) {
    
    inline def setClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setSourceString(value: String): Self = StObject.set(x, "sourceString", value.asInstanceOf[js.Any])
    
    inline def setSourceStringUndefined: Self = StObject.set(x, "sourceString", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_sourceString(value: Element): Self = StObject.set(x, "_sourceString", value.asInstanceOf[js.Any])
    
    inline def set_sourceStringUndefined: Self = StObject.set(x, "_sourceString", js.undefined)
    
    inline def set_sourceUri(value: Element): Self = StObject.set(x, "_sourceUri", value.asInstanceOf[js.Any])
    
    inline def set_sourceUriUndefined: Self = StObject.set(x, "_sourceUri", js.undefined)
  }
}
