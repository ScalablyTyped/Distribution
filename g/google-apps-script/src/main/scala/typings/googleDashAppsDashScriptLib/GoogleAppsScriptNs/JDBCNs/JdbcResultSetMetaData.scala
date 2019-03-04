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
    getCatalogName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getColumnClassName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getColumnCount: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getColumnDisplaySize: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getColumnLabel: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getColumnName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getColumnType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getColumnTypeName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getPrecision: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getScale: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    getSchemaName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    getTableName: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, java.lang.String],
    isAutoIncrement: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isCaseSensitive: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isCurrency: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isDefinitelyWritable: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isNullable: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
    ],
    isReadOnly: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isSearchable: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isSigned: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    isWritable: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean]
  ): JdbcResultSetMetaData = {
    val __obj = js.Dynamic.literal(getCatalogName = getCatalogName, getColumnClassName = getColumnClassName, getColumnCount = getColumnCount, getColumnDisplaySize = getColumnDisplaySize, getColumnLabel = getColumnLabel, getColumnName = getColumnName, getColumnType = getColumnType, getColumnTypeName = getColumnTypeName, getPrecision = getPrecision, getScale = getScale, getSchemaName = getSchemaName, getTableName = getTableName, isAutoIncrement = isAutoIncrement, isCaseSensitive = isCaseSensitive, isCurrency = isCurrency, isDefinitelyWritable = isDefinitelyWritable, isNullable = isNullable, isReadOnly = isReadOnly, isSearchable = isSearchable, isSigned = isSigned, isWritable = isWritable)
  
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
}

