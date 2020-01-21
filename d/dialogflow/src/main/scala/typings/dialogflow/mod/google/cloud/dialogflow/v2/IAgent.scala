package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.ApiVersion
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.MatchMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Agent.Tier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Agent. */
trait IAgent extends js.Object {
  /** Agent apiVersion */
  var apiVersion: js.UndefOr[ApiVersion | Null] = js.undefined
  /** Agent avatarUri */
  var avatarUri: js.UndefOr[String | Null] = js.undefined
  /** Agent classificationThreshold */
  var classificationThreshold: js.UndefOr[Double | Null] = js.undefined
  /** Agent defaultLanguageCode */
  var defaultLanguageCode: js.UndefOr[String | Null] = js.undefined
  /** Agent description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** Agent displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** Agent enableLogging */
  var enableLogging: js.UndefOr[Boolean | Null] = js.undefined
  /** Agent matchMode */
  var matchMode: js.UndefOr[MatchMode | Null] = js.undefined
  /** Agent parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** Agent supportedLanguageCodes */
  var supportedLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Agent tier */
  var tier: js.UndefOr[Tier | Null] = js.undefined
  /** Agent timeZone */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}

object IAgent {
  @scala.inline
  def apply(
    apiVersion: ApiVersion = null,
    avatarUri: String = null,
    classificationThreshold: Int | Double = null,
    defaultLanguageCode: String = null,
    description: String = null,
    displayName: String = null,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    matchMode: MatchMode = null,
    parent: String = null,
    supportedLanguageCodes: js.Array[String] = null,
    tier: Tier = null,
    timeZone: String = null
  ): IAgent = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (avatarUri != null) __obj.updateDynamic("avatarUri")(avatarUri.asInstanceOf[js.Any])
    if (classificationThreshold != null) __obj.updateDynamic("classificationThreshold")(classificationThreshold.asInstanceOf[js.Any])
    if (defaultLanguageCode != null) __obj.updateDynamic("defaultLanguageCode")(defaultLanguageCode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (matchMode != null) __obj.updateDynamic("matchMode")(matchMode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (supportedLanguageCodes != null) __obj.updateDynamic("supportedLanguageCodes")(supportedLanguageCodes.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAgent]
  }
}

