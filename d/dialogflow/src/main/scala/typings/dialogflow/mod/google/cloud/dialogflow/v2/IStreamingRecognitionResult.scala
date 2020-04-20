package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
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
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType * / any */ String) | Null
  ] = js.undefined
  /** StreamingRecognitionResult speechEndOffset */
  var speechEndOffset: js.UndefOr[IDuration | Null] = js.undefined
  /** StreamingRecognitionResult speechWordInfo */
  var speechWordInfo: js.UndefOr[js.Array[ISpeechWordInfo] | Null] = js.undefined
  /** StreamingRecognitionResult transcript */
  var transcript: js.UndefOr[String | Null] = js.undefined
}

object IStreamingRecognitionResult {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    isFinal: js.UndefOr[Boolean] = js.undefined,
    messageType: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType * / any */ String) = null,
    speechEndOffset: IDuration = null,
    speechWordInfo: js.Array[ISpeechWordInfo] = null,
    transcript: String = null
  ): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (speechEndOffset != null) __obj.updateDynamic("speechEndOffset")(speechEndOffset.asInstanceOf[js.Any])
    if (speechWordInfo != null) __obj.updateDynamic("speechWordInfo")(speechWordInfo.asInstanceOf[js.Any])
    if (transcript != null) __obj.updateDynamic("transcript")(transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
}

