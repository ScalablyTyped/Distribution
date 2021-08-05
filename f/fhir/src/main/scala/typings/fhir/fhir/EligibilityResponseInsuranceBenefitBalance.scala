package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Benefits by Category
  */
trait EligibilityResponseInsuranceBenefitBalance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'excluded'.
    */
  var _excluded: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of services covered
    */
  var category: CodeableConcept
  
  /**
    * Description of the benefit or services covered
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Excluded from the plan
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Benefit Summary
    */
  var financial: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]] = js.undefined
  
  /**
    * Short name for the benefit
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * In or out of network
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Detailed services covered within the type
    */
  var subCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Annual or lifetime
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Individual or family
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object EligibilityResponseInsuranceBenefitBalance {
  
  inline def apply(category: CodeableConcept): EligibilityResponseInsuranceBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalance]
  }
  
  extension [Self <: EligibilityResponseInsuranceBenefitBalance](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setFinancial(value: js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]): Self = StObject.set(x, "financial", value.asInstanceOf[js.Any])
    
    inline def setFinancialUndefined: Self = StObject.set(x, "financial", js.undefined)
    
    inline def setFinancialVarargs(value: EligibilityResponseInsuranceBenefitBalanceFinancial*): Self = StObject.set(x, "financial", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: CodeableConcept): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSubCategory(value: CodeableConcept): Self = StObject.set(x, "subCategory", value.asInstanceOf[js.Any])
    
    inline def setSubCategoryUndefined: Self = StObject.set(x, "subCategory", js.undefined)
    
    inline def setTerm(value: CodeableConcept): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_excluded(value: Element): Self = StObject.set(x, "_excluded", value.asInstanceOf[js.Any])
    
    inline def set_excludedUndefined: Self = StObject.set(x, "_excluded", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
