package typings.gapiUrlshortener

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiUrlShortenerUrlResourceAnalyticsObject extends StObject {
  
  /**
    * Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available.
    */
  var browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  
  /**
    * Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available.
    */
  var countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: String
  
  /**
    * Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available.
    */
  var platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  
  /**
    * Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available.
    */
  var referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: String
}
object GoogleApiUrlShortenerUrlResourceAnalyticsObject {
  
  inline def apply(
    browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    longUrlClicks: String,
    platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    shortUrlClicks: String
  ): GoogleApiUrlShortenerUrlResourceAnalyticsObject = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], countries = countries.asInstanceOf[js.Any], longUrlClicks = longUrlClicks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], referrers = referrers.asInstanceOf[js.Any], shortUrlClicks = shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleApiUrlShortenerUrlResourceAnalyticsObject] (val x: Self) extends AnyVal {
    
    inline def setBrowsers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setCountries(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setLongUrlClicks(value: String): Self = StObject.set(x, "longUrlClicks", value.asInstanceOf[js.Any])
    
    inline def setPlatforms(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setReferrers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "referrers", value.asInstanceOf[js.Any])
    
    inline def setReferrersVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "referrers", js.Array(value*))
    
    inline def setShortUrlClicks(value: String): Self = StObject.set(x, "shortUrlClicks", value.asInstanceOf[js.Any])
  }
}
