package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var children: js.Array[Page]
  var id: java.lang.String
  var name: java.lang.String
  var `type`: flowdocLib.flowdocLibStrings.DOCUMENT
}

object Document {
  @scala.inline
  def apply(
    children: js.Array[Page],
    id: java.lang.String,
    name: java.lang.String,
    `type`: flowdocLib.flowdocLibStrings.DOCUMENT
  ): Document = {
    val __obj = js.Dynamic.literal(children = children, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Document]
  }
}

