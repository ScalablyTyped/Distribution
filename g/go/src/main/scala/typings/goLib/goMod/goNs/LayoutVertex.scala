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

