package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRtbMetrics extends StObject {
  
  /**
    * Ad impressions in last 7 days.
    */
  var adImpressions7Days: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bid rate in last 7 days, calculated by (bids / bid requests).
    */
  var bidRate7Days: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Bid requests in last 7 days.
    */
  var bidRequests7Days: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bids in last 7 days.
    */
  var bids7Days: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filtered bid rate in last 7 days, calculated by (filtered bids / bids).
    */
  var filteredBidRate7Days: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must bid rate for current month.
    */
  var mustBidRateCurrentMonth: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRtbMetrics {
  
  inline def apply(): SchemaRtbMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRtbMetrics]
  }
  
  extension [Self <: SchemaRtbMetrics](x: Self) {
    
    inline def setAdImpressions7Days(value: String): Self = StObject.set(x, "adImpressions7Days", value.asInstanceOf[js.Any])
    
    inline def setAdImpressions7DaysNull: Self = StObject.set(x, "adImpressions7Days", null)
    
    inline def setAdImpressions7DaysUndefined: Self = StObject.set(x, "adImpressions7Days", js.undefined)
    
    inline def setBidRate7Days(value: Double): Self = StObject.set(x, "bidRate7Days", value.asInstanceOf[js.Any])
    
    inline def setBidRate7DaysNull: Self = StObject.set(x, "bidRate7Days", null)
    
    inline def setBidRate7DaysUndefined: Self = StObject.set(x, "bidRate7Days", js.undefined)
    
    inline def setBidRequests7Days(value: String): Self = StObject.set(x, "bidRequests7Days", value.asInstanceOf[js.Any])
    
    inline def setBidRequests7DaysNull: Self = StObject.set(x, "bidRequests7Days", null)
    
    inline def setBidRequests7DaysUndefined: Self = StObject.set(x, "bidRequests7Days", js.undefined)
    
    inline def setBids7Days(value: String): Self = StObject.set(x, "bids7Days", value.asInstanceOf[js.Any])
    
    inline def setBids7DaysNull: Self = StObject.set(x, "bids7Days", null)
    
    inline def setBids7DaysUndefined: Self = StObject.set(x, "bids7Days", js.undefined)
    
    inline def setFilteredBidRate7Days(value: Double): Self = StObject.set(x, "filteredBidRate7Days", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidRate7DaysNull: Self = StObject.set(x, "filteredBidRate7Days", null)
    
    inline def setFilteredBidRate7DaysUndefined: Self = StObject.set(x, "filteredBidRate7Days", js.undefined)
    
    inline def setMustBidRateCurrentMonth(value: Double): Self = StObject.set(x, "mustBidRateCurrentMonth", value.asInstanceOf[js.Any])
    
    inline def setMustBidRateCurrentMonthNull: Self = StObject.set(x, "mustBidRateCurrentMonth", null)
    
    inline def setMustBidRateCurrentMonthUndefined: Self = StObject.set(x, "mustBidRateCurrentMonth", js.undefined)
  }
}
