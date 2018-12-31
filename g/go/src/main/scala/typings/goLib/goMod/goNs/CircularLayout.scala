package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This layout positions nodes in a circular arrangement.
  * This layout makes use of a LayoutNetwork of
  * CircularVertexes and CircularEdges that normally
  * correspond to the Nodes and Links of the Diagram.
  */
@js.native
trait CircularLayout extends Layout {
  /**Returns the coordinates of the center of the laid-out ellipse.*/
  var actualCenter: Point = js.native
  /**This read-only property returns the effective spacing that may have been calculated by the layout.*/
  var actualSpacing: scala.Double = js.native
  /**This read-only property returns the effective X radius that may have been calculated by the layout.*/
  var actualXRadius: scala.Double = js.native
  /**This read-only property returns the effective Y radius that may have been calculated by the layout.*/
  var actualYRadius: scala.Double = js.native
  /**Gets or sets how the nodes are spaced.*/
  var arrangement: EnumValue = js.native
  /**Gets or sets the ratio of the arrangement's height to its width (1 for a circle, >1 for a vertically elongated ellipse).*/
  var aspectRatio: scala.Double = js.native
  /**Gets or sets whether the nodes are arranged clockwise or counterclockwise.*/
  var direction: EnumValue = js.native
  /**Specifies how the diameter of nodes will be calculated.*/
  var nodeDiameterFormula: EnumValue = js.native
  /**Gets or sets the horizontal radius of the elliptical arrangement.*/
  var radius: scala.Double = js.native
  /**Gets or sets if and how the nodes are sorted.*/
  var sorting: EnumValue = js.native
  /**Gets or sets the distance between nodes (if .radius is NaN) or the minimum distance between nodes (if .radius is a number).*/
  var spacing: scala.Double = js.native
  /**Gets or sets the angle (in degrees, clockwise from the positive side of the X axis) of the first element.*/
  var startAngle: scala.Double = js.native
  /**Gets or sets the absolute angle (in degrees) between the first and last node.*/
  var sweepAngle: scala.Double = js.native
  /**
    * Commit the position and routing of all edge links.
    */
  def commitLinks(): scala.Unit = js.native
  /**
    * Commit the position of all vertex nodes.
    */
  def commitNodes(): scala.Unit = js.native
  /**Gets or sets the comparer which sorts the data when .sorting is set to CircularLayout.Ascending or CircularLayout.Descending.*/
  def comparer(a: CircularVertex, b: CircularVertex): scala.Double = js.native
}

