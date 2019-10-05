package typings.dojo.dojox.main

import typings.dojo.dojox.date.buddhist.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.buddhist.html
  *
  *
  */
trait buddhist extends js.Object {
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
    * Compare two buddhist date objects by date, time, or both.
    *
    * @param date1
    * @param date2
    * @param portion               Optional
    */
  def compare(date1: Date, date2: Date, portion: String): Unit
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current hebrew.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(
    date1: typings.dojo.dojox.date.hebrew.Date,
    date2: typings.dojo.dojox.date.hebrew.Date,
    interval: String
  ): Unit
  /**
    *
    * @param dateObject
    */
  def getDaysInMonth(dateObject: Date): Unit
  /**
    *
    * @param dateObject
    */
  def isLeapYear(dateObject: Date): Unit
}

object buddhist {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Unit,
    compare: (Date, Date, String) => Unit,
    difference: (typings.dojo.dojox.date.hebrew.Date, typings.dojo.dojox.date.hebrew.Date, String) => Unit,
    getDaysInMonth: Date => Unit,
    isLeapYear: Date => Unit,
    locale: js.Object
  ): buddhist = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), compare = js.Any.fromFunction3(compare), difference = js.Any.fromFunction3(difference), getDaysInMonth = js.Any.fromFunction1(getDaysInMonth), isLeapYear = js.Any.fromFunction1(isLeapYear), locale = locale)
  
    __obj.asInstanceOf[buddhist]
  }
}

