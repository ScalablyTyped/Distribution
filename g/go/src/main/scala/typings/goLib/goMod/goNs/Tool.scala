package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tools handle mouse events and keyboard events.
  * The currently running tool, Diagram.currentTool, receives all input events from the Diagram.
  */
@js.native
trait Tool extends js.Object {
  /**This read-only property returns the Diagram that owns this tool and for which this tool is handling input events.*/
  var diagram: Diagram = js.native
  /**Gets or sets whether this tool is started and is actively doing something.*/
  var isActive: scala.Boolean = js.native
  /**Gets or sets whether this tool can be started by a mouse event.*/
  var isEnabled: scala.Boolean = js.native
  /**Gets or sets the name of this tool.*/
  var name: java.lang.String = js.native
  /**Gets or sets the name of the transaction to be committed by .stopTransaction; if null, the transaction will be rolled back.*/
  var transactionResult: java.lang.String = js.native
  /**
    * This predicate is used by the ToolManager to decide if this tool can be started mode-lessly by mouse and touch events.
    */
  def canStart(): scala.Boolean = js.native
  /**
    * This predicate determines whether or not to allow pinch zooming from a multi-touch event.
    */
  def canStartMultiTouch(): scala.Boolean = js.native
  /**
    * This is called to cancel any running "WaitAfter" timer.
    */
  def cancelWaitAfter(): scala.Unit = js.native
  /**
    * This method is called by the diagram after setting Diagram.currentTool, to make the new tool active.
    */
  def doActivate(): scala.Unit = js.native
  /**
    * The diagram will call this method when the user wishes to cancel the current tool's operation.
    */
  def doCancel(): scala.Unit = js.native
  /**
    * This method is called by the diagram on the old tool when Diagram.currentTool is set to a new tool.
    */
  def doDeactivate(): scala.Unit = js.native
  /**
    * The diagram will call this method upon a key down event.
    */
  def doKeyDown(): scala.Unit = js.native
  /**
    * The diagram will call this method upon a key up event.
    */
  def doKeyUp(): scala.Unit = js.native
  /**
    * The diagram will call this method upon a mouse down event.
    */
  def doMouseDown(): scala.Unit = js.native
  /**
    * The diagram will call this method upon a mouse move event.
    */
  def doMouseMove(): scala.Unit = js.native
  /**
    * The diagram will call this method upon a mouse up event.
    */
  def doMouseUp(): scala.Unit = js.native
  /**
    * The diagram will call this method as the mouse wheel is rotated.
    */
  def doMouseWheel(): scala.Unit = js.native
  /**
    * This method is called by the diagram when this tool becomes the current tool; you should not call this method.
    */
  def doStart(): scala.Unit = js.native
  /**
    * This method is called by the diagram when this tool stops being the current tool; you should not call this method.
    */
  def doStop(): scala.Unit = js.native
  /**
    * This is called a certain delay after a call to .standardWaitAfter if there has not been any call to .cancelWaitAfter.
    */
  def doWaitAfter(): scala.Unit = js.native
  /**
    * This convenience function finds the front-most GraphObject that is at a given point and that is part of an Adornment that is of a given category.
    * @param {Point} p a Point in document coordinates.
    * @param {string} category the required Part.category of the Adornment.
    */
  def findToolHandleAt(p: Point, category: java.lang.String): GraphObject = js.native
  /**
    * Return true when the last mouse point is far enough away from the first mouse down point to constitute a drag operation instead of just a potential click.
    * @param {Point=} first Point in view coordinates, defaults to Diagram.firstInput's InputEvent.viewPoint.
    * @param {Point=} last Point in view coordinates, defaults to Diagram.lastInput's InputEvent.viewPoint.
    */
  def isBeyondDragSize(): scala.Boolean = js.native
  def isBeyondDragSize(first: Point): scala.Boolean = js.native
  def isBeyondDragSize(first: Point, last: Point): scala.Boolean = js.native
  /**
    * Implement the standard behavior for mouse clicks, searching for and calling click handler functions on GraphObjects or on Diagram, and raising the corresponding DiagramEvent.
    * @param {function(GraphObject):GraphObject | null=} navig An optional custom navigation
    * function to find target objects.
    * @param {function(GraphObject):boolean | null=} pred An optional custom predicate
    */
  def standardMouseClick(): scala.Unit = js.native
  def standardMouseClick(navig: js.Function1[/* obj */ GraphObject, GraphObject]): scala.Unit = js.native
  def standardMouseClick(
    navig: js.Function1[/* obj */ GraphObject, GraphObject],
    pred: js.Function1[/* obj */ GraphObject, scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Implement the standard behavior for mouse enter, over, and leave events, where the mouse is moving but no button is pressed.
    */
  def standardMouseOver(): scala.Unit = js.native
  /**
    * Implement the standard behavior for selecting parts with the mouse, depending on the control and shift modifier keys.
    */
  def standardMouseSelect(): scala.Unit = js.native
  /**
    * Implement the standard behavior for mouse wheel events.
    */
  def standardMouseWheel(): scala.Unit = js.native
  /**
    * Continues pinch-zooming (started by standardPinchZoomStart) on multi-touch devices.
    */
  def standardPinchZoomMove(): scala.Unit = js.native
  /**
    * Initiates pinch-zooming on multi-touch devices.
    */
  def standardPinchZoomStart(): scala.Unit = js.native
  /**
    * This is called to start a new timer to call .doWaitAfter after a given delay.
    * @param {number} delay in milliseconds
    */
  def standardWaitAfter(delay: scala.Double): scala.Unit = js.native
  /**
    * Call Diagram.startTransaction with the given transaction name.
    * @param {string=} tname a description of the transaction
    */
  def startTransaction(): scala.Boolean = js.native
  def startTransaction(tname: java.lang.String): scala.Boolean = js.native
  /**
    * If the Diagram.currentTool is this tool, stop this tool and start the Diagram.defaultTool by making it be the new current tool.
    */
  def stopTool(): scala.Unit = js.native
  /**
    * If .transactionResult is null, call Diagram.rollbackTransaction, otherwise call Diagram.commitTransaction.
    */
  def stopTransaction(): scala.Boolean = js.native
  /**
    * The diagram asks each tool to update any adornments the tool might use for a given part.
    * @param {Part} part
    */
  def updateAdornments(part: Part): scala.Unit = js.native
}

