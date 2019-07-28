package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Link s.*/
@JSImport("go", "LayeredDigraphEdge")
@js.native
class LayeredDigraphEdge () extends LayoutEdge {
  /**True if the link is part of the depth first forest.*/
  var forest: Boolean = js.native
  /**Approximate column offset of the from port of the link from the from node column used in straightening.*/
  var portFromColOffset: Double = js.native
  /**Location of the port at the from node of the link.*/
  var portFromPos: Double = js.native
  /**Approximate column offset of the to port of the link from the to node column used in straightening.*/
  var portToColOffset: Double = js.native
  /**Location of the port at the to node of the link.*/
  var portToPos: Double = js.native
  /**True if the link was reversed during cycle removal.*/
  var rev: Boolean = js.native
  /**True if the link is part of the proper digraph.*/
  var valid: Boolean = js.native
}

