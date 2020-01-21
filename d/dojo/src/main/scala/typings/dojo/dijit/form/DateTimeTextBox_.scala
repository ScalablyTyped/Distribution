package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.autoWidth
import typings.dojo.dojoStrings.datePackage
import typings.dojo.dojoStrings.dropDown
import typings.dojo.dojoStrings.dropDownDefaultValue
import typings.dojo.dojoStrings.dropDownPosition
import typings.dojo.dojoStrings.forceWidth
import typings.dojo.dojoStrings.hasDownArrow
import typings.dojo.dojoStrings.maxHeight
import typings.dojo.dojoStrings.popupClass
import typings.dojo.dojoStrings.value
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_DateTimeTextBox.html
  *
  * Base class for validating, serializable, range-bound date or time text box.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.FocusMixin because Already inherited
- typings.dojo.dijit.HasDropDown because Inheritance from two classes. Inlined autoWidth, dropDown, dropDownPosition, forceWidth, maxHeight, buildRendering, closeDropDown, destroy, isLoaded, loadAndOpenDropDown, loadDropDown, openDropDown, postCreate, toggleDropDown */ @JSGlobal("dijit.form._DateTimeTextBox")
@js.native
class DateTimeTextBox_ () extends RangeBoundTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  var autoWidth: Boolean = js.native
  /**
    * JavaScript namespace to find calendar routines.  If unspecified, uses Gregorian calendar routines
    * at dojo/date and dojo/date/locale.
    * 
    */
  var datePackage: String = js.native
  /**
    * The widget to display as a popup.  This widget must be
    * defined before the startup function is called.
    * 
    */
  var dropDown: js.Object = js.native
  /**
    * The default value to focus in the popupClass widget when the textbox value is empty.
    * 
    */
  var dropDownDefaultValue: Date = js.native
  /**
    * This variable controls the position of the drop down.
    * It's an array of strings with the following values:
    * 
    * before: places drop down to the left of the target node/widget, or to the right in
    * the case of RTL scripts like Hebrew and Arabic
    * after: places drop down to the right of the target node/widget, or to the left in
    * the case of RTL scripts like Hebrew and Arabic
    * above: drop down goes above target node
    * below: drop down goes below target node
    * The list is positions is tried, in order, until a position is found where the drop down fits
    * within the viewport.
    * 
    */
  var dropDownPosition: js.Object = js.native
  /**
    * Set to true to make the drop down exactly as wide as this
    * widget.  Overrides autoWidth.
    * 
    */
  var forceWidth: Boolean = js.native
  /**
    * Set this textbox to display a down arrow button, to open the drop down list.
    * 
    */
  var hasDownArrow: Boolean = js.native
  /**
    * The max height for our dropdown.
    * Any dropdown taller than this will have scrollbars.
    * Set to 0 for no max height, or -1 to limit height to available space in viewport
    * 
    */
  var maxHeight: Double = js.native
  /**
    * Name of the popup widget class used to select a date/time.
    * Subclasses should specify this.
    * 
    */
  var popupClass: js.Any = js.native
  /**
    * The value of this widget as a JavaScript Date object.  Use get("value") / set("value", val) to manipulate.
    * When passed to the parser in markup, must be specified according to dojo/date/stamp.fromISOString()
    * 
    */
  @JSName("value")
  var value_DateTimeTextBox_ : Date = js.native
  /**
    * Closes the drop down on this widget
    * 
    * @param focus If true, refocuses the button widget             
    */
  /**
    * Closes the drop down on this widget
    * 
    * @param focus If true, refocuses the button widget             
    */
  def closeDropDown(focus: Boolean): Unit = js.native
  /**
    * 
    * @param val1             
    * @param val2             
    */
  def compare(val1: Date, val2: Date): js.Any = js.native
  /**
    * Formats the value as a Date, according to specified locale (second argument)
    * 
    * @param value             
    * @param constraints An object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default            
    */
  def format(value: Date, constraints: js.Object): js.Any = js.native
  @JSName("get")
  def get_autoWidth(property: autoWidth): Boolean = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): String = js.native
  @JSName("get")
  def get_dropDown(property: dropDown): js.Object = js.native
  @JSName("get")
  def get_dropDownDefaultValue(property: dropDownDefaultValue): Date = js.native
  @JSName("get")
  def get_dropDownPosition(property: dropDownPosition): js.Object = js.native
  @JSName("get")
  def get_forceWidth(property: forceWidth): Boolean = js.native
  @JSName("get")
  def get_hasDownArrow(property: hasDownArrow): Boolean = js.native
  @JSName("get")
  def get_maxHeight(property: maxHeight): Double = js.native
  @JSName("get")
  def get_popupClass(property: popupClass): js.Any = js.native
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    * 
    */
  /**
    * Returns true if the dropdown exists and it's data is loaded.  This can
    * be overridden in order to force a call to loadDropDown().
    * 
    */
  def isLoaded(): Boolean = js.native
  /**
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MDateTimeTextBox_(isFocused: Boolean): js.Any = js.native
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and
    * then opens the drop down.  This is basically a callback when the
    * user presses the down arrow button to open the drop down.
    * 
    */
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and
    * then opens the drop down.  This is basically a callback when the
    * user presses the down arrow button to open the drop down.
    * 
    */
  def loadAndOpenDropDown(): js.Any = js.native
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and then calls
    * the given callback.
    * 
    * @param loadCallback             
    */
  /**
    * Creates the drop down if it doesn't exist, loads the data
    * if there's an href and it hasn't been loaded yet, and then calls
    * the given callback.
    * 
    * @param loadCallback             
    */
  def loadDropDown(loadCallback: js.Function): Unit = js.native
  /**
    * Opens the dropdown for this widget.   To be called only when this.dropDown
    * has been created and is ready to display (ie, it's data is loaded).
    * 
    */
  def openDropDown(): js.Any = js.native
  def openDropDown(callback: js.Function): Unit = js.native
  /**
    * 
    * @param callback             
    */
  @JSName("openDropDown")
  def openDropDown_Unit(): Unit = js.native
  /**
    * Builds the regular needed to parse a localized date
    * 
    * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default            
    */
  @JSName("pattern")
  def pattern_MDateTimeTextBox_(options: js.Object): js.Any = js.native
  @JSName("set")
  def set_autoWidth(property: autoWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: String): Unit = js.native
  @JSName("set")
  def set_dropDown(property: dropDown, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dropDownDefaultValue(property: dropDownDefaultValue, value: Date): Unit = js.native
  @JSName("set")
  def set_dropDownPosition(property: dropDownPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_forceWidth(property: forceWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hasDownArrow(property: hasDownArrow, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxHeight(property: maxHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_popupClass(property: popupClass, value: js.Any): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Date): Unit = js.native
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    * 
    */
  /**
    * Callback when the user presses the down arrow button or presses
    * the down arrow key to open/close the drop down.
    * Toggle the drop-down widget; if it is up, close it, if not, open it
    * 
    */
  def toggleDropDown(): Unit = js.native
  @JSName("watch")
  def watch_autoWidth(
    property: autoWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datePackage(
    property: datePackage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDown(
    property: dropDown,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDownDefaultValue(
    property: dropDownDefaultValue,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDownPosition(
    property: dropDownPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_forceWidth(
    property: forceWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hasDownArrow(
    property: hasDownArrow,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maxHeight(
    property: maxHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_popupClass(
    property: popupClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

