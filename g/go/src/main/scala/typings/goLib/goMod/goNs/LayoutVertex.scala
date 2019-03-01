package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A vertex represents a node in a LayoutNetwork. It holds layout-specific data for the node. */
trait LayoutVertex extends js.Object {
  /**Gets or sets the Bounds of this vertex, in document coordinates.*/
  var bounds: Rect
  /**Gets or sets the center Point.x of this vertex, in document coordinates.*/
  var centerX: scala.Double
  /**Gets or sets the center Point.y of this vertex, in document coordinates.*/
  var centerY: scala.Double
  /**Gets or sets the model data, used only when virtualizing*/
  var data: js.Any
  /**Gets an iterator for all of the edges that go out of this vertex.*/
  var destinationEdges: Iterator[LayoutEdge]
  /**Gets an iterator for all of the vertexes that are connected with edges going out of this vertex.*/
  var destinationVertexes: Iterator[LayoutVertex]
  /**Gets an iterator for all of the edges that are connected with this vertex in either direction.*/
  var edges: Iterator[LayoutEdge]
  /**This read-only property returns the total number of edges that are connected with this vertex in either direction.*/
  var edgesCount: scala.Double
  /**Gets or sets the offset of the .centerX and .centerY from the .bounds position.*/
  var focus: Point
  /**Gets or sets the relative X position of the "center" point, the focus.*/
  var focusX: scala.Double
  /**Gets or sets the relative Y position of the "center" point, the focus.*/
  var focusY: scala.Double
  /**Gets or sets the height of this vertex.*/
  var height: scala.Double
  /**Gets or sets the LayoutNetwork that owns this vertex.*/
  var network: LayoutNetwork
  /**Gets or sets the Node associated with this vertex, if any.*/
  var node: Node
  /**Gets an iterator for all of the edges that come into this vertex.*/
  var sourceEdges: Iterator[LayoutEdge]
  /**Gets an iterator for all of the vertexes that are connected with edges coming into this vertex.*/
  var sourceVertexes: Iterator[LayoutVertex]
  /**Gets an iterator for all of the vertexes that are connected in either direction with this vertex.*/
  var vertexes: Iterator[LayoutVertex]
  /**Gets or sets the width of this vertex.*/
  var width: scala.Double
  /**Gets or sets the left point of this vertex.*/
  var x: scala.Double
  /**Gets or sets the top point of this vertex.*/
  var y: scala.Double
  /**
    * Adds a LayoutEdge to the list of successors (the edge will be going out from this vertex).
    * @param {LayoutEdge} edge
    */
  def addDestinationEdge(edge: LayoutEdge): scala.Unit
  /**
    * Adds a LayoutEdge to the list of predecessors (the edge will be coming into this vertex).
    * @param {LayoutEdge} edge
    */
  def addSourceEdge(edge: LayoutEdge): scala.Unit
  /**
    * Moves the Node corresponding to this vertex so that its position is at the current .bounds point.
    */
  def commit(): scala.Unit
  /**
    * Deletes a LayoutEdge from the list of successors (the edge was going out from this vertex).
    * @param {LayoutEdge} edge
    */
  def deleteDestinationEdge(edge: LayoutEdge): scala.Unit
  /**
    * Deletes a LayoutEdge from the list of predecessors (the edge was coming into this vertex).
    * @param {LayoutEdge} edge
    */
  def deleteSourceEdge(edge: LayoutEdge): scala.Unit
}

object LayoutVertex {
  @scala.inline
  def apply(
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
  ): LayoutVertex = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[LayoutVertex]
  }
}

