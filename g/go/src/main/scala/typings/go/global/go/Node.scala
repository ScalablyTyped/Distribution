package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Node is a Part that may connect to other nodes with Links,
  * or that may be a member of a Group.
  * Group inherits from Node,
  * enabling nodes to logically contain other nodes and links.
  */
@JSGlobal("go.Node")
@js.native
/**
  * Constructs an empty Node.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Node ()
  extends typings.go.mod.Node {
  def this(`type`: typings.go.mod.EnumValue) = this()
}
object Node {
  
  @JSGlobal("go.Node")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle stays the same even if the node is rotated.*/
  /* static member */
  @JSGlobal("go.Node.DirectionAbsolute")
  @js.native
  def DirectionAbsolute: typings.go.mod.EnumValue = js.native
  inline def DirectionAbsolute_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectionAbsolute")(x.asInstanceOf[js.Any])
  
  /**This value for Link.fromEndSegmentDirection and Link.toEndSegmentDirection indicates that the real value is inherited from the corresponding connected port.*/
  /* static member */
  @JSGlobal("go.Node.DirectionDefault")
  @js.native
  def DirectionDefault: typings.go.mod.EnumValue = js.native
  inline def DirectionDefault_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectionDefault")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle.*/
  /* static member */
  @JSGlobal("go.Node.DirectionRotatedNode")
  @js.native
  def DirectionRotatedNode: typings.go.mod.EnumValue = js.native
  
  /**This value for GraphObject.fromEndSegmentDirection and GraphObject.toEndSegmentDirection indicates that the link's end segment angle is rotated to match the node's angle, but only in increments of 90 degrees.*/
  /* static member */
  @JSGlobal("go.Node.DirectionRotatedNodeOrthogonal")
  @js.native
  def DirectionRotatedNodeOrthogonal: typings.go.mod.EnumValue = js.native
  inline def DirectionRotatedNodeOrthogonal_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectionRotatedNodeOrthogonal")(x.asInstanceOf[js.Any])
  
  inline def DirectionRotatedNode_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectionRotatedNode")(x.asInstanceOf[js.Any])
  
  /**This value for Node.portSpreading indicates that links connecting with a port should be distributed evenly along the side(s) indicated by a Spot that is a "side" Spot.*/
  /* static member */
  @JSGlobal("go.Node.SpreadingEvenly")
  @js.native
  def SpreadingEvenly: typings.go.mod.EnumValue = js.native
  inline def SpreadingEvenly_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadingEvenly")(x.asInstanceOf[js.Any])
  
  /**This value for Node.portSpreading indicates that links connecting with a port should connect at a single point on the side(s) indicated by a Spot that is a "side" Spot.*/
  /* static member */
  @JSGlobal("go.Node.SpreadingNone")
  @js.native
  def SpreadingNone: typings.go.mod.EnumValue = js.native
  inline def SpreadingNone_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadingNone")(x.asInstanceOf[js.Any])
  
  /**This value for Node.portSpreading indicates that links connecting with a port should be packed together based on the link's shape's width on the side(s) indicated by a Spot that is a "side" Spot.*/
  /* static member */
  @JSGlobal("go.Node.SpreadingPacked")
  @js.native
  def SpreadingPacked: typings.go.mod.EnumValue = js.native
  inline def SpreadingPacked_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadingPacked")(x.asInstanceOf[js.Any])
}
