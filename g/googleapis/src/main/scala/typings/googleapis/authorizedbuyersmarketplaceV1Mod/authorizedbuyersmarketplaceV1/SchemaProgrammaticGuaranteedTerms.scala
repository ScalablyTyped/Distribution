package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProgrammaticGuaranteedTerms extends StObject {
  
  /**
    * Fixed price for the deal.
    */
  var fixedPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Count of guaranteed looks.
    */
  var guaranteedLooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The lifetime impression cap for CPM Sponsorship deals. Deal will stop serving when cap is reached.
    */
  var impressionCap: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For sponsorship deals, this is the percentage of the seller's eligible impressions that the deal will serve until the cap is reached. Valid value is within range 0~100.
    */
  var percentShareOfVoice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reservation type for a Programmatic Guaranteed deal. This indicates whether the number of impressions is fixed, or a percent of available impressions. If not specified, the default reservation type is STANDARD.
    */
  var reservationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaProgrammaticGuaranteedTerms {
  
  inline def apply(): SchemaProgrammaticGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProgrammaticGuaranteedTerms]
  }
  
  extension [Self <: SchemaProgrammaticGuaranteedTerms](x: Self) {
    
    inline def setFixedPrice(value: SchemaPrice): Self = StObject.set(x, "fixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "fixedPrice", js.undefined)
    
    inline def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedLooksNull: Self = StObject.set(x, "guaranteedLooks", null)
    
    inline def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    inline def setImpressionCap(value: String): Self = StObject.set(x, "impressionCap", value.asInstanceOf[js.Any])
    
    inline def setImpressionCapNull: Self = StObject.set(x, "impressionCap", null)
    
    inline def setImpressionCapUndefined: Self = StObject.set(x, "impressionCap", js.undefined)
    
    inline def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    inline def setMinimumDailyLooksNull: Self = StObject.set(x, "minimumDailyLooks", null)
    
    inline def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
    
    inline def setPercentShareOfVoice(value: String): Self = StObject.set(x, "percentShareOfVoice", value.asInstanceOf[js.Any])
    
    inline def setPercentShareOfVoiceNull: Self = StObject.set(x, "percentShareOfVoice", null)
    
    inline def setPercentShareOfVoiceUndefined: Self = StObject.set(x, "percentShareOfVoice", js.undefined)
    
    inline def setReservationType(value: String): Self = StObject.set(x, "reservationType", value.asInstanceOf[js.Any])
    
    inline def setReservationTypeNull: Self = StObject.set(x, "reservationType", null)
    
    inline def setReservationTypeUndefined: Self = StObject.set(x, "reservationType", js.undefined)
  }
}
