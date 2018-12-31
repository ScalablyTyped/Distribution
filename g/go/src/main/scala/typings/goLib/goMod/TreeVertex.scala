package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds TreeLayout-specific information about Nodes.*/
@JSImport("go", "TreeVertex")
@js.native
class TreeVertex ()
  extends goLib.goMod.goNs.TreeVertex {
  /**Gets or sets how this parent node should be aligned relative to its children.*/
  /* CompleteClass */
  override var alignment: goLib.goMod.goNs.EnumValue = js.native
  /**Gets or sets the actual absolute angle at which this node should grow.*/
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /**Gets or sets the Bounds of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var bounds: goLib.goMod.goNs.Rect = js.native
  /**Gets or sets how broad a node and its descendants should be.*/
  /* CompleteClass */
  override var breadthLimit: scala.Double = js.native
  /**Gets or sets the center Point.x of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var centerX: scala.Double = js.native
  /**Gets or sets the center Point.y of this vertex, in document coordinates.*/
  /* CompleteClass */
  override var centerY: scala.Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot, if .setsChildPortSpot is true and the node has only a single port.*/
  /* CompleteClass */
  override var childPortSpot: goLib.goMod.goNs.Spot = js.native
  /**Gets or sets the logical children for this node.*/
  /* CompleteClass */
  override var children: js.Array[goLib.goMod.goNs.TreeVertex] = js.native
  /**This read-only property returns the number of immediate children this node has.*/
  /* CompleteClass */
  override var childrenCount: scala.Double = js.native
  /**Gets or sets the space to leave between the node and the comments.*/
  /* CompleteClass */
  override var commentMargin: scala.Double = js.native
  /**Gets or sets the space to leave between consecutive comments.*/
  /* CompleteClass */
  override var commentSpacing: scala.Double = js.native
  /**Gets or sets an array of Nodes that will be positioned near this node.*/
  /* CompleteClass */
  override var comments: js.Array[goLib.goMod.goNs.Node] = js.native
  /**Gets or sets how the children of this node should be packed together.*/
  /* CompleteClass */
  override var compaction: goLib.goMod.goNs.EnumValue = js.native
  /**Gets or sets the model data, used only when virtualizing*/
  /* CompleteClass */
  override var data: js.Any = js.native
  /**Gets or sets the number of descendants this node has.*/
  /* CompleteClass */
  override var descendantCount: scala.Double = js.native
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
  /**Gets or sets whether this node has been initialized as part of TreeLayout.doLayout when building the tree structures.*/
  /* CompleteClass */
  override var initialized: scala.Boolean = js.native
  /**Gets or sets the distance between this node and its children.*/
  /* CompleteClass */
  override var layerSpacing: scala.Double = js.native
  /**Gets or sets the fraction of this node's depth that may overlap with the children's layer.*/
  /* CompleteClass */
  override var layerSpacingParentOverlap: scala.Double = js.native
  /**Gets or sets the number of single-parent ancestors this node has.*/
  /* CompleteClass */
  override var level: scala.Double = js.native
  /**Gets or sets the maximum number of children of any descendant of this node.*/
  /* CompleteClass */
  override var maxChildrenCount: scala.Double = js.native
  /**Gets or sets the maximum depth of the subtrees below this node.*/
  /* CompleteClass */
  override var maxGenerationCount: scala.Double = js.native
  /**Gets or sets the LayoutNetwork that owns this vertex.*/
  /* CompleteClass */
  override var network: goLib.goMod.goNs.LayoutNetwork = js.native
  /**Gets or sets the Node associated with this vertex, if any.*/
  /* CompleteClass */
  override var node: goLib.goMod.goNs.Node = js.native
  /**Gets or sets the distance the first child should be indented.*/
  /* CompleteClass */
  override var nodeIndent: scala.Double = js.native
  /**Gets or sets whether the first child should be indented past the parent node's breadth.*/
  /* CompleteClass */
  override var nodeIndentPastParent: scala.Double = js.native
  /**Gets or sets the distance between child nodes.*/
  /* CompleteClass */
  override var nodeSpacing: scala.Double = js.native
  /**Gets or sets the logical parent for this node.*/
  /* CompleteClass */
  override var parent: goLib.goMod.goNs.TreeVertex = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot, if .setsPortSpot is true and the node has only a single port.*/
  /* CompleteClass */
  override var portSpot: goLib.goMod.goNs.Spot = js.native
  /**Gets or sets the position of this node relative to its parent node.*/
  /* CompleteClass */
  override var relativePosition: goLib.goMod.goNs.Point = js.native
  /**Gets or sets the distance the first child of each row should be indented.*/
  /* CompleteClass */
  override var rowIndent: scala.Double = js.native
  /**Gets or sets the distance between rows within one layer, all sharing the same parent.*/
  /* CompleteClass */
  override var rowSpacing: scala.Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  /* CompleteClass */
  override var setsChildPortSpot: scala.Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  /* CompleteClass */
  override var setsPortSpot: scala.Boolean = js.native
  /**Gets or sets whether and in what order the children should be sorted.*/
  /* CompleteClass */
  override var sorting: goLib.goMod.goNs.EnumValue = js.native
  /**Gets an iterator for all of the edges that come into this vertex.*/
  /* CompleteClass */
  override var sourceEdges: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutEdge] = js.native
  /**Gets an iterator for all of the vertexes that are connected with edges coming into this vertex.*/
  /* CompleteClass */
  override var sourceVertexes: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.LayoutVertex] = js.native
  /**Gets or sets the offset of this parent node relative to its whole subtree.*/
  /* CompleteClass */
  override var subtreeOffset: goLib.goMod.goNs.Point = js.native
  /**Gets or sets the size of the subtree (including all descendants) parented by this node.*/
  /* CompleteClass */
  override var subtreeSize: goLib.goMod.goNs.Size = js.native
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
  /**Gets or sets how the children should be sorted.*/
  /* CompleteClass */
  override def comparer(a: goLib.goMod.goNs.TreeVertex, b: goLib.goMod.goNs.TreeVertex): scala.Double = js.native
  /**
    * Copy inherited properties from another TreeVertex to this one.
    * @param {TreeVertex} copy
    */
  /* CompleteClass */
  override def copyInheritedPropertiesFrom(copy: goLib.goMod.goNs.TreeVertex): scala.Unit = js.native
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

