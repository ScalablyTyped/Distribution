package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeDefinitional
  extends StObject
     with BackboneElement {
  
  /**
    * Associated definitions for this medication.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When Medication is referenced from MedicationRequest, this is the ordered form.  When Medication is referenced within MedicationDispense, this is the dispensed form.  When Medication is referenced within MedicationAdministration, this is administered form.
    */
  var doseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
    */
  var drugCharacteristic: js.UndefOr[js.Array[MedicationKnowledgeDefinitionalDrugCharacteristic]] = js.undefined
  
  /**
    * Identifies a particular constituent of interest in the product.
    */
  var ingredient: js.UndefOr[js.Array[MedicationKnowledgeDefinitionalIngredient]] = js.undefined
  
  /**
    * The intended or approved route of administration.
    */
  var intendedRoute: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object MedicationKnowledgeDefinitional {
  
  inline def apply(): MedicationKnowledgeDefinitional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeDefinitional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeDefinitional] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setDoseForm(value: CodeableConcept): Self = StObject.set(x, "doseForm", value.asInstanceOf[js.Any])
    
    inline def setDoseFormUndefined: Self = StObject.set(x, "doseForm", js.undefined)
    
    inline def setDrugCharacteristic(value: js.Array[MedicationKnowledgeDefinitionalDrugCharacteristic]): Self = StObject.set(x, "drugCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setDrugCharacteristicUndefined: Self = StObject.set(x, "drugCharacteristic", js.undefined)
    
    inline def setDrugCharacteristicVarargs(value: MedicationKnowledgeDefinitionalDrugCharacteristic*): Self = StObject.set(x, "drugCharacteristic", js.Array(value*))
    
    inline def setIngredient(value: js.Array[MedicationKnowledgeDefinitionalIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: MedicationKnowledgeDefinitionalIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setIntendedRoute(value: js.Array[CodeableConcept]): Self = StObject.set(x, "intendedRoute", value.asInstanceOf[js.Any])
    
    inline def setIntendedRouteUndefined: Self = StObject.set(x, "intendedRoute", js.undefined)
    
    inline def setIntendedRouteVarargs(value: CodeableConcept*): Self = StObject.set(x, "intendedRoute", js.Array(value*))
  }
}
