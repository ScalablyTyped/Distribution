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
    commit: js.Function0[scala.Unit],
    data: js.Any,
    fromVertex: LayoutVertex,
    getOtherVertex: js.Function1[LayoutVertex, scala.Unit],
    length: scala.Double,
    link: Link,
    network: LayoutNetwork,
    stiffness: scala.Double,
    toVertex: LayoutVertex
  ): ForceDirectedEdge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fromVertex")(fromVertex)
    __obj.updateDynamic("getOtherVertex")(getOtherVertex)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("toVertex")(toVertex)
    __obj.asInstanceOf[ForceDirectedEdge]
  }
}

