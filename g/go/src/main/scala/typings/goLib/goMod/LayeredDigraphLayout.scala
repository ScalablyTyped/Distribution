package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**Gets or sets the size of each column.*/
  var columnSpacing: scala.Double = js.native
  /**Gets or set which cycle removal option is used.*/
  var cycleRemoveOption: EnumValue = js.native
  /**Gets or sets the direction the graph grows towards.*/
  var direction: scala.Double = js.native
  /**Gets or sets which indices initialization option is being used.*/
  var initializeOption: EnumValue = js.native
  /**Gets or sets the number of iterations to be done.*/
  var iterations: scala.Double = js.native
  /**Gets or sets the size of each layer.*/
  var layerSpacing: scala.Double = js.native
  /**Gets or sets which layering option is being used.*/
  var layeringOption: EnumValue = js.native
  var linkSpacing: scala.Double = js.native
  /**This read-only property returns the largest column value.*/
  var maxColumn: scala.Double = js.native
  /**This read-only property returns the largest index value.*/
  var maxIndex: scala.Double = js.native
  /**This read-only property returns the larges index layer.*/
  var maxIndexLayer: scala.Double = js.native
  /**This read-only property returns the largest layer value.*/
  var maxLayer: scala.Double = js.native
  /**This read-only property returns the smallest index layer.*/
  var minIndexLayer: scala.Double = js.native
  /**Gets or sets the options used by the straighten and pack function, The default value is LayeredDigraphLayout.PackAll.*/
  var packOption: scala.Double = js.native
  /**Gets or sets whether the FromSpot and ToSpot of each link should be set to values appropriate for the given value of LayeredDigraphLayout.direction.*/
  var setsPortSpots: scala.Boolean = js.native
  /**
    * Assigns every vertex in the input network to a layer.
    */
  def assignLayers(): scala.Unit = js.native
  /**
    * This overridable method is called by commitLayout
    * to support custom arrangement of bands or labels across each layout layer.
    * @param Array<*> layerRects an Array of Rects with the bounds of each of the "layers"
    * @param {Point} offset the position of the top-left corner of the banded area relative to the coordinates given by the layerRects
    */
  def commitLayers(layerRects: js.Array[Rect], offset: Point): scala.Unit = js.native
  /**
    * Routes the links.
    */
  def commitLinks(): scala.Unit = js.native
  /**
    * Lays out the nodes.
    */
  def commitNodes(): scala.Unit = js.native
    // undocumented
  /* protected */ def nodeMinColumnSpace(v: LayeredDigraphVertex, tl: scala.Boolean): scala.Double = js.native
    // undocumented
  /* protected */ def nodeMinLayerSpace(v: LayeredDigraphVertex, tl: scala.Boolean): scala.Double = js.native
}

/* static members */
@JSImport("go", "LayeredDigraphLayout")
@js.native
object LayeredDigraphLayout extends js.Object {
  /**The faster, less aggressive, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveLess: goLib.goMod.EnumValue = js.native
  /**The slower, more aggressive, crossing reduction algorithm, a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveMore: goLib.goMod.EnumValue = js.native
  /**The fastest, but poorest, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveNone: goLib.goMod.EnumValue = js.native
  /**Remove cycles using depth first cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  var CycleDepthFirst: goLib.goMod.EnumValue = js.native
  /**Remove cycles using greedy cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  var CycleGreedy: goLib.goMod.EnumValue = js.native
  /**Initialize using depth first in initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitDepthFirstIn: goLib.goMod.EnumValue = js.native
  /**Initialize using depth first out initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitDepthFirstOut: goLib.goMod.EnumValue = js.native
  /**Initialize using naive initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitNaive: goLib.goMod.EnumValue = js.native
  /**Assign layers using longest path sink layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerLongestPathSink: goLib.goMod.EnumValue = js.native
  /**Assign layers using longest path source layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerLongestPathSource: goLib.goMod.EnumValue = js.native
  /**Assign layers using optimal link length layering; A valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerOptimalLinkLength: goLib.goMod.EnumValue = js.native
  /**Enable all options for the LayeredDigraphLayout.packOption property; See also LayeredDigraphLayout.PackExpand, LayeredDigraphLayout.PackStraighten, and LayeredDigraphLayout.PackMedian.*/
  var PackAll: scala.Double = js.native
  /**This option gives more chances for the packing algorithm to improve the network, but is very expensive in time for large networks; a valid value for LayeredDigraphLayout.packOption.*/
  var PackExpand: scala.Double = js.native
  /**This option tries to have the packing algorithm center groups of nodes based on their relationships with nodes in other layers, a valid value for LayeredDigraphLayout.packOption.*/
  var PackMedian: scala.Double = js.native
  /**Does minimal work in packing the nodes; a valid value for LayeredDigraphLayout.packOption.*/
  var PackNone: scala.Double = js.native
  /**This option tries to have the packing algorithm straighten many of the links that cross layers, a valid value for LayeredDigraphLayout.packOption.*/
  var PackStraighten: scala.Double = js.native
}

