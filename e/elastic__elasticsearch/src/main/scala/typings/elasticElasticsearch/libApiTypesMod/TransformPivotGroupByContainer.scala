package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPivotGroupByContainer extends StObject {
  
  var date_histogram: js.UndefOr[AggregationsDateHistogramAggregation] = js.undefined
  
  var geotile_grid: js.UndefOr[AggregationsGeoTileGridAggregation] = js.undefined
  
  var histogram: js.UndefOr[AggregationsHistogramAggregation] = js.undefined
  
  var terms: js.UndefOr[AggregationsTermsAggregation] = js.undefined
}
object TransformPivotGroupByContainer {
  
  inline def apply(): TransformPivotGroupByContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformPivotGroupByContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformPivotGroupByContainer] (val x: Self) extends AnyVal {
    
    inline def setDate_histogram(value: AggregationsDateHistogramAggregation): Self = StObject.set(x, "date_histogram", value.asInstanceOf[js.Any])
    
    inline def setDate_histogramUndefined: Self = StObject.set(x, "date_histogram", js.undefined)
    
    inline def setGeotile_grid(value: AggregationsGeoTileGridAggregation): Self = StObject.set(x, "geotile_grid", value.asInstanceOf[js.Any])
    
    inline def setGeotile_gridUndefined: Self = StObject.set(x, "geotile_grid", js.undefined)
    
    inline def setHistogram(value: AggregationsHistogramAggregation): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setTerms(value: AggregationsTermsAggregation): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
