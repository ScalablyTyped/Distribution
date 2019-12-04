package typings.dojo.dojox.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/Touch.html
  *
  * This plugin is managing the touch interactions on item renderers displayed by a calendar view.
  *
  */
@JSGlobal("dojox.calendar.Touch")
@js.native
class Touch () extends js.Object {
  /**
    * The minimum number of minutes of margin around the edited event.
    *
    */
  var autoScrollTouchMargin: Double = js.native
  /**
    * The delay after which the item is leaving the editing mode after the previous editing gesture, in touch context.
    *
    */
  var touchEndEditingTimer: Double = js.native
  /**
    * The delay of one touch over the renderer before setting the item in editing mode.
    *
    */
  var touchStartEditingTimer: Double = js.native
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
}

