package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The LinkReshapingTool is used to interactively change the route of a Link.
    * This tool makes use of an Adornment, shown when the adorned Link is selected,
    * that includes some number of reshape handles.
    * This tool conducts a transaction while the tool is active.
    * A successful reshaping will result in a "LinkReshaped" DiagramEvent and a "LinkReshaping" transaction.
    */
@js.native
trait LinkReshapingTool extends Tool {
  /**This read-only property returns the Link that is being routed manually.*/
  var adornedLink: Link = js.native
  /**This read-only property returns the GraphObject that is the tool handle being dragged by the user.*/
  var handle: GraphObject = js.native
  /**Gets or sets a small GraphObject that is copied as a reshape handle at each movable point in the selected link's route.*/
  var handleArchetype: GraphObject = js.native
  /**Gets or sets a small GraphObject that is copied as a resegment handle at each mid point in the selected Link's route.*/
  var midHandleArchetype: GraphObject = js.native
  /**This read-only property returns the Point that was the original location of the handle that is being dragged to reshape the Link.*/
  var originalPoint: Point = js.native
  /**This read-only property returns the List of Points that was the original route of the Link that is being reshaped.*/
  var originalPoints: List[Point] = js.native
  /**
          * This is called by .doMouseMove and .doMouseUp to limit the input point before calling .reshape.
          * @param {Point} p
          */
  def computeReshape(p: Point): Point = js.native
  /**
          * Get the permitted reshaping behavior for a particular reshape handle.
          * @param {GraphObject} obj a reshape handle in the "LinkReshaping" Adornment.
          */
  def getReshapingBehavior(obj: GraphObject): EnumValue = js.native
  /**
          * Change the route of the .adornedLink by moving the point corresponding to the current .handle to be at the given Point.
          * @param {Point} newPoint
          */
  def reshape(newPoint: Point): scala.Unit = js.native
  /**
          * Set the permitted reshaping behavior for a particular reshape handle.
          * @param {GraphObject} obj a reshape handle in the "LinkReshaping" Adornment.
          * @param {EnumValue} behavior one of LinkReshapingTool.All, .Vertical, .Horizontal, or .None
          */
  def setReshapingBehavior(obj: GraphObject, behavior: EnumValue): scala.Unit = js.native
}

