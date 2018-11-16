package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Nodes.*/
@JSImport("go", "LayeredDigraphVertex")
@js.native
class LayeredDigraphVertex ()
  extends goLib.goMod.goNs.LayeredDigraphVertex {
  /**Gets or sets the Bounds of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var bounds: goLib.goMod.goNs.Rect = js.native
  /**Gets or sets the center Point.x of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var centerX: scala.Double = js.native
  /**Gets or sets the center Point.y of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var centerY: scala.Double = js.native
  /**The column to which the node is assigned.*/
  /* CompleteClass */
  override var column: scala.Double = js.native
  /**The connected component to which the node is assigned.*/
  /* CompleteClass */
  override var component: scala.Double = js.native
  /**Gets or sets the model data, used only when virtualizing*/
  /* CompleteClass */
  override var data: js.Any = js.native
  /**Gets an iterator for all of the edges that go out of this vertex.*/
  /* CompleteClass */
  override var destinationEdges: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutEdge] = js.native
  /**Gets an iterator for all of the vertexes that are connected with edges going out of this vertex.*/
  /* CompleteClass */
  override var destinationVertexes: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutVertex] = js.native
  /**Gets an iterator for all of the edges that are connected with this vertex in either direction.*/
  /* CompleteClass */
  override var edges: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutEdge] = js.native
  /**This read-only property returns the total number of edges that are connected with this vertex in either direction.*/
  /* CompleteClass */
  override var edgesCount: scala.Double = js.native
  /**Gets or sets the offset of the .centerX and .centerY from the .bounds position.*/
  /* CompleteClass */
  override var focus: goLib.goMod.goNs.Point = js.native
  /**Gets or sets the relative X position of the "center" point, the focus.*/
  /* CompleteClass */
  override var focusX: scala.Double = js.native
  /**Gets or sets the relative Y position of the "center" point, the focus.*/
  /* CompleteClass */
  override var focusY: scala.Double = js.native
  /**Gets or sets the height of this vertex.*/
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**The index to which the node is assigned.*/
  /* CompleteClass */
  override var index: scala.Double = js.native
  /**The layer to which the node is assigned.*/
  /* CompleteClass */
  override var layer: scala.Double = js.native
  /**Another LayeredDigraphVertex in the same layer that this node should be near.*/
  /* CompleteClass */
  override var near: goLib.goMod.goNs.LayeredDigraphVertex = js.native
  /**Gets or sets the LayoutNetwork that owns this vertex.*/
  /* CompleteClass */
  override var network: goLib.goMod.goNs.LayoutNetwork = js.native
  /**Gets or sets the Node associated with this vertex, if any.*/
  /* CompleteClass */
  override var node: goLib.goMod.goNs.Node = js.native
  /**Gets an iterator for all of the edges that come into this vertex.*/
  /* CompleteClass */
  override var sourceEdges: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutEdge] = js.native
  /**Gets an iterator for all of the vertexes that are connected with edges coming into this vertex.*/
  /* CompleteClass */
  override var sourceVertexes: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutVertex] = js.native
  /**Gets an iterator for all of the vertexes that are connected in either direction with this vertex.*/
  /* CompleteClass */
  override var vertexes: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutVertex] = js.native
  /**Gets or sets the width of this vertex.*/
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**Gets or sets the left point of this vertex.*/
  /* CompleteClass */
  override var x: scala.Double = js.native
  /**Gets or sets the top point of this vertex.*/
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
          * Adds a LayoutEdge to the list of successors (the edge will be going out from this vertex).
          * @param {LayoutEdge} edge
          */
  /* CompleteClass */
  override def addDestinationEdge(edge: goLib.goMod.goNs.LayoutEdge): scala.Unit = js.native
  /**
          * Adds a LayoutEdge to the list of predecessors (the edge will be coming into this vertex).
          * @param {LayoutEdge} edge
          */
  /* CompleteClass */
  override def addSourceEdge(edge: goLib.goMod.goNs.LayoutEdge): scala.Unit = js.native
  /**
          * Moves the Node corresponding to this vertex so that its position is at the current .bounds point.
          */
  /* CompleteClass */
  override def commit(): scala.Unit = js.native
  /**
          * Deletes a LayoutEdge from the list of successors (the edge was going out from this vertex).
          * @param {LayoutEdge} edge
          */
  /* CompleteClass */
  override def deleteDestinationEdge(edge: goLib.goMod.goNs.LayoutEdge): scala.Unit = js.native
  /**
          * Deletes a LayoutEdge from the list of predecessors (the edge was coming into this vertex).
          * @param {LayoutEdge} edge
          */
  /* CompleteClass */
  override def deleteSourceEdge(edge: goLib.goMod.goNs.LayoutEdge): scala.Unit = js.native
}

