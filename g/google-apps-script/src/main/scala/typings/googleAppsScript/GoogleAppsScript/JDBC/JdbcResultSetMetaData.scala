package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC ResultSetMetaData. For documentation of this class, see
  * java.sql.ResultSetMetaData.
  */
trait JdbcResultSetMetaData extends StObject {
  
  def getCatalogName(column: Integer): String
  
  def getColumnClassName(column: Integer): String
  
  def getColumnCount(): Integer
  
  def getColumnDisplaySize(column: Integer): Integer
  
  def getColumnLabel(column: Integer): String
  
  def getColumnName(column: Integer): String
  
  def getColumnType(column: Integer): Integer
  
  def getColumnTypeName(column: Integer): String
  
  def getPrecision(column: Integer): Integer
  
  def getScale(column: Integer): Integer
  
  def getSchemaName(column: Integer): String
  
  def getTableName(column: Integer): String
  
  def isAutoIncrement(column: Integer): Boolean
  
  def isCaseSensitive(column: Integer): Boolean
  
  def isCurrency(column: Integer): Boolean
  
  def isDefinitelyWritable(column: Integer): Boolean
  
  def isNullable(column: Integer): Integer
  
  def isReadOnly(column: Integer): Boolean
  
  def isSearchable(column: Integer): Boolean
  
  def isSigned(column: Integer): Boolean
  
  def isWritable(column: Integer): Boolean
}
object JdbcResultSetMetaData {
  
  inline def apply(
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
  
  extension [Self <: JdbcResultSetMetaData](x: Self) {
    
    inline def setGetCatalogName(value: Integer => String): Self = StObject.set(x, "getCatalogName", js.Any.fromFunction1(value))
    
    inline def setGetColumnClassName(value: Integer => String): Self = StObject.set(x, "getColumnClassName", js.Any.fromFunction1(value))
    
    inline def setGetColumnCount(value: () => Integer): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
    
    inline def setGetColumnDisplaySize(value: Integer => Integer): Self = StObject.set(x, "getColumnDisplaySize", js.Any.fromFunction1(value))
    
    inline def setGetColumnLabel(value: Integer => String): Self = StObject.set(x, "getColumnLabel", js.Any.fromFunction1(value))
    
    inline def setGetColumnName(value: Integer => String): Self = StObject.set(x, "getColumnName", js.Any.fromFunction1(value))
    
    inline def setGetColumnType(value: Integer => Integer): Self = StObject.set(x, "getColumnType", js.Any.fromFunction1(value))
    
    inline def setGetColumnTypeName(value: Integer => String): Self = StObject.set(x, "getColumnTypeName", js.Any.fromFunction1(value))
    
    inline def setGetPrecision(value: Integer => Integer): Self = StObject.set(x, "getPrecision", js.Any.fromFunction1(value))
    
    inline def setGetScale(value: Integer => Integer): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
    
    inline def setGetSchemaName(value: Integer => String): Self = StObject.set(x, "getSchemaName", js.Any.fromFunction1(value))
    
    inline def setGetTableName(value: Integer => String): Self = StObject.set(x, "getTableName", js.Any.fromFunction1(value))
    
    inline def setIsAutoIncrement(value: Integer => Boolean): Self = StObject.set(x, "isAutoIncrement", js.Any.fromFunction1(value))
    
    inline def setIsCaseSensitive(value: Integer => Boolean): Self = StObject.set(x, "isCaseSensitive", js.Any.fromFunction1(value))
    
    inline def setIsCurrency(value: Integer => Boolean): Self = StObject.set(x, "isCurrency", js.Any.fromFunction1(value))
    
    inline def setIsDefinitelyWritable(value: Integer => Boolean): Self = StObject.set(x, "isDefinitelyWritable", js.Any.fromFunction1(value))
    
    inline def setIsNullable(value: Integer => Integer): Self = StObject.set(x, "isNullable", js.Any.fromFunction1(value))
    
    inline def setIsReadOnly(value: Integer => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction1(value))
    
    inline def setIsSearchable(value: Integer => Boolean): Self = StObject.set(x, "isSearchable", js.Any.fromFunction1(value))
    
    inline def setIsSigned(value: Integer => Boolean): Self = StObject.set(x, "isSigned", js.Any.fromFunction1(value))
    
    inline def setIsWritable(value: Integer => Boolean): Self = StObject.set(x, "isWritable", js.Any.fromFunction1(value))
  }
}
