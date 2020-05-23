package typings.ecmarkdown.visitorMod

import typings.ecmarkdown.nodeTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/visitor", "visit")
@js.native
object visit extends js.Object {
  def apply(node: Node, observer: Observer): Unit = js.native
}

