package typings.dojo.dojox.date.hebrew

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/numerals.html
  *
  *
  */
trait numerals extends js.Object {
  /**
    * converts an integer to a String representing the number in Hebrew numerals.
    * Can be formatted with or without geresh ×³
    *
    * @param day
    * @param nogrsh               Optional
    */
  def getDayHebrewLetters(day: js.Any, nogrsh: Boolean): Unit
  /**
    * converts an integer representing a  month to a String written in Hebrew numerals
    *
    * @param month
    */
  def getMonthHebrewLetters(month: Double): Unit
  /**
    * converts the year from an integer to Hebrew numerals.
    *
    * @param year
    */
  def getYearHebrewLetters(year: Double): Unit
  /**
    * converts the string containing a Hebrew numeral to an integer
    *
    * @param day
    */
  def parseDayHebrewLetters(day: String): Unit
  /**
    * converts a Hebrew numeral string representing
    * a month to an integer.  The returned value
    * is indexed in the month name array.  To use it for
    * setMonth, do correction for leap year
    *
    * @param monthStr
    */
  def parseMonthHebrewLetters(monthStr: String): Unit
  /**
    * converts the year written in Hebrew numerals to an integer
    *
    * @param year
    */
  def parseYearHebrewLetters(year: String): Unit
}

object numerals {
  @scala.inline
  def apply(
    getDayHebrewLetters: (js.Any, Boolean) => Unit,
    getMonthHebrewLetters: Double => Unit,
    getYearHebrewLetters: Double => Unit,
    parseDayHebrewLetters: String => Unit,
    parseMonthHebrewLetters: String => Unit,
    parseYearHebrewLetters: String => Unit
  ): numerals = {
    val __obj = js.Dynamic.literal(getDayHebrewLetters = js.Any.fromFunction2(getDayHebrewLetters), getMonthHebrewLetters = js.Any.fromFunction1(getMonthHebrewLetters), getYearHebrewLetters = js.Any.fromFunction1(getYearHebrewLetters), parseDayHebrewLetters = js.Any.fromFunction1(parseDayHebrewLetters), parseMonthHebrewLetters = js.Any.fromFunction1(parseMonthHebrewLetters), parseYearHebrewLetters = js.Any.fromFunction1(parseYearHebrewLetters))
    __obj.asInstanceOf[numerals]
  }
}

