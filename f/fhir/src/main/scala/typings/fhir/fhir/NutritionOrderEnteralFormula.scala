package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enteral formula components
  */
trait NutritionOrderEnteralFormula
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'additiveProductName'.
    */
  var _additiveProductName: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'administrationInstruction'.
    */
  var _administrationInstruction: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'baseFormulaProductName'.
    */
  var _baseFormulaProductName: js.UndefOr[Element] = js.undefined
  
  /**
    * Product or brand name of the modular additive
    */
  var additiveProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of modular component to add to the feeding
    */
  var additiveType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Formula feeding instruction as structured data
    */
  var administration: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdministration]] = js.undefined
  
  /**
    * Formula feeding instructions expressed as text
    */
  var administrationInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * Product or brand name of the enteral or infant formula
    */
  var baseFormulaProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of enteral or infant formula
    */
  var baseFormulaType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Amount of energy per specified volume that is required
    */
  var caloricDensity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Upper limit on formula volume per unit of time
    */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.undefined
  
  /**
    * How the formula should enter the patient's gastrointestinal tract
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
    
    inline def setAdministrationVarargs(value: NutritionOrderEnteralFormulaAdministration*): Self = StObject.set(x, "administration", js.Array(value :_*))
    
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
