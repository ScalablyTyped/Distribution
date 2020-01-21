package typings.fortawesomeFontawesomeSvgCore

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var node: Node
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: () => Unit, node: Node): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

