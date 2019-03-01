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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("getHours")(getHours)
    __obj.updateDynamic("getMinutes")(getMinutes)
    __obj.updateDynamic("getSeconds")(getSeconds)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("setHours")(setHours)
    __obj.updateDynamic("setMinutes")(setMinutes)
    __obj.updateDynamic("setSeconds")(setSeconds)
    __obj.updateDynamic("setTime")(setTime)
    __obj.asInstanceOf[JdbcTime]
  }
}

