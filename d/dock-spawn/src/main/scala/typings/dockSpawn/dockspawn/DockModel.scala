package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockModel extends js.Object {
  var documentManagerNode: DockNode
  var rootNode: DockNode
}

object DockModel {
  @scala.inline
  def apply(documentManagerNode: DockNode, rootNode: DockNode): DockModel = {
    val __obj = js.Dynamic.literal(documentManagerNode = documentManagerNode.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockModel]
  }
}

