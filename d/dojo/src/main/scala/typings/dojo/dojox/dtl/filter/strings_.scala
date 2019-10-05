package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/strings.html
  *
  *
  */
@JSName("strings")
trait strings_ extends js.Object {
  /**
    * Adds slashes - useful for passing strings to JavaScript, for example.
    *
    * @param value
    */
  def addslashes(value: js.Any): js.Any
  /**
    * Capitalizes the first character of the value
    *
    * @param value
    */
  def capfirst(value: js.Any): Double
  /**
    * Centers the value in a field of a given width
    *
    * @param value
    * @param arg
    */
  def center(value: js.Any, arg: js.Any): String
  /**
    * Removes all values of arg from the given string
    *
    * @param value
    * @param arg
    */
  def cut(value: js.Any, arg: js.Any): js.Any
  /**
    * Replaces ampersands with &amp; entities
    *
    * @param value
    */
  def fix_ampersands(value: js.Any): js.Any
  /**
    * Format a number according to arg
    * If called without an argument, displays a floating point
    * number as 34.2 -- but only if there's a point to be displayed.
    * With a positive numeric argument, it displays that many decimal places
    * always.
    * With a negative numeric argument, it will display that many decimal
    * places -- but only if there's places to be displayed.
    *
    * @param value
    * @param arg
    */
  def floatformat(value: js.Any, arg: js.Any): js.Any
  /**
    *
    * @param value
    */
  def iriencode(value: js.Any): js.Any
  /**
    * Displays text with line numbers
    *
    * @param value
    */
  def linenumbers(value: js.Any): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def ljust(value: js.Any, arg: js.Any): String
  /**
    * Converts a string into all lowercase
    *
    * @param value
    */
  def lower(value: js.Any): js.Any
  /**
    * Returns the value turned into a list. For an integer, it's a list of
    * digits. For a string, it's a list of characters.
    *
    * @param value
    */
  def make_list(value: js.Any): js.Array[_]
  /**
    *
    * @param value
    * @param arg
    */
  def rjust(value: js.Any, arg: js.Any): String
  /**
    * Converts to lowercase, removes
    * non-alpha chars and converts spaces to hyphens
    *
    * @param value
    */
  def slugify(value: js.Any): js.Any
  /**
    * Formats the variable according to the argument, a string formatting specifier.
    * This specifier uses Python string formatting syntax, with the exception that
    * the leading "%" is dropped.
    *
    * @param value
    * @param arg
    */
  def stringformat(value: js.Any, arg: js.Any): js.Any
  /**
    * Converts a string into titlecase
    *
    * @param value
    */
  def title(value: js.Any): String
  /**
    * Truncates a string after a certain number of words
    *
    * @param value
    * @param arg Number of words to truncate after
    */
  def truncatewords(value: js.Any, arg: Double): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def truncatewords_html(value: js.Any, arg: js.Any): String
  /**
    *
    * @param value
    */
  def upper(value: js.Any): js.Any
  /**
    *
    * @param value
    */
  def urlencode(value: js.Any): js.Any
  /**
    *
    * @param value
    */
  def urlize(value: js.Any): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def urlizetrunc(value: js.Any, arg: js.Any): js.Any
  /**
    *
    * @param value
    */
  def wordcount(value: js.Any): Double
  /**
    *
    * @param value alias name: 'cent', 'pound' ..
    * @param arg
    */
  def wordwrap(value: String, arg: js.Any): js.Any
}

object strings_ {
  @scala.inline
  def apply(
    addslashes: js.Any => js.Any,
    capfirst: js.Any => Double,
    center: (js.Any, js.Any) => String,
    cut: (js.Any, js.Any) => js.Any,
    fix_ampersands: js.Any => js.Any,
    floatformat: (js.Any, js.Any) => js.Any,
    iriencode: js.Any => js.Any,
    linenumbers: js.Any => js.Any,
    ljust: (js.Any, js.Any) => String,
    lower: js.Any => js.Any,
    make_list: js.Any => js.Array[_],
    rjust: (js.Any, js.Any) => String,
    slugify: js.Any => js.Any,
    stringformat: (js.Any, js.Any) => js.Any,
    title: js.Any => String,
    truncatewords: (js.Any, Double) => js.Any,
    truncatewords_html: (js.Any, js.Any) => String,
    upper: js.Any => js.Any,
    urlencode: js.Any => js.Any,
    urlize: js.Any => js.Any,
    urlizetrunc: (js.Any, js.Any) => js.Any,
    wordcount: js.Any => Double,
    wordwrap: (String, js.Any) => js.Any
  ): strings_ = {
    val __obj = js.Dynamic.literal(addslashes = js.Any.fromFunction1(addslashes), capfirst = js.Any.fromFunction1(capfirst), center = js.Any.fromFunction2(center), cut = js.Any.fromFunction2(cut), fix_ampersands = js.Any.fromFunction1(fix_ampersands), floatformat = js.Any.fromFunction2(floatformat), iriencode = js.Any.fromFunction1(iriencode), linenumbers = js.Any.fromFunction1(linenumbers), ljust = js.Any.fromFunction2(ljust), lower = js.Any.fromFunction1(lower), make_list = js.Any.fromFunction1(make_list), rjust = js.Any.fromFunction2(rjust), slugify = js.Any.fromFunction1(slugify), stringformat = js.Any.fromFunction2(stringformat), title = js.Any.fromFunction1(title), truncatewords = js.Any.fromFunction2(truncatewords), truncatewords_html = js.Any.fromFunction2(truncatewords_html), upper = js.Any.fromFunction1(upper), urlencode = js.Any.fromFunction1(urlencode), urlize = js.Any.fromFunction1(urlize), urlizetrunc = js.Any.fromFunction2(urlizetrunc), wordcount = js.Any.fromFunction1(wordcount), wordwrap = js.Any.fromFunction2(wordwrap))
  
    __obj.asInstanceOf[strings_]
  }
}

