package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CommunityConnector enables scripts to access builders and utilities to help with development of
  * Community Connectors for Data Studio. Use this class to get a reference to the Fields
  * object and the FieldType and AggregationType enums so they can be used in the
  * construction of Fields.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fieldType = cc.FieldType;
  *     var aggregationType = cc.AggregationType;
  *
  *     var fields = cc.getFields();
  *
  *     fields.newMetric()
  *       .setAggregation(aggregationType.AVG)
  *       .setType(fieldType.CURRENCY_USD);
  */
@js.native
trait CommunityConnector extends js.Object {
  
  var AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any = js.native
  
  var AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any = js.native
  
  var BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any = js.native
  
  var FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any = js.native
  
  def getConfig(): Config = js.native
  
  def getFields(): Fields = js.native
  
  def newAuthTypeResponse(): GetAuthTypeResponse = js.native
  
  def newBigQueryConfig(): BigQueryConfig = js.native
  
  def newDebugError(): DebugError = js.native
  
  def newGetDataResponse(): GetDataResponse = js.native
  
  def newGetSchemaResponse(): GetSchemaResponse = js.native
  
  def newSetCredentialsResponse(): SetCredentialsResponse = js.native
  
  def newUserError(): UserError = js.native
}
object CommunityConnector {
  
  @scala.inline
  def apply(
    AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any,
    AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any,
    BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any,
    FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any,
    getConfig: () => Config,
    getFields: () => Fields,
    newAuthTypeResponse: () => GetAuthTypeResponse,
    newBigQueryConfig: () => BigQueryConfig,
    newDebugError: () => DebugError,
    newGetDataResponse: () => GetDataResponse,
    newGetSchemaResponse: () => GetSchemaResponse,
    newSetCredentialsResponse: () => SetCredentialsResponse,
    newUserError: () => UserError
  ): CommunityConnector = {
    val __obj = js.Dynamic.literal(AggregationType = AggregationType.asInstanceOf[js.Any], AuthType = AuthType.asInstanceOf[js.Any], BigQueryParameterType = BigQueryParameterType.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getFields = js.Any.fromFunction0(getFields), newAuthTypeResponse = js.Any.fromFunction0(newAuthTypeResponse), newBigQueryConfig = js.Any.fromFunction0(newBigQueryConfig), newDebugError = js.Any.fromFunction0(newDebugError), newGetDataResponse = js.Any.fromFunction0(newGetDataResponse), newGetSchemaResponse = js.Any.fromFunction0(newGetSchemaResponse), newSetCredentialsResponse = js.Any.fromFunction0(newSetCredentialsResponse), newUserError = js.Any.fromFunction0(newUserError))
    __obj.asInstanceOf[CommunityConnector]
  }
  
  @scala.inline
  implicit class CommunityConnectorOps[Self <: CommunityConnector] (val x: Self) extends AnyVal {
    
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
    def setAggregationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any
    ): Self = this.set("AggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any): Self = this.set("AuthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryParameterType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any
    ): Self = this.set("BigQueryParameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any): Self = this.set("FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConfig(value: () => Config): Self = this.set("getConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFields(value: () => Fields): Self = this.set("getFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAuthTypeResponse(value: () => GetAuthTypeResponse): Self = this.set("newAuthTypeResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBigQueryConfig(value: () => BigQueryConfig): Self = this.set("newBigQueryConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDebugError(value: () => DebugError): Self = this.set("newDebugError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGetDataResponse(value: () => GetDataResponse): Self = this.set("newGetDataResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGetSchemaResponse(value: () => GetSchemaResponse): Self = this.set("newGetSchemaResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSetCredentialsResponse(value: () => SetCredentialsResponse): Self = this.set("newSetCredentialsResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserError(value: () => UserError): Self = this.set("newUserError", js.Any.fromFunction0(value))
  }
}
