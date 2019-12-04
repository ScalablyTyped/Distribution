package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.selector
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/MonthTextBox.html
  *
  * A validating, serializable, range-bound date text box with a popup calendar that contains only months
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.MonthTextBox")
@js.native
class MonthTextBox () extends DateTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var selector: String = js.native
  /**
    *
    * @param value
    */
  def format(value: js.Any): Double = js.native
  @JSName("get")
  def get_selector(property: selector): String = js.native
  /**
    *
    * @param isFocused
    */
  @JSName("isValid")
  def isValid_MMonthTextBox(isFocused: Boolean): js.Any = js.native
  /**
    *
    * @param value
    * @param constraints
    */
  def parse(value: js.Any, constraints: js.Any): Double = js.native
  /**
    * Builds the regular needed to parse a localized date
    *
    * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default
    */
  @JSName("pattern")
  def pattern_MMonthTextBox(options: js.Object): js.Any = js.native
  /**
    * The popup widget to use. In this case, a calendar with just a Month view.
    *
    */
  @JSName("popupClass")
  def popupClass_MMonthTextBox(): Unit = js.native
  /**
    *
    * @param value
    * @param constraints
    */
  def serialize(value: js.Any, constraints: js.Any): js.Any = js.native
  @JSName("set")
  def set_selector(property: selector, value: String): Unit = js.native
  /**
    *
    * @param value
    */
  def validator(value: js.Any): Boolean = js.native
  @JSName("watch")
  def watch_selector(
    property: selector,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

