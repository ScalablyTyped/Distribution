package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcTime extends js.Object {
  def after(when: JdbcTime): scala.Boolean
  def before(when: JdbcTime): scala.Boolean
  def getHours(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMinutes(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSeconds(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTime(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def setHours(hours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setMinutes(minutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setSeconds(seconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
  def setTime(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
}

object JdbcTime {
  @scala.inline
  def apply(
    after: JdbcTime => scala.Boolean,
    before: JdbcTime => scala.Boolean,
    getHours: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMinutes: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSeconds: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTime: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    setHours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setMinutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setSeconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit,
    setTime: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit
  ): JdbcTime = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime))
  
    __obj.asInstanceOf[JdbcTime]
  }
}

