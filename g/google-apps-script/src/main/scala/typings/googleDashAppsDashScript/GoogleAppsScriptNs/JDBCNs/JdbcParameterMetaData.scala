package typings.googleDashAppsDashScript.GoogleAppsScriptNs.JDBCNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcParameterMetaData extends js.Object {
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
}

