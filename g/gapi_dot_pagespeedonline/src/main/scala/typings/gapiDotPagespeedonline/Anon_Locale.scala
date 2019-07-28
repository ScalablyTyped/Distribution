package typings.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  /**
    * The locale of the formattedResults, such as en_US.
    */
  var locale: String
  /**
    * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
    */
  var ruleResults: Anon_AvoidBadRequests
}

object Anon_Locale {
  @scala.inline
  def apply(locale: String, ruleResults: Anon_AvoidBadRequests): Anon_Locale = {
    val __obj = js.Dynamic.literal(locale = locale, ruleResults = ruleResults)
  
    __obj.asInstanceOf[Anon_Locale]
  }
}

