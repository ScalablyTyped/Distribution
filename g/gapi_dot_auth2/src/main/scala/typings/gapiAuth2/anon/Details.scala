package typings.gapiAuth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var details: String
  var error: String
}

object Details {
  @scala.inline
  def apply(details: String, error: String): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

