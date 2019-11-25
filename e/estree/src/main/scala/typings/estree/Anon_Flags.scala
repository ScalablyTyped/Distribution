package typings.estree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  var flags: String
  var pattern: String
}

object Anon_Flags {
  @scala.inline
  def apply(flags: String, pattern: String): Anon_Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Flags]
  }
}

