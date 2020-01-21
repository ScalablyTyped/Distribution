package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
trait JdbcDate extends js.Object {
  def after(when: JdbcDate): Boolean
  def before(when: JdbcDate): Boolean
  def getDate(): Integer
  def getMonth(): Integer
  def getTime(): Integer
  def getYear(): Integer
  def setDate(date: Integer): Unit
  def setMonth(month: Integer): Unit
  def setTime(milliseconds: Integer): Unit
  def setYear(year: Integer): Unit
}

object JdbcDate {
  @scala.inline
  def apply(
    after: JdbcDate => Boolean,
    before: JdbcDate => Boolean,
    getDate: () => Integer,
    getMonth: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setMonth: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcDate = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getMonth = js.Any.fromFunction0(getMonth), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setMonth = js.Any.fromFunction1(setMonth), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
  
    __obj.asInstanceOf[JdbcDate]
  }
}

