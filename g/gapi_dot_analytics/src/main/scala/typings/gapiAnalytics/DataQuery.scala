package typings.gapiAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQuery extends StObject {
  
  var `30daysAgo`: js.UndefOr[String] = js.undefined
  
  var dimensions: js.UndefOr[String] = js.undefined
  
  var `end-date`: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
  
  var ids: js.UndefOr[String] = js.undefined
  
  var `include-empty-rows`: js.UndefOr[String] = js.undefined
  
  var `max-results`: js.UndefOr[String] = js.undefined
  
  var metrics: js.UndefOr[String] = js.undefined
  
  var samplingLevel: js.UndefOr[String] = js.undefined
  
  var segment: js.UndefOr[String] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
  
  var `start-date`: js.UndefOr[String] = js.undefined
  
  var `start-index`: js.UndefOr[String] = js.undefined
  
  var yesterday: js.UndefOr[String] = js.undefined
}
object DataQuery {
  
  inline def apply(): DataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQuery] (val x: Self) extends AnyVal {
    
    inline def set30daysAgo(value: String): Self = StObject.set(x, "30daysAgo", value.asInstanceOf[js.Any])
    
    inline def set30daysAgoUndefined: Self = StObject.set(x, "30daysAgo", js.undefined)
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
    
    inline def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def `setInclude-empty-rows`(value: String): Self = StObject.set(x, "include-empty-rows", value.asInstanceOf[js.Any])
    
    inline def `setInclude-empty-rowsUndefined`: Self = StObject.set(x, "include-empty-rows", js.undefined)
    
    inline def `setMax-results`(value: String): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    inline def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    inline def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    inline def `setStart-index`(value: String): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    inline def setYesterday(value: String): Self = StObject.set(x, "yesterday", value.asInstanceOf[js.Any])
    
    inline def setYesterdayUndefined: Self = StObject.set(x, "yesterday", js.undefined)
  }
}
