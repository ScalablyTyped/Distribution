package typings.fhir.fhir

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
  implicit class NutritionOrderOps[Self <: NutritionOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateTime(value: dateTime): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateTime(value: Element): Self = this.set("_dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_dateTime: Self = this.set("_dateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAllergyIntoleranceVarargs(value: Reference*): Self = this.set("allergyIntolerance", js.Array(value :_*))
    
    @scala.inline
    def setAllergyIntolerance(value: js.Array[Reference]): Self = this.set("allergyIntolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllergyIntolerance: Self = this.set("allergyIntolerance", js.undefined)
    
    @scala.inline
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    
    @scala.inline
    def setEnteralFormula(value: NutritionOrderEnteralFormula): Self = this.set("enteralFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnteralFormula: Self = this.set("enteralFormula", js.undefined)
    
    @scala.inline
    def setExcludeFoodModifierVarargs(value: CodeableConcept*): Self = this.set("excludeFoodModifier", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFoodModifier(value: js.Array[CodeableConcept]): Self = this.set("excludeFoodModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFoodModifier: Self = this.set("excludeFoodModifier", js.undefined)
    
    @scala.inline
    def setFoodPreferenceModifierVarargs(value: CodeableConcept*): Self = this.set("foodPreferenceModifier", js.Array(value :_*))
    
    @scala.inline
    def setFoodPreferenceModifier(value: js.Array[CodeableConcept]): Self = this.set("foodPreferenceModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoodPreferenceModifier: Self = this.set("foodPreferenceModifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setOralDiet(value: NutritionOrderOralDiet): Self = this.set("oralDiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOralDiet: Self = this.set("oralDiet", js.undefined)
    
    @scala.inline
    def setOrderer(value: Reference): Self = this.set("orderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderer: Self = this.set("orderer", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSupplementVarargs(value: NutritionOrderSupplement*): Self = this.set("supplement", js.Array(value :_*))
    
    @scala.inline
    def setSupplement(value: js.Array[NutritionOrderSupplement]): Self = this.set("supplement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplement: Self = this.set("supplement", js.undefined)
  }
}
