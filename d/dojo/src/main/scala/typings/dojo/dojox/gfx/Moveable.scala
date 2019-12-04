package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/Moveable.html
  *
  *
  * @param shape a shape object to be moved.
  * @param params an optional configuration object.
  */
@JSGlobal("dojox.gfx.Moveable")
@js.native
class Moveable protected () extends js.Object {
  def this(shape: Shape, params: js.Object) = this()
  /**
    * stops watching for possible move, deletes all references, so the object can be garbage-collected
    *
    */
  def destroy(): Unit = js.native
  /**
    * called during the very first move notification,
    * can be used to initialize coordinates, can be overwritten.
    *
    * @param mover A Mover instance that fired the event.
    */
  def onFirstMove(mover: Mover): Unit = js.native
  /**
    * event processor for onmousedown, creates a Mover for the shape
    *
    * @param e mouse event
    */
  def onMouseDown(e: Event): Unit = js.native
  /**
    * event processor for onmousemove, used only for delayed drags
    *
    * @param e mouse event
    */
  def onMouseMove(e: Event): Unit = js.native
  /**
    * event processor for onmouseup, used only for delayed delayed drags
    *
    * @param e mouse event
    */
  def onMouseUp(e: Event): Unit = js.native
  /**
    * called during every move notification,
    * should actually move the node, can be overwritten.
    *
    * @param mover A Mover instance that fired the event.
    * @param shift An object as {dx,dy} that represents the shift.
    */
  def onMove(mover: Mover, shift: js.Object): Unit = js.native
  /**
    * called before every move operation
    *
    * @param mover A Mover instance that fired the event.
    */
  def onMoveStart(mover: Mover): Unit = js.native
  /**
    * called after every move operation
    *
    * @param mover A Mover instance that fired the event.
    */
  def onMoveStop(mover: Mover): Unit = js.native
  /**
    * called after every incremental move,
    * can be overwritten.
    *
    * @param mover A Mover instance that fired the event.
    * @param shift An object as {dx,dy} that represents the shift.
    */
  def onMoved(mover: Mover, shift: js.Object): Unit = js.native
  /**
    * called before every incremental move,
    * can be overwritten.
    *
    * @param mover A Mover instance that fired the event.
    * @param shift An object as {dx,dy} that represents the shift.
    */
  def onMoving(mover: Mover, shift: js.Object): Unit = js.native
}

