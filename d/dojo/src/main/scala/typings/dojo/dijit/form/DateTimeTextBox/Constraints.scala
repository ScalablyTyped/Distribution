package typings.dojo.dijit.form.DateTimeTextBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_DateTimeTextBox.__Constraints.html
  *
  * Specifies both the rules on valid/invalid values (first/last date/time allowed),
  * and also formatting options for how the date/time is displayed.
  * 
  */
@JSGlobal("dijit.form._DateTimeTextBox.__Constraints")
@js.native
class Constraints () extends js.Object {
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
    * Maximum signed value.  Default is +Infinity
    * 
    */
  var max: Double = js.native
  /**
    * Minimum signed value.  Default is -Infinity
    * 
    */
  var min: Double = js.native
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

