package typings.fortawesomeFontawesomeSvgCore.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var node: Node
  def callback(): Unit
}

object Callback {
  @scala.inline
  def apply(callback: () => Unit, node: Node): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

