package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: String
  var flags: String
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String, flags: String): Anon_Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding, flags = flags)
  
    __obj.asInstanceOf[Anon_Encoding]
  }
}

