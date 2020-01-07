package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameters of the conversational query.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1QueryParameters extends js.Object {
  /**
    * Optional. The collection of contexts to be activated before this query is
    * executed.
    */
  var contexts: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1Context]] = js.native
  /**
    * Optional. The geo location of this conversational query.
    */
  var geoLocation: js.UndefOr[Schema$GoogleTypeLatLng] = js.native
  /**
    * Optional. KnowledgeBases to get alternative results from. If not set, the
    * KnowledgeBases enabled in the agent (through UI) will be used. Format:
    * `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var knowledgeBaseNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. This field can be used to pass custom data into the webhook
    * associated with the agent. Arbitrary JSON objects are supported.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. Specifies whether to delete all contexts in the current session
    * before the new ones are activated.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configures the type of sentiment analysis to perform. If not
    * provided, sentiment analysis is not performed. Note: Sentiment Analysis
    * is only currently available for Enterprise Edition agents.
    */
  var sentimentAnalysisRequestConfig: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig] = js.native
  /**
    * Optional. Additional session entity types to replace or extend developer
    * entity types with. The entity synonyms apply to all languages and persist
    * for the session of this query.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]] = js.native
  /**
    * Optional. The time zone of this conversational query from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris. If not provided, the time zone specified in agent settings
    * is used.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1QueryParameters {
  @scala.inline
  def apply(
    contexts: js.Array[Schema$GoogleCloudDialogflowV2beta1Context] = null,
    geoLocation: Schema$GoogleTypeLatLng = null,
    knowledgeBaseNames: js.Array[String] = null,
    payload: StringDictionary[js.Any] = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    sentimentAnalysisRequestConfig: Schema$GoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig = null,
    sessionEntityTypes: js.Array[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = null,
    timeZone: String = null
  ): Schema$GoogleCloudDialogflowV2beta1QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (geoLocation != null) __obj.updateDynamic("geoLocation")(geoLocation.asInstanceOf[js.Any])
    if (knowledgeBaseNames != null) __obj.updateDynamic("knowledgeBaseNames")(knowledgeBaseNames.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts.asInstanceOf[js.Any])
    if (sentimentAnalysisRequestConfig != null) __obj.updateDynamic("sentimentAnalysisRequestConfig")(sentimentAnalysisRequestConfig.asInstanceOf[js.Any])
    if (sessionEntityTypes != null) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1QueryParameters]
  }
}

