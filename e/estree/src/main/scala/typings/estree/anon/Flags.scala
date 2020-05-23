package typings.estree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var flags: String
  var pattern: String
}

object Flags {
  @scala.inline
  def apply(flags: String, pattern: String): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

