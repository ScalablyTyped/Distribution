package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Time. For documentation of this class, see java.sql.Time
  * .
  */
trait JdbcTime extends js.Object {
  def after(when: JdbcTime): Boolean
  def before(when: JdbcTime): Boolean
  def getHours(): Integer
  def getMinutes(): Integer
  def getSeconds(): Integer
  def getTime(): Integer
  def setHours(hours: Integer): Unit
  def setMinutes(minutes: Integer): Unit
  def setSeconds(seconds: Integer): Unit
  def setTime(milliseconds: Integer): Unit
}

object JdbcTime {
  @scala.inline
  def apply(
    after: JdbcTime => Boolean,
    before: JdbcTime => Boolean,
    getHours: () => Integer,
    getMinutes: () => Integer,
    getSeconds: () => Integer,
    getTime: () => Integer,
    setHours: Integer => Unit,
    setMinutes: Integer => Unit,
    setSeconds: Integer => Unit,
    setTime: Integer => Unit
  ): JdbcTime = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime))
    __obj.asInstanceOf[JdbcTime]
  }
}

