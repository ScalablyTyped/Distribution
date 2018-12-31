package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This layout positions nodes in a tree-like arrangement.
  */
@js.native
trait TreeLayout extends Layout {
  /**Gets or sets the default alignment of parents relative to their children.*/
  var alignment: EnumValue = js.native
  /**Gets or sets the default alignment of parents relative to their children.*/
  var alternateAlignment: EnumValue = js.native
  /**Gets or sets the default direction for tree growth.*/
  var alternateAngle: scala.Double = js.native
  /**Gets or sets a limit on how broad a tree should be.*/
  var alternateBreadthLimit: scala.Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot The default value is Spot.Default.*/
  var alternateChildPortSpot: Spot = js.native
  /**Gets or sets the distance between a node and its comments.*/
  var alternateCommentMargin: scala.Double = js.native
  /**Gets or sets the distance between comments.*/
  var alternateCommentSpacing: scala.Double = js.native
  /**Gets or sets how closely to pack the child nodes of a subtree.*/
  var alternateCompaction: EnumValue = js.native
  /**Gets or sets the object holding the default values for alternate layer TreeVertexes, used when the .treeStyle is .StyleAlternating or .StyleLastParents.*/
  var alternateDefaults: TreeVertex = js.native
  /**Gets or sets the distance between a parent node and its children.*/
  var alternateLayerSpacing: scala.Double = js.native
  /**Gets or sets the fraction of the node's depth for which the children's layer starts overlapped with the parent's layer.*/
  var alternateLayerSpacingParentOverlap: scala.Double = js.native
  /**Gets or sets the default indentation of the first child.*/
  var alternateNodeIndent: scala.Double = js.native
  /**Gets or sets the fraction of this node's breadth is added to .nodeIndent to determine any spacing at the start of the children.*/
  var alternateNodeIndentPastParent: scala.Double = js.native
  /**Gets or sets the distance between child nodes.*/
  var alternateNodeSpacing: scala.Double = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot.*/
  var alternatePortSpot: Spot = js.native
  /**Gets or sets the default indentation of the first child of each row, if the .alignment is not a "Center" alignment.*/
  var alternateRowIndent: scala.Double = js.native
  /**Gets or sets the distance between rows of children.*/
  var alternateRowSpacing: scala.Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var alternateSetsChildPortSpot: scala.Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var alternateSetsPortSpot: scala.Boolean = js.native
  /**Gets or sets the default Sorting policy.*/
  var alternateSorting: EnumValue = js.native
  /**Gets or sets the default direction for tree growth.*/
  var angle: scala.Double = js.native
  /**Gets or sets how .arrangeTrees should lay out the separate trees.*/
  var arrangement: EnumValue = js.native
  /**Gets or sets the space between which .arrangeTrees will position the trees.*/
  var arrangementSpacing: Size = js.native
  /**Gets or sets a limit on how broad a tree should be.*/
  var breadthLimit: scala.Double = js.native
  /**Gets or sets the spot that children nodes' ports get as their ToSpot.*/
  var childPortSpot: Spot = js.native
  /**Gets or sets the distance between a node and its comments.*/
  var commentMargin: scala.Double = js.native
  /**Gets or sets the distance between comments.*/
  var commentSpacing: scala.Double = js.native
  /**Gets or sets whether to call .addComments.*/
  var comments: scala.Boolean = js.native
  /**Gets or sets how closely to pack the child nodes of a subtree.*/
  var compaction: EnumValue = js.native
  /**Gets or sets the distance between a parent node and its children.*/
  var layerSpacing: scala.Double = js.native
  /**Gets or sets the fraction of the node's depth for which the children's layer starts overlapped with the parent's layer.*/
  var layerSpacingParentOverlap: scala.Double = js.native
  /**Gets or sets the manner in which the nodes are aligned in layers.*/
  var layerStyle: EnumValue = js.native
  /**Gets or sets the default indentation of the first child.*/
  var nodeIndent: scala.Double = js.native
  /**Gets or sets the fraction of this node's breadth is added to .nodeIndent to determine any spacing at the start of the children.*/
  var nodeIndentPastParent: scala.Double = js.native
  /**Gets or sets the distance between child nodes.*/
  var nodeSpacing: scala.Double = js.native
  /**Gets or sets how the tree should be constructed from the TreeEdges connecting TreeVertexes.*/
  var path: EnumValue = js.native
  /**Gets or sets the spot that this node's port gets as its FromSpot.*/
  var portSpot: Spot = js.native
  /**Gets or sets the object holding the default values for root TreeVertexes.*/
  var rootDefaults: TreeVertex = js.native
  /**Gets or sets the collection of root vertexes.*/
  var roots: Set[TreeVertex | Node] = js.native
  /**Gets or sets the default indentation of the first child of each row, if the .alignment is not a "Center" alignment.*/
  var rowIndent: scala.Double = js.native
  /**Gets or sets the distance between rows of children.*/
  var rowSpacing: scala.Double = js.native
  /**Gets or sets whether the TreeLayout should set the ToSpot for each child node port.*/
  var setsChildPortSpot: scala.Boolean = js.native
  /**Gets or sets whether the TreeLayout should set the FromSpot for this parent node port.*/
  var setsPortSpot: scala.Boolean = js.native
  /**Gets or sets the default Sorting policy.*/
  var sorting: EnumValue = js.native
  /**Gets or sets the Style for the resulting trees.*/
  var treeStyle: EnumValue = js.native
  /**
    * Find associated objects to be positioned along with the TreeVertex.
    * @param {LayoutVertex} v
    */
  def addComments(v: TreeVertex): scala.Unit = js.native
  /**Gets or sets the default comparison function used for sorting.*/
  def alternateComparer(a: TreeVertex, b: TreeVertex): scala.Double = js.native
  /**
    * Position each separate tree.
    */
  def arrangeTrees(): scala.Unit = js.native
  /**
    * Assign final property values for a TreeVertex.
    * @param {LayoutVertex} v
    */
  def assignTreeVertexValues(v: TreeVertex): scala.Unit = js.native
  /**
    * This overridable method is called by commitLayout if layerStyle is LayerUniform
    * to support custom arrangement of bands or labels across each layout layer.
    * @param Array<*> layerRects an Array of Rects with the bounds of each of the "layers"
    * @param {Point} offset the position of the top-left corner of the banded area relative to the coordinates given by the layerRects
    */
  def commitLayers(layerRects: js.Array[Rect], offset: Point): scala.Unit = js.native
  /**
    * Commit the position and routing of all edge links.
    */
  def commitLinks(): scala.Unit = js.native
  /**
    * Commit the position of all vertex nodes.
    */
  def commitNodes(): scala.Unit = js.native
  /**Gets or sets the default comparison function used for sorting.*/
  def comparer(a: TreeVertex, b: TreeVertex): scala.Double = js.native
  /**
    * Assign initial property values for a TreeVertex.
    * @param {LayoutVertex} v
    */
  def initializeTreeVertexValues(v: TreeVertex): scala.Unit = js.native
  /**
    * Position and TreeVertex.comments around the vertex.
    * @param {LayoutVertex} v
    */
  def layoutComments(v: TreeVertex): scala.Unit = js.native
}

