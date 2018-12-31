package typings
package gapiDotUrlshortenerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiUrlShortenerUrlResource extends js.Object {
  /**
    * A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable.
    */
  var analytics: Anon_TwoHours
  /**
    * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format.
    */
  var created: java.lang.String
  /**
    * Short URL
    */
  var id: java.lang.String
  /**
    * The fixed string "urlshortener#url".
    */
  var kind: java.lang.String
  /**
    * Long URL
    */
  var longUrl: java.lang.String
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED".
    */
  var status: java.lang.String
}

