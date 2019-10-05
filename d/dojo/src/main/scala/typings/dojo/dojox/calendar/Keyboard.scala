package typings.dojo.dojox.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/Keyboard.html
  *
  * This mixin is managing the keyboard interactions on a calendar view.
  *
  */
@JSGlobal("dojox.calendar.Keyboard")
@js.native
class Keyboard () extends js.Object {
  /**
    * Unit used during editing of an all day event using the keyboard and the left or right keys were pressed. Valid values are "week", "day", "hours" "minute".
    *
    */
  var allDayKeyboardLeftRightSteps: String = js.native
  /**
    * Steps used during editing of an all day event using the keyboard and the up or down keys were pressed.
    *
    */
  var allDayKeyboardLeftRightUnit: Double = js.native
  /**
    * Unit used during editing of an all day event using the keyboard and the up or down keys were pressed. Valid values are "week", "day", "hours" "minute".
    *
    */
  var allDayKeyboardUpDownSteps: String = js.native
  /**
    * Steps used during editing of an all day event using the keyboard and the up or down keys were pressed.
    *
    */
  var allDayKeyboardUpDownUnit: Double = js.native
  /**
    * The data item that currently has the focus.
    *
    */
  var focusedItem: js.Object = js.native
  /**
    * Unit used during editing of an event using the keyboard and the left or right keys were pressed.
    *
    */
  var keyboardLeftRightSteps: Double = js.native
  /**
    * Unit used during editing of an event using the keyboard and the left or right keys were pressed. Valid values are "week", "day", "hours" "minute".
    *
    */
  var keyboardLeftRightUnit: String = js.native
  /**
    * Steps used during editing of an event using the keyboard and the up or down keys were pressed.
    *
    */
  var keyboardUpDownSteps: Double = js.native
  /**
    * Unit used during editing of an event using the keyboard and the up or down keys were pressed. Valid values are "week", "day", "hours" "minute".
    *
    */
  var keyboardUpDownUnit: String = js.native
  /**
    * The duration in milliseconds to scroll the entire view.
    * The scroll speed is constant when scrolling to show an item renderer.
    *
    */
  var maxScrollAnimationDuration: Double = js.native
  /**
    *
    */
  var resizeModifier: String = js.native
  /**
    * Show or hide the focus graphic feedback on item renderers.
    *
    */
  var showFocus: Boolean = js.native
  /**
    * Order fields are traversed when user hits the tab key
    *
    */
  var tabIndex: String = js.native
  /**
    * Event dispatched when the focus has changed.
    *
    * @param e
    */
  def onFocusChange(e: js.Any): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
}

