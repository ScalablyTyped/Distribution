package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGroupings extends StObject {
  
  var date_histogram: js.UndefOr[RollupDateHistogramGrouping] = js.undefined
  
  var histogram: js.UndefOr[RollupHistogramGrouping] = js.undefined
  
  var terms: js.UndefOr[RollupTermsGrouping] = js.undefined
}
object RollupGroupings {
  
  inline def apply(): RollupGroupings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGroupings]
  }
  
  extension [Self <: RollupGroupings](x: Self) {
    
    inline def setDate_histogram(value: RollupDateHistogramGrouping): Self = StObject.set(x, "date_histogram", value.asInstanceOf[js.Any])
    
    inline def setDate_histogramUndefined: Self = StObject.set(x, "date_histogram", js.undefined)
    
    inline def setHistogram(value: RollupHistogramGrouping): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setTerms(value: RollupTermsGrouping): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
