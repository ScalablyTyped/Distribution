package typings.flowdoc.FlowNs

import typings.flowdoc.flowdocStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var children: js.Array[Page]
  var id: String
  var name: String
  var `type`: DOCUMENT
}

object Document {
  @scala.inline
  def apply(children: js.Array[Page], id: String, name: String, `type`: DOCUMENT): Document = {
    val __obj = js.Dynamic.literal(children = children, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Document]
  }
}

