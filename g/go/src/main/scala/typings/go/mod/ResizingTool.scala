package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ResizingTool is used to interactively change the size of a GraphObject
  * in the selected Part or Node.
  * This tool does not operate on Links.
  */
@JSImport("go", "ResizingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.resizingTool, which you can modify.
  */
class ResizingTool () extends Tool {
  
  /**This read-only property returns the GraphObject that is being resized.*/
  var adornedObject: GraphObject = js.native
  
  /**Gets or sets the width and height multiples with which the user must resize.*/
  var cellSize: Size = js.native
  
  /**
    * The size should be a multiple of the value returned by this method.
    */
  def computeCellSize(): Size = js.native
  
  /**
    * The effective maximum resizing size is the minimum of the .maxSize and the .adornedObject's GraphObject.maxSize.
    */
  def computeMaxSize(): Size = js.native
  
  /**
    * The effective minimum resizing size is the maximum of .minSize and the .adornedObject's GraphObject.minSize.
    */
  def computeMinSize(): Size = js.native
  
  /**
    * Given a Spot in the original bounds of the object being resized and a new Point, compute the new Rect.
    * @param {Point} newPoint a Point in local coordinates.
    * @param {Spot} spot the alignment spot of the handle being dragged.
    * @param {Size} min the result of the call to .computeMinSize.
    * @param {Size} max the result of the call to .computeMaxSize.
    * @param {Size} cell the result of the call to .computeCellSize.
    * @param {boolean} reshape true if the new size may change the aspect ratio from that of the natural bounds of the .adornedObject.
    */
  def computeResize(newPoint: Point, spot: Spot, min: Size, max: Size, cell: Size, reshape: Boolean): Rect = js.native
  
  /**This read-only property returns the GraphObject that is the tool handle being dragged by the user.*/
  var handle: GraphObject = js.native
  
  /**Gets or sets a small GraphObject that is copied as a resizing handle for the selected part.*/
  var handleArchetype: GraphObject = js.native
  
  /**Gets or sets whether the ResizingTool snaps object sizes to the diagram's background grid during the resize.*/
  var isGridSnapEnabled: Boolean = js.native
  
  /**Gets or sets the maximum size to which the user can resize.*/
  var maxSize: Size = js.native
  
  /**Gets or sets the minimum size to which the user can resize.*/
  var minSize: Size = js.native
  
  /**This read-only property returns the Size that was the original value of the GraphObject.desiredSize of the element that is being resized.*/
  var originalDesiredSize: Size = js.native
  
  /**This read-only property returns the Point that was the original value of the Part.location of the Part that is being resized.*/
  var originalLocation: Point = js.native
  
  /**
    * Change the size of the selected part's Part.resizeObject to have the given bounds.
    * @param {Rect} newr
    */
  def resize(newr: Rect): Unit = js.native
}
