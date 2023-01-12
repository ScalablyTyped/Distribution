package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for BigQueryDataSourceSpecBuilder.
  */
trait BigQueryDataSourceSpecBuilder extends StObject {
  
  def build(): DataSourceSpec
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getProjectId(): String
  
  def getRawQuery(): String
  
  def getType(): DataSourceType
  
  def removeAllParameters(): BigQueryDataSourceSpecBuilder
  
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder
  
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder
  
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder
  
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder
}
object BigQueryDataSourceSpecBuilder {
  
  inline def apply(
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType,
    removeAllParameters: () => BigQueryDataSourceSpecBuilder,
    removeParameter: String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (String, String) => BigQueryDataSourceSpecBuilder,
    setProjectId: String => BigQueryDataSourceSpecBuilder,
    setRawQuery: String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigQueryDataSourceSpecBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => DataSourceSpec): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCopy(value: () => DataSourceSpecBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setGetProjectId(value: () => String): Self = StObject.set(x, "getProjectId", js.Any.fromFunction0(value))
    
    inline def setGetRawQuery(value: () => String): Self = StObject.set(x, "getRawQuery", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => DataSourceType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setRemoveAllParameters(value: () => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "removeAllParameters", js.Any.fromFunction0(value))
    
    inline def setRemoveParameter(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "removeParameter", js.Any.fromFunction1(value))
    
    inline def setSetParameterFromCell(value: (String, String) => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setParameterFromCell", js.Any.fromFunction2(value))
    
    inline def setSetProjectId(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setProjectId", js.Any.fromFunction1(value))
    
    inline def setSetRawQuery(value: String => BigQueryDataSourceSpecBuilder): Self = StObject.set(x, "setRawQuery", js.Any.fromFunction1(value))
  }
}
