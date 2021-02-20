package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait GetSchemaResponse extends StObject {
  
  def build(): js.Any = js.native
  
  def printJson(): String = js.native
  
  def setFields(fields: Fields): GetSchemaResponse = js.native
}
object GetSchemaResponse {
  
  @scala.inline
  def apply(build: () => js.Any, printJson: () => String, setFields: Fields => GetSchemaResponse): GetSchemaResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setFields = js.Any.fromFunction1(setFields))
    __obj.asInstanceOf[GetSchemaResponse]
  }
  
  @scala.inline
  implicit class GetSchemaResponseMutableBuilder[Self <: GetSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => js.Any): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFields(value: Fields => GetSchemaResponse): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
  }
}
