package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.JDBCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JdbcParameterMetaData extends js.Object {
  def getParameterClassName(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getParameterCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterMode(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterType(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParameterTypeName(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String
  def getPrecision(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getScale(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isNullable(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isSigned(param: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
}

object JdbcParameterMetaData {
  @scala.inline
  def apply(
    getParameterClassName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getParameterCount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getParameterMode: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getParameterType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getParameterTypeName: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => java.lang.String,
    getPrecision: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getScale: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isNullable: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isSigned: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean
  ): JdbcParameterMetaData = {
    val __obj = js.Dynamic.literal(getParameterClassName = js.Any.fromFunction1(getParameterClassName), getParameterCount = js.Any.fromFunction0(getParameterCount), getParameterMode = js.Any.fromFunction1(getParameterMode), getParameterType = js.Any.fromFunction1(getParameterType), getParameterTypeName = js.Any.fromFunction1(getParameterTypeName), getPrecision = js.Any.fromFunction1(getPrecision), getScale = js.Any.fromFunction1(getScale), isNullable = js.Any.fromFunction1(isNullable), isSigned = js.Any.fromFunction1(isSigned))
  
    __obj.asInstanceOf[JdbcParameterMetaData]
  }
}

