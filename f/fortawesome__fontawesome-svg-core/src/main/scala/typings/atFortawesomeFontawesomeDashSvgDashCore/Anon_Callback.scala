package typings.atFortawesomeFontawesomeDashSvgDashCore

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var node: Node
  def callback(): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => Unit, node: Node): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

