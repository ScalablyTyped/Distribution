package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This layout positions nodes in a circular arrangement.
  * This layout makes use of a LayoutNetwork of
  * CircularVertexes and CircularEdges that normally
  * correspond to the Nodes and Links of the Diagram.
  */
@JSGlobal("go.CircularLayout")
@js.native
/**
  * Constructs a CircularLayout with no Layout.network and with no owning Layout.diagram.
  */
open class CircularLayout ()
  extends typings.go.mod.CircularLayout
object CircularLayout {
  
  @JSGlobal("go.CircularLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**Nodes are sorted using the .comparer, in ascending order; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Ascending")
  @js.native
  def Ascending: typings.go.mod.EnumValue = js.native
  inline def Ascending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /**The ring is filled by alternating sides; the second node is counterclockwise from the first node; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSGlobal("go.CircularLayout.BidirectionalLeft")
  @js.native
  def BidirectionalLeft: typings.go.mod.EnumValue = js.native
  inline def BidirectionalLeft_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BidirectionalLeft")(x.asInstanceOf[js.Any])
  
  /**The ring is filled by alternating sides; the second node is clockwise from the first node; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSGlobal("go.CircularLayout.BidirectionalRight")
  @js.native
  def BidirectionalRight: typings.go.mod.EnumValue = js.native
  inline def BidirectionalRight_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BidirectionalRight")(x.asInstanceOf[js.Any])
  
  /**The effective diameter is either the width or height of the node, whichever is larger; This will cause circular nodes to touch when CircularLayout.spacing is 0; This is ideal when the nodes are circular.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Circular")
  @js.native
  def Circular: typings.go.mod.EnumValue = js.native
  inline def Circular_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circular")(x.asInstanceOf[js.Any])
  
  /**Rings are filled clockwise; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Clockwise")
  @js.native
  def Clockwise: typings.go.mod.EnumValue = js.native
  inline def Clockwise_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clockwise")(x.asInstanceOf[js.Any])
  
  /**The angular distance between the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.CircularLayout.ConstantAngle")
  @js.native
  def ConstantAngle: typings.go.mod.EnumValue = js.native
  inline def ConstantAngle_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantAngle")(x.asInstanceOf[js.Any])
  
  /**The distance between the centers of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.CircularLayout.ConstantDistance")
  @js.native
  def ConstantDistance: typings.go.mod.EnumValue = js.native
  inline def ConstantDistance_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantDistance")(x.asInstanceOf[js.Any])
  
  /**The spacing between the idealized boundaries of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.CircularLayout.ConstantSpacing")
  @js.native
  def ConstantSpacing: typings.go.mod.EnumValue = js.native
  inline def ConstantSpacing_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantSpacing")(x.asInstanceOf[js.Any])
  
  /**Rings are filled counterclockwise; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Counterclockwise")
  @js.native
  def Counterclockwise: typings.go.mod.EnumValue = js.native
  inline def Counterclockwise_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Counterclockwise")(x.asInstanceOf[js.Any])
  
  /**Nodes are sorted using the .comparer, in reverse ascending (descending) order; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Descending")
  @js.native
  def Descending: typings.go.mod.EnumValue = js.native
  inline def Descending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
  
  /**Nodes are arranged in the order given; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Forwards")
  @js.native
  def Forwards: typings.go.mod.EnumValue = js.native
  inline def Forwards_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Forwards")(x.asInstanceOf[js.Any])
  
  /**Nodes are ordered to reduce link crossings; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Optimized")
  @js.native
  def Optimized: typings.go.mod.EnumValue = js.native
  inline def Optimized_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optimized")(x.asInstanceOf[js.Any])
  
  /**The vertices are arranged as close together as possible considering the CircularLayout.spacing, assuming the nodes are rectangular; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Packed")
  @js.native
  def Packed: typings.go.mod.EnumValue = js.native
  inline def Packed_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Packed")(x.asInstanceOf[js.Any])
  
  /**The effective diameter is sqrt(width^2+height^2); The corners of square nodes will touch at 45 degrees when CircularLayout.spacing is 0; This value is used for CircularLayout.nodeDiameterFormula.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Pythagorean")
  @js.native
  def Pythagorean: typings.go.mod.EnumValue = js.native
  inline def Pythagorean_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pythagorean")(x.asInstanceOf[js.Any])
  
  /**Nodes are arranged in the reverse of the order given; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSGlobal("go.CircularLayout.Reverse")
  @js.native
  def Reverse: typings.go.mod.EnumValue = js.native
  inline def Reverse_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(x.asInstanceOf[js.Any])
}
