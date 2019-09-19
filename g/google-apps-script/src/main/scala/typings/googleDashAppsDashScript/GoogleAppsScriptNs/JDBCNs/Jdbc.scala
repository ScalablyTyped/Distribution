package typings.googleDashAppsDashScript.GoogleAppsScriptNs.JDBCNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jdbc extends js.Object {
  def getCloudSqlConnection(url: String): JdbcConnection = js.native
  def getCloudSqlConnection(url: String, info: CloudSqlAdvancedParameters): JdbcConnection = js.native
  def getCloudSqlConnection(url: String, userName: String, password: String): JdbcConnection = js.native
  def getConnection(url: String): JdbcConnection = js.native
  def getConnection(url: String, info: ConnectionAdvancedParameters): JdbcConnection = js.native
  def getConnection(url: String, userName: String, password: String): JdbcConnection = js.native
  def newDate(milliseconds: Integer): JdbcDate = js.native
  def newTime(milliseconds: Integer): JdbcTime = js.native
  def newTimestamp(milliseconds: Integer): JdbcTimestamp = js.native
  def parseDate(date: String): JdbcDate = js.native
  def parseTime(time: String): JdbcTime = js.native
  def parseTimestamp(timestamp: String): JdbcTimestamp = js.native
}

