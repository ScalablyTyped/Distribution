package typings.dojo.dojox.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/Mouse.html
  *
  * This plugin is managing the mouse interactions on item renderers displayed by a calendar view.
  *
  */
@JSGlobal("dojox.calendar.Mouse")
@js.native
class Mouse () extends js.Object {
  /**
    * The distance in pixels along the vertical or horizontal axis to cover with the
    * mouse button down before triggering the editing gesture.
    *
    */
  var triggerExtent: Double = js.native
  /**
    * Event dispatched when the mouse cursor in leaving an item renderer.
    *
    * @param e The event dispatched when the mouse cursor enters in the item renderer.
    */
  def onItemRollOut(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the mouse cursor in going over an item renderer.
    *
    * @param e The event dispatched when the mouse cursor enters in the item renderer.
    */
  def onItemRollOver(e: js.Object): Unit = js.native
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
}

