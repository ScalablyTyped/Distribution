package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Intent. */
trait IIntent extends js.Object {
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
  def apply(
    action: String = null,
    defaultResponsePlatforms: js.Array[Platform] = null,
    displayName: String = null,
    events: js.Array[String] = null,
    followupIntentInfo: js.Array[IFollowupIntentInfo] = null,
    inputContextNames: js.Array[String] = null,
    isFallback: js.UndefOr[Boolean] = js.undefined,
    messages: js.Array[IMessage] = null,
    mlDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputContexts: js.Array[IContext] = null,
    parameters: js.Array[IParameter] = null,
    parentFollowupIntentName: String = null,
    priority: Int | Double = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    rootFollowupIntentName: String = null,
    trainingPhrases: js.Array[ITrainingPhrase] = null,
    webhookState: WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String) = null
  ): IIntent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (defaultResponsePlatforms != null) __obj.updateDynamic("defaultResponsePlatforms")(defaultResponsePlatforms.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (followupIntentInfo != null) __obj.updateDynamic("followupIntentInfo")(followupIntentInfo.asInstanceOf[js.Any])
    if (inputContextNames != null) __obj.updateDynamic("inputContextNames")(inputContextNames.asInstanceOf[js.Any])
    if (!js.isUndefined(isFallback)) __obj.updateDynamic("isFallback")(isFallback.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(mlDisabled)) __obj.updateDynamic("mlDisabled")(mlDisabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts.asInstanceOf[js.Any])
    if (rootFollowupIntentName != null) __obj.updateDynamic("rootFollowupIntentName")(rootFollowupIntentName.asInstanceOf[js.Any])
    if (trainingPhrases != null) __obj.updateDynamic("trainingPhrases")(trainingPhrases.asInstanceOf[js.Any])
    if (webhookState != null) __obj.updateDynamic("webhookState")(webhookState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIntent]
  }
}

