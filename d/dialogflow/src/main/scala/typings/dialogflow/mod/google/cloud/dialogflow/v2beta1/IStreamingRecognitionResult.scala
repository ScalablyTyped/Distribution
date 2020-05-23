package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType
import typings.dialogflow.mod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingRecognitionResult. */
trait IStreamingRecognitionResult extends js.Object {
  /** StreamingRecognitionResult confidence */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  /** StreamingRecognitionResult isFinal */
  var isFinal: js.UndefOr[Boolean | Null] = js.undefined
  /** StreamingRecognitionResult messageType */
  var messageType: js.UndefOr[
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType * / any */ String) | Null
  ] = js.undefined
  /** StreamingRecognitionResult speechEndOffset */
  var speechEndOffset: js.UndefOr[IDuration | Null] = js.undefined
  /** StreamingRecognitionResult speechWordInfo */
  var speechWordInfo: js.UndefOr[js.Array[ISpeechWordInfo] | Null] = js.undefined
  /** StreamingRecognitionResult stability */
  var stability: js.UndefOr[Double | Null] = js.undefined
  /** StreamingRecognitionResult transcript */
  var transcript: js.UndefOr[String | Null] = js.undefined
}

object IStreamingRecognitionResult {
  @scala.inline
  def apply(
    confidence: js.UndefOr[Null | Double] = js.undefined,
    isFinal: js.UndefOr[Null | Boolean] = js.undefined,
    messageType: js.UndefOr[
      Null | MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.StreamingRecognitionResult.MessageType * / any */ String)
    ] = js.undefined,
    speechEndOffset: js.UndefOr[Null | IDuration] = js.undefined,
    speechWordInfo: js.UndefOr[Null | js.Array[ISpeechWordInfo]] = js.undefined,
    stability: js.UndefOr[Null | Double] = js.undefined,
    transcript: js.UndefOr[Null | String] = js.undefined
  ): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal.asInstanceOf[js.Any])
    if (!js.isUndefined(messageType)) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(speechEndOffset)) __obj.updateDynamic("speechEndOffset")(speechEndOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(speechWordInfo)) __obj.updateDynamic("speechWordInfo")(speechWordInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(stability)) __obj.updateDynamic("stability")(stability.asInstanceOf[js.Any])
    if (!js.isUndefined(transcript)) __obj.updateDynamic("transcript")(transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
}

