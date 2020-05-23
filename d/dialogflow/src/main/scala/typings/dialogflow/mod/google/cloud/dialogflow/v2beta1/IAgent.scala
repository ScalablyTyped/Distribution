package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.ApiVersion
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.MatchMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.Tier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Agent. */
trait IAgent extends js.Object {
  /** Agent apiVersion */
  var apiVersion: js.UndefOr[
    ApiVersion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.ApiVersion * / any */ String) | Null
  ] = js.undefined
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
  var matchMode: js.UndefOr[
    MatchMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.MatchMode * / any */ String) | Null
  ] = js.undefined
  /** Agent parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** Agent supportedLanguageCodes */
  var supportedLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** Agent tier */
  var tier: js.UndefOr[
    Tier | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.Tier * / any */ String) | Null
  ] = js.undefined
  /** Agent timeZone */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}

object IAgent {
  @scala.inline
  def apply(
    apiVersion: js.UndefOr[
      Null | ApiVersion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.ApiVersion * / any */ String)
    ] = js.undefined,
    avatarUri: js.UndefOr[Null | String] = js.undefined,
    classificationThreshold: js.UndefOr[Null | Double] = js.undefined,
    defaultLanguageCode: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    enableLogging: js.UndefOr[Null | Boolean] = js.undefined,
    matchMode: js.UndefOr[
      Null | MatchMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.MatchMode * / any */ String)
    ] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined,
    supportedLanguageCodes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    tier: js.UndefOr[
      Null | Tier | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Agent.Tier * / any */ String)
    ] = js.undefined,
    timeZone: js.UndefOr[Null | String] = js.undefined
  ): IAgent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiVersion)) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(avatarUri)) __obj.updateDynamic("avatarUri")(avatarUri.asInstanceOf[js.Any])
    if (!js.isUndefined(classificationThreshold)) __obj.updateDynamic("classificationThreshold")(classificationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLanguageCode)) __obj.updateDynamic("defaultLanguageCode")(defaultLanguageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (!js.isUndefined(matchMode)) __obj.updateDynamic("matchMode")(matchMode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(supportedLanguageCodes)) __obj.updateDynamic("supportedLanguageCodes")(supportedLanguageCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(tier)) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (!js.isUndefined(timeZone)) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAgent]
  }
}

