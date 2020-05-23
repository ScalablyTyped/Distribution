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
    action: js.UndefOr[Null | String] = js.undefined,
    defaultResponsePlatforms: js.UndefOr[Null | js.Array[Platform]] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    events: js.UndefOr[Null | js.Array[String]] = js.undefined,
    followupIntentInfo: js.UndefOr[Null | js.Array[IFollowupIntentInfo]] = js.undefined,
    inputContextNames: js.UndefOr[Null | js.Array[String]] = js.undefined,
    isFallback: js.UndefOr[Null | Boolean] = js.undefined,
    messages: js.UndefOr[Null | js.Array[IMessage]] = js.undefined,
    mlDisabled: js.UndefOr[Null | Boolean] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    outputContexts: js.UndefOr[Null | js.Array[IContext]] = js.undefined,
    parameters: js.UndefOr[Null | js.Array[IParameter]] = js.undefined,
    parentFollowupIntentName: js.UndefOr[Null | String] = js.undefined,
    priority: js.UndefOr[Null | Double] = js.undefined,
    resetContexts: js.UndefOr[Null | Boolean] = js.undefined,
    rootFollowupIntentName: js.UndefOr[Null | String] = js.undefined,
    trainingPhrases: js.UndefOr[Null | js.Array[ITrainingPhrase]] = js.undefined,
    webhookState: js.UndefOr[
      Null | WebhookState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.WebhookState * / any */ String)
    ] = js.undefined
  ): IIntent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultResponsePlatforms)) __obj.updateDynamic("defaultResponsePlatforms")(defaultResponsePlatforms.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(followupIntentInfo)) __obj.updateDynamic("followupIntentInfo")(followupIntentInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(inputContextNames)) __obj.updateDynamic("inputContextNames")(inputContextNames.asInstanceOf[js.Any])
    if (!js.isUndefined(isFallback)) __obj.updateDynamic("isFallback")(isFallback.asInstanceOf[js.Any])
    if (!js.isUndefined(messages)) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(mlDisabled)) __obj.updateDynamic("mlDisabled")(mlDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outputContexts)) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(parameters)) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFollowupIntentName)) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(rootFollowupIntentName)) __obj.updateDynamic("rootFollowupIntentName")(rootFollowupIntentName.asInstanceOf[js.Any])
    if (!js.isUndefined(trainingPhrases)) __obj.updateDynamic("trainingPhrases")(trainingPhrases.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookState)) __obj.updateDynamic("webhookState")(webhookState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIntent]
  }
}

