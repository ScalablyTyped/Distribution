package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Agent.ApiVersion
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Agent.MatchMode
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Agent.Tier
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
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (avatarUri != null) __obj.updateDynamic("avatarUri")(avatarUri)
    if (classificationThreshold != null) __obj.updateDynamic("classificationThreshold")(classificationThreshold.asInstanceOf[js.Any])
    if (defaultLanguageCode != null) __obj.updateDynamic("defaultLanguageCode")(defaultLanguageCode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging)
    if (matchMode != null) __obj.updateDynamic("matchMode")(matchMode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (supportedLanguageCodes != null) __obj.updateDynamic("supportedLanguageCodes")(supportedLanguageCodes)
    if (tier != null) __obj.updateDynamic("tier")(tier)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[IAgent]
  }
}

