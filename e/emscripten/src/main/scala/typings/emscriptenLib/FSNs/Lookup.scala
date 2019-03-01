package typings
package emscriptenLib.FSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup extends js.Object {
  var node: FSNode
  var path: java.lang.String
}

object Lookup {
  @scala.inline
  def apply(node: FSNode, path: java.lang.String): Lookup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Lookup]
  }
}

