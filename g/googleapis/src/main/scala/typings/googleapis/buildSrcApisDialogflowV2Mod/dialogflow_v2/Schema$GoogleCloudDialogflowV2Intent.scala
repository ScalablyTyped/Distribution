package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an intent. Intents convert a number of user expressions or
  * patterns into an action. An action is an extraction of a user command or
  * sentence semantics.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2Intent extends js.Object {
  /**
    * Optional. The name of the action associated with the intent. Note: The
    * action name must not contain whitespaces.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Optional. The list of platforms for which the first response will be
    * taken from among the messages assigned to the DEFAULT_PLATFORM.
    */
  var defaultResponsePlatforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The name of this intent.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of event names that trigger the intent. If the
    * collection of input contexts is not empty, all of the contexts must be
    * present in the active user session for an event to trigger this intent.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  /**
    * Read-only. Information about all followup intents that have this intent
    * as a direct or indirect parent. We populate this field only in the
    * output.
    */
  var followupIntentInfo: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.native
  /**
    * Optional. The list of context names required for this intent to be
    * triggered. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Indicates whether this is a fallback intent.
    */
  var isFallback: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The collection of rich messages corresponding to the `Response`
    * field in the Dialogflow console.
    */
  var messages: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentMessage]] = js.native
  /**
    * Optional. Indicates whether Machine Learning is disabled for the intent.
    * Note: If `ml_diabled` setting is set to true, then this intent is not
    * taken into account during inference in `ML ONLY` match mode. Also,
    * auto-markup in the UI is turned off.
    */
  var mlDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier of this intent. Required for Intents.UpdateIntent
    * and Intents.BatchUpdateIntents methods. Format: `projects/&lt;Project
    * ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of contexts that are activated when the intent
    * is matched. Context messages in this collection should not set the
    * parameters field. Setting the `lifespan_count` to 0 will reset the
    * context when the intent is matched. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var outputContexts: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Context]] = js.native
  /**
    * Optional. The collection of parameters associated with the intent.
    */
  var parameters: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentParameter]] = js.native
  /**
    * Read-only after creation. The unique identifier of the parent intent in
    * the chain of followup intents. You can set this field when creating an
    * intent, for example with CreateIntent or BatchUpdateIntents, in order to
    * make this intent a followup intent.  It identifies the parent followup
    * intent. Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent
    * ID&gt;`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  /**
    * Optional. The priority of this intent. Higher numbers represent higher
    * priorities. If this is zero or unspecified, we use the default priority
    * 500000.  Negative numbers mean that the intent is disabled.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Optional. Indicates whether to delete all contexts in the current session
    * when this intent is matched.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  /**
    * Read-only. The unique identifier of the root intent in the chain of
    * followup intents. It identifies the correct followup intents chain for
    * this intent. We populate this field only in the output.  Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of examples that the agent is trained on.
    */
  var trainingPhrases: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentTrainingPhrase]] = js.native
  /**
    * Optional. Indicates whether webhooks are enabled for the intent.
    */
  var webhookState: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2Intent {
  @scala.inline
  def apply(
    action: String = null,
    defaultResponsePlatforms: js.Array[String] = null,
    displayName: String = null,
    events: js.Array[String] = null,
    followupIntentInfo: js.Array[Schema$GoogleCloudDialogflowV2IntentFollowupIntentInfo] = null,
    inputContextNames: js.Array[String] = null,
    isFallback: js.UndefOr[Boolean] = js.undefined,
    messages: js.Array[Schema$GoogleCloudDialogflowV2IntentMessage] = null,
    mlDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputContexts: js.Array[Schema$GoogleCloudDialogflowV2Context] = null,
    parameters: js.Array[Schema$GoogleCloudDialogflowV2IntentParameter] = null,
    parentFollowupIntentName: String = null,
    priority: Int | Double = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    rootFollowupIntentName: String = null,
    trainingPhrases: js.Array[Schema$GoogleCloudDialogflowV2IntentTrainingPhrase] = null,
    webhookState: String = null
  ): Schema$GoogleCloudDialogflowV2Intent = {
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
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2Intent]
  }
}

