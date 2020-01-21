package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocale extends js.Object {
  /**
    * The locale of the formattedResults, such as en_US.
    */
  var locale: String
  /**
    * Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server.
    */
  var ruleResults: AnonAvoidBadRequests
}

object AnonLocale {
  @scala.inline
  def apply(locale: String, ruleResults: AnonAvoidBadRequests): AnonLocale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], ruleResults = ruleResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocale]
  }
}

