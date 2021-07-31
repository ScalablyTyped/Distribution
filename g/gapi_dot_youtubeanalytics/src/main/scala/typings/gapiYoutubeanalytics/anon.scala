package typings.gapiYoutubeanalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dimensions extends StObject {
    
    /**
      * A comma-separated list of YouTube Analytics dimensions, such as views or ageGroup,gender.
      */
    var dimensions: js.UndefOr[String] = js.undefined
    
    /**
      * The end date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
      */
    var `end-date`: String
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * A list of filters that should be applied when retrieving YouTube Analytics data. The Available Reports document identifies the dimensions that can be used to filter each report, and the Dimensions document defines those dimensions. If a request uses multiple filters, join them together with a semicolon (;), and the returned result table will satisfy both filters.
      */
    var filters: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the YouTube channel or content owner for which you are retrieving YouTube Analytics data. - To request data for a YouTube user, set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID specifies the unique YouTube channel ID. - To request data for a YouTube CMS content owner, set the ids parameter value to contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content owner.
      */
    var ids: String
    
    /**
      * The maximum number of rows to include in the response.
      */
    var `max-results`: js.UndefOr[Double] = js.undefined
    
    /**
      * A comma-separated list of YouTube Analytics metrics, such as views or likes,dislikes.
      */
    var metrics: String
    
    /**
      * A comma-separated list of dimensions or metrics that determine the sort order for YouTube Analytics data. By default the sort order is ascending. The '-' prefix causes descending sort order.
      */
    var sort: js.UndefOr[String] = js.undefined
    
    /**
      * The start date for fetching YouTube Analytics data. The value should be in YYYY-MM-DD format.
      */
    var `start-date`: String
    
    /**
      * An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter (one-based, inclusive).
      */
    var `start-index`: js.UndefOr[Double] = js.undefined
  }
  object Dimensions {
    
    @scala.inline
    def apply(`end-date`: String, ids: String, metrics: String, `start-date`: String): Dimensions = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
      __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
      __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
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
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
      
      @scala.inline
      def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    }
  }
}
