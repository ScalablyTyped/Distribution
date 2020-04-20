package typings.estree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  var flags: String
  var pattern: String
}

object AnonFlags {
  @scala.inline
  def apply(flags: String, pattern: String): AnonFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlags]
  }
}

