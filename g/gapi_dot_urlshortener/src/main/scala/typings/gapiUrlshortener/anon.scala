package typings.gapiUrlshortener

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllTime extends StObject {
    
    /**
      * Click analytics over all time.
      */
    var allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject
    
    /**
      * Click analytics over the last day.
      */
    var day: GoogleApiUrlShortenerUrlResourceAnalyticsObject
    
    /**
      * Click analytics over the last month.
      */
    var month: GoogleApiUrlShortenerUrlResourceAnalyticsObject
    
    /**
      * Click analytics over the last two hours.
      */
    var twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject
    
    /**
      * Click analytics over the last week.
      */
    var week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
  }
  object AllTime {
    
    @scala.inline
    def apply(
      allTime: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
      day: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
      month: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
      twoHours: GoogleApiUrlShortenerUrlResourceAnalyticsObject,
      week: GoogleApiUrlShortenerUrlResourceAnalyticsObject
    ): AllTime = {
      val __obj = js.Dynamic.literal(allTime = allTime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], twoHours = twoHours.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllTime]
    }
    
    @scala.inline
    implicit class AllTimeMutableBuilder[Self <: AllTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllTime(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = StObject.set(x, "allTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDay(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoHours(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = StObject.set(x, "twoHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeek(value: GoogleApiUrlShortenerUrlResourceAnalyticsObject): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * Additional information to return. ANALYTICS_CLICKS, ANALYTICS_TOP_STRINGS, FULL
      */
    var projection: js.UndefOr[String] = js.undefined
    
    /**
      * The short URL, including the protocol.
      */
    var shortUrl: String
  }
  object Fields {
    
    @scala.inline
    def apply(shortUrl: String): Fields = {
      val __obj = js.Dynamic.literal(shortUrl = shortUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Projection extends StObject {
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * Additional information to return. ANALYTICS_CLICKS, FULL
      */
    var projection: js.UndefOr[String] = js.undefined
    
    /**
      * Token for requesting successive pages of results.
      */
    var `start-token`: js.UndefOr[String] = js.undefined
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def `setStart-token`(value: String): Self = StObject.set(x, "start-token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStart-tokenUndefined`: Self = StObject.set(x, "start-token", js.undefined)
    }
  }
  
  trait RequestBody extends StObject {
    
    /**
      * HTTP Request Body
      */
    var RequestBody: js.UndefOr[String] = js.undefined
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
  }
  object RequestBody {
    
    @scala.inline
    def apply(): RequestBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestBody]
    }
    
    @scala.inline
    implicit class RequestBodyMutableBuilder[Self <: RequestBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setRequestBody(value: String): Self = StObject.set(x, "RequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBodyUndefined: Self = StObject.set(x, "RequestBody", js.undefined)
    }
  }
}
