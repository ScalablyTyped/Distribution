package typings.dojo.dojo.date.locale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/date/locale.__FormatOptions.html
  *
  *
  */
@JSGlobal("dojo.date.locale.__FormatOptions")
@js.native
class FormatOptions () extends js.Object {
  /**
    * override strings for am in times
    *
    */
  var am: String = js.native
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

