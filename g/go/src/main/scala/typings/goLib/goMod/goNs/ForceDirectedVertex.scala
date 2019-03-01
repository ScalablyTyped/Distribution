package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Nodes.*/
trait ForceDirectedVertex extends LayoutVertex {
  /**Gets or sets the electrical charge for this vertex.*/
  var charge: scala.Double
  /**Gets or sets the cumulative force on the vertex in the X direction.*/
  var forceX: scala.Double
  /**Gets or sets the cumulative force on the vertex in the Y direction.*/
  var forceY: scala.Double
  /**Gets or sets whether the vertex may be moved by any forces.*/
  var isFixed: scala.Boolean
  /**Gets or sets the gravitational mass for this vertex.*/
  var mass: scala.Double
}

object ForceDirectedVertex {
  @scala.inline
  def apply(
    addDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    addSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    bounds: Rect,
    centerX: scala.Double,
    centerY: scala.Double,
    charge: scala.Double,
    commit: js.Function0[scala.Unit],
    data: js.Any,
    deleteDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    deleteSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    destinationEdges: Iterator[LayoutEdge],
    destinationVertexes: Iterator[LayoutVertex],
    edges: Iterator[LayoutEdge],
    edgesCount: scala.Double,
    focus: Point,
    focusX: scala.Double,
    focusY: scala.Double,
    forceX: scala.Double,
    forceY: scala.Double,
    height: scala.Double,
    isFixed: scala.Boolean,
    mass: scala.Double,
    network: LayoutNetwork,
    node: Node,
    sourceEdges: Iterator[LayoutEdge],
    sourceVertexes: Iterator[LayoutVertex],
    vertexes: Iterator[LayoutVertex],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ForceDirectedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDestinationEdge")(addDestinationEdge)
    __obj.updateDynamic("addSourceEdge")(addSourceEdge)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("charge")(charge)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deleteDestinationEdge")(deleteDestinationEdge)
    __obj.updateDynamic("deleteSourceEdge")(deleteSourceEdge)
    __obj.updateDynamic("destinationEdges")(destinationEdges)
    __obj.updateDynamic("destinationVertexes")(destinationVertexes)
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("edgesCount")(edgesCount)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("focusX")(focusX)
    __obj.updateDynamic("focusY")(focusY)
    __obj.updateDynamic("forceX")(forceX)
    __obj.updateDynamic("forceY")(forceY)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isFixed")(isFixed)
    __obj.updateDynamic("mass")(mass)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("sourceEdges")(sourceEdges)
    __obj.updateDynamic("sourceVertexes")(sourceVertexes)
    __obj.updateDynamic("vertexes")(vertexes)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ForceDirectedVertex]
  }
}

