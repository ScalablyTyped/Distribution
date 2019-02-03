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
class LayeredDigraphLayout ()
  extends goLib.goMod.goNs.LayeredDigraphLayout

/* static members */
@JSImport("go", "LayeredDigraphLayout")
@js.native
object LayeredDigraphLayout extends js.Object {
  /**The faster, less aggressive, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveLess: goLib.goMod.goNs.EnumValue = js.native
  /**The slower, more aggressive, crossing reduction algorithm, a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveMore: goLib.goMod.goNs.EnumValue = js.native
  /**The fastest, but poorest, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  var AggressiveNone: goLib.goMod.goNs.EnumValue = js.native
  /**Remove cycles using depth first cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  var CycleDepthFirst: goLib.goMod.goNs.EnumValue = js.native
  /**Remove cycles using greedy cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  var CycleGreedy: goLib.goMod.goNs.EnumValue = js.native
  /**Initialize using depth first in initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitDepthFirstIn: goLib.goMod.goNs.EnumValue = js.native
  /**Initialize using depth first out initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitDepthFirstOut: goLib.goMod.goNs.EnumValue = js.native
  /**Initialize using naive initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  var InitNaive: goLib.goMod.goNs.EnumValue = js.native
  /**Assign layers using longest path sink layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerLongestPathSink: goLib.goMod.goNs.EnumValue = js.native
  /**Assign layers using longest path source layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerLongestPathSource: goLib.goMod.goNs.EnumValue = js.native
  /**Assign layers using optimal link length layering; A valid value for LayeredDigraphLayout.layeringOption.*/
  var LayerOptimalLinkLength: goLib.goMod.goNs.EnumValue = js.native
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

