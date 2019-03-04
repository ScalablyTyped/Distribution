package typings
package gapiDotUrlshortenerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject extends js.Object {
  /**
    * Number of clicks for this top entry, e.g. for this particular country or browser.
    */
  var count: java.lang.String
  /**
    * Label assigned to this top entry, e.g. "US" or "Chrome".
    */
  var id: java.lang.String
}

object GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject {
  @scala.inline
  def apply(count: java.lang.String, id: java.lang.String): GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject = {
    val __obj = js.Dynamic.literal(count = count, id = id)
  
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  }
}

