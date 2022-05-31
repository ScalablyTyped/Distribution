package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This layout positions nodes in a tree-like arrangement.
  */
@JSGlobal("go.TreeLayout")
@js.native
/**
  * Constructs a TreeLayout with no Layout.network and with no owning Layout.diagram.
  */
class TreeLayout ()
  extends typings.go.mod.TreeLayout
object TreeLayout {
  
  @JSGlobal("go.TreeLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**The children are positioned in a bus, only on the bottom or right side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentBottomRightBus")
  @js.native
  def AlignmentBottomRightBus: typings.go.mod.EnumValue = js.native
  inline def AlignmentBottomRightBus_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentBottomRightBus")(x.asInstanceOf[js.Any])
  
  /**The children are positioned in a bus on both sides of an "aisle" where the links to them go, with the last odd child (if any) placed at the end of the aisle in the middle.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentBus")
  @js.native
  def AlignmentBus: typings.go.mod.EnumValue = js.native
  
  /**Like TreeLayout.AlignmentBus with the children arranged on both sides of an "aisle" with any last odd child placed at the end of the aisle, but the children get an TreeVertex.angle that depends on which side of the aisle they were placed.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentBusBranching")
  @js.native
  def AlignmentBusBranching: typings.go.mod.EnumValue = js.native
  inline def AlignmentBusBranching_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentBusBranching")(x.asInstanceOf[js.Any])
  
  inline def AlignmentBus_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentBus")(x.asInstanceOf[js.Any])
  
  /**The parent is centered at the middle of the range of its immediate child nodes; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentCenterChildren")
  @js.native
  def AlignmentCenterChildren: typings.go.mod.EnumValue = js.native
  inline def AlignmentCenterChildren_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentCenterChildren")(x.asInstanceOf[js.Any])
  
  /**The parent is centered at the middle of the range of its child subtrees; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentCenterSubtrees")
  @js.native
  def AlignmentCenterSubtrees: typings.go.mod.EnumValue = js.native
  inline def AlignmentCenterSubtrees_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentCenterSubtrees")(x.asInstanceOf[js.Any])
  
  /**The parent is positioned near the last of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentEnd")
  @js.native
  def AlignmentEnd: typings.go.mod.EnumValue = js.native
  inline def AlignmentEnd_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentEnd")(x.asInstanceOf[js.Any])
  
  /**The parent is positioned near the first of its children; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentStart")
  @js.native
  def AlignmentStart: typings.go.mod.EnumValue = js.native
  inline def AlignmentStart_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentStart")(x.asInstanceOf[js.Any])
  
  /**The children are positioned in a bus, only on the top or left side of the parent; This value is used for TreeLayout.alignment or TreeLayout.alternateAlignment.*/
  /* static member */
  @JSGlobal("go.TreeLayout.AlignmentTopLeftBus")
  @js.native
  def AlignmentTopLeftBus: typings.go.mod.EnumValue = js.native
  inline def AlignmentTopLeftBus_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlignmentTopLeftBus")(x.asInstanceOf[js.Any])
  
  /**Do not move each root node, but position all of their descendants relative to their root; This value is used for TreeLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.TreeLayout.ArrangementFixedRoots")
  @js.native
  def ArrangementFixedRoots: typings.go.mod.EnumValue = js.native
  inline def ArrangementFixedRoots_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrangementFixedRoots")(x.asInstanceOf[js.Any])
  
  /**Position each tree in a non-overlapping fashion by increasing X coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.TreeLayout.ArrangementHorizontal")
  @js.native
  def ArrangementHorizontal: typings.go.mod.EnumValue = js.native
  inline def ArrangementHorizontal_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrangementHorizontal")(x.asInstanceOf[js.Any])
  
  /**Position each tree in a non-overlapping fashion by increasing Y coordinates, starting at the Layout.arrangementOrigin; This value is used for TreeLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.TreeLayout.ArrangementVertical")
  @js.native
  def ArrangementVertical: typings.go.mod.EnumValue = js.native
  inline def ArrangementVertical_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrangementVertical")(x.asInstanceOf[js.Any])
  
  /**A simple fitting of subtrees; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  /* static member */
  @JSGlobal("go.TreeLayout.CompactionBlock")
  @js.native
  def CompactionBlock: typings.go.mod.EnumValue = js.native
  inline def CompactionBlock_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompactionBlock")(x.asInstanceOf[js.Any])
  
  /**Only simple placement of children next to each other, as determined by their subtree breadth; This value is used for TreeLayout.compaction or TreeLayout.alternateCompaction.*/
  /* static member */
  @JSGlobal("go.TreeLayout.CompactionNone")
  @js.native
  def CompactionNone: typings.go.mod.EnumValue = js.native
  inline def CompactionNone_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompactionNone")(x.asInstanceOf[js.Any])
  
