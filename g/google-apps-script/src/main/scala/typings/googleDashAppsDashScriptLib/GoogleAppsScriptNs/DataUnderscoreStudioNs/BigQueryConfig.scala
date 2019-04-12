package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryConfig extends js.Object {
  def addQueryParameter(name: java.lang.String, `type`: BigQueryParameterType, value: java.lang.String): BigQueryConfig
  def build(): js.Object
  def printJson(): java.lang.String
  def setAccessToken(accessToken: java.lang.String): BigQueryConfig
  def setBillingProjectId(billingProjectId: java.lang.String): BigQueryConfig
  def setQuery(query: java.lang.String): BigQueryConfig
  def setUseStandardSql(useStandardSql: scala.Boolean): BigQueryConfig
}

object BigQueryConfig {
  @scala.inline
  def apply(
    addQueryParameter: (java.lang.String, BigQueryParameterType, java.lang.String) => BigQueryConfig,
    build: () => js.Object,
    printJson: () => java.lang.String,
    setAccessToken: java.lang.String => BigQueryConfig,
    setBillingProjectId: java.lang.String => BigQueryConfig,
    setQuery: java.lang.String => BigQueryConfig,
    setUseStandardSql: scala.Boolean => BigQueryConfig
  ): BigQueryConfig = {
    val __obj = js.Dynamic.literal(addQueryParameter = js.Any.fromFunction3(addQueryParameter), build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAccessToken = js.Any.fromFunction1(setAccessToken), setBillingProjectId = js.Any.fromFunction1(setBillingProjectId), setQuery = js.Any.fromFunction1(setQuery), setUseStandardSql = js.Any.fromFunction1(setUseStandardSql))
  
    __obj.asInstanceOf[BigQueryConfig]
  }
}

