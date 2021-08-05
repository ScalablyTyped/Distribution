package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The LinkReshapingTool is used to interactively change the route of a Link.
  * This tool makes use of an Adornment, shown when the adorned Link is selected,
  * that includes some number of reshape handles.
  * This tool conducts a transaction while the tool is active.
  * A successful reshaping will result in a "LinkReshaped" DiagramEvent and a "LinkReshaping" transaction.
  */
@JSImport("go", "LinkReshapingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkReshapingTool, which you can modify.
  */
class LinkReshapingTool () extends Tool {
  
  /**This read-only property returns the Link that is being routed manually.*/
  var adornedLink: Link = js.native
  
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
    * Change the route of the .adornedLink by moving the point corresponding to the current .handle to be at the given Point.
    * @param {Point} newPoint
    */
  def reshape(newPoint: Point): Unit = js.native
  
  /**
    * Set the permitted reshaping behavior for a particular reshape handle.
    * @param {GraphObject} obj a reshape handle in the "LinkReshaping" Adornment.
    * @param {EnumValue} behavior one of LinkReshapingTool.All, .Vertical, .Horizontal, or .None
    */
  def setReshapingBehavior(obj: GraphObject, behavior: EnumValue): Unit = js.native
}
object LinkReshapingTool {
  
  @JSImport("go", "LinkReshapingTool")
  @js.native
  val ^ : js.Any = js.native
  
  /**Allow dragging in any direction.*/
  /* static member */
  @JSImport("go", "LinkReshapingTool.All")
  @js.native
  def All: EnumValue = js.native
  inline def All_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  
  /**Allow only horizontal (left-and-right) dragging.*/
  /* static member */
  @JSImport("go", "LinkReshapingTool.Horizontal")
  @js.native
  def Horizontal: EnumValue = js.native
  inline def Horizontal_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /**Disallow dragging.*/
  /* static member */
  @JSImport("go", "LinkReshapingTool.None")
  @js.native
  def None: EnumValue = js.native
  inline def None_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Allow only vertical (up-and-down) dragging.*/
  /* static member */
  @JSImport("go", "LinkReshapingTool.Vertical")
  @js.native
  def Vertical: EnumValue = js.native
  inline def Vertical_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
