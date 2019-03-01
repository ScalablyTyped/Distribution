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
    after: js.Function1[JdbcTimestamp, scala.Boolean],
    before: js.Function1[JdbcTimestamp, scala.Boolean],
    getDate: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getHours: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMinutes: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMonth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getNanos: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getSeconds: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTime: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getYear: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setDate: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setHours: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setMinutes: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setMonth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setNanos: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setSeconds: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setTime: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setYear: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit]
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getHours")(getHours)
    __obj.updateDynamic("getMinutes")(getMinutes)
    __obj.updateDynamic("getMonth")(getMonth)
    __obj.updateDynamic("getNanos")(getNanos)
    __obj.updateDynamic("getSeconds")(getSeconds)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getYear")(getYear)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setHours")(setHours)
    __obj.updateDynamic("setMinutes")(setMinutes)
    __obj.updateDynamic("setMonth")(setMonth)
    __obj.updateDynamic("setNanos")(setNanos)
    __obj.updateDynamic("setSeconds")(setSeconds)
    __obj.updateDynamic("setTime")(setTime)
    __obj.updateDynamic("setYear")(setYear)
    __obj.asInstanceOf[JdbcTimestamp]
  }
}

