package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder to create a getSchema() response for your script project.
  *
  *     function getSchema() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *       var fields = cc.getFields();
  *       var types = cc.FieldType;
  *
  *       fields.newDimension()
  *           .setId('Created')
  *           .setName('Date Created')
  *           .setDescription('The date that this was created')
  *           .setType(types.YEAR_MONTH_DAY);
  *
  *       fields.newMetric()
  *           .setId('Amount')
  *           .setName('Amount (USD)')
  *           .setDescription('The cost in US dollars')
  *           .setType(types.CURRENCY_USD);
  *
  *       return cc.newGetSchemaResponse()
  *           .setFields(fields)
  *           .build();
  *     }
  */
trait GetSchemaResponse extends StObject {
  
  def build(): Any
  
  def printJson(): String
  
  def setFields(fields: Fields): GetSchemaResponse
}
object GetSchemaResponse {
  
  inline def apply(build: () => Any, printJson: () => String, setFields: Fields => GetSchemaResponse): GetSchemaResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setFields = js.Any.fromFunction1(setFields))
    __obj.asInstanceOf[GetSchemaResponse]
  }
  
  extension [Self <: GetSchemaResponse](x: Self) {
    
    inline def setBuild(value: () => Any): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetFields(value: Fields => GetSchemaResponse): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
  }
}
