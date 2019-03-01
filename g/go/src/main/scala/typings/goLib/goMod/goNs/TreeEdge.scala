package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds TreeLayout-specific information about Links.*/
trait TreeEdge extends LayoutEdge {
  /**Gets or sets a Point, relative to the parent node, that may be useful in routing this link.*/
  var relativePoint: Point
}

object TreeEdge {
  @scala.inline
  def apply(
    commit: js.Function0[scala.Unit],
    data: js.Any,
    fromVertex: LayoutVertex,
    getOtherVertex: js.Function1[LayoutVertex, scala.Unit],
    link: Link,
    network: LayoutNetwork,
    relativePoint: Point,
    toVertex: LayoutVertex
  ): TreeEdge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fromVertex")(fromVertex)
    __obj.updateDynamic("getOtherVertex")(getOtherVertex)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("relativePoint")(relativePoint)
    __obj.updateDynamic("toVertex")(toVertex)
    __obj.asInstanceOf[TreeEdge]
  }
}

