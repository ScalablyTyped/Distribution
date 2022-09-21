package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Intent. */
trait IIntent extends StObject {
  
  /** Intent action */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /** Intent defaultResponsePlatforms */
  var defaultResponsePlatforms: js.UndefOr[js.Array[Platform] | Null] = js.undefined
  
  /** Intent displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** Intent endInteraction */
  var endInteraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Intent events */
  var events: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Intent followupIntentInfo */
  var followupIntentInfo: js.UndefOr[js.Array[IFollowupIntentInfo] | Null] = js.undefined
  
  /** Intent inputContextNames */
  var inputContextNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Intent isFallback */
  var isFallback: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Intent messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
  
  /** Intent mlDisabled */
  var mlDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Intent mlEnabled */
  var mlEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Intent name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Intent outputContexts */
  var outputContexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  
  /** Intent parameters */
  var parameters: js.UndefOr[js.Array[IParameter] | Null] = js.undefined
  
  /** Intent parentFollowupIntentName */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
  
  /** Intent priority */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /** Intent resetContexts */
  var resetContexts: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Intent rootFollowupIntentName */
  var rootFollowupIntentName: js.UndefOr[String | Null] = js.undefined
  
  /** Intent trainingPhrases */
  var trainingPhrases: js.UndefOr[js.Array[ITrainingPhrase] | Null] = js.undefined
  
  /** Intent webhookState */
  var webhookState: js.UndefOr[
    WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.WebhookState * / any */ String) | Null
  ] = js.undefined
}
object IIntent {
  
  inline def apply(): IIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntent]
  }
  
  extension [Self <: IIntent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDefaultResponsePlatforms(value: js.Array[Platform]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    inline def setDefaultResponsePlatformsNull: Self = StObject.set(x, "defaultResponsePlatforms", null)
    
    inline def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    inline def setDefaultResponsePlatformsVarargs(value: Platform*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndInteraction(value: Boolean): Self = StObject.set(x, "endInteraction", value.asInstanceOf[js.Any])
    
    inline def setEndInteractionNull: Self = StObject.set(x, "endInteraction", null)
    
    inline def setEndInteractionUndefined: Self = StObject.set(x, "endInteraction", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFollowupIntentInfo(value: js.Array[IFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentInfoNull: Self = StObject.set(x, "followupIntentInfo", null)
    
    inline def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    inline def setFollowupIntentInfoVarargs(value: IFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value*))
    
    inline def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    inline def setInputContextNamesNull: Self = StObject.set(x, "inputContextNames", null)
    
    inline def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    inline def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value*))
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setIsFallbackNull: Self = StObject.set(x, "isFallback", null)
    
    inline def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    inline def setMessages(value: js.Array[IMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: IMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    inline def setMlDisabledNull: Self = StObject.set(x, "mlDisabled", null)
    
    inline def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    inline def setMlEnabled(value: Boolean): Self = StObject.set(x, "mlEnabled", value.asInstanceOf[js.Any])
    
    inline def setMlEnabledNull: Self = StObject.set(x, "mlEnabled", null)
    
    inline def setMlEnabledUndefined: Self = StObject.set(x, "mlEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputContexts(value: js.Array[IContext]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsNull: Self = StObject.set(x, "outputContexts", null)
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: IContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(value: js.Array[IParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: IParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    inline def setResetContextsNull: Self = StObject.set(x, "resetContexts", null)
    
    inline def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    inline def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setRootFollowupIntentNameNull: Self = StObject.set(x, "rootFollowupIntentName", null)
    
    inline def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    inline def setTrainingPhrases(value: js.Array[ITrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    inline def setTrainingPhrasesNull: Self = StObject.set(x, "trainingPhrases", null)
    
    inline def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    inline def setTrainingPhrasesVarargs(value: ITrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value*))
    
    inline def setWebhookState(
      value: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.WebhookState * / any */ String)
    ): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    inline def setWebhookStateNull: Self = StObject.set(x, "webhookState", null)
    
    inline def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}
