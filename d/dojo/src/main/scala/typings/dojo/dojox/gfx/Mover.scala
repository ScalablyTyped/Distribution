package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/Mover.html
  *
  *
  * @param shape a shape object to be moved
  * @param e a mouse event, which started the move;only clientX and clientY properties are used
  * @param host       Optionalobject which implements the functionality of the move, and defines proper events (onMoveStart and onMoveStop)
  */
@JSGlobal("dojox.gfx.Mover")
@js.native
class Mover protected () extends js.Object {
  def this(shape: Shape, e: Event_) = this()
  def this(shape: Shape, e: Event_, host: js.Object) = this()
  /**
    * stops the move, deletes all references, so the object can be garbage-collected
    *
    */
  def destroy(): Unit = js.native
  /**
    * it is meant to be called only once
    *
    */
  def onFirstMove(): Unit = js.native
  /**
    * event processor for onmousemove
    *
    * @param e mouse event
    */
  def onMouseMove(e: Event_): Unit = js.native
}

