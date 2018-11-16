package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This layout positions nodes in a circular arrangement.
     * This layout makes use of a LayoutNetwork of
     * CircularVertexes and CircularEdges that normally
     * correspond to the Nodes and Links of the Diagram.
     */
@JSImport("go", "CircularLayout")
@js.native
class CircularLayout ()
  extends goLib.goMod.goNs.CircularLayout

/**
     * This layout positions nodes in a circular arrangement.
     * This layout makes use of a LayoutNetwork of
     * CircularVertexes and CircularEdges that normally
     * correspond to the Nodes and Links of the Diagram.
     */
@JSImport("go", "CircularLayout")
@js.native
object CircularLayout extends js.Object {
  /**Nodes are sorted using the .comparer, in ascending order; This value is used for CircularLayout.sorting.*/
  var Ascending: goLib.goMod.goNs.EnumValue = js.native
  /**The ring is filled by alternating sides; the second node is counterclockwise from the first node; This value is used for CircularLayout.direction.*/
  var BidirectionalLeft: goLib.goMod.goNs.EnumValue = js.native
  /**The ring is filled by alternating sides; the second node is clockwise from the first node; This value is used for CircularLayout.direction.*/
  var BidirectionalRight: goLib.goMod.goNs.EnumValue = js.native
  /**The effective diameter is either the width or height of the node, whichever is larger; This will cause circular nodes to touch when CircularLayout.spacing is 0; This is ideal when the nodes are circular.*/
  var Circular: goLib.goMod.goNs.EnumValue = js.native
  /**Rings are filled clockwise; This value is used for CircularLayout.direction.*/
  var Clockwise: goLib.goMod.goNs.EnumValue = js.native
  /**The angular distance between the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantAngle: goLib.goMod.goNs.EnumValue = js.native
  /**The distance between the centers of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantDistance: goLib.goMod.goNs.EnumValue = js.native
  /**The spacing between the idealized boundaries of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantSpacing: goLib.goMod.goNs.EnumValue = js.native
  /**Rings are filled counterclockwise; This value is used for CircularLayout.direction.*/
  var Counterclockwise: goLib.goMod.goNs.EnumValue = js.native
  /**Nodes are sorted using the .comparer, in reverse ascending (descending) order; This value is used for CircularLayout.sorting.*/
  var Descending: goLib.goMod.goNs.EnumValue = js.native
  /**Nodes are arranged in the order given; This value is used for CircularLayout.sorting.*/
  var Forwards: goLib.goMod.goNs.EnumValue = js.native
  /**Nodes are ordered to reduce link crossings; This value is used for CircularLayout.sorting.*/
  var Optimized: goLib.goMod.goNs.EnumValue = js.native
  /**The vertices are arranged as close together as possible considering the CircularLayout.spacing, assuming the nodes are rectangular; This value is used for CircularLayout.arrangement.*/
  var Packed: goLib.goMod.goNs.EnumValue = js.native
  /**The effective diameter is sqrt(width^2+height^2); The corners of square nodes will touch at 45 degrees when CircularLayout.spacing is 0; This value is used for CircularLayout.nodeDiameterFormula.*/
  var Pythagorean: goLib.goMod.goNs.EnumValue = js.native
  /**Nodes are arranged in the reverse of the order given; This value is used for CircularLayout.sorting.*/
  var Reverse: goLib.goMod.goNs.EnumValue = js.native
}

