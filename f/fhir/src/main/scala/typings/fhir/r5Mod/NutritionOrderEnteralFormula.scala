package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderEnteralFormula
  extends StObject
     with BackboneElement {
  
  var _administrationInstruction: js.UndefOr[Element] = js.undefined
  
  var _baseFormulaProductName: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates modular components to be provided in addition or mixed with the base formula.
    */
  var additive: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdditive]] = js.undefined
  
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
  var baseFormulaType: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL.
    */
  var caloricDensity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The intended type of device that is to be used for the administration of the enteral formula.
    */
  var deliveryDevice: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
    */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
    */
  var routeOfAdministration: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderEnteralFormula {
  
  inline def apply(): NutritionOrderEnteralFormula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormula]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderEnteralFormula] (val x: Self) extends AnyVal {
    
    inline def setAdditive(value: js.Array[NutritionOrderEnteralFormulaAdditive]): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    inline def setAdditiveVarargs(value: NutritionOrderEnteralFormulaAdditive*): Self = StObject.set(x, "additive", js.Array(value*))
    
    inline def setAdministration(value: js.Array[NutritionOrderEnteralFormulaAdministration]): Self = StObject.set(x, "administration", value.asInstanceOf[js.Any])
    
    inline def setAdministrationInstruction(value: String): Self = StObject.set(x, "administrationInstruction", value.asInstanceOf[js.Any])
    
    inline def setAdministrationInstructionUndefined: Self = StObject.set(x, "administrationInstruction", js.undefined)
    
    inline def setAdministrationUndefined: Self = StObject.set(x, "administration", js.undefined)
    
    inline def setAdministrationVarargs(value: NutritionOrderEnteralFormulaAdministration*): Self = StObject.set(x, "administration", js.Array(value*))
    
    inline def setBaseFormulaProductName(value: String): Self = StObject.set(x, "baseFormulaProductName", value.asInstanceOf[js.Any])
    
    inline def setBaseFormulaProductNameUndefined: Self = StObject.set(x, "baseFormulaProductName", js.undefined)
    
    inline def setBaseFormulaType(value: CodeableReference): Self = StObject.set(x, "baseFormulaType", value.asInstanceOf[js.Any])
    
    inline def setBaseFormulaTypeUndefined: Self = StObject.set(x, "baseFormulaType", js.undefined)
    
    inline def setCaloricDensity(value: Quantity): Self = StObject.set(x, "caloricDensity", value.asInstanceOf[js.Any])
    
    inline def setCaloricDensityUndefined: Self = StObject.set(x, "caloricDensity", js.undefined)
    
    inline def setDeliveryDevice(value: js.Array[CodeableReference]): Self = StObject.set(x, "deliveryDevice", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDeviceUndefined: Self = StObject.set(x, "deliveryDevice", js.undefined)
    
    inline def setDeliveryDeviceVarargs(value: CodeableReference*): Self = StObject.set(x, "deliveryDevice", js.Array(value*))
    
    inline def setMaxVolumeToDeliver(value: Quantity): Self = StObject.set(x, "maxVolumeToDeliver", value.asInstanceOf[js.Any])
    
    inline def setMaxVolumeToDeliverUndefined: Self = StObject.set(x, "maxVolumeToDeliver", js.undefined)
    
    inline def setRouteOfAdministration(value: CodeableConcept): Self = StObject.set(x, "routeOfAdministration", value.asInstanceOf[js.Any])
    
    inline def setRouteOfAdministrationUndefined: Self = StObject.set(x, "routeOfAdministration", js.undefined)
    
    inline def set_administrationInstruction(value: Element): Self = StObject.set(x, "_administrationInstruction", value.asInstanceOf[js.Any])
    
    inline def set_administrationInstructionUndefined: Self = StObject.set(x, "_administrationInstruction", js.undefined)
    
    inline def set_baseFormulaProductName(value: Element): Self = StObject.set(x, "_baseFormulaProductName", value.asInstanceOf[js.Any])
    
    inline def set_baseFormulaProductNameUndefined: Self = StObject.set(x, "_baseFormulaProductName", js.undefined)
  }
}
