package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
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
  
  /** QueryResult knowledgeAnswers */
  var knowledgeAnswers: js.UndefOr[IKnowledgeAnswers | Null] = js.undefined
  
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
  
  inline def apply(): IQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryResult]
  }
  
  extension [Self <: IQueryResult](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    inline def setAllRequiredParamsPresentNull: Self = StObject.set(x, "allRequiredParamsPresent", null)
    
    inline def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    inline def setDiagnosticInfo(value: IStruct): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoNull: Self = StObject.set(x, "diagnosticInfo", null)
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setFulfillmentMessages(value: js.Array[IMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentMessagesNull: Self = StObject.set(x, "fulfillmentMessages", null)
    
    inline def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    inline def setFulfillmentMessagesVarargs(value: IMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value*))
    
    inline def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTextNull: Self = StObject.set(x, "fulfillmentText", null)
    
    inline def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    inline def setIntent(value: IIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidenceNull: Self = StObject.set(x, "intentDetectionConfidence", null)
    
    inline def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setKnowledgeAnswers(value: IKnowledgeAnswers): Self = StObject.set(x, "knowledgeAnswers", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeAnswersNull: Self = StObject.set(x, "knowledgeAnswers", null)
    
    inline def setKnowledgeAnswersUndefined: Self = StObject.set(x, "knowledgeAnswers", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setOutputContexts(value: js.Array[IContext]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsNull: Self = StObject.set(x, "outputContexts", null)
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: IContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(value: IStruct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextNull: Self = StObject.set(x, "queryText", null)
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    inline def setSentimentAnalysisResult(value: ISentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisResultNull: Self = StObject.set(x, "sentimentAnalysisResult", null)
    
    inline def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    inline def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    inline def setSpeechRecognitionConfidenceNull: Self = StObject.set(x, "speechRecognitionConfidence", null)
    
    inline def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    inline def setWebhookPayload(value: IStruct): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    inline def setWebhookPayloadNull: Self = StObject.set(x, "webhookPayload", null)
    
    inline def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    inline def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    inline def setWebhookSourceNull: Self = StObject.set(x, "webhookSource", null)
    
    inline def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