  /**This default value for TreeLayout.layerStyle causes each node takes up only the depth that it needs.*/
  /* static member */
  @JSGlobal("go.TreeLayout.LayerIndividual")
  @js.native
  def LayerIndividual: typings.go.mod.EnumValue = js.native
  inline def LayerIndividual_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerIndividual")(x.asInstanceOf[js.Any])
  
  /**This value for TreeLayout.layerStyle causes all of the children of a parent node take up the same amount of depth -- this typically causes all cousins to be aligned.*/
  /* static member */
  @JSGlobal("go.TreeLayout.LayerSiblings")
  @js.native
  def LayerSiblings: typings.go.mod.EnumValue = js.native
  inline def LayerSiblings_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerSiblings")(x.asInstanceOf[js.Any])
  
  /**This value for TreeLayout.layerStyle causes all nodes with the same TreeVertex.level throughout the tree take up the same amount of depth.*/
  /* static member */
  @JSGlobal("go.TreeLayout.LayerUniform")
  @js.native
  def LayerUniform: typings.go.mod.EnumValue = js.native
  inline def LayerUniform_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerUniform")(x.asInstanceOf[js.Any])
  
  /**This value for TreeLayout.path causes the value of Diagram.isTreePathToChildren to effectively choose either TreeLayout.PathDestination (if true) or TreeLayout.PathSource (if false).*/
  /* static member */
  @JSGlobal("go.TreeLayout.PathDefault")
  @js.native
  def PathDefault: typings.go.mod.EnumValue = js.native
  inline def PathDefault_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathDefault")(x.asInstanceOf[js.Any])
  
  /**The children of a TreeVertex are its LayoutVertex.destinationVertexes, the collection of connected LayoutEdge.toVertexes; This value is used for TreeLayout.path.*/
  /* static member */
  @JSGlobal("go.TreeLayout.PathDestination")
  @js.native
  def PathDestination: typings.go.mod.EnumValue = js.native
  inline def PathDestination_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathDestination")(x.asInstanceOf[js.Any])
  
  /**The children of a TreeVertex are its LayoutVertex.sourceVertexes, the collection of connected LayoutEdge.fromVertexes; This value is used for TreeLayout.path.*/
  /* static member */
  @JSGlobal("go.TreeLayout.PathSource")
  @js.native
  def PathSource: typings.go.mod.EnumValue = js.native
  inline def PathSource_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathSource")(x.asInstanceOf[js.Any])
  
  /**Lay out each child according to the sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  /* static member */
  @JSGlobal("go.TreeLayout.SortingAscending")
  @js.native
  def SortingAscending: typings.go.mod.EnumValue = js.native
  inline def SortingAscending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortingAscending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse sort order given by TreeVertex.comparer; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  /* static member */
  @JSGlobal("go.TreeLayout.SortingDescending")
  @js.native
  def SortingDescending: typings.go.mod.EnumValue = js.native
  inline def SortingDescending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortingDescending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in the order in which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  /* static member */
  @JSGlobal("go.TreeLayout.SortingForwards")
  @js.native
  def SortingForwards: typings.go.mod.EnumValue = js.native
  inline def SortingForwards_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortingForwards")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse order from which they were found; This value is used for TreeLayout.sorting or TreeLayout.alternateSorting.*/
  /* static member */
  @JSGlobal("go.TreeLayout.SortingReverse")
  @js.native
  def SortingReverse: typings.go.mod.EnumValue = js.native
  inline def SortingReverse_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortingReverse")(x.asInstanceOf[js.Any])
  
  /**Alternate layers of the tree have different properties, typically including the angle; This value is used for TreeLayout.treeStyle.*/
  /* static member */
  @JSGlobal("go.TreeLayout.StyleAlternating")
  @js.native
  def StyleAlternating: typings.go.mod.EnumValue = js.native
  inline def StyleAlternating_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleAlternating")(x.asInstanceOf[js.Any])
  
  /**Just like the standard layered tree style, except that the nodes with children but no grandchildren have alternate properties; This value is used for TreeLayout.treeStyle.*/
  /* static member */
  @JSGlobal("go.TreeLayout.StyleLastParents")
  @js.native
  def StyleLastParents: typings.go.mod.EnumValue = js.native
  inline def StyleLastParents_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleLastParents")(x.asInstanceOf[js.Any])
  
  /**The normal tree style, where all of the children of each TreeVertex are lined up horizontally or vertically; This value is used for TreeLayout.treeStyle.*/
  /* static member */
  @JSGlobal("go.TreeLayout.StyleLayered")
  @js.native
  def StyleLayered: typings.go.mod.EnumValue = js.native
  inline def StyleLayered_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleLayered")(x.asInstanceOf[js.Any])
  
  /**All of the nodes get the alternate properties, except the root node gets the default properties; This value is used for TreeLayout.treeStyle.*/
  /* static member */
  @JSGlobal("go.TreeLayout.StyleRootOnly")
  @js.native
  def StyleRootOnly: typings.go.mod.EnumValue = js.native
  inline def StyleRootOnly_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleRootOnly")(x.asInstanceOf[js.Any])
}
