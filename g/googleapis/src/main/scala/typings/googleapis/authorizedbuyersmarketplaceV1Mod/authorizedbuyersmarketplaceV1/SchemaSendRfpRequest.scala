package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSendRfpRequest extends StObject {
  
  /**
    * Contact information for the buyer.
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContact]] = js.undefined
  
  /**
    * If the current buyer is sending the RFP on behalf of its client, use this field to specify the name of the client in the format: `buyers/{accountId\}/clients/{clientAccountid\}`.
    */
  var client: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the proposal being created by this RFP.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend for the proposal. Publishers will receive this information and send back proposed deals accordingly.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Required. Proposed flight end time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note that the specified value will be truncated to a granularity of one second.
    */
  var flightEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Proposed flight start time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note that the specified value will be truncated to a granularity of one second.
    */
  var flightStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Geo criteria IDs to be targeted. Refer to Geo tables.
    */
  var geoTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * Inventory sizes to be targeted.
    */
  var inventorySizeTargeting: js.UndefOr[SchemaInventorySizeTargeting] = js.undefined
  
  /**
    * A message that is sent to the publisher. Maximum length is 1024 characters.
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The terms for preferred deals.
    */
  var preferredDealTerms: js.UndefOr[SchemaPreferredDealTerms] = js.undefined
  
  /**
    * The terms for programmatic guaranteed deals.
    */
  var programmaticGuaranteedTerms: js.UndefOr[SchemaProgrammaticGuaranteedTerms] = js.undefined
  
  /**
    * Required. The profile of the publisher who will receive this RFP in the format: `buyers/{accountId\}/publisherProfiles/{publisherProfileId\}`.
    */
  var publisherProfile: js.UndefOr[String | Null] = js.undefined
}
object SchemaSendRfpRequest {
  
  inline def apply(): SchemaSendRfpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendRfpRequest]
  }
  
  extension [Self <: SchemaSendRfpRequest](x: Self) {
    
    inline def setBuyerContacts(value: js.Array[SchemaContact]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    inline def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    inline def setBuyerContactsVarargs(value: SchemaContact*): Self = StObject.set(x, "buyerContacts", js.Array(value*))
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientNull: Self = StObject.set(x, "client", null)
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEstimatedGrossSpend(value: SchemaMoney): Self = StObject.set(x, "estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    inline def setEstimatedGrossSpendUndefined: Self = StObject.set(x, "estimatedGrossSpend", js.undefined)
    
    inline def setFlightEndTime(value: String): Self = StObject.set(x, "flightEndTime", value.asInstanceOf[js.Any])
    
    inline def setFlightEndTimeNull: Self = StObject.set(x, "flightEndTime", null)
    
    inline def setFlightEndTimeUndefined: Self = StObject.set(x, "flightEndTime", js.undefined)
    
    inline def setFlightStartTime(value: String): Self = StObject.set(x, "flightStartTime", value.asInstanceOf[js.Any])
    
    inline def setFlightStartTimeNull: Self = StObject.set(x, "flightStartTime", null)
    
    inline def setFlightStartTimeUndefined: Self = StObject.set(x, "flightStartTime", js.undefined)
    
    inline def setGeoTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    inline def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPreferredDealTerms(value: SchemaPreferredDealTerms): Self = StObject.set(x, "preferredDealTerms", value.asInstanceOf[js.Any])
    
    inline def setPreferredDealTermsUndefined: Self = StObject.set(x, "preferredDealTerms", js.undefined)
    
    inline def setProgrammaticGuaranteedTerms(value: SchemaProgrammaticGuaranteedTerms): Self = StObject.set(x, "programmaticGuaranteedTerms", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticGuaranteedTermsUndefined: Self = StObject.set(x, "programmaticGuaranteedTerms", js.undefined)
    
    inline def setPublisherProfile(value: String): Self = StObject.set(x, "publisherProfile", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileNull: Self = StObject.set(x, "publisherProfile", null)
    
    inline def setPublisherProfileUndefined: Self = StObject.set(x, "publisherProfile", js.undefined)
  }
}
