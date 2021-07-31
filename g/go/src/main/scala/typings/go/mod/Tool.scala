package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tools handle mouse events and keyboard events.
  * The currently running tool, Diagram.currentTool, receives all input events from the Diagram.
  */
@JSImport("go", "Tool")
@js.native
/**
  * Don't construct this directly -- this is an abstract class.
  */
abstract class Tool () extends StObject {
  
  /**
    * This predicate is used by the ToolManager to decide if this tool can be started mode-lessly by mouse and touch events.
    */
  def canStart(): Boolean = js.native
  
  /**
    * This predicate determines whether or not to allow pinch zooming from a multi-touch event.
    */
  def canStartMultiTouch(): Boolean = js.native
  
  /**
    * This is called to cancel any running "WaitAfter" timer.
    */
  def cancelWaitAfter(): Unit = js.native
  
  /**This read-only property returns the Diagram that owns this tool and for which this tool is handling input events.*/
  var diagram: Diagram = js.native
  
  /**
    * This method is called by the diagram after setting Diagram.currentTool, to make the new tool active.
    */
  def doActivate(): Unit = js.native
  
  /**
    * The diagram will call this method when the user wishes to cancel the current tool's operation.
    */
  def doCancel(): Unit = js.native
  
  /**
    * This method is called by the diagram on the old tool when Diagram.currentTool is set to a new tool.
    */
  def doDeactivate(): Unit = js.native
  
  /**
    * The diagram will call this method upon a key down event.
    */
  def doKeyDown(): Unit = js.native
  
  /**
    * The diagram will call this method upon a key up event.
    */
  def doKeyUp(): Unit = js.native
  
  /**
    * The diagram will call this method upon a mouse down event.
    */
  def doMouseDown(): Unit = js.native
  
  /**
    * The diagram will call this method upon a mouse move event.
    */
  def doMouseMove(): Unit = js.native
  
  /**
    * The diagram will call this method upon a mouse up event.
    */
  def doMouseUp(): Unit = js.native
  
  /**
    * The diagram will call this method as the mouse wheel is rotated.
    */
  def doMouseWheel(): Unit = js.native
  
  /**
    * This method is called by the diagram when this tool becomes the current tool; you should not call this method.
    */
  def doStart(): Unit = js.native
  
  /**
    * This method is called by the diagram when this tool stops being the current tool; you should not call this method.
    */
  def doStop(): Unit = js.native
  
  /**
    * This is called a certain delay after a call to .standardWaitAfter if there has not been any call to .cancelWaitAfter.
    */
  def doWaitAfter(): Unit = js.native
  
  /**
    * This convenience function finds the front-most GraphObject that is at a given point and that is part of an Adornment that is of a given category.
    * @param {Point} p a Point in document coordinates.
    * @param {string} category the required Part.category of the Adornment.
    */
  def findToolHandleAt(p: Point, category: String): GraphObject = js.native
  
  /**Gets or sets whether this tool is started and is actively doing something.*/
  var isActive: Boolean = js.native
  
  /**
    * Return true when the last mouse point is far enough away from the first mouse down point to constitute a drag operation instead of just a potential click.
    * @param {Point=} first Point in view coordinates, defaults to Diagram.firstInput's InputEvent.viewPoint.
    * @param {Point=} last Point in view coordinates, defaults to Diagram.lastInput's InputEvent.viewPoint.
    */
  def isBeyondDragSize(): Boolean = js.native
  def isBeyondDragSize(first: Unit, last: Point): Boolean = js.native
  def isBeyondDragSize(first: Point): Boolean = js.native
  def isBeyondDragSize(first: Point, last: Point): Boolean = js.native
  
  /**Gets or sets whether this tool can be started by a mouse event.*/
  var isEnabled: Boolean = js.native
  
  /**Gets or sets the name of this tool.*/
  var name: String = js.native
  
  /**
    * Implement the standard behavior for mouse clicks, searching for and calling click handler functions on GraphObjects or on Diagram, and raising the corresponding DiagramEvent.
    * @param {function(GraphObject):GraphObject | null=} navig An optional custom navigation
    * function to find target objects.
    * @param {function(GraphObject):boolean | null=} pred An optional custom predicate
    */
  def standardMouseClick(): Unit = js.native
  def standardMouseClick(navig: js.Function1[/* obj */ GraphObject, GraphObject]): Unit = js.native
  def standardMouseClick(
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, Boolean]
  ): Unit = js.native
  def standardMouseClick(navig: Unit, pred: js.Function1[/* obj */ GraphObject, Boolean]): Unit = js.native
  
  /**
    * Implement the standard behavior for mouse enter, over, and leave events, where the mouse is moving but no button is pressed.
    */
  def standardMouseOver(): Unit = js.native
  
  /**
    * Implement the standard behavior for selecting parts with the mouse, depending on the control and shift modifier keys.
    */
  def standardMouseSelect(): Unit = js.native
  
  /**
    * Implement the standard behavior for mouse wheel events.
    */
  def standardMouseWheel(): Unit = js.native
  
  /**
    * Continues pinch-zooming (started by standardPinchZoomStart) on multi-touch devices.
    */
  def standardPinchZoomMove(): Unit = js.native
  
  /**
    * Initiates pinch-zooming on multi-touch devices.
    */
  def standardPinchZoomStart(): Unit = js.native
  
  /**
    * This is called to start a new timer to call .doWaitAfter after a given delay.
    * @param {number} delay in milliseconds
    */
  def standardWaitAfter(delay: Double): Unit = js.native
  
  /**
    * Call Diagram.startTransaction with the given transaction name.
    * @param {string=} tname a description of the transaction
    */
  def startTransaction(): Boolean = js.native
  def startTransaction(tname: String): Boolean = js.native
  
  /**
    * If the Diagram.currentTool is this tool, stop this tool and start the Diagram.defaultTool by making it be the new current tool.
    */
  def stopTool(): Unit = js.native
  
  /**
    * If .transactionResult is null, call Diagram.rollbackTransaction, otherwise call Diagram.commitTransaction.
    */
  def stopTransaction(): Boolean = js.native
  
  /**Gets or sets the name of the transaction to be committed by .stopTransaction; if null, the transaction will be rolled back.*/
  var transactionResult: String = js.native
  
  /**
    * The diagram asks each tool to update any adornments the tool might use for a given part.
    * @param {Part} part
    */
  def updateAdornments(part: Part): Unit = js.native
}
