package typings.gapiUrlshortener

import typings.gapiUrlshortener.anon.AllTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiUrlShortenerUrlResource extends StObject {
  
  /**
    * A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable.
    */
  var analytics: AllTime
  
  /**
    * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format.
    */
  var created: String
  
  /**
    * Short URL
    */
  var id: String
  
  /**
    * The fixed string "urlshortener#url".
    */
  var kind: String
  
  /**
    * Long URL
    */
  var longUrl: String
  
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED".
    */
  var status: String
}
object GoogleApiUrlShortenerUrlResource {
  
  inline def apply(analytics: AllTime, created: String, id: String, kind: String, longUrl: String, status: String): GoogleApiUrlShortenerUrlResource = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], longUrl = longUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResource]
  }
  
  extension [Self <: GoogleApiUrlShortenerUrlResource](x: Self) {
    
    inline def setAnalytics(value: AllTime): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLongUrl(value: String): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
