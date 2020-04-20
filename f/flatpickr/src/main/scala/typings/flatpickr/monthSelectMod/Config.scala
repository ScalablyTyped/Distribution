package typings.flatpickr.monthSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var altFormat: String
  var dateFormat: String
  var shorthand: Boolean
  var theme: String
}

object Config {
  @scala.inline
  def apply(altFormat: String, dateFormat: String, shorthand: Boolean, theme: String): Config = {
    val __obj = js.Dynamic.literal(altFormat = altFormat.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

