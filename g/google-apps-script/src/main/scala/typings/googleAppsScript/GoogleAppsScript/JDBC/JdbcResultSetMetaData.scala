package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC ResultSetMetaData. For documentation of this class, see
  * java.sql.ResultSetMetaData.
  */
@js.native
trait JdbcResultSetMetaData extends js.Object {
  def getCatalogName(column: Integer): String = js.native
  def getColumnClassName(column: Integer): String = js.native
  def getColumnCount(): Integer = js.native
  def getColumnDisplaySize(column: Integer): Integer = js.native
  def getColumnLabel(column: Integer): String = js.native
  def getColumnName(column: Integer): String = js.native
  def getColumnType(column: Integer): Integer = js.native
  def getColumnTypeName(column: Integer): String = js.native
  def getPrecision(column: Integer): Integer = js.native
  def getScale(column: Integer): Integer = js.native
  def getSchemaName(column: Integer): String = js.native
  def getTableName(column: Integer): String = js.native
  def isAutoIncrement(column: Integer): Boolean = js.native
  def isCaseSensitive(column: Integer): Boolean = js.native
  def isCurrency(column: Integer): Boolean = js.native
  def isDefinitelyWritable(column: Integer): Boolean = js.native
  def isNullable(column: Integer): Integer = js.native
  def isReadOnly(column: Integer): Boolean = js.native
  def isSearchable(column: Integer): Boolean = js.native
  def isSigned(column: Integer): Boolean = js.native
  def isWritable(column: Integer): Boolean = js.native
}

object JdbcResultSetMetaData {
  @scala.inline
  def apply(
    getCatalogName: Integer => String,
    getColumnClassName: Integer => String,
    getColumnCount: () => Integer,
    getColumnDisplaySize: Integer => Integer,
    getColumnLabel: Integer => String,
    getColumnName: Integer => String,
    getColumnType: Integer => Integer,
    getColumnTypeName: Integer => String,
    getPrecision: Integer => Integer,
    getScale: Integer => Integer,
    getSchemaName: Integer => String,
    getTableName: Integer => String,
    isAutoIncrement: Integer => Boolean,
    isCaseSensitive: Integer => Boolean,
    isCurrency: Integer => Boolean,
    isDefinitelyWritable: Integer => Boolean,
    isNullable: Integer => Integer,
    isReadOnly: Integer => Boolean,
    isSearchable: Integer => Boolean,
    isSigned: Integer => Boolean,
    isWritable: Integer => Boolean
  ): JdbcResultSetMetaData = {
    val __obj = js.Dynamic.literal(getCatalogName = js.Any.fromFunction1(getCatalogName), getColumnClassName = js.Any.fromFunction1(getColumnClassName), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumnDisplaySize = js.Any.fromFunction1(getColumnDisplaySize), getColumnLabel = js.Any.fromFunction1(getColumnLabel), getColumnName = js.Any.fromFunction1(getColumnName), getColumnType = js.Any.fromFunction1(getColumnType), getColumnTypeName = js.Any.fromFunction1(getColumnTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), getSchemaName = js.Any.fromFunction1(getSchemaName), getTableName = js.Any.fromFunction1(getTableName), isAutoIncrement = js.Any.fromFunction1(isAutoIncrement), isCaseSensitive = js.Any.fromFunction1(isCaseSensitive), isCurrency = js.Any.fromFunction1(isCurrency), isDefinitelyWritable = js.Any.fromFunction1(isDefinitelyWritable), isNullable = js.Any.fromFunction1(isNullable), isReadOnly = js.Any.fromFunction1(isReadOnly), isSearchable = js.Any.fromFunction1(isSearchable), isSigned = js.Any.fromFunction1(isSigned), isWritable = js.Any.fromFunction1(isWritable))
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
  @scala.inline
  implicit class JdbcResultSetMetaDataOps[Self <: JdbcResultSetMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCatalogName(value: Integer => String): Self = this.set("getCatalogName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnClassName(value: Integer => String): Self = this.set("getColumnClassName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnCount(value: () => Integer): Self = this.set("getColumnCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColumnDisplaySize(value: Integer => Integer): Self = this.set("getColumnDisplaySize", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnLabel(value: Integer => String): Self = this.set("getColumnLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnName(value: Integer => String): Self = this.set("getColumnName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnType(value: Integer => Integer): Self = this.set("getColumnType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnTypeName(value: Integer => String): Self = this.set("getColumnTypeName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPrecision(value: Integer => Integer): Self = this.set("getPrecision", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScale(value: Integer => Integer): Self = this.set("getScale", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSchemaName(value: Integer => String): Self = this.set("getSchemaName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTableName(value: Integer => String): Self = this.set("getTableName", js.Any.fromFunction1(value))
    @scala.inline
    def setIsAutoIncrement(value: Integer => Boolean): Self = this.set("isAutoIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCaseSensitive(value: Integer => Boolean): Self = this.set("isCaseSensitive", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCurrency(value: Integer => Boolean): Self = this.set("isCurrency", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDefinitelyWritable(value: Integer => Boolean): Self = this.set("isDefinitelyWritable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsNullable(value: Integer => Integer): Self = this.set("isNullable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsReadOnly(value: Integer => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def setIsSearchable(value: Integer => Boolean): Self = this.set("isSearchable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsSigned(value: Integer => Boolean): Self = this.set("isSigned", js.Any.fromFunction1(value))
    @scala.inline
    def setIsWritable(value: Integer => Boolean): Self = this.set("isWritable", js.Any.fromFunction1(value))
  }
  
}

