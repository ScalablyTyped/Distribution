package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrder
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Information on a patient's food allergies and intolerances to inform healthcare personnel about the type of foods that the patient shouldn't receive or consume.
    */
  var allergyIntolerance: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date and time that this nutrition order was requested.
    */
  var dateTime: String
  
  /**
    * An encounter that provides additional information about the healthcare context in which this request is made.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
    */
  var enteralFormula: js.UndefOr[NutritionOrderEnteralFormula] = js.undefined
  
  /**
    * Information on a patient's food allergies, intolerances and preferences to inform healthcare personnel about the type  of foods that the patient shouldn't receive or consume.
    */
  var excludeFoodModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Information on a patient's food preferences that inform healthcare personnel about the food that the patient should receive or consume.
    */
  var foodPreferenceModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The Identifier.type element can be to indicate filler vs. placer if needed.  This is explained in further detail [here](procedurerequest.html#notes).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Diet given orally in contrast to enteral (tube) feeding.
    */
  var oralDiet: js.UndefOr[NutritionOrderOralDiet] = js.undefined
  
  /**
    * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
    */
  var orderer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_NutritionOrder: typings.fhir.fhirStrings.NutritionOrder
  
  /**
    * Typically the system placing the order sets the status to "requested". Thereafter, the order is maintained by the receiver that updates the status as the request is handled.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[
    proposed | draft | planned | requested | active | `on-hold` | completed | cancelled | `entered-in-error`
  ] = js.undefined
  
  /**
    * Oral nutritional products given in order to add further nutritional value to the patient's diet.
    */
  var supplement: js.UndefOr[js.Array[NutritionOrderSupplement]] = js.undefined
}
object NutritionOrder {
  
  inline def apply(dateTime: String, patient: Reference): NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "NutritionOrder")
    __obj.asInstanceOf[NutritionOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrder] (val x: Self) extends AnyVal {
    
    inline def setAllergyIntolerance(value: js.Array[Reference]): Self = StObject.set(x, "allergyIntolerance", value.asInstanceOf[js.Any])
    
    inline def setAllergyIntoleranceUndefined: Self = StObject.set(x, "allergyIntolerance", js.undefined)
    
    inline def setAllergyIntoleranceVarargs(value: Reference*): Self = StObject.set(x, "allergyIntolerance", js.Array(value*))
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEnteralFormula(value: NutritionOrderEnteralFormula): Self = StObject.set(x, "enteralFormula", value.asInstanceOf[js.Any])
    
    inline def setEnteralFormulaUndefined: Self = StObject.set(x, "enteralFormula", js.undefined)
    
    inline def setExcludeFoodModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "excludeFoodModifier", value.asInstanceOf[js.Any])
    
    inline def setExcludeFoodModifierUndefined: Self = StObject.set(x, "excludeFoodModifier", js.undefined)
    
    inline def setExcludeFoodModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "excludeFoodModifier", js.Array(value*))
    
    inline def setFoodPreferenceModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "foodPreferenceModifier", value.asInstanceOf[js.Any])
    
    inline def setFoodPreferenceModifierUndefined: Self = StObject.set(x, "foodPreferenceModifier", js.undefined)
    
    inline def setFoodPreferenceModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "foodPreferenceModifier", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOralDiet(value: NutritionOrderOralDiet): Self = StObject.set(x, "oralDiet", value.asInstanceOf[js.Any])
    
    inline def setOralDietUndefined: Self = StObject.set(x, "oralDiet", js.undefined)
    
    inline def setOrderer(value: Reference): Self = StObject.set(x, "orderer", value.asInstanceOf[js.Any])
    
    inline def setOrdererUndefined: Self = StObject.set(x, "orderer", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.NutritionOrder): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: proposed | draft | planned | requested | active | `on-hold` | completed | cancelled | `entered-in-error`
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupplement(value: js.Array[NutritionOrderSupplement]): Self = StObject.set(x, "supplement", value.asInstanceOf[js.Any])
    
    inline def setSupplementUndefined: Self = StObject.set(x, "supplement", js.undefined)
    
    inline def setSupplementVarargs(value: NutritionOrderSupplement*): Self = StObject.set(x, "supplement", js.Array(value*))
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
