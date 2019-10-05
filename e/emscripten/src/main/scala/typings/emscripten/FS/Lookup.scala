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
    val __obj = js.Dynamic.literal(node = node, path = path)
  
    __obj.asInstanceOf[Lookup]
  }
}

