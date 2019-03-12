package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcResultSetMetaData extends js.Object {
  def getCatalogName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getColumnClassName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getColumnCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getColumnDisplaySize(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getColumnLabel(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getColumnName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getColumnType(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getColumnTypeName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getPrecision(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getScale(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSchemaName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getTableName(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def isAutoIncrement(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isCaseSensitive(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isCurrency(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isDefinitelyWritable(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isNullable(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isReadOnly(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isSearchable(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isSigned(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def isWritable(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
}

object JdbcResultSetMetaData {
  @scala.inline
  def apply(
    getCatalogName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getColumnClassName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getColumnCount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getColumnDisplaySize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getColumnLabel: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getColumnName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getColumnType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getColumnTypeName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getPrecision: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getScale: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSchemaName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getTableName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    isAutoIncrement: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isCaseSensitive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isCurrency: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isDefinitelyWritable: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isNullable: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isReadOnly: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isSearchable: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isSigned: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    isWritable: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean
  ): JdbcResultSetMetaData = {
    val __obj = js.Dynamic.literal(getCatalogName = js.Any.fromFunction1(getCatalogName), getColumnClassName = js.Any.fromFunction1(getColumnClassName), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumnDisplaySize = js.Any.fromFunction1(getColumnDisplaySize), getColumnLabel = js.Any.fromFunction1(getColumnLabel), getColumnName = js.Any.fromFunction1(getColumnName), getColumnType = js.Any.fromFunction1(getColumnType), getColumnTypeName = js.Any.fromFunction1(getColumnTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), getSchemaName = js.Any.fromFunction1(getSchemaName), getTableName = js.Any.fromFunction1(getTableName), isAutoIncrement = js.Any.fromFunction1(isAutoIncrement), isCaseSensitive = js.Any.fromFunction1(isCaseSensitive), isCurrency = js.Any.fromFunction1(isCurrency), isDefinitelyWritable = js.Any.fromFunction1(isDefinitelyWritable), isNullable = js.Any.fromFunction1(isNullable), isReadOnly = js.Any.fromFunction1(isReadOnly), isSearchable = js.Any.fromFunction1(isSearchable), isSigned = js.Any.fromFunction1(isSigned), isWritable = js.Any.fromFunction1(isWritable))
  
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
}

