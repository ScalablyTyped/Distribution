package typings.diacritics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: String
  var chars: String
}

object AnonBase {
  @scala.inline
  def apply(base: String, chars: String): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

