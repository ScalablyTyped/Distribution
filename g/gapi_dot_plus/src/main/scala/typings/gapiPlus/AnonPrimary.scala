package typings.gapiPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrimary extends js.Object {
  var primary: Boolean
  var value: String
}

object AnonPrimary {
  @scala.inline
  def apply(primary: Boolean, value: String): AnonPrimary = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrimary]
  }
}

