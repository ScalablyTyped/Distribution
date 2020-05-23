package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockNode extends js.Object {
  def detachFromParent(): Unit
}

object DockNode {
  @scala.inline
  def apply(detachFromParent: () => Unit): DockNode = {
    val __obj = js.Dynamic.literal(detachFromParent = js.Any.fromFunction0(detachFromParent))
    __obj.asInstanceOf[DockNode]
  }
}

