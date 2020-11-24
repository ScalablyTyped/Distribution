package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enteral formula components
  */
@js.native
trait NutritionOrderEnteralFormula extends BackboneElement {
  
  /**
    * Contains extended information for property 'additiveProductName'.
    */
  var _additiveProductName: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'administrationInstruction'.
    */
  var _administrationInstruction: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'baseFormulaProductName'.
    */
  var _baseFormulaProductName: js.UndefOr[Element] = js.native
  
  /**
    * Product or brand name of the modular additive
    */
  var additiveProductName: js.UndefOr[String] = js.native
  
  /**
    * Type of modular component to add to the feeding
    */
  var additiveType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Formula feeding instruction as structured data
    */
  var administration: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdministration]] = js.native
  
  /**
    * Formula feeding instructions expressed as text
    */
  var administrationInstruction: js.UndefOr[String] = js.native
  
  /**
    * Product or brand name of the enteral or infant formula
    */
  var baseFormulaProductName: js.UndefOr[String] = js.native
  
  /**
    * Type of enteral or infant formula
    */
  var baseFormulaType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Amount of energy per specified volume that is required
    */
  var caloricDensity: js.UndefOr[Quantity] = js.native
  
  /**
    * Upper limit on formula volume per unit of time
    */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.native
  
  /**
    * How the formula should enter the patient's gastrointestinal tract
    */
  var routeofAdministration: js.UndefOr[CodeableConcept] = js.native
}
object NutritionOrderEnteralFormula {
  
  @scala.inline
  def apply(): NutritionOrderEnteralFormula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormula]
  }
  
  @scala.inline
  implicit class NutritionOrderEnteralFormulaOps[Self <: NutritionOrderEnteralFormula] (val x: Self) extends AnyVal {
    
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
    def set_additiveProductName(value: Element): Self = this.set("_additiveProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_additiveProductName: Self = this.set("_additiveProductName", js.undefined)
    
    @scala.inline
    def set_administrationInstruction(value: Element): Self = this.set("_administrationInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_administrationInstruction: Self = this.set("_administrationInstruction", js.undefined)
    
    @scala.inline
    def set_baseFormulaProductName(value: Element): Self = this.set("_baseFormulaProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_baseFormulaProductName: Self = this.set("_baseFormulaProductName", js.undefined)
    
    @scala.inline
    def setAdditiveProductName(value: String): Self = this.set("additiveProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditiveProductName: Self = this.set("additiveProductName", js.undefined)
    
    @scala.inline
    def setAdditiveType(value: CodeableConcept): Self = this.set("additiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditiveType: Self = this.set("additiveType", js.undefined)
    
    @scala.inline
    def setAdministrationVarargs(value: NutritionOrderEnteralFormulaAdministration*): Self = this.set("administration", js.Array(value :_*))
    
    @scala.inline
    def setAdministration(value: js.Array[NutritionOrderEnteralFormulaAdministration]): Self = this.set("administration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministration: Self = this.set("administration", js.undefined)
    
    @scala.inline
    def setAdministrationInstruction(value: String): Self = this.set("administrationInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrationInstruction: Self = this.set("administrationInstruction", js.undefined)
    
    @scala.inline
    def setBaseFormulaProductName(value: String): Self = this.set("baseFormulaProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFormulaProductName: Self = this.set("baseFormulaProductName", js.undefined)
    
    @scala.inline
    def setBaseFormulaType(value: CodeableConcept): Self = this.set("baseFormulaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFormulaType: Self = this.set("baseFormulaType", js.undefined)
    
    @scala.inline
    def setCaloricDensity(value: Quantity): Self = this.set("caloricDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaloricDensity: Self = this.set("caloricDensity", js.undefined)
    
    @scala.inline
    def setMaxVolumeToDeliver(value: Quantity): Self = this.set("maxVolumeToDeliver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVolumeToDeliver: Self = this.set("maxVolumeToDeliver", js.undefined)
    
    @scala.inline
    def setRouteofAdministration(value: CodeableConcept): Self = this.set("routeofAdministration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteofAdministration: Self = this.set("routeofAdministration", js.undefined)
  }
}
