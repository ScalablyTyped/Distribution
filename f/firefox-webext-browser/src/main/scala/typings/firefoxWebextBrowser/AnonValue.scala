package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  /** Name of the HTTP header. */
  var name: String
  /** Value of the HTTP header. */
  var value: String
}

object AnonValue {
  @scala.inline
  def apply(name: String, value: String): AnonValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

