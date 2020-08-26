package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
@js.native
trait JdbcDate extends js.Object {
  def after(when: JdbcDate): Boolean = js.native
  def before(when: JdbcDate): Boolean = js.native
  def getDate(): Integer = js.native
  def getMonth(): Integer = js.native
  def getTime(): Integer = js.native
  def getYear(): Integer = js.native
  def setDate(date: Integer): Unit = js.native
  def setMonth(month: Integer): Unit = js.native
  def setTime(milliseconds: Integer): Unit = js.native
  def setYear(year: Integer): Unit = js.native
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
  @scala.inline
  implicit class JdbcDateOps[Self <: JdbcDate] (val x: Self) extends AnyVal {
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
    def setAfter(value: JdbcDate => Boolean): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def setBefore(value: JdbcDate => Boolean): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDate(value: () => Integer): Self = this.set("getDate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonth(value: () => Integer): Self = this.set("getMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTime(value: () => Integer): Self = this.set("getTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYear(value: () => Integer): Self = this.set("getYear", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDate(value: Integer => Unit): Self = this.set("setDate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMonth(value: Integer => Unit): Self = this.set("setMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTime(value: Integer => Unit): Self = this.set("setTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetYear(value: Integer => Unit): Self = this.set("setYear", js.Any.fromFunction1(value))
  }
  
}

