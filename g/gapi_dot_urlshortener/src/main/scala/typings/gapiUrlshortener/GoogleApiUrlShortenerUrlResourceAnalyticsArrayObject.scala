package typings.gapiUrlshortener

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject extends StObject {
  
  /**
    * Number of clicks for this top entry, e.g. for this particular country or browser.
    */
  var count: String
  
  /**
    * Label assigned to this top entry, e.g. "US" or "Chrome".
    */
  var id: String
}
object GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject {
  
  inline def apply(count: String, id: String): GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  }
  
  extension [Self <: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
