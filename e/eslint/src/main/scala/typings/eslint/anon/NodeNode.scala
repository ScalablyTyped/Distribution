package typings.eslint.anon

import typings.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeNode extends ReportDescriptorLocation {
  var node: typings.estree.mod.Node
}

object NodeNode {
  @scala.inline
  def apply(node: typings.estree.mod.Node): NodeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeNode]
  }
}

