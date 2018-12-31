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

