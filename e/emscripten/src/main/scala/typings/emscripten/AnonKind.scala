package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  var kind: String
  var name: String
}

object AnonKind {
  @scala.inline
  def apply(kind: String, name: String): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKind]
  }
}

