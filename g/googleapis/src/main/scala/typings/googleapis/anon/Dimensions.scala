package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  var dimensions: js.UndefOr[String] = js.undefined
  
  var `end-date`: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
  
  var ids: js.UndefOr[String] = js.undefined
  
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  var samplingLevel: js.UndefOr[String] = js.undefined
  
  var segment: js.UndefOr[String] = js.undefined
  
  var sort: js.UndefOr[js.Array[String]] = js.undefined
  
  var `start-date`: js.UndefOr[String] = js.undefined
  
  var `start-index`: js.UndefOr[Double] = js.undefined
}
object Dimensions {
  
  @scala.inline
  def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  @scala.inline
  implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
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
    def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
  }
}
