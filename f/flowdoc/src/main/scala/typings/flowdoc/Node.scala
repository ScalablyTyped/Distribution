package typings.flowdoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var id: String
  var name: String
  var `type`: NodeType
}

object Node {
  @scala.inline
  def apply(id: String, name: String, `type`: NodeType): Node = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

