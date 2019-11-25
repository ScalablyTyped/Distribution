package typings.gapiDotUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiUrlShortenerUrlResource extends js.Object {
  /**
    * A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable.
    */
  var analytics: Anon_AllTime
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
  @scala.inline
  def apply(
    analytics: Anon_AllTime,
    created: String,
    id: String,
    kind: String,
    longUrl: String,
    status: String
  ): GoogleApiUrlShortenerUrlResource = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], longUrl = longUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResource]
  }
}

