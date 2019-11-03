package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.`type`.ILatLng
import typings.dialogflow.protosProtosMod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryParameters. */
trait IQueryParameters extends js.Object {
  /** QueryParameters contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  /** QueryParameters geoLocation */
  var geoLocation: js.UndefOr[ILatLng | Null] = js.undefined
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
}

object IQueryParameters {
  @scala.inline
  def apply(
    contexts: js.Array[IContext] = null,
    geoLocation: ILatLng = null,
    payload: IStruct = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    sentimentAnalysisRequestConfig: ISentimentAnalysisRequestConfig = null,
    sessionEntityTypes: js.Array[ISessionEntityType] = null,
    timeZone: String = null
  ): IQueryParameters = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (geoLocation != null) __obj.updateDynamic("geoLocation")(geoLocation)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts)
    if (sentimentAnalysisRequestConfig != null) __obj.updateDynamic("sentimentAnalysisRequestConfig")(sentimentAnalysisRequestConfig)
    if (sessionEntityTypes != null) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[IQueryParameters]
  }
}

