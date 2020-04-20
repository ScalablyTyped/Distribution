package typings.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject extends js.Object {
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
  @scala.inline
  def apply(count: String, id: String): GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]
  }
}

