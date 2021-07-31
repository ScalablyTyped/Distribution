package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryResult. */
trait IQueryResult extends StObject {
  
  /** QueryResult action */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /** QueryResult allRequiredParamsPresent */
  var allRequiredParamsPresent: js.UndefOr[Boolean | Null] = js.undefined
  
  /** QueryResult diagnosticInfo */
  var diagnosticInfo: js.UndefOr[IStruct | Null] = js.undefined
  
  /** QueryResult fulfillmentMessages */
  var fulfillmentMessages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
  
  /** QueryResult fulfillmentText */
  var fulfillmentText: js.UndefOr[String | Null] = js.undefined
  
  /** QueryResult intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  
  /** QueryResult intentDetectionConfidence */
  var intentDetectionConfidence: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryResult languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** QueryResult outputContexts */
  var outputContexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  
  /** QueryResult parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
  
  /** QueryResult queryText */
  var queryText: js.UndefOr[String | Null] = js.undefined
  
  /** QueryResult sentimentAnalysisResult */
  var sentimentAnalysisResult: js.UndefOr[ISentimentAnalysisResult | Null] = js.undefined
  
  /** QueryResult speechRecognitionConfidence */
  var speechRecognitionConfidence: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryResult webhookPayload */
  var webhookPayload: js.UndefOr[IStruct | Null] = js.undefined
  
  /** QueryResult webhookSource */
  var webhookSource: js.UndefOr[String | Null] = js.undefined
}
object IQueryResult {
  
  @scala.inline
  def apply(): IQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryResult]
  }
  
  @scala.inline
  implicit class IQueryResultMutableBuilder[Self <: IQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRequiredParamsPresentNull: Self = StObject.set(x, "allRequiredParamsPresent", null)
    
    @scala.inline
    def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    @scala.inline
    def setDiagnosticInfo(value: IStruct): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticInfoNull: Self = StObject.set(x, "diagnosticInfo", null)
    
    @scala.inline
    def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[IMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentMessagesNull: Self = StObject.set(x, "fulfillmentMessages", null)
    
    @scala.inline
    def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: IMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTextNull: Self = StObject.set(x, "fulfillmentText", null)
    
    @scala.inline
    def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    @scala.inline
    def setIntent(value: IIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidenceNull: Self = StObject.set(x, "intentDetectionConfidence", null)
    
    @scala.inline
    def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    @scala.inline
    def setIntentNull: Self = StObject.set(x, "intent", null)
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[IContext]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsNull: Self = StObject.set(x, "outputContexts", null)
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: IContext*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: IStruct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextNull: Self = StObject.set(x, "queryText", null)
    
    @scala.inline
    def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisResult(value: ISentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentAnalysisResultNull: Self = StObject.set(x, "sentimentAnalysisResult", null)
    
    @scala.inline
    def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    @scala.inline
    def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechRecognitionConfidenceNull: Self = StObject.set(x, "speechRecognitionConfidence", null)
    
    @scala.inline
    def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    @scala.inline
    def setWebhookPayload(value: IStruct): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookPayloadNull: Self = StObject.set(x, "webhookPayload", null)
    
    @scala.inline
    def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    @scala.inline
    def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookSourceNull: Self = StObject.set(x, "webhookSource", null)
    
    @scala.inline
    def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
