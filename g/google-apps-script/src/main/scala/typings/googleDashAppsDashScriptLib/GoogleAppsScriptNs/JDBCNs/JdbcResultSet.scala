package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcResultSet extends js.Object {
  def absolute(row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def afterLast(): scala.Unit = js.native
  def beforeFirst(): scala.Unit = js.native
  def cancelRowUpdates(): scala.Unit = js.native
  def clearWarnings(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def deleteRow(): scala.Unit = js.native
  def findColumn(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def first(): scala.Boolean = js.native
  def getArray(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcArray = js.native
  def getArray(columnLabel: java.lang.String): JdbcArray = js.native
  def getBigDecimal(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigNumber = js.native
  def getBigDecimal(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigNumber = js.native
  def getBlob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcBlob = js.native
  def getBlob(columnLabel: java.lang.String): JdbcBlob = js.native
  def getBoolean(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def getBoolean(columnLabel: java.lang.String): scala.Boolean = js.native
  def getByte(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte = js.native
  def getByte(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte = js.native
  def getBytes(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getBytes(columnLabel: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getClob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcClob = js.native
  def getClob(columnLabel: java.lang.String): JdbcClob = js.native
  def getConcurrency(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getCursorName(): java.lang.String = js.native
  def getDate(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcDate = js.native
  def getDate(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, timeZone: java.lang.String): JdbcDate = js.native
  def getDate(columnLabel: java.lang.String): JdbcDate = js.native
  def getDate(columnLabel: java.lang.String, timeZone: java.lang.String): JdbcDate = js.native
  def getDouble(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): stdLib.Number = js.native
  def getDouble(columnLabel: java.lang.String): stdLib.Number = js.native
  def getFetchDirection(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFetchSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFloat(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): stdLib.Number = js.native
  def getFloat(columnLabel: java.lang.String): stdLib.Number = js.native
  def getHoldability(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getInt(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getInt(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLong(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLong(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMetaData(): JdbcResultSetMetaData = js.native
  def getNClob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcClob = js.native
  def getNClob(columnLabel: java.lang.String): JdbcClob = js.native
  def getNString(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getNString(columnLabel: java.lang.String): java.lang.String = js.native
  def getObject(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): js.Object = js.native
  def getObject(columnLabel: java.lang.String): js.Object = js.native
  def getRef(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcRef = js.native
  def getRef(columnLabel: java.lang.String): JdbcRef = js.native
  def getRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getRowId(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcRowId = js.native
  def getRowId(columnLabel: java.lang.String): JdbcRowId = js.native
  def getSQLXML(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcSQLXML = js.native
  def getSQLXML(columnLabel: java.lang.String): JdbcSQLXML = js.native
  def getShort(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getShort(columnLabel: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getStatement(): JdbcStatement = js.native
  def getString(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getString(columnLabel: java.lang.String): java.lang.String = js.native
  def getTime(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcTime = js.native
  def getTime(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, timeZone: java.lang.String): JdbcTime = js.native
  def getTime(columnLabel: java.lang.String): JdbcTime = js.native
  def getTime(columnLabel: java.lang.String, timeZone: java.lang.String): JdbcTime = js.native
  def getTimestamp(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): JdbcTimestamp = js.native
  def getTimestamp(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, timeZone: java.lang.String): JdbcTimestamp = js.native
  def getTimestamp(columnLabel: java.lang.String): JdbcTimestamp = js.native
  def getTimestamp(columnLabel: java.lang.String, timeZone: java.lang.String): JdbcTimestamp = js.native
  def getType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getURL(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getURL(columnLabel: java.lang.String): java.lang.String = js.native
  def getWarnings(): js.Array[java.lang.String] = js.native
  def insertRow(): scala.Unit = js.native
  def isAfterLast(): scala.Boolean = js.native
  def isBeforeFirst(): scala.Boolean = js.native
  def isClosed(): scala.Boolean = js.native
  def isFirst(): scala.Boolean = js.native
  def isLast(): scala.Boolean = js.native
  def last(): scala.Boolean = js.native
  def moveToCurrentRow(): scala.Unit = js.native
  def moveToInsertRow(): scala.Unit = js.native
  def next(): scala.Boolean = js.native
  def previous(): scala.Boolean = js.native
  def refreshRow(): scala.Unit = js.native
  def relative(rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def rowDeleted(): scala.Boolean = js.native
  def rowInserted(): scala.Boolean = js.native
  def rowUpdated(): scala.Boolean = js.native
  def setFetchDirection(direction: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def setFetchSize(rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def updateArray(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcArray): scala.Unit = js.native
  def updateArray(columnLabel: java.lang.String, x: JdbcArray): scala.Unit = js.native
  def updateBigDecimal(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigNumber
  ): scala.Unit = js.native
  def updateBigDecimal(columnLabel: java.lang.String, x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigNumber): scala.Unit = js.native
  def updateBlob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcBlob): scala.Unit = js.native
  def updateBlob(columnLabel: java.lang.String, x: JdbcBlob): scala.Unit = js.native
  def updateBoolean(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: scala.Boolean): scala.Unit = js.native
  def updateBoolean(columnLabel: java.lang.String, x: scala.Boolean): scala.Unit = js.native
  def updateByte(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte
  ): scala.Unit = js.native
  def updateByte(columnLabel: java.lang.String, x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte): scala.Unit = js.native
  def updateBytes(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]
  ): scala.Unit = js.native
  def updateBytes(columnLabel: java.lang.String, x: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): scala.Unit = js.native
  def updateClob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcClob): scala.Unit = js.native
  def updateClob(columnLabel: java.lang.String, x: JdbcClob): scala.Unit = js.native
  def updateDate(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcDate): scala.Unit = js.native
  def updateDate(columnLabel: java.lang.String, x: JdbcDate): scala.Unit = js.native
  def updateDouble(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: stdLib.Number): scala.Unit = js.native
  def updateDouble(columnLabel: java.lang.String, x: stdLib.Number): scala.Unit = js.native
  def updateFloat(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: stdLib.Number): scala.Unit = js.native
  def updateFloat(columnLabel: java.lang.String, x: stdLib.Number): scala.Unit = js.native
  def updateInt(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def updateInt(columnLabel: java.lang.String, x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def updateLong(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def updateLong(columnLabel: java.lang.String, x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def updateNClob(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcClob): scala.Unit = js.native
  def updateNClob(columnLabel: java.lang.String, x: JdbcClob): scala.Unit = js.native
  def updateNString(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: java.lang.String): scala.Unit = js.native
  def updateNString(columnLabel: java.lang.String, x: java.lang.String): scala.Unit = js.native
  def updateNull(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def updateNull(columnLabel: java.lang.String): scala.Unit = js.native
  def updateObject(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: js.Object): scala.Unit = js.native
  def updateObject(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: js.Object,
    scaleOrLength: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def updateObject(columnLabel: java.lang.String, x: js.Object): scala.Unit = js.native
  def updateObject(
    columnLabel: java.lang.String,
    x: js.Object,
    scaleOrLength: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def updateRef(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcRef): scala.Unit = js.native
  def updateRef(columnLabel: java.lang.String, x: JdbcRef): scala.Unit = js.native
  def updateRow(): scala.Unit = js.native
  def updateRowId(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcRowId): scala.Unit = js.native
  def updateRowId(columnLabel: java.lang.String, x: JdbcRowId): scala.Unit = js.native
  def updateSQLXML(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcSQLXML): scala.Unit = js.native
  def updateSQLXML(columnLabel: java.lang.String, x: JdbcSQLXML): scala.Unit = js.native
  def updateShort(
    columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def updateShort(columnLabel: java.lang.String, x: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def updateString(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: java.lang.String): scala.Unit = js.native
  def updateString(columnLabel: java.lang.String, x: java.lang.String): scala.Unit = js.native
  def updateTime(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcTime): scala.Unit = js.native
  def updateTime(columnLabel: java.lang.String, x: JdbcTime): scala.Unit = js.native
  def updateTimestamp(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, x: JdbcTimestamp): scala.Unit = js.native
  def updateTimestamp(columnLabel: java.lang.String, x: JdbcTimestamp): scala.Unit = js.native
  def wasNull(): scala.Boolean = js.native
}

