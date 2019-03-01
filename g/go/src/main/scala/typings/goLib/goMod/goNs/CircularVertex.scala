package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds CircularLayout-specific information about Nodes.*/
trait CircularVertex extends LayoutVertex {
  /**Gets or sets the value used as the vertex's angle.*/
  var actualAngle: scala.Double
  /**Gets or sets the value used as the vertex's diameter.*/
  var diameter: scala.Double
}

object CircularVertex {
  @scala.inline
  def apply(
    actualAngle: scala.Double,
    addDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    addSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    bounds: Rect,
    centerX: scala.Double,
    centerY: scala.Double,
    commit: js.Function0[scala.Unit],
    data: js.Any,
    deleteDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    deleteSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    destinationEdges: Iterator[LayoutEdge],
    destinationVertexes: Iterator[LayoutVertex],
    diameter: scala.Double,
    edges: Iterator[LayoutEdge],
    edgesCount: scala.Double,
    focus: Point,
    focusX: scala.Double,
    focusY: scala.Double,
    height: scala.Double,
    network: LayoutNetwork,
    node: Node,
    sourceEdges: Iterator[LayoutEdge],
    sourceVertexes: Iterator[LayoutVertex],
    vertexes: Iterator[LayoutVertex],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): CircularVertex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actualAngle")(actualAngle)
    __obj.updateDynamic("addDestinationEdge")(addDestinationEdge)
    __obj.updateDynamic("addSourceEdge")(addSourceEdge)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deleteDestinationEdge")(deleteDestinationEdge)
    __obj.updateDynamic("deleteSourceEdge")(deleteSourceEdge)
    __obj.updateDynamic("destinationEdges")(destinationEdges)
    __obj.updateDynamic("destinationVertexes")(destinationVertexes)
    __obj.updateDynamic("diameter")(diameter)
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("edgesCount")(edgesCount)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("focusX")(focusX)
    __obj.updateDynamic("focusY")(focusY)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("sourceEdges")(sourceEdges)
    __obj.updateDynamic("sourceVertexes")(sourceVertexes)
    __obj.updateDynamic("vertexes")(vertexes)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[CircularVertex]
  }
}

