package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RotatingTool is used to interactively change the GraphObject.angle of a GraphObject.
  * This tool allows the user to rotate the Part.rotateObject of the selected Part.
  * Normally this works with Parts or Nodes; it does not make sense for Links.
  * The Part must be Part.rotatable, which is false by default.
  */
@JSImport("go", "RotatingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.rotatingTool, which you can modify.
  */
open class RotatingTool () extends Tool {
  
  /**This read-only property returns the GraphObject that is being rotated.*/
  var adornedObject: GraphObject = js.native
  
  /**
    * Compute the new angle given a point.
    * @param{Point} newPoint
    */
  def computeRotate(newPoint: Point): Double = js.native
  
  /**Gets or sets a small GraphObject that is copied as a rotation handle for the selected part.*/
  var handle: GraphObject = js.native
  
  /**Gets or sets a small GraphObject that is copied as a rotation handle for the selected part.*/
  var handleArchetype: GraphObject = js.native
  
  /**This read-only property returns the angle that was the original value of the GraphObject.angle of the GraphObject that is being rotated.*/
  var originalAngle: Double = js.native
  
  /**
    * Change the angle of the selected part's Part.rotateObject.
    * @param {number} newangle
    */
  def rotate(newangle: Double): Unit = js.native
  
  /**Gets or sets the the closeness to a desired angle at which the angle is "snapped to".*/
  var snapAngleEpsilon: Double = js.native
  
  /**Gets or sets the preferred angles for the selected object.*/
  var snapAngleMultiple: Double = js.native
}
