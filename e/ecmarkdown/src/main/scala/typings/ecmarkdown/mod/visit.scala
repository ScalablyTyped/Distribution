package typings.ecmarkdown.mod

import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.visitorMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/ecmarkdown", "visit")
@js.native
object visit extends js.Object {
  def apply(node: Node, observer: Observer): Unit = js.native
}

