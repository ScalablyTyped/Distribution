package typings.dojo.dojo.dnd

import typings.dojo.dojo.Evented
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Manager.html
  *
  * the manager of DnD operations (usually a singleton)
  *
  */
@JSGlobal("dojo.dnd.Manager")
@js.native
class Manager () extends Evented {
  /**
    *
    */
  var OFFSET_X: Double = js.native
  /**
    *
    */
  var OFFSET_Y: Double = js.native
  /**
    * called to notify if the current target can accept items
    *
    * @param flag
    */
  def canDrop(flag: js.Any): Unit = js.native
  /**
    *
    * @param type
    * @param event
    */
  def emit(`type`: js.Any, event: js.Any): js.Any = js.native
  /**
    * makes the avatar; it is separate to be overwritten dynamically, if needed
    *
    */
  def makeAvatar(): js.Any = js.native
  /**
    * Returns the current DnD manager.  Creates one if it is not created yet.
    *
    */
  def manager(): js.Any = js.native
  /**
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * event processor for onkeydown:
    * watching for CTRL for copy/move status, watching for ESCAPE to cancel the drag
    *
    * @param e keyboard event
    */
  def onKeyDown(e: Event_): Unit = js.native
  /**
    * event processor for onkeyup, watching for CTRL for copy/move status
    *
    * @param e keyboard event
    */
  def onKeyUp(e: Event_): Unit = js.native
  /**
    * event processor for onmousemove
    *
    * @param e mouse event
    */
  def onMouseMove(e: Event_): Unit = js.native
  /**
    * event processor for onmouseup
    *
    * @param e mouse event
    */
  def onMouseUp(e: Event_): Unit = js.native
  /**
    * called when a source detected a mouse-out condition
    *
    * @param source the reporter
    */
  def outSource(source: js.Object): Unit = js.native
  /**
    * called when a source detected a mouse-over condition
    *
    * @param source the reporter
    */
  def overSource(source: js.Object): Unit = js.native
  /**
    * called to initiate the DnD operation
    *
    * @param source the source which provides items
    * @param nodes the list of transferred items
    * @param copy copy items, if true, move items otherwise
    */
  def startDrag(source: js.Object, nodes: js.Array[_], copy: Boolean): Unit = js.native
  /**
    * stop the DnD in progress
    *
    */
  def stopDrag(): Unit = js.native
  /**
    * updates the avatar; it is separate to be overwritten dynamically, if needed
    *
    */
  def updateAvatar(): Unit = js.native
}

