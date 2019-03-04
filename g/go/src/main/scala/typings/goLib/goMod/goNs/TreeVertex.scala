package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds TreeLayout-specific information about Nodes.*/
trait TreeVertex extends LayoutVertex {
  /**Gets or sets how this parent node should be aligned relative to its children.*/
  var alignment: EnumValue
  /**Gets or sets the actual absolute angle at which this node should grow.*/
  var angle: scala.Double
  /**Gets or sets how broad a node and its descendants should be.*/
  var breadthLimit: scala.Double
  /**Gets or sets the spot that children nodes' ports get as their ToSpot, if .setsChildPortSpot is true and the node has only a single port.*/
  var childPortSpot: Spot
  /**Gets or sets the logical children for this node.*/
  var children: js.Array[TreeVertex]
  /**This read-only property returns the number of immediate children this node has.*/
  var childrenCount: scala.Double
  /**Gets or sets the space to leave between the node and the comments.*/
  var commentMargin: scala.Double
  /**Gets or sets the space to leave between consecutive comments.*/
  var commentSpacing: scala.Double
  /**Gets or sets an array of Nodes that will be positioned near this node.*/
  var comments: js.Array[Node]
  /**Gets or sets how the children of this node should be packed together.*/
  var compaction: EnumValue
  /**Gets or sets the number of descendants this node has.*/
  var descendantCount: scala.Double
  /**Gets or sets whether this node has been initialized as part of TreeLayout.doLayout when building the tree structures.*/
  var initialized: scala.Boolean
  /**Gets or sets the distance between this node and its children.*/
  var layerSpacing: scala.Double
  /**Gets or sets the fraction of this node's depth that may overlap with the children's layer.*/
  var layerSpacingParentOverlap: scala.Double
  /**Gets or sets the number of single-parent ancestors this node has.*/
  var level: scala.Double
  /**Gets or sets the maximum number of children of any descendant of this node.*/
  var maxChildrenCount: scala.Double
  /**Gets or sets the maximum depth of the subtrees below this node.*/
  var maxGenerationCount: scala.Double
  /**Gets or sets the distance the first child should be indented.*/
  var nodeIndent: scala.Double
  /**Gets or sets whether the first child should be indented past the parent node's breadth.*/
  var nodeIndentPastParent: scala.Double
  /**Gets or sets the distance between child nodes.*/
  var nodeSpacing: scala.Double
  /**Gets or sets the logical parent for this node.*/
  var parent: TreeVertex
  /**Gets or sets the spot that this node's port gets as its FromSpot, if .setsPortSpot is true and the node has only a single port.*/
  var portSpot: Spot
  /**Gets or sets the position of this node relative to its parent node.*/
  var relativePosition: Point
  /**Gets or sets the distance the first child of each row should be indented.*/
  var rowIndent: scala.Double
  /**Gets or sets the distance between rows within one layer, all sharing the same parent.*/
  var rowSpacing: scala.Double
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var setsChildPortSpot: scala.Boolean
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var setsPortSpot: scala.Boolean
  /**Gets or sets whether and in what order the children should be sorted.*/
  var sorting: EnumValue
  /**Gets or sets the offset of this parent node relative to its whole subtree.*/
  var subtreeOffset: Point
  /**Gets or sets the size of the subtree (including all descendants) parented by this node.*/
  var subtreeSize: Size
  /**Gets or sets how the children should be sorted.*/
  def comparer(a: TreeVertex, b: TreeVertex): scala.Double
  /**
    * Copy inherited properties from another TreeVertex to this one.
    * @param {TreeVertex} copy
    */
  def copyInheritedPropertiesFrom(copy: TreeVertex): scala.Unit
}

object TreeVertex {
  @scala.inline
  def apply(
    addDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    addSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    alignment: EnumValue,
    angle: scala.Double,
    bounds: Rect,
    breadthLimit: scala.Double,
    centerX: scala.Double,
    centerY: scala.Double,
    childPortSpot: Spot,
    children: js.Array[TreeVertex],
    childrenCount: scala.Double,
    commentMargin: scala.Double,
    commentSpacing: scala.Double,
    comments: js.Array[Node],
    commit: js.Function0[scala.Unit],
    compaction: EnumValue,
    comparer: js.Function2[TreeVertex, TreeVertex, scala.Double],
    copyInheritedPropertiesFrom: js.Function1[TreeVertex, scala.Unit],
    data: js.Any,
    deleteDestinationEdge: js.Function1[LayoutEdge, scala.Unit],
    deleteSourceEdge: js.Function1[LayoutEdge, scala.Unit],
    descendantCount: scala.Double,
    destinationEdges: Iterator[LayoutEdge],
    destinationVertexes: Iterator[LayoutVertex],
    edges: Iterator[LayoutEdge],
    edgesCount: scala.Double,
    focus: Point,
    focusX: scala.Double,
    focusY: scala.Double,
    height: scala.Double,
    initialized: scala.Boolean,
    layerSpacing: scala.Double,
    layerSpacingParentOverlap: scala.Double,
    level: scala.Double,
    maxChildrenCount: scala.Double,
    maxGenerationCount: scala.Double,
    network: LayoutNetwork,
    node: Node,
    nodeIndent: scala.Double,
    nodeIndentPastParent: scala.Double,
    nodeSpacing: scala.Double,
    parent: TreeVertex,
    portSpot: Spot,
    relativePosition: Point,
    rowIndent: scala.Double,
    rowSpacing: scala.Double,
    setsChildPortSpot: scala.Boolean,
    setsPortSpot: scala.Boolean,
    sorting: EnumValue,
    sourceEdges: Iterator[LayoutEdge],
    sourceVertexes: Iterator[LayoutVertex],
    subtreeOffset: Point,
    subtreeSize: Size,
    vertexes: Iterator[LayoutVertex],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): TreeVertex = {
    val __obj = js.Dynamic.literal(addDestinationEdge = addDestinationEdge, addSourceEdge = addSourceEdge, alignment = alignment, angle = angle, bounds = bounds, breadthLimit = breadthLimit, centerX = centerX, centerY = centerY, childPortSpot = childPortSpot, children = children, childrenCount = childrenCount, commentMargin = commentMargin, commentSpacing = commentSpacing, comments = comments, commit = commit, compaction = compaction, comparer = comparer, copyInheritedPropertiesFrom = copyInheritedPropertiesFrom, data = data, deleteDestinationEdge = deleteDestinationEdge, deleteSourceEdge = deleteSourceEdge, descendantCount = descendantCount, destinationEdges = destinationEdges, destinationVertexes = destinationVertexes, edges = edges, edgesCount = edgesCount, focus = focus, focusX = focusX, focusY = focusY, height = height, initialized = initialized, layerSpacing = layerSpacing, layerSpacingParentOverlap = layerSpacingParentOverlap, level = level, maxChildrenCount = maxChildrenCount, maxGenerationCount = maxGenerationCount, network = network, node = node, nodeIndent = nodeIndent, nodeIndentPastParent = nodeIndentPastParent, nodeSpacing = nodeSpacing, parent = parent, portSpot = portSpot, relativePosition = relativePosition, rowIndent = rowIndent, rowSpacing = rowSpacing, setsChildPortSpot = setsChildPortSpot, setsPortSpot = setsPortSpot, sorting = sorting, sourceEdges = sourceEdges, sourceVertexes = sourceVertexes, subtreeOffset = subtreeOffset, subtreeSize = subtreeSize, vertexes = vertexes, width = width, x = x, y = y)
  
    __obj.asInstanceOf[TreeVertex]
  }
}

