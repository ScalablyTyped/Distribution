package typings.googleAppsScript.GoogleAppsScript.DataStudio

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
trait GetSchemaResponse extends js.Object {
  
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
  implicit class GetSchemaResponseOps[Self <: GetSchemaResponse] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => js.Any): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFields(value: Fields => GetSchemaResponse): Self = this.set("setFields", js.Any.fromFunction1(value))
  }
}
