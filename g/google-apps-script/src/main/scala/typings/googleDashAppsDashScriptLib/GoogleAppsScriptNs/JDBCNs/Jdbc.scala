package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jdbc extends js.Object {
  def getCloudSqlConnection(url: java.lang.String): JdbcConnection = js.native
  def getCloudSqlConnection(url: java.lang.String, info: js.Object): JdbcConnection = js.native
  def getCloudSqlConnection(url: java.lang.String, userName: java.lang.String, password: java.lang.String): JdbcConnection = js.native
  def getConnection(url: java.lang.String): JdbcConnection = js.native
  def getConnection(url: java.lang.String, info: js.Object): JdbcConnection = js.native
  def getConnection(url: java.lang.String, userName: java.lang.String, password: java.lang.String): JdbcConnection = js.native
  def newDate(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcDate = js.native
  def newTime(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcTime = js.native
  def newTimestamp(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcTimestamp = js.native
  def parseDate(date: java.lang.String): JdbcDate = js.native
  def parseTime(time: java.lang.String): JdbcTime = js.native
  def parseTimestamp(timestamp: java.lang.String): JdbcTimestamp = js.native
}

