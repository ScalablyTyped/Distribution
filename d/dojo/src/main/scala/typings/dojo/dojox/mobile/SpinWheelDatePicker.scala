package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.dayPattern
import typings.dojo.dojoStrings.monthPattern
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.yearPattern
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/SpinWheelDatePicker.html
  *
  * A SpinWheel-based date picker widget.
  * SpinWheelDatePicker is a date picker widget. It is a subclass of
  * dojox/mobile/SpinWheel. It has three slots: year, month, and day.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile._DatePickerMixin because Inheritance from two classes. Inlined dayPattern, monthPattern, value, yearPattern, initSlots, reorderSlots, reset, onDaySet, onMonthSet, onYearSet */ @JSGlobal("dojox.mobile.SpinWheelDatePicker")
@js.native
class SpinWheelDatePicker () extends SpinWheel {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
    * Disables the end days of the month to match the specified
    * number of days of the month.
    *
    * @param daysInMonth
    */
  def disableValues(daysInMonth: Double): Unit = js.native
  @JSName("get")
  def get_dayPattern(property: dayPattern): String = js.native
  @JSName("get")
  def get_monthPattern(property: monthPattern): String = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_yearPattern(property: yearPattern): String = js.native
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
  @JSName("set")
  def set_dayPattern(property: dayPattern, value: String): Unit = js.native
  @JSName("set")
  def set_monthPattern(property: monthPattern, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_yearPattern(property: yearPattern, value: String): Unit = js.native
  @JSName("watch")
  def watch_dayPattern(
    property: dayPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_monthPattern(
    property: monthPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_yearPattern(
    property: yearPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

