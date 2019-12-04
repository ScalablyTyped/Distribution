package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/dates.html
  *
  *
  */
trait dates extends js.Object {
  /**
    * Formats a date according to the given format
    *
    * @param value
    * @param arg
    */
  def date(value: js.Any, arg: js.Any): String
  /**
    * Formats a time according to the given format
    *
    * @param value
    * @param arg
    */
  def time(value: js.Any, arg: js.Any): String
  /**
    * Formats a date as the time since that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timesince(value: js.Any, arg: js.Any): String
  /**
    * Formats a date as the time until that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timeuntil(value: js.Any, arg: js.Any): String
}

object dates {
  @scala.inline
  def apply(
    date: (js.Any, js.Any) => String,
    time: (js.Any, js.Any) => String,
    timesince: (js.Any, js.Any) => String,
    timeuntil: (js.Any, js.Any) => String
  ): dates = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction2(date), time = js.Any.fromFunction2(time), timesince = js.Any.fromFunction2(timesince), timeuntil = js.Any.fromFunction2(timeuntil))
  
    __obj.asInstanceOf[dates]
  }
}

