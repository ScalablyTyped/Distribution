package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Links.*/
trait ForceDirectedEdge extends LayoutEdge {
  /**Gets or sets the length of this edge.*/
  var length: scala.Double
  /**Gets or sets this edge's stiffness or resistence to compression or stretching.*/
  var stiffness: scala.Double
}

object ForceDirectedEdge {
  @scala.inline
  def apply(
    commit: () => scala.Unit,
    data: js.Any,
    fromVertex: LayoutVertex,
    getOtherVertex: LayoutVertex => scala.Unit,
    length: scala.Double,
    link: Link,
    network: LayoutNetwork,
    stiffness: scala.Double,
    toVertex: LayoutVertex
  ): ForceDirectedEdge = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), data = data, fromVertex = fromVertex, getOtherVertex = js.Any.fromFunction1(getOtherVertex), length = length, link = link, network = network, stiffness = stiffness, toVertex = toVertex)
  
    __obj.asInstanceOf[ForceDirectedEdge]
  }
}

