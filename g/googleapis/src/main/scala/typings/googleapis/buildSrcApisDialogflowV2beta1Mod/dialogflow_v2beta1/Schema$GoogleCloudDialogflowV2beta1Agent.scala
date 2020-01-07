package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a conversational agent.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1Agent extends js.Object {
  /**
    * Optional. The URI of the agent&#39;s avatar. Avatars are used throughout
    * the Dialogflow console and in the self-hosted [Web
    * Demo](https://cloud.google.com/dialogflow-enterprise/docs/integrations/web-demo)
    * integration.
    */
  var avatarUri: js.UndefOr[String] = js.native
  /**
    * Optional. To filter out false positive results and still get variety in
    * matched natural language inputs for your agent, you can tune the machine
    * learning classification threshold. If the returned score value is less
    * than the threshold value, then a fallback intent will be triggered or, if
    * there are no fallback intents defined, no intent will be triggered. The
    * score values range from 0.0 (completely uncertain) to 1.0 (completely
    * certain). If set to 0.0, the default of 0.3 is used.
    */
  var classificationThreshold: js.UndefOr[Double] = js.native
  /**
    * Required. The default language of the agent as a language tag. See
    * [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. This field cannot
    * be set by the `Update` method.
    */
  var defaultLanguageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The description of this agent. The maximum length is 500
    * characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The name of this agent.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. Determines whether this agent should log conversation queries.
    */
  var enableLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Determines how intents are detected from user queries.
    */
  var matchMode: js.UndefOr[String] = js.native
  /**
    * Required. The project of this agent. Format: `projects/&lt;Project
    * ID&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional. The list of all languages supported by this agent (except for
    * the `default_language_code`).
    */
  var supportedLanguageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The time zone of this agent from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1Agent {
  @scala.inline
  def apply(
    avatarUri: String = null,
    classificationThreshold: Int | Double = null,
    defaultLanguageCode: String = null,
    description: String = null,
    displayName: String = null,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    matchMode: String = null,
    parent: String = null,
    supportedLanguageCodes: js.Array[String] = null,
    timeZone: String = null
  ): Schema$GoogleCloudDialogflowV2beta1Agent = {
    val __obj = js.Dynamic.literal()
    if (avatarUri != null) __obj.updateDynamic("avatarUri")(avatarUri.asInstanceOf[js.Any])
    if (classificationThreshold != null) __obj.updateDynamic("classificationThreshold")(classificationThreshold.asInstanceOf[js.Any])
    if (defaultLanguageCode != null) __obj.updateDynamic("defaultLanguageCode")(defaultLanguageCode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (matchMode != null) __obj.updateDynamic("matchMode")(matchMode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (supportedLanguageCodes != null) __obj.updateDynamic("supportedLanguageCodes")(supportedLanguageCodes.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1Agent]
  }
}

