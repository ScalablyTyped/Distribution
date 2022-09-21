package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponseInsuranceItem
  extends StObject
     with BackboneElement {
  
  var _authorizationRequired: js.UndefOr[Element] = js.undefined
  
  var _authorizationUrl: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _excluded: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * A boolean flag indicating whether a preauthorization is required prior to actual service delivery.
    */
  var authorizationRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Codes or comments regarding information or actions associated with the preauthorization.
    */
  var authorizationSupporting: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A web location for obtaining requirements or descriptive information regarding the preauthorization.
    */
  var authorizationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Benefits used to date.
    */
  var benefit: js.UndefOr[js.Array[CoverageEligibilityResponseInsuranceItemBenefit]] = js.undefined
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example 'DENT2 covers 100% of basic, 50% of major but excludes Ortho, Implants and Cosmetic services'.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * True if the indicated class of service is excluded from the plan, missing or False indicates the product or service is included in the coverage.
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical whether the treatment was outside the clinic or out of office hours.
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example: MED01, or DENT2.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network providers.
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code to indicate the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm, ACHI, CCI).
    */
  var productOrService: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The practitioner who is eligible for the provision of the product or service.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual visits'.
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates if the benefits apply to an individual or to the family.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object CoverageEligibilityResponseInsuranceItem {
  
  inline def apply(): CoverageEligibilityResponseInsuranceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageEligibilityResponseInsuranceItem]
  }
  
  extension [Self <: CoverageEligibilityResponseInsuranceItem](x: Self) {
    
    inline def setAuthorizationRequired(value: Boolean): Self = StObject.set(x, "authorizationRequired", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationRequiredUndefined: Self = StObject.set(x, "authorizationRequired", js.undefined)
    
    inline def setAuthorizationSupporting(value: js.Array[CodeableConcept]): Self = StObject.set(x, "authorizationSupporting", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationSupportingUndefined: Self = StObject.set(x, "authorizationSupporting", js.undefined)
    
    inline def setAuthorizationSupportingVarargs(value: CodeableConcept*): Self = StObject.set(x, "authorizationSupporting", js.Array(value*))
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
    
    inline def setBenefit(value: js.Array[CoverageEligibilityResponseInsuranceItemBenefit]): Self = StObject.set(x, "benefit", value.asInstanceOf[js.Any])
    
    inline def setBenefitUndefined: Self = StObject.set(x, "benefit", js.undefined)
    
    inline def setBenefitVarargs(value: CoverageEligibilityResponseInsuranceItemBenefit*): Self = StObject.set(x, "benefit", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: CodeableConcept): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProductOrService(value: CodeableConcept): Self = StObject.set(x, "productOrService", value.asInstanceOf[js.Any])
    
    inline def setProductOrServiceUndefined: Self = StObject.set(x, "productOrService", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setTerm(value: CodeableConcept): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def set_authorizationRequired(value: Element): Self = StObject.set(x, "_authorizationRequired", value.asInstanceOf[js.Any])
    
    inline def set_authorizationRequiredUndefined: Self = StObject.set(x, "_authorizationRequired", js.undefined)
    
    inline def set_authorizationUrl(value: Element): Self = StObject.set(x, "_authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def set_authorizationUrlUndefined: Self = StObject.set(x, "_authorizationUrl", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_excluded(value: Element): Self = StObject.set(x, "_excluded", value.asInstanceOf[js.Any])
    
    inline def set_excludedUndefined: Self = StObject.set(x, "_excluded", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
