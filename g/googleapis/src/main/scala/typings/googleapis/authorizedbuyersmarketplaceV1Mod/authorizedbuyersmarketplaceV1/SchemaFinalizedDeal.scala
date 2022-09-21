package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFinalizedDeal extends StObject {
  
  /**
    * A copy of the Deal made upon finalization. During renegotiation, this will reflect the last finalized deal before renegotiation was initiated.
    */
  var deal: js.UndefOr[SchemaDeal] = js.undefined
  
  /**
    * Information related to deal pausing for the deal.
    */
  var dealPausingInfo: js.UndefOr[SchemaDealPausingInfo] = js.undefined
  
  /**
    * Serving status of the deal.
    */
  var dealServingStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the finalized deal. Format: `buyers/{accountId\}/finalizeddeals/{finalizedDealId\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the Programmatic Guaranteed deal is ready for serving.
    */
  var readyToServe: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Real-time bidding metrics for this deal.
    */
  var rtbMetrics: js.UndefOr[SchemaRtbMetrics] = js.undefined
}
object SchemaFinalizedDeal {
  
  inline def apply(): SchemaFinalizedDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinalizedDeal]
  }
  
  extension [Self <: SchemaFinalizedDeal](x: Self) {
    
    inline def setDeal(value: SchemaDeal): Self = StObject.set(x, "deal", value.asInstanceOf[js.Any])
    
    inline def setDealPausingInfo(value: SchemaDealPausingInfo): Self = StObject.set(x, "dealPausingInfo", value.asInstanceOf[js.Any])
    
    inline def setDealPausingInfoUndefined: Self = StObject.set(x, "dealPausingInfo", js.undefined)
    
    inline def setDealServingStatus(value: String): Self = StObject.set(x, "dealServingStatus", value.asInstanceOf[js.Any])
    
    inline def setDealServingStatusNull: Self = StObject.set(x, "dealServingStatus", null)
    
    inline def setDealServingStatusUndefined: Self = StObject.set(x, "dealServingStatus", js.undefined)
    
    inline def setDealUndefined: Self = StObject.set(x, "deal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadyToServe(value: Boolean): Self = StObject.set(x, "readyToServe", value.asInstanceOf[js.Any])
    
    inline def setReadyToServeNull: Self = StObject.set(x, "readyToServe", null)
    
    inline def setReadyToServeUndefined: Self = StObject.set(x, "readyToServe", js.undefined)
    
    inline def setRtbMetrics(value: SchemaRtbMetrics): Self = StObject.set(x, "rtbMetrics", value.asInstanceOf[js.Any])
    
    inline def setRtbMetricsUndefined: Self = StObject.set(x, "rtbMetrics", js.undefined)
  }
}
