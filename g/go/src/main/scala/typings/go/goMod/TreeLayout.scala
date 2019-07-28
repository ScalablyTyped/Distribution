package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This layout positions nodes in a tree-like arrangement.
  */
@JSImport("go", "TreeLayout")
@js.native
/**
  * Constructs a TreeLayout with no Layout.network and with no owning Layout.diagram.
  */
class TreeLayout () extends Layout {
  /**Gets or sets the default alignment of parents relative to their children.*/
  var alignment: EnumValue = js.native
  /**Gets or sets the default alignment of parents relative to their children.*/
  var alternateAlignment: EnumValue = js.native
  /**Gets or sets the default direction for tree growth.*/
  var alternateAngle: Double = js.native
  /**Gets or sets a limit on how broad a tree should be.*/
  var alternateBreadthLimit: Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot The default value is Spot.Default.*/
  var alternateChildPortSpot: Spot = js.native
  /**Gets or sets the distance between a node and its comments.*/
  var alternateCommentMargin: Double = js.native
  /**Gets or sets the distance between comments.*/
  var alternateCommentSpacing: Double = js.native
  /**Gets or sets how closely to pack the child nodes of a subtree.*/
  var alternateCompaction: EnumValue = js.native
  /**Gets or sets the object holding the default values for alternate layer TreeVertexes, used when the .treeStyle is .StyleAlternating or .StyleLastParents.*/
  var alternateDefaults: TreeVertex = js.native
  /**Gets or sets the distance between a parent node and its children.*/
  var alternateLayerSpacing: Double = js.native
  /**Gets or sets the fraction of the node's depth for which the children's layer starts overlapped with the parent's layer.*/
  var alternateLayerSpacingParentOverlap: Double = js.native
  /**Gets or sets the default indentation of the first child.*/
  var alternateNodeIndent: Double = js.native
  /**Gets or sets the fraction of this node's breadth is added to .nodeIndent to determine any spacing at the start of the children.*/
  var alternateNodeIndentPastParent: Double = js.native
  /**Gets or sets the distance between child nodes.*/
  var alternateNodeSpacing: Double = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot.*/
  var alternatePortSpot: Spot = js.native
  /**Gets or sets the default indentation of the first child of each row, if the .alignment is not a "Center" alignment.*/
  var alternateRowIndent: Double = js.native
  /**Gets or sets the distance between rows of children.*/
  var alternateRowSpacing: Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var alternateSetsChildPortSpot: Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var alternateSetsPortSpot: Boolean = js.native
  /**Gets or sets the default Sorting policy.*/
  var alternateSorting: EnumValue = js.native
  /**Gets or sets the default direction for tree growth.*/
  var angle: Double = js.native
  /**Gets or sets how .arrangeTrees should lay out the separate trees.*/
  var arrangement: EnumValue = js.native
  /**Gets or sets the space between which .arrangeTrees will position the trees.*/
  var arrangementSpacing: Size = js.native
  /**Gets or sets a limit on how broad a tree should be.*/
  var breadthLimit: Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot.*/
  var childPortSpot: Spot = js.native
  /**Gets or sets the distance between a node and its comments.*/
  var commentMargin: Double = js.native
  /**Gets or sets the distance between comments.*/
  var commentSpacing: Double = js.native
  /**Gets or sets whether to call .addComments.*/
  var comments: Boolean = js.native
  /**Gets or sets how closely to pack the child nodes of a subtree.*/
  var compaction: EnumValue = js.native
  /**Gets or sets the distance between a parent node and its children.*/
  var layerSpacing: Double = js.native
  /**Gets or sets the fraction of the node's depth for which the children's layer starts overlapped with the parent's layer.*/
  var layerSpacingParentOverlap: Double = js.native
  /**Gets or sets the manner in which the nodes are aligned in layers.*/
  var layerStyle: EnumValue = js.native
  /**Gets or sets the default indentation of the first child.*/
  var nodeIndent: Double = js.native
  /**Gets or sets the fraction of this node's breadth is added to .nodeIndent to determine any spacing at the start of the children.*/
  var nodeIndentPastParent: Double = js.native
  /**Gets or sets the distance between child nodes.*/
  var nodeSpacing: Double = js.native
  /**Gets or sets how the tree should be constructed from the TreeEdges connecting TreeVertexes.*/
  var path: EnumValue = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot.*/
  var portSpot: Spot = js.native
  /**Gets or sets the object holding the default values for root TreeVertexes.*/
  var rootDefaults: TreeVertex = js.native
  /**Gets or sets the collection of root vertexes.*/
  var roots: Set[TreeVertex | Node] = js.native
  /**Gets or sets the default indentation of the first child of each row, if the .alignment is not a "Center" alignment.*/
  var rowIndent: Double = js.native
  /**Gets or sets the distance between rows of children.*/
  var rowSpacing: Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var setsChildPortSpot: Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var setsPortSpot: Boolean = js.native
  /**Gets or sets the default Sorting policy.*/
  var sorting: EnumValue = js.native
  /**Gets or sets the Style for the resulting trees.*/
  var treeStyle: EnumValue = js.native
  /**
    * Find associated objects to be positioned along with the TreeVertex.
    * @param {LayoutVertex} v
    */
  def addComments(v: TreeVertex): Unit = js.native
  /**Gets or sets the default comparison function used for sorting.*/
  def alternateComparer(a: TreeVertex, b: TreeVertex): Double = js.native
  /**
    * Position each separate tree.
    */
  def arrangeTrees(): Unit = js.native
  /**
    * Assign final property values for a TreeVertex.
    * @param {LayoutVertex} v
    */
  def assignTreeVertexValues(v: TreeVertex): Unit = js.native
  /**
    * This overridable method is called by commitLayout if layerStyle is LayerUniform
    * to support custom arrangement of bands or labels across each layout layer.
    * @param Array<*> layerRects an Array of Rects with the bounds of each of the "layers"
    * @param {Point} offset the position of the top-left corner of the banded area relative to the coordinates given by the layerRects
    */
  def commitLayers(layerRects: js.Array[Rect], offset: Point): Unit = js.native
  /**
    * Commit the position and routing of all edge links.
    */
  def commitLinks(): Unit = js.native
  /**
    * Commit the position of all vertex nodes.
    */
  def commitNodes(): Unit = js.native
  /**Gets or sets the default comparison function used for sorting.*/
  def comparer(a: TreeVertex, b: TreeVertex): Double = js.native
  /**
    * Assign initial property values for a TreeVertex.
    * @param {LayoutVertex} v
    */
  def initializeTreeVertexValues(v: TreeVertex): Unit = js.native
  /**
    * Position and TreeVertex.comments around the vertex.
    * @param {LayoutVertex} v
    */
  def layoutComments(v: TreeVertex): Unit = js.native
}

