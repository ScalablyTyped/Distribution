package typings.emscripten.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kind extends js.Object {
  var kind: String
  var name: String
}

object Kind {
  @scala.inline
  def apply(kind: String, name: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
}

