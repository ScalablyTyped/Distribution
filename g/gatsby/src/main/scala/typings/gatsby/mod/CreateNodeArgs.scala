package typings.gatsby.mod

import typings.gatsby.anon.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeArgs[TNode /* <: js.Object */] extends ParentSpanPluginArgs {
  var node: Node with TNode = js.native
  var traceId: String = js.native
  var traceTags: NodeId = js.native
}

