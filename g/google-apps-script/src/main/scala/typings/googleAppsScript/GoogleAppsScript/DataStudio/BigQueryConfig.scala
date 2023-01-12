package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configuration object for a native BigQuery connector. Return this object from getData()
  * for Data Studio to query BigQuery for the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var types = cc.BigQueryParameterType;
  *
  *     var bqConfig = cc.newBigQueryConfig()
  *       .setBillingProjectId('billingProjectId')
  *       .setQuery('queryString')
  *       .setUseStandardSql(true)
  *       .setAccessToken('accessToken')
  *       .addQueryParameter('dob', types.STRING, '01011990')
  *       .build();
  */
trait BigQueryConfig extends StObject {
  
  def addQueryParameter(name: String, `type`: BigQueryParameterType, value: String): BigQueryConfig
  
  def build(): Config
  
  def printJson(): String
  
  def setAccessToken(accessToken: String): BigQueryConfig
  
  def setBillingProjectId(billingProjectId: String): BigQueryConfig
  
  def setQuery(query: String): BigQueryConfig
  
  def setUseStandardSql(useStandardSql: Boolean): BigQueryConfig
}
object BigQueryConfig {
  
  inline def apply(
    addQueryParameter: (String, BigQueryParameterType, String) => BigQueryConfig,
    build: () => Config,
    printJson: () => String,
    setAccessToken: String => BigQueryConfig,
    setBillingProjectId: String => BigQueryConfig,
    setQuery: String => BigQueryConfig,
    setUseStandardSql: Boolean => BigQueryConfig
  ): BigQueryConfig = {
    val __obj = js.Dynamic.literal(addQueryParameter = js.Any.fromFunction3(addQueryParameter), build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAccessToken = js.Any.fromFunction1(setAccessToken), setBillingProjectId = js.Any.fromFunction1(setBillingProjectId), setQuery = js.Any.fromFunction1(setQuery), setUseStandardSql = js.Any.fromFunction1(setUseStandardSql))
    __obj.asInstanceOf[BigQueryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigQueryConfig] (val x: Self) extends AnyVal {
    
    inline def setAddQueryParameter(value: (String, BigQueryParameterType, String) => BigQueryConfig): Self = StObject.set(x, "addQueryParameter", js.Any.fromFunction3(value))
    
    inline def setBuild(value: () => Config): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetAccessToken(value: String => BigQueryConfig): Self = StObject.set(x, "setAccessToken", js.Any.fromFunction1(value))
    
    inline def setSetBillingProjectId(value: String => BigQueryConfig): Self = StObject.set(x, "setBillingProjectId", js.Any.fromFunction1(value))
    
    inline def setSetQuery(value: String => BigQueryConfig): Self = StObject.set(x, "setQuery", js.Any.fromFunction1(value))
    
    inline def setSetUseStandardSql(value: Boolean => BigQueryConfig): Self = StObject.set(x, "setUseStandardSql", js.Any.fromFunction1(value))
  }
}
