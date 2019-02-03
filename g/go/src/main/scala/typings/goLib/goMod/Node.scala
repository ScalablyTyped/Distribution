package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Node is a Part that may connect to other nodes with Links,
  * or that may be a member of a Group.
  * Group inherits from Node,
  * enabling nodes to logically contain other nodes and links.
  */
@JSImport("go", "Node")
@js.native
/**
  * Constructs an empty Node.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Node ()
  extends goLib.goMod.goNs.Node {
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

/* static members */
@JSImport("go", "Node")
@js.native
object Node extends js.Object {
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle stays the same even if the node is rotated.*/
  var DirectionAbsolute: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Link.fromEndSegmentDirection and Link.toEndSegmentDirection indicates that the real value is inherited from the corresponding connected port.*/
  var DirectionDefault: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle.*/
  var DirectionRotatedNode: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle, but only in increments of 90 degrees.*/
  var DirectionRotatedNodeOrthogonal: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Node.portSpreading indicates that links connecting with a port should be distributed evenly along the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingEvenly: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Node.portSpreading indicates that links connecting with a port should connect at a single point on the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingNone: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Node.portSpreading indicates that links connecting with a port should be packed together based on the link's shape's width on the side(s) indicated by a Spot that is a "side" Spot.*/
  var SpreadingPacked: goLib.goMod.goNs.EnumValue = js.native
}

