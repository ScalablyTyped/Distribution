package typings.dojo.dojo.dnd

import typings.dojo.dojo.Evented
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Moveable.html
  *
  * an object, which makes a node movable
  *
  * @param node a node (or node's id) to be moved
  * @param params       Optionaloptional parameters
  */
@JSGlobal("dojo.dnd.Moveable")
@js.native
class Moveable_ protected () extends Evented {
  def this(node: HTMLElement) = this()
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    *
    */
  var delay: Double = js.native
  /**
    *
    */
  var handle: String = js.native
  /**
    *
    */
  var skip: Boolean = js.native
  /**
    * stops watching for possible move, deletes all references, so the object can be garbage-collected
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
    * @param params
    * @param node
    * @param Ctor
    */
  def markupFactory(params: js.Any, node: js.Any, Ctor: js.Any): js.Any = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * called when the drag is detected;
    * responsible for creation of the mover
    *
    * @param e
    */
  def onDragDetected(e: Event_): Unit = js.native
  /**
    * called during the very first move notification;
    * can be used to initialize coordinates, can be overwritten.
    *
    * @param mover
    * @param e
    */
  def onFirstMove(mover: Mover, e: Event_): Unit = js.native
  /**
    * event processor for onmousedown/ontouchstart, creates a Mover for the node
    *
    * @param e mouse/touch event
    */
  def onMouseDown(e: Event_): Unit = js.native
  /**
    * event processor for onmousemove/ontouchmove, used only for delayed drags
    *
    * @param e mouse/touch event
    */
  def onMouseMove(e: Event_): Unit = js.native
  /**
    * event processor for onmouseup, used only for delayed drags
    *
    * @param e mouse event
    */
  def onMouseUp(e: Event_): Unit = js.native
  /**
    * called during every move notification;
    * should actually move the node; can be overwritten.
    *
    * @param mover
    * @param leftTop
    * @param e
    */
  def onMove(mover: Mover, leftTop: js.Object, e: Event_): Unit = js.native
  /**
    * called before every move operation
    *
    * @param mover
    */
  def onMoveStart(mover: Mover): Unit = js.native
  /**
    * called after every move operation
    *
    * @param mover
    */
  def onMoveStop(mover: Mover): Unit = js.native
  /**
    * called after every incremental move; can be overwritten.
    *
    * @param mover
    * @param leftTop
    */
  def onMoved(mover: Mover, leftTop: js.Object): Unit = js.native
  /**
    * called before every incremental move; can be overwritten.
    *
    * @param mover
    * @param leftTop
    */
  def onMoving(mover: Mover, leftTop: js.Object): Unit = js.native
  /**
    * event processor for onselectevent and ondragevent
    *
    * @param e mouse event
    */
  def onSelectStart(e: Event_): Unit = js.native
}

