package typings.gapiUrlshortener

import typings.gapiUrlshortener.anon.AllTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiUrlShortenerUrlResource extends StObject {
  
  /**
    * A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable.
    */
  var analytics: AllTime = js.native
  
  /**
    * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format.
    */
  var created: String = js.native
  
  /**
    * Short URL
    */
  var id: String = js.native
  
  /**
    * The fixed string "urlshortener#url".
    */
  var kind: String = js.native
  
  /**
    * Long URL
    */
  var longUrl: String = js.native
  
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED".
    */
  var status: String = js.native
}
object GoogleApiUrlShortenerUrlResource {
  
  @scala.inline
  def apply(analytics: AllTime, created: String, id: String, kind: String, longUrl: String, status: String): GoogleApiUrlShortenerUrlResource = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], longUrl = longUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResource]
  }
  
  @scala.inline
  implicit class GoogleApiUrlShortenerUrlResourceMutableBuilder[Self <: GoogleApiUrlShortenerUrlResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalytics(value: AllTime): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongUrl(value: String): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
