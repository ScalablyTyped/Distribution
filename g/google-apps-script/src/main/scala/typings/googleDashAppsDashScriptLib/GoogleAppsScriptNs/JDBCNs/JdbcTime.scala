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
    after: js.Function1[JdbcTime, scala.Boolean],
    before: js.Function1[JdbcTime, scala.Boolean],
    getHours: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMinutes: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getSeconds: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTime: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    setHours: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setMinutes: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setSeconds: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit],
    setTime: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit]
  ): JdbcTime = {
    val __obj = js.Dynamic.literal(after = after, before = before, getHours = getHours, getMinutes = getMinutes, getSeconds = getSeconds, getTime = getTime, setHours = setHours, setMinutes = setMinutes, setSeconds = setSeconds, setTime = setTime)
  
    __obj.asInstanceOf[JdbcTime]
  }
}

