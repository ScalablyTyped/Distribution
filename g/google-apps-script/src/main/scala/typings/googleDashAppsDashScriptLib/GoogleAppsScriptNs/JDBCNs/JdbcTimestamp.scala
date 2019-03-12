package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcTimestamp extends js.Object {
  def after(when: JdbcTimestamp): scala.Boolean
  def before(when: JdbcTimestamp): scala.Boolean
  def getDate(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getHours(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMinutes(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMonth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getNanos(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSeconds(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTime(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getYear(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setDate(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setHours(hours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setMinutes(minutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setMonth(month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setNanos(nanoseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setSeconds(seconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setTime(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setYear(year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
}

object JdbcTimestamp {
  @scala.inline
  def apply(
    after: JdbcTimestamp => scala.Boolean,
    before: JdbcTimestamp => scala.Boolean,
    getDate: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getHours: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMinutes: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMonth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getNanos: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSeconds: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTime: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getYear: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setDate: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setHours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setMinutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setMonth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setNanos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setSeconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setTime: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setYear: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getNanos = js.Any.fromFunction0(getNanos), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setNanos = js.Any.fromFunction1(setNanos), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
  
    __obj.asInstanceOf[JdbcTimestamp]
  }
}

