package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Time. For documentation of this class, see java.sql.Time
  * .
  */
@js.native
trait JdbcTime extends js.Object {
  def after(when: JdbcTime): Boolean = js.native
  def before(when: JdbcTime): Boolean = js.native
  def getHours(): Integer = js.native
  def getMinutes(): Integer = js.native
  def getSeconds(): Integer = js.native
  def getTime(): Integer = js.native
  def setHours(hours: Integer): Unit = js.native
  def setMinutes(minutes: Integer): Unit = js.native
  def setSeconds(seconds: Integer): Unit = js.native
  def setTime(milliseconds: Integer): Unit = js.native
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
  @scala.inline
  implicit class JdbcTimeOps[Self <: JdbcTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfter(value: JdbcTime => Boolean): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def setBefore(value: JdbcTime => Boolean): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHours(value: () => Integer): Self = this.set("getHours", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinutes(value: () => Integer): Self = this.set("getMinutes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSeconds(value: () => Integer): Self = this.set("getSeconds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTime(value: () => Integer): Self = this.set("getTime", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHours(value: Integer => Unit): Self = this.set("setHours", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinutes(value: Integer => Unit): Self = this.set("setMinutes", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSeconds(value: Integer => Unit): Self = this.set("setSeconds", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTime(value: Integer => Unit): Self = this.set("setTime", js.Any.fromFunction1(value))
  }
  
}

