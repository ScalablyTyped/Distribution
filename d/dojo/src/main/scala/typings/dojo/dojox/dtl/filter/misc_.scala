package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/misc.html
  *
  *
  */
@JSName("misc")
trait misc_ extends js.Object {
  /**
    * Format the value like a 'human-readable' file size (i.e. 13 KB, 4.1 MB, 102bytes, etc).
    *
    * @param value
    */
  def filesizeformat(value: js.Any): String
  /**
    * Takes a phone number and converts it in to its numerical equivalent
    *
    * @param value
    */
  def phone2numeric(value: js.Any): String
  /**
    * Returns a plural suffix if the value is not 1, for '1 vote' vs. '2 votes'
    * By default, 's' is used as a suffix; if an argument is provided, that string
    * is used instead. If the provided argument contains a comma, the text before
    * the comma is used for the singular case.
    *
    * @param value
    * @param arg
    */
  def pluralize(value: js.Any, arg: js.Any): String
  /**
    * A wrapper around toJson unless something better comes along
    *
    * @param value
    */
  def pprint(value: js.Any): js.Any
}

object misc_ {
  @scala.inline
  def apply(
    filesizeformat: js.Any => String,
    phone2numeric: js.Any => String,
    pluralize: (js.Any, js.Any) => String,
    pprint: js.Any => js.Any
  ): misc_ = {
    val __obj = js.Dynamic.literal(filesizeformat = js.Any.fromFunction1(filesizeformat), phone2numeric = js.Any.fromFunction1(phone2numeric), pluralize = js.Any.fromFunction2(pluralize), pprint = js.Any.fromFunction1(pprint))
  
    __obj.asInstanceOf[misc_]
  }
}

