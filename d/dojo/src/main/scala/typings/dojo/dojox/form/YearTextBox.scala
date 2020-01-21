package typings.dojo.dojox.form

import typings.dojo.dojo.date.locale.FormatOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/YearTextBox.html
  *
  * A validating, serializable, range-bound date text box with a popup calendar that contains only years
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.YearTextBox")
@js.native
class YearTextBox () extends DateTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    * @param value
    */
  def format(value: js.Any): js.Any = js.native
  /**
    *
    * @param isFocused
    */
  @JSName("isValid")
  def isValid_MYearTextBox(isFocused: Boolean): js.Any = js.native
  /**
    *
    * @param value
    * @param constraints
    */
  def parse(value: String, constraints: FormatOptions): String = js.native
  /**
    * Builds the regular needed to parse a localized date
    *
    * @param options               OptionalAn object with the following properties:selector (String): choice of 'time','date' (default: date and time)formatLength (String): choice of long, short, medium or full (plus any custom additions).  Defaults to 'short'datePattern (String): override pattern with this stringtimePattern (String): override pattern with this stringam (String): override strings for am in timespm (String): override strings for pm in timeslocale (String): override the locale used to determine formatting rulesfullYear (Boolean): (format only) use 4 digit years whenever 2 digit years are called forstrict (Boolean): (parse only) strict parsing, off by default
    */
  @JSName("pattern")
  def pattern_MYearTextBox(options: js.Object): js.Any = js.native
  /**
    *
    */
  @JSName("popupClass")
  def popupClass_MYearTextBox(): Unit = js.native
  /**
    *
    * @param value
    */
  def validator(value: js.Any): Boolean = js.native
}

