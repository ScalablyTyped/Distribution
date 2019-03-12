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
    addDestinationEdge: LayoutEdge => scala.Unit,
    addSourceEdge: LayoutEdge => scala.Unit,
    bounds: Rect,
    centerX: scala.Double,
    centerY: scala.Double,
    commit: () => scala.Unit,
    data: js.Any,
    deleteDestinationEdge: LayoutEdge => scala.Unit,
    deleteSourceEdge: LayoutEdge => scala.Unit,
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
    val __obj = js.Dynamic.literal(actualAngle = actualAngle, addDestinationEdge = js.Any.fromFunction1(addDestinationEdge), addSourceEdge = js.Any.fromFunction1(addSourceEdge), bounds = bounds, centerX = centerX, centerY = centerY, commit = js.Any.fromFunction0(commit), data = data, deleteDestinationEdge = js.Any.fromFunction1(deleteDestinationEdge), deleteSourceEdge = js.Any.fromFunction1(deleteSourceEdge), destinationEdges = destinationEdges, destinationVertexes = destinationVertexes, diameter = diameter, edges = edges, edgesCount = edgesCount, focus = focus, focusX = focusX, focusY = focusY, height = height, network = network, node = node, sourceEdges = sourceEdges, sourceVertexes = sourceVertexes, vertexes = vertexes, width = width, x = x, y = y)
  
    __obj.asInstanceOf[CircularVertex]
  }
}

