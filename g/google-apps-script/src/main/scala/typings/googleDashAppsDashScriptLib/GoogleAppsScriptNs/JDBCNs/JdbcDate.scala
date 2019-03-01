package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcDate extends js.Object {
  def after(when: JdbcDate): scala.Boolean
  def before(when: JdbcDate): scala.Boolean
  def getDate(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMonth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTime(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getYear(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setDate(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setMonth(month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setTime(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setYear(year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
}

object JdbcDate {
  @scala.inline
  def apply(
    after: js.Function1[JdbcDate, scala.Boolean],
    before: js.Function1[JdbcDate, scala.Boolean],
    getDate: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMonth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTime: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getYear: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setDate: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setMonth: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setTime: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setYear: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit]
  ): JdbcDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getMonth")(getMonth)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getYear")(getYear)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setMonth")(setMonth)
    __obj.updateDynamic("setTime")(setTime)
    __obj.updateDynamic("setYear")(setYear)
    __obj.asInstanceOf[JdbcDate]
  }
}

