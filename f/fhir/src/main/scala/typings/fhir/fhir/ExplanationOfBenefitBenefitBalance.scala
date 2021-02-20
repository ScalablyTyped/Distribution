package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Balance by Benefit Category
  */
@js.native
trait ExplanationOfBenefitBenefitBalance extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'excluded'.
    */
  var _excluded: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Type of services covered
    */
  var category: CodeableConcept = js.native
  
  /**
    * Description of the benefit or services covered
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Excluded from the plan
    */
  var excluded: js.UndefOr[Boolean] = js.native
  
  /**
    * Benefit Summary
    */
  var financial: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalanceFinancial]] = js.native
  
  /**
    * Short name for the benefit
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * In or out of network
    */
  var network: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Detailed services covered within the type
    */
  var subCategory: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Annual or lifetime
    */
  var term: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Individual or family
    */
  var unit: js.UndefOr[CodeableConcept] = js.native
}
object ExplanationOfBenefitBenefitBalance {
  
  @scala.inline
  def apply(category: CodeableConcept): ExplanationOfBenefitBenefitBalance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitBenefitBalance]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitBenefitBalanceMutableBuilder[Self <: ExplanationOfBenefitBenefitBalance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    @scala.inline
    def setFinancial(value: js.Array[ExplanationOfBenefitBenefitBalanceFinancial]): Self = StObject.set(x, "financial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinancialUndefined: Self = StObject.set(x, "financial", js.undefined)
    
    @scala.inline
    def setFinancialVarargs(value: ExplanationOfBenefitBenefitBalanceFinancial*): Self = StObject.set(x, "financial", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: CodeableConcept): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setSubCategory(value: CodeableConcept): Self = StObject.set(x, "subCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCategoryUndefined: Self = StObject.set(x, "subCategory", js.undefined)
    
    @scala.inline
    def setTerm(value: CodeableConcept): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_excluded(value: Element): Self = StObject.set(x, "_excluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludedUndefined: Self = StObject.set(x, "_excluded", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
