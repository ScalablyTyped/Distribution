package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A vertex represents a node in a LayoutNetwork. It holds layout-specific data for the node. */
@JSImport("go", "LayoutVertex")
@js.native
/**
  * This constructs a vertex that does not know about any Node.
  */
class LayoutVertex () extends js.Object {
  /**Gets or sets the Bounds of this vertex, in document coordinates.*/
  var bounds: Rect = js.native
  /**Gets or sets the center Point.x of this vertex, in document coordinates.*/
  var centerX: Double = js.native
  /**Gets or sets the center Point.y of this vertex, in document coordinates.*/
  var centerY: Double = js.native
  /**Gets or sets the model data, used only when virtualizing*/
  var data: js.Any = js.native
  /**Gets an iterator for all of the edges that go out of this vertex.*/
  var destinationEdges: Iterator[LayoutEdge] = js.native
  /**Gets an iterator for all of the vertexes that are connected with edges going out of this vertex.*/
  var destinationVertexes: Iterator[LayoutVertex] = js.native
  /**Gets an iterator for all of the edges that are connected with this vertex in either direction.*/
  var edges: Iterator[LayoutEdge] = js.native
  /**This read-only property returns the total number of edges that are connected with this vertex in either direction.*/
  var edgesCount: Double = js.native
  /**Gets or sets the offset of the .centerX and .centerY from the .bounds position.*/
  var focus: Point = js.native
  /**Gets or sets the relative X position of the "center" point, the focus.*/
  var focusX: Double = js.native
  /**Gets or sets the relative Y position of the "center" point, the focus.*/
  var focusY: Double = js.native
  /**Gets or sets the height of this vertex.*/
  var height: Double = js.native
  /**Gets or sets the LayoutNetwork that owns this vertex.*/
  var network: LayoutNetwork = js.native
  /**Gets or sets the Node associated with this vertex, if any.*/
  var node: Node = js.native
  /**Gets an iterator for all of the edges that come into this vertex.*/
  var sourceEdges: Iterator[LayoutEdge] = js.native
  /**Gets an iterator for all of the vertexes that are connected with edges coming into this vertex.*/
  var sourceVertexes: Iterator[LayoutVertex] = js.native
  /**Gets an iterator for all of the vertexes that are connected in either direction with this vertex.*/
  var vertexes: Iterator[LayoutVertex] = js.native
  /**Gets or sets the width of this vertex.*/
  var width: Double = js.native
  /**Gets or sets the left point of this vertex.*/
  var x: Double = js.native
  /**Gets or sets the top point of this vertex.*/
  var y: Double = js.native
  /**
    * Adds a LayoutEdge to the list of successors (the edge will be going out from this vertex).
    * @param {LayoutEdge} edge
    */
  def addDestinationEdge(edge: LayoutEdge): Unit = js.native
  /**
    * Adds a LayoutEdge to the list of predecessors (the edge will be coming into this vertex).
    * @param {LayoutEdge} edge
    */
  def addSourceEdge(edge: LayoutEdge): Unit = js.native
  /**
    * Moves the Node corresponding to this vertex so that its position is at the current .bounds point.
    */
  def commit(): Unit = js.native
  /**
    * Deletes a LayoutEdge from the list of successors (the edge was going out from this vertex).
    * @param {LayoutEdge} edge
    */
  def deleteDestinationEdge(edge: LayoutEdge): Unit = js.native
  /**
    * Deletes a LayoutEdge from the list of predecessors (the edge was coming into this vertex).
    * @param {LayoutEdge} edge
    */
  def deleteSourceEdge(edge: LayoutEdge): Unit = js.native
}

/* static members */
@JSImport("go", "LayoutVertex")
@js.native
object LayoutVertex extends js.Object {
  /**
    * This static function is used to compare the Part.text values of the .nodes of the argument LayoutVertexes.
    * @param {LayoutVertex} m
    * @param {LayoutVertex} n
    */
  def smartComparer(m: LayoutVertex, n: LayoutVertex): Double = js.native
  /**
    * This static function is used to compare the Part.text values of the .nodes of the argument LayoutVertexes.
    * @param {LayoutVertex} m
    * @param {LayoutVertex} n
    */
  def standardComparer(m: LayoutVertex, n: LayoutVertex): Double = js.native
}

