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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDestinationEdge")(addDestinationEdge)
    __obj.updateDynamic("addSourceEdge")(addSourceEdge)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("component")(component)
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
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("near")(near)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("sourceEdges")(sourceEdges)
    __obj.updateDynamic("sourceVertexes")(sourceVertexes)
    __obj.updateDynamic("vertexes")(vertexes)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[LayeredDigraphVertex]
  }
}

