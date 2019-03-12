package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Link s.*/
trait LayeredDigraphEdge extends LayoutEdge {
  /**True if the link is part of the depth first forest.*/
  var forest: scala.Boolean
  /**Approximate column offset of the from port of the link from the from node column used in straightening.*/
  var portFromColOffset: scala.Double
  /**Location of the port at the from node of the link.*/
  var portFromPos: scala.Double
  /**Approximate column offset of the to port of the link from the to node column used in straightening.*/
  var portToColOffset: scala.Double
  /**Location of the port at the to node of the link.*/
  var portToPos: scala.Double
  /**True if the link was reversed during cycle removal.*/
  var rev: scala.Boolean
  /**True if the link is part of the proper digraph.*/
  var valid: scala.Boolean
}

object LayeredDigraphEdge {
  @scala.inline
  def apply(
    commit: () => scala.Unit,
    data: js.Any,
    forest: scala.Boolean,
    fromVertex: LayoutVertex,
    getOtherVertex: LayoutVertex => scala.Unit,
    link: Link,
    network: LayoutNetwork,
    portFromColOffset: scala.Double,
    portFromPos: scala.Double,
    portToColOffset: scala.Double,
    portToPos: scala.Double,
    rev: scala.Boolean,
    toVertex: LayoutVertex,
    valid: scala.Boolean
  ): LayeredDigraphEdge = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), data = data, forest = forest, fromVertex = fromVertex, getOtherVertex = js.Any.fromFunction1(getOtherVertex), link = link, network = network, portFromColOffset = portFromColOffset, portFromPos = portFromPos, portToColOffset = portToColOffset, portToPos = portToPos, rev = rev, toVertex = toVertex, valid = valid)
  
    __obj.asInstanceOf[LayeredDigraphEdge]
  }
}

