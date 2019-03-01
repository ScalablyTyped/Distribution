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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCatalogName")(getCatalogName)
    __obj.updateDynamic("getColumnClassName")(getColumnClassName)
    __obj.updateDynamic("getColumnCount")(getColumnCount)
    __obj.updateDynamic("getColumnDisplaySize")(getColumnDisplaySize)
    __obj.updateDynamic("getColumnLabel")(getColumnLabel)
    __obj.updateDynamic("getColumnName")(getColumnName)
    __obj.updateDynamic("getColumnType")(getColumnType)
    __obj.updateDynamic("getColumnTypeName")(getColumnTypeName)
    __obj.updateDynamic("getPrecision")(getPrecision)
    __obj.updateDynamic("getScale")(getScale)
    __obj.updateDynamic("getSchemaName")(getSchemaName)
    __obj.updateDynamic("getTableName")(getTableName)
    __obj.updateDynamic("isAutoIncrement")(isAutoIncrement)
    __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    __obj.updateDynamic("isCurrency")(isCurrency)
    __obj.updateDynamic("isDefinitelyWritable")(isDefinitelyWritable)
    __obj.updateDynamic("isNullable")(isNullable)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isSearchable")(isSearchable)
    __obj.updateDynamic("isSigned")(isSigned)
    __obj.updateDynamic("isWritable")(isWritable)
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
}

