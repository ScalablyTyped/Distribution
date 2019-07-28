package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: String
  var name: String
}

object Anon_Kind {
  @scala.inline
  def apply(kind: String, name: String): Anon_Kind = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[Anon_Kind]
  }
}

