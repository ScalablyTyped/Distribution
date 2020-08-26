package typings.domhandler.mod

import typings.domelementtype.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "Node")
@js.native
class Node protected ()
  extends typings.domhandler.nodeMod.Node {
  /**
    *
    * @param type The type of the node.
    */
  def this(`type`: ElementType) = this()
}

