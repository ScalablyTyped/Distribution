package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderEnteralFormula
  extends StObject
     with BackboneElement {
  
  var _additiveProductName: js.UndefOr[Element] = js.undefined
  
  var _administrationInstruction: js.UndefOr[Element] = js.undefined
  
  var _baseFormulaProductName: js.UndefOr[Element] = js.undefined
  
  /**
    * The product or brand name of the type of modular component to be added to the formula.
    */
  var additiveProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
    */
  var additiveType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * See implementation notes below for further discussion on how to order continuous vs bolus enteral feeding using this resource.
    */
  var administration: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdministration]] = js.undefined
  
  /**
    * Free text dosage instructions can be used for cases where the instructions are too complex to code.
    */
  var administrationInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
    */
  var baseFormulaProductName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
    */
  var baseFormulaType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL.
    */
  var caloricDensity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
    */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
    */
  var routeofAdministration: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderEnteralFormula {
  
  inline def apply(): NutritionOrderEnteralFormula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormula]
  }
  
  extension [Self <: NutritionOrderEnteralFormula](x: Self) {
    
    inline def setAdditiveProductName(value: String): Self = StObject.set(x, "additiveProductName", value.asInstanceOf[js.Any])
    
    inline def setAdditiveProductNameUndefined: Self = StObject.set(x, "additiveProductName", js.undefined)
    
    inline def setAdditiveType(value: CodeableConcept): Self = StObject.set(x, "additiveType", value.asInstanceOf[js.Any])
    
    inline def setAdditiveTypeUndefined: Self = StObject.set(x, "additiveType", js.undefined)
    
    inline def setAdministration(value: js.Array[NutritionOrderEnteralFormulaAdministration]): Self = StObject.set(x, "administration", value.asInstanceOf[js.Any])
    
    inline def setAdministrationInstruction(value: String): Self = StObject.set(x, "administrationInstruction", value.asInstanceOf[js.Any])
    
    inline def setAdministrationInstructionUndefined: Self = StObject.set(x, "administrationInstruction", js.undefined)
    
    inline def setAdministrationUndefined: Self = StObject.set(x, "administration", js.undefined)
    
    inline def setAdministrationVarargs(value: NutritionOrderEnteralFormulaAdministration*): Self = StObject.set(x, "administration", js.Array(value*))
    
    inline def setBaseFormulaProductName(value: String): Self = StObject.set(x, "baseFormulaProductName", value.asInstanceOf[js.Any])
    
    inline def setBaseFormulaProductNameUndefined: Self = StObject.set(x, "baseFormulaProductName", js.undefined)
    
    inline def setBaseFormulaType(value: CodeableConcept): Self = StObject.set(x, "baseFormulaType", value.asInstanceOf[js.Any])
    
    inline def setBaseFormulaTypeUndefined: Self = StObject.set(x, "baseFormulaType", js.undefined)
    
    inline def setCaloricDensity(value: Quantity): Self = StObject.set(x, "caloricDensity", value.asInstanceOf[js.Any])
    
    inline def setCaloricDensityUndefined: Self = StObject.set(x, "caloricDensity", js.undefined)
    
    inline def setMaxVolumeToDeliver(value: Quantity): Self = StObject.set(x, "maxVolumeToDeliver", value.asInstanceOf[js.Any])
    
    inline def setMaxVolumeToDeliverUndefined: Self = StObject.set(x, "maxVolumeToDeliver", js.undefined)
    
    inline def setRouteofAdministration(value: CodeableConcept): Self = StObject.set(x, "routeofAdministration", value.asInstanceOf[js.Any])
    
    inline def setRouteofAdministrationUndefined: Self = StObject.set(x, "routeofAdministration", js.undefined)
    
    inline def set_additiveProductName(value: Element): Self = StObject.set(x, "_additiveProductName", value.asInstanceOf[js.Any])
    
    inline def set_additiveProductNameUndefined: Self = StObject.set(x, "_additiveProductName", js.undefined)
    
    inline def set_administrationInstruction(value: Element): Self = StObject.set(x, "_administrationInstruction", value.asInstanceOf[js.Any])
    
    inline def set_administrationInstructionUndefined: Self = StObject.set(x, "_administrationInstruction", js.undefined)
    
    inline def set_baseFormulaProductName(value: Element): Self = StObject.set(x, "_baseFormulaProductName", value.asInstanceOf[js.Any])
    
    inline def set_baseFormulaProductNameUndefined: Self = StObject.set(x, "_baseFormulaProductName", js.undefined)
  }
}
