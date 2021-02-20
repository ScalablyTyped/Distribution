package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Diet, formula or nutritional supplement request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait NutritionOrder extends DomainResource {
  
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * List of the patient's food and nutrition-related allergies and intolerances
    */
  var allergyIntolerance: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Date and time the nutrition order was requested
    */
  var dateTime: typings.fhir.fhir.dateTime = js.native
  
  /**
    * The encounter associated with this nutrition order
    */
  var encounter: js.UndefOr[Reference] = js.native
  
  /**
    * Enteral formula components
    */
  var enteralFormula: js.UndefOr[NutritionOrderEnteralFormula] = js.native
  
  /**
    * Order-specific modifier about the type of food that should not be given
    */
  var excludeFoodModifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Order-specific modifier about the type of food that should be given
    */
  var foodPreferenceModifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Oral diet components
    */
  var oralDiet: js.UndefOr[NutritionOrderOralDiet] = js.native
  
  /**
    * Who ordered the diet, formula or nutritional supplement
    */
  var orderer: js.UndefOr[Reference] = js.native
  
  /**
    * The person who requires the diet, formula or nutritional supplement
    */
  var patient: Reference = js.native
  
  /**
    * proposed | draft | planned | requested | active | on-hold | completed | cancelled | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Supplement components
    */
  var supplement: js.UndefOr[js.Array[NutritionOrderSupplement]] = js.native
}
object NutritionOrder {
  
  @scala.inline
  def apply(dateTime: dateTime, patient: Reference): NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionOrder]
  }
  
  @scala.inline
  implicit class NutritionOrderMutableBuilder[Self <: NutritionOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllergyIntolerance(value: js.Array[Reference]): Self = StObject.set(x, "allergyIntolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllergyIntoleranceUndefined: Self = StObject.set(x, "allergyIntolerance", js.undefined)
    
    @scala.inline
    def setAllergyIntoleranceVarargs(value: Reference*): Self = StObject.set(x, "allergyIntolerance", js.Array(value :_*))
    
    @scala.inline
    def setDateTime(value: dateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setEnteralFormula(value: NutritionOrderEnteralFormula): Self = StObject.set(x, "enteralFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnteralFormulaUndefined: Self = StObject.set(x, "enteralFormula", js.undefined)
    
    @scala.inline
    def setExcludeFoodModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "excludeFoodModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFoodModifierUndefined: Self = StObject.set(x, "excludeFoodModifier", js.undefined)
    
    @scala.inline
    def setExcludeFoodModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "excludeFoodModifier", js.Array(value :_*))
    
    @scala.inline
    def setFoodPreferenceModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "foodPreferenceModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoodPreferenceModifierUndefined: Self = StObject.set(x, "foodPreferenceModifier", js.undefined)
    
    @scala.inline
    def setFoodPreferenceModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "foodPreferenceModifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setOralDiet(value: NutritionOrderOralDiet): Self = StObject.set(x, "oralDiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOralDietUndefined: Self = StObject.set(x, "oralDiet", js.undefined)
    
    @scala.inline
    def setOrderer(value: Reference): Self = StObject.set(x, "orderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdererUndefined: Self = StObject.set(x, "orderer", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSupplement(value: js.Array[NutritionOrderSupplement]): Self = StObject.set(x, "supplement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementUndefined: Self = StObject.set(x, "supplement", js.undefined)
    
    @scala.inline
    def setSupplementVarargs(value: NutritionOrderSupplement*): Self = StObject.set(x, "supplement", js.Array(value :_*))
    
    @scala.inline
    def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
