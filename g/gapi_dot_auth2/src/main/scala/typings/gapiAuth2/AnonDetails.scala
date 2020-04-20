package typings.gapiAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  var details: String
  var error: String
}

object AnonDetails {
  @scala.inline
  def apply(details: String, error: String): AnonDetails = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}

