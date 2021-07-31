package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.`type`.ILatLng
import typings.dialogflow.mod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryParameters. */
trait IQueryParameters extends StObject {
  
  /** QueryParameters contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  
  /** QueryParameters geoLocation */
  var geoLocation: js.UndefOr[ILatLng | Null] = js.undefined
  
  /** QueryParameters knowledgeBaseNames */
  var knowledgeBaseNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** QueryParameters payload */
  var payload: js.UndefOr[IStruct | Null] = js.undefined
  
  /** QueryParameters resetContexts */
  var resetContexts: js.UndefOr[Boolean | Null] = js.undefined
  
  /** QueryParameters sentimentAnalysisRequestConfig */
  var sentimentAnalysisRequestConfig: js.UndefOr[ISentimentAnalysisRequestConfig | Null] = js.undefined
  
  /** QueryParameters sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.undefined
  
  /** QueryParameters timeZone */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /** QueryParameters webhookHeaders */
  var webhookHeaders: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object IQueryParameters {
  
  @scala.inline
  def apply(): IQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryParameters]
  }
  
  @scala.inline
  implicit class IQueryParametersMutableBuilder[Self <: IQueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[IContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsNull: Self = StObject.set(x, "contexts", null)
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: IContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setGeoLocation(value: ILatLng): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoLocationNull: Self = StObject.set(x, "geoLocation", null)
    
    @scala.inline
    def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    @scala.inline
    def setKnowledgeBaseNames(value: js.Array[String]): Self = StObject.set(x, "knowledgeBaseNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBaseNamesNull: Self = StObject.set(x, "knowledgeBaseNames", null)
    
    @scala.inline
    def setKnowledgeBaseNamesUndefined: Self = StObject.set(x, "knowledgeBaseNames", js.undefined)
    
    @scala.inline
    def setKnowledgeBaseNamesVarargs(value: String*): Self = StObject.set(x, "knowledgeBaseNames", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: IStruct): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetContextsNull: Self = StObject.set(x, "resetContexts", null)
    
    @scala.inline
    def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisRequestConfig(value: ISentimentAnalysisRequestConfig): Self = StObject.set(x, "sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentAnalysisRequestConfigNull: Self = StObject.set(x, "sentimentAnalysisRequestConfig", null)
    
    @scala.inline
    def setSentimentAnalysisRequestConfigUndefined: Self = StObject.set(x, "sentimentAnalysisRequestConfig", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[ISessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesNull: Self = StObject.set(x, "sessionEntityTypes", null)
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: ISessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setWebhookHeaders(value: StringDictionary[String]): Self = StObject.set(x, "webhookHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookHeadersNull: Self = StObject.set(x, "webhookHeaders", null)
    
    @scala.inline
    def setWebhookHeadersUndefined: Self = StObject.set(x, "webhookHeaders", js.undefined)
  }
}
