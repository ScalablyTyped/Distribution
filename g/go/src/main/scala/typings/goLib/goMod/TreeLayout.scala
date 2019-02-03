package typings
package goLib.goMod

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
class TreeLayout ()
  extends goLib.goMod.goNs.TreeLayout

/* static members */
@JSImport("go", "TreeLayout")
@js.native
object TreeLayout extends js.Object {
  /**The children are positioned in a bus, only on the bottom or right side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentBottomRightBus: goLib.goMod.goNs.EnumValue = js.native
  /**The children are positioned in a bus on both sides of an "aisle" where the links to them go, with the last odd child (if any) placed at the end of the aisle in the middle.*/
  var AlignmentBus: goLib.goMod.goNs.EnumValue = js.native
  /**Like TreeLayout.AlignmentBus with the children arranged on both sides of an "aisle" with any last odd child placed at the end of the aisle, but the children get an TreeVertex.angle that depends on which side of the aisle they were placed.*/
  var AlignmentBusBranching: goLib.goMod.goNs.EnumValue = js.native
  /**The parent is centered at the middle of the range of its immediate child nodes; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentCenterChildren: goLib.goMod.goNs.EnumValue = js.native
  /**The parent is centered at the middle of the range of its child subtrees; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentCenterSubtrees: goLib.goMod.goNs.EnumValue = js.native
  /**The parent is positioned near the last of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentEnd: goLib.goMod.goNs.EnumValue = js.native
  /**The parent is positioned near the first of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentStart: goLib.goMod.goNs.EnumValue = js.native
  /**The children are positioned in a bus, only on the top or left side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  var AlignmentTopLeftBus: goLib.goMod.goNs.EnumValue = js.native
  /**Do not move each root node, but position all of their descendants relative to their root; This value is used for TreeLayout.arrangement.*/
  var ArrangementFixedRoots: goLib.goMod.goNs.EnumValue = js.native
  /**Position each tree in a non-overlapping fashion by increasing X coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  var ArrangementHorizontal: goLib.goMod.goNs.EnumValue = js.native
  /**Position each tree in a non-overlapping fashion by increasing Y coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  var ArrangementVertical: goLib.goMod.goNs.EnumValue = js.native
  /**A simple fitting of subtrees; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  var CompactionBlock: goLib.goMod.goNs.EnumValue = js.native
  /**Only simple placement of children next to each other, as determined by their subtree breadth; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  var CompactionNone: goLib.goMod.goNs.EnumValue = js.native
  /**This default value for TreeLayout.layerStyle causes each node takes up only the depth that it needs.*/
  var LayerIndividual: goLib.goMod.goNs.EnumValue = js.native
  /**This value for TreeLayout.layerStyle causes all of the children of a parent node take up the same amount of depth -- this typically causes all cousins to be aligned.*/
  var LayerSiblings: goLib.goMod.goNs.EnumValue = js.native
  /**This value for TreeLayout.layerStyle causes all nodes with the same TreeVertex.level throughout the tree take up the same amount of depth.*/
  var LayerUniform: goLib.goMod.goNs.EnumValue = js.native
  /**This value for TreeLayout.path causes the value of Diagram.isTreePathToChildren to effectively choose either TreeLayout.PathDestination (if true) or TreeLayout.PathSource (if false).*/
  var PathDefault: goLib.goMod.goNs.EnumValue = js.native
  /**The children of a TreeVertex are its LayoutVertex.destinationVertexes, the collection of connected LayoutEdge.toVertexes; This value is used for TreeLayout.path.*/
  var PathDestination: goLib.goMod.goNs.EnumValue = js.native
  /**The children of a TreeVertex are its LayoutVertex.sourceVertexes, the collection of connected LayoutEdge.fromVertexes; This value is used for TreeLayout.path.*/
  var PathSource: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child according to the sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingAscending: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in reverse sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingDescending: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in the order in which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingForwards: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in reverse order from which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  var SortingReverse: goLib.goMod.goNs.EnumValue = js.native
  /**Alternate layers of the tree have different properties, typically including the angle; This value is used for TreeLayout.treeStyle.*/
  var StyleAlternating: goLib.goMod.goNs.EnumValue = js.native
  /**Just like the standard layered tree style, except that the nodes with children but no grandchildren have alternate properties; This value is used for TreeLayout.treeStyle.*/
  var StyleLastParents: goLib.goMod.goNs.EnumValue = js.native
  /**The normal tree style, where all of the children of each TreeVertex are lined up horizontally or vertically; This value is used for TreeLayout.treeStyle.*/
  var StyleLayered: goLib.goMod.goNs.EnumValue = js.native
  /**All of the nodes get the alternate properties, except the root node gets the default properties; This value is used for TreeLayout.treeStyle.*/
  var StyleRootOnly: goLib.goMod.goNs.EnumValue = js.native
}

