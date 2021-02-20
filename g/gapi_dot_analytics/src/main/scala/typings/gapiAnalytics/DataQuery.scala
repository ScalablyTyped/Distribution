package typings.gapiAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataQuery extends StObject {
  
  var `30daysAgo`: js.UndefOr[String] = js.native
  
  var dimensions: js.UndefOr[String] = js.native
  
  var `end-date`: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[String] = js.native
  
  var ids: js.UndefOr[String] = js.native
  
  var `include-empty-rows`: js.UndefOr[String] = js.native
  
  var `max-results`: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[String] = js.native
  
  var samplingLevel: js.UndefOr[String] = js.native
  
  var segment: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
  
  var `start-date`: js.UndefOr[String] = js.native
  
  var `start-index`: js.UndefOr[String] = js.native
  
  var yesterday: js.UndefOr[String] = js.native
}
object DataQuery {
  
  @scala.inline
  def apply(): DataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQuery]
  }
  
  @scala.inline
  implicit class DataQueryMutableBuilder[Self <: DataQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set30daysAgo(value: String): Self = StObject.set(x, "30daysAgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set30daysAgoUndefined: Self = StObject.set(x, "30daysAgo", js.undefined)
    
    @scala.inline
    def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def `setInclude-empty-rows`(value: String): Self = StObject.set(x, "include-empty-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInclude-empty-rowsUndefined`: Self = StObject.set(x, "include-empty-rows", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: String): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: String): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    @scala.inline
    def setYesterday(value: String): Self = StObject.set(x, "yesterday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYesterdayUndefined: Self = StObject.set(x, "yesterday", js.undefined)
  }
}
