package typings.esprimaWalk

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParent extends js.Object {
  var parent: js.UndefOr[Node] = js.undefined
}

object AnonParent {
  @scala.inline
  def apply(parent: Node = null): AnonParent = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParent]
  }
}

