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
    val __obj = js.Dynamic.literal(actualAngle = actualAngle, addDestinationEdge = addDestinationEdge, addSourceEdge = addSourceEdge, bounds = bounds, centerX = centerX, centerY = centerY, commit = commit, data = data, deleteDestinationEdge = deleteDestinationEdge, deleteSourceEdge = deleteSourceEdge, destinationEdges = destinationEdges, destinationVertexes = destinationVertexes, diameter = diameter, edges = edges, edgesCount = edgesCount, focus = focus, focusX = focusX, focusY = focusY, height = height, network = network, node = node, sourceEdges = sourceEdges, sourceVertexes = sourceVertexes, vertexes = vertexes, width = width, x = x, y = y)
  
    __obj.asInstanceOf[CircularVertex]
  }
}

