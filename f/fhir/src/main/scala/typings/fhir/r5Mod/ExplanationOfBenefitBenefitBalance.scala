package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitBenefitBalance
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _excluded: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: CodeableConcept
  
  /**
    * For example, 'DENT2 covers 100% of basic, 50% of major but excludes Ortho, Implants and Cosmetic services'.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * True if the indicated class of service is excluded from the plan, missing or False indicates the product or service is included in the coverage.
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Benefits Used to date.
    */
  var financial: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalanceFinancial]] = js.undefined
  
  /**
    * For example: MED01, or DENT2.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network providers.
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual visits'.
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates if the benefits apply to an individual or to the family.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitBenefitBalance {
  
  inline def apply(category: CodeableConcept): ExplanationOfBenefitBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitBenefitBalance]
  }
  
  extension [Self <: ExplanationOfBenefitBenefitBalance](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setFinancial(value: js.Array[ExplanationOfBenefitBenefitBalanceFinancial]): Self = StObject.set(x, "financial", value.asInstanceOf[js.Any])
    
    inline def setFinancialUndefined: Self = StObject.set(x, "financial", js.undefined)
    
    inline def setFinancialVarargs(value: ExplanationOfBenefitBenefitBalanceFinancial*): Self = StObject.set(x, "financial", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: CodeableConcept): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
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
