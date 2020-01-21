package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.dayMinusBtnLabel
import typings.dojo.dojoStrings.dayMinusBtnLabelRef
import typings.dojo.dojoStrings.dayPattern
import typings.dojo.dojoStrings.dayPlusBtnLabel
import typings.dojo.dojoStrings.dayPlusBtnLabelRef
import typings.dojo.dojoStrings.monthMinusBtnLabel
import typings.dojo.dojoStrings.monthMinusBtnLabelRef
import typings.dojo.dojoStrings.monthPattern
import typings.dojo.dojoStrings.monthPlusBtnLabel
import typings.dojo.dojoStrings.monthPlusBtnLabelRef
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.yearMinusBtnLabel
import typings.dojo.dojoStrings.yearMinusBtnLabelRef
import typings.dojo.dojoStrings.yearPattern
import typings.dojo.dojoStrings.yearPlusBtnLabel
import typings.dojo.dojoStrings.yearPlusBtnLabelRef
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ValuePickerDatePicker.html
  *
  * A ValuePicker-based date picker widget.
  * ValuePickerDatePicker is a date picker widget. It is a subclass of
  * dojox/mobile/ValuePicker. It has 3 slots: day, month and year.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile.DatePickerMixin because Inheritance from two classes. Inlined dayPattern, monthPattern, value, yearPattern, initSlots, reorderSlots, reset, onDaySet, onMonthSet, onYearSet */ @JSGlobal("dojox.mobile.ValuePickerDatePicker")
@js.native
class ValuePickerDatePicker () extends ValuePicker {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * (Accessibility) Label for day minus button
    *
    */
  var dayMinusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the day minus button
    *
    */
  var dayMinusBtnLabelRef: String = js.native
  /**
    * A pattern to be used to format day.
    *
    */
  var dayPattern: String = js.native
  /**
    * (Accessibility) Label for day plus button
    *
    */
  var dayPlusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the day plus button
    *
    */
  var dayPlusBtnLabelRef: String = js.native
  /**
    * (Accessibility) Label for month minus button
    *
    */
  var monthMinusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the month minus button
    *
    */
  var monthMinusBtnLabelRef: String = js.native
  /**
    * A pattern to be used to format month.
    *
    */
  var monthPattern: String = js.native
  /**
    * (Accessibility) Label for month plus button
    *
    */
  var monthPlusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the month plus button
    *
    */
  var monthPlusBtnLabelRef: String = js.native
  /**
    * If true, slot input fields are read-only. Only the plus and
    * minus buttons can be used to change the values.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var readOnly: Boolean = js.native
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
    *
    */
  var yearMinusBtnLabel: String = js.native
  /**
    *
    */
  var yearMinusBtnLabelRef: String = js.native
  /**
    * A pattern to be used to format year.
    *
    */
  var yearPattern: String = js.native
  /**
    * (Accessibility) Label for year plus button
    *
    */
  var yearPlusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for the year plus button
    *
    */
  var yearPlusBtnLabelRef: String = js.native
  /**
    * Disables the end days of the month to match the specified
    * number of days of the month.
    *
    * @param daysInMonth
    */
  def disableValues(daysInMonth: Double): Unit = js.native
  @JSName("get")
  def get_dayMinusBtnLabel(property: dayMinusBtnLabel): String = js.native
  @JSName("get")
  def get_dayMinusBtnLabelRef(property: dayMinusBtnLabelRef): String = js.native
  @JSName("get")
  def get_dayPattern(property: dayPattern): String = js.native
  @JSName("get")
  def get_dayPlusBtnLabel(property: dayPlusBtnLabel): String = js.native
  @JSName("get")
  def get_dayPlusBtnLabelRef(property: dayPlusBtnLabelRef): String = js.native
  @JSName("get")
  def get_monthMinusBtnLabel(property: monthMinusBtnLabel): String = js.native
  @JSName("get")
  def get_monthMinusBtnLabelRef(property: monthMinusBtnLabelRef): String = js.native
  @JSName("get")
  def get_monthPattern(property: monthPattern): String = js.native
  @JSName("get")
  def get_monthPlusBtnLabel(property: monthPlusBtnLabel): String = js.native
  @JSName("get")
  def get_monthPlusBtnLabelRef(property: monthPlusBtnLabelRef): String = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_yearMinusBtnLabel(property: yearMinusBtnLabel): String = js.native
  @JSName("get")
  def get_yearMinusBtnLabelRef(property: yearMinusBtnLabelRef): String = js.native
  @JSName("get")
  def get_yearPattern(property: yearPattern): String = js.native
  @JSName("get")
  def get_yearPlusBtnLabel(property: yearPlusBtnLabel): String = js.native
  @JSName("get")
  def get_yearPlusBtnLabelRef(property: yearPlusBtnLabelRef): String = js.native
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
  def set_dayMinusBtnLabel(property: dayMinusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_dayMinusBtnLabelRef(property: dayMinusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_dayPattern(property: dayPattern, value: String): Unit = js.native
  @JSName("set")
  def set_dayPlusBtnLabel(property: dayPlusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_dayPlusBtnLabelRef(property: dayPlusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_monthMinusBtnLabel(property: monthMinusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_monthMinusBtnLabelRef(property: monthMinusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_monthPattern(property: monthPattern, value: String): Unit = js.native
  @JSName("set")
  def set_monthPlusBtnLabel(property: monthPlusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_monthPlusBtnLabelRef(property: monthPlusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_yearMinusBtnLabel(property: yearMinusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_yearMinusBtnLabelRef(property: yearMinusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_yearPattern(property: yearPattern, value: String): Unit = js.native
  @JSName("set")
  def set_yearPlusBtnLabel(property: yearPlusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_yearPlusBtnLabelRef(property: yearPlusBtnLabelRef, value: String): Unit = js.native
  @JSName("watch")
  def watch_dayMinusBtnLabel(
    property: dayMinusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayMinusBtnLabelRef(
    property: dayMinusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayPattern(
    property: dayPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayPlusBtnLabel(
    property: dayPlusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayPlusBtnLabelRef(
    property: dayPlusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_monthMinusBtnLabel(
    property: monthMinusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_monthMinusBtnLabelRef(
    property: monthMinusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_monthPattern(
    property: monthPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_monthPlusBtnLabel(
    property: monthPlusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_monthPlusBtnLabelRef(
    property: monthPlusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_yearMinusBtnLabel(
    property: yearMinusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_yearMinusBtnLabelRef(
    property: yearMinusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_yearPattern(
    property: yearPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_yearPlusBtnLabel(
    property: yearPlusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_yearPlusBtnLabelRef(
    property: yearPlusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

