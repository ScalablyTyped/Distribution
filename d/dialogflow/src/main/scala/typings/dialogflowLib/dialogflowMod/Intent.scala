package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intent extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var defaultResponsePlatforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var displayName: java.lang.String
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var followupIntentInfo: js.UndefOr[js.Array[FollowupIntentInfo]] = js.undefined
  var inputContextNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isFallback: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var mlEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var outputContexts: js.UndefOr[js.Array[Context[java.lang.String, _]]] = js.undefined
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFollowupIntentName: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var resetContexts: js.UndefOr[scala.Boolean] = js.undefined
  var rootFollowupIntentName: js.UndefOr[java.lang.String] = js.undefined
  var trainingPhrases: js.UndefOr[js.Array[TrainingPhrase]] = js.undefined
  var webhookState: js.UndefOr[java.lang.String] = js.undefined
}

object Intent {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    name: java.lang.String,
    action: java.lang.String = null,
    defaultResponsePlatforms: js.Array[java.lang.String] = null,
    events: js.Array[java.lang.String] = null,
    followupIntentInfo: js.Array[FollowupIntentInfo] = null,
    inputContextNames: js.Array[java.lang.String] = null,
    isFallback: js.UndefOr[scala.Boolean] = js.undefined,
    messages: js.Array[Message] = null,
    mlEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    outputContexts: js.Array[Context[java.lang.String, _]] = null,
    parameters: js.Array[Parameter] = null,
    parentFollowupIntentName: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    resetContexts: js.UndefOr[scala.Boolean] = js.undefined,
    rootFollowupIntentName: java.lang.String = null,
    trainingPhrases: js.Array[TrainingPhrase] = null,
    webhookState: java.lang.String = null
  ): Intent = {
    val __obj = js.Dynamic.literal(displayName = displayName, name = name)
    if (action != null) __obj.updateDynamic("action")(action)
    if (defaultResponsePlatforms != null) __obj.updateDynamic("defaultResponsePlatforms")(defaultResponsePlatforms)
    if (events != null) __obj.updateDynamic("events")(events)
    if (followupIntentInfo != null) __obj.updateDynamic("followupIntentInfo")(followupIntentInfo)
    if (inputContextNames != null) __obj.updateDynamic("inputContextNames")(inputContextNames)
    if (!js.isUndefined(isFallback)) __obj.updateDynamic("isFallback")(isFallback)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(mlEnabled)) __obj.updateDynamic("mlEnabled")(mlEnabled)
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts)
    if (rootFollowupIntentName != null) __obj.updateDynamic("rootFollowupIntentName")(rootFollowupIntentName)
    if (trainingPhrases != null) __obj.updateDynamic("trainingPhrases")(trainingPhrases)
    if (webhookState != null) __obj.updateDynamic("webhookState")(webhookState)
    __obj.asInstanceOf[Intent]
  }
}

