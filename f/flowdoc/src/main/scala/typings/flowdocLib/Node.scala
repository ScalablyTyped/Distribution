package typings
package flowdocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var `type`: NodeType
}

object Node {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `type`: NodeType): Node = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

