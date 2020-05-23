package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * The locale of the formattedResults, such as en_US.
    */
  var locale: String
  /**
    * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
    */
  var ruleResults: AvoidBadRequests
}

object Locale {
  @scala.inline
  def apply(locale: String, ruleResults: AvoidBadRequests): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], ruleResults = ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

