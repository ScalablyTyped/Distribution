package typings.dojo.dojo.dnd

import typings.dojo.dojo.Evented
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Mover.html
  *
  * an object which makes a node follow the mouse, or touch-drag on touch devices.
  * Used as a default mover, and as a base class for custom movers.
  *
  * @param node a node (or node's id) to be moved
  * @param e a mouse event, which started the move;only pageX and pageY properties are used
  * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)
  */
@JSGlobal("dojo.dnd.Mover")
@js.native
class Mover protected () extends Evented {
  def this(node: HTMLElement, e: Event_) = this()
  def this(node: HTMLElement, e: Event_, host: js.Object) = this()
  /**
    * stops the move, deletes all references, so the object can be garbage-collected
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param type
    * @param event
    */
  def emit(`type`: js.Any, event: js.Any): js.Any = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * makes the node absolute; it is meant to be called only once.
    * relative and absolutely positioned nodes are assumed to use pixel units
    *
    * @param e
    */
  def onFirstMove(e: js.Any): Unit = js.native
  /**
    * event processor for onmousemove/ontouchmove
    *
    * @param e mouse/touch event
    */
  def onMouseMove(e: Event_): Unit = js.native
  /**
    *
    * @param e
    */
  def onMouseUp(e: js.Any): Unit = js.native
}

