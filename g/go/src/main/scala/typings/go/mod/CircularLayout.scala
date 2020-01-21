package typings.go.mod

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
}

/* static members */
@JSImport("go", "CircularLayout")
@js.native
object CircularLayout extends js.Object {
  /**Nodes are sorted using the .comparer, in ascending order; This value is used for CircularLayout.sorting.*/
  var Ascending: EnumValue = js.native
  /**The ring is filled by alternating sides; the second node is counterclockwise from the first node; This value is used for CircularLayout.direction.*/
  var BidirectionalLeft: EnumValue = js.native
  /**The ring is filled by alternating sides; the second node is clockwise from the first node; This value is used for CircularLayout.direction.*/
  var BidirectionalRight: EnumValue = js.native
  /**The effective diameter is either the width or height of the node, whichever is larger; This will cause circular nodes to touch when CircularLayout.spacing is 0; This is ideal when the nodes are circular.*/
  var Circular: EnumValue = js.native
  /**Rings are filled clockwise; This value is used for CircularLayout.direction.*/
  var Clockwise: EnumValue = js.native
  /**The angular distance between the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantAngle: EnumValue = js.native
  /**The distance between the centers of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantDistance: EnumValue = js.native
  /**The spacing between the idealized boundaries of the nodes is constant; This value is used for CircularLayout.arrangement.*/
  var ConstantSpacing: EnumValue = js.native
  /**Rings are filled counterclockwise; This value is used for CircularLayout.direction.*/
  var Counterclockwise: EnumValue = js.native
  /**Nodes are sorted using the .comparer, in reverse ascending (descending) order; This value is used for CircularLayout.sorting.*/
  var Descending: EnumValue = js.native
  /**Nodes are arranged in the order given; This value is used for CircularLayout.sorting.*/
  var Forwards: EnumValue = js.native
  /**Nodes are ordered to reduce link crossings; This value is used for CircularLayout.sorting.*/
  var Optimized: EnumValue = js.native
  /**The vertices are arranged as close together as possible considering the CircularLayout.spacing, assuming the nodes are rectangular; This value is used for CircularLayout.arrangement.*/
  var Packed: EnumValue = js.native
  /**The effective diameter is sqrt(width^2+height^2); The corners of square nodes will touch at 45 degrees when CircularLayout.spacing is 0; This value is used for CircularLayout.nodeDiameterFormula.*/
  var Pythagorean: EnumValue = js.native
  /**Nodes are arranged in the reverse of the order given; This value is used for CircularLayout.sorting.*/
  var Reverse: EnumValue = js.native
}

