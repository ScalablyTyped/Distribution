package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
trait JdbcTimestamp extends js.Object {
  def after(when: JdbcTimestamp): Boolean
  def before(when: JdbcTimestamp): Boolean
  def getDate(): Integer
  def getHours(): Integer
  def getMinutes(): Integer
  def getMonth(): Integer
  def getNanos(): Integer
  def getSeconds(): Integer
  def getTime(): Integer
  def getYear(): Integer
  def setDate(date: Integer): Unit
  def setHours(hours: Integer): Unit
  def setMinutes(minutes: Integer): Unit
  def setMonth(month: Integer): Unit
  def setNanos(nanoseconds: Integer): Unit
  def setSeconds(seconds: Integer): Unit
  def setTime(milliseconds: Integer): Unit
  def setYear(year: Integer): Unit
}

object JdbcTimestamp {
  @scala.inline
  def apply(
    after: JdbcTimestamp => Boolean,
    before: JdbcTimestamp => Boolean,
    getDate: () => Integer,
    getHours: () => Integer,
    getMinutes: () => Integer,
    getMonth: () => Integer,
    getNanos: () => Integer,
    getSeconds: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setHours: Integer => Unit,
    setMinutes: Integer => Unit,
    setMonth: Integer => Unit,
    setNanos: Integer => Unit,
    setSeconds: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getNanos = js.Any.fromFunction0(getNanos), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setNanos = js.Any.fromFunction1(setNanos), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
  
    __obj.asInstanceOf[JdbcTimestamp]
  }
}

