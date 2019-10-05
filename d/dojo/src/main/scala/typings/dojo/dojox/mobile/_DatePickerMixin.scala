package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_DatePickerMixin.html
  *
  * A mixin for date picker widget.
  *
  */
@JSGlobal("dojox.mobile._DatePickerMixin")
@js.native
class _DatePickerMixin () extends js.Object {
  /**
    * A pattern to be used to format day.
    *
    */
  var dayPattern: String = js.native
  /**
    * A pattern to be used to format month.
    *
    */
  var monthPattern: String = js.native
  /**
    * A string representing the date value.
    * The setter of this property first converts the value argument by calling
    * the fromISOString method of the dojo/date/stamp module, then sets the
    * values of the picker according to the resulting Date object.
    * If the string cannot be parsed by fromISOString, the method does nothing.
    * Example: set("value", "2012-1-20"); // January 20, 2012
    * The getter returns the string formatted as described in the dojo/date/stamp
    * module.
    *
    */
  var value: String = js.native
  /**
    * A pattern to be used to format year.
    *
    */
  var yearPattern: String = js.native
  /**
    * Initializes the slots.
    *
    */
  def initSlots(): Unit = js.native
  /**
    * A handler called when the day value is changed.
    *
    */
  def onDaySet(): Unit = js.native
  /**
    * A handler called when the month value is changed.
    *
    */
  def onMonthSet(): Unit = js.native
  /**
    * A handler called when the year value is changed.
    *
    */
  def onYearSet(): Unit = js.native
  /**
    * Reorders the slots.
    *
    */
  def reorderSlots(): Unit = js.native
  /**
    * Goes to today.
    *
    */
  def reset(): Unit = js.native
}

