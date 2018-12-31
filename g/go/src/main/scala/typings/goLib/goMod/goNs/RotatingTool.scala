package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RotatingTool is used to interactively change the GraphObject.angle of a GraphObject.
  * This tool allows the user to rotate the Part.rotateObject of the selected Part.
  * Normally this works with Parts or Nodes; it does not make sense for Links.
  * The Part must be Part.rotatable, which is false by default.
  */
@js.native
trait RotatingTool extends Tool {
  /**This read-only property returns the GraphObject that is being rotated.*/
  var adornedObject: GraphObject = js.native
  /**Gets or sets a small GraphObject that is copied as a rotation handle for the selected part.*/
  var handle: GraphObject = js.native
  /**Gets or sets a small GraphObject that is copied as a rotation handle for the selected part.*/
  var handleArchetype: GraphObject = js.native
  /**This read-only property returns the angle that was the original value of the GraphObject.angle of the GraphObject that is being rotated.*/
  var originalAngle: scala.Double = js.native
  /**Gets or sets the the closeness to a desired angle at which the angle is "snapped to".*/
  var snapAngleEpsilon: scala.Double = js.native
  /**Gets or sets the preferred angles for the selected object.*/
  var snapAngleMultiple: scala.Double = js.native
  /**
    * Compute the new angle given a point.
    * @param{Point} newPoint
    */
  def computeRotate(newPoint: Point): scala.Double = js.native
  /**
    * Change the angle of the selected part's Part.rotateObject.
    * @param {number} newangle
    */
  def rotate(newangle: scala.Double): scala.Unit = js.native
}

