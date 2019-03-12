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
    after: JdbcDate => scala.Boolean,
    before: JdbcDate => scala.Boolean,
    getDate: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMonth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTime: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getYear: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setDate: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setMonth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setTime: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setYear: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit
  ): JdbcDate = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getMonth = js.Any.fromFunction0(getMonth), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setMonth = js.Any.fromFunction1(setMonth), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
  
    __obj.asInstanceOf[JdbcDate]
  }
}

