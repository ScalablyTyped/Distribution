package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Link s.*/
@JSImport("go", "LayeredDigraphEdge")
@js.native
class LayeredDigraphEdge () extends LayoutEdge {
  /**True if the link is part of the depth first forest.*/
  var forest: scala.Boolean = js.native
  /**Approximate column offset of the from port of the link from the from node column used in straightening.*/
  var portFromColOffset: scala.Double = js.native
  /**Location of the port at the from node of the link.*/
  var portFromPos: scala.Double = js.native
  /**Approximate column offset of the to port of the link from the to node column used in straightening.*/
  var portToColOffset: scala.Double = js.native
  /**Location of the port at the to node of the link.*/
  var portToPos: scala.Double = js.native
  /**True if the link was reversed during cycle removal.*/
  var rev: scala.Boolean = js.native
  /**True if the link is part of the proper digraph.*/
  var valid: scala.Boolean = js.native
}

