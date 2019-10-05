package typings.dojo.dojox.main

import typings.dojo.dojox.date.persian.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.persian.html
  *
  *
  */
trait persian extends js.Object {
  /**
    *
    */
  var locale: js.Object
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): Unit
  /**
    * Compare two persian date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param date1
    * @param date2 If not specified, the current persian.Date is used.
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(date1: Date, date2: Date, portion: String): Unit
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current dojox.date.persian.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date, date2: Date, interval: String): Unit
  /**
    *
    * @param month
    */
  def getDaysInMonth(month: Date): Unit
}

object persian {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Unit,
    compare: (Date, Date, String) => Unit,
    difference: (Date, Date, String) => Unit,
    getDaysInMonth: Date => Unit,
    locale: js.Object
  ): persian = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), compare = js.Any.fromFunction3(compare), difference = js.Any.fromFunction3(difference), getDaysInMonth = js.Any.fromFunction1(getDaysInMonth), locale = locale)
  
    __obj.asInstanceOf[persian]
  }
}

