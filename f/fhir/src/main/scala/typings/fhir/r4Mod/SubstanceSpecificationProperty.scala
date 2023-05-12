package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecificationProperty
  extends StObject
     with BackboneElement {
  
  var _amountString: js.UndefOr[Element] = js.undefined
  
  var _parameters: js.UndefOr[Element] = js.undefined
  
  /**
    * Quantitative value for this property.
    */
  var amountQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Quantitative value for this property.
    */
  var amountString: js.UndefOr[String] = js.undefined
  
  /**
    * A category for this property, e.g. Physical, Chemical, Enzymatic.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Property type e.g. viscosity, pH, isoelectric point.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol).
    */
  var definingSubstanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol).
    */
  var definingSubstanceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C with a pH of 7.1).
    */
  var parameters: js.UndefOr[String] = js.undefined
}
object SubstanceSpecificationProperty {
  
  inline def apply(): SubstanceSpecificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSpecificationProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecificationProperty] (val x: Self) extends AnyVal {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDefiningSubstanceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "definingSubstanceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDefiningSubstanceCodeableConceptUndefined: Self = StObject.set(x, "definingSubstanceCodeableConcept", js.undefined)
    
    inline def setDefiningSubstanceReference(value: Reference): Self = StObject.set(x, "definingSubstanceReference", value.asInstanceOf[js.Any])
    
    inline def setDefiningSubstanceReferenceUndefined: Self = StObject.set(x, "definingSubstanceReference", js.undefined)
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
    
    inline def set_parameters(value: Element): Self = StObject.set(x, "_parameters", value.asInstanceOf[js.Any])
    
    inline def set_parametersUndefined: Self = StObject.set(x, "_parameters", js.undefined)
  }
}
