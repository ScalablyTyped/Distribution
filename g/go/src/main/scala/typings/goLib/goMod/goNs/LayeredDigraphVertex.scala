package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Nodes.*/
trait LayeredDigraphVertex extends LayoutVertex {
  /**The column to which the node is assigned.*/
  var column: scala.Double
  /**The connected component to which the node is assigned.*/
  var component: scala.Double
  /**The index to which the node is assigned.*/
  var index: scala.Double
  /**The layer to which the node is assigned.*/
  var layer: scala.Double
  /**Another LayeredDigraphVertex in the same layer that this node should be near.*/
  var near: LayeredDigraphVertex
}

object LayeredDigraphVertex {
  @scala.inline
  def apply(
    addDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    addSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    bounds: Rect,
    centerX: scala.Double,
    centerY: scala.Double,
    column: scala.Double,
    commit: js.Function0[scala.Unit],
    component: scala.Double,
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
    height: scala.Double,
    index: scala.Double,
    layer: scala.Double,
    near: LayeredDigraphVertex,
    network: LayoutNetwork,
    node: Node,
    sourceEdges: Iterator[LayoutEdge],
    sourceVertexes: Iterator[LayoutVertex],
    vertexes: Iterator[LayoutVertex],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): LayeredDigraphVertex = {
    val __obj = js.Dynamic.literal(addDestinationEdge = addDestinationEdge, addSourceEdge = addSourceEdge, bounds = bounds, centerX = centerX, centerY = centerY, column = column, commit = commit, component = component, data = data, deleteDestinationEdge = deleteDestinationEdge, deleteSourceEdge = deleteSourceEdge, destinationEdges = destinationEdges, destinationVertexes = destinationVertexes, edges = edges, edgesCount = edgesCount, focus = focus, focusX = focusX, focusY = focusY, height = height, index = index, layer = layer, near = near, network = network, node = node, sourceEdges = sourceEdges, sourceVertexes = sourceVertexes, vertexes = vertexes, width = width, x = x, y = y)
  
    __obj.asInstanceOf[LayeredDigraphVertex]
  }
}

