package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketingStatus
  extends StObject
     with BackboneElement {
  
  var _restoreDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
    */
  var country: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
    */
  var dateRange: js.UndefOr[Period] = js.undefined
  
  /**
    * Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.
    */
  var jurisdiction: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.
    */
  var status: CodeableConcept
}
object MarketingStatus {
  
  inline def apply(status: CodeableConcept): MarketingStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketingStatus]
  }
  
  extension [Self <: MarketingStatus](x: Self) {
    
    inline def setCountry(value: CodeableConcept): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDateRange(value: Period): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setJurisdiction(value: CodeableConcept): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setRestoreDate(value: String): Self = StObject.set(x, "restoreDate", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateUndefined: Self = StObject.set(x, "restoreDate", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_restoreDate(value: Element): Self = StObject.set(x, "_restoreDate", value.asInstanceOf[js.Any])
    
    inline def set_restoreDateUndefined: Self = StObject.set(x, "_restoreDate", js.undefined)
  }
}
