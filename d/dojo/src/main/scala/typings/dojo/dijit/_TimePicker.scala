package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.clickableIncrement
import typings.dojo.dojoStrings.constraints
import typings.dojo.dojoStrings.filterString
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.visibleIncrement
import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_TimePicker.html
  *
  * A time picker dropdown, used by dijit/form/TimeTextBox.
  * This widget is not available as a standalone widget due to lack of accessibility support.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ListBase because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form._ListMouseMixin because Inheritance from two classes. Inlined selected, postCreate, selectFirstNode, selectLastNode, selectNextNode, selectPreviousNode */ @JSGlobal("dijit._TimePicker")
@js.native
class _TimePicker () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * ISO-8601 string representing the amount by which
    * every clickable element in the time picker increases.
    * Set in local time, without a time zone.
    * Example: T00:15:00 creates 15 minute increments
    * Must divide dijit/_TimePicker.visibleIncrement evenly
    * 
    */
  var clickableIncrement: String = js.native
  /**
    * Specifies valid range of times (start time, end time)
    * 
    */
  var constraints: js.Object = js.native
  /**
    * The string to filter by
    * 
    */
  var filterString: String = js.native
  /**
    * currently selected node
    * 
    */
  var selected: HTMLElement = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style__TimePicker: String = js.native
  /**
    * Date to display.
    * Defaults to current time and date.
    * Can be a Date object or an ISO-8601 string.
    * If you specify the GMT time zone (-01:00),
    * the time will be converted to the local time in the local time zone.
    * Otherwise, the time is considered to be in the local time zone.
    * If you specify the date and isDate is true, the date is used.
    * Example: if your local time zone is GMT -05:00,
    * T10:00:00 becomes T10:00:00-05:00 (considered to be local time),
    * T10:00:00-01:00 becomes T06:00:00-05:00 (4 hour difference),
    * T10:00:00Z becomes T05:00:00-05:00 (5 hour difference between Zulu and local time)
    * yyyy-mm-ddThh:mm:ss is the format to set the date and time
    * Example: 2007-06-01T09:00:00
    * 
    */
  var value: String = js.native
  /**
    * ISO-8601 string representing the amount by which
    * every element with a visible time in the time picker increases.
    * Set in local time, without a time zone.
    * Example: T01:00:00 creates text in every 1 hour increment
    * 
    */
  var visibleIncrement: String = js.native
  @JSName("get")
  def get_clickableIncrement(property: clickableIncrement): String = js.native
  @JSName("get")
  def get_constraints(property: constraints): js.Object = js.native
  @JSName("get")
  def get_filterString(property: filterString): String = js.native
  @JSName("get")
  def get_selected(property: selected): HTMLElement = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_visibleIncrement(property: visibleIncrement): String = js.native
  /**
    * Called from dijit/form/_DateTimeTextBox to pass a keypress event
    * from the dijit/form/TimeTextBox to be handled in this widget
    * 
    * @param e             
    */
  def handleKey(e: Event): js.Any = js.native
  /**
    * May be overridden to disable certain dates in the TimePicker e.g. isDisabledDate=locale.isWeekend
    * 
    * @param dateObject             
    * @param locale               Optional            
    */
  def isDisabledDate(dateObject: Date): Boolean = js.native
  def isDisabledDate(dateObject: Date, locale: String): Boolean = js.native
  /**
    * Notification that a time was selected.  It may be the same as the previous value.
    * 
    * @param time             
    */
  def onChange(time: Date): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onClick(node: HTMLElement): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onDeselect(node: HTMLElement): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onHover(node: HTMLElement): Unit = js.native
  /**
    * 
    */
  def onOpen(): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onSelect(node: HTMLElement): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onUnhover(node: HTMLElement): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(): js.Any = js.native
  /**
    * Select the first displayed item in the list.
    * 
    */
  /**
    * Select the first displayed item in the list.
    * 
    */
  def selectFirstNode(): Unit = js.native
  /**
    * Select the last displayed item in the list
    * 
    */
  /**
    * Select the last displayed item in the list
    * 
    */
  def selectLastNode(): Unit = js.native
  /**
    * Select the item just below the current selection.
    * If nothing selected, select first node.
    * 
    */
  /**
    * Select the item just below the current selection.
    * If nothing selected, select first node.
    * 
    */
  def selectNextNode(): Unit = js.native
  /**
    * Select the item just above the current selection.
    * If nothing selected, select last node (if
    * you select Previous and try to keep scrolling up the list).
    * 
    */
  /**
    * Select the item just above the current selection.
    * If nothing selected, select last node (if
    * you select Previous and try to keep scrolling up the list).
    * 
    */
  def selectPreviousNode(): Unit = js.native
  /**
    * Format a Date object as a string according a subset of the ISO-8601 standard
    * When options.selector is omitted, output follows RFC3339
    * The local time zone is included as an offset from GMT, except when selector=='time' (time without a date)
    * Does not check bounds.  Only years between 100 and 9999 are supported.
    * 
    * @param dateObject A Date object             
    * @param options               OptionalAn object with the following properties:selector (String): "date" or "time" for partial formatting of the Date object.Both date and time will be formatted by default.zulu (Boolean): if true, UTC/GMT is used for a timezonemilliseconds (Boolean): if true, output milliseconds            
    */
  def serialize(dateObject: Date): js.Any = js.native
  def serialize(dateObject: Date, options: js.Object): js.Any = js.native
  /**
    * Deprecated.  Used set('value') instead.
    * 
    * @param value             
    */
  def setValue(value: Date): Unit = js.native
  @JSName("set")
  def set_clickableIncrement(property: clickableIncrement, value: String): Unit = js.native
  @JSName("set")
  def set_constraints(property: constraints, value: js.Object): Unit = js.native
  @JSName("set")
  def set_filterString(property: filterString, value: String): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_visibleIncrement(property: visibleIncrement, value: String): Unit = js.native
  @JSName("watch")
  def watch_clickableIncrement(
    property: clickableIncrement,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_constraints(
    property: constraints,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_filterString(
    property: filterString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selected(
    property: selected,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
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
  def watch_visibleIncrement(
    property: visibleIncrement,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

@JSGlobal("dijit._TimePicker")
@js.native
object _TimePicker extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_TimePicker.__Constraints.html
    *
    * 
    */
  @js.native
  class __Constraints () extends js.Object {
    /**
      * override strings for am in times
      * 
      */
    var am: String = js.native
    /**
      * See dijit/_TimePicker.clickableIncrement
      * 
      */
    var clickableIncrement: String = js.native
    /**
      * override pattern with this string
      * 
      */
    var datePattern: String = js.native
    /**
      * choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'
      * 
      */
    var formatLength: String = js.native
    /**
      * (format only) use 4 digit years whenever 2 digit years are called for
      * 
      */
    var fullYear: Boolean = js.native
    /**
      * override the locale used to determine formatting rules
      * 
      */
    var locale: String = js.native
    /**
      * override strings for pm in times
      * 
      */
    var pm: String = js.native
    /**
      * choice of 'time','date' (default: date and time)
      * 
      */
    var selector: String = js.native
    /**
      * (parse only) strict parsing, off by default
      * 
      */
    var strict: Boolean = js.native
    /**
      * override pattern with this string
      * 
      */
    var timePattern: String = js.native
  }
  
}

