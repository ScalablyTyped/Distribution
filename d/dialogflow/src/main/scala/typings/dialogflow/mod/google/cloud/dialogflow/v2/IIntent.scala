package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState
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
    WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String) | Null
  ] = js.undefined
}
object IIntent {
  
  @scala.inline
  def apply(): IIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntent]
  }
  
  @scala.inline
  implicit class IIntentMutableBuilder[Self <: IIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatforms(value: js.Array[Platform]): Self = StObject.set(x, "defaultResponsePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResponsePlatformsNull: Self = StObject.set(x, "defaultResponsePlatforms", null)
    
    @scala.inline
    def setDefaultResponsePlatformsUndefined: Self = StObject.set(x, "defaultResponsePlatforms", js.undefined)
    
    @scala.inline
    def setDefaultResponsePlatformsVarargs(value: Platform*): Self = StObject.set(x, "defaultResponsePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFollowupIntentInfo(value: js.Array[IFollowupIntentInfo]): Self = StObject.set(x, "followupIntentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupIntentInfoNull: Self = StObject.set(x, "followupIntentInfo", null)
    
    @scala.inline
    def setFollowupIntentInfoUndefined: Self = StObject.set(x, "followupIntentInfo", js.undefined)
    
    @scala.inline
    def setFollowupIntentInfoVarargs(value: IFollowupIntentInfo*): Self = StObject.set(x, "followupIntentInfo", js.Array(value :_*))
    
    @scala.inline
    def setInputContextNames(value: js.Array[String]): Self = StObject.set(x, "inputContextNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContextNamesNull: Self = StObject.set(x, "inputContextNames", null)
    
    @scala.inline
    def setInputContextNamesUndefined: Self = StObject.set(x, "inputContextNames", js.undefined)
    
    @scala.inline
    def setInputContextNamesVarargs(value: String*): Self = StObject.set(x, "inputContextNames", js.Array(value :_*))
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallbackNull: Self = StObject.set(x, "isFallback", null)
    
    @scala.inline
    def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[IMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: IMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setMlDisabled(value: Boolean): Self = StObject.set(x, "mlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlDisabledNull: Self = StObject.set(x, "mlDisabled", null)
    
    @scala.inline
    def setMlDisabledUndefined: Self = StObject.set(x, "mlDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[IContext]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsNull: Self = StObject.set(x, "outputContexts", null)
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: IContext*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[IParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: IParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFollowupIntentNameNull: Self = StObject.set(x, "parentFollowupIntentName", null)
    
    @scala.inline
    def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetContextsNull: Self = StObject.set(x, "resetContexts", null)
    
    @scala.inline
    def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    @scala.inline
    def setRootFollowupIntentName(value: String): Self = StObject.set(x, "rootFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFollowupIntentNameNull: Self = StObject.set(x, "rootFollowupIntentName", null)
    
    @scala.inline
    def setRootFollowupIntentNameUndefined: Self = StObject.set(x, "rootFollowupIntentName", js.undefined)
    
    @scala.inline
    def setTrainingPhrases(value: js.Array[ITrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingPhrasesNull: Self = StObject.set(x, "trainingPhrases", null)
    
    @scala.inline
    def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    @scala.inline
    def setTrainingPhrasesVarargs(value: ITrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value :_*))
    
    @scala.inline
    def setWebhookState(
      value: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String)
    ): Self = StObject.set(x, "webhookState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStateNull: Self = StObject.set(x, "webhookState", null)
    
    @scala.inline
    def setWebhookStateUndefined: Self = StObject.set(x, "webhookState", js.undefined)
  }
}