/* static members */
@JSImport("go", "TreeLayout")
@js.native
object TreeLayout extends js.Object {
  /**The children are positioned in a bus, only on the bottom or right side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentBottomRightBus: EnumValue = js.native
  /**The children are positioned in a bus on both sides of an "aisle" where the links to them go, with the last odd child (if any) placed at the end of the aisle in the middle.*/
  var AlignmentBus: EnumValue = js.native
  /**Like TreeLayout.AlignmentBus with the children arranged on both sides of an "aisle" with any last odd child placed at the end of the aisle, but the children get an TreeVertex.angle that depends on which side of the aisle they were placed.*/
  var AlignmentBusBranching: EnumValue = js.native
  /**The parent is centered at the middle of the range of its immediate child nodes; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentCenterChildren: EnumValue = js.native
  /**The parent is centered at the middle of the range of its child subtrees; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentCenterSubtrees: EnumValue = js.native
  /**The parent is positioned near the last of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentEnd: EnumValue = js.native
  /**The parent is positioned near the first of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentStart: EnumValue = js.native
  /**The children are positioned in a bus, only on the top or left side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentTopLeftBus: EnumValue = js.native
  /**Do not move each root node, but position all of their descendants relative to their root; This value is used for TreeLayout.arrangement.*/
  var ArrangementFixedRoots: EnumValue = js.native
  /**Position each tree in a non-overlapping fashion by increasing X coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  var ArrangementHorizontal: EnumValue = js.native
  /**Position each tree in a non-overlapping fashion by increasing Y coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  var ArrangementVertical: EnumValue = js.native
  /**A simple fitting of subtrees; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  var CompactionBlock: EnumValue = js.native
  /**Only simple placement of children next to each other, as determined by their subtree breadth; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  var CompactionNone: EnumValue = js.native
  /**This default value for TreeLayout.layerStyle causes each node takes up only the depth that it needs.*/
  var LayerIndividual: EnumValue = js.native
  /**This value for TreeLayout.layerStyle causes all of the children of a parent node take up the same amount of depth -- this typically causes all cousins to be aligned.*/
  var LayerSiblings: EnumValue = js.native
  /**This value for TreeLayout.layerStyle causes all nodes with the same TreeVertex.level throughout the tree take up the same amount of depth.*/
  var LayerUniform: EnumValue = js.native
  /**This value for TreeLayout.path causes the value of Diagram.isTreePathToChildren to effectively choose either TreeLayout.PathDestination (if true) or TreeLayout.PathSource (if false).*/
  var PathDefault: EnumValue = js.native
  /**The children of a TreeVertex are its LayoutVertex.destinationVertexes, the collection of connected LayoutEdge.toVertexes; This value is used for TreeLayout.path.*/
  var PathDestination: EnumValue = js.native
  /**The children of a TreeVertex are its LayoutVertex.sourceVertexes, the collection of connected LayoutEdge.fromVertexes; This value is used for TreeLayout.path.*/
  var PathSource: EnumValue = js.native
  /**Lay out each child according to the sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingAscending: EnumValue = js.native
  /**Lay out each child in reverse sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingDescending: EnumValue = js.native
  /**Lay out each child in the order in which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingForwards: EnumValue = js.native
  /**Lay out each child in reverse order from which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingReverse: EnumValue = js.native
  /**Alternate layers of the tree have different properties, typically including the angle; This value is used for TreeLayout.treeStyle.*/
  var StyleAlternating: EnumValue = js.native
  /**Just like the standard layered tree style, except that the nodes with children but no grandchildren have alternate properties; This value is used for TreeLayout.treeStyle.*/
  var StyleLastParents: EnumValue = js.native
  /**The normal tree style, where all of the children of each TreeVertex are lined up horizontally or vertically; This value is used for TreeLayout.treeStyle.*/
  var StyleLayered: EnumValue = js.native
  /**All of the nodes get the alternate properties, except the root node gets the default properties; This value is used for TreeLayout.treeStyle.*/
  var StyleRootOnly: EnumValue = js.native
}

