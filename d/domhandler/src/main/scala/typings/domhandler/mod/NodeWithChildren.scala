package typings.domhandler.mod

import typings.domhandler.domhandlerStrings.cdata
import typings.domhandler.domhandlerStrings.script
import typings.domhandler.domhandlerStrings.style
import typings.domhandler.domhandlerStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "NodeWithChildren")
@js.native
class NodeWithChildren protected ()
  extends typings.domhandler.nodeMod.NodeWithChildren {
  /**
    *
    * @param type Type of the node.
    * @param children Children of the node. Only certain node types can have children.
    */
  def this(`type`: cdata, children: js.Array[typings.domhandler.nodeMod.Node]) = this()
  def this(`type`: script, children: js.Array[typings.domhandler.nodeMod.Node]) = this()
  def this(`type`: style, children: js.Array[typings.domhandler.nodeMod.Node]) = this()
  def this(`type`: tag, children: js.Array[typings.domhandler.nodeMod.Node]) = this()
}

