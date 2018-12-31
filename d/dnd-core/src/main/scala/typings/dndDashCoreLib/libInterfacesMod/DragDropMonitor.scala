package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropMonitor extends js.Object {
  def canDragSource(sourceId: java.lang.String): scala.Boolean = js.native
  def canDropOnTarget(targetId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if some drop target has handled the drop event, false otherwise. Even if a target did not return a drop result,
    * didDrop() returns true. Use it inside endDrag() to test whether any drop target has handled the drop. Returns false if called
    * outside endDrag().
    */
  def didDrop(): scala.Boolean = js.native
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | scala.Null = js.native
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client offset when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | scala.Null = js.native
  /**
    * Returns a plain object representing the last recorded drop result. The drop targets may optionally specify it by returning an
    * object from their drop() methods. When a chain of drop() is dispatched for the nested targets, bottom up, any parent that
    * explicitly returns its own result from drop() overrides the child drop result previously set by the child. Returns null if
    * called outside endDrag().
    */
  def getDropResult(): js.Any = js.native
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | scala.Null = js.native
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current drag
    * operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | scala.Null = js.native
  /**
    * Returns a plain object representing the currently dragged item. Every drag source must specify it by returning an object
    * from its beginDrag() method. Returns null if no item is being dragged.
    */
  def getItem(): js.Any = js.native
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item. Returns null if no item is being dragged.
    */
  def getItemType(): Identifier | scala.Null = js.native
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its position at the time
    * when the current drag operation has started, and the movement difference. Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | scala.Null = js.native
  def getSourceId(): java.lang.String | scala.Null = js.native
  def getTargetIds(): js.Array[java.lang.String] = js.native
  /**
    * Returns true if a drag operation is in progress, and either the owner initiated the drag, or its isDragging()
    * is defined and returns true.
    */
  def isDragging(): scala.Boolean = js.native
  def isDraggingSource(sourceId: java.lang.String): scala.Boolean = js.native
  def isOverTarget(targetId: java.lang.String): scala.Boolean = js.native
  def isOverTarget(targetId: java.lang.String, options: dndDashCoreLib.Anon_Shallow): scala.Boolean = js.native
  def isSourcePublic(): scala.Boolean | scala.Null = js.native
  def subscribeToOffsetChange(listener: Listener): Unsubscribe = js.native
  def subscribeToStateChange(listener: Listener): Unsubscribe = js.native
  def subscribeToStateChange(listener: Listener, options: dndDashCoreLib.Anon_HandlerIds): Unsubscribe = js.native
}

