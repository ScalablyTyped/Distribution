package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This arranges nodes into layers.
  * The method uses a hierarchical approach
  * for creating drawings of digraphs with nodes arranged in layers.
  * The layout algorithm consists of four-major steps: Cycle Removal,
  * Layer Assignment, Crossing Reduction, and Straightening and Packing.
  */
@JSImport("go", "LayeredDigraphLayout")
@js.native
/**
  * Constructs a LayeredDigraphLayout with no Layout.network and with no owning Layout.diagram.
  */
class LayeredDigraphLayout () extends Layout {
  
  /**Gets or sets which aggressive option is being used to look for link crossings.*/
  var aggressiveOption: EnumValue = js.native
  
  /**
    * Assigns every vertex in the input network to a layer.
    */
  def assignLayers(): Unit = js.native
  
  /**Gets or sets the size of each column.*/
  var columnSpacing: Double = js.native
  
  /**
    * This overridable method is called by commitLayout
    * to support custom arrangement of bands or labels across each layout layer.
    * @param Array<*> layerRects an Array of Rects with the bounds of each of the "layers"
    * @param {Point} offset the position of the top-left corner of the banded area relative to the coordinates given by the layerRects
    */
  def commitLayers(layerRects: js.Array[Rect], offset: Point): Unit = js.native
  
  /**
    * Routes the links.
    */
  def commitLinks(): Unit = js.native
  
  /**
    * Lays out the nodes.
    */
  def commitNodes(): Unit = js.native
  
  /**Gets or set which cycle removal option is used.*/
  var cycleRemoveOption: EnumValue = js.native
  
  /**Gets or sets the direction the graph grows towards.*/
  var direction: Double = js.native
  
  /**Gets or sets which indices initialization option is being used.*/
  var initializeOption: EnumValue = js.native
  
  /**Gets or sets the number of iterations to be done.*/
  var iterations: Double = js.native
  
  /**Gets or sets the size of each layer.*/
  var layerSpacing: Double = js.native
  
  /**Gets or sets which layering option is being used.*/
  var layeringOption: EnumValue = js.native
  
  var linkSpacing: Double = js.native
  
  /**This read-only property returns the largest column value.*/
  var maxColumn: Double = js.native
  
  /**This read-only property returns the largest index value.*/
  var maxIndex: Double = js.native
  
  /**This read-only property returns the larges index layer.*/
  var maxIndexLayer: Double = js.native
  
  /**This read-only property returns the largest layer value.*/
  var maxLayer: Double = js.native
  
  /**This read-only property returns the smallest index layer.*/
  var minIndexLayer: Double = js.native
  
  // undocumented
  /* protected */ def nodeMinColumnSpace(v: LayeredDigraphVertex, tl: Boolean): Double = js.native
  
  // undocumented
  /* protected */ def nodeMinLayerSpace(v: LayeredDigraphVertex, tl: Boolean): Double = js.native
  
  /**Gets or sets the options used by the straighten and pack function, The default value is LayeredDigraphLayout.PackAll.*/
  var packOption: Double = js.native
  
  /**Gets or sets whether the FromSpot and ToSpot of each link should be set to values appropriate for the given value of LayeredDigraphLayout.direction.*/
  var setsPortSpots: Boolean = js.native
}
object LayeredDigraphLayout {
  
  @JSImport("go", "LayeredDigraphLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**The faster, less aggressive, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.AggressiveLess")
  @js.native
  def AggressiveLess: EnumValue = js.native
  @scala.inline
  def AggressiveLess_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveLess")(x.asInstanceOf[js.Any])
  
  /**The slower, more aggressive, crossing reduction algorithm, a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.AggressiveMore")
  @js.native
  def AggressiveMore: EnumValue = js.native
  @scala.inline
  def AggressiveMore_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveMore")(x.asInstanceOf[js.Any])
  
  /**The fastest, but poorest, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.AggressiveNone")
  @js.native
  def AggressiveNone: EnumValue = js.native
  @scala.inline
  def AggressiveNone_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveNone")(x.asInstanceOf[js.Any])
  
  /**Remove cycles using depth first cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.CycleDepthFirst")
  @js.native
  def CycleDepthFirst: EnumValue = js.native
  @scala.inline
  def CycleDepthFirst_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleDepthFirst")(x.asInstanceOf[js.Any])
  
  /**Remove cycles using greedy cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.CycleGreedy")
  @js.native
  def CycleGreedy: EnumValue = js.native
  @scala.inline
  def CycleGreedy_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleGreedy")(x.asInstanceOf[js.Any])
  
  /**Initialize using depth first in initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.InitDepthFirstIn")
  @js.native
  def InitDepthFirstIn: EnumValue = js.native
  @scala.inline
  def InitDepthFirstIn_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitDepthFirstIn")(x.asInstanceOf[js.Any])
  
  /**Initialize using depth first out initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.InitDepthFirstOut")
  @js.native
  def InitDepthFirstOut: EnumValue = js.native
  @scala.inline
  def InitDepthFirstOut_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitDepthFirstOut")(x.asInstanceOf[js.Any])
  
  /**Initialize using naive initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.InitNaive")
  @js.native
  def InitNaive: EnumValue = js.native
  @scala.inline
  def InitNaive_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitNaive")(x.asInstanceOf[js.Any])
  
  /**Assign layers using longest path sink layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.LayerLongestPathSink")
  @js.native
  def LayerLongestPathSink: EnumValue = js.native
  @scala.inline
  def LayerLongestPathSink_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerLongestPathSink")(x.asInstanceOf[js.Any])
  
  /**Assign layers using longest path source layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.LayerLongestPathSource")
  @js.native
  def LayerLongestPathSource: EnumValue = js.native
  @scala.inline
  def LayerLongestPathSource_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerLongestPathSource")(x.asInstanceOf[js.Any])
  
  /**Assign layers using optimal link length layering; A valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.LayerOptimalLinkLength")
  @js.native
  def LayerOptimalLinkLength: EnumValue = js.native
  @scala.inline
  def LayerOptimalLinkLength_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerOptimalLinkLength")(x.asInstanceOf[js.Any])
  
  /**Enable all options for the LayeredDigraphLayout.packOption property; See also LayeredDigraphLayout.PackExpand, LayeredDigraphLayout.PackStraighten, and LayeredDigraphLayout.PackMedian.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.PackAll")
  @js.native
  def PackAll: Double = js.native
  @scala.inline
  def PackAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackAll")(x.asInstanceOf[js.Any])
  
  /**This option gives more chances for the packing algorithm to improve the network, but is very expensive in time for large networks; a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.PackExpand")
  @js.native
  def PackExpand: Double = js.native
  @scala.inline
  def PackExpand_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackExpand")(x.asInstanceOf[js.Any])
  
  /**This option tries to have the packing algorithm center groups of nodes based on their relationships with nodes in other layers, a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.PackMedian")
  @js.native
  def PackMedian: Double = js.native
  @scala.inline
  def PackMedian_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackMedian")(x.asInstanceOf[js.Any])
  
  /**Does minimal work in packing the nodes; a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.PackNone")
  @js.native
  def PackNone: Double = js.native
  @scala.inline
  def PackNone_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackNone")(x.asInstanceOf[js.Any])
  
  /**This option tries to have the packing algorithm straighten many of the links that cross layers, a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSImport("go", "LayeredDigraphLayout.PackStraighten")
  @js.native
  def PackStraighten: Double = js.native
  @scala.inline
  def PackStraighten_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackStraighten")(x.asInstanceOf[js.Any])
}
