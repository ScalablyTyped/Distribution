package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This layout positions nodes in a circular arrangement.
  * This layout makes use of a LayoutNetwork of
  * CircularVertexes and CircularEdges that normally
  * correspond to the Nodes and Links of the Diagram.
  */
@JSImport("go", "CircularLayout")
@js.native
/**
  * Constructs a CircularLayout with no Layout.network and with no owning Layout.diagram.
  */
class CircularLayout () extends Layout {
  
  /**Returns the coordinates of the center of the laid-out ellipse.*/
  var actualCenter: Point = js.native
  
  /**This read-only property returns the effective spacing that may have been calculated by the layout.*/
  var actualSpacing: Double = js.native
  
  /**This read-only property returns the effective X radius that may have been calculated by the layout.*/
  var actualXRadius: Double = js.native
  
  /**This read-only property returns the effective Y radius that may have been calculated by the layout.*/
  var actualYRadius: Double = js.native
  
  /**Gets or sets how the nodes are spaced.*/
  var arrangement: EnumValue = js.native
  
  /**Gets or sets the ratio of the arrangement's height to its width (1 for a circle, >1 for a vertically elongated ellipse).*/
  var aspectRatio: Double = js.native
  
  /**
    * Commit the position and routing of all edge links.
    */
  def commitLinks(): Unit = js.native
  
  /**
    * Commit the position of all vertex nodes.
    */
  def commitNodes(): Unit = js.native
  
  /**Gets or sets the comparer which sorts the data when .sorting is set to CircularLayout.Ascending or CircularLayout.Descending.*/
  def comparer(a: CircularVertex, b: CircularVertex): Double = js.native
  
  /**Gets or sets whether the nodes are arranged clockwise or counterclockwise.*/
  var direction: EnumValue = js.native
  
  /**Specifies how the diameter of nodes will be calculated.*/
  var nodeDiameterFormula: EnumValue = js.native
  
  /**Gets or sets the horizontal radius of the elliptical arrangement.*/
  var radius: Double = js.native
  
  /**Gets or sets if and how the nodes are sorted.*/
  var sorting: EnumValue = js.native
  
  /**Gets or sets the distance between nodes (if .radius is NaN) or the minimum distance between nodes (if .radius is a number).*/
  var spacing: Double = js.native
  
  /**Gets or sets the angle (in degrees, clockwise from the positive side of the X axis) of the first element.*/
  var startAngle: Double = js.native
  
  /**Gets or sets the absolute angle (in degrees) between the first and last node.*/
  var sweepAngle: Double = js.native
}
object CircularLayout {
  
  @JSImport("go", "CircularLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**Nodes are sorted using the .comparer, in ascending order; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSImport("go", "CircularLayout.Ascending")
  @js.native
  def Ascending: EnumValue = js.native
  inline def Ascending_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /**The ring is filled by alternating sides; the second node is counterclockwise from the first node; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSImport("go", "CircularLayout.BidirectionalLeft")
  @js.native
  def BidirectionalLeft: EnumValue = js.native
  inline def BidirectionalLeft_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BidirectionalLeft")(x.asInstanceOf[js.Any])
  
  /**The ring is filled by alternating sides; the second node is clockwise from the first node; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSImport("go", "CircularLayout.BidirectionalRight")
  @js.native
  def BidirectionalRight: EnumValue = js.native
  inline def BidirectionalRight_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BidirectionalRight")(x.asInstanceOf[js.Any])
  
  /**The effective diameter is either the width or height of the node, whichever is larger; This will cause circular nodes to touch when CircularLayout.spacing is 0; This is ideal when the nodes are circular.*/
  /* static member */
  @JSImport("go", "CircularLayout.Circular")
  @js.native
  def Circular: EnumValue = js.native
  inline def Circular_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circular")(x.asInstanceOf[js.Any])
  
  /**Rings are filled clockwise; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSImport("go", "CircularLayout.Clockwise")
  @js.native
  def Clockwise: EnumValue = js.native
  inline def Clockwise_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clockwise")(x.asInstanceOf[js.Any])
  
  /**The angular distance between the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSImport("go", "CircularLayout.ConstantAngle")
  @js.native
  def ConstantAngle: EnumValue = js.native
  inline def ConstantAngle_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantAngle")(x.asInstanceOf[js.Any])
  
  /**The distance between the centers of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSImport("go", "CircularLayout.ConstantDistance")
  @js.native
  def ConstantDistance: EnumValue = js.native
  inline def ConstantDistance_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantDistance")(x.asInstanceOf[js.Any])
  
  /**The spacing between the idealized boundaries of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSImport("go", "CircularLayout.ConstantSpacing")
  @js.native
  def ConstantSpacing: EnumValue = js.native
  inline def ConstantSpacing_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConstantSpacing")(x.asInstanceOf[js.Any])
  
  /**Rings are filled counterclockwise; This value is used for CircularLayout.direction.*/
  /* static member */
  @JSImport("go", "CircularLayout.Counterclockwise")
  @js.native
  def Counterclockwise: EnumValue = js.native
  inline def Counterclockwise_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Counterclockwise")(x.asInstanceOf[js.Any])
  
  /**Nodes are sorted using the .comparer, in reverse ascending (descending) order; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSImport("go", "CircularLayout.Descending")
  @js.native
  def Descending: EnumValue = js.native
  inline def Descending_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
  
  /**Nodes are arranged in the order given; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSImport("go", "CircularLayout.Forwards")
  @js.native
  def Forwards: EnumValue = js.native
  inline def Forwards_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Forwards")(x.asInstanceOf[js.Any])
  
  /**Nodes are ordered to reduce link crossings; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSImport("go", "CircularLayout.Optimized")
  @js.native
  def Optimized: EnumValue = js.native
  inline def Optimized_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optimized")(x.asInstanceOf[js.Any])
  
  /**The vertices are arranged as close together as possible considering the CircularLayout.spacing, assuming the nodes are rectangular; This value is used for CircularLayout.arrangement.*/
  /* static member */
  @JSImport("go", "CircularLayout.Packed")
  @js.native
  def Packed: EnumValue = js.native
  inline def Packed_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Packed")(x.asInstanceOf[js.Any])
  
  /**The effective diameter is sqrt(width^2+height^2); The corners of square nodes will touch at 45 degrees when CircularLayout.spacing is 0; This value is used for CircularLayout.nodeDiameterFormula.*/
  /* static member */
  @JSImport("go", "CircularLayout.Pythagorean")
  @js.native
  def Pythagorean: EnumValue = js.native
  inline def Pythagorean_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pythagorean")(x.asInstanceOf[js.Any])
  
  /**Nodes are arranged in the reverse of the order given; This value is used for CircularLayout.sorting.*/
  /* static member */
  @JSImport("go", "CircularLayout.Reverse")
  @js.native
  def Reverse: EnumValue = js.native
  inline def Reverse_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(x.asInstanceOf[js.Any])
}
