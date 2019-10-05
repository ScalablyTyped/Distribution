package typings.dojo.dojox.form

import typings.dojo.Fn_Boolean
import typings.dojo.dijit.form._Spinner
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/TimeSpinner.html
  *
  * Time Spinner
  * This widget is the same as a normal NumberSpinner, but for the time component of a date object instead
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.
  */
@JSGlobal("dojox.form.TimeSpinner")
@js.native
class TimeSpinner () extends _Spinner {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  @JSName("isValid")
  var isValid_Original_TimeSpinner: Fn_Boolean = js.native
  /**
    *
    * @param time
    * @param locale
    */
  def format(time: js.Any, locale: js.Any): js.Any = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MTimeSpinner(): Boolean = js.native
  /**
    *
    * @param time
    * @param locale
    */
  def parse(time: js.Any, locale: js.Any): js.Any = js.native
  /**
    * Format a Date object as a string according a subset of the ISO-8601 standard
    * When options.selector is omitted, output follows RFC3339
    * The local time zone is included as an offset from GMT, except when selector=='time' (time without a date)
    * Does not check bounds.  Only years between 100 and 9999 are supported.
    *
    * @param dateObject A Date object
    * @param options               OptionalAn object with the following properties:selector (String): "date" or "time" for partial formatting of the Date object.Both date and time will be formatted by default.zulu (Boolean): if true, UTC/GMT is used for a timezonemilliseconds (Boolean): if true, output milliseconds
    */
  def serialize(dateObject: Date, options: js.Object): js.Any = js.native
}

