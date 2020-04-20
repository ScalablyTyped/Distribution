package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup extends js.Object {
  var node: FSNode
  var path: String
}

object Lookup {
  @scala.inline
  def apply(node: FSNode, path: String): Lookup = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup]
  }
}

