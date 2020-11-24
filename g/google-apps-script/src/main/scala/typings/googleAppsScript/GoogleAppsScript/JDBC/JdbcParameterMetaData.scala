package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC ParameterMetaData. For documentation of this class, see
  * java.sql.ParameterMetaData.
  */
@js.native
trait JdbcParameterMetaData extends js.Object {
  
  def getParameterClassName(param: Integer): String = js.native
  
  def getParameterCount(): Integer = js.native
  
  def getParameterMode(param: Integer): Integer = js.native
  
  def getParameterType(param: Integer): Integer = js.native
  
  def getParameterTypeName(param: Integer): String = js.native
  
  def getPrecision(param: Integer): Integer = js.native
  
  def getScale(param: Integer): Integer = js.native
  
  def isNullable(param: Integer): Integer = js.native
  
  def isSigned(param: Integer): Boolean = js.native
}
object JdbcParameterMetaData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class JdbcParameterMetaDataOps[Self <: JdbcParameterMetaData] (val x: Self) extends AnyVal {
    
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
    def setGetParameterClassName(value: Integer => String): Self = this.set("getParameterClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameterCount(value: () => Integer): Self = this.set("getParameterCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameterMode(value: Integer => Integer): Self = this.set("getParameterMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameterType(value: Integer => Integer): Self = this.set("getParameterType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameterTypeName(value: Integer => String): Self = this.set("getParameterTypeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrecision(value: Integer => Integer): Self = this.set("getPrecision", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScale(value: Integer => Integer): Self = this.set("getScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNullable(value: Integer => Integer): Self = this.set("isNullable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSigned(value: Integer => Boolean): Self = this.set("isSigned", js.Any.fromFunction1(value))
  }
}
