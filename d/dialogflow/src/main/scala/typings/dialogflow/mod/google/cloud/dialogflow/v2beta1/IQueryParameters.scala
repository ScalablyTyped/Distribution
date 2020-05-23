package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.`type`.ILatLng
import typings.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryParameters. */
trait IQueryParameters extends js.Object {
  /** QueryParameters contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  /** QueryParameters geoLocation */
  var geoLocation: js.UndefOr[ILatLng | Null] = js.undefined
  /** QueryParameters knowledgeBaseNames */
  var knowledgeBaseNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** QueryParameters payload */
  var payload: js.UndefOr[IStruct | Null] = js.undefined
  /** QueryParameters resetContexts */
  var resetContexts: js.UndefOr[Boolean | Null] = js.undefined
  /** QueryParameters sentimentAnalysisRequestConfig */
  var sentimentAnalysisRequestConfig: js.UndefOr[ISentimentAnalysisRequestConfig | Null] = js.undefined
  /** QueryParameters sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.undefined
  /** QueryParameters timeZone */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  /** QueryParameters webhookHeaders */
  var webhookHeaders: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}

object IQueryParameters {
  @scala.inline
  def apply(
    contexts: js.UndefOr[Null | js.Array[IContext]] = js.undefined,
    geoLocation: js.UndefOr[Null | ILatLng] = js.undefined,
    knowledgeBaseNames: js.UndefOr[Null | js.Array[String]] = js.undefined,
    payload: js.UndefOr[Null | IStruct] = js.undefined,
    resetContexts: js.UndefOr[Null | Boolean] = js.undefined,
    sentimentAnalysisRequestConfig: js.UndefOr[Null | ISentimentAnalysisRequestConfig] = js.undefined,
    sessionEntityTypes: js.UndefOr[Null | js.Array[ISessionEntityType]] = js.undefined,
    timeZone: js.UndefOr[Null | String] = js.undefined,
    webhookHeaders: js.UndefOr[Null | StringDictionary[String]] = js.undefined
  ): IQueryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contexts)) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (!js.isUndefined(geoLocation)) __obj.updateDynamic("geoLocation")(geoLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(knowledgeBaseNames)) __obj.updateDynamic("knowledgeBaseNames")(knowledgeBaseNames.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(sentimentAnalysisRequestConfig)) __obj.updateDynamic("sentimentAnalysisRequestConfig")(sentimentAnalysisRequestConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionEntityTypes)) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(timeZone)) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookHeaders)) __obj.updateDynamic("webhookHeaders")(webhookHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryParameters]
  }
}

