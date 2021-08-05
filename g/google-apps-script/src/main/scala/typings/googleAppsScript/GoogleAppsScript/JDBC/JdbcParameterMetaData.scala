package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC ParameterMetaData. For documentation of this class, see
  * java.sql.ParameterMetaData.
  */
trait JdbcParameterMetaData extends StObject {
  
  def getParameterClassName(param: Integer): String
  
  def getParameterCount(): Integer
  
  def getParameterMode(param: Integer): Integer
  
  def getParameterType(param: Integer): Integer
  
  def getParameterTypeName(param: Integer): String
  
  def getPrecision(param: Integer): Integer
  
  def getScale(param: Integer): Integer
  
  def isNullable(param: Integer): Integer
  
  def isSigned(param: Integer): Boolean
}
object JdbcParameterMetaData {
  
  inline def apply(
    getParameterClassName: Integer => String,
    getParameterCount: () => Integer,
    getParameterMode: Integer => Integer,
    getParameterType: Integer => Integer,
    getParameterTypeName: Integer => String,
    getPrecision: Integer => Integer,
    getScale: Integer => Integer,
    isNullable: Integer => Integer,
    isSigned: Integer => Boolean
  ): JdbcParameterMetaData = {
    val __obj = js.Dynamic.literal(getParameterClassName = js.Any.fromFunction1(getParameterClassName), getParameterCount = js.Any.fromFunction0(getParameterCount), getParameterMode = js.Any.fromFunction1(getParameterMode), getParameterType = js.Any.fromFunction1(getParameterType), getParameterTypeName = js.Any.fromFunction1(getParameterTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), isNullable = js.Any.fromFunction1(isNullable), isSigned = js.Any.fromFunction1(isSigned))
    __obj.asInstanceOf[JdbcParameterMetaData]
  }
  
  extension [Self <: JdbcParameterMetaData](x: Self) {
    
    inline def setGetParameterClassName(value: Integer => String): Self = StObject.set(x, "getParameterClassName", js.Any.fromFunction1(value))
    
    inline def setGetParameterCount(value: () => Integer): Self = StObject.set(x, "getParameterCount", js.Any.fromFunction0(value))
    
    inline def setGetParameterMode(value: Integer => Integer): Self = StObject.set(x, "getParameterMode", js.Any.fromFunction1(value))
    
    inline def setGetParameterType(value: Integer => Integer): Self = StObject.set(x, "getParameterType", js.Any.fromFunction1(value))
    
    inline def setGetParameterTypeName(value: Integer => String): Self = StObject.set(x, "getParameterTypeName", js.Any.fromFunction1(value))
    
    inline def setGetPrecision(value: Integer => Integer): Self = StObject.set(x, "getPrecision", js.Any.fromFunction1(value))
    
    inline def setGetScale(value: Integer => Integer): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
    
    inline def setIsNullable(value: Integer => Integer): Self = StObject.set(x, "isNullable", js.Any.fromFunction1(value))
    
    inline def setIsSigned(value: Integer => Boolean): Self = StObject.set(x, "isSigned", js.Any.fromFunction1(value))
  }
}
