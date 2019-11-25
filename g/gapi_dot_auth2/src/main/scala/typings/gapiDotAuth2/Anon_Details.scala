package typings.gapiDotAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var details: String
  var error: String
}

object Anon_Details {
  @scala.inline
  def apply(details: String, error: String): Anon_Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Details]
  }
}

